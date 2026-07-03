// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616;

import com.aliyun.tea.*;
import com.aliyun.cloud_siem20220616.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-shanghai", "cloud-siem.cn-shanghai.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "cloud-siem.ap-southeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cloud-siem", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <b>summary</b> : 
     * <p>Adds a data source to an attached multicloud account.</p>
     * 
     * @param request AddDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddDataSourceResponse
     */
    public AddDataSourceResponse addDataSourceWithOptions(AddDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            body.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudCode)) {
            body.put("CloudCode", request.cloudCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceInstanceName)) {
            body.put("DataSourceInstanceName", request.dataSourceInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceInstanceParams)) {
            body.put("DataSourceInstanceParams", request.dataSourceInstanceParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceInstanceRemark)) {
            body.put("DataSourceInstanceRemark", request.dataSourceInstanceRemark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            body.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDataSource"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDataSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a data source to an attached multicloud account.</p>
     * 
     * @param request AddDataSourceRequest
     * @return AddDataSourceResponse
     */
    public AddDataSourceResponse addDataSource(AddDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a log for a data source.</p>
     * 
     * @param request AddDataSourceLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddDataSourceLogResponse
     */
    public AddDataSourceLogResponse addDataSourceLogWithOptions(AddDataSourceLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            body.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudCode)) {
            body.put("CloudCode", request.cloudCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceInstanceId)) {
            body.put("DataSourceInstanceId", request.dataSourceInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceInstanceLogs)) {
            body.put("DataSourceInstanceLogs", request.dataSourceInstanceLogs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logCode)) {
            body.put("LogCode", request.logCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDataSourceLog"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDataSourceLogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a log for a data source.</p>
     * 
     * @param request AddDataSourceLogRequest
     * @return AddDataSourceLogResponse
     */
    public AddDataSourceLogResponse addDataSourceLog(AddDataSourceLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDataSourceLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a log collection task to import log data into Threat Analysis for alerting and event analysis.</p>
     * 
     * @param request AddUserSourceLogConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddUserSourceLogConfigResponse
     */
    public AddUserSourceLogConfigResponse addUserSourceLogConfigWithOptions(AddUserSourceLogConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deleted)) {
            body.put("Deleted", request.deleted);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disPlayLine)) {
            body.put("DisPlayLine", request.disPlayLine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceLogCode)) {
            body.put("SourceLogCode", request.sourceLogCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceLogInfo)) {
            body.put("SourceLogInfo", request.sourceLogInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceProdCode)) {
            body.put("SourceProdCode", request.sourceProdCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            body.put("SubUserId", request.subUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddUserSourceLogConfig"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddUserSourceLogConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a log collection task to import log data into Threat Analysis for alerting and event analysis.</p>
     * 
     * @param request AddUserSourceLogConfigRequest
     * @return AddUserSourceLogConfigResponse
     */
    public AddUserSourceLogConfigResponse addUserSourceLogConfig(AddUserSourceLogConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addUserSourceLogConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Binds a multicloud account from Multicloud Assets of Security Center to Threat Analysis.</p>
     * 
     * @param request BindAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindAccountResponse
     */
    public BindAccountResponse bindAccountWithOptions(BindAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessId)) {
            body.put("AccessId", request.accessId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            body.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudCode)) {
            body.put("CloudCode", request.cloudCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindAccount"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Binds a multicloud account from Multicloud Assets of Security Center to Threat Analysis.</p>
     * 
     * @param request BindAccountRequest
     * @return BindAccountResponse
     */
    public BindAccountResponse bindAccount(BindAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops log delivery from a connected cloud service. Once stopped, no new logs are added to your Logstore.</p>
     * 
     * @param request CloseDeliveryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloseDeliveryResponse
     */
    public CloseDeliveryResponse closeDeliveryWithOptions(CloseDeliveryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logCode)) {
            body.put("LogCode", request.logCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloseDelivery"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloseDeliveryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Stops log delivery from a connected cloud service. Once stopped, no new logs are added to your Logstore.</p>
     * 
     * @param request CloseDeliveryRequest
     * @return CloseDeliveryResponse
     */
    public CloseDeliveryResponse closeDelivery(CloseDeliveryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.closeDeliveryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an automated response rule by its ID.</p>
     * 
     * @param request DeleteAutomateResponseConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAutomateResponseConfigResponse
     */
    public DeleteAutomateResponseConfigResponse deleteAutomateResponseConfigWithOptions(DeleteAutomateResponseConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAutomateResponseConfig"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAutomateResponseConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an automated response rule by its ID.</p>
     * 
     * @param request DeleteAutomateResponseConfigRequest
     * @return DeleteAutomateResponseConfigResponse
     */
    public DeleteAutomateResponseConfigResponse deleteAutomateResponseConfig(DeleteAutomateResponseConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAutomateResponseConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Detaches the AccessKey of a multicloud account, such as a Tencent Cloud or Huawei Cloud account, from a threat analysis data source. You can then attach a new account.</p>
     * 
     * @param request DeleteBindAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteBindAccountResponse
     */
    public DeleteBindAccountResponse deleteBindAccountWithOptions(DeleteBindAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessId)) {
            body.put("AccessId", request.accessId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            body.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bindId)) {
            body.put("BindId", request.bindId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudCode)) {
            body.put("CloudCode", request.cloudCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBindAccount"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBindAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Detaches the AccessKey of a multicloud account, such as a Tencent Cloud or Huawei Cloud account, from a threat analysis data source. You can then attach a new account.</p>
     * 
     * @param request DeleteBindAccountRequest
     * @return DeleteBindAccountResponse
     */
    public DeleteBindAccountResponse deleteBindAccount(DeleteBindAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBindAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can customize rules for a specific ID.</p>
     * 
     * @param request DeleteCustomizeRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCustomizeRuleResponse
     */
    public DeleteCustomizeRuleResponse deleteCustomizeRuleWithOptions(DeleteCustomizeRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            body.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustomizeRule"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustomizeRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can customize rules for a specific ID.</p>
     * 
     * @param request DeleteCustomizeRuleRequest
     * @return DeleteCustomizeRuleResponse
     */
    public DeleteCustomizeRuleResponse deleteCustomizeRule(DeleteCustomizeRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomizeRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Call this operation to delete a data source that is no longer required.</p>
     * 
     * @param request DeleteDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataSourceResponse
     */
    public DeleteDataSourceResponse deleteDataSourceWithOptions(DeleteDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            body.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudCode)) {
            body.put("CloudCode", request.cloudCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceInstanceId)) {
            body.put("DataSourceInstanceId", request.dataSourceInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataSource"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Call this operation to delete a data source that is no longer required.</p>
     * 
     * @param request DeleteDataSourceRequest
     * @return DeleteDataSourceResponse
     */
    public DeleteDataSourceResponse deleteDataSource(DeleteDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes a log.</p>
     * 
     * @param request DeleteDataSourceLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataSourceLogResponse
     */
    public DeleteDataSourceLogResponse deleteDataSourceLogWithOptions(DeleteDataSourceLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            body.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudCode)) {
            body.put("CloudCode", request.cloudCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceInstanceId)) {
            body.put("DataSourceInstanceId", request.dataSourceInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logInstanceId)) {
            body.put("LogInstanceId", request.logInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataSourceLog"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataSourceLogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes a log.</p>
     * 
     * @param request DeleteDataSourceLogRequest
     * @return DeleteDataSourceLogResponse
     */
    public DeleteDataSourceLogResponse deleteDataSourceLog(DeleteDataSourceLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataSourceLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an alert whitelist rule with the specified ID.</p>
     * 
     * @param request DeleteWhiteRuleListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWhiteRuleListResponse
     */
    public DeleteWhiteRuleListResponse deleteWhiteRuleListWithOptions(DeleteWhiteRuleListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWhiteRuleList"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWhiteRuleListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an alert whitelist rule with the specified ID.</p>
     * 
     * @param request DeleteWhiteRuleListRequest
     * @return DeleteWhiteRuleListResponse
     */
    public DeleteWhiteRuleListResponse deleteWhiteRuleList(DeleteWhiteRuleListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWhiteRuleListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Describes the aggregate functions that are supported by custom rules.</p>
     * 
     * @param request DescribeAggregateFunctionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAggregateFunctionResponse
     */
    public DescribeAggregateFunctionResponse describeAggregateFunctionWithOptions(DescribeAggregateFunctionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAggregateFunction"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAggregateFunctionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Describes the aggregate functions that are supported by custom rules.</p>
     * 
     * @param request DescribeAggregateFunctionRequest
     * @return DescribeAggregateFunctionResponse
     */
    public DescribeAggregateFunctionResponse describeAggregateFunction(DescribeAggregateFunctionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAggregateFunctionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the scenarios in which alerts can be whitelisted.</p>
     * 
     * @param request DescribeAlertSceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAlertSceneResponse
     */
    public DescribeAlertSceneResponse describeAlertSceneWithOptions(DescribeAlertSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAlertScene"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAlertSceneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the scenarios in which alerts can be whitelisted.</p>
     * 
     * @param request DescribeAlertSceneRequest
     * @return DescribeAlertSceneResponse
     */
    public DescribeAlertSceneResponse describeAlertScene(DescribeAlertSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAlertSceneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of alert whitelisting scenarios and objects.</p>
     * 
     * @param request DescribeAlertSceneByEventRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAlertSceneByEventResponse
     */
    public DescribeAlertSceneByEventResponse describeAlertSceneByEventWithOptions(DescribeAlertSceneByEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.incidentUuid)) {
            body.put("IncidentUuid", request.incidentUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAlertSceneByEvent"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAlertSceneByEventResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of alert whitelisting scenarios and objects.</p>
     * 
     * @param request DescribeAlertSceneByEventRequest
     * @return DescribeAlertSceneByEventResponse
     */
    public DescribeAlertSceneByEventResponse describeAlertSceneByEvent(DescribeAlertSceneByEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAlertSceneByEventWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of alert sources.</p>
     * 
     * @param request DescribeAlertSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAlertSourceResponse
     */
    public DescribeAlertSourceResponse describeAlertSourceWithOptions(DescribeAlertSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            body.put("Level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAlertSource"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAlertSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of alert sources.</p>
     * 
     * @param request DescribeAlertSourceRequest
     * @return DescribeAlertSourceResponse
     */
    public DescribeAlertSourceResponse describeAlertSource(DescribeAlertSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAlertSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the alert data sources associated with an event.</p>
     * 
     * @param request DescribeAlertSourceWithEventRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAlertSourceWithEventResponse
     */
    public DescribeAlertSourceWithEventResponse describeAlertSourceWithEventWithOptions(DescribeAlertSourceWithEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.incidentUuid)) {
            body.put("IncidentUuid", request.incidentUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAlertSourceWithEvent"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAlertSourceWithEventResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the alert data sources associated with an event.</p>
     * 
     * @param request DescribeAlertSourceWithEventRequest
     * @return DescribeAlertSourceWithEventResponse
     */
    public DescribeAlertSourceWithEventResponse describeAlertSourceWithEvent(DescribeAlertSourceWithEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAlertSourceWithEventWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of threat types for custom rules.</p>
     * 
     * @param request DescribeAlertTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAlertTypeResponse
     */
    public DescribeAlertTypeResponse describeAlertTypeWithOptions(DescribeAlertTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            body.put("RuleType", request.ruleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAlertType"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAlertTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of threat types for custom rules.</p>
     * 
     * @param request DescribeAlertTypeRequest
     * @return DescribeAlertTypeResponse
     */
    public DescribeAlertTypeResponse describeAlertType(DescribeAlertTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAlertTypeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Gets the list of alerts for a user.</p>
     * 
     * @param request DescribeAlertsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAlertsResponse
     */
    public DescribeAlertsResponse describeAlertsWithOptions(DescribeAlertsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertName)) {
            body.put("AlertName", request.alertName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertStatus)) {
            body.put("AlertStatus", request.alertStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertTitle)) {
            body.put("AlertTitle", request.alertTitle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertType)) {
            body.put("AlertType", request.alertType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertUuid)) {
            body.put("AlertUuid", request.alertUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assetId)) {
            body.put("AssetId", request.assetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assetName)) {
            body.put("AssetName", request.assetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityId)) {
            body.put("EntityId", request.entityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityName)) {
            body.put("EntityName", request.entityName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isDefend)) {
            body.put("IsDefend", request.isDefend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelType)) {
            body.put("LabelType", request.labelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            body.put("Level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            body.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            body.put("SubUserId", request.subUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAlerts"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAlertsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Gets the list of alerts for a user.</p>
     * 
     * @param request DescribeAlertsRequest
     * @return DescribeAlertsResponse
     */
    public DescribeAlertsResponse describeAlerts(DescribeAlertsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAlertsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the count of alerts for different severity levels.</p>
     * 
     * @param request DescribeAlertsCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAlertsCountResponse
     */
    public DescribeAlertsCountResponse describeAlertsCountWithOptions(DescribeAlertsCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryType)) {
            body.put("QueryType", request.queryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAlertsCount"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAlertsCountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the count of alerts for different severity levels.</p>
     * 
     * @param request DescribeAlertsCountRequest
     * @return DescribeAlertsCountResponse
     */
    public DescribeAlertsCountResponse describeAlertsCount(DescribeAlertsCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAlertsCountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries for alerts that are associated with an entity.</p>
     * 
     * @param request DescribeAlertsWithEntityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAlertsWithEntityResponse
     */
    public DescribeAlertsWithEntityResponse describeAlertsWithEntityWithOptions(DescribeAlertsWithEntityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityId)) {
            body.put("EntityId", request.entityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityUuid)) {
            body.put("EntityUuid", request.entityUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentUuid)) {
            body.put("IncidentUuid", request.incidentUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sophonTaskId)) {
            body.put("SophonTaskId", request.sophonTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAlertsWithEntity"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAlertsWithEntityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries for alerts that are associated with an entity.</p>
     * 
     * @param request DescribeAlertsWithEntityRequest
     * @return DescribeAlertsWithEntityResponse
     */
    public DescribeAlertsWithEntityResponse describeAlertsWithEntity(DescribeAlertsWithEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAlertsWithEntityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves alerts associated with a specific event.</p>
     * 
     * @param request DescribeAlertsWithEventRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAlertsWithEventResponse
     */
    public DescribeAlertsWithEventResponse describeAlertsWithEventWithOptions(DescribeAlertsWithEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertName)) {
            body.put("AlertName", request.alertName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertTitle)) {
            body.put("AlertTitle", request.alertTitle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertType)) {
            body.put("AlertType", request.alertType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assetId)) {
            body.put("AssetId", request.assetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assetName)) {
            body.put("AssetName", request.assetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityId)) {
            body.put("EntityId", request.entityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityName)) {
            body.put("EntityName", request.entityName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentUuid)) {
            body.put("IncidentUuid", request.incidentUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isDefend)) {
            body.put("IsDefend", request.isDefend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            body.put("Level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            body.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            body.put("SubUserId", request.subUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAlertsWithEvent"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAlertsWithEventResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves alerts associated with a specific event.</p>
     * 
     * @param request DescribeAlertsWithEventRequest
     * @return DescribeAlertsWithEventResponse
     */
    public DescribeAlertsWithEventResponse describeAlertsWithEvent(DescribeAlertsWithEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAlertsWithEventWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether an Alibaba Cloud account has granted permissions to Cloud SIEM and the AliyunServiceRoleForSasCloudSiem role has been created.</p>
     * 
     * @param request DescribeAuthRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAuthResponse
     */
    public DescribeAuthResponse describeAuthWithOptions(DescribeAuthRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAuth"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAuthResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether an Alibaba Cloud account has granted permissions to Cloud SIEM and the AliyunServiceRoleForSasCloudSiem role has been created.</p>
     * 
     * @param request DescribeAuthRequest
     * @return DescribeAuthResponse
     */
    public DescribeAuthResponse describeAuth(DescribeAuthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAuthWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Returns the number of automated response rules.</p>
     * 
     * @param request DescribeAutomateResponseConfigCounterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAutomateResponseConfigCounterResponse
     */
    public DescribeAutomateResponseConfigCounterResponse describeAutomateResponseConfigCounterWithOptions(DescribeAutomateResponseConfigCounterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAutomateResponseConfigCounter"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAutomateResponseConfigCounterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Returns the number of automated response rules.</p>
     * 
     * @param request DescribeAutomateResponseConfigCounterRequest
     * @return DescribeAutomateResponseConfigCounterResponse
     */
    public DescribeAutomateResponseConfigCounterResponse describeAutomateResponseConfigCounter(DescribeAutomateResponseConfigCounterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAutomateResponseConfigCounterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the configurable fields and operators for automated response rules.</p>
     * 
     * @param request DescribeAutomateResponseConfigFeatureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAutomateResponseConfigFeatureResponse
     */
    public DescribeAutomateResponseConfigFeatureResponse describeAutomateResponseConfigFeatureWithOptions(DescribeAutomateResponseConfigFeatureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoResponseType)) {
            body.put("AutoResponseType", request.autoResponseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAutomateResponseConfigFeature"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAutomateResponseConfigFeatureResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the configurable fields and operators for automated response rules.</p>
     * 
     * @param request DescribeAutomateResponseConfigFeatureRequest
     * @return DescribeAutomateResponseConfigFeatureResponse
     */
    public DescribeAutomateResponseConfigFeatureResponse describeAutomateResponseConfigFeature(DescribeAutomateResponseConfigFeatureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAutomateResponseConfigFeatureWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of assets that are associated with an event.</p>
     * 
     * @param request DescribeCloudSiemAssetsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCloudSiemAssetsResponse
     */
    public DescribeCloudSiemAssetsResponse describeCloudSiemAssetsWithOptions(DescribeCloudSiemAssetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assetName)) {
            body.put("AssetName", request.assetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assetType)) {
            body.put("AssetType", request.assetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assetUuid)) {
            body.put("AssetUuid", request.assetUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentUuid)) {
            body.put("IncidentUuid", request.incidentUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCloudSiemAssets"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCloudSiemAssetsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of assets that are associated with an event.</p>
     * 
     * @param request DescribeCloudSiemAssetsRequest
     * @return DescribeCloudSiemAssetsResponse
     */
    public DescribeCloudSiemAssetsResponse describeCloudSiemAssets(DescribeCloudSiemAssetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudSiemAssetsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the number of assets of each type that are associated with an event.</p>
     * 
     * @param request DescribeCloudSiemAssetsCounterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCloudSiemAssetsCounterResponse
     */
    public DescribeCloudSiemAssetsCounterResponse describeCloudSiemAssetsCounterWithOptions(DescribeCloudSiemAssetsCounterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.incidentUuid)) {
            body.put("IncidentUuid", request.incidentUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCloudSiemAssetsCounter"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCloudSiemAssetsCounterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the number of assets of each type that are associated with an event.</p>
     * 
     * @param request DescribeCloudSiemAssetsCounterRequest
     * @return DescribeCloudSiemAssetsCounterResponse
     */
    public DescribeCloudSiemAssetsCounterResponse describeCloudSiemAssetsCounter(DescribeCloudSiemAssetsCounterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudSiemAssetsCounterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of an event.</p>
     * 
     * @param request DescribeCloudSiemEventDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCloudSiemEventDetailResponse
     */
    public DescribeCloudSiemEventDetailResponse describeCloudSiemEventDetailWithOptions(DescribeCloudSiemEventDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.incidentUuid)) {
            body.put("IncidentUuid", request.incidentUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCloudSiemEventDetail"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCloudSiemEventDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of an event.</p>
     * 
     * @param request DescribeCloudSiemEventDetailRequest
     * @return DescribeCloudSiemEventDetailResponse
     */
    public DescribeCloudSiemEventDetailResponse describeCloudSiemEventDetail(DescribeCloudSiemEventDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudSiemEventDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of threat analysis events.</p>
     * 
     * @param request DescribeCloudSiemEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCloudSiemEventsResponse
     */
    public DescribeCloudSiemEventsResponse describeCloudSiemEventsWithOptions(DescribeCloudSiemEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assetId)) {
            body.put("AssetId", request.assetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityUuid)) {
            body.put("EntityUuid", request.entityUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventName)) {
            body.put("EventName", request.eventName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentUuid)) {
            body.put("IncidentUuid", request.incidentUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            body.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderField)) {
            body.put("OrderField", request.orderField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threadLevel)) {
            body.put("ThreadLevel", request.threadLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCloudSiemEvents"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCloudSiemEventsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of threat analysis events.</p>
     * 
     * @param request DescribeCloudSiemEventsRequest
     * @return DescribeCloudSiemEventsResponse
     */
    public DescribeCloudSiemEventsResponse describeCloudSiemEvents(DescribeCloudSiemEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudSiemEventsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the count of custom rules.</p>
     * 
     * @param request DescribeCustomizeRuleCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCustomizeRuleCountResponse
     */
    public DescribeCustomizeRuleCountResponse describeCustomizeRuleCountWithOptions(DescribeCustomizeRuleCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCustomizeRuleCount"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCustomizeRuleCountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the count of custom rules.</p>
     * 
     * @param request DescribeCustomizeRuleCountRequest
     * @return DescribeCustomizeRuleCountResponse
     */
    public DescribeCustomizeRuleCountResponse describeCustomizeRuleCount(DescribeCustomizeRuleCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCustomizeRuleCountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves historical simulated data from a test scenario.</p>
     * 
     * @param request DescribeCustomizeRuleTestRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCustomizeRuleTestResponse
     */
    public DescribeCustomizeRuleTestResponse describeCustomizeRuleTestWithOptions(DescribeCustomizeRuleTestRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCustomizeRuleTest"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCustomizeRuleTestResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves historical simulated data from a test scenario.</p>
     * 
     * @param request DescribeCustomizeRuleTestRequest
     * @return DescribeCustomizeRuleTestResponse
     */
    public DescribeCustomizeRuleTestResponse describeCustomizeRuleTest(DescribeCustomizeRuleTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCustomizeRuleTestWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the chart of test results for a custom rule.</p>
     * 
     * @param request DescribeCustomizeRuleTestHistogramRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCustomizeRuleTestHistogramResponse
     */
    public DescribeCustomizeRuleTestHistogramResponse describeCustomizeRuleTestHistogramWithOptions(DescribeCustomizeRuleTestHistogramRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCustomizeRuleTestHistogram"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCustomizeRuleTestHistogramResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the chart of test results for a custom rule.</p>
     * 
     * @param request DescribeCustomizeRuleTestHistogramRequest
     * @return DescribeCustomizeRuleTestHistogramResponse
     */
    public DescribeCustomizeRuleTestHistogramResponse describeCustomizeRuleTestHistogram(DescribeCustomizeRuleTestHistogramRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCustomizeRuleTestHistogramWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a data source.</p>
     * 
     * @param request DescribeDataSourceInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDataSourceInstanceResponse
     */
    public DescribeDataSourceInstanceResponse describeDataSourceInstanceWithOptions(DescribeDataSourceInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            body.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudCode)) {
            body.put("CloudCode", request.cloudCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceInstanceId)) {
            body.put("DataSourceInstanceId", request.dataSourceInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataSourceInstance"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataSourceInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a data source.</p>
     * 
     * @param request DescribeDataSourceInstanceRequest
     * @return DescribeDataSourceInstanceResponse
     */
    public DescribeDataSourceInstanceResponse describeDataSourceInstance(DescribeDataSourceInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataSourceInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Describes the parameters for a data source.</p>
     * 
     * @param request DescribeDataSourceParametersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDataSourceParametersResponse
     */
    public DescribeDataSourceParametersResponse describeDataSourceParametersWithOptions(DescribeDataSourceParametersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cloudCode)) {
            body.put("CloudCode", request.cloudCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            body.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataSourceParameters"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataSourceParametersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Describes the parameters for a data source.</p>
     * 
     * @param request DescribeDataSourceParametersRequest
     * @return DescribeDataSourceParametersResponse
     */
    public DescribeDataSourceParametersResponse describeDataSourceParameters(DescribeDataSourceParametersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataSourceParametersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves entities to be remediated and a list of playbooks.</p>
     * 
     * @param request DescribeDisposeAndPlaybookRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDisposeAndPlaybookResponse
     */
    public DescribeDisposeAndPlaybookResponse describeDisposeAndPlaybookWithOptions(DescribeDisposeAndPlaybookRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityType)) {
            body.put("EntityType", request.entityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityUuid)) {
            body.put("EntityUuid", request.entityUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentUuid)) {
            body.put("IncidentUuid", request.incidentUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDisposeAndPlaybook"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDisposeAndPlaybookResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves entities to be remediated and a list of playbooks.</p>
     * 
     * @param request DescribeDisposeAndPlaybookRequest
     * @return DescribeDisposeAndPlaybookResponse
     */
    public DescribeDisposeAndPlaybookResponse describeDisposeAndPlaybook(DescribeDisposeAndPlaybookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDisposeAndPlaybookWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the list of playbooks used in a disposal policy.</p>
     * 
     * @param request DescribeDisposeStrategyPlaybookRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDisposeStrategyPlaybookResponse
     */
    public DescribeDisposeStrategyPlaybookResponse describeDisposeStrategyPlaybookWithOptions(DescribeDisposeStrategyPlaybookRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDisposeStrategyPlaybook"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDisposeStrategyPlaybookResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the list of playbooks used in a disposal policy.</p>
     * 
     * @param request DescribeDisposeStrategyPlaybookRequest
     * @return DescribeDisposeStrategyPlaybookResponse
     */
    public DescribeDisposeStrategyPlaybookResponse describeDisposeStrategyPlaybook(DescribeDisposeStrategyPlaybookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDisposeStrategyPlaybookWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of an entity.</p>
     * 
     * @param request DescribeEntityInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEntityInfoResponse
     */
    public DescribeEntityInfoResponse describeEntityInfoWithOptions(DescribeEntityInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entityId)) {
            body.put("EntityId", request.entityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityIdentity)) {
            body.put("EntityIdentity", request.entityIdentity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentUuid)) {
            body.put("IncidentUuid", request.incidentUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sophonTaskId)) {
            body.put("SophonTaskId", request.sophonTaskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEntityInfo"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEntityInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of an entity.</p>
     * 
     * @param request DescribeEntityInfoRequest
     * @return DescribeEntityInfoResponse
     */
    public DescribeEntityInfoResponse describeEntityInfo(DescribeEntityInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEntityInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can obtain the count for each event type.</p>
     * 
     * @param request DescribeEventCountByThreatLevelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEventCountByThreatLevelResponse
     */
    public DescribeEventCountByThreatLevelResponse describeEventCountByThreatLevelWithOptions(DescribeEventCountByThreatLevelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEventCountByThreatLevel"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEventCountByThreatLevelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can obtain the count for each event type.</p>
     * 
     * @param request DescribeEventCountByThreatLevelRequest
     * @return DescribeEventCountByThreatLevelResponse
     */
    public DescribeEventCountByThreatLevelResponse describeEventCountByThreatLevel(DescribeEventCountByThreatLevelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEventCountByThreatLevelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the policy handling history for an event.</p>
     * 
     * @param request DescribeEventDisposeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEventDisposeResponse
     */
    public DescribeEventDisposeResponse describeEventDisposeWithOptions(DescribeEventDisposeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentUuid)) {
            body.put("IncidentUuid", request.incidentUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEventDispose"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEventDisposeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the policy handling history for an event.</p>
     * 
     * @param request DescribeEventDisposeRequest
     * @return DescribeEventDisposeResponse
     */
    public DescribeEventDisposeResponse describeEventDispose(DescribeEventDisposeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEventDisposeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the number of imported logs.</p>
     * 
     * @param request DescribeImportedLogCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeImportedLogCountResponse
     */
    public DescribeImportedLogCountResponse describeImportedLogCountWithOptions(DescribeImportedLogCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeImportedLogCount"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeImportedLogCountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the number of imported logs.</p>
     * 
     * @param request DescribeImportedLogCountRequest
     * @return DescribeImportedLogCountResponse
     */
    public DescribeImportedLogCountResponse describeImportedLogCount(DescribeImportedLogCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeImportedLogCountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the list of configurable fields for custom rules.</p>
     * 
     * @param request DescribeLogFieldsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLogFieldsResponse
     */
    public DescribeLogFieldsResponse describeLogFieldsWithOptions(DescribeLogFieldsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logSource)) {
            body.put("LogSource", request.logSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logType)) {
            body.put("LogType", request.logType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLogFields"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLogFieldsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the list of configurable fields for custom rules.</p>
     * 
     * @param request DescribeLogFieldsRequest
     * @return DescribeLogFieldsResponse
     */
    public DescribeLogFieldsResponse describeLogFields(DescribeLogFieldsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLogFieldsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of configurable log sources for custom rules.</p>
     * 
     * @param request DescribeLogSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLogSourceResponse
     */
    public DescribeLogSourceResponse describeLogSourceWithOptions(DescribeLogSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logType)) {
            body.put("LogType", request.logType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLogSource"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLogSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of configurable log sources for custom rules.</p>
     * 
     * @param request DescribeLogSourceRequest
     * @return DescribeLogSourceResponse
     */
    public DescribeLogSourceResponse describeLogSource(DescribeLogSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLogSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the log types that can be configured for custom rules.</p>
     * 
     * @param request DescribeLogTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLogTypeResponse
     */
    public DescribeLogTypeResponse describeLogTypeWithOptions(DescribeLogTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLogType"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLogTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the log types that can be configured for custom rules.</p>
     * 
     * @param request DescribeLogTypeRequest
     * @return DescribeLogTypeResponse
     */
    public DescribeLogTypeResponse describeLogType(DescribeLogTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLogTypeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the list of operators for custom rules.</p>
     * 
     * @param request DescribeOperatorsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOperatorsResponse
     */
    public DescribeOperatorsResponse describeOperatorsWithOptions(DescribeOperatorsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneType)) {
            body.put("SceneType", request.sceneType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOperators"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOperatorsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the list of operators for custom rules.</p>
     * 
     * @param request DescribeOperatorsRequest
     * @return DescribeOperatorsResponse
     */
    public DescribeOperatorsResponse describeOperators(DescribeOperatorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOperatorsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the number of Alibaba Cloud, Tencent Cloud, and Huawei Cloud products that can be integrated with Threat Analysis.</p>
     * 
     * @param request DescribeProdCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeProdCountResponse
     */
    public DescribeProdCountResponse describeProdCountWithOptions(DescribeProdCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeProdCount"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeProdCountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the number of Alibaba Cloud, Tencent Cloud, and Huawei Cloud products that can be integrated with Threat Analysis.</p>
     * 
     * @param request DescribeProdCountRequest
     * @return DescribeProdCountResponse
     */
    public DescribeProdCountResponse describeProdCount(DescribeProdCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeProdCountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the list of users in the playbook scope.</p>
     * 
     * @param request DescribeScopeUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeScopeUsersResponse
     */
    public DescribeScopeUsersResponse describeScopeUsersWithOptions(DescribeScopeUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScopeUsers"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScopeUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the list of users in the playbook scope.</p>
     * 
     * @param request DescribeScopeUsersRequest
     * @return DescribeScopeUsersResponse
     */
    public DescribeScopeUsersResponse describeScopeUsers(DescribeScopeUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScopeUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether a resource directory is authorized for threat analysis.</p>
     * 
     * @param request DescribeServiceStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeServiceStatusResponse
     */
    public DescribeServiceStatusResponse describeServiceStatusWithOptions(DescribeServiceStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServiceStatus"),
            new TeaPair("version", "2022-06-16"),
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

    /**
     * <b>summary</b> : 
     * <p>Checks whether a resource directory is authorized for threat analysis.</p>
     * 
     * @param request DescribeServiceStatusRequest
     * @return DescribeServiceStatusResponse
     */
    public DescribeServiceStatusResponse describeServiceStatus(DescribeServiceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeServiceStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks the status of the storage for the threat analysis feature. The storage is a Logstore in Simple Log Service.</p>
     * 
     * @param request DescribeStorageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeStorageResponse
     */
    public DescribeStorageResponse describeStorageWithOptions(DescribeStorageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeStorage"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeStorageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Checks the status of the storage for the threat analysis feature. The storage is a Logstore in Simple Log Service.</p>
     * 
     * @param request DescribeStorageRequest
     * @return DescribeStorageResponse
     */
    public DescribeStorageResponse describeStorage(DescribeStorageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeStorageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether the current Alibaba Cloud account or its associated enterprise organization has purchased threat analysis.</p>
     * 
     * @param request DescribeUserBuyStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserBuyStatusResponse
     */
    public DescribeUserBuyStatusResponse describeUserBuyStatusWithOptions(DescribeUserBuyStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            body.put("SubUserId", request.subUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserBuyStatus"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserBuyStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether the current Alibaba Cloud account or its associated enterprise organization has purchased threat analysis.</p>
     * 
     * @param request DescribeUserBuyStatusRequest
     * @return DescribeUserBuyStatusResponse
     */
    public DescribeUserBuyStatusResponse describeUserBuyStatus(DescribeUserBuyStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserBuyStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the list of domain names protected by Web Application Firewall (WAF) instances.</p>
     * 
     * @param request DescribeWafScopeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeWafScopeResponse
     */
    public DescribeWafScopeResponse describeWafScopeWithOptions(DescribeWafScopeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entityId)) {
            body.put("EntityId", request.entityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeWafScope"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWafScopeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the list of domain names protected by Web Application Firewall (WAF) instances.</p>
     * 
     * @param request DescribeWafScopeRequest
     * @return DescribeWafScopeResponse
     */
    public DescribeWafScopeResponse describeWafScope(DescribeWafScopeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeWafScopeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the rules in the alert whitelist.</p>
     * 
     * @param request DescribeWhiteRuleListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeWhiteRuleListResponse
     */
    public DescribeWhiteRuleListResponse describeWhiteRuleListWithOptions(DescribeWhiteRuleListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertName)) {
            body.put("AlertName", request.alertName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertType)) {
            body.put("AlertType", request.alertType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentUuid)) {
            body.put("IncidentUuid", request.incidentUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeWhiteRuleList"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWhiteRuleListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the rules in the alert whitelist.</p>
     * 
     * @param request DescribeWhiteRuleListRequest
     * @return DescribeWhiteRuleListResponse
     */
    public DescribeWhiteRuleListResponse describeWhiteRuleList(DescribeWhiteRuleListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeWhiteRuleListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Grants permissions to Threat Analysis and creates the AliyunServiceRoleForSasCloudSiem service-linked role.</p>
     * 
     * @param request EnableAccessForCloudSiemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableAccessForCloudSiemResponse
     */
    public EnableAccessForCloudSiemResponse enableAccessForCloudSiemWithOptions(EnableAccessForCloudSiemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoSubmit)) {
            body.put("AutoSubmit", request.autoSubmit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableAccessForCloudSiem"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableAccessForCloudSiemResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Grants permissions to Threat Analysis and creates the AliyunServiceRoleForSasCloudSiem service-linked role.</p>
     * 
     * @param request EnableAccessForCloudSiemRequest
     * @return EnableAccessForCloudSiemResponse
     */
    public EnableAccessForCloudSiemResponse enableAccessForCloudSiem(EnableAccessForCloudSiemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableAccessForCloudSiemWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables resource directory authorization for threat analysis. This operation can be called only by a resource directory administrator.</p>
     * 
     * @param request EnableServiceForCloudSiemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableServiceForCloudSiemResponse
     */
    public EnableServiceForCloudSiemResponse enableServiceForCloudSiemWithOptions(EnableServiceForCloudSiemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableServiceForCloudSiem"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableServiceForCloudSiemResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables resource directory authorization for threat analysis. This operation can be called only by a resource directory administrator.</p>
     * 
     * @param request EnableServiceForCloudSiemRequest
     * @return EnableServiceForCloudSiemResponse
     */
    public EnableServiceForCloudSiemResponse enableServiceForCloudSiem(EnableServiceForCloudSiemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableServiceForCloudSiemWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the current billable storage usage and subscription purchase volume for threat analysis. Units are in GB.</p>
     * 
     * @param request GetCapacityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCapacityResponse
     */
    public GetCapacityResponse getCapacityWithOptions(GetCapacityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCapacity"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCapacityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the current billable storage usage and subscription purchase volume for threat analysis. Units are in GB.</p>
     * 
     * @param request GetCapacityRequest
     * @return GetCapacityResponse
     */
    public GetCapacityResponse getCapacity(GetCapacityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCapacityWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. A utility class with configuration examples is provided. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries entity counts.</p>
     * 
     * @param request GetEntitiyStatRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEntitiyStatResponse
     */
    public GetEntitiyStatResponse getEntitiyStatWithOptions(GetEntitiyStatRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assetName)) {
            body.put("AssetName", request.assetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assetUuid)) {
            body.put("AssetUuid", request.assetUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityName)) {
            body.put("EntityName", request.entityName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityType)) {
            body.put("EntityType", request.entityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityUuid)) {
            body.put("EntityUuid", request.entityUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentUuid)) {
            body.put("IncidentUuid", request.incidentUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAsset)) {
            body.put("IsAsset", request.isAsset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isMalwareEntity)) {
            body.put("IsMalwareEntity", request.isMalwareEntity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEntitiyStat"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEntitiyStatResponse());
    }

    /**
     * <b>description</b> :
     * <p>The input parameter JsonConfig is a complex JSON configuration. A utility class with configuration examples is provided. For more information, refer to <a href="https://github.com/aliyun/cloud-siem-client/blob/master/src/main/java/com/aliyun/security/cloudsiem/client/sample/JobBuilderSample.java">Demo</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries entity counts.</p>
     * 
     * @param request GetEntitiyStatRequest
     * @return GetEntitiyStatResponse
     */
    public GetEntitiyStatResponse getEntitiyStat(GetEntitiyStatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEntitiyStatWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the storage settings created by the Threat Analysis and Response product in your Simple Log Service (SLS). These settings include the storage duration and storage region.</p>
     * 
     * @param request GetStorageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetStorageResponse
     */
    public GetStorageResponse getStorageWithOptions(GetStorageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStorage"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStorageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the storage settings created by the Threat Analysis and Response product in your Simple Log Service (SLS). These settings include the storage duration and storage region.</p>
     * 
     * @param request GetStorageRequest
     * @return GetStorageResponse
     */
    public GetStorageResponse getStorage(GetStorageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStorageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the AccessKey IDs for attached multicloud accounts.</p>
     * 
     * @param request ListAccountAccessIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAccountAccessIdResponse
     */
    public ListAccountAccessIdResponse listAccountAccessIdWithOptions(ListAccountAccessIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cloudCode)) {
            body.put("CloudCode", request.cloudCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAccountAccessId"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAccountAccessIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the AccessKey IDs for attached multicloud accounts.</p>
     * 
     * @param request ListAccountAccessIdRequest
     * @return ListAccountAccessIdResponse
     */
    public ListAccountAccessIdResponse listAccountAccessId(ListAccountAccessIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAccountAccessIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the accounts associated with a log.</p>
     * 
     * @param request ListAccountsByLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAccountsByLogResponse
     */
    public ListAccountsByLogResponse listAccountsByLogWithOptions(ListAccountsByLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cloudCode)) {
            body.put("CloudCode", request.cloudCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logCodes)) {
            body.put("LogCodes", request.logCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodCode)) {
            body.put("ProdCode", request.prodCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAccountsByLog"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAccountsByLogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the accounts associated with a log.</p>
     * 
     * @param request ListAccountsByLogRequest
     * @return ListAccountsByLogResponse
     */
    public ListAccountsByLogResponse listAccountsByLog(ListAccountsByLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAccountsByLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the cloud products supported by Threat Analysis for data ingestion.</p>
     * 
     * @param request ListAllProdsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAllProdsResponse
     */
    public ListAllProdsResponse listAllProdsWithOptions(ListAllProdsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAllProds"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAllProdsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the cloud products supported by Threat Analysis for data ingestion.</p>
     * 
     * @param request ListAllProdsRequest
     * @return ListAllProdsResponse
     */
    public ListAllProdsResponse listAllProds(ListAllProdsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAllProdsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of automated response rules.</p>
     * 
     * @param request ListAutomateResponseConfigsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAutomateResponseConfigsResponse
     */
    public ListAutomateResponseConfigsResponse listAutomateResponseConfigsWithOptions(ListAutomateResponseConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionType)) {
            body.put("ActionType", request.actionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoResponseType)) {
            body.put("AutoResponseType", request.autoResponseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookUuid)) {
            body.put("PlaybookUuid", request.playbookUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseRuleType)) {
            body.put("ResponseRuleType", request.responseRuleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            body.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            body.put("SubUserId", request.subUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAutomateResponseConfigs"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAutomateResponseConfigsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of automated response rules.</p>
     * 
     * @param request ListAutomateResponseConfigsRequest
     * @return ListAutomateResponseConfigsResponse
     */
    public ListAutomateResponseConfigsResponse listAutomateResponseConfigs(ListAutomateResponseConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAutomateResponseConfigsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists multicloud accounts bound to Threat Analysis.</p>
     * 
     * @param request ListBindAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBindAccountResponse
     */
    public ListBindAccountResponse listBindAccountWithOptions(ListBindAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cloudCode)) {
            body.put("CloudCode", request.cloudCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBindAccount"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBindAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists multicloud accounts bound to Threat Analysis.</p>
     * 
     * @param request ListBindAccountRequest
     * @return ListBindAccountResponse
     */
    public ListBindAccountResponse listBindAccount(ListBindAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBindAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all bound data sources.</p>
     * 
     * @param request ListBindDataSourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBindDataSourcesResponse
     */
    public ListBindDataSourcesResponse listBindDataSourcesWithOptions(ListBindDataSourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            body.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudCode)) {
            body.put("CloudCode", request.cloudCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBindDataSources"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBindDataSourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all bound data sources.</p>
     * 
     * @param request ListBindDataSourcesRequest
     * @return ListBindDataSourcesResponse
     */
    public ListBindDataSourcesResponse listBindDataSources(ListBindDataSourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBindDataSourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of custom rules.</p>
     * 
     * @param request ListCloudSiemCustomizeRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCloudSiemCustomizeRulesResponse
     */
    public ListCloudSiemCustomizeRulesResponse listCloudSiemCustomizeRulesWithOptions(ListCloudSiemCustomizeRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertType)) {
            body.put("AlertType", request.alertType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            body.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderField)) {
            body.put("OrderField", request.orderField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            body.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            body.put("RuleType", request.ruleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threatLevel)) {
            body.put("ThreatLevel", request.threatLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCloudSiemCustomizeRules"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCloudSiemCustomizeRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of custom rules.</p>
     * 
     * @param request ListCloudSiemCustomizeRulesRequest
     * @return ListCloudSiemCustomizeRulesResponse
     */
    public ListCloudSiemCustomizeRulesResponse listCloudSiemCustomizeRules(ListCloudSiemCustomizeRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCloudSiemCustomizeRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of predefined rules.</p>
     * 
     * @param request ListCloudSiemPredefinedRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCloudSiemPredefinedRulesResponse
     */
    public ListCloudSiemPredefinedRulesResponse listCloudSiemPredefinedRulesWithOptions(ListCloudSiemPredefinedRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertType)) {
            body.put("AlertType", request.alertType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.attCk)) {
            body.put("AttCk", request.attCk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventTransferType)) {
            body.put("EventTransferType", request.eventTransferType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logSource)) {
            body.put("LogSource", request.logSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            body.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderField)) {
            body.put("OrderField", request.orderField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            body.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            body.put("RuleType", request.ruleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threatLevel)) {
            body.put("ThreatLevel", request.threatLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCloudSiemPredefinedRules"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCloudSiemPredefinedRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of predefined rules.</p>
     * 
     * @param request ListCloudSiemPredefinedRulesRequest
     * @return ListCloudSiemPredefinedRulesResponse
     */
    public ListCloudSiemPredefinedRulesResponse listCloudSiemPredefinedRules(ListCloudSiemPredefinedRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCloudSiemPredefinedRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the list of test results for a custom rule.</p>
     * 
     * @param request ListCustomizeRuleTestResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCustomizeRuleTestResultResponse
     */
    public ListCustomizeRuleTestResultResponse listCustomizeRuleTestResultWithOptions(ListCustomizeRuleTestResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detectionRuleId)) {
            body.put("DetectionRuleId", request.detectionRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyType)) {
            body.put("VerifyType", request.verifyType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCustomizeRuleTestResult"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCustomizeRuleTestResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the list of test results for a custom rule.</p>
     * 
     * @param request ListCustomizeRuleTestResultRequest
     * @return ListCustomizeRuleTestResultResponse
     */
    public ListCustomizeRuleTestResultResponse listCustomizeRuleTestResult(ListCustomizeRuleTestResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCustomizeRuleTestResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the logs for a data source.</p>
     * 
     * @param request ListDataSourceLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataSourceLogsResponse
     */
    public ListDataSourceLogsResponse listDataSourceLogsWithOptions(ListDataSourceLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            body.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudCode)) {
            body.put("CloudCode", request.cloudCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceInstanceId)) {
            body.put("DataSourceInstanceId", request.dataSourceInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataSourceLogs"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataSourceLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the logs for a data source.</p>
     * 
     * @param request ListDataSourceLogsRequest
     * @return ListDataSourceLogsResponse
     */
    public ListDataSourceLogsResponse listDataSourceLogs(ListDataSourceLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataSourceLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the types of multicloud data sources that Threat Analysis supports.</p>
     * 
     * @param request ListDataSourceTypesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataSourceTypesResponse
     */
    public ListDataSourceTypesResponse listDataSourceTypesWithOptions(ListDataSourceTypesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cloudCode)) {
            body.put("CloudCode", request.cloudCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataSourceTypes"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataSourceTypesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the types of multicloud data sources that Threat Analysis supports.</p>
     * 
     * @param request ListDataSourceTypesRequest
     * @return ListDataSourceTypesResponse
     */
    public ListDataSourceTypesResponse listDataSourceTypes(ListDataSourceTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataSourceTypesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the products and logs that are connected to threat analysis for an enterprise or a member, and the data shipping status of these logs.</p>
     * 
     * @param request ListDeliveryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDeliveryResponse
     */
    public ListDeliveryResponse listDeliveryWithOptions(ListDeliveryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDelivery"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeliveryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the products and logs that are connected to threat analysis for an enterprise or a member, and the data shipping status of these logs.</p>
     * 
     * @param request ListDeliveryRequest
     * @return ListDeliveryResponse
     */
    public ListDeliveryResponse listDelivery(ListDeliveryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDeliveryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve a list of system-recommended disposal strategies.</p>
     * 
     * @param request ListDisposeStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDisposeStrategyResponse
     */
    public ListDisposeStrategyResponse listDisposeStrategyWithOptions(ListDisposeStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveStatus)) {
            body.put("EffectiveStatus", request.effectiveStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityIdentity)) {
            body.put("EntityIdentity", request.entityIdentity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityType)) {
            body.put("EntityType", request.entityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentUuid)) {
            body.put("IncidentUuid", request.incidentUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            body.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderField)) {
            body.put("OrderField", request.orderField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookName)) {
            body.put("PlaybookName", request.playbookName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookTypes)) {
            body.put("PlaybookTypes", request.playbookTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookUuid)) {
            body.put("PlaybookUuid", request.playbookUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sophonTaskId)) {
            body.put("SophonTaskId", request.sophonTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDisposeStrategy"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDisposeStrategyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve a list of system-recommended disposal strategies.</p>
     * 
     * @param request ListDisposeStrategyRequest
     * @return ListDisposeStrategyResponse
     */
    public ListDisposeStrategyResponse listDisposeStrategy(ListDisposeStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDisposeStrategyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of entities.</p>
     * 
     * @param request ListEntitiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEntitiesResponse
     */
    public ListEntitiesResponse listEntitiesWithOptions(ListEntitiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityName)) {
            body.put("EntityName", request.entityName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityType)) {
            body.put("EntityType", request.entityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityUuid)) {
            body.put("EntityUuid", request.entityUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityUuids)) {
            body.put("EntityUuids", request.entityUuids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentUuid)) {
            body.put("IncidentUuid", request.incidentUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isMalwareEntity)) {
            body.put("IsMalwareEntity", request.isMalwareEntity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.malwareType)) {
            body.put("MalwareType", request.malwareType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEntities"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEntitiesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of entities.</p>
     * 
     * @param request ListEntitiesRequest
     * @return ListEntitiesResponse
     */
    public ListEntitiesResponse listEntities(ListEntitiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEntitiesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the log ingestion details for a specific product.</p>
     * 
     * @param request ListImportedLogsByProdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListImportedLogsByProdResponse
     */
    public ListImportedLogsByProdResponse listImportedLogsByProdWithOptions(ListImportedLogsByProdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cloudCode)) {
            body.put("CloudCode", request.cloudCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodCode)) {
            body.put("ProdCode", request.prodCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListImportedLogsByProd"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListImportedLogsByProdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the log ingestion details for a specific product.</p>
     * 
     * @param request ListImportedLogsByProdRequest
     * @return ListImportedLogsByProdResponse
     */
    public ListImportedLogsByProdResponse listImportedLogsByProd(ListImportedLogsByProdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listImportedLogsByProdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries projects and Logstores based on the name patterns of the default SLS project and Logstore for an Alibaba Cloud service.</p>
     * 
     * @param request ListProjectLogStoresRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProjectLogStoresResponse
     */
    public ListProjectLogStoresResponse listProjectLogStoresWithOptions(ListProjectLogStoresRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceLogCode)) {
            body.put("SourceLogCode", request.sourceLogCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceProdCode)) {
            body.put("SourceProdCode", request.sourceProdCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            body.put("SubUserId", request.subUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjectLogStores"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectLogStoresResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries projects and Logstores based on the name patterns of the default SLS project and Logstore for an Alibaba Cloud service.</p>
     * 
     * @param request ListProjectLogStoresRequest
     * @return ListProjectLogStoresResponse
     */
    public ListProjectLogStoresResponse listProjectLogStores(ListProjectLogStoresRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProjectLogStoresWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the Alibaba Cloud accounts that are managed by the multi-account control feature of Threat Analysis. An account must be managed to use features such as log collection and event handling.</p>
     * 
     * @param request ListRdUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRdUsersResponse
     */
    public ListRdUsersResponse listRdUsersWithOptions(ListRdUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRdUsers"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRdUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the Alibaba Cloud accounts that are managed by the multi-account control feature of Threat Analysis. An account must be managed to use features such as log collection and event handling.</p>
     * 
     * @param request ListRdUsersRequest
     * @return ListRdUsersResponse
     */
    public ListRdUsersResponse listRdUsers(ListRdUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRdUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a bound Alibaba Cloud account.</p>
     * 
     * @param request ModifyBindAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyBindAccountResponse
     */
    public ModifyBindAccountResponse modifyBindAccountWithOptions(ModifyBindAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessId)) {
            body.put("AccessId", request.accessId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            body.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bindId)) {
            body.put("BindId", request.bindId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudCode)) {
            body.put("CloudCode", request.cloudCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyBindAccount"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyBindAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a bound Alibaba Cloud account.</p>
     * 
     * @param request ModifyBindAccountRequest
     * @return ModifyBindAccountResponse
     */
    public ModifyBindAccountResponse modifyBindAccount(ModifyBindAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyBindAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the description of an existing data source.</p>
     * 
     * @param request ModifyDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDataSourceResponse
     */
    public ModifyDataSourceResponse modifyDataSourceWithOptions(ModifyDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            body.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudCode)) {
            body.put("CloudCode", request.cloudCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceInstanceId)) {
            body.put("DataSourceInstanceId", request.dataSourceInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceInstanceName)) {
            body.put("DataSourceInstanceName", request.dataSourceInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceInstanceParams)) {
            body.put("DataSourceInstanceParams", request.dataSourceInstanceParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceInstanceRemark)) {
            body.put("DataSourceInstanceRemark", request.dataSourceInstanceRemark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            body.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDataSource"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDataSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the description of an existing data source.</p>
     * 
     * @param request ModifyDataSourceRequest
     * @return ModifyDataSourceResponse
     */
    public ModifyDataSourceResponse modifyDataSource(ModifyDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the description of a data source log.</p>
     * 
     * @param request ModifyDataSourceLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDataSourceLogResponse
     */
    public ModifyDataSourceLogResponse modifyDataSourceLogWithOptions(ModifyDataSourceLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            body.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudCode)) {
            body.put("CloudCode", request.cloudCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceInstanceId)) {
            body.put("DataSourceInstanceId", request.dataSourceInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceInstanceLogs)) {
            body.put("DataSourceInstanceLogs", request.dataSourceInstanceLogs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            body.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logCode)) {
            body.put("LogCode", request.logCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logInstanceId)) {
            body.put("LogInstanceId", request.logInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDataSourceLog"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDataSourceLogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the description of a data source log.</p>
     * 
     * @param request ModifyDataSourceLogRequest
     * @return ModifyDataSourceLogResponse
     */
    public ModifyDataSourceLogResponse modifyDataSourceLog(ModifyDataSourceLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDataSourceLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables log delivery for integrated cloud services.</p>
     * 
     * @param request OpenDeliveryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenDeliveryResponse
     */
    public OpenDeliveryResponse openDeliveryWithOptions(OpenDeliveryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logCode)) {
            body.put("LogCode", request.logCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenDelivery"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenDeliveryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables log delivery for integrated cloud services.</p>
     * 
     * @param request OpenDeliveryRequest
     * @return OpenDeliveryResponse
     */
    public OpenDeliveryResponse openDelivery(OpenDeliveryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openDeliveryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds or updates an automated response rule.</p>
     * 
     * @param request PostAutomateResponseConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PostAutomateResponseConfigResponse
     */
    public PostAutomateResponseConfigResponse postAutomateResponseConfigWithOptions(PostAutomateResponseConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionConfig)) {
            body.put("ActionConfig", request.actionConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.actionType)) {
            body.put("ActionType", request.actionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoResponseType)) {
            body.put("AutoResponseType", request.autoResponseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executionCondition)) {
            body.put("ExecutionCondition", request.executionCondition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            body.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            body.put("SubUserId", request.subUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PostAutomateResponseConfig"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PostAutomateResponseConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds or updates an automated response rule.</p>
     * 
     * @param request PostAutomateResponseConfigRequest
     * @return PostAutomateResponseConfigResponse
     */
    public PostAutomateResponseConfigResponse postAutomateResponseConfig(PostAutomateResponseConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.postAutomateResponseConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds or updates a custom rule.</p>
     * 
     * @param request PostCustomizeRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PostCustomizeRuleResponse
     */
    public PostCustomizeRuleResponse postCustomizeRuleWithOptions(PostCustomizeRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertType)) {
            body.put("AlertType", request.alertType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertTypeMds)) {
            body.put("AlertTypeMds", request.alertTypeMds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.attCk)) {
            body.put("AttCk", request.attCk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventTransferExt)) {
            body.put("EventTransferExt", request.eventTransferExt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventTransferSwitch)) {
            body.put("EventTransferSwitch", request.eventTransferSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventTransferType)) {
            body.put("EventTransferType", request.eventTransferType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logSource)) {
            body.put("LogSource", request.logSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logSourceMds)) {
            body.put("LogSourceMds", request.logSourceMds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logType)) {
            body.put("LogType", request.logType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logTypeMds)) {
            body.put("LogTypeMds", request.logTypeMds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryCycle)) {
            body.put("QueryCycle", request.queryCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleCondition)) {
            body.put("RuleCondition", request.ruleCondition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleDesc)) {
            body.put("RuleDesc", request.ruleDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleGroup)) {
            body.put("RuleGroup", request.ruleGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            body.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleThreshold)) {
            body.put("RuleThreshold", request.ruleThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threatLevel)) {
            body.put("ThreatLevel", request.threatLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PostCustomizeRule"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PostCustomizeRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds or updates a custom rule.</p>
     * 
     * @param request PostCustomizeRuleRequest
     * @return PostCustomizeRuleResponse
     */
    public PostCustomizeRuleResponse postCustomizeRule(PostCustomizeRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.postCustomizeRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Submits a custom rule for testing.</p>
     * 
     * @param request PostCustomizeRuleTestRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PostCustomizeRuleTestResponse
     */
    public PostCustomizeRuleTestResponse postCustomizeRuleTestWithOptions(PostCustomizeRuleTestRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.simulatedData)) {
            body.put("SimulatedData", request.simulatedData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.testType)) {
            body.put("TestType", request.testType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PostCustomizeRuleTest"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PostCustomizeRuleTestResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Submits a custom rule for testing.</p>
     * 
     * @param request PostCustomizeRuleTestRequest
     * @return PostCustomizeRuleTestResponse
     */
    public PostCustomizeRuleTestResponse postCustomizeRuleTest(PostCustomizeRuleTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.postCustomizeRuleTestWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Submit incident response information to update the incident status and severity level.</p>
     * 
     * @param request PostEventDisposeAndWhiteruleListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PostEventDisposeAndWhiteruleListResponse
     */
    public PostEventDisposeAndWhiteruleListResponse postEventDisposeAndWhiteruleListWithOptions(PostEventDisposeAndWhiteruleListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.disposeStrategyIds)) {
            body.put("DisposeStrategyIds", request.disposeStrategyIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventDispose)) {
            body.put("EventDispose", request.eventDispose);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentUuid)) {
            body.put("IncidentUuid", request.incidentUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            body.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiverInfo)) {
            body.put("ReceiverInfo", request.receiverInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseSource)) {
            body.put("ResponseSource", request.responseSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threatLevel)) {
            body.put("ThreatLevel", request.threatLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PostEventDisposeAndWhiteruleList"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PostEventDisposeAndWhiteruleListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Submit incident response information to update the incident status and severity level.</p>
     * 
     * @param request PostEventDisposeAndWhiteruleListRequest
     * @return PostEventDisposeAndWhiteruleListResponse
     */
    public PostEventDisposeAndWhiteruleListResponse postEventDisposeAndWhiteruleList(PostEventDisposeAndWhiteruleListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.postEventDisposeAndWhiteruleListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Submits alert whitelisting rules.</p>
     * 
     * @param request PostEventWhiteruleListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PostEventWhiteruleListResponse
     */
    public PostEventWhiteruleListResponse postEventWhiteruleListWithOptions(PostEventWhiteruleListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.incidentUuid)) {
            body.put("IncidentUuid", request.incidentUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whiteruleList)) {
            body.put("WhiteruleList", request.whiteruleList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PostEventWhiteruleList"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PostEventWhiteruleListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Submits alert whitelisting rules.</p>
     * 
     * @param request PostEventWhiteruleListRequest
     * @return PostEventWhiteruleListResponse
     */
    public PostEventWhiteruleListResponse postEventWhiteruleList(PostEventWhiteruleListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.postEventWhiteruleListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Finishes the test for a custom rule.</p>
     * 
     * @param request PostFinishCustomizeRuleTestRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PostFinishCustomizeRuleTestResponse
     */
    public PostFinishCustomizeRuleTestResponse postFinishCustomizeRuleTestWithOptions(PostFinishCustomizeRuleTestRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PostFinishCustomizeRuleTest"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PostFinishCustomizeRuleTestResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Finishes the test for a custom rule.</p>
     * 
     * @param request PostFinishCustomizeRuleTestRequest
     * @return PostFinishCustomizeRuleTestResponse
     */
    public PostFinishCustomizeRuleTestResponse postFinishCustomizeRuleTest(PostFinishCustomizeRuleTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.postFinishCustomizeRuleTestWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the statuses of custom rules.</p>
     * 
     * @param request PostRuleStatusChangeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PostRuleStatusChangeResponse
     */
    public PostRuleStatusChangeResponse postRuleStatusChangeWithOptions(PostRuleStatusChangeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ids)) {
            body.put("Ids", request.ids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inUse)) {
            body.put("InUse", request.inUse);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            body.put("RuleType", request.ruleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PostRuleStatusChange"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PostRuleStatusChangeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the statuses of custom rules.</p>
     * 
     * @param request PostRuleStatusChangeRequest
     * @return PostRuleStatusChangeResponse
     */
    public PostRuleStatusChangeResponse postRuleStatusChange(PostRuleStatusChangeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.postRuleStatusChangeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Releases storage space. This operation is irreversible and causes data loss. Use with caution.</p>
     * 
     * @param request RestoreCapacityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestoreCapacityResponse
     */
    public RestoreCapacityResponse restoreCapacityWithOptions(RestoreCapacityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestoreCapacity"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestoreCapacityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Releases storage space. This operation is irreversible and causes data loss. Use with caution.</p>
     * 
     * @param request RestoreCapacityRequest
     * @return RestoreCapacityResponse
     */
    public RestoreCapacityResponse restoreCapacity(RestoreCapacityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restoreCapacityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sets user settings, such as the storage duration and storage region.</p>
     * 
     * @param request SetStorageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetStorageResponse
     */
    public SetStorageResponse setStorageWithOptions(SetStorageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttl)) {
            body.put("Ttl", request.ttl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetStorage"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetStorageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sets user settings, such as the storage duration and storage region.</p>
     * 
     * @param request SetStorageRequest
     * @return SetStorageResponse
     */
    public SetStorageResponse setStorage(SetStorageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setStorageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Submits a batch of log ingestion tasks.</p>
     * 
     * @param request SubmitImportLogTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitImportLogTasksResponse
     */
    public SubmitImportLogTasksResponse submitImportLogTasksWithOptions(SubmitImportLogTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accounts)) {
            body.put("Accounts", request.accounts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoImported)) {
            body.put("AutoImported", request.autoImported);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudCode)) {
            body.put("CloudCode", request.cloudCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logCodes)) {
            body.put("LogCodes", request.logCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodCode)) {
            body.put("ProdCode", request.prodCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitImportLogTasks"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitImportLogTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Submits a batch of log ingestion tasks.</p>
     * 
     * @param request SubmitImportLogTasksRequest
     * @return SubmitImportLogTasksResponse
     */
    public SubmitImportLogTasksResponse submitImportLogTasks(SubmitImportLogTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitImportLogTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the status of an automated response rule.</p>
     * 
     * @param request UpdateAutomateResponseConfigStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAutomateResponseConfigStatusResponse
     */
    public UpdateAutomateResponseConfigStatusResponse updateAutomateResponseConfigStatusWithOptions(UpdateAutomateResponseConfigStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ids)) {
            body.put("Ids", request.ids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inUse)) {
            body.put("InUse", request.inUse);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAutomateResponseConfigStatus"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAutomateResponseConfigStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the status of an automated response rule.</p>
     * 
     * @param request UpdateAutomateResponseConfigStatusRequest
     * @return UpdateAutomateResponseConfigStatusResponse
     */
    public UpdateAutomateResponseConfigStatusResponse updateAutomateResponseConfigStatus(UpdateAutomateResponseConfigStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAutomateResponseConfigStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds or updates alert whitelist rules.</p>
     * 
     * @param request UpdateWhiteRuleListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWhiteRuleListResponse
     */
    public UpdateWhiteRuleListResponse updateWhiteRuleListWithOptions(UpdateWhiteRuleListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expression)) {
            body.put("Expression", request.expression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentUuid)) {
            body.put("IncidentUuid", request.incidentUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            body.put("RoleType", request.roleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whiteRuleId)) {
            body.put("WhiteRuleId", request.whiteRuleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWhiteRuleList"),
            new TeaPair("version", "2022-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWhiteRuleListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds or updates alert whitelist rules.</p>
     * 
     * @param request UpdateWhiteRuleListRequest
     * @return UpdateWhiteRuleListResponse
     */
    public UpdateWhiteRuleListResponse updateWhiteRuleList(UpdateWhiteRuleListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWhiteRuleListWithOptions(request, runtime);
    }
}
