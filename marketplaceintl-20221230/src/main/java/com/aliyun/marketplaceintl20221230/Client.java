// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20221230;

import com.aliyun.tea.*;
import com.aliyun.marketplaceintl20221230.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("marketplaceintl", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>卖家查询实例列表</p>
     * 
     * @param request DescribeSellerInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSellerInstancesResponse
     */
    public DescribeSellerInstancesResponse describeSellerInstancesWithOptions(DescribeSellerInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceStatus)) {
            query.put("InstanceStatus", request.instanceStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSellerInstances"),
            new TeaPair("version", "2022-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSellerInstancesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeSellerInstancesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>卖家查询实例列表</p>
     * 
     * @param request DescribeSellerInstancesRequest
     * @return DescribeSellerInstancesResponse
     */
    public DescribeSellerInstancesResponse describeSellerInstances(DescribeSellerInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSellerInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>isv推送实例消息给用户</p>
     * 
     * @param request NoticeInstanceUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return NoticeInstanceUserResponse
     */
    public NoticeInstanceUserResponse noticeInstanceUserWithOptions(NoticeInstanceUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noticeParam)) {
            body.put("NoticeParam", request.noticeParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noticeType)) {
            body.put("NoticeType", request.noticeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "NoticeInstanceUser"),
            new TeaPair("version", "2022-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new NoticeInstanceUserResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new NoticeInstanceUserResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>isv推送实例消息给用户</p>
     * 
     * @param request NoticeInstanceUserRequest
     * @return NoticeInstanceUserResponse
     */
    public NoticeInstanceUserResponse noticeInstanceUser(NoticeInstanceUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.noticeInstanceUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>国际云市场推送计量数据</p>
     * 
     * @param request PushMeteringDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushMeteringDataResponse
     */
    public PushMeteringDataResponse pushMeteringDataWithOptions(PushMeteringDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gmtCreate)) {
            body.put("GmtCreate", request.gmtCreate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.meteringData)) {
            body.put("MeteringData", request.meteringData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushMeteringData"),
            new TeaPair("version", "2022-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new PushMeteringDataResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new PushMeteringDataResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>国际云市场推送计量数据</p>
     * 
     * @param request PushMeteringDataRequest
     * @return PushMeteringDataResponse
     */
    public PushMeteringDataResponse pushMeteringData(PushMeteringDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pushMeteringDataWithOptions(request, runtime);
    }
}
