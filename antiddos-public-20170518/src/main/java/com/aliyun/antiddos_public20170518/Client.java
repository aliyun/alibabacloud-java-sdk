// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518;

import com.aliyun.tea.*;
import com.aliyun.antiddos_public20170518.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-qingdao", "antiddos.aliyuncs.com"),
            new TeaPair("cn-beijing", "antiddos.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "antiddos-openapi.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "antiddos-openapi.cn-huhehaote.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "antiddos-openapi.cn-wulanchabu.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "antiddos.aliyuncs.com"),
            new TeaPair("cn-shanghai", "antiddos.aliyuncs.com"),
            new TeaPair("cn-nanjing", "antiddos-openapi.cn-hangzhou-cloudstone.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "antiddos.aliyuncs.com"),
            new TeaPair("cn-heyuan", "antiddos-openapi.cn-heyuan.aliyuncs.com"),
            new TeaPair("cn-guangzhou", "antiddos-openapi.cn-guangzhou.aliyuncs.com"),
            new TeaPair("cn-chengdu", "antiddos-openapi.cn-chengdu.aliyuncs.com"),
            new TeaPair("cn-hongkong", "antiddos.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "antiddos-openapi.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-2", "antiddos-openapi.ap-northeast-2.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "antiddos.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "antiddos-openapi.ap-southeast-2.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "antiddos-openapi.ap-southeast-3.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "antiddos-openapi.ap-southeast-5.aliyuncs.com"),
            new TeaPair("ap-southeast-6", "antiddos-openapi.ap-southeast-6.aliyuncs.com"),
            new TeaPair("us-east-1", "antiddos.aliyuncs.com"),
            new TeaPair("us-west-1", "antiddos.aliyuncs.com"),
            new TeaPair("eu-west-1", "antiddos-openapi.eu-west-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "antiddos-openapi.eu-central-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "antiddos-openapi.ap-south-1.aliyuncs.com"),
            new TeaPair("me-east-1", "antiddos-openapi.me-east-1.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "antiddos.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "antiddos.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "antiddos.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "antiddos.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "antiddos.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "antiddos.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "antiddos.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "antiddos.aliyuncs.com"),
            new TeaPair("cn-edge-1", "antiddos.aliyuncs.com"),
            new TeaPair("cn-fujian", "antiddos.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "antiddos.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "antiddos.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "antiddos.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "antiddos.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "antiddos.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "antiddos.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "antiddos.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "antiddos.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "antiddos.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "antiddos.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "antiddos.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "antiddos.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "antiddos.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "antiddos.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "antiddos.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "antiddos.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "antiddos.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "antiddos.aliyuncs.com"),
            new TeaPair("cn-wuhan", "antiddos.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "antiddos.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "antiddos.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "antiddos.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "antiddos-openapi.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "antiddos.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "antiddos.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "antiddos.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("antiddos-public", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>You can call the DescribeBgpPackByIp operation to query the configurations of the Anti-DDoS Origin instance that is associated with an asset. The configurations include the basic protection threshold, burstable protection threshold, and expiration time.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the configurations of the Anti-DDoS Origin instance that is associated with an asset. The asset is assigned a public IP address.</p>
     * 
     * @param request DescribeBgpPackByIpRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBgpPackByIpResponse
     */
    public DescribeBgpPackByIpResponse describeBgpPackByIpWithOptions(DescribeBgpPackByIpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ddosRegionId)) {
            query.put("DdosRegionId", request.ddosRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBgpPackByIp"),
            new TeaPair("version", "2017-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBgpPackByIpResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeBgpPackByIpResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeBgpPackByIp operation to query the configurations of the Anti-DDoS Origin instance that is associated with an asset. The configurations include the basic protection threshold, burstable protection threshold, and expiration time.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the configurations of the Anti-DDoS Origin instance that is associated with an asset. The asset is assigned a public IP address.</p>
     * 
     * @param request DescribeBgpPackByIpRequest
     * @return DescribeBgpPackByIpResponse
     */
    public DescribeBgpPackByIpResponse describeBgpPackByIp(DescribeBgpPackByIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBgpPackByIpWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeCap operation to query the download link to the traffic data that is captured when a DDoS attack event occurs. You can download the traffic data from the download link and use the data as evidence.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the download link to the traffic data that is captured when a DDoS attack event occurs.</p>
     * 
     * @param request DescribeCapRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCapResponse
     */
    public DescribeCapResponse describeCapWithOptions(DescribeCapRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.begTime)) {
            query.put("BegTime", request.begTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ddosRegionId)) {
            query.put("DdosRegionId", request.ddosRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetIp)) {
            query.put("InternetIp", request.internetIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCap"),
            new TeaPair("version", "2017-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCapResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeCapResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeCap operation to query the download link to the traffic data that is captured when a DDoS attack event occurs. You can download the traffic data from the download link and use the data as evidence.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the download link to the traffic data that is captured when a DDoS attack event occurs.</p>
     * 
     * @param request DescribeCapRequest
     * @return DescribeCapResponse
     */
    public DescribeCapResponse describeCap(DescribeCapRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCapWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of assets that are under DDoS attacks in a specific region. The assets are assigned public IP addresses.</p>
     * 
     * @param request DescribeDdosCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDdosCountResponse
     */
    public DescribeDdosCountResponse describeDdosCountWithOptions(DescribeDdosCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ddosRegionId)) {
            query.put("DdosRegionId", request.ddosRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDdosCount"),
            new TeaPair("version", "2017-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDdosCountResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeDdosCountResponse());
        }

    }

    /**
     * <b>description</b> :
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of assets that are under DDoS attacks in a specific region. The assets are assigned public IP addresses.</p>
     * 
     * @param request DescribeDdosCountRequest
     * @return DescribeDdosCountResponse
     */
    public DescribeDdosCountResponse describeDdosCount(DescribeDdosCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDdosCountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeDdosCredit operation to query the details of the security credit score of the current Alibaba Cloud account in a specific region. The details include the security credit score, security credit level, and the time period after which blackhole filtering is automatically deactivated.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of the security credit score of the current Alibaba Cloud account in a specific region.</p>
     * 
     * @param request DescribeDdosCreditRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDdosCreditResponse
     */
    public DescribeDdosCreditResponse describeDdosCreditWithOptions(DescribeDdosCreditRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ddosRegionId)) {
            query.put("DdosRegionId", request.ddosRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDdosCredit"),
            new TeaPair("version", "2017-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDdosCreditResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeDdosCreditResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeDdosCredit operation to query the details of the security credit score of the current Alibaba Cloud account in a specific region. The details include the security credit score, security credit level, and the time period after which blackhole filtering is automatically deactivated.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of the security credit score of the current Alibaba Cloud account in a specific region.</p>
     * 
     * @param request DescribeDdosCreditRequest
     * @return DescribeDdosCreditResponse
     */
    public DescribeDdosCreditResponse describeDdosCredit(DescribeDdosCreditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDdosCreditWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeDdosEventList operation to query the details of the DDoS attack events that occur on an asset by page. The details include the start time, end time, and status of each DDoS attack event.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of the DDoS attack events that occur on an asset. The asset is assigned a public IP address.</p>
     * 
     * @param request DescribeDdosEventListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDdosEventListResponse
     */
    public DescribeDdosEventListResponse describeDdosEventListWithOptions(DescribeDdosEventListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ddosRegionId)) {
            query.put("DdosRegionId", request.ddosRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetIp)) {
            query.put("InternetIp", request.internetIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDdosEventList"),
            new TeaPair("version", "2017-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDdosEventListResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeDdosEventListResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeDdosEventList operation to query the details of the DDoS attack events that occur on an asset by page. The details include the start time, end time, and status of each DDoS attack event.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of the DDoS attack events that occur on an asset. The asset is assigned a public IP address.</p>
     * 
     * @param request DescribeDdosEventListRequest
     * @return DescribeDdosEventListResponse
     */
    public DescribeDdosEventListResponse describeDdosEventList(DescribeDdosEventListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDdosEventListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeDdosThreshold operation to query the details of the DDoS mitigation thresholds or traffic scrubbing thresholds for specified assets. The details include the current traffic scrubbing threshold, maximum traffic scrubbing threshold, current DDoS mitigation threshold, and maximum DDoS mitigation threshold.</p>
     * <h3>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of the DDoS mitigation thresholds or traffic scrubbing thresholds for specified assets. The assets can be elastic IP addresses (EIPs). The assets can also be Elastic Compute Service (ECS) instances or Server Load Balancer (SLB) instances that are assigned public IP addresses.</p>
     * 
     * @param request DescribeDdosThresholdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDdosThresholdResponse
     */
    public DescribeDdosThresholdResponse describeDdosThresholdWithOptions(DescribeDdosThresholdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ddosRegionId)) {
            query.put("DdosRegionId", request.ddosRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ddosType)) {
            query.put("DdosType", request.ddosType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDdosThreshold"),
            new TeaPair("version", "2017-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDdosThresholdResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeDdosThresholdResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeDdosThreshold operation to query the details of the DDoS mitigation thresholds or traffic scrubbing thresholds for specified assets. The details include the current traffic scrubbing threshold, maximum traffic scrubbing threshold, current DDoS mitigation threshold, and maximum DDoS mitigation threshold.</p>
     * <h3>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of the DDoS mitigation thresholds or traffic scrubbing thresholds for specified assets. The assets can be elastic IP addresses (EIPs). The assets can also be Elastic Compute Service (ECS) instances or Server Load Balancer (SLB) instances that are assigned public IP addresses.</p>
     * 
     * @param request DescribeDdosThresholdRequest
     * @return DescribeDdosThresholdResponse
     */
    public DescribeDdosThresholdResponse describeDdosThreshold(DescribeDdosThresholdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDdosThresholdWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeInstance operation to query the details of the assets that are within the current Alibaba Cloud account by page. The details include the IDs and IP addresses of the assets, the basic protection thresholds and traffic scrubbing thresholds that are configured for the assets in Anti-DDoS Origin, and whether the assets are associated with Anti-DDoS Origin instances.</p>
     * <h3><a href="#qps-"></a>Limits</h3>
     * <p>You can call this operation up to 200 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of the assets within the current Alibaba Cloud account. The assets can be elastic IP addresses (EIPs). The assets can also be Elastic Compute Service (ECS) instances or Server Load Balancer (SLB) instances that are assigned public IP addresses. This operation is phased out. We recommend that you use the DescribeInstanceIpAddress operation.</p>
     * 
     * @param request DescribeInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceResponse
     */
    public DescribeInstanceResponse describeInstanceWithOptions(DescribeInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ddosRegionId)) {
            query.put("DdosRegionId", request.ddosRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ddosStatus)) {
            query.put("DdosStatus", request.ddosStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIp)) {
            query.put("InstanceIp", request.instanceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstance"),
            new TeaPair("version", "2017-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeInstanceResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeInstance operation to query the details of the assets that are within the current Alibaba Cloud account by page. The details include the IDs and IP addresses of the assets, the basic protection thresholds and traffic scrubbing thresholds that are configured for the assets in Anti-DDoS Origin, and whether the assets are associated with Anti-DDoS Origin instances.</p>
     * <h3><a href="#qps-"></a>Limits</h3>
     * <p>You can call this operation up to 200 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of the assets within the current Alibaba Cloud account. The assets can be elastic IP addresses (EIPs). The assets can also be Elastic Compute Service (ECS) instances or Server Load Balancer (SLB) instances that are assigned public IP addresses. This operation is phased out. We recommend that you use the DescribeInstanceIpAddress operation.</p>
     * 
     * @param request DescribeInstanceRequest
     * @return DescribeInstanceResponse
     */
    public DescribeInstanceResponse describeInstance(DescribeInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If one or more assets of the current Alibaba Cloud account are added to an Anti-DDoS Origin instance, you can call the DescribeInstanceIpAddress operation to query the DDoS mitigation information and the details of the Anti-DDoS Origin instance. The information and the details include the basic protection threshold and traffic scrubbing threshold for the assets, DDoS mitigation status of the assets, ID of the instance, and the mitigation status of the instance.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 200 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of the assets within the current Alibaba Cloud account and the details of the Anti-DDoS Origin instance to which the assets belong. The assets can be elastic IP addresses (EIPs). The assets can also be Elastic Compute Service (ECS) instances or Server Load Balancer (SLB) instances that are assigned public IP addresses.</p>
     * 
     * @param request DescribeInstanceIpAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceIpAddressResponse
     */
    public DescribeInstanceIpAddressResponse describeInstanceIpAddressWithOptions(DescribeInstanceIpAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ddosRegionId)) {
            query.put("DdosRegionId", request.ddosRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ddosStatus)) {
            query.put("DdosStatus", request.ddosStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIp)) {
            query.put("InstanceIp", request.instanceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceIpAddress"),
            new TeaPair("version", "2017-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceIpAddressResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeInstanceIpAddressResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>If one or more assets of the current Alibaba Cloud account are added to an Anti-DDoS Origin instance, you can call the DescribeInstanceIpAddress operation to query the DDoS mitigation information and the details of the Anti-DDoS Origin instance. The information and the details include the basic protection threshold and traffic scrubbing threshold for the assets, DDoS mitigation status of the assets, ID of the instance, and the mitigation status of the instance.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 200 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of the assets within the current Alibaba Cloud account and the details of the Anti-DDoS Origin instance to which the assets belong. The assets can be elastic IP addresses (EIPs). The assets can also be Elastic Compute Service (ECS) instances or Server Load Balancer (SLB) instances that are assigned public IP addresses.</p>
     * 
     * @param request DescribeInstanceIpAddressRequest
     * @return DescribeInstanceIpAddressResponse
     */
    public DescribeInstanceIpAddressResponse describeInstanceIpAddress(DescribeInstanceIpAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceIpAddressWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If one or more assets of the current Alibaba Cloud account are added to an Anti-DDoS Origin instance, you can call the DescribeIpDdosThreshold operation to query the details of the DDoS mitigation threshold or traffic scrubbing threshold for a specific asset. The details include the current traffic scrubbing threshold, maximum scrubbing threshold, current DDoS mitigation threshold, and maximum DDoS mitigation threshold.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of the DDoS mitigation thresholds or traffic scrubbing thresholds for specified assets. The assets can be elastic IP addresses (EIPs). The assets can also be Elastic Compute Service (ECS) instances or Server Load Balancer (SLB) instances that are assigned public IP addresses.</p>
     * 
     * @param request DescribeIpDdosThresholdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeIpDdosThresholdResponse
     */
    public DescribeIpDdosThresholdResponse describeIpDdosThresholdWithOptions(DescribeIpDdosThresholdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ddosRegionId)) {
            query.put("DdosRegionId", request.ddosRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ddosType)) {
            query.put("DdosType", request.ddosType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetIp)) {
            query.put("InternetIp", request.internetIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeIpDdosThreshold"),
            new TeaPair("version", "2017-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeIpDdosThresholdResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeIpDdosThresholdResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>If one or more assets of the current Alibaba Cloud account are added to an Anti-DDoS Origin instance, you can call the DescribeIpDdosThreshold operation to query the details of the DDoS mitigation threshold or traffic scrubbing threshold for a specific asset. The details include the current traffic scrubbing threshold, maximum scrubbing threshold, current DDoS mitigation threshold, and maximum DDoS mitigation threshold.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of the DDoS mitigation thresholds or traffic scrubbing thresholds for specified assets. The assets can be elastic IP addresses (EIPs). The assets can also be Elastic Compute Service (ECS) instances or Server Load Balancer (SLB) instances that are assigned public IP addresses.</p>
     * 
     * @param request DescribeIpDdosThresholdRequest
     * @return DescribeIpDdosThresholdResponse
     */
    public DescribeIpDdosThresholdResponse describeIpDdosThreshold(DescribeIpDdosThresholdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeIpDdosThresholdWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeIpLocationService operation to query the region of the public IP address for a specified asset that is within the current Alibaba Cloud account. You can also query the details of the Anti-DDoS Origin instance to which the asset is added. The details include the ID and name.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the region to which the public IP address of the asset within the current Alibaba Cloud account belongs. The asset can be an elastic IP address (EIP). The asset can also be an Elastic Compute Service (ECS) instance or Server Load Balancer (SLB) instance that is assigned a public IP address.</p>
     * 
     * @param request DescribeIpLocationServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeIpLocationServiceResponse
     */
    public DescribeIpLocationServiceResponse describeIpLocationServiceWithOptions(DescribeIpLocationServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.internetIp)) {
            query.put("InternetIp", request.internetIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeIpLocationService"),
            new TeaPair("version", "2017-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeIpLocationServiceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeIpLocationServiceResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeIpLocationService operation to query the region of the public IP address for a specified asset that is within the current Alibaba Cloud account. You can also query the details of the Anti-DDoS Origin instance to which the asset is added. The details include the ID and name.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the region to which the public IP address of the asset within the current Alibaba Cloud account belongs. The asset can be an elastic IP address (EIP). The asset can also be an Elastic Compute Service (ECS) instance or Server Load Balancer (SLB) instance that is assigned a public IP address.</p>
     * 
     * @param request DescribeIpLocationServiceRequest
     * @return DescribeIpLocationServiceResponse
     */
    public DescribeIpLocationServiceResponse describeIpLocationService(DescribeIpLocationServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeIpLocationServiceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query information about the regions in which Anti-DDoS Origin Basic is available. The information includes the region ID, region name, and code.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the regions in which Anti-DDoS Origin Basic is available.</p>
     * 
     * @param request DescribeRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2017-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeRegionsResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query information about the regions in which Anti-DDoS Origin Basic is available. The information includes the region ID, region name, and code.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the regions in which Anti-DDoS Origin Basic is available.</p>
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Changes the scrubbing thresholds for an asset that is assigned a public IP address.</p>
     * 
     * @param request ModifyDefenseThresholdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDefenseThresholdResponse
     */
    public ModifyDefenseThresholdResponse modifyDefenseThresholdWithOptions(ModifyDefenseThresholdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bps)) {
            query.put("Bps", request.bps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ddosRegionId)) {
            query.put("DdosRegionId", request.ddosRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetIp)) {
            query.put("InternetIp", request.internetIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAuto)) {
            query.put("IsAuto", request.isAuto);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pps)) {
            query.put("Pps", request.pps);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDefenseThreshold"),
            new TeaPair("version", "2017-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDefenseThresholdResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ModifyDefenseThresholdResponse());
        }

    }

    /**
     * <b>description</b> :
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Changes the scrubbing thresholds for an asset that is assigned a public IP address.</p>
     * 
     * @param request ModifyDefenseThresholdRequest
     * @return ModifyDefenseThresholdResponse
     */
    public ModifyDefenseThresholdResponse modifyDefenseThreshold(ModifyDefenseThresholdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDefenseThresholdWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the scrubbing thresholds for an asset that is assigned a public IP address. This operation is a synchronous operation that supports Terraform.</p>
     * 
     * @param request ModifyIpDefenseThresholdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyIpDefenseThresholdResponse
     */
    public ModifyIpDefenseThresholdResponse modifyIpDefenseThresholdWithOptions(ModifyIpDefenseThresholdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bps)) {
            query.put("Bps", request.bps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ddosRegionId)) {
            query.put("DdosRegionId", request.ddosRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetIp)) {
            query.put("InternetIp", request.internetIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAuto)) {
            query.put("IsAuto", request.isAuto);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pps)) {
            query.put("Pps", request.pps);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyIpDefenseThreshold"),
            new TeaPair("version", "2017-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyIpDefenseThresholdResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ModifyIpDefenseThresholdResponse());
        }

    }

    /**
     * <b>description</b> :
     * <h3>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the scrubbing thresholds for an asset that is assigned a public IP address. This operation is a synchronous operation that supports Terraform.</p>
     * 
     * @param request ModifyIpDefenseThresholdRequest
     * @return ModifyIpDefenseThresholdResponse
     */
    public ModifyIpDefenseThresholdResponse modifyIpDefenseThreshold(ModifyIpDefenseThresholdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyIpDefenseThresholdWithOptions(request, runtime);
    }
}
