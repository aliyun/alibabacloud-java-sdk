// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs_workbench20220220;

import com.aliyun.tea.*;
import com.aliyun.ecs_workbench20220220.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ecs-workbench", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>获取实例录屏配置</p>
     * 
     * @param request GetInstanceRecordConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceRecordConfigResponse
     */
    public GetInstanceRecordConfigResponse getInstanceRecordConfigWithOptions(GetInstanceRecordConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceRecordConfig"),
            new TeaPair("version", "2022-02-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceRecordConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例录屏配置</p>
     * 
     * @param request GetInstanceRecordConfigRequest
     * @return GetInstanceRecordConfigResponse
     */
    public GetInstanceRecordConfigResponse getInstanceRecordConfig(GetInstanceRecordConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceRecordConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例录屏记录列表</p>
     * 
     * @param request ListInstanceRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstanceRecordsResponse
     */
    public ListInstanceRecordsResponse listInstanceRecordsWithOptions(ListInstanceRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstanceRecords"),
            new TeaPair("version", "2022-02-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例录屏记录列表</p>
     * 
     * @param request ListInstanceRecordsRequest
     * @return ListInstanceRecordsResponse
     */
    public ListInstanceRecordsResponse listInstanceRecords(ListInstanceRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstanceRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>登录实例</p>
     * 
     * @param request LoginInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LoginInstanceResponse
     */
    public LoginInstanceResponse loginInstanceWithOptions(LoginInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceLoginInfo)) {
            query.put("InstanceLoginInfo", request.instanceLoginInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partnerInfo)) {
            query.put("PartnerInfo", request.partnerInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAccount)) {
            query.put("UserAccount", request.userAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LoginInstance"),
            new TeaPair("version", "2022-02-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LoginInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>登录实例</p>
     * 
     * @param request LoginInstanceRequest
     * @return LoginInstanceResponse
     */
    public LoginInstanceResponse loginInstance(LoginInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.loginInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设置实例录屏配置</p>
     * 
     * @param request SetInstanceRecordConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetInstanceRecordConfigResponse
     */
    public SetInstanceRecordConfigResponse setInstanceRecordConfigWithOptions(SetInstanceRecordConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            body.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expirationDays)) {
            body.put("ExpirationDays", request.expirationDays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordStorageTarget)) {
            body.put("RecordStorageTarget", request.recordStorageTarget);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetInstanceRecordConfig"),
            new TeaPair("version", "2022-02-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetInstanceRecordConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设置实例录屏配置</p>
     * 
     * @param request SetInstanceRecordConfigRequest
     * @return SetInstanceRecordConfigResponse
     */
    public SetInstanceRecordConfigResponse setInstanceRecordConfig(SetInstanceRecordConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setInstanceRecordConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看实例录屏内容</p>
     * 
     * @param request ViewInstanceRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ViewInstanceRecordsResponse
     */
    public ViewInstanceRecordsResponse viewInstanceRecordsWithOptions(ViewInstanceRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terminalSessionToken)) {
            body.put("TerminalSessionToken", request.terminalSessionToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ViewInstanceRecords"),
            new TeaPair("version", "2022-02-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ViewInstanceRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看实例录屏内容</p>
     * 
     * @param request ViewInstanceRecordsRequest
     * @return ViewInstanceRecordsResponse
     */
    public ViewInstanceRecordsResponse viewInstanceRecords(ViewInstanceRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.viewInstanceRecordsWithOptions(request, runtime);
    }
}
