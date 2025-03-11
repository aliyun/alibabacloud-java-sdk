// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123;

import com.aliyun.tea.*;
import com.aliyun.drds20190123.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "drds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "drds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "drds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "drds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "drds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "drds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "drds.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "drds.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "drds.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "drds.aliyuncs.com"),
            new TeaPair("cn-chengdu", "drds.aliyuncs.com"),
            new TeaPair("cn-edge-1", "drds.aliyuncs.com"),
            new TeaPair("cn-fujian", "drds.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "drds.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "drds.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "drds.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "drds.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "drds.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "drds.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "drds.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "drds.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "drds.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "drds.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "drds.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "drds.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "drds.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "drds.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "drds.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "drds.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "drds.aliyuncs.com"),
            new TeaPair("cn-wuhan", "drds.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "drds.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "drds.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "drds.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "drds.aliyuncs.com"),
            new TeaPair("eu-central-1", "drds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "drds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "drds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("me-east-1", "drds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "drds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-west-1", "drds.ap-southeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("drds", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    /**
     * @param request ChangeAccountPasswordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeAccountPasswordResponse
     */
    public ChangeAccountPasswordResponse changeAccountPasswordWithOptions(ChangeAccountPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeAccountPassword"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeAccountPasswordResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ChangeAccountPasswordResponse());
        }

    }

    /**
     * @param request ChangeAccountPasswordRequest
     * @return ChangeAccountPasswordResponse
     */
    public ChangeAccountPasswordResponse changeAccountPassword(ChangeAccountPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeAccountPasswordWithOptions(request, runtime);
    }

    /**
     * @param request ChangeInstanceAzoneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeInstanceAzoneResponse
     */
    public ChangeInstanceAzoneResponse changeInstanceAzoneWithOptions(ChangeInstanceAzoneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.changeVSwitch)) {
            query.put("ChangeVSwitch", request.changeVSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsRegionId)) {
            query.put("DrdsRegionId", request.drdsRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newVSwitch)) {
            query.put("NewVSwitch", request.newVSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originAzoneId)) {
            query.put("OriginAzoneId", request.originAzoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetAzoneId)) {
            query.put("TargetAzoneId", request.targetAzoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeInstanceAzone"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeInstanceAzoneResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ChangeInstanceAzoneResponse());
        }

    }

    /**
     * @param request ChangeInstanceAzoneRequest
     * @return ChangeInstanceAzoneResponse
     */
    public ChangeInstanceAzoneResponse changeInstanceAzone(ChangeInstanceAzoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeInstanceAzoneWithOptions(request, runtime);
    }

    /**
     * @param request CheckDrdsDbNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckDrdsDbNameResponse
     */
    public CheckDrdsDbNameResponse checkDrdsDbNameWithOptions(CheckDrdsDbNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckDrdsDbName"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CheckDrdsDbNameResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CheckDrdsDbNameResponse());
        }

    }

    /**
     * @param request CheckDrdsDbNameRequest
     * @return CheckDrdsDbNameResponse
     */
    public CheckDrdsDbNameResponse checkDrdsDbName(CheckDrdsDbNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkDrdsDbNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Verifies whether scale-out operations such as smooth scale-out can be performed on a PolarDB-X database.</p>
     * 
     * @param request CheckExpandStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckExpandStatusResponse
     */
    public CheckExpandStatusResponse checkExpandStatusWithOptions(CheckExpandStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckExpandStatus"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CheckExpandStatusResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CheckExpandStatusResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Verifies whether scale-out operations such as smooth scale-out can be performed on a PolarDB-X database.</p>
     * 
     * @param request CheckExpandStatusRequest
     * @return CheckExpandStatusResponse
     */
    public CheckExpandStatusResponse checkExpandStatus(CheckExpandStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkExpandStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether the SQL audit feature is enabled for the logical database of a PolarDB-X 1.0 instance.</p>
     * 
     * @param request CheckSqlAuditEnableStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckSqlAuditEnableStatusResponse
     */
    public CheckSqlAuditEnableStatusResponse checkSqlAuditEnableStatusWithOptions(CheckSqlAuditEnableStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckSqlAuditEnableStatus"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CheckSqlAuditEnableStatusResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CheckSqlAuditEnableStatusResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether the SQL audit feature is enabled for the logical database of a PolarDB-X 1.0 instance.</p>
     * 
     * @param request CheckSqlAuditEnableStatusRequest
     * @return CheckSqlAuditEnableStatusResponse
     */
    public CheckSqlAuditEnableStatusResponse checkSqlAuditEnableStatus(CheckSqlAuditEnableStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkSqlAuditEnableStatusWithOptions(request, runtime);
    }

    /**
     * @param request CreateDrdsDBRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDrdsDBResponse
     */
    public CreateDrdsDBResponse createDrdsDBWithOptions(CreateDrdsDBRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbInstType)) {
            query.put("DbInstType", request.dbInstType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbInstanceIsCreating)) {
            query.put("DbInstanceIsCreating", request.dbInstanceIsCreating);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encode)) {
            query.put("Encode", request.encode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instDbName)) {
            query.put("InstDbName", request.instDbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rdsInstance)) {
            query.put("RdsInstance", request.rdsInstance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rdsSuperAccount)) {
            query.put("RdsSuperAccount", request.rdsSuperAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDrdsDB"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDrdsDBResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateDrdsDBResponse());
        }

    }

    /**
     * @param request CreateDrdsDBRequest
     * @return CreateDrdsDBResponse
     */
    public CreateDrdsDBResponse createDrdsDB(CreateDrdsDBRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDrdsDBWithOptions(request, runtime);
    }

    /**
     * @param request CreateDrdsInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDrdsInstanceResponse
     */
    public CreateDrdsInstanceResponse createDrdsInstanceWithOptions(CreateDrdsInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceSeries)) {
            query.put("InstanceSeries", request.instanceSeries);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAutoRenew)) {
            query.put("IsAutoRenew", request.isAutoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterInstId)) {
            query.put("MasterInstId", request.masterInstId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mySQLVersion)) {
            query.put("MySQLVersion", request.mySQLVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            query.put("PayType", request.payType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pricingCycle)) {
            query.put("PricingCycle", request.pricingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quantity)) {
            query.put("Quantity", request.quantity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specification)) {
            query.put("Specification", request.specification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vswitchId)) {
            query.put("VswitchId", request.vswitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isHa)) {
            query.put("isHa", request.isHa);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDrdsInstance"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDrdsInstanceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateDrdsInstanceResponse());
        }

    }

    /**
     * @param request CreateDrdsInstanceRequest
     * @return CreateDrdsInstanceResponse
     */
    public CreateDrdsInstanceResponse createDrdsInstance(CreateDrdsInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDrdsInstanceWithOptions(request, runtime);
    }

    /**
     * @param request CreateInstanceAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstanceAccountResponse
     */
    public CreateInstanceAccountResponse createInstanceAccountWithOptions(CreateInstanceAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbPrivilege)) {
            query.put("DbPrivilege", request.dbPrivilege);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstanceAccount"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceAccountResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateInstanceAccountResponse());
        }

    }

    /**
     * @param request CreateInstanceAccountRequest
     * @return CreateInstanceAccountResponse
     */
    public CreateInstanceAccountResponse createInstanceAccount(CreateInstanceAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstanceAccountWithOptions(request, runtime);
    }

    /**
     * @param request CreateInstanceInternetAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstanceInternetAddressResponse
     */
    public CreateInstanceInternetAddressResponse createInstanceInternetAddressWithOptions(CreateInstanceInternetAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstanceInternetAddress"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceInternetAddressResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateInstanceInternetAddressResponse());
        }

    }

    /**
     * @param request CreateInstanceInternetAddressRequest
     * @return CreateInstanceInternetAddressResponse
     */
    public CreateInstanceInternetAddressResponse createInstanceInternetAddress(CreateInstanceInternetAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstanceInternetAddressWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and pricing of PolarDB-X 1.0. For more information, visit the <a href="https://www.aliyun.com/price/product#/rds/detail">pricing page</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an order to purchase an ApsaraDB RDS for MySQL instance.</p>
     * 
     * @param request CreateOrderForRdsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOrderForRdsResponse
     */
    public CreateOrderForRdsResponse createOrderForRdsWithOptions(CreateOrderForRdsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOrderForRds"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOrderForRdsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateOrderForRdsResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and pricing of PolarDB-X 1.0. For more information, visit the <a href="https://www.aliyun.com/price/product#/rds/detail">pricing page</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an order to purchase an ApsaraDB RDS for MySQL instance.</p>
     * 
     * @param request CreateOrderForRdsRequest
     * @return CreateOrderForRdsResponse
     */
    public CreateOrderForRdsResponse createOrderForRds(CreateOrderForRdsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOrderForRdsWithOptions(request, runtime);
    }

    /**
     * @param request CreateShardTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateShardTaskResponse
     */
    public CreateShardTaskResponse createShardTaskWithOptions(CreateShardTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceTableName)) {
            query.put("SourceTableName", request.sourceTableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetTableName)) {
            query.put("TargetTableName", request.targetTableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateShardTask"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateShardTaskResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateShardTaskResponse());
        }

    }

    /**
     * @param request CreateShardTaskRequest
     * @return CreateShardTaskResponse
     */
    public CreateShardTaskResponse createShardTask(CreateShardTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createShardTaskWithOptions(request, runtime);
    }

    /**
     * @param request DescribeBackMenuRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBackMenuResponse
     */
    public DescribeBackMenuResponse describeBackMenuWithOptions(DescribeBackMenuRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBackMenu"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackMenuResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeBackMenuResponse());
        }

    }

    /**
     * @param request DescribeBackMenuRequest
     * @return DescribeBackMenuResponse
     */
    public DescribeBackMenuResponse describeBackMenu(DescribeBackMenuRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackMenuWithOptions(request, runtime);
    }

    /**
     * @param request DescribeBackupDbsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBackupDbsResponse
     */
    public DescribeBackupDbsResponse describeBackupDbsWithOptions(DescribeBackupDbsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupId)) {
            query.put("BackupId", request.backupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preferredRestoreTime)) {
            query.put("PreferredRestoreTime", request.preferredRestoreTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBackupDbs"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackupDbsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeBackupDbsResponse());
        }

    }

    /**
     * @param request DescribeBackupDbsRequest
     * @return DescribeBackupDbsResponse
     */
    public DescribeBackupDbsResponse describeBackupDbs(DescribeBackupDbsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupDbsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the backup settings of local logs.</p>
     * 
     * @param request DescribeBackupLocalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBackupLocalResponse
     */
    public DescribeBackupLocalResponse describeBackupLocalWithOptions(DescribeBackupLocalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBackupLocal"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackupLocalResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeBackupLocalResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the backup settings of local logs.</p>
     * 
     * @param request DescribeBackupLocalRequest
     * @return DescribeBackupLocalResponse
     */
    public DescribeBackupLocalResponse describeBackupLocal(DescribeBackupLocalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupLocalWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a backup policy.</p>
     * 
     * @param request DescribeBackupPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBackupPolicyResponse
     */
    public DescribeBackupPolicyResponse describeBackupPolicyWithOptions(DescribeBackupPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBackupPolicy"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackupPolicyResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeBackupPolicyResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a backup policy.</p>
     * 
     * @param request DescribeBackupPolicyRequest
     * @return DescribeBackupPolicyResponse
     */
    public DescribeBackupPolicyResponse describeBackupPolicy(DescribeBackupPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupPolicyWithOptions(request, runtime);
    }

    /**
     * @param request DescribeBackupSetsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBackupSetsResponse
     */
    public DescribeBackupSetsResponse describeBackupSetsWithOptions(DescribeBackupSetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBackupSets"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackupSetsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeBackupSetsResponse());
        }

    }

    /**
     * @param request DescribeBackupSetsRequest
     * @return DescribeBackupSetsResponse
     */
    public DescribeBackupSetsResponse describeBackupSets(DescribeBackupSetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupSetsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeBackupTimesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBackupTimesResponse
     */
    public DescribeBackupTimesResponse describeBackupTimesWithOptions(DescribeBackupTimesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBackupTimes"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackupTimesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeBackupTimesResponse());
        }

    }

    /**
     * @param request DescribeBackupTimesRequest
     * @return DescribeBackupTimesResponse
     */
    public DescribeBackupTimesResponse describeBackupTimes(DescribeBackupTimesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupTimesWithOptions(request, runtime);
    }

    /**
     * @param request DescribeBroadcastTablesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBroadcastTablesResponse
     */
    public DescribeBroadcastTablesResponse describeBroadcastTablesWithOptions(DescribeBroadcastTablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBroadcastTables"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBroadcastTablesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeBroadcastTablesResponse());
        }

    }

    /**
     * @param request DescribeBroadcastTablesRequest
     * @return DescribeBroadcastTablesResponse
     */
    public DescribeBroadcastTablesResponse describeBroadcastTables(DescribeBroadcastTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBroadcastTablesWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDbInstanceDbsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDbInstanceDbsResponse
     */
    public DescribeDbInstanceDbsResponse describeDbInstanceDbsWithOptions(DescribeDbInstanceDbsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbInstType)) {
            query.put("DbInstType", request.dbInstType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbInstanceId)) {
            query.put("DbInstanceId", request.dbInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDbInstanceDbs"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDbInstanceDbsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeDbInstanceDbsResponse());
        }

    }

    /**
     * @param request DescribeDbInstanceDbsRequest
     * @return DescribeDbInstanceDbsResponse
     */
    public DescribeDbInstanceDbsResponse describeDbInstanceDbs(DescribeDbInstanceDbsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDbInstanceDbsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries DescribeDbInstances of the storage layer, such as RDS or PolarDB.</p>
     * 
     * @param request DescribeDbInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDbInstancesResponse
     */
    public DescribeDbInstancesResponse describeDbInstancesWithOptions(DescribeDbInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbInstType)) {
            query.put("DbInstType", request.dbInstType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.search)) {
            query.put("Search", request.search);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDbInstances"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDbInstancesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeDbInstancesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries DescribeDbInstances of the storage layer, such as RDS or PolarDB.</p>
     * 
     * @param request DescribeDbInstancesRequest
     * @return DescribeDbInstancesResponse
     */
    public DescribeDbInstancesResponse describeDbInstances(DescribeDbInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDbInstancesWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDrdsDBRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDrdsDBResponse
     */
    public DescribeDrdsDBResponse describeDrdsDBWithOptions(DescribeDrdsDBRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDrdsDB"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrdsDBResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeDrdsDBResponse());
        }

    }

    /**
     * @param request DescribeDrdsDBRequest
     * @return DescribeDrdsDBResponse
     */
    public DescribeDrdsDBResponse describeDrdsDB(DescribeDrdsDBRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsDBWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the information of the PolarDB cluster in the DRDS logical database.</p>
     * 
     * @param request DescribeDrdsDBClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDrdsDBClusterResponse
     */
    public DescribeDrdsDBClusterResponse describeDrdsDBClusterWithOptions(DescribeDrdsDBClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbInstanceId)) {
            query.put("DbInstanceId", request.dbInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDrdsDBCluster"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrdsDBClusterResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeDrdsDBClusterResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the information of the PolarDB cluster in the DRDS logical database.</p>
     * 
     * @param request DescribeDrdsDBClusterRequest
     * @return DescribeDrdsDBClusterResponse
     */
    public DescribeDrdsDBClusterResponse describeDrdsDBCluster(DescribeDrdsDBClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsDBClusterWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDrdsDBIpWhiteListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDrdsDBIpWhiteListResponse
     */
    public DescribeDrdsDBIpWhiteListResponse describeDrdsDBIpWhiteListWithOptions(DescribeDrdsDBIpWhiteListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDrdsDBIpWhiteList"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrdsDBIpWhiteListResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeDrdsDBIpWhiteListResponse());
        }

    }

    /**
     * @param request DescribeDrdsDBIpWhiteListRequest
     * @return DescribeDrdsDBIpWhiteListResponse
     */
    public DescribeDrdsDBIpWhiteListResponse describeDrdsDBIpWhiteList(DescribeDrdsDBIpWhiteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsDBIpWhiteListWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDrdsDBsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDrdsDBsResponse
     */
    public DescribeDrdsDBsResponse describeDrdsDBsWithOptions(DescribeDrdsDBsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDrdsDBs"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrdsDBsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeDrdsDBsResponse());
        }

    }

    /**
     * @param request DescribeDrdsDBsRequest
     * @return DescribeDrdsDBsResponse
     */
    public DescribeDrdsDBsResponse describeDrdsDBs(DescribeDrdsDBsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsDBsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDrdsDbInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDrdsDbInstanceResponse
     */
    public DescribeDrdsDbInstanceResponse describeDrdsDbInstanceWithOptions(DescribeDrdsDbInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbInstanceId)) {
            query.put("DbInstanceId", request.dbInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDrdsDbInstance"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrdsDbInstanceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeDrdsDbInstanceResponse());
        }

    }

    /**
     * @param request DescribeDrdsDbInstanceRequest
     * @return DescribeDrdsDbInstanceResponse
     */
    public DescribeDrdsDbInstanceResponse describeDrdsDbInstance(DescribeDrdsDbInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsDbInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries ApsaraDB RDS for MySQL instances that are used to store the data of a database.</p>
     * 
     * @param request DescribeDrdsDbInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDrdsDbInstancesResponse
     */
    public DescribeDrdsDbInstancesResponse describeDrdsDbInstancesWithOptions(DescribeDrdsDbInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDrdsDbInstances"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrdsDbInstancesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeDrdsDbInstancesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries ApsaraDB RDS for MySQL instances that are used to store the data of a database.</p>
     * 
     * @param request DescribeDrdsDbInstancesRequest
     * @return DescribeDrdsDbInstancesResponse
     */
    public DescribeDrdsDbInstancesResponse describeDrdsDbInstances(DescribeDrdsDbInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsDbInstancesWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDrdsDbRdsNameListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDrdsDbRdsNameListResponse
     */
    public DescribeDrdsDbRdsNameListResponse describeDrdsDbRdsNameListWithOptions(DescribeDrdsDbRdsNameListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDrdsDbRdsNameList"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrdsDbRdsNameListResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeDrdsDbRdsNameListResponse());
        }

    }

    /**
     * @param request DescribeDrdsDbRdsNameListRequest
     * @return DescribeDrdsDbRdsNameListResponse
     */
    public DescribeDrdsDbRdsNameListResponse describeDrdsDbRdsNameList(DescribeDrdsDbRdsNameListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsDbRdsNameListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a PolarDB-X 1.0 instance.</p>
     * 
     * @param request DescribeDrdsInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDrdsInstanceResponse
     */
    public DescribeDrdsInstanceResponse describeDrdsInstanceWithOptions(DescribeDrdsInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDrdsInstance"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrdsInstanceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeDrdsInstanceResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a PolarDB-X 1.0 instance.</p>
     * 
     * @param request DescribeDrdsInstanceRequest
     * @return DescribeDrdsInstanceResponse
     */
    public DescribeDrdsInstanceResponse describeDrdsInstance(DescribeDrdsInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsInstanceWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDrdsInstanceDbMonitorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDrdsInstanceDbMonitorResponse
     */
    public DescribeDrdsInstanceDbMonitorResponse describeDrdsInstanceDbMonitorWithOptions(DescribeDrdsInstanceDbMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDrdsInstanceDbMonitor"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrdsInstanceDbMonitorResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeDrdsInstanceDbMonitorResponse());
        }

    }

    /**
     * @param request DescribeDrdsInstanceDbMonitorRequest
     * @return DescribeDrdsInstanceDbMonitorResponse
     */
    public DescribeDrdsInstanceDbMonitorResponse describeDrdsInstanceDbMonitor(DescribeDrdsInstanceDbMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsInstanceDbMonitorWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDrdsInstanceLevelTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDrdsInstanceLevelTasksResponse
     */
    public DescribeDrdsInstanceLevelTasksResponse describeDrdsInstanceLevelTasksWithOptions(DescribeDrdsInstanceLevelTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDrdsInstanceLevelTasks"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrdsInstanceLevelTasksResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeDrdsInstanceLevelTasksResponse());
        }

    }

    /**
     * @param request DescribeDrdsInstanceLevelTasksRequest
     * @return DescribeDrdsInstanceLevelTasksResponse
     */
    public DescribeDrdsInstanceLevelTasksResponse describeDrdsInstanceLevelTasks(DescribeDrdsInstanceLevelTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsInstanceLevelTasksWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDrdsInstanceMonitorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDrdsInstanceMonitorResponse
     */
    public DescribeDrdsInstanceMonitorResponse describeDrdsInstanceMonitorWithOptions(DescribeDrdsInstanceMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodMultiple)) {
            query.put("PeriodMultiple", request.periodMultiple);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDrdsInstanceMonitor"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrdsInstanceMonitorResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeDrdsInstanceMonitorResponse());
        }

    }

    /**
     * @param request DescribeDrdsInstanceMonitorRequest
     * @return DescribeDrdsInstanceMonitorResponse
     */
    public DescribeDrdsInstanceMonitorResponse describeDrdsInstanceMonitor(DescribeDrdsInstanceMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsInstanceMonitorWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDrdsInstanceVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDrdsInstanceVersionResponse
     */
    public DescribeDrdsInstanceVersionResponse describeDrdsInstanceVersionWithOptions(DescribeDrdsInstanceVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDrdsInstanceVersion"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrdsInstanceVersionResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeDrdsInstanceVersionResponse());
        }

    }

    /**
     * @param request DescribeDrdsInstanceVersionRequest
     * @return DescribeDrdsInstanceVersionResponse
     */
    public DescribeDrdsInstanceVersionResponse describeDrdsInstanceVersion(DescribeDrdsInstanceVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsInstanceVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries instances that meet the specified conditions.</p>
     * 
     * @param request DescribeDrdsInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDrdsInstancesResponse
     */
    public DescribeDrdsInstancesResponse describeDrdsInstancesWithOptions(DescribeDrdsInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expired)) {
            query.put("Expired", request.expired);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mix)) {
            query.put("Mix", request.mix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersion)) {
            query.put("ProductVersion", request.productVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDrdsInstances"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrdsInstancesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeDrdsInstancesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries instances that meet the specified conditions.</p>
     * 
     * @param request DescribeDrdsInstancesRequest
     * @return DescribeDrdsInstancesResponse
     */
    public DescribeDrdsInstancesResponse describeDrdsInstances(DescribeDrdsInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsInstancesWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDrdsParamsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDrdsParamsResponse
     */
    public DescribeDrdsParamsResponse describeDrdsParamsWithOptions(DescribeDrdsParamsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramLevel)) {
            query.put("ParamLevel", request.paramLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDrdsParams"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrdsParamsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeDrdsParamsResponse());
        }

    }

    /**
     * @param request DescribeDrdsParamsRequest
     * @return DescribeDrdsParamsResponse
     */
    public DescribeDrdsParamsResponse describeDrdsParams(DescribeDrdsParamsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsParamsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about all custom ApsaraDB RDS for MySQL instances in a PolarDB-X instance.</p>
     * 
     * @param request DescribeDrdsRdsInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDrdsRdsInstancesResponse
     */
    public DescribeDrdsRdsInstancesResponse describeDrdsRdsInstancesWithOptions(DescribeDrdsRdsInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDrdsRdsInstances"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrdsRdsInstancesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeDrdsRdsInstancesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about all custom ApsaraDB RDS for MySQL instances in a PolarDB-X instance.</p>
     * 
     * @param request DescribeDrdsRdsInstancesRequest
     * @return DescribeDrdsRdsInstancesResponse
     */
    public DescribeDrdsRdsInstancesResponse describeDrdsRdsInstances(DescribeDrdsRdsInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsRdsInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the database shards of an PolarDB-X 1.0 instance.</p>
     * 
     * @param request DescribeDrdsShardingDbsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDrdsShardingDbsResponse
     */
    public DescribeDrdsShardingDbsResponse describeDrdsShardingDbsWithOptions(DescribeDrdsShardingDbsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbNamePattern)) {
            query.put("DbNamePattern", request.dbNamePattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDrdsShardingDbs"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrdsShardingDbsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeDrdsShardingDbsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the database shards of an PolarDB-X 1.0 instance.</p>
     * 
     * @param request DescribeDrdsShardingDbsRequest
     * @return DescribeDrdsShardingDbsResponse
     */
    public DescribeDrdsShardingDbsResponse describeDrdsShardingDbs(DescribeDrdsShardingDbsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsShardingDbsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a slow SQL query.</p>
     * 
     * @param request DescribeDrdsSlowSqlsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDrdsSlowSqlsResponse
     */
    public DescribeDrdsSlowSqlsResponse describeDrdsSlowSqlsWithOptions(DescribeDrdsSlowSqlsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exeTime)) {
            query.put("ExeTime", request.exeTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDrdsSlowSqls"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrdsSlowSqlsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeDrdsSlowSqlsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries a slow SQL query.</p>
     * 
     * @param request DescribeDrdsSlowSqlsRequest
     * @return DescribeDrdsSlowSqlsResponse
     */
    public DescribeDrdsSlowSqlsResponse describeDrdsSlowSqls(DescribeDrdsSlowSqlsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsSlowSqlsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the SQL audit details of a PolarDB-X 1.0 instance.</p>
     * 
     * @param request DescribeDrdsSqlAuditStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDrdsSqlAuditStatusResponse
     */
    public DescribeDrdsSqlAuditStatusResponse describeDrdsSqlAuditStatusWithOptions(DescribeDrdsSqlAuditStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDrdsSqlAuditStatus"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrdsSqlAuditStatusResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeDrdsSqlAuditStatusResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the SQL audit details of a PolarDB-X 1.0 instance.</p>
     * 
     * @param request DescribeDrdsSqlAuditStatusRequest
     * @return DescribeDrdsSqlAuditStatusResponse
     */
    public DescribeDrdsSqlAuditStatusResponse describeDrdsSqlAuditStatus(DescribeDrdsSqlAuditStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsSqlAuditStatusWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDrdsTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDrdsTasksResponse
     */
    public DescribeDrdsTasksResponse describeDrdsTasksWithOptions(DescribeDrdsTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDrdsTasks"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrdsTasksResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeDrdsTasksResponse());
        }

    }

    /**
     * @param request DescribeDrdsTasksRequest
     * @return DescribeDrdsTasksResponse
     */
    public DescribeDrdsTasksResponse describeDrdsTasks(DescribeDrdsTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsTasksWithOptions(request, runtime);
    }

    /**
     * @param request DescribeExpandLogicTableInfoListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeExpandLogicTableInfoListResponse
     */
    public DescribeExpandLogicTableInfoListResponse describeExpandLogicTableInfoListWithOptions(DescribeExpandLogicTableInfoListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExpandLogicTableInfoList"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExpandLogicTableInfoListResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeExpandLogicTableInfoListResponse());
        }

    }

    /**
     * @param request DescribeExpandLogicTableInfoListRequest
     * @return DescribeExpandLogicTableInfoListResponse
     */
    public DescribeExpandLogicTableInfoListResponse describeExpandLogicTableInfoList(DescribeExpandLogicTableInfoListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExpandLogicTableInfoListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about databases on which hots-pot scale-out is performed.</p>
     * 
     * @param request DescribeHotDbListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHotDbListResponse
     */
    public DescribeHotDbListResponse describeHotDbListWithOptions(DescribeHotDbListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHotDbList"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHotDbListResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeHotDbListResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about databases on which hots-pot scale-out is performed.</p>
     * 
     * @param request DescribeHotDbListRequest
     * @return DescribeHotDbListResponse
     */
    public DescribeHotDbListResponse describeHotDbList(DescribeHotDbListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHotDbListWithOptions(request, runtime);
    }

    /**
     * @param request DescribeInstDbLogInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstDbLogInfoResponse
     */
    public DescribeInstDbLogInfoResponse describeInstDbLogInfoWithOptions(DescribeInstDbLogInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstDbLogInfo"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstDbLogInfoResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeInstDbLogInfoResponse());
        }

    }

    /**
     * @param request DescribeInstDbLogInfoRequest
     * @return DescribeInstDbLogInfoResponse
     */
    public DescribeInstDbLogInfoResponse describeInstDbLogInfo(DescribeInstDbLogInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstDbLogInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the names of the Log Service project and the Logstore used by the SQL audit feature.</p>
     * 
     * @param request DescribeInstDbSlsInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstDbSlsInfoResponse
     */
    public DescribeInstDbSlsInfoResponse describeInstDbSlsInfoWithOptions(DescribeInstDbSlsInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstDbSlsInfo"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstDbSlsInfoResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeInstDbSlsInfoResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the names of the Log Service project and the Logstore used by the SQL audit feature.</p>
     * 
     * @param request DescribeInstDbSlsInfoRequest
     * @return DescribeInstDbSlsInfoResponse
     */
    public DescribeInstDbSlsInfoResponse describeInstDbSlsInfo(DescribeInstDbSlsInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstDbSlsInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about an instance account.</p>
     * 
     * @param request DescribeInstanceAccountsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceAccountsResponse
     */
    public DescribeInstanceAccountsResponse describeInstanceAccountsWithOptions(DescribeInstanceAccountsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceAccounts"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceAccountsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeInstanceAccountsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about an instance account.</p>
     * 
     * @param request DescribeInstanceAccountsRequest
     * @return DescribeInstanceAccountsResponse
     */
    public DescribeInstanceAccountsResponse describeInstanceAccounts(DescribeInstanceAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceAccountsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Check whether zone switching is enabled</p>
     * 
     * @param request DescribeInstanceSwitchAzoneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceSwitchAzoneResponse
     */
    public DescribeInstanceSwitchAzoneResponse describeInstanceSwitchAzoneWithOptions(DescribeInstanceSwitchAzoneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceSwitchAzone"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceSwitchAzoneResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeInstanceSwitchAzoneResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Check whether zone switching is enabled</p>
     * 
     * @param request DescribeInstanceSwitchAzoneRequest
     * @return DescribeInstanceSwitchAzoneResponse
     */
    public DescribeInstanceSwitchAzoneResponse describeInstanceSwitchAzone(DescribeInstanceSwitchAzoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceSwitchAzoneWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Queries whether you can change the network type of a PolarDB-X 1.0 instance.</p>
     * 
     * @param request DescribeInstanceSwitchNetworkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceSwitchNetworkResponse
     */
    public DescribeInstanceSwitchNetworkResponse describeInstanceSwitchNetworkWithOptions(DescribeInstanceSwitchNetworkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceSwitchNetwork"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceSwitchNetworkResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeInstanceSwitchNetworkResponse());
        }

    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Queries whether you can change the network type of a PolarDB-X 1.0 instance.</p>
     * 
     * @param request DescribeInstanceSwitchNetworkRequest
     * @return DescribeInstanceSwitchNetworkResponse
     */
    public DescribeInstanceSwitchNetworkResponse describeInstanceSwitchNetwork(DescribeInstanceSwitchNetworkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceSwitchNetworkWithOptions(request, runtime);
    }

    /**
     * @param request DescribePreCheckResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePreCheckResultResponse
     */
    public DescribePreCheckResultResponse describePreCheckResultWithOptions(DescribePreCheckResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePreCheckResult"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePreCheckResultResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribePreCheckResultResponse());
        }

    }

    /**
     * @param request DescribePreCheckResultRequest
     * @return DescribePreCheckResultResponse
     */
    public DescribePreCheckResultResponse describePreCheckResult(DescribePreCheckResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePreCheckResultWithOptions(request, runtime);
    }

    /**
     * @param request DescribeRDSPerformanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRDSPerformanceResponse
     */
    public DescribeRDSPerformanceResponse describeRDSPerformanceWithOptions(DescribeRDSPerformanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbInstType)) {
            query.put("DbInstType", request.dbInstType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keys)) {
            query.put("Keys", request.keys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rdsInstanceId)) {
            query.put("RdsInstanceId", request.rdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRDSPerformance"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRDSPerformanceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeRDSPerformanceResponse());
        }

    }

    /**
     * @param request DescribeRDSPerformanceRequest
     * @return DescribeRDSPerformanceResponse
     */
    public DescribeRDSPerformanceResponse describeRDSPerformance(DescribeRDSPerformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRDSPerformanceWithOptions(request, runtime);
    }

    /**
     * @param request DescribeRdsCommodityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRdsCommodityResponse
     */
    public DescribeRdsCommodityResponse describeRdsCommodityWithOptions(DescribeRdsCommodityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            query.put("CommodityCode", request.commodityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRdsCommodity"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRdsCommodityResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeRdsCommodityResponse());
        }

    }

    /**
     * @param request DescribeRdsCommodityRequest
     * @return DescribeRdsCommodityResponse
     */
    public DescribeRdsCommodityResponse describeRdsCommodity(DescribeRdsCommodityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRdsCommodityWithOptions(request, runtime);
    }

    /**
     * @param request DescribeRdsPerformanceSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRdsPerformanceSummaryResponse
     */
    public DescribeRdsPerformanceSummaryResponse describeRdsPerformanceSummaryWithOptions(DescribeRdsPerformanceSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rdsInstanceId)) {
            query.put("RdsInstanceId", request.rdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRdsPerformanceSummary"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRdsPerformanceSummaryResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeRdsPerformanceSummaryResponse());
        }

    }

    /**
     * @param request DescribeRdsPerformanceSummaryRequest
     * @return DescribeRdsPerformanceSummaryResponse
     */
    public DescribeRdsPerformanceSummaryResponse describeRdsPerformanceSummary(DescribeRdsPerformanceSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRdsPerformanceSummaryWithOptions(request, runtime);
    }

    /**
     * @param request DescribeRdsSuperAccountInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRdsSuperAccountInstancesResponse
     */
    public DescribeRdsSuperAccountInstancesResponse describeRdsSuperAccountInstancesWithOptions(DescribeRdsSuperAccountInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbInstType)) {
            query.put("DbInstType", request.dbInstType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rdsInstance)) {
            query.put("RdsInstance", request.rdsInstance);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRdsSuperAccountInstances"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRdsSuperAccountInstancesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeRdsSuperAccountInstancesResponse());
        }

    }

    /**
     * @param request DescribeRdsSuperAccountInstancesRequest
     * @return DescribeRdsSuperAccountInstancesResponse
     */
    public DescribeRdsSuperAccountInstancesResponse describeRdsSuperAccountInstances(DescribeRdsSuperAccountInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRdsSuperAccountInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of the table recycle bin.</p>
     * 
     * @param request DescribeRecycleBinStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRecycleBinStatusResponse
     */
    public DescribeRecycleBinStatusResponse describeRecycleBinStatusWithOptions(DescribeRecycleBinStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRecycleBinStatus"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRecycleBinStatusResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeRecycleBinStatusResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of the table recycle bin.</p>
     * 
     * @param request DescribeRecycleBinStatusRequest
     * @return DescribeRecycleBinStatusResponse
     */
    public DescribeRecycleBinStatusResponse describeRecycleBinStatus(DescribeRecycleBinStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRecycleBinStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tables that can be restored in the recycle bin.</p>
     * 
     * @param request DescribeRecycleBinTablesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRecycleBinTablesResponse
     */
    public DescribeRecycleBinTablesResponse describeRecycleBinTablesWithOptions(DescribeRecycleBinTablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRecycleBinTables"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRecycleBinTablesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeRecycleBinTablesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tables that can be restored in the recycle bin.</p>
     * 
     * @param request DescribeRecycleBinTablesRequest
     * @return DescribeRecycleBinTablesResponse
     */
    public DescribeRecycleBinTablesResponse describeRecycleBinTables(DescribeRecycleBinTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRecycleBinTablesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the DescribeRestoreOrder operation to view the details of the order.</p>
     * 
     * @param request DescribeRestoreOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRestoreOrderResponse
     */
    public DescribeRestoreOrderResponse describeRestoreOrderWithOptions(DescribeRestoreOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupDbNames)) {
            query.put("BackupDbNames", request.backupDbNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupId)) {
            query.put("BackupId", request.backupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupLevel)) {
            query.put("BackupLevel", request.backupLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupMode)) {
            query.put("BackupMode", request.backupMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preferredBackupTime)) {
            query.put("PreferredBackupTime", request.preferredBackupTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRestoreOrder"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRestoreOrderResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeRestoreOrderResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>You can call the DescribeRestoreOrder operation to view the details of the order.</p>
     * 
     * @param request DescribeRestoreOrderRequest
     * @return DescribeRestoreOrderResponse
     */
    public DescribeRestoreOrderResponse describeRestoreOrder(DescribeRestoreOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRestoreOrderWithOptions(request, runtime);
    }

    /**
     * @param request DescribeShardTaskInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeShardTaskInfoResponse
     */
    public DescribeShardTaskInfoResponse describeShardTaskInfoWithOptions(DescribeShardTaskInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceTableName)) {
            query.put("SourceTableName", request.sourceTableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetTableName)) {
            query.put("TargetTableName", request.targetTableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeShardTaskInfo"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeShardTaskInfoResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeShardTaskInfoResponse());
        }

    }

    /**
     * @param request DescribeShardTaskInfoRequest
     * @return DescribeShardTaskInfoResponse
     */
    public DescribeShardTaskInfoResponse describeShardTaskInfo(DescribeShardTaskInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeShardTaskInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the flashback tasks that are performed on a PolarDB-X 1.0 instance.</p>
     * 
     * @param request DescribeSqlFlashbakTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSqlFlashbakTaskResponse
     */
    public DescribeSqlFlashbakTaskResponse describeSqlFlashbakTaskWithOptions(DescribeSqlFlashbakTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSqlFlashbakTask"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSqlFlashbakTaskResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeSqlFlashbakTaskResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the flashback tasks that are performed on a PolarDB-X 1.0 instance.</p>
     * 
     * @param request DescribeSqlFlashbakTaskRequest
     * @return DescribeSqlFlashbakTaskResponse
     */
    public DescribeSqlFlashbakTaskResponse describeSqlFlashbakTask(DescribeSqlFlashbakTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSqlFlashbakTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about the schema of a table.</p>
     * 
     * @param request DescribeTableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTableResponse
     */
    public DescribeTableResponse describeTableWithOptions(DescribeTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTable"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTableResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeTableResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about the schema of a table.</p>
     * 
     * @param request DescribeTableRequest
     * @return DescribeTableResponse
     */
    public DescribeTableResponse describeTable(DescribeTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTableWithOptions(request, runtime);
    }

    /**
     * @param request DescribeTableListByTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTableListByTypeResponse
     */
    public DescribeTableListByTypeResponse describeTableListByTypeWithOptions(DescribeTableListByTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableType)) {
            query.put("TableType", request.tableType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTableListByType"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTableListByTypeResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeTableListByTypeResponse());
        }

    }

    /**
     * @param request DescribeTableListByTypeRequest
     * @return DescribeTableListByTypeResponse
     */
    public DescribeTableListByTypeResponse describeTableListByType(DescribeTableListByTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTableListByTypeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DescribeTables文档变更</p>
     * 
     * @param request DescribeTablesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTablesResponse
     */
    public DescribeTablesResponse describeTablesWithOptions(DescribeTablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTables"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTablesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeTablesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>DescribeTables文档变更</p>
     * 
     * @param request DescribeTablesRequest
     * @return DescribeTablesResponse
     */
    public DescribeTablesResponse describeTables(DescribeTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTablesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables the SQL audit feature for a database.</p>
     * 
     * @param request DisableSqlAuditRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableSqlAuditResponse
     */
    public DisableSqlAuditResponse disableSqlAuditWithOptions(DisableSqlAuditRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableSqlAudit"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DisableSqlAuditResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DisableSqlAuditResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Disables the SQL audit feature for a database.</p>
     * 
     * @param request DisableSqlAuditRequest
     * @return DisableSqlAuditResponse
     */
    public DisableSqlAuditResponse disableSqlAudit(DisableSqlAuditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableSqlAuditWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an IPv6 address.</p>
     * 
     * @param request EnableInstanceIpv6AddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableInstanceIpv6AddressResponse
     */
    public EnableInstanceIpv6AddressResponse enableInstanceIpv6AddressWithOptions(EnableInstanceIpv6AddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableInstanceIpv6Address"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new EnableInstanceIpv6AddressResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new EnableInstanceIpv6AddressResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Creates an IPv6 address.</p>
     * 
     * @param request EnableInstanceIpv6AddressRequest
     * @return EnableInstanceIpv6AddressResponse
     */
    public EnableInstanceIpv6AddressResponse enableInstanceIpv6Address(EnableInstanceIpv6AddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableInstanceIpv6AddressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the SQL audit feature for a database.</p>
     * 
     * @param request EnableSqlAuditRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableSqlAuditResponse
     */
    public EnableSqlAuditResponse enableSqlAuditWithOptions(EnableSqlAuditRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isRecall)) {
            query.put("IsRecall", request.isRecall);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recallEndTimestamp)) {
            query.put("RecallEndTimestamp", request.recallEndTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recallStartTimestamp)) {
            query.put("RecallStartTimestamp", request.recallStartTimestamp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableSqlAudit"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new EnableSqlAuditResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new EnableSqlAuditResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Enables the SQL audit feature for a database.</p>
     * 
     * @param request EnableSqlAuditRequest
     * @return EnableSqlAuditResponse
     */
    public EnableSqlAuditResponse enableSqlAudit(EnableSqlAuditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableSqlAuditWithOptions(request, runtime);
    }

    /**
     * @param request EnableSqlFlashbackMatchSwitchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableSqlFlashbackMatchSwitchResponse
     */
    public EnableSqlFlashbackMatchSwitchResponse enableSqlFlashbackMatchSwitchWithOptions(EnableSqlFlashbackMatchSwitchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableSqlFlashbackMatchSwitch"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new EnableSqlFlashbackMatchSwitchResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new EnableSqlFlashbackMatchSwitchResponse());
        }

    }

    /**
     * @param request EnableSqlFlashbackMatchSwitchRequest
     * @return EnableSqlFlashbackMatchSwitchResponse
     */
    public EnableSqlFlashbackMatchSwitchResponse enableSqlFlashbackMatchSwitch(EnableSqlFlashbackMatchSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableSqlFlashbackMatchSwitchWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Restores a logical table that is deleted.</p>
     * 
     * @param request FlashbackRecycleBinTableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FlashbackRecycleBinTableResponse
     */
    public FlashbackRecycleBinTableResponse flashbackRecycleBinTableWithOptions(FlashbackRecycleBinTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlashbackRecycleBinTable"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new FlashbackRecycleBinTableResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new FlashbackRecycleBinTableResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Restores a logical table that is deleted.</p>
     * 
     * @param request FlashbackRecycleBinTableRequest
     * @return FlashbackRecycleBinTableResponse
     */
    public FlashbackRecycleBinTableResponse flashbackRecycleBinTable(FlashbackRecycleBinTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.flashbackRecycleBinTableWithOptions(request, runtime);
    }

    /**
     * @param request GetDrdsDbRdsRelationInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDrdsDbRdsRelationInfoResponse
     */
    public GetDrdsDbRdsRelationInfoResponse getDrdsDbRdsRelationInfoWithOptions(GetDrdsDbRdsRelationInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDrdsDbRdsRelationInfo"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetDrdsDbRdsRelationInfoResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetDrdsDbRdsRelationInfoResponse());
        }

    }

    /**
     * @param request GetDrdsDbRdsRelationInfoRequest
     * @return GetDrdsDbRdsRelationInfoResponse
     */
    public GetDrdsDbRdsRelationInfoResponse getDrdsDbRdsRelationInfo(GetDrdsDbRdsRelationInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDrdsDbRdsRelationInfoWithOptions(request, runtime);
    }

    /**
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListTagResourcesResponse());
        }

    }

    /**
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Manages a custom ApsaraDB RDS instance at the storage layer.</p>
     * 
     * @param request ManagePrivateRdsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ManagePrivateRdsResponse
     */
    public ManagePrivateRdsResponse managePrivateRdsWithOptions(ManagePrivateRdsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rdsAction)) {
            query.put("RdsAction", request.rdsAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ManagePrivateRds"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ManagePrivateRdsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ManagePrivateRdsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Manages a custom ApsaraDB RDS instance at the storage layer.</p>
     * 
     * @param request ManagePrivateRdsRequest
     * @return ManagePrivateRdsResponse
     */
    public ManagePrivateRdsResponse managePrivateRds(ManagePrivateRdsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.managePrivateRdsWithOptions(request, runtime);
    }

    /**
     * @param request ModifyAccountDescriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAccountDescriptionResponse
     */
    public ModifyAccountDescriptionResponse modifyAccountDescriptionWithOptions(ModifyAccountDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAccountDescription"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAccountDescriptionResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ModifyAccountDescriptionResponse());
        }

    }

    /**
     * @param request ModifyAccountDescriptionRequest
     * @return ModifyAccountDescriptionResponse
     */
    public ModifyAccountDescriptionResponse modifyAccountDescription(ModifyAccountDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAccountDescriptionWithOptions(request, runtime);
    }

    /**
     * @param request ModifyAccountPrivilegeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAccountPrivilegeResponse
     */
    public ModifyAccountPrivilegeResponse modifyAccountPrivilegeWithOptions(ModifyAccountPrivilegeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbPrivilege)) {
            query.put("DbPrivilege", request.dbPrivilege);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAccountPrivilege"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAccountPrivilegeResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ModifyAccountPrivilegeResponse());
        }

    }

    /**
     * @param request ModifyAccountPrivilegeRequest
     * @return ModifyAccountPrivilegeResponse
     */
    public ModifyAccountPrivilegeResponse modifyAccountPrivilege(ModifyAccountPrivilegeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAccountPrivilegeWithOptions(request, runtime);
    }

    /**
     * @param request ModifyDrdsInstanceDescriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDrdsInstanceDescriptionResponse
     */
    public ModifyDrdsInstanceDescriptionResponse modifyDrdsInstanceDescriptionWithOptions(ModifyDrdsInstanceDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDrdsInstanceDescription"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDrdsInstanceDescriptionResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ModifyDrdsInstanceDescriptionResponse());
        }

    }

    /**
     * @param request ModifyDrdsInstanceDescriptionRequest
     * @return ModifyDrdsInstanceDescriptionResponse
     */
    public ModifyDrdsInstanceDescriptionResponse modifyDrdsInstanceDescription(ModifyDrdsInstanceDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDrdsInstanceDescriptionWithOptions(request, runtime);
    }

    /**
     * @param request ModifyDrdsIpWhiteListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDrdsIpWhiteListResponse
     */
    public ModifyDrdsIpWhiteListResponse modifyDrdsIpWhiteListWithOptions(ModifyDrdsIpWhiteListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupAttribute)) {
            query.put("GroupAttribute", request.groupAttribute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipWhiteList)) {
            query.put("IpWhiteList", request.ipWhiteList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDrdsIpWhiteList"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDrdsIpWhiteListResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ModifyDrdsIpWhiteListResponse());
        }

    }

    /**
     * @param request ModifyDrdsIpWhiteListRequest
     * @return ModifyDrdsIpWhiteListResponse
     */
    public ModifyDrdsIpWhiteListResponse modifyDrdsIpWhiteList(ModifyDrdsIpWhiteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDrdsIpWhiteListWithOptions(request, runtime);
    }

    /**
     * @param request ModifyPolarDbReadWeightRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyPolarDbReadWeightResponse
     */
    public ModifyPolarDbReadWeightResponse modifyPolarDbReadWeightWithOptions(ModifyPolarDbReadWeightRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbInstanceId)) {
            query.put("DbInstanceId", request.dbInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbNodeIds)) {
            query.put("DbNodeIds", request.dbNodeIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.weights)) {
            query.put("Weights", request.weights);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPolarDbReadWeight"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPolarDbReadWeightResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ModifyPolarDbReadWeightResponse());
        }

    }

    /**
     * @param request ModifyPolarDbReadWeightRequest
     * @return ModifyPolarDbReadWeightResponse
     */
    public ModifyPolarDbReadWeightResponse modifyPolarDbReadWeight(ModifyPolarDbReadWeightRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyPolarDbReadWeightWithOptions(request, runtime);
    }

    /**
     * @param request ModifyRdsReadWeightRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyRdsReadWeightResponse
     */
    public ModifyRdsReadWeightResponse modifyRdsReadWeightWithOptions(ModifyRdsReadWeightRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceNames)) {
            query.put("InstanceNames", request.instanceNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.weights)) {
            query.put("Weights", request.weights);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyRdsReadWeight"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyRdsReadWeightResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ModifyRdsReadWeightResponse());
        }

    }

    /**
     * @param request ModifyRdsReadWeightRequest
     * @return ModifyRdsReadWeightResponse
     */
    public ModifyRdsReadWeightResponse modifyRdsReadWeight(ModifyRdsReadWeightRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyRdsReadWeightWithOptions(request, runtime);
    }

    /**
     * @param request PutStartBackupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutStartBackupResponse
     */
    public PutStartBackupResponse putStartBackupWithOptions(PutStartBackupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupDbNames)) {
            query.put("BackupDbNames", request.backupDbNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupLevel)) {
            query.put("BackupLevel", request.backupLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupMode)) {
            query.put("BackupMode", request.backupMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutStartBackup"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new PutStartBackupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new PutStartBackupResponse());
        }

    }

    /**
     * @param request PutStartBackupRequest
     * @return PutStartBackupResponse
     */
    public PutStartBackupResponse putStartBackup(PutStartBackupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putStartBackupWithOptions(request, runtime);
    }

    /**
     * @param request RefreshDrdsAtomUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefreshDrdsAtomUrlResponse
     */
    public RefreshDrdsAtomUrlResponse refreshDrdsAtomUrlWithOptions(RefreshDrdsAtomUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshDrdsAtomUrl"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshDrdsAtomUrlResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RefreshDrdsAtomUrlResponse());
        }

    }

    /**
     * @param request RefreshDrdsAtomUrlRequest
     * @return RefreshDrdsAtomUrlResponse
     */
    public RefreshDrdsAtomUrlResponse refreshDrdsAtomUrl(RefreshDrdsAtomUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshDrdsAtomUrlWithOptions(request, runtime);
    }

    /**
     * @param request ReleaseInstanceInternetAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseInstanceInternetAddressResponse
     */
    public ReleaseInstanceInternetAddressResponse releaseInstanceInternetAddressWithOptions(ReleaseInstanceInternetAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseInstanceInternetAddress"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseInstanceInternetAddressResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ReleaseInstanceInternetAddressResponse());
        }

    }

    /**
     * @param request ReleaseInstanceInternetAddressRequest
     * @return ReleaseInstanceInternetAddressResponse
     */
    public ReleaseInstanceInternetAddressResponse releaseInstanceInternetAddress(ReleaseInstanceInternetAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseInstanceInternetAddressWithOptions(request, runtime);
    }

    /**
     * @param request RemoveBackupsSetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveBackupsSetResponse
     */
    public RemoveBackupsSetResponse removeBackupsSetWithOptions(RemoveBackupsSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupId)) {
            query.put("BackupId", request.backupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveBackupsSet"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveBackupsSetResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RemoveBackupsSetResponse());
        }

    }

    /**
     * @param request RemoveBackupsSetRequest
     * @return RemoveBackupsSetResponse
     */
    public RemoveBackupsSetResponse removeBackupsSet(RemoveBackupsSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeBackupsSetWithOptions(request, runtime);
    }

    /**
     * @param request RemoveDrdsDbRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveDrdsDbResponse
     */
    public RemoveDrdsDbResponse removeDrdsDbWithOptions(RemoveDrdsDbRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveDrdsDb"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveDrdsDbResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RemoveDrdsDbResponse());
        }

    }

    /**
     * @param request RemoveDrdsDbRequest
     * @return RemoveDrdsDbResponse
     */
    public RemoveDrdsDbResponse removeDrdsDb(RemoveDrdsDbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeDrdsDbWithOptions(request, runtime);
    }

    /**
     * @param request RemoveDrdsDbFailedRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveDrdsDbFailedRecordResponse
     */
    public RemoveDrdsDbFailedRecordResponse removeDrdsDbFailedRecordWithOptions(RemoveDrdsDbFailedRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveDrdsDbFailedRecord"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveDrdsDbFailedRecordResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RemoveDrdsDbFailedRecordResponse());
        }

    }

    /**
     * @param request RemoveDrdsDbFailedRecordRequest
     * @return RemoveDrdsDbFailedRecordResponse
     */
    public RemoveDrdsDbFailedRecordResponse removeDrdsDbFailedRecord(RemoveDrdsDbFailedRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeDrdsDbFailedRecordWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>You can call this operation to release an instance that is charged based on only the pay-as-you-go billing method.</li>
     * <li>If the specifications of the instance are being changed, or one or more databases exist in the instance, you cannot call this operation to release the instance.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Releases an instance.</p>
     * 
     * @param request RemoveDrdsInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveDrdsInstanceResponse
     */
    public RemoveDrdsInstanceResponse removeDrdsInstanceWithOptions(RemoveDrdsInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveDrdsInstance"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveDrdsInstanceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RemoveDrdsInstanceResponse());
        }

    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>You can call this operation to release an instance that is charged based on only the pay-as-you-go billing method.</li>
     * <li>If the specifications of the instance are being changed, or one or more databases exist in the instance, you cannot call this operation to release the instance.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Releases an instance.</p>
     * 
     * @param request RemoveDrdsInstanceRequest
     * @return RemoveDrdsInstanceResponse
     */
    public RemoveDrdsInstanceResponse removeDrdsInstance(RemoveDrdsInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeDrdsInstanceWithOptions(request, runtime);
    }

    /**
     * @param request RemoveInstanceAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveInstanceAccountResponse
     */
    public RemoveInstanceAccountResponse removeInstanceAccountWithOptions(RemoveInstanceAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveInstanceAccount"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveInstanceAccountResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RemoveInstanceAccountResponse());
        }

    }

    /**
     * @param request RemoveInstanceAccountRequest
     * @return RemoveInstanceAccountResponse
     */
    public RemoveInstanceAccountResponse removeInstanceAccount(RemoveInstanceAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeInstanceAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a table in the recycle bin.</p>
     * 
     * @param request RemoveRecycleBinTableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveRecycleBinTableResponse
     */
    public RemoveRecycleBinTableResponse removeRecycleBinTableWithOptions(RemoveRecycleBinTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveRecycleBinTable"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveRecycleBinTableResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RemoveRecycleBinTableResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a table in the recycle bin.</p>
     * 
     * @param request RemoveRecycleBinTableRequest
     * @return RemoveRecycleBinTableResponse
     */
    public RemoveRecycleBinTableResponse removeRecycleBinTable(RemoveRecycleBinTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeRecycleBinTableWithOptions(request, runtime);
    }

    /**
     * @param request RestartDrdsInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestartDrdsInstanceResponse
     */
    public RestartDrdsInstanceResponse restartDrdsInstanceWithOptions(RestartDrdsInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartDrdsInstance"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RestartDrdsInstanceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RestartDrdsInstanceResponse());
        }

    }

    /**
     * @param request RestartDrdsInstanceRequest
     * @return RestartDrdsInstanceResponse
     */
    public RestartDrdsInstanceResponse restartDrdsInstance(RestartDrdsInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restartDrdsInstanceWithOptions(request, runtime);
    }

    /**
     * @param request RollbackInstanceVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RollbackInstanceVersionResponse
     */
    public RollbackInstanceVersionResponse rollbackInstanceVersionWithOptions(RollbackInstanceVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RollbackInstanceVersion"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RollbackInstanceVersionResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RollbackInstanceVersionResponse());
        }

    }

    /**
     * @param request RollbackInstanceVersionRequest
     * @return RollbackInstanceVersionResponse
     */
    public RollbackInstanceVersionResponse rollbackInstanceVersion(RollbackInstanceVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rollbackInstanceVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a backup policy.</p>
     * 
     * @param request SetBackupLocalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetBackupLocalResponse
     */
    public SetBackupLocalResponse setBackupLocalWithOptions(SetBackupLocalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.highSpaceUsageProtection)) {
            query.put("HighSpaceUsageProtection", request.highSpaceUsageProtection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localLogRetentionHours)) {
            query.put("LocalLogRetentionHours", request.localLogRetentionHours);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localLogRetentionSpace)) {
            query.put("LocalLogRetentionSpace", request.localLogRetentionSpace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetBackupLocal"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new SetBackupLocalResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new SetBackupLocalResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a backup policy.</p>
     * 
     * @param request SetBackupLocalRequest
     * @return SetBackupLocalResponse
     */
    public SetBackupLocalResponse setBackupLocal(SetBackupLocalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setBackupLocalWithOptions(request, runtime);
    }

    /**
     * @param request SetBackupPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetBackupPolicyResponse
     */
    public SetBackupPolicyResponse setBackupPolicyWithOptions(SetBackupPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupDbNames)) {
            query.put("BackupDbNames", request.backupDbNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupLevel)) {
            query.put("BackupLevel", request.backupLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupLog)) {
            query.put("BackupLog", request.backupLog);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupMode)) {
            query.put("BackupMode", request.backupMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataBackupRetentionPeriod)) {
            query.put("DataBackupRetentionPeriod", request.dataBackupRetentionPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logBackupRetentionPeriod)) {
            query.put("LogBackupRetentionPeriod", request.logBackupRetentionPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preferredBackupEndTime)) {
            query.put("PreferredBackupEndTime", request.preferredBackupEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preferredBackupPeriod)) {
            query.put("PreferredBackupPeriod", request.preferredBackupPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preferredBackupStartTime)) {
            query.put("PreferredBackupStartTime", request.preferredBackupStartTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetBackupPolicy"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new SetBackupPolicyResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new SetBackupPolicyResponse());
        }

    }

    /**
     * @param request SetBackupPolicyRequest
     * @return SetBackupPolicyResponse
     */
    public SetBackupPolicyResponse setBackupPolicy(SetBackupPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setBackupPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures a broadcast table for a database.</p>
     * 
     * @param request SetupBroadcastTablesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetupBroadcastTablesResponse
     */
    public SetupBroadcastTablesResponse setupBroadcastTablesWithOptions(SetupBroadcastTablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.active)) {
            query.put("Active", request.active);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetupBroadcastTables"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new SetupBroadcastTablesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new SetupBroadcastTablesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Configures a broadcast table for a database.</p>
     * 
     * @param request SetupBroadcastTablesRequest
     * @return SetupBroadcastTablesResponse
     */
    public SetupBroadcastTablesResponse setupBroadcastTables(SetupBroadcastTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setupBroadcastTablesWithOptions(request, runtime);
    }

    /**
     * @param request SetupDrdsParamsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetupDrdsParamsResponse
     */
    public SetupDrdsParamsResponse setupDrdsParamsWithOptions(SetupDrdsParamsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            query.put("Data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramLevel)) {
            query.put("ParamLevel", request.paramLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetupDrdsParams"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new SetupDrdsParamsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new SetupDrdsParamsResponse());
        }

    }

    /**
     * @param request SetupDrdsParamsRequest
     * @return SetupDrdsParamsResponse
     */
    public SetupDrdsParamsResponse setupDrdsParams(SetupDrdsParamsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setupDrdsParamsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the table recycle bin for a database.</p>
     * 
     * @param request SetupRecycleBinStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetupRecycleBinStatusResponse
     */
    public SetupRecycleBinStatusResponse setupRecycleBinStatusWithOptions(SetupRecycleBinStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusAction)) {
            query.put("StatusAction", request.statusAction);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetupRecycleBinStatus"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new SetupRecycleBinStatusResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new SetupRecycleBinStatusResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Enables the table recycle bin for a database.</p>
     * 
     * @param request SetupRecycleBinStatusRequest
     * @return SetupRecycleBinStatusResponse
     */
    public SetupRecycleBinStatusResponse setupRecycleBinStatus(SetupRecycleBinStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setupRecycleBinStatusWithOptions(request, runtime);
    }

    /**
     * @param request SetupTableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetupTableResponse
     */
    public SetupTableResponse setupTableWithOptions(SetupTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowFullTableScan)) {
            query.put("AllowFullTableScan", request.allowFullTableScan);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetupTable"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new SetupTableResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new SetupTableResponse());
        }

    }

    /**
     * @param request SetupTableRequest
     * @return SetupTableResponse
     */
    public SetupTableResponse setupTable(SetupTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setupTableWithOptions(request, runtime);
    }

    /**
     * @param request StartRestoreRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartRestoreResponse
     */
    public StartRestoreResponse startRestoreWithOptions(StartRestoreRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupDbNames)) {
            query.put("BackupDbNames", request.backupDbNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupId)) {
            query.put("BackupId", request.backupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupLevel)) {
            query.put("BackupLevel", request.backupLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupMode)) {
            query.put("BackupMode", request.backupMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preferredBackupTime)) {
            query.put("PreferredBackupTime", request.preferredBackupTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartRestore"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new StartRestoreResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new StartRestoreResponse());
        }

    }

    /**
     * @param request StartRestoreRequest
     * @return StartRestoreResponse
     */
    public StartRestoreResponse startRestore(StartRestoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startRestoreWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Submits a cleanup task for the scale-out of a PolarDB-X database.</p>
     * 
     * @param request SubmitCleanTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitCleanTaskResponse
     */
    public SubmitCleanTaskResponse submitCleanTaskWithOptions(SubmitCleanTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expandType)) {
            query.put("ExpandType", request.expandType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentJobId)) {
            query.put("ParentJobId", request.parentJobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitCleanTask"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitCleanTaskResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new SubmitCleanTaskResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Submits a cleanup task for the scale-out of a PolarDB-X database.</p>
     * 
     * @param request SubmitCleanTaskRequest
     * @return SubmitCleanTaskResponse
     */
    public SubmitCleanTaskResponse submitCleanTask(SubmitCleanTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitCleanTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Submits a precheck task for the hot-spot scale-out of a PolarDB-X database. The task is used to check the table that does not contain the primary key.</p>
     * 
     * @param request SubmitHotExpandPreCheckTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitHotExpandPreCheckTaskResponse
     */
    public SubmitHotExpandPreCheckTaskResponse submitHotExpandPreCheckTaskWithOptions(SubmitHotExpandPreCheckTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbInstType)) {
            query.put("DbInstType", request.dbInstType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableList)) {
            query.put("TableList", request.tableList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitHotExpandPreCheckTask"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitHotExpandPreCheckTaskResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new SubmitHotExpandPreCheckTaskResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Submits a precheck task for the hot-spot scale-out of a PolarDB-X database. The task is used to check the table that does not contain the primary key.</p>
     * 
     * @param request SubmitHotExpandPreCheckTaskRequest
     * @return SubmitHotExpandPreCheckTaskResponse
     */
    public SubmitHotExpandPreCheckTaskResponse submitHotExpandPreCheckTask(SubmitHotExpandPreCheckTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitHotExpandPreCheckTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Submits a hot-spot scale-out task for a database.</p>
     * 
     * @param request SubmitHotExpandTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitHotExpandTaskResponse
     */
    public SubmitHotExpandTaskResponse submitHotExpandTaskWithOptions(SubmitHotExpandTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendedMapping)) {
            query.put("ExtendedMapping", request.extendedMapping);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceDbMapping)) {
            query.put("InstanceDbMapping", request.instanceDbMapping);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mapping)) {
            query.put("Mapping", request.mapping);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supperAccountMapping)) {
            query.put("SupperAccountMapping", request.supperAccountMapping);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskDesc)) {
            query.put("TaskDesc", request.taskDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitHotExpandTask"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitHotExpandTaskResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new SubmitHotExpandTaskResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Submits a hot-spot scale-out task for a database.</p>
     * 
     * @param request SubmitHotExpandTaskRequest
     * @return SubmitHotExpandTaskResponse
     */
    public SubmitHotExpandTaskResponse submitHotExpandTask(SubmitHotExpandTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitHotExpandTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Submits a precheck task for the smooth scale-out of a PolarDB-X database.</p>
     * 
     * @param request SubmitSmoothExpandPreCheckRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitSmoothExpandPreCheckResponse
     */
    public SubmitSmoothExpandPreCheckResponse submitSmoothExpandPreCheckWithOptions(SubmitSmoothExpandPreCheckRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbInstType)) {
            query.put("DbInstType", request.dbInstType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitSmoothExpandPreCheck"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitSmoothExpandPreCheckResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new SubmitSmoothExpandPreCheckResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Submits a precheck task for the smooth scale-out of a PolarDB-X database.</p>
     * 
     * @param request SubmitSmoothExpandPreCheckRequest
     * @return SubmitSmoothExpandPreCheckResponse
     */
    public SubmitSmoothExpandPreCheckResponse submitSmoothExpandPreCheck(SubmitSmoothExpandPreCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitSmoothExpandPreCheckWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Submits a precheck task for the smooth scale-out of a PolarDB-X 1.0 database.</p>
     * 
     * @param request SubmitSmoothExpandPreCheckTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitSmoothExpandPreCheckTaskResponse
     */
    public SubmitSmoothExpandPreCheckTaskResponse submitSmoothExpandPreCheckTaskWithOptions(SubmitSmoothExpandPreCheckTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitSmoothExpandPreCheckTask"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitSmoothExpandPreCheckTaskResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new SubmitSmoothExpandPreCheckTaskResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Submits a precheck task for the smooth scale-out of a PolarDB-X 1.0 database.</p>
     * 
     * @param request SubmitSmoothExpandPreCheckTaskRequest
     * @return SubmitSmoothExpandPreCheckTaskResponse
     */
    public SubmitSmoothExpandPreCheckTaskResponse submitSmoothExpandPreCheckTask(SubmitSmoothExpandPreCheckTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitSmoothExpandPreCheckTaskWithOptions(request, runtime);
    }

    /**
     * @param request SubmitSqlFlashbackTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitSqlFlashbackTaskResponse
     */
    public SubmitSqlFlashbackTaskResponse submitSqlFlashbackTaskWithOptions(SubmitSqlFlashbackTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recallRestoreType)) {
            query.put("RecallRestoreType", request.recallRestoreType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recallType)) {
            query.put("RecallType", request.recallType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlPk)) {
            query.put("SqlPk", request.sqlPk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlType)) {
            query.put("SqlType", request.sqlType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceId)) {
            query.put("TraceId", request.traceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitSqlFlashbackTask"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitSqlFlashbackTaskResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new SubmitSqlFlashbackTaskResponse());
        }

    }

    /**
     * @param request SubmitSqlFlashbackTaskRequest
     * @return SubmitSqlFlashbackTaskResponse
     */
    public SubmitSqlFlashbackTaskResponse submitSqlFlashbackTask(SubmitSqlFlashbackTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitSqlFlashbackTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Switches the mode of broadcast tables from the multi-write mode to the asynchronous link mode.</p>
     * 
     * @param request SwitchGlobalBroadcastTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SwitchGlobalBroadcastTypeResponse
     */
    public SwitchGlobalBroadcastTypeResponse switchGlobalBroadcastTypeWithOptions(SwitchGlobalBroadcastTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SwitchGlobalBroadcastType"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new SwitchGlobalBroadcastTypeResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new SwitchGlobalBroadcastTypeResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Switches the mode of broadcast tables from the multi-write mode to the asynchronous link mode.</p>
     * 
     * @param request SwitchGlobalBroadcastTypeRequest
     * @return SwitchGlobalBroadcastTypeResponse
     */
    public SwitchGlobalBroadcastTypeResponse switchGlobalBroadcastType(SwitchGlobalBroadcastTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.switchGlobalBroadcastTypeWithOptions(request, runtime);
    }

    /**
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new TagResourcesResponse());
        }

    }

    /**
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * @param request UntagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("TagKey", request.tagKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UntagResourcesResponse());
        }

    }

    /**
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the network type of a PolarDB-X 1.0 instance.</p>
     * 
     * @param request UpdateInstanceNetworkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInstanceNetworkResponse
     */
    public UpdateInstanceNetworkResponse updateInstanceNetworkWithOptions(UpdateInstanceNetworkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.classicExpiredDays)) {
            query.put("ClassicExpiredDays", request.classicExpiredDays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retainClassic)) {
            query.put("RetainClassic", request.retainClassic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcInstanceNetworkType)) {
            query.put("SrcInstanceNetworkType", request.srcInstanceNetworkType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstanceNetwork"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceNetworkResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateInstanceNetworkResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Changes the network type of a PolarDB-X 1.0 instance.</p>
     * 
     * @param request UpdateInstanceNetworkRequest
     * @return UpdateInstanceNetworkResponse
     */
    public UpdateInstanceNetworkResponse updateInstanceNetwork(UpdateInstanceNetworkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateInstanceNetworkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the specifications of a custom ApsaraDB RDS instance at the storage layer.</p>
     * 
     * @param request UpdatePrivateRdsClassRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePrivateRdsClassResponse
     */
    public UpdatePrivateRdsClassResponse updatePrivateRdsClassWithOptions(UpdatePrivateRdsClassRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoUseCoupon)) {
            query.put("AutoUseCoupon", request.autoUseCoupon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prePayDuration)) {
            query.put("PrePayDuration", request.prePayDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rdsClass)) {
            query.put("RdsClass", request.rdsClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storage)) {
            query.put("Storage", request.storage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePrivateRdsClass"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePrivateRdsClassResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdatePrivateRdsClassResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Updates the specifications of a custom ApsaraDB RDS instance at the storage layer.</p>
     * 
     * @param request UpdatePrivateRdsClassRequest
     * @return UpdatePrivateRdsClassResponse
     */
    public UpdatePrivateRdsClassResponse updatePrivateRdsClass(UpdatePrivateRdsClassRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePrivateRdsClassWithOptions(request, runtime);
    }

    /**
     * @param request UpdateResourceGroupAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateResourceGroupAttributeResponse
     */
    public UpdateResourceGroupAttributeResponse updateResourceGroupAttributeWithOptions(UpdateResourceGroupAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newResourceGroupId)) {
            query.put("NewResourceGroupId", request.newResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateResourceGroupAttribute"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateResourceGroupAttributeResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateResourceGroupAttributeResponse());
        }

    }

    /**
     * @param request UpdateResourceGroupAttributeRequest
     * @return UpdateResourceGroupAttributeResponse
     */
    public UpdateResourceGroupAttributeResponse updateResourceGroupAttribute(UpdateResourceGroupAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateResourceGroupAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Upgrades the version of a column-oriented storage instance of a PolarDB-X 1.0 instance.</p>
     * 
     * @param request UpgradeHiStoreInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeHiStoreInstanceResponse
     */
    public UpgradeHiStoreInstanceResponse upgradeHiStoreInstanceWithOptions(UpgradeHiStoreInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.historeInstanceId)) {
            query.put("HistoreInstanceId", request.historeInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeHiStoreInstance"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeHiStoreInstanceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpgradeHiStoreInstanceResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Upgrades the version of a column-oriented storage instance of a PolarDB-X 1.0 instance.</p>
     * 
     * @param request UpgradeHiStoreInstanceRequest
     * @return UpgradeHiStoreInstanceResponse
     */
    public UpgradeHiStoreInstanceResponse upgradeHiStoreInstance(UpgradeHiStoreInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeHiStoreInstanceWithOptions(request, runtime);
    }

    /**
     * @param request UpgradeInstanceVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeInstanceVersionResponse
     */
    public UpgradeInstanceVersionResponse upgradeInstanceVersionWithOptions(UpgradeInstanceVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rpm)) {
            query.put("Rpm", request.rpm);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeInstanceVersion"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeInstanceVersionResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpgradeInstanceVersionResponse());
        }

    }

    /**
     * @param request UpgradeInstanceVersionRequest
     * @return UpgradeInstanceVersionResponse
     */
    public UpgradeInstanceVersionResponse upgradeInstanceVersion(UpgradeInstanceVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeInstanceVersionWithOptions(request, runtime);
    }

    /**
     * @param request ValidateShardTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ValidateShardTaskResponse
     */
    public ValidateShardTaskResponse validateShardTaskWithOptions(ValidateShardTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drdsInstanceId)) {
            query.put("DrdsInstanceId", request.drdsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceTableName)) {
            query.put("SourceTableName", request.sourceTableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetTableName)) {
            query.put("TargetTableName", request.targetTableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ValidateShardTask"),
            new TeaPair("version", "2019-01-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ValidateShardTaskResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ValidateShardTaskResponse());
        }

    }

    /**
     * @param request ValidateShardTaskRequest
     * @return ValidateShardTaskResponse
     */
    public ValidateShardTaskResponse validateShardTask(ValidateShardTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.validateShardTaskWithOptions(request, runtime);
    }
}
