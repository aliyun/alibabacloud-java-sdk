// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.metaspace20221014;

import com.aliyun.tea.*;
import com.aliyun.metaspace20221014.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("metaspace", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API为内部使用，主要用于协同者发起流协同。</li>
     * <li><code>DependOnMainStream</code>参数指定了是否依赖主流的状态来建立或断开协同流。</li>
     * <li>当<code>InitiatorType</code>设置为强制协同类型时（如<code>ADMIN_INITIATE_FORCE</code>或<code>COORDINATOR_INITIATE_FORCE</code>），将返回一个<code>CoordinateTicket</code>。</li>
     * <li>协同资源列表<code>CoordinationResourceCandidates</code>中必须包含至少一项资源信息，并且所有提供的资源ID、类型和地区等信息需准确无误。</li>
     * <li>确保<code>OwnerAliUid</code>与协同者的租户ID相同，否则可能无法成功发起协同请求。</li>
     * <li>对于AD用户，请务必填写<code>AdDomainName</code>字段。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>协同者发起流协同请求并获取协同ticket的API接口。</p>
     * 
     * @param request ApplyCoordinationForCoordinatorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyCoordinationForCoordinatorResponse
     */
    public ApplyCoordinationForCoordinatorResponse applyCoordinationForCoordinatorWithOptions(ApplyCoordinationForCoordinatorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.coordinationResourceCandidates)) {
            bodyFlat.put("CoordinationResourceCandidates", request.coordinationResourceCandidates);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initiatorType)) {
            body.put("InitiatorType", request.initiatorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            body.put("Uuid", request.uuid);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyCoordinationForCoordinator"),
            new TeaPair("version", "2022-10-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyCoordinationForCoordinatorResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API为内部使用，主要用于协同者发起流协同。</li>
     * <li><code>DependOnMainStream</code>参数指定了是否依赖主流的状态来建立或断开协同流。</li>
     * <li>当<code>InitiatorType</code>设置为强制协同类型时（如<code>ADMIN_INITIATE_FORCE</code>或<code>COORDINATOR_INITIATE_FORCE</code>），将返回一个<code>CoordinateTicket</code>。</li>
     * <li>协同资源列表<code>CoordinationResourceCandidates</code>中必须包含至少一项资源信息，并且所有提供的资源ID、类型和地区等信息需准确无误。</li>
     * <li>确保<code>OwnerAliUid</code>与协同者的租户ID相同，否则可能无法成功发起协同请求。</li>
     * <li>对于AD用户，请务必填写<code>AdDomainName</code>字段。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>协同者发起流协同请求并获取协同ticket的API接口。</p>
     * 
     * @param request ApplyCoordinationForCoordinatorRequest
     * @return ApplyCoordinationForCoordinatorResponse
     */
    public ApplyCoordinationForCoordinatorResponse applyCoordinationForCoordinator(ApplyCoordinationForCoordinatorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyCoordinationForCoordinatorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>取消协同请求</p>
     * 
     * @param request CancelCoordinationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelCoordinationResponse
     */
    public CancelCoordinationResponse cancelCoordinationWithOptions(CancelCoordinationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.coIds)) {
            bodyFlat.put("CoIds", request.coIds);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelCoordination"),
            new TeaPair("version", "2022-10-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelCoordinationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>取消协同请求</p>
     * 
     * @param request CancelCoordinationRequest
     * @return CancelCoordinationResponse
     */
    public CancelCoordinationResponse cancelCoordination(CancelCoordinationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelCoordinationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取协同流连接ticket</p>
     * 
     * @param request GetCoordinationTicketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCoordinationTicketResponse
     */
    public GetCoordinationTicketResponse getCoordinationTicketWithOptions(GetCoordinationTicketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.coId)) {
            body.put("CoId", request.coId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCoordinationTicket"),
            new TeaPair("version", "2022-10-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCoordinationTicketResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取协同流连接ticket</p>
     * 
     * @param request GetCoordinationTicketRequest
     * @return GetCoordinationTicketResponse
     */
    public GetCoordinationTicketResponse getCoordinationTicket(GetCoordinationTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCoordinationTicketWithOptions(request, runtime);
    }
}
