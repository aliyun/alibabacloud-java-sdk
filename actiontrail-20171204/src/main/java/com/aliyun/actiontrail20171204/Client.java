// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20171204;

import com.aliyun.tea.*;
import com.aliyun.actiontrail20171204.models.*;
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
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-2-pop", "actiontrail.ap-northeast-1.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-edge-1", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-fujian", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-wuhan", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "actiontrail.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "actiontrail.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "actiontrail.ap-northeast-1.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "actiontrail.ap-northeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("actiontrail", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateTrailResponse createTrailWithOptions(CreateTrailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateTrail", "2017-12-04", "HTTPS", "POST", "AK", "json", req, runtime), new CreateTrailResponse());
    }

    public CreateTrailResponse createTrail(CreateTrailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTrailWithOptions(request, runtime);
    }

    public DeleteTrailResponse deleteTrailWithOptions(DeleteTrailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteTrail", "2017-12-04", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteTrailResponse());
    }

    public DeleteTrailResponse deleteTrail(DeleteTrailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTrailWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeRegions", "2017-12-04", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(runtime);
    }

    public DescribeTrailsResponse describeTrailsWithOptions(DescribeTrailsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeTrails", "2017-12-04", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeTrailsResponse());
    }

    public DescribeTrailsResponse describeTrails(DescribeTrailsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTrailsWithOptions(request, runtime);
    }

    public GetTrailStatusResponse getTrailStatusWithOptions(GetTrailStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTrailStatus", "2017-12-04", "HTTPS", "POST", "AK", "json", req, runtime), new GetTrailStatusResponse());
    }

    public GetTrailStatusResponse getTrailStatus(GetTrailStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTrailStatusWithOptions(request, runtime);
    }

    public LookupEventsResponse lookupEventsWithOptions(LookupEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("LookupEvents", "2017-12-04", "HTTPS", "POST", "AK", "json", req, runtime), new LookupEventsResponse());
    }

    public LookupEventsResponse lookupEvents(LookupEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.lookupEventsWithOptions(request, runtime);
    }

    public StartLoggingResponse startLoggingWithOptions(StartLoggingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("StartLogging", "2017-12-04", "HTTPS", "GET", "AK", "json", req, runtime), new StartLoggingResponse());
    }

    public StartLoggingResponse startLogging(StartLoggingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startLoggingWithOptions(request, runtime);
    }

    public StopLoggingResponse stopLoggingWithOptions(StopLoggingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("StopLogging", "2017-12-04", "HTTPS", "GET", "AK", "json", req, runtime), new StopLoggingResponse());
    }

    public StopLoggingResponse stopLogging(StopLoggingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopLoggingWithOptions(request, runtime);
    }

    public UpdateTrailResponse updateTrailWithOptions(UpdateTrailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateTrail", "2017-12-04", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateTrailResponse());
    }

    public UpdateTrailResponse updateTrail(UpdateTrailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateTrailWithOptions(request, runtime);
    }
}
