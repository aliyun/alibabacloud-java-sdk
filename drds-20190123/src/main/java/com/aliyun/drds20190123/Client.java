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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeAccountPasswordResponse());
    }

    public ChangeAccountPasswordResponse changeAccountPassword(ChangeAccountPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeAccountPasswordWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeInstanceAzoneResponse());
    }

    public ChangeInstanceAzoneResponse changeInstanceAzone(ChangeInstanceAzoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeInstanceAzoneWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckDrdsDbNameResponse());
    }

    public CheckDrdsDbNameResponse checkDrdsDbName(CheckDrdsDbNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkDrdsDbNameWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckExpandStatusResponse());
    }

    public CheckExpandStatusResponse checkExpandStatus(CheckExpandStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkExpandStatusWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckSqlAuditEnableStatusResponse());
    }

    public CheckSqlAuditEnableStatusResponse checkSqlAuditEnableStatus(CheckSqlAuditEnableStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkSqlAuditEnableStatusWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDrdsDBResponse());
    }

    public CreateDrdsDBResponse createDrdsDB(CreateDrdsDBRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDrdsDBWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDrdsInstanceResponse());
    }

    public CreateDrdsInstanceResponse createDrdsInstance(CreateDrdsInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDrdsInstanceWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceAccountResponse());
    }

    public CreateInstanceAccountResponse createInstanceAccount(CreateInstanceAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstanceAccountWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceInternetAddressResponse());
    }

    public CreateInstanceInternetAddressResponse createInstanceInternetAddress(CreateInstanceInternetAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstanceInternetAddressWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, make sure that you understand the billing methods and pricing of PolarDB-X 1.0. For more information, visit the [pricing page](https://www.aliyun.com/price/product#/rds/detail).
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOrderForRdsResponse());
    }

    /**
      * Before you call this operation, make sure that you understand the billing methods and pricing of PolarDB-X 1.0. For more information, visit the [pricing page](https://www.aliyun.com/price/product#/rds/detail).
      *
      * @param request CreateOrderForRdsRequest
      * @return CreateOrderForRdsResponse
     */
    public CreateOrderForRdsResponse createOrderForRds(CreateOrderForRdsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOrderForRdsWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateShardTaskResponse());
    }

    public CreateShardTaskResponse createShardTask(CreateShardTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createShardTaskWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackMenuResponse());
    }

    public DescribeBackMenuResponse describeBackMenu(DescribeBackMenuRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackMenuWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackupDbsResponse());
    }

    public DescribeBackupDbsResponse describeBackupDbs(DescribeBackupDbsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupDbsWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackupLocalResponse());
    }

    public DescribeBackupLocalResponse describeBackupLocal(DescribeBackupLocalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupLocalWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackupPolicyResponse());
    }

    public DescribeBackupPolicyResponse describeBackupPolicy(DescribeBackupPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupPolicyWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackupSetsResponse());
    }

    public DescribeBackupSetsResponse describeBackupSets(DescribeBackupSetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupSetsWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackupTimesResponse());
    }

    public DescribeBackupTimesResponse describeBackupTimes(DescribeBackupTimesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupTimesWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBroadcastTablesResponse());
    }

    public DescribeBroadcastTablesResponse describeBroadcastTables(DescribeBroadcastTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBroadcastTablesWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDbInstanceDbsResponse());
    }

    public DescribeDbInstanceDbsResponse describeDbInstanceDbs(DescribeDbInstanceDbsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDbInstanceDbsWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDbInstancesResponse());
    }

    public DescribeDbInstancesResponse describeDbInstances(DescribeDbInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDbInstancesWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrdsDBResponse());
    }

    public DescribeDrdsDBResponse describeDrdsDB(DescribeDrdsDBRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsDBWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrdsDBClusterResponse());
    }

    public DescribeDrdsDBClusterResponse describeDrdsDBCluster(DescribeDrdsDBClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsDBClusterWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrdsDBIpWhiteListResponse());
    }

    public DescribeDrdsDBIpWhiteListResponse describeDrdsDBIpWhiteList(DescribeDrdsDBIpWhiteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsDBIpWhiteListWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrdsDBsResponse());
    }

    public DescribeDrdsDBsResponse describeDrdsDBs(DescribeDrdsDBsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsDBsWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrdsDbInstanceResponse());
    }

    public DescribeDrdsDbInstanceResponse describeDrdsDbInstance(DescribeDrdsDbInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsDbInstanceWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrdsDbInstancesResponse());
    }

    public DescribeDrdsDbInstancesResponse describeDrdsDbInstances(DescribeDrdsDbInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsDbInstancesWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrdsDbRdsNameListResponse());
    }

    public DescribeDrdsDbRdsNameListResponse describeDrdsDbRdsNameList(DescribeDrdsDbRdsNameListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsDbRdsNameListWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrdsInstanceResponse());
    }

    public DescribeDrdsInstanceResponse describeDrdsInstance(DescribeDrdsInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsInstanceWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrdsInstanceDbMonitorResponse());
    }

    public DescribeDrdsInstanceDbMonitorResponse describeDrdsInstanceDbMonitor(DescribeDrdsInstanceDbMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsInstanceDbMonitorWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrdsInstanceLevelTasksResponse());
    }

    public DescribeDrdsInstanceLevelTasksResponse describeDrdsInstanceLevelTasks(DescribeDrdsInstanceLevelTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsInstanceLevelTasksWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrdsInstanceMonitorResponse());
    }

    public DescribeDrdsInstanceMonitorResponse describeDrdsInstanceMonitor(DescribeDrdsInstanceMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsInstanceMonitorWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrdsInstanceVersionResponse());
    }

    public DescribeDrdsInstanceVersionResponse describeDrdsInstanceVersion(DescribeDrdsInstanceVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsInstanceVersionWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrdsInstancesResponse());
    }

    public DescribeDrdsInstancesResponse describeDrdsInstances(DescribeDrdsInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsInstancesWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrdsParamsResponse());
    }

    public DescribeDrdsParamsResponse describeDrdsParams(DescribeDrdsParamsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsParamsWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrdsRdsInstancesResponse());
    }

    public DescribeDrdsRdsInstancesResponse describeDrdsRdsInstances(DescribeDrdsRdsInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsRdsInstancesWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrdsShardingDbsResponse());
    }

    public DescribeDrdsShardingDbsResponse describeDrdsShardingDbs(DescribeDrdsShardingDbsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsShardingDbsWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrdsSlowSqlsResponse());
    }

    public DescribeDrdsSlowSqlsResponse describeDrdsSlowSqls(DescribeDrdsSlowSqlsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsSlowSqlsWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrdsSqlAuditStatusResponse());
    }

    public DescribeDrdsSqlAuditStatusResponse describeDrdsSqlAuditStatus(DescribeDrdsSqlAuditStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsSqlAuditStatusWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDrdsTasksResponse());
    }

    public DescribeDrdsTasksResponse describeDrdsTasks(DescribeDrdsTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsTasksWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExpandLogicTableInfoListResponse());
    }

    public DescribeExpandLogicTableInfoListResponse describeExpandLogicTableInfoList(DescribeExpandLogicTableInfoListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExpandLogicTableInfoListWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHotDbListResponse());
    }

    public DescribeHotDbListResponse describeHotDbList(DescribeHotDbListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHotDbListWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstDbLogInfoResponse());
    }

    public DescribeInstDbLogInfoResponse describeInstDbLogInfo(DescribeInstDbLogInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstDbLogInfoWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstDbSlsInfoResponse());
    }

    public DescribeInstDbSlsInfoResponse describeInstDbSlsInfo(DescribeInstDbSlsInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstDbSlsInfoWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceAccountsResponse());
    }

    public DescribeInstanceAccountsResponse describeInstanceAccounts(DescribeInstanceAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceAccountsWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceSwitchAzoneResponse());
    }

    public DescribeInstanceSwitchAzoneResponse describeInstanceSwitchAzone(DescribeInstanceSwitchAzoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceSwitchAzoneWithOptions(request, runtime);
    }

    /**
      * ****
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceSwitchNetworkResponse());
    }

    /**
      * ****
      *
      * @param request DescribeInstanceSwitchNetworkRequest
      * @return DescribeInstanceSwitchNetworkResponse
     */
    public DescribeInstanceSwitchNetworkResponse describeInstanceSwitchNetwork(DescribeInstanceSwitchNetworkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceSwitchNetworkWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePreCheckResultResponse());
    }

    public DescribePreCheckResultResponse describePreCheckResult(DescribePreCheckResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePreCheckResultWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRDSPerformanceResponse());
    }

    public DescribeRDSPerformanceResponse describeRDSPerformance(DescribeRDSPerformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRDSPerformanceWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRdsCommodityResponse());
    }

    public DescribeRdsCommodityResponse describeRdsCommodity(DescribeRdsCommodityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRdsCommodityWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRdsPerformanceSummaryResponse());
    }

    public DescribeRdsPerformanceSummaryResponse describeRdsPerformanceSummary(DescribeRdsPerformanceSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRdsPerformanceSummaryWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRdsSuperAccountInstancesResponse());
    }

    public DescribeRdsSuperAccountInstancesResponse describeRdsSuperAccountInstances(DescribeRdsSuperAccountInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRdsSuperAccountInstancesWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRecycleBinStatusResponse());
    }

    public DescribeRecycleBinStatusResponse describeRecycleBinStatus(DescribeRecycleBinStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRecycleBinStatusWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRecycleBinTablesResponse());
    }

    public DescribeRecycleBinTablesResponse describeRecycleBinTables(DescribeRecycleBinTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRecycleBinTablesWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRestoreOrderResponse());
    }

    public DescribeRestoreOrderResponse describeRestoreOrder(DescribeRestoreOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRestoreOrderWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeShardTaskInfoResponse());
    }

    public DescribeShardTaskInfoResponse describeShardTaskInfo(DescribeShardTaskInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeShardTaskInfoWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSqlFlashbakTaskResponse());
    }

    public DescribeSqlFlashbakTaskResponse describeSqlFlashbakTask(DescribeSqlFlashbakTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSqlFlashbakTaskWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTableResponse());
    }

    public DescribeTableResponse describeTable(DescribeTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTableWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTableListByTypeResponse());
    }

    public DescribeTableListByTypeResponse describeTableListByType(DescribeTableListByTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTableListByTypeWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTablesResponse());
    }

    public DescribeTablesResponse describeTables(DescribeTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTablesWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableSqlAuditResponse());
    }

    public DisableSqlAuditResponse disableSqlAudit(DisableSqlAuditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableSqlAuditWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableInstanceIpv6AddressResponse());
    }

    public EnableInstanceIpv6AddressResponse enableInstanceIpv6Address(EnableInstanceIpv6AddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableInstanceIpv6AddressWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableSqlAuditResponse());
    }

    public EnableSqlAuditResponse enableSqlAudit(EnableSqlAuditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableSqlAuditWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableSqlFlashbackMatchSwitchResponse());
    }

    public EnableSqlFlashbackMatchSwitchResponse enableSqlFlashbackMatchSwitch(EnableSqlFlashbackMatchSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableSqlFlashbackMatchSwitchWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlashbackRecycleBinTableResponse());
    }

    public FlashbackRecycleBinTableResponse flashbackRecycleBinTable(FlashbackRecycleBinTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.flashbackRecycleBinTableWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDrdsDbRdsRelationInfoResponse());
    }

    public GetDrdsDbRdsRelationInfoResponse getDrdsDbRdsRelationInfo(GetDrdsDbRdsRelationInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDrdsDbRdsRelationInfoWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ManagePrivateRdsResponse());
    }

    public ManagePrivateRdsResponse managePrivateRds(ManagePrivateRdsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.managePrivateRdsWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAccountDescriptionResponse());
    }

    public ModifyAccountDescriptionResponse modifyAccountDescription(ModifyAccountDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAccountDescriptionWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAccountPrivilegeResponse());
    }

    public ModifyAccountPrivilegeResponse modifyAccountPrivilege(ModifyAccountPrivilegeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAccountPrivilegeWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDrdsInstanceDescriptionResponse());
    }

    public ModifyDrdsInstanceDescriptionResponse modifyDrdsInstanceDescription(ModifyDrdsInstanceDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDrdsInstanceDescriptionWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDrdsIpWhiteListResponse());
    }

    public ModifyDrdsIpWhiteListResponse modifyDrdsIpWhiteList(ModifyDrdsIpWhiteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDrdsIpWhiteListWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPolarDbReadWeightResponse());
    }

    public ModifyPolarDbReadWeightResponse modifyPolarDbReadWeight(ModifyPolarDbReadWeightRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyPolarDbReadWeightWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyRdsReadWeightResponse());
    }

    public ModifyRdsReadWeightResponse modifyRdsReadWeight(ModifyRdsReadWeightRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyRdsReadWeightWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutStartBackupResponse());
    }

    public PutStartBackupResponse putStartBackup(PutStartBackupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putStartBackupWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshDrdsAtomUrlResponse());
    }

    public RefreshDrdsAtomUrlResponse refreshDrdsAtomUrl(RefreshDrdsAtomUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshDrdsAtomUrlWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseInstanceInternetAddressResponse());
    }

    public ReleaseInstanceInternetAddressResponse releaseInstanceInternetAddress(ReleaseInstanceInternetAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseInstanceInternetAddressWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveBackupsSetResponse());
    }

    public RemoveBackupsSetResponse removeBackupsSet(RemoveBackupsSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeBackupsSetWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveDrdsDbResponse());
    }

    public RemoveDrdsDbResponse removeDrdsDb(RemoveDrdsDbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeDrdsDbWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveDrdsDbFailedRecordResponse());
    }

    public RemoveDrdsDbFailedRecordResponse removeDrdsDbFailedRecord(RemoveDrdsDbFailedRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeDrdsDbFailedRecordWithOptions(request, runtime);
    }

    /**
      * > *   You can call this operation to release an instance that is charged based on only the pay-as-you-go billing method.
      * >*   If the specifications of the instance are being changed, or one or more databases exist in the instance, you cannot call this operation to release the instance.
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveDrdsInstanceResponse());
    }

    /**
      * > *   You can call this operation to release an instance that is charged based on only the pay-as-you-go billing method.
      * >*   If the specifications of the instance are being changed, or one or more databases exist in the instance, you cannot call this operation to release the instance.
      *
      * @param request RemoveDrdsInstanceRequest
      * @return RemoveDrdsInstanceResponse
     */
    public RemoveDrdsInstanceResponse removeDrdsInstance(RemoveDrdsInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeDrdsInstanceWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveInstanceAccountResponse());
    }

    public RemoveInstanceAccountResponse removeInstanceAccount(RemoveInstanceAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeInstanceAccountWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveRecycleBinTableResponse());
    }

    public RemoveRecycleBinTableResponse removeRecycleBinTable(RemoveRecycleBinTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeRecycleBinTableWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartDrdsInstanceResponse());
    }

    public RestartDrdsInstanceResponse restartDrdsInstance(RestartDrdsInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restartDrdsInstanceWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new RollbackInstanceVersionResponse());
    }

    public RollbackInstanceVersionResponse rollbackInstanceVersion(RollbackInstanceVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rollbackInstanceVersionWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetBackupLocalResponse());
    }

    public SetBackupLocalResponse setBackupLocal(SetBackupLocalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setBackupLocalWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetBackupPolicyResponse());
    }

    public SetBackupPolicyResponse setBackupPolicy(SetBackupPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setBackupPolicyWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetupBroadcastTablesResponse());
    }

    public SetupBroadcastTablesResponse setupBroadcastTables(SetupBroadcastTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setupBroadcastTablesWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetupDrdsParamsResponse());
    }

    public SetupDrdsParamsResponse setupDrdsParams(SetupDrdsParamsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setupDrdsParamsWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetupRecycleBinStatusResponse());
    }

    public SetupRecycleBinStatusResponse setupRecycleBinStatus(SetupRecycleBinStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setupRecycleBinStatusWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetupTableResponse());
    }

    public SetupTableResponse setupTable(SetupTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setupTableWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartRestoreResponse());
    }

    public StartRestoreResponse startRestore(StartRestoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startRestoreWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitCleanTaskResponse());
    }

    public SubmitCleanTaskResponse submitCleanTask(SubmitCleanTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitCleanTaskWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitHotExpandPreCheckTaskResponse());
    }

    public SubmitHotExpandPreCheckTaskResponse submitHotExpandPreCheckTask(SubmitHotExpandPreCheckTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitHotExpandPreCheckTaskWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitHotExpandTaskResponse());
    }

    public SubmitHotExpandTaskResponse submitHotExpandTask(SubmitHotExpandTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitHotExpandTaskWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitSmoothExpandPreCheckResponse());
    }

    public SubmitSmoothExpandPreCheckResponse submitSmoothExpandPreCheck(SubmitSmoothExpandPreCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitSmoothExpandPreCheckWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitSmoothExpandPreCheckTaskResponse());
    }

    public SubmitSmoothExpandPreCheckTaskResponse submitSmoothExpandPreCheckTask(SubmitSmoothExpandPreCheckTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitSmoothExpandPreCheckTaskWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitSqlFlashbackTaskResponse());
    }

    public SubmitSqlFlashbackTaskResponse submitSqlFlashbackTask(SubmitSqlFlashbackTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitSqlFlashbackTaskWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new SwitchGlobalBroadcastTypeResponse());
    }

    public SwitchGlobalBroadcastTypeResponse switchGlobalBroadcastType(SwitchGlobalBroadcastTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.switchGlobalBroadcastTypeWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceNetworkResponse());
    }

    public UpdateInstanceNetworkResponse updateInstanceNetwork(UpdateInstanceNetworkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateInstanceNetworkWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePrivateRdsClassResponse());
    }

    public UpdatePrivateRdsClassResponse updatePrivateRdsClass(UpdatePrivateRdsClassRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePrivateRdsClassWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateResourceGroupAttributeResponse());
    }

    public UpdateResourceGroupAttributeResponse updateResourceGroupAttribute(UpdateResourceGroupAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateResourceGroupAttributeWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeHiStoreInstanceResponse());
    }

    public UpgradeHiStoreInstanceResponse upgradeHiStoreInstance(UpgradeHiStoreInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeHiStoreInstanceWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeInstanceVersionResponse());
    }

    public UpgradeInstanceVersionResponse upgradeInstanceVersion(UpgradeInstanceVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeInstanceVersionWithOptions(request, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidateShardTaskResponse());
    }

    public ValidateShardTaskResponse validateShardTask(ValidateShardTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.validateShardTaskWithOptions(request, runtime);
    }
}
