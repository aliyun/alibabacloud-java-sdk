// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs_workbench20251111;

import com.aliyun.tea.*;
import com.aliyun.ecs_workbench20251111.models.*;

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
     * <b>description</b> :
     * <p>查询Workbench终端配置</p>
     * 
     * <b>summary</b> : 
     * <p>查询Workbench终端配置</p>
     * 
     * @param request DescribeTerminalSettingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTerminalSettingsResponse
     */
    public DescribeTerminalSettingsResponse describeTerminalSettingsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTerminalSettings"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTerminalSettingsResponse());
    }

    /**
     * <b>description</b> :
     * <p>查询Workbench终端配置</p>
     * 
     * <b>summary</b> : 
     * <p>查询Workbench终端配置</p>
     * @return DescribeTerminalSettingsResponse
     */
    public DescribeTerminalSettingsResponse describeTerminalSettings() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTerminalSettingsWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>修改Workbench终端配置</p>
     * 
     * <b>summary</b> : 
     * <p>修改Workbench终端配置</p>
     * 
     * @param tmpReq ModifyTerminalSettingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyTerminalSettingsResponse
     */
    public ModifyTerminalSettingsResponse modifyTerminalSettingsWithOptions(ModifyTerminalSettingsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyTerminalSettingsShrinkRequest request = new ModifyTerminalSettingsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.passwordlessLoginConfig)) {
            request.passwordlessLoginConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.passwordlessLoginConfig, "PasswordlessLoginConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.passwordlessLoginConfigShrink)) {
            query.put("PasswordlessLoginConfig", request.passwordlessLoginConfigShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTerminalSettings"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTerminalSettingsResponse());
    }

    /**
     * <b>description</b> :
     * <p>修改Workbench终端配置</p>
     * 
     * <b>summary</b> : 
     * <p>修改Workbench终端配置</p>
     * 
     * @param request ModifyTerminalSettingsRequest
     * @return ModifyTerminalSettingsResponse
     */
    public ModifyTerminalSettingsResponse modifyTerminalSettings(ModifyTerminalSettingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTerminalSettingsWithOptions(request, runtime);
    }
}
