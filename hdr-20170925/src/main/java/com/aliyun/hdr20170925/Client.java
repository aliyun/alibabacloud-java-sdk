// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925;

import com.aliyun.tea.*;
import com.aliyun.hdr20170925.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("hdr", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get(regionId))) {
            return endpointMap.get(regionId);
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }

    public ActivateDrGatewayResponse activateDrGatewayWithOptions(ActivateDrGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activationCode)) {
            query.put("ActivationCode", request.activationCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayVersion)) {
            query.put("GatewayVersion", request.gatewayVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipAddress)) {
            query.put("IpAddress", request.ipAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ActivateDrGateway"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ActivateDrGatewayResponse());
    }

    public ActivateDrGatewayResponse activateDrGateway(ActivateDrGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.activateDrGatewayWithOptions(request, runtime);
    }

    public AddInfrastructureResponse addInfrastructureWithOptions(AddInfrastructureRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credential)) {
            query.put("Credential", request.credential);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipAddress)) {
            query.put("IpAddress", request.ipAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddInfrastructure"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddInfrastructureResponse());
    }

    public AddInfrastructureResponse addInfrastructure(AddInfrastructureRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addInfrastructureWithOptions(request, runtime);
    }

    public AddReplicationResponse addReplicationWithOptions(AddReplicationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationInfo)) {
            query.put("ReplicationInfo", request.replicationInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddReplication"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddReplicationResponse());
    }

    public AddReplicationResponse addReplication(AddReplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addReplicationWithOptions(request, runtime);
    }

    public ChangeRecoveryPointResponse changeRecoveryPointWithOptions(ChangeRecoveryPointRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eipAddressId)) {
            query.put("EipAddressId", request.eipAddressId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryCpu)) {
            query.put("RecoveryCpu", request.recoveryCpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryInstanceName)) {
            query.put("RecoveryInstanceName", request.recoveryInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryInstanceType)) {
            query.put("RecoveryInstanceType", request.recoveryInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryIpAddress)) {
            query.put("RecoveryIpAddress", request.recoveryIpAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryMemory)) {
            query.put("RecoveryMemory", request.recoveryMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryNetwork)) {
            query.put("RecoveryNetwork", request.recoveryNetwork);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPointId)) {
            query.put("RecoveryPointId", request.recoveryPointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPointTime)) {
            query.put("RecoveryPointTime", request.recoveryPointTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPostScriptContent)) {
            query.put("RecoveryPostScriptContent", request.recoveryPostScriptContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPostScriptType)) {
            query.put("RecoveryPostScriptType", request.recoveryPostScriptType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryReserveIp)) {
            query.put("RecoveryReserveIp", request.recoveryReserveIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryUseDhcp)) {
            query.put("RecoveryUseDhcp", request.recoveryUseDhcp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryUseEssd)) {
            query.put("RecoveryUseEssd", request.recoveryUseEssd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryUseSsd)) {
            query.put("RecoveryUseSsd", request.recoveryUseSsd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeRecoveryPoint"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeRecoveryPointResponse());
    }

    public ChangeRecoveryPointResponse changeRecoveryPoint(ChangeRecoveryPointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.changeRecoveryPointWithOptions(request, runtime);
    }

    public ChangeRecoveryPointForRPResponse changeRecoveryPointForRPWithOptions(ChangeRecoveryPointForRPRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPlanId)) {
            query.put("RecoveryPlanId", request.recoveryPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPointTime)) {
            query.put("RecoveryPointTime", request.recoveryPointTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeRecoveryPointForRP"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeRecoveryPointForRPResponse());
    }

    public ChangeRecoveryPointForRPResponse changeRecoveryPointForRP(ChangeRecoveryPointForRPRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.changeRecoveryPointForRPWithOptions(request, runtime);
    }

    public CheckGatewayConnectivityResponse checkGatewayConnectivityWithOptions(CheckGatewayConnectivityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckGatewayConnectivity"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckGatewayConnectivityResponse());
    }

    public CheckGatewayConnectivityResponse checkGatewayConnectivity(CheckGatewayConnectivityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkGatewayConnectivityWithOptions(request, runtime);
    }

    public CheckOperationPermissionResponse checkOperationPermissionWithOptions(CheckOperationPermissionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operation)) {
            query.put("Operation", request.operation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckOperationPermission"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckOperationPermissionResponse());
    }

    public CheckOperationPermissionResponse checkOperationPermission(CheckOperationPermissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkOperationPermissionWithOptions(request, runtime);
    }

    public CheckRecoveryPlanResponse checkRecoveryPlanWithOptions(CheckRecoveryPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operation)) {
            query.put("Operation", request.operation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPlanId)) {
            query.put("RecoveryPlanId", request.recoveryPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckRecoveryPlan"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckRecoveryPlanResponse());
    }

    public CheckRecoveryPlanResponse checkRecoveryPlan(CheckRecoveryPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkRecoveryPlanWithOptions(request, runtime);
    }

    public CheckRoleResponse checkRoleWithOptions(CheckRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckRole"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckRoleResponse());
    }

    public CheckRoleResponse checkRole(CheckRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkRoleWithOptions(request, runtime);
    }

    public CheckSlrRoleResponse checkSlrRoleWithOptions(CheckSlrRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createIfNotExist)) {
            query.put("CreateIfNotExist", request.createIfNotExist);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            query.put("RoleName", request.roleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckSlrRole"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckSlrRoleResponse());
    }

    public CheckSlrRoleResponse checkSlrRole(CheckSlrRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkSlrRoleWithOptions(request, runtime);
    }

    public CheckUpdateResponse checkUpdateWithOptions(CheckUpdateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            query.put("Channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentVersion)) {
            query.put("CurrentVersion", request.currentVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            query.put("Platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckUpdate"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckUpdateResponse());
    }

    public CheckUpdateResponse checkUpdate(CheckUpdateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkUpdateWithOptions(request, runtime);
    }

    public CollectCustomerInfoResponse collectCustomerInfoWithOptions(CollectCustomerInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.company)) {
            query.put("Company", request.company);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contact)) {
            query.put("Contact", request.contact);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.label1)) {
            query.put("Label1", request.label1);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.label2)) {
            query.put("Label2", request.label2);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.label3)) {
            query.put("Label3", request.label3);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.label4)) {
            query.put("Label4", request.label4);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.label5)) {
            query.put("Label5", request.label5);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.label6)) {
            query.put("Label6", request.label6);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.label7)) {
            query.put("Label7", request.label7);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.label8)) {
            query.put("Label8", request.label8);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.label9)) {
            query.put("Label9", request.label9);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.service)) {
            query.put("Service", request.service);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telephone)) {
            query.put("Telephone", request.telephone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value1)) {
            query.put("Value1", request.value1);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value2)) {
            query.put("Value2", request.value2);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value3)) {
            query.put("Value3", request.value3);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value4)) {
            query.put("Value4", request.value4);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value5)) {
            query.put("Value5", request.value5);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value6)) {
            query.put("Value6", request.value6);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value7)) {
            query.put("Value7", request.value7);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value8)) {
            query.put("Value8", request.value8);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value9)) {
            query.put("Value9", request.value9);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CollectCustomerInfo"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CollectCustomerInfoResponse());
    }

    public CollectCustomerInfoResponse collectCustomerInfo(CollectCustomerInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.collectCustomerInfoWithOptions(request, runtime);
    }

    public CollectSupportBundleResponse collectSupportBundleWithOptions(CollectSupportBundleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CollectSupportBundle"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CollectSupportBundleResponse());
    }

    public CollectSupportBundleResponse collectSupportBundle(CollectSupportBundleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.collectSupportBundleWithOptions(request, runtime);
    }

    public CommitFailoverResponse commitFailoverWithOptions(CommitFailoverRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CommitFailover"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CommitFailoverResponse());
    }

    public CommitFailoverResponse commitFailover(CommitFailoverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.commitFailoverWithOptions(request, runtime);
    }

    public CreateDrGatewayResponse createDrGatewayWithOptions(CreateDrGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageType)) {
            query.put("ImageType", request.imageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDrGateway"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDrGatewayResponse());
    }

    public CreateDrGatewayResponse createDrGateway(CreateDrGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDrGatewayWithOptions(request, runtime);
    }

    public CreateRecoveryPlanResponse createRecoveryPlanWithOptions(CreateRecoveryPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sitePairId)) {
            query.put("SitePairId", request.sitePairId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRecoveryPlan"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRecoveryPlanResponse());
    }

    public CreateRecoveryPlanResponse createRecoveryPlan(CreateRecoveryPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRecoveryPlanWithOptions(request, runtime);
    }

    public CreateSitePairResponse createSitePairWithOptions(CreateSitePairRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cloudSiteName)) {
            query.put("CloudSiteName", request.cloudSiteName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localGatewayName)) {
            query.put("LocalGatewayName", request.localGatewayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localSiteName)) {
            query.put("LocalSiteName", request.localSiteName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primarySiteName)) {
            query.put("PrimarySiteName", request.primarySiteName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primarySiteRegionId)) {
            query.put("PrimarySiteRegionId", request.primarySiteRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primarySiteType)) {
            query.put("PrimarySiteType", request.primarySiteType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primarySiteVpcId)) {
            query.put("PrimarySiteVpcId", request.primarySiteVpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primarySiteZoneId)) {
            query.put("PrimarySiteZoneId", request.primarySiteZoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondarySiteName)) {
            query.put("SecondarySiteName", request.secondarySiteName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondarySiteRegionId)) {
            query.put("SecondarySiteRegionId", request.secondarySiteRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondarySiteType)) {
            query.put("SecondarySiteType", request.secondarySiteType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondarySiteVpcId)) {
            query.put("SecondarySiteVpcId", request.secondarySiteVpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondarySiteZoneId)) {
            query.put("SecondarySiteZoneId", request.secondarySiteZoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sitePairType)) {
            query.put("SitePairType", request.sitePairType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSitePair"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSitePairResponse());
    }

    public CreateSitePairResponse createSitePair(CreateSitePairRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSitePairWithOptions(request, runtime);
    }

    public DeleteInfrastructureResponse deleteInfrastructureWithOptions(DeleteInfrastructureRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.infrastructureId)) {
            query.put("InfrastructureId", request.infrastructureId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInfrastructure"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInfrastructureResponse());
    }

    public DeleteInfrastructureResponse deleteInfrastructure(DeleteInfrastructureRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteInfrastructureWithOptions(request, runtime);
    }

    public DeleteRecoveryPlanResponse deleteRecoveryPlanWithOptions(DeleteRecoveryPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPlanId)) {
            query.put("RecoveryPlanId", request.recoveryPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRecoveryPlan"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRecoveryPlanResponse());
    }

    public DeleteRecoveryPlanResponse deleteRecoveryPlan(DeleteRecoveryPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRecoveryPlanWithOptions(request, runtime);
    }

    public DeleteSitePairResponse deleteSitePairWithOptions(DeleteSitePairRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sitePairId)) {
            query.put("SitePairId", request.sitePairId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSitePair"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSitePairResponse());
    }

    public DeleteSitePairResponse deleteSitePair(DeleteSitePairRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSitePairWithOptions(request, runtime);
    }

    public DeployDrGatewayResponse deployDrGatewayWithOptions(DeployDrGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drGatewayClass)) {
            query.put("DrGatewayClass", request.drGatewayClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayImageName)) {
            query.put("GatewayImageName", request.gatewayImageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.linuxShadowVmImageName)) {
            query.put("LinuxShadowVmImageName", request.linuxShadowVmImageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sitePairId)) {
            query.put("SitePairId", request.sitePairId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userVSwitchId)) {
            query.put("UserVSwitchId", request.userVSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.windowsShadowVmImageName)) {
            query.put("WindowsShadowVmImageName", request.windowsShadowVmImageName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeployDrGateway"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeployDrGatewayResponse());
    }

    public DeployDrGatewayResponse deployDrGateway(DeployDrGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deployDrGatewayWithOptions(request, runtime);
    }

    public DeployGatewayResponse deployGatewayWithOptions(DeployGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayClass)) {
            query.put("GatewayClass", request.gatewayClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sitePairId)) {
            query.put("SitePairId", request.sitePairId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeployGateway"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeployGatewayResponse());
    }

    public DeployGatewayResponse deployGateway(DeployGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deployGatewayWithOptions(request, runtime);
    }

    public DescribeAgentImageUrlResponse describeAgentImageUrlWithOptions(DescribeAgentImageUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.platformType)) {
            query.put("PlatformType", request.platformType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAgentImageUrl"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAgentImageUrlResponse());
    }

    public DescribeAgentImageUrlResponse describeAgentImageUrl(DescribeAgentImageUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAgentImageUrlWithOptions(request, runtime);
    }

    public DescribeAppConsistentPointsResponse describeAppConsistentPointsWithOptions(DescribeAppConsistentPointsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppConsistentPoints"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppConsistentPointsResponse());
    }

    public DescribeAppConsistentPointsResponse describeAppConsistentPoints(DescribeAppConsistentPointsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAppConsistentPointsWithOptions(request, runtime);
    }

    public DescribeAvailableInstanceTypesResponse describeAvailableInstanceTypesWithOptions(DescribeAvailableInstanceTypesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskType)) {
            query.put("DiskType", request.diskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioOptimized)) {
            query.put("IoOptimized", request.ioOptimized);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.network)) {
            query.put("Network", request.network);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClient)) {
            query.put("UserClient", request.userClient);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAvailableInstanceTypes"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAvailableInstanceTypesResponse());
    }

    public DescribeAvailableInstanceTypesResponse describeAvailableInstanceTypes(DescribeAvailableInstanceTypesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAvailableInstanceTypesWithOptions(request, runtime);
    }

    public DescribeAvailableInstanceTypesForSEResponse describeAvailableInstanceTypesForSEWithOptions(DescribeAvailableInstanceTypesForSERequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskType)) {
            query.put("DiskType", request.diskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAvailableInstanceTypesForSE"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAvailableInstanceTypesForSEResponse());
    }

    public DescribeAvailableInstanceTypesForSEResponse describeAvailableInstanceTypesForSE(DescribeAvailableInstanceTypesForSERequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAvailableInstanceTypesForSEWithOptions(request, runtime);
    }

    public DescribeBmrShadowVmImageUrlResponse describeBmrShadowVmImageUrlWithOptions(DescribeBmrShadowVmImageUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageType)) {
            query.put("ImageType", request.imageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageVersion)) {
            query.put("ImageVersion", request.imageVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBmrShadowVmImageUrl"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBmrShadowVmImageUrlResponse());
    }

    public DescribeBmrShadowVmImageUrlResponse describeBmrShadowVmImageUrl(DescribeBmrShadowVmImageUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBmrShadowVmImageUrlWithOptions(request, runtime);
    }

    public DescribeDRApplianceUrlResponse describeDRApplianceUrlWithOptions(DescribeDRApplianceUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageName)) {
            query.put("ImageName", request.imageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDRApplianceUrl"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDRApplianceUrlResponse());
    }

    public DescribeDRApplianceUrlResponse describeDRApplianceUrl(DescribeDRApplianceUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDRApplianceUrlWithOptions(request, runtime);
    }

    public DescribeDRAppliancesResponse describeDRAppliancesWithOptions(DescribeDRAppliancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDRAppliances"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDRAppliancesResponse());
    }

    public DescribeDRAppliancesResponse describeDRAppliances(DescribeDRAppliancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDRAppliancesWithOptions(request, runtime);
    }

    public DescribeDiskGroupResponse describeDiskGroupWithOptions(DescribeDiskGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.diskGroupId)) {
            query.put("DiskGroupId", request.diskGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDiskGroup"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDiskGroupResponse());
    }

    public DescribeDiskGroupResponse describeDiskGroup(DescribeDiskGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDiskGroupWithOptions(request, runtime);
    }

    public DescribeDrGatewayResponse describeDrGatewayWithOptions(DescribeDrGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDrGateway"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrGatewayResponse());
    }

    public DescribeDrGatewayResponse describeDrGateway(DescribeDrGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDrGatewayWithOptions(request, runtime);
    }

    public DescribeDrGatewayFlowControlPolicyResponse describeDrGatewayFlowControlPolicyWithOptions(DescribeDrGatewayFlowControlPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDrGatewayFlowControlPolicy"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrGatewayFlowControlPolicyResponse());
    }

    public DescribeDrGatewayFlowControlPolicyResponse describeDrGatewayFlowControlPolicy(DescribeDrGatewayFlowControlPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDrGatewayFlowControlPolicyWithOptions(request, runtime);
    }

    public DescribeDrGatewayImageUrlResponse describeDrGatewayImageUrlWithOptions(DescribeDrGatewayImageUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDrGatewayImageUrl"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrGatewayImageUrlResponse());
    }

    public DescribeDrGatewayImageUrlResponse describeDrGatewayImageUrl(DescribeDrGatewayImageUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDrGatewayImageUrlWithOptions(request, runtime);
    }

    public DescribeDrGatewayMetricsResponse describeDrGatewayMetricsWithOptions(DescribeDrGatewayMetricsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDrGatewayMetrics"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrGatewayMetricsResponse());
    }

    public DescribeDrGatewayMetricsResponse describeDrGatewayMetrics(DescribeDrGatewayMetricsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDrGatewayMetricsWithOptions(request, runtime);
    }

    public DescribeDrGatewaysResponse describeDrGatewaysWithOptions(DescribeDrGatewaysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDrGateways"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrGatewaysResponse());
    }

    public DescribeDrGatewaysResponse describeDrGateways(DescribeDrGatewaysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDrGatewaysWithOptions(request, runtime);
    }

    public DescribeDrGatewaysForCmsResponse describeDrGatewaysForCmsWithOptions(DescribeDrGatewaysForCmsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDrGatewaysForCms"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrGatewaysForCmsResponse());
    }

    public DescribeDrGatewaysForCmsResponse describeDrGatewaysForCms(DescribeDrGatewaysForCmsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDrGatewaysForCmsWithOptions(request, runtime);
    }

    public DescribeGatewayResponse describeGatewayWithOptions(DescribeGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGateway"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGatewayResponse());
    }

    public DescribeGatewayResponse describeGateway(DescribeGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGatewayWithOptions(request, runtime);
    }

    public DescribeGatewaysResponse describeGatewaysWithOptions(DescribeGatewaysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteName)) {
            query.put("SiteName", request.siteName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sitePairId)) {
            query.put("SitePairId", request.sitePairId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGateways"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGatewaysResponse());
    }

    public DescribeGatewaysResponse describeGateways(DescribeGatewaysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGatewaysWithOptions(request, runtime);
    }

    public DescribeInfrastructuresResponse describeInfrastructuresWithOptions(DescribeInfrastructuresRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInfrastructures"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInfrastructuresResponse());
    }

    public DescribeInfrastructuresResponse describeInfrastructures(DescribeInfrastructuresRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInfrastructuresWithOptions(request, runtime);
    }

    public DescribeKmsServerResponse describeKmsServerWithOptions(DescribeKmsServerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hardwareId)) {
            query.put("HardwareId", request.hardwareId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeKmsServer"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeKmsServerResponse());
    }

    public DescribeKmsServerResponse describeKmsServer(DescribeKmsServerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeKmsServerWithOptions(request, runtime);
    }

    public DescribeNetworksResponse describeNetworksWithOptions(DescribeNetworksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNetworks"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNetworksResponse());
    }

    public DescribeNetworksResponse describeNetworks(DescribeNetworksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNetworksWithOptions(request, runtime);
    }

    public DescribeRecoveryPlanResponse describeRecoveryPlanWithOptions(DescribeRecoveryPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPlanId)) {
            query.put("RecoveryPlanId", request.recoveryPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRecoveryPlan"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRecoveryPlanResponse());
    }

    public DescribeRecoveryPlanResponse describeRecoveryPlan(DescribeRecoveryPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRecoveryPlanWithOptions(request, runtime);
    }

    public DescribeRecoveryPlanExecutionResponse describeRecoveryPlanExecutionWithOptions(DescribeRecoveryPlanExecutionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.executionId)) {
            query.put("ExecutionId", request.executionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRecoveryPlanExecution"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRecoveryPlanExecutionResponse());
    }

    public DescribeRecoveryPlanExecutionResponse describeRecoveryPlanExecution(DescribeRecoveryPlanExecutionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRecoveryPlanExecutionWithOptions(request, runtime);
    }

    public DescribeRecoveryPlanExecutionsResponse describeRecoveryPlanExecutionsWithOptions(DescribeRecoveryPlanExecutionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPlanId)) {
            query.put("RecoveryPlanId", request.recoveryPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRecoveryPlanExecutions"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRecoveryPlanExecutionsResponse());
    }

    public DescribeRecoveryPlanExecutionsResponse describeRecoveryPlanExecutions(DescribeRecoveryPlanExecutionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRecoveryPlanExecutionsWithOptions(request, runtime);
    }

    public DescribeRecoveryPlansResponse describeRecoveryPlansWithOptions(DescribeRecoveryPlansRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sitePairId)) {
            query.put("SitePairId", request.sitePairId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRecoveryPlans"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRecoveryPlansResponse());
    }

    public DescribeRecoveryPlansResponse describeRecoveryPlans(DescribeRecoveryPlansRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRecoveryPlansWithOptions(request, runtime);
    }

    public DescribeRecoveryPointsResponse describeRecoveryPointsWithOptions(DescribeRecoveryPointsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRecoveryPoints"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRecoveryPointsResponse());
    }

    public DescribeRecoveryPointsResponse describeRecoveryPoints(DescribeRecoveryPointsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRecoveryPointsWithOptions(request, runtime);
    }

    public DescribeRecoveryPointsForRPResponse describeRecoveryPointsForRPWithOptions(DescribeRecoveryPointsForRPRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPlanId)) {
            query.put("RecoveryPlanId", request.recoveryPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRecoveryPointsForRP"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRecoveryPointsForRPResponse());
    }

    public DescribeRecoveryPointsForRPResponse describeRecoveryPointsForRP(DescribeRecoveryPointsForRPRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRecoveryPointsForRPWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DescribeReplicationResponse describeReplicationWithOptions(DescribeReplicationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.replicationId)) {
            query.put("ReplicationId", request.replicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeReplication"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeReplicationResponse());
    }

    public DescribeReplicationResponse describeReplication(DescribeReplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeReplicationWithOptions(request, runtime);
    }

    public DescribeReplicationStatisticsResponse describeReplicationStatisticsWithOptions(DescribeReplicationStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sitePairId)) {
            query.put("SitePairId", request.sitePairId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeReplicationStatistics"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeReplicationStatisticsResponse());
    }

    public DescribeReplicationStatisticsResponse describeReplicationStatistics(DescribeReplicationStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeReplicationStatisticsWithOptions(request, runtime);
    }

    public DescribeReplicationsResponse describeReplicationsWithOptions(DescribeReplicationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sitePairId)) {
            query.put("SitePairId", request.sitePairId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeReplications"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeReplicationsResponse());
    }

    public DescribeReplicationsResponse describeReplications(DescribeReplicationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeReplicationsWithOptions(request, runtime);
    }

    public DescribeServerResponse describeServerWithOptions(DescribeServerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServer"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServerResponse());
    }

    public DescribeServerResponse describeServer(DescribeServerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeServerWithOptions(request, runtime);
    }

    public DescribeServerInstancesResponse describeServerInstancesWithOptions(DescribeServerInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eipAddresses)) {
            query.put("EipAddresses", request.eipAddresses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.innerIpAddresses)) {
            query.put("InnerIpAddresses", request.innerIpAddresses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateIpAddresses)) {
            query.put("PrivateIpAddresses", request.privateIpAddresses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicIpAddresses)) {
            query.put("PublicIpAddresses", request.publicIpAddresses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sitePairId)) {
            query.put("SitePairId", request.sitePairId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServerInstances"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServerInstancesResponse());
    }

    public DescribeServerInstancesResponse describeServerInstances(DescribeServerInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeServerInstancesWithOptions(request, runtime);
    }

    public DescribeServersResponse describeServersWithOptions(DescribeServersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverIds)) {
            query.put("ServerIds", request.serverIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sitePairId)) {
            query.put("SitePairId", request.sitePairId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServers"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServersResponse());
    }

    public DescribeServersResponse describeServers(DescribeServersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeServersWithOptions(request, runtime);
    }

    public DescribeServiceDependencyStatusResponse describeServiceDependencyStatusWithOptions(DescribeServiceDependencyStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServiceDependencyStatus"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServiceDependencyStatusResponse());
    }

    public DescribeServiceDependencyStatusResponse describeServiceDependencyStatus(DescribeServiceDependencyStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeServiceDependencyStatusWithOptions(request, runtime);
    }

    public DescribeServiceStatusResponse describeServiceStatusWithOptions(DescribeServiceStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServiceStatus"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServiceStatusResponse());
    }

    public DescribeServiceStatusResponse describeServiceStatus(DescribeServiceStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeServiceStatusWithOptions(request, runtime);
    }

    public DescribeShadowVmImageResponse describeShadowVmImageWithOptions(DescribeShadowVmImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deploymentRegionId)) {
            query.put("DeploymentRegionId", request.deploymentRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osType)) {
            query.put("OsType", request.osType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeShadowVmImage"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeShadowVmImageResponse());
    }

    public DescribeShadowVmImageResponse describeShadowVmImage(DescribeShadowVmImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeShadowVmImageWithOptions(request, runtime);
    }

    public DescribeSiteResponse describeSiteWithOptions(DescribeSiteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSite"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSiteResponse());
    }

    public DescribeSiteResponse describeSite(DescribeSiteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSiteWithOptions(request, runtime);
    }

    public DescribeSitePairResponse describeSitePairWithOptions(DescribeSitePairRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sitePairId)) {
            query.put("SitePairId", request.sitePairId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSitePair"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSitePairResponse());
    }

    public DescribeSitePairResponse describeSitePair(DescribeSitePairRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSitePairWithOptions(request, runtime);
    }

    public DescribeSitePairInfoResponse describeSitePairInfoWithOptions(DescribeSitePairInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sitePairId)) {
            query.put("SitePairId", request.sitePairId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSitePairInfo"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSitePairInfoResponse());
    }

    public DescribeSitePairInfoResponse describeSitePairInfo(DescribeSitePairInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSitePairInfoWithOptions(request, runtime);
    }

    public DescribeSitePairStatisticsResponse describeSitePairStatisticsWithOptions(DescribeSitePairStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sitePairId)) {
            query.put("SitePairId", request.sitePairId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSitePairStatistics"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSitePairStatisticsResponse());
    }

    public DescribeSitePairStatisticsResponse describeSitePairStatistics(DescribeSitePairStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSitePairStatisticsWithOptions(request, runtime);
    }

    public DescribeSitePairsResponse describeSitePairsWithOptions(DescribeSitePairsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sitePairType)) {
            query.put("SitePairType", request.sitePairType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSitePairs"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSitePairsResponse());
    }

    public DescribeSitePairsResponse describeSitePairs(DescribeSitePairsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSitePairsWithOptions(request, runtime);
    }

    public DescribeSummaryResponse describeSummaryWithOptions(DescribeSummaryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSummary"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSummaryResponse());
    }

    public DescribeSummaryResponse describeSummary(DescribeSummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSummaryWithOptions(request, runtime);
    }

    public DescribeSupportedOperationsResponse describeSupportedOperationsWithOptions(DescribeSupportedOperationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSupportedOperations"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSupportedOperationsResponse());
    }

    public DescribeSupportedOperationsResponse describeSupportedOperations(DescribeSupportedOperationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSupportedOperationsWithOptions(request, runtime);
    }

    public DescribeTaskResponse describeTaskWithOptions(DescribeTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTask"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTaskResponse());
    }

    public DescribeTaskResponse describeTask(DescribeTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTaskWithOptions(request, runtime);
    }

    public DescribeTaskStatisticsResponse describeTaskStatisticsWithOptions(DescribeTaskStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sitePairId)) {
            query.put("SitePairId", request.sitePairId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTaskStatistics"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTaskStatisticsResponse());
    }

    public DescribeTaskStatisticsResponse describeTaskStatistics(DescribeTaskStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTaskStatisticsWithOptions(request, runtime);
    }

    public DescribeTasksResponse describeTasksWithOptions(DescribeTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sitePairId)) {
            query.put("SitePairId", request.sitePairId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTasks"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTasksResponse());
    }

    public DescribeTasksResponse describeTasks(DescribeTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTasksWithOptions(request, runtime);
    }

    public DescribeTestFailoverStatisticsResponse describeTestFailoverStatisticsWithOptions(DescribeTestFailoverStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sitePairId)) {
            query.put("SitePairId", request.sitePairId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTestFailoverStatistics"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTestFailoverStatisticsResponse());
    }

    public DescribeTestFailoverStatisticsResponse describeTestFailoverStatistics(DescribeTestFailoverStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTestFailoverStatisticsWithOptions(request, runtime);
    }

    public DescribeUserBusinessStatusResponse describeUserBusinessStatusWithOptions(DescribeUserBusinessStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserBusinessStatus"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserBusinessStatusResponse());
    }

    public DescribeUserBusinessStatusResponse describeUserBusinessStatus(DescribeUserBusinessStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserBusinessStatusWithOptions(request, runtime);
    }

    public DescribeVSwitchesResponse describeVSwitchesWithOptions(DescribeVSwitchesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteRegionId)) {
            query.put("SiteRegionId", request.siteRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVSwitches"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVSwitchesResponse());
    }

    public DescribeVSwitchesResponse describeVSwitches(DescribeVSwitchesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVSwitchesWithOptions(request, runtime);
    }

    public DescribeWhiteListResponse describeWhiteListWithOptions(DescribeWhiteListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeWhiteList"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWhiteListResponse());
    }

    public DescribeWhiteListResponse describeWhiteList(DescribeWhiteListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeWhiteListWithOptions(request, runtime);
    }

    public DescribevSphereInventoriesResponse describevSphereInventoriesWithOptions(DescribevSphereInventoriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.infrastructureId)) {
            query.put("InfrastructureId", request.infrastructureId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribevSphereInventories"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribevSphereInventoriesResponse());
    }

    public DescribevSphereInventoriesResponse describevSphereInventories(DescribevSphereInventoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describevSphereInventoriesWithOptions(request, runtime);
    }

    public DisableDiskGroupReplicationResponse disableDiskGroupReplicationWithOptions(DisableDiskGroupReplicationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.diskGroupId)) {
            query.put("DiskGroupId", request.diskGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableDiskGroupReplication"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableDiskGroupReplicationResponse());
    }

    public DisableDiskGroupReplicationResponse disableDiskGroupReplication(DisableDiskGroupReplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableDiskGroupReplicationWithOptions(request, runtime);
    }

    public DisableReplicationResponse disableReplicationWithOptions(DisableReplicationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableReplication"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableReplicationResponse());
    }

    public DisableReplicationResponse disableReplication(DisableReplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableReplicationWithOptions(request, runtime);
    }

    public EnableDiskGroupReplicationResponse enableDiskGroupReplicationWithOptions(EnableDiskGroupReplicationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.diskGroupId)) {
            query.put("DiskGroupId", request.diskGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disks)) {
            query.put("Disks", request.disks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetHostInstanceId)) {
            query.put("TargetHostInstanceId", request.targetHostInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetHostIpAddress)) {
            query.put("TargetHostIpAddress", request.targetHostIpAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableDiskGroupReplication"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableDiskGroupReplicationResponse());
    }

    public EnableDiskGroupReplicationResponse enableDiskGroupReplication(EnableDiskGroupReplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableDiskGroupReplicationWithOptions(request, runtime);
    }

    public EnableReplicationResponse enableReplicationWithOptions(EnableReplicationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appConsistentPointPolicy)) {
            query.put("AppConsistentPointPolicy", request.appConsistentPointPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoResynchronize)) {
            query.put("AutoResynchronize", request.autoResynchronize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crashConsistentPointPolicy)) {
            query.put("CrashConsistentPointPolicy", request.crashConsistentPointPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryNetwork)) {
            query.put("RecoveryNetwork", request.recoveryNetwork);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationNetwork)) {
            query.put("ReplicationNetwork", request.replicationNetwork);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationUseEssd)) {
            query.put("ReplicationUseEssd", request.replicationUseEssd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationUseSsd)) {
            query.put("ReplicationUseSsd", request.replicationUseSsd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shadowInstanceType)) {
            query.put("ShadowInstanceType", request.shadowInstanceType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableReplication"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableReplicationResponse());
    }

    public EnableReplicationResponse enableReplication(EnableReplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableReplicationWithOptions(request, runtime);
    }

    public FailbackResponse failbackWithOptions(FailbackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.recoveryComputeResource)) {
            query.put("RecoveryComputeResource", request.recoveryComputeResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryCpu)) {
            query.put("RecoveryCpu", request.recoveryCpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryDatastore)) {
            query.put("RecoveryDatastore", request.recoveryDatastore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryDns)) {
            query.put("RecoveryDns", request.recoveryDns);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryGateway)) {
            query.put("RecoveryGateway", request.recoveryGateway);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryInfrastructureId)) {
            query.put("RecoveryInfrastructureId", request.recoveryInfrastructureId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryInstanceName)) {
            query.put("RecoveryInstanceName", request.recoveryInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryInstanceType)) {
            query.put("RecoveryInstanceType", request.recoveryInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryIpAddress)) {
            query.put("RecoveryIpAddress", request.recoveryIpAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryLocation)) {
            query.put("RecoveryLocation", request.recoveryLocation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryMemory)) {
            query.put("RecoveryMemory", request.recoveryMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryNetMask)) {
            query.put("RecoveryNetMask", request.recoveryNetMask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryNetwork)) {
            query.put("RecoveryNetwork", request.recoveryNetwork);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPointId)) {
            query.put("RecoveryPointId", request.recoveryPointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPostScriptContent)) {
            query.put("RecoveryPostScriptContent", request.recoveryPostScriptContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPostScriptType)) {
            query.put("RecoveryPostScriptType", request.recoveryPostScriptType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryReserveIp)) {
            query.put("RecoveryReserveIp", request.recoveryReserveIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryUseDhcp)) {
            query.put("RecoveryUseDhcp", request.recoveryUseDhcp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Failback"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FailbackResponse());
    }

    public FailbackResponse failback(FailbackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.failbackWithOptions(request, runtime);
    }

    public FixServiceDependencyResponse fixServiceDependencyWithOptions(FixServiceDependencyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FixServiceDependency"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FixServiceDependencyResponse());
    }

    public FixServiceDependencyResponse fixServiceDependency(FixServiceDependencyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.fixServiceDependencyWithOptions(request, runtime);
    }

    public ForcedFailoverResponse forcedFailoverWithOptions(ForcedFailoverRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eipAddressId)) {
            query.put("EipAddressId", request.eipAddressId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryCpu)) {
            query.put("RecoveryCpu", request.recoveryCpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryInstanceName)) {
            query.put("RecoveryInstanceName", request.recoveryInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryInstanceType)) {
            query.put("RecoveryInstanceType", request.recoveryInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryIpAddress)) {
            query.put("RecoveryIpAddress", request.recoveryIpAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryMemory)) {
            query.put("RecoveryMemory", request.recoveryMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryNetwork)) {
            query.put("RecoveryNetwork", request.recoveryNetwork);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPointId)) {
            query.put("RecoveryPointId", request.recoveryPointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPointTime)) {
            query.put("RecoveryPointTime", request.recoveryPointTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPostScriptContent)) {
            query.put("RecoveryPostScriptContent", request.recoveryPostScriptContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPostScriptType)) {
            query.put("RecoveryPostScriptType", request.recoveryPostScriptType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryReserveIp)) {
            query.put("RecoveryReserveIp", request.recoveryReserveIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryUseDhcp)) {
            query.put("RecoveryUseDhcp", request.recoveryUseDhcp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryUseEssd)) {
            query.put("RecoveryUseEssd", request.recoveryUseEssd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryUseSsd)) {
            query.put("RecoveryUseSsd", request.recoveryUseSsd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ForcedFailover"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ForcedFailoverResponse());
    }

    public ForcedFailoverResponse forcedFailover(ForcedFailoverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.forcedFailoverWithOptions(request, runtime);
    }

    public ForcedFailoverForRPResponse forcedFailoverForRPWithOptions(ForcedFailoverForRPRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPlanId)) {
            query.put("RecoveryPlanId", request.recoveryPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPointTime)) {
            query.put("RecoveryPointTime", request.recoveryPointTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ForcedFailoverForRP"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ForcedFailoverForRPResponse());
    }

    public ForcedFailoverForRPResponse forcedFailoverForRP(ForcedFailoverForRPRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.forcedFailoverForRPWithOptions(request, runtime);
    }

    public GenerateActivateCodeResponse generateActivateCodeWithOptions(GenerateActivateCodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expireTime)) {
            query.put("ExpireTime", request.expireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateActivateCode"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateActivateCodeResponse());
    }

    public GenerateActivateCodeResponse generateActivateCode(GenerateActivateCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateActivateCodeWithOptions(request, runtime);
    }

    public GenerateInstallScriptResponse generateInstallScriptWithOptions(GenerateInstallScriptRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.osType)) {
            query.put("OsType", request.osType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sitePairId)) {
            query.put("SitePairId", request.sitePairId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateInstallScript"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateInstallScriptResponse());
    }

    public GenerateInstallScriptResponse generateInstallScript(GenerateInstallScriptRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateInstallScriptWithOptions(request, runtime);
    }

    public InitializeServerResponse initializeServerWithOptions(InitializeServerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InitializeServer"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InitializeServerResponse());
    }

    public InitializeServerResponse initializeServer(InitializeServerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.initializeServerWithOptions(request, runtime);
    }

    public OpenHdrServiceResponse openHdrServiceWithOptions(OpenHdrServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenHdrService"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenHdrServiceResponse());
    }

    public OpenHdrServiceResponse openHdrService(OpenHdrServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.openHdrServiceWithOptions(request, runtime);
    }

    public RebootGatewayResponse rebootGatewayWithOptions(RebootGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.forceStop)) {
            query.put("ForceStop", request.forceStop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RebootGateway"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RebootGatewayResponse());
    }

    public RebootGatewayResponse rebootGateway(RebootGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rebootGatewayWithOptions(request, runtime);
    }

    public ReclaimRecoveryPointResponse reclaimRecoveryPointWithOptions(ReclaimRecoveryPointRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPointId)) {
            query.put("RecoveryPointId", request.recoveryPointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReclaimRecoveryPoint"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReclaimRecoveryPointResponse());
    }

    public ReclaimRecoveryPointResponse reclaimRecoveryPoint(ReclaimRecoveryPointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reclaimRecoveryPointWithOptions(request, runtime);
    }

    public RegisterDiskGroupResponse registerDiskGroupWithOptions(RegisterDiskGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.disks)) {
            query.put("Disks", request.disks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostInstanceId)) {
            query.put("HostInstanceId", request.hostInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostIpAddress)) {
            query.put("HostIpAddress", request.hostIpAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sitePairId)) {
            query.put("SitePairId", request.sitePairId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterDiskGroup"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterDiskGroupResponse());
    }

    public RegisterDiskGroupResponse registerDiskGroup(RegisterDiskGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registerDiskGroupWithOptions(request, runtime);
    }

    public RegisterServerResponse registerServerWithOptions(RegisterServerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentPort)) {
            query.put("AgentPort", request.agentPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentVersion)) {
            query.put("AgentVersion", request.agentVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bootMode)) {
            query.put("BootMode", request.bootMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            query.put("Cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disks)) {
            query.put("Disks", request.disks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostname)) {
            query.put("Hostname", request.hostname);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipAddress)) {
            query.put("IpAddress", request.ipAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memory)) {
            query.put("Memory", request.memory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osDetail)) {
            query.put("OsDetail", request.osDetail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osType)) {
            query.put("OsType", request.osType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volumes)) {
            query.put("Volumes", request.volumes);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterServer"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterServerResponse());
    }

    public RegisterServerResponse registerServer(RegisterServerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registerServerWithOptions(request, runtime);
    }

    public RegisterServersResponse registerServersWithOptions(RegisterServersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentPort)) {
            query.put("AgentPort", request.agentPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverInstancesInfo)) {
            query.put("ServerInstancesInfo", request.serverInstancesInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sitePairId)) {
            query.put("SitePairId", request.sitePairId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterServers"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterServersResponse());
    }

    public RegisterServersResponse registerServers(RegisterServersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registerServersWithOptions(request, runtime);
    }

    public RemoveReplicationResponse removeReplicationWithOptions(RemoveReplicationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationInfo)) {
            query.put("ReplicationInfo", request.replicationInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveReplication"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveReplicationResponse());
    }

    public RemoveReplicationResponse removeReplication(RemoveReplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeReplicationWithOptions(request, runtime);
    }

    public RenewDrGatewayTokenResponse renewDrGatewayTokenWithOptions(RenewDrGatewayTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pubToken)) {
            query.put("PubToken", request.pubToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subToken)) {
            query.put("SubToken", request.subToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewDrGatewayToken"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewDrGatewayTokenResponse());
    }

    public RenewDrGatewayTokenResponse renewDrGatewayToken(RenewDrGatewayTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renewDrGatewayTokenWithOptions(request, runtime);
    }

    public RepairReplicationResponse repairReplicationWithOptions(RepairReplicationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RepairReplication"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RepairReplicationResponse());
    }

    public RepairReplicationResponse repairReplication(RepairReplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.repairReplicationWithOptions(request, runtime);
    }

    public ReportAppConsistentPointResponse reportAppConsistentPointWithOptions(ReportAppConsistentPointRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotId)) {
            query.put("SnapshotId", request.snapshotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotTime)) {
            query.put("SnapshotTime", request.snapshotTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportAppConsistentPoint"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportAppConsistentPointResponse());
    }

    public ReportAppConsistentPointResponse reportAppConsistentPoint(ReportAppConsistentPointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportAppConsistentPointWithOptions(request, runtime);
    }

    public ReportDataPruneStatusResponse reportDataPruneStatusWithOptions(ReportDataPruneStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appliedDatetime)) {
            query.put("AppliedDatetime", request.appliedDatetime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportDataPruneStatus"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportDataPruneStatusResponse());
    }

    public ReportDataPruneStatusResponse reportDataPruneStatus(ReportDataPruneStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportDataPruneStatusWithOptions(request, runtime);
    }

    public ReportDiskGroupFullSyncDoneResponse reportDiskGroupFullSyncDoneWithOptions(ReportDiskGroupFullSyncDoneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.diskGroupId)) {
            query.put("DiskGroupId", request.diskGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportDiskGroupFullSyncDone"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportDiskGroupFullSyncDoneResponse());
    }

    public ReportDiskGroupFullSyncDoneResponse reportDiskGroupFullSyncDone(ReportDiskGroupFullSyncDoneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportDiskGroupFullSyncDoneWithOptions(request, runtime);
    }

    public ReportDiskGroupFullSyncStatusResponse reportDiskGroupFullSyncStatusWithOptions(ReportDiskGroupFullSyncStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.diskGroupId)) {
            query.put("DiskGroupId", request.diskGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fullSyncCurrentSize)) {
            query.put("FullSyncCurrentSize", request.fullSyncCurrentSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fullSyncProgress)) {
            query.put("FullSyncProgress", request.fullSyncProgress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fullSyncTotalSize)) {
            query.put("FullSyncTotalSize", request.fullSyncTotalSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportDiskGroupFullSyncStatus"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportDiskGroupFullSyncStatusResponse());
    }

    public ReportDiskGroupFullSyncStatusResponse reportDiskGroupFullSyncStatus(ReportDiskGroupFullSyncStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportDiskGroupFullSyncStatusWithOptions(request, runtime);
    }

    public ReportDiskGroupRepairReplicationDoneResponse reportDiskGroupRepairReplicationDoneWithOptions(ReportDiskGroupRepairReplicationDoneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.diskGroupId)) {
            query.put("DiskGroupId", request.diskGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportDiskGroupRepairReplicationDone"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportDiskGroupRepairReplicationDoneResponse());
    }

    public ReportDiskGroupRepairReplicationDoneResponse reportDiskGroupRepairReplicationDone(ReportDiskGroupRepairReplicationDoneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportDiskGroupRepairReplicationDoneWithOptions(request, runtime);
    }

    public ReportDiskGroupRepairReplicationStatusResponse reportDiskGroupRepairReplicationStatusWithOptions(ReportDiskGroupRepairReplicationStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.diskGroupId)) {
            query.put("DiskGroupId", request.diskGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repairCurrentSize)) {
            query.put("RepairCurrentSize", request.repairCurrentSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repairProgress)) {
            query.put("RepairProgress", request.repairProgress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repairTotalSize)) {
            query.put("RepairTotalSize", request.repairTotalSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportDiskGroupRepairReplicationStatus"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportDiskGroupRepairReplicationStatusResponse());
    }

    public ReportDiskGroupRepairReplicationStatusResponse reportDiskGroupRepairReplicationStatus(ReportDiskGroupRepairReplicationStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportDiskGroupRepairReplicationStatusWithOptions(request, runtime);
    }

    public ReportDiskGroupReplicationErrorResponse reportDiskGroupReplicationErrorWithOptions(ReportDiskGroupReplicationErrorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.diskGroupId)) {
            query.put("DiskGroupId", request.diskGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errmsg)) {
            query.put("Errmsg", request.errmsg);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errno)) {
            query.put("Errno", request.errno);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportDiskGroupReplicationError"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportDiskGroupReplicationErrorResponse());
    }

    public ReportDiskGroupReplicationErrorResponse reportDiskGroupReplicationError(ReportDiskGroupReplicationErrorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportDiskGroupReplicationErrorWithOptions(request, runtime);
    }

    public ReportDiskGroupsStatusResponse reportDiskGroupsStatusWithOptions(ReportDiskGroupsStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.diskGroups)) {
            query.put("DiskGroups", request.diskGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportDiskGroupsStatus"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportDiskGroupsStatusResponse());
    }

    public ReportDiskGroupsStatusResponse reportDiskGroupsStatus(ReportDiskGroupsStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportDiskGroupsStatusWithOptions(request, runtime);
    }

    public ReportDrGatewayAlertResponse reportDrGatewayAlertWithOptions(ReportDrGatewayAlertRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertTime)) {
            query.put("AlertTime", request.alertTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertValue)) {
            query.put("AlertValue", request.alertValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventId)) {
            query.put("EventId", request.eventId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            query.put("Level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportDrGatewayAlert"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportDrGatewayAlertResponse());
    }

    public ReportDrGatewayAlertResponse reportDrGatewayAlert(ReportDrGatewayAlertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportDrGatewayAlertWithOptions(request, runtime);
    }

    public ReportDrGatewayStatisticsResponse reportDrGatewayStatisticsWithOptions(ReportDrGatewayStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.downstreamTraffic)) {
            query.put("DownstreamTraffic", request.downstreamTraffic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            query.put("NetworkType", request.networkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upstreamTraffic)) {
            query.put("UpstreamTraffic", request.upstreamTraffic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportDrGatewayStatistics"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportDrGatewayStatisticsResponse());
    }

    public ReportDrGatewayStatisticsResponse reportDrGatewayStatistics(ReportDrGatewayStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportDrGatewayStatisticsWithOptions(request, runtime);
    }

    public ReportDrGatewayStatusResponse reportDrGatewayStatusWithOptions(ReportDrGatewayStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.downstreamSpeed)) {
            query.put("DownstreamSpeed", request.downstreamSpeed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upstreamSpeed)) {
            query.put("UpstreamSpeed", request.upstreamSpeed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportDrGatewayStatus"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportDrGatewayStatusResponse());
    }

    public ReportDrGatewayStatusResponse reportDrGatewayStatus(ReportDrGatewayStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportDrGatewayStatusWithOptions(request, runtime);
    }

    public ReportFullSyncDoneResponse reportFullSyncDoneWithOptions(ReportFullSyncDoneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportFullSyncDone"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportFullSyncDoneResponse());
    }

    public ReportFullSyncDoneResponse reportFullSyncDone(ReportFullSyncDoneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportFullSyncDoneWithOptions(request, runtime);
    }

    public ReportFullSyncStatusResponse reportFullSyncStatusWithOptions(ReportFullSyncStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fullSyncCurrentSize)) {
            query.put("FullSyncCurrentSize", request.fullSyncCurrentSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fullSyncProgress)) {
            query.put("FullSyncProgress", request.fullSyncProgress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fullSyncTotalSize)) {
            query.put("FullSyncTotalSize", request.fullSyncTotalSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportFullSyncStatus"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportFullSyncStatusResponse());
    }

    public ReportFullSyncStatusResponse reportFullSyncStatus(ReportFullSyncStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportFullSyncStatusWithOptions(request, runtime);
    }

    public ReportInfrastructureStatusResponse reportInfrastructureStatusWithOptions(ReportInfrastructureStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.errno)) {
            query.put("Errno", request.errno);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.infrastructureId)) {
            query.put("InfrastructureId", request.infrastructureId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportInfrastructureStatus"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportInfrastructureStatusResponse());
    }

    public ReportInfrastructureStatusResponse reportInfrastructureStatus(ReportInfrastructureStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportInfrastructureStatusWithOptions(request, runtime);
    }

    public ReportKmsStatusResponse reportKmsStatusWithOptions(ReportKmsStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hardwareId)) {
            query.put("HardwareId", request.hardwareId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.output)) {
            query.put("Output", request.output);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.succeed)) {
            query.put("Succeed", request.succeed);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportKmsStatus"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportKmsStatusResponse());
    }

    public ReportKmsStatusResponse reportKmsStatus(ReportKmsStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportKmsStatusWithOptions(request, runtime);
    }

    public ReportRecoveryPointResponse reportRecoveryPointWithOptions(ReportRecoveryPointRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationConsistent)) {
            query.put("ApplicationConsistent", request.applicationConsistent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPointId)) {
            query.put("RecoveryPointId", request.recoveryPointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPointTime)) {
            query.put("RecoveryPointTime", request.recoveryPointTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportRecoveryPoint"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportRecoveryPointResponse());
    }

    public ReportRecoveryPointResponse reportRecoveryPoint(ReportRecoveryPointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportRecoveryPointWithOptions(request, runtime);
    }

    public ReportRepairReplicationDoneResponse reportRepairReplicationDoneWithOptions(ReportRepairReplicationDoneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportRepairReplicationDone"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportRepairReplicationDoneResponse());
    }

    public ReportRepairReplicationDoneResponse reportRepairReplicationDone(ReportRepairReplicationDoneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportRepairReplicationDoneWithOptions(request, runtime);
    }

    public ReportRepairReplicationStatusResponse reportRepairReplicationStatusWithOptions(ReportRepairReplicationStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repairCurrentSize)) {
            query.put("RepairCurrentSize", request.repairCurrentSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repairProgress)) {
            query.put("RepairProgress", request.repairProgress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repairTotalSize)) {
            query.put("RepairTotalSize", request.repairTotalSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportRepairReplicationStatus"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportRepairReplicationStatusResponse());
    }

    public ReportRepairReplicationStatusResponse reportRepairReplicationStatus(ReportRepairReplicationStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportRepairReplicationStatusWithOptions(request, runtime);
    }

    public ReportReplicationErrorResponse reportReplicationErrorWithOptions(ReportReplicationErrorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.errmsg)) {
            query.put("Errmsg", request.errmsg);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errno)) {
            query.put("Errno", request.errno);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportReplicationError"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportReplicationErrorResponse());
    }

    public ReportReplicationErrorResponse reportReplicationError(ReportReplicationErrorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportReplicationErrorWithOptions(request, runtime);
    }

    public ReportServersStatusResponse reportServersStatusWithOptions(ReportServersStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servers)) {
            query.put("Servers", request.servers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportServersStatus"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportServersStatusResponse());
    }

    public ReportServersStatusResponse reportServersStatus(ReportServersStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportServersStatusWithOptions(request, runtime);
    }

    public ReportShadowConsistenceResponse reportShadowConsistenceWithOptions(ReportShadowConsistenceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consistent)) {
            query.put("Consistent", request.consistent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportShadowConsistence"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportShadowConsistenceResponse());
    }

    public ReportShadowConsistenceResponse reportShadowConsistence(ReportShadowConsistenceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportShadowConsistenceWithOptions(request, runtime);
    }

    public ReportWorkloadResponse reportWorkloadWithOptions(ReportWorkloadRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupWorkload)) {
            query.put("BackupWorkload", request.backupWorkload);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryWorkload)) {
            query.put("RecoveryWorkload", request.recoveryWorkload);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportWorkload"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportWorkloadResponse());
    }

    public ReportWorkloadResponse reportWorkload(ReportWorkloadRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportWorkloadWithOptions(request, runtime);
    }

    public RequestBdTrialResponse requestBdTrialWithOptions(RequestBdTrialRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.company)) {
            query.put("Company", request.company);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contact)) {
            query.put("Contact", request.contact);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSize)) {
            query.put("DataSize", request.dataSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detail)) {
            query.put("Detail", request.detail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distribution)) {
            query.put("Distribution", request.distribution);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telephone)) {
            query.put("Telephone", request.telephone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RequestBdTrial"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RequestBdTrialResponse());
    }

    public RequestBdTrialResponse requestBdTrial(RequestBdTrialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.requestBdTrialWithOptions(request, runtime);
    }

    public RestartServerResponse restartServerWithOptions(RestartServerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartServer"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartServerResponse());
    }

    public RestartServerResponse restartServer(RestartServerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.restartServerWithOptions(request, runtime);
    }

    public ResynchronizeResponse resynchronizeWithOptions(ResynchronizeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Resynchronize"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResynchronizeResponse());
    }

    public ResynchronizeResponse resynchronize(ResynchronizeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resynchronizeWithOptions(request, runtime);
    }

    public ReversedDisableReplicationResponse reversedDisableReplicationWithOptions(ReversedDisableReplicationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReversedDisableReplication"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReversedDisableReplicationResponse());
    }

    public ReversedDisableReplicationResponse reversedDisableReplication(ReversedDisableReplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reversedDisableReplicationWithOptions(request, runtime);
    }

    public ReversedEnableReplicationResponse reversedEnableReplicationWithOptions(ReversedEnableReplicationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appConsistentPointPolicy)) {
            query.put("AppConsistentPointPolicy", request.appConsistentPointPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crashConsistentPointPolicy)) {
            query.put("CrashConsistentPointPolicy", request.crashConsistentPointPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryNetwork)) {
            query.put("RecoveryNetwork", request.recoveryNetwork);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationComputeResource)) {
            query.put("ReplicationComputeResource", request.replicationComputeResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationDatastore)) {
            query.put("ReplicationDatastore", request.replicationDatastore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationDns)) {
            query.put("ReplicationDns", request.replicationDns);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationGateway)) {
            query.put("ReplicationGateway", request.replicationGateway);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationInfrastructureId)) {
            query.put("ReplicationInfrastructureId", request.replicationInfrastructureId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationIpAddress)) {
            query.put("ReplicationIpAddress", request.replicationIpAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationLocation)) {
            query.put("ReplicationLocation", request.replicationLocation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationNetMask)) {
            query.put("ReplicationNetMask", request.replicationNetMask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationNetwork)) {
            query.put("ReplicationNetwork", request.replicationNetwork);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationUseDhcp)) {
            query.put("ReplicationUseDhcp", request.replicationUseDhcp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationUseOriginalInstance)) {
            query.put("ReplicationUseOriginalInstance", request.replicationUseOriginalInstance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shadowInstanceType)) {
            query.put("ShadowInstanceType", request.shadowInstanceType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReversedEnableReplication"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReversedEnableReplicationResponse());
    }

    public ReversedEnableReplicationResponse reversedEnableReplication(ReversedEnableReplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reversedEnableReplicationWithOptions(request, runtime);
    }

    public ReversedInitializeServerResponse reversedInitializeServerWithOptions(ReversedInitializeServerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReversedInitializeServer"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReversedInitializeServerResponse());
    }

    public ReversedInitializeServerResponse reversedInitializeServer(ReversedInitializeServerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reversedInitializeServerWithOptions(request, runtime);
    }

    public ReversedRegisterServerResponse reversedRegisterServerWithOptions(ReversedRegisterServerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentVersion)) {
            query.put("AgentVersion", request.agentVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bootMode)) {
            query.put("BootMode", request.bootMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            query.put("Cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disks)) {
            query.put("Disks", request.disks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostname)) {
            query.put("Hostname", request.hostname);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipAddress)) {
            query.put("IpAddress", request.ipAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memory)) {
            query.put("Memory", request.memory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osDetail)) {
            query.put("OsDetail", request.osDetail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osType)) {
            query.put("OsType", request.osType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volumes)) {
            query.put("Volumes", request.volumes);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReversedRegisterServer"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReversedRegisterServerResponse());
    }

    public ReversedRegisterServerResponse reversedRegisterServer(ReversedRegisterServerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reversedRegisterServerWithOptions(request, runtime);
    }

    public SetupAgentResponse setupAgentWithOptions(SetupAgentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetupAgent"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetupAgentResponse());
    }

    public SetupAgentResponse setupAgent(SetupAgentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setupAgentWithOptions(request, runtime);
    }

    public StartGatewayResponse startGatewayWithOptions(StartGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartGateway"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartGatewayResponse());
    }

    public StartGatewayResponse startGateway(StartGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startGatewayWithOptions(request, runtime);
    }

    public StopGatewayResponse stopGatewayWithOptions(StopGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.forceStop)) {
            query.put("ForceStop", request.forceStop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopGateway"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopGatewayResponse());
    }

    public StopGatewayResponse stopGateway(StopGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopGatewayWithOptions(request, runtime);
    }

    public TestCleanupResponse testCleanupWithOptions(TestCleanupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TestCleanup"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TestCleanupResponse());
    }

    public TestCleanupResponse testCleanup(TestCleanupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.testCleanupWithOptions(request, runtime);
    }

    public TestCleanupForRPResponse testCleanupForRPWithOptions(TestCleanupForRPRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPlanId)) {
            query.put("RecoveryPlanId", request.recoveryPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TestCleanupForRP"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TestCleanupForRPResponse());
    }

    public TestCleanupForRPResponse testCleanupForRP(TestCleanupForRPRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.testCleanupForRPWithOptions(request, runtime);
    }

    public TestFailoverResponse testFailoverWithOptions(TestFailoverRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eipAddressId)) {
            query.put("EipAddressId", request.eipAddressId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryCpu)) {
            query.put("RecoveryCpu", request.recoveryCpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryInstanceName)) {
            query.put("RecoveryInstanceName", request.recoveryInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryInstanceType)) {
            query.put("RecoveryInstanceType", request.recoveryInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryIpAddress)) {
            query.put("RecoveryIpAddress", request.recoveryIpAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryMemory)) {
            query.put("RecoveryMemory", request.recoveryMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryNetwork)) {
            query.put("RecoveryNetwork", request.recoveryNetwork);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPointId)) {
            query.put("RecoveryPointId", request.recoveryPointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPointTime)) {
            query.put("RecoveryPointTime", request.recoveryPointTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPostScriptContent)) {
            query.put("RecoveryPostScriptContent", request.recoveryPostScriptContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPostScriptType)) {
            query.put("RecoveryPostScriptType", request.recoveryPostScriptType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryReserveIp)) {
            query.put("RecoveryReserveIp", request.recoveryReserveIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryUseDhcp)) {
            query.put("RecoveryUseDhcp", request.recoveryUseDhcp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryUseEssd)) {
            query.put("RecoveryUseEssd", request.recoveryUseEssd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryUseSsd)) {
            query.put("RecoveryUseSsd", request.recoveryUseSsd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TestFailover"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TestFailoverResponse());
    }

    public TestFailoverResponse testFailover(TestFailoverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.testFailoverWithOptions(request, runtime);
    }

    public TestFailoverForRPResponse testFailoverForRPWithOptions(TestFailoverForRPRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPlanId)) {
            query.put("RecoveryPlanId", request.recoveryPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPointTime)) {
            query.put("RecoveryPointTime", request.recoveryPointTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TestFailoverForRP"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TestFailoverForRPResponse());
    }

    public TestFailoverForRPResponse testFailoverForRP(TestFailoverForRPRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.testFailoverForRPWithOptions(request, runtime);
    }

    public TriggerRegisterResponse triggerRegisterWithOptions(TriggerRegisterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.recoveredIpAddress)) {
            query.put("RecoveredIpAddress", request.recoveredIpAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TriggerRegister"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TriggerRegisterResponse());
    }

    public TriggerRegisterResponse triggerRegister(TriggerRegisterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.triggerRegisterWithOptions(request, runtime);
    }

    public TriggerReversedRegisterResponse triggerReversedRegisterWithOptions(TriggerReversedRegisterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TriggerReversedRegister"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TriggerReversedRegisterResponse());
    }

    public TriggerReversedRegisterResponse triggerReversedRegister(TriggerReversedRegisterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.triggerReversedRegisterWithOptions(request, runtime);
    }

    public UnregisterDiskGroupResponse unregisterDiskGroupWithOptions(UnregisterDiskGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.diskGroupId)) {
            query.put("DiskGroupId", request.diskGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnregisterDiskGroup"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnregisterDiskGroupResponse());
    }

    public UnregisterDiskGroupResponse unregisterDiskGroup(UnregisterDiskGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unregisterDiskGroupWithOptions(request, runtime);
    }

    public UnregisterDrGatewayResponse unregisterDrGatewayWithOptions(UnregisterDrGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnregisterDrGateway"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnregisterDrGatewayResponse());
    }

    public UnregisterDrGatewayResponse unregisterDrGateway(UnregisterDrGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unregisterDrGatewayWithOptions(request, runtime);
    }

    public UnregisterGatewayResponse unregisterGatewayWithOptions(UnregisterGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnregisterGateway"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnregisterGatewayResponse());
    }

    public UnregisterGatewayResponse unregisterGateway(UnregisterGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unregisterGatewayWithOptions(request, runtime);
    }

    public UnregisterServerResponse unregisterServerWithOptions(UnregisterServerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnregisterServer"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnregisterServerResponse());
    }

    public UnregisterServerResponse unregisterServer(UnregisterServerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unregisterServerWithOptions(request, runtime);
    }

    public UpdateDiskGroupResponse updateDiskGroupWithOptions(UpdateDiskGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.diskGroupId)) {
            query.put("DiskGroupId", request.diskGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disks)) {
            query.put("Disks", request.disks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceHostIpAddress)) {
            query.put("SourceHostIpAddress", request.sourceHostIpAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetHostIpAddress)) {
            query.put("TargetHostIpAddress", request.targetHostIpAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDiskGroup"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDiskGroupResponse());
    }

    public UpdateDiskGroupResponse updateDiskGroup(UpdateDiskGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDiskGroupWithOptions(request, runtime);
    }

    public UpdateDrGatewayResponse updateDrGatewayWithOptions(UpdateDrGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDrGateway"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDrGatewayResponse());
    }

    public UpdateDrGatewayResponse updateDrGateway(UpdateDrGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDrGatewayWithOptions(request, runtime);
    }

    public UpdateDrGatewayFlowControlPolicyResponse updateDrGatewayFlowControlPolicyWithOptions(UpdateDrGatewayFlowControlPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.flowControlPolicy)) {
            query.put("FlowControlPolicy", request.flowControlPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDrGatewayFlowControlPolicy"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDrGatewayFlowControlPolicyResponse());
    }

    public UpdateDrGatewayFlowControlPolicyResponse updateDrGatewayFlowControlPolicy(UpdateDrGatewayFlowControlPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDrGatewayFlowControlPolicyWithOptions(request, runtime);
    }

    public UpdateImageInfoResponse updateImageInfoWithOptions(UpdateImageInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageName)) {
            query.put("ImageName", request.imageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceRegionId)) {
            query.put("ResourceRegionId", request.resourceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vmType)) {
            query.put("VmType", request.vmType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateImageInfo"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateImageInfoResponse());
    }

    public UpdateImageInfoResponse updateImageInfo(UpdateImageInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateImageInfoWithOptions(request, runtime);
    }

    public UpdateInfrastructureResponse updateInfrastructureWithOptions(UpdateInfrastructureRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credential)) {
            query.put("Credential", request.credential);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.infrastructureId)) {
            query.put("InfrastructureId", request.infrastructureId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInfrastructure"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInfrastructureResponse());
    }

    public UpdateInfrastructureResponse updateInfrastructure(UpdateInfrastructureRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateInfrastructureWithOptions(request, runtime);
    }

    public UpdateRecoveryPlanResponse updateRecoveryPlanWithOptions(UpdateRecoveryPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPlanId)) {
            query.put("RecoveryPlanId", request.recoveryPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRecoveryPlan"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRecoveryPlanResponse());
    }

    public UpdateRecoveryPlanResponse updateRecoveryPlan(UpdateRecoveryPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateRecoveryPlanWithOptions(request, runtime);
    }

    public UpdateReplicationResponse updateReplicationWithOptions(UpdateReplicationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationList)) {
            query.put("ReplicationList", request.replicationList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateReplication"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateReplicationResponse());
    }

    public UpdateReplicationResponse updateReplication(UpdateReplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateReplicationWithOptions(request, runtime);
    }

    public UpdateServerResponse updateServerWithOptions(UpdateServerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alias)) {
            query.put("Alias", request.alias);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateServer"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServerResponse());
    }

    public UpdateServerResponse updateServer(UpdateServerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateServerWithOptions(request, runtime);
    }

    public UpdateServerDiskInfoResponse updateServerDiskInfoWithOptions(UpdateServerDiskInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.disks)) {
            query.put("Disks", request.disks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userUid)) {
            query.put("UserUid", request.userUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateServerDiskInfo"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServerDiskInfoResponse());
    }

    public UpdateServerDiskInfoResponse updateServerDiskInfo(UpdateServerDiskInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateServerDiskInfoWithOptions(request, runtime);
    }

    public UpdateSitePairNameResponse updateSitePairNameWithOptions(UpdateSitePairNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.primarySiteName)) {
            query.put("PrimarySiteName", request.primarySiteName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondarySiteName)) {
            query.put("SecondarySiteName", request.secondarySiteName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sitePairId)) {
            query.put("SitePairId", request.sitePairId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSitePairName"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSitePairNameResponse());
    }

    public UpdateSitePairNameResponse updateSitePairName(UpdateSitePairNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSitePairNameWithOptions(request, runtime);
    }

    public UpgradeServerResponse upgradeServerWithOptions(UpgradeServerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeServer"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeServerResponse());
    }

    public UpgradeServerResponse upgradeServer(UpgradeServerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeServerWithOptions(request, runtime);
    }

    public UpgradeSitePairResponse upgradeSitePairWithOptions(UpgradeSitePairRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sitePairId)) {
            query.put("SitePairId", request.sitePairId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeSitePair"),
            new TeaPair("version", "2017-09-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeSitePairResponse());
    }

    public UpgradeSitePairResponse upgradeSitePair(UpgradeSitePairRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeSitePairWithOptions(request, runtime);
    }
}
