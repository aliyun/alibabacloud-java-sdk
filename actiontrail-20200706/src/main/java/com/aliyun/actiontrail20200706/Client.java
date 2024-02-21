// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706;

import com.aliyun.tea.*;
import com.aliyun.actiontrail20200706.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
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

    /**
      * Take note of the following limits:
      * - You must have created and configured a single-account trail to deliver events to Log Service by calling the [CreateTrail](~~212313~~) operation.
      * - Only one historical event delivery task can be running at a time within an Alibaba Cloud account.
      * This topic shows you how to create a historical event delivery task for a sample trail named `trail-name`.
      *
      * @param request CreateDeliveryHistoryJobRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateDeliveryHistoryJobResponse
     */
    public CreateDeliveryHistoryJobResponse createDeliveryHistoryJobWithOptions(CreateDeliveryHistoryJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trailName)) {
            query.put("TrailName", request.trailName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDeliveryHistoryJob"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDeliveryHistoryJobResponse());
    }

    /**
      * Take note of the following limits:
      * - You must have created and configured a single-account trail to deliver events to Log Service by calling the [CreateTrail](~~212313~~) operation.
      * - Only one historical event delivery task can be running at a time within an Alibaba Cloud account.
      * This topic shows you how to create a historical event delivery task for a sample trail named `trail-name`.
      *
      * @param request CreateDeliveryHistoryJobRequest
      * @return CreateDeliveryHistoryJobResponse
     */
    public CreateDeliveryHistoryJobResponse createDeliveryHistoryJob(CreateDeliveryHistoryJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDeliveryHistoryJobWithOptions(request, runtime);
    }

    /**
      * You can create a trail to deliver events to Log Service, Object Storage Service (OSS), or both. Before you call this operation to create a trail, make sure that the following requirements are met:
      * *   Deliver events to Log Service: A project is created in Log Service.
      * **
      * **Description** After you create a trail to deliver events to Log Service, a Logstore whose name is in the `actiontrail_<Trail name>` format is automatically created and optimally configured for subsequent auditing. Indexes and a dashboard are created for the Logstore to facilitate event queries. You cannot manually write data to the Logstore. This ensures data accuracy. You do not need to create a Logstore in advance.
      * *   Deliver events to OSS: A bucket is created in OSS. This topic provides an example on how to call the API operation to create a single-account trail named `trail-test` to deliver events to an OSS bucket named `audit-log`.
      *
      * @param request CreateTrailRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateTrailResponse
     */
    public CreateTrailResponse createTrailWithOptions(CreateTrailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventRW)) {
            query.put("EventRW", request.eventRW);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isOrganizationTrail)) {
            query.put("IsOrganizationTrail", request.isOrganizationTrail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxComputeProjectArn)) {
            query.put("MaxComputeProjectArn", request.maxComputeProjectArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxComputeWriteRoleArn)) {
            query.put("MaxComputeWriteRoleArn", request.maxComputeWriteRoleArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossBucketName)) {
            query.put("OssBucketName", request.ossBucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossKeyPrefix)) {
            query.put("OssKeyPrefix", request.ossKeyPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossWriteRoleArn)) {
            query.put("OssWriteRoleArn", request.ossWriteRoleArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsProjectArn)) {
            query.put("SlsProjectArn", request.slsProjectArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsWriteRoleArn)) {
            query.put("SlsWriteRoleArn", request.slsWriteRoleArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trailRegion)) {
            query.put("TrailRegion", request.trailRegion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTrail"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTrailResponse());
    }

    /**
      * You can create a trail to deliver events to Log Service, Object Storage Service (OSS), or both. Before you call this operation to create a trail, make sure that the following requirements are met:
      * *   Deliver events to Log Service: A project is created in Log Service.
      * **
      * **Description** After you create a trail to deliver events to Log Service, a Logstore whose name is in the `actiontrail_<Trail name>` format is automatically created and optimally configured for subsequent auditing. Indexes and a dashboard are created for the Logstore to facilitate event queries. You cannot manually write data to the Logstore. This ensures data accuracy. You do not need to create a Logstore in advance.
      * *   Deliver events to OSS: A bucket is created in OSS. This topic provides an example on how to call the API operation to create a single-account trail named `trail-test` to deliver events to an OSS bucket named `audit-log`.
      *
      * @param request CreateTrailRequest
      * @return CreateTrailResponse
     */
    public CreateTrailResponse createTrail(CreateTrailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTrailWithOptions(request, runtime);
    }

    /**
      * This topic describes how to delete a sample historical event delivery task whose ID is `16602`.
      *
      * @param request DeleteDeliveryHistoryJobRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteDeliveryHistoryJobResponse
     */
    public DeleteDeliveryHistoryJobResponse deleteDeliveryHistoryJobWithOptions(DeleteDeliveryHistoryJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDeliveryHistoryJob"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDeliveryHistoryJobResponse());
    }

    /**
      * This topic describes how to delete a sample historical event delivery task whose ID is `16602`.
      *
      * @param request DeleteDeliveryHistoryJobRequest
      * @return DeleteDeliveryHistoryJobResponse
     */
    public DeleteDeliveryHistoryJobResponse deleteDeliveryHistoryJob(DeleteDeliveryHistoryJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDeliveryHistoryJobWithOptions(request, runtime);
    }

    /**
      * This topic describes how to delete a sample trail named `trail-test`.
      *
      * @param request DeleteTrailRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteTrailResponse
     */
    public DeleteTrailResponse deleteTrailWithOptions(DeleteTrailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTrail"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTrailResponse());
    }

    /**
      * This topic describes how to delete a sample trail named `trail-test`.
      *
      * @param request DeleteTrailRequest
      * @return DeleteTrailResponse
     */
    public DeleteTrailResponse deleteTrail(DeleteTrailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTrailWithOptions(request, runtime);
    }

    /**
      * For more information, see [Regions and zones](~~40654~~).
      *
      * @param request DescribeRegionsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2020-07-06"),
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

    /**
      * For more information, see [Regions and zones](~~40654~~).
      *
      * @param request DescribeRegionsRequest
      * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    /**
      * This topic shows you how to query the information about the single-account trails within an Alibaba Cloud account. In this example, the information about a trail named `test-4` is returned.
      *
      * @param request DescribeTrailsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeTrailsResponse
     */
    public DescribeTrailsResponse describeTrailsWithOptions(DescribeTrailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.includeOrganizationTrail)) {
            query.put("IncludeOrganizationTrail", request.includeOrganizationTrail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeShadowTrails)) {
            query.put("IncludeShadowTrails", request.includeShadowTrails);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nameList)) {
            query.put("NameList", request.nameList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTrails"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTrailsResponse());
    }

    /**
      * This topic shows you how to query the information about the single-account trails within an Alibaba Cloud account. In this example, the information about a trail named `test-4` is returned.
      *
      * @param request DescribeTrailsRequest
      * @return DescribeTrailsResponse
     */
    public DescribeTrailsResponse describeTrails(DescribeTrailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTrailsWithOptions(request, runtime);
    }

    public EnableInsightResponse enableInsightWithOptions(EnableInsightRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.insightType)) {
            query.put("InsightType", request.insightType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableInsight"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableInsightResponse());
    }

    public EnableInsightResponse enableInsight(EnableInsightRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableInsightWithOptions(request, runtime);
    }

    /**
      * You can call this operation to query only the information about the most recent events that are generated within 400 days after February 1, 2022 when a specified AccessKey pair is called to access Alibaba Cloud services. For more information about supported events, see [Alibaba Cloud services and events that are supported by the AccessKey pair audit feature](~~419214~~). Data is updated at 1-hour intervals, which can cause query latency. We recommend that you do not change an AccessKey pair unless required.
      *
      * @param request GetAccessKeyLastUsedEventsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetAccessKeyLastUsedEventsResponse
     */
    public GetAccessKeyLastUsedEventsResponse getAccessKeyLastUsedEventsWithOptions(GetAccessKeyLastUsedEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessKey)) {
            query.put("AccessKey", request.accessKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAccessKeyLastUsedEvents"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAccessKeyLastUsedEventsResponse());
    }

    /**
      * You can call this operation to query only the information about the most recent events that are generated within 400 days after February 1, 2022 when a specified AccessKey pair is called to access Alibaba Cloud services. For more information about supported events, see [Alibaba Cloud services and events that are supported by the AccessKey pair audit feature](~~419214~~). Data is updated at 1-hour intervals, which can cause query latency. We recommend that you do not change an AccessKey pair unless required.
      *
      * @param request GetAccessKeyLastUsedEventsRequest
      * @return GetAccessKeyLastUsedEventsResponse
     */
    public GetAccessKeyLastUsedEventsResponse getAccessKeyLastUsedEvents(GetAccessKeyLastUsedEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAccessKeyLastUsedEventsWithOptions(request, runtime);
    }

    /**
      * You can call this operation to query only the information about the most recent call of a specified AccessKey pair within 400 days after February 1, 2022. Data is updated at 1-hour intervals, which can cause query latency. We recommend that you do not change an AccessKey pair unless required.
      *
      * @param request GetAccessKeyLastUsedInfoRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetAccessKeyLastUsedInfoResponse
     */
    public GetAccessKeyLastUsedInfoResponse getAccessKeyLastUsedInfoWithOptions(GetAccessKeyLastUsedInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessKey)) {
            query.put("AccessKey", request.accessKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAccessKeyLastUsedInfo"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAccessKeyLastUsedInfoResponse());
    }

    /**
      * You can call this operation to query only the information about the most recent call of a specified AccessKey pair within 400 days after February 1, 2022. Data is updated at 1-hour intervals, which can cause query latency. We recommend that you do not change an AccessKey pair unless required.
      *
      * @param request GetAccessKeyLastUsedInfoRequest
      * @return GetAccessKeyLastUsedInfoResponse
     */
    public GetAccessKeyLastUsedInfoResponse getAccessKeyLastUsedInfo(GetAccessKeyLastUsedInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAccessKeyLastUsedInfoWithOptions(request, runtime);
    }

    /**
      * You can call this operation to query only the information about the IP addresses that are most recently used within 400 days after February 1, 2022 when a specified AccessKey pair is called to access Alibaba Cloud services. Data is updated at 1-hour intervals, which can cause query latency. We recommend that you do not change an AccessKey pair unless required.
      *
      * @param request GetAccessKeyLastUsedIpsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetAccessKeyLastUsedIpsResponse
     */
    public GetAccessKeyLastUsedIpsResponse getAccessKeyLastUsedIpsWithOptions(GetAccessKeyLastUsedIpsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessKey)) {
            query.put("AccessKey", request.accessKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAccessKeyLastUsedIps"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAccessKeyLastUsedIpsResponse());
    }

    /**
      * You can call this operation to query only the information about the IP addresses that are most recently used within 400 days after February 1, 2022 when a specified AccessKey pair is called to access Alibaba Cloud services. Data is updated at 1-hour intervals, which can cause query latency. We recommend that you do not change an AccessKey pair unless required.
      *
      * @param request GetAccessKeyLastUsedIpsRequest
      * @return GetAccessKeyLastUsedIpsResponse
     */
    public GetAccessKeyLastUsedIpsResponse getAccessKeyLastUsedIps(GetAccessKeyLastUsedIpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAccessKeyLastUsedIpsWithOptions(request, runtime);
    }

    /**
      * You can call this operation to query only the information about Alibaba Cloud services that are most recently accessed by using a specified AccessKey pair within 400 days after February 1, 2022. Data is updated at 1-hour intervals, which can cause query latency. We recommend that you do not change an AccessKey pair unless required.
      *
      * @param request GetAccessKeyLastUsedProductsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetAccessKeyLastUsedProductsResponse
     */
    public GetAccessKeyLastUsedProductsResponse getAccessKeyLastUsedProductsWithOptions(GetAccessKeyLastUsedProductsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessKey)) {
            query.put("AccessKey", request.accessKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAccessKeyLastUsedProducts"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAccessKeyLastUsedProductsResponse());
    }

    /**
      * You can call this operation to query only the information about Alibaba Cloud services that are most recently accessed by using a specified AccessKey pair within 400 days after February 1, 2022. Data is updated at 1-hour intervals, which can cause query latency. We recommend that you do not change an AccessKey pair unless required.
      *
      * @param request GetAccessKeyLastUsedProductsRequest
      * @return GetAccessKeyLastUsedProductsResponse
     */
    public GetAccessKeyLastUsedProductsResponse getAccessKeyLastUsedProducts(GetAccessKeyLastUsedProductsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAccessKeyLastUsedProductsWithOptions(request, runtime);
    }

    /**
      * You can call this operation to query only the information about resources that are most recently accessed by using a specified AccessKey pair within 400 days after February 1, 2022. Data is updated at 1-hour intervals, which can cause query latency. We recommend that you do not change an AccessKey pair unless required.
      *
      * @param request GetAccessKeyLastUsedResourcesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetAccessKeyLastUsedResourcesResponse
     */
    public GetAccessKeyLastUsedResourcesResponse getAccessKeyLastUsedResourcesWithOptions(GetAccessKeyLastUsedResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessKey)) {
            query.put("AccessKey", request.accessKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAccessKeyLastUsedResources"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAccessKeyLastUsedResourcesResponse());
    }

    /**
      * You can call this operation to query only the information about resources that are most recently accessed by using a specified AccessKey pair within 400 days after February 1, 2022. Data is updated at 1-hour intervals, which can cause query latency. We recommend that you do not change an AccessKey pair unless required.
      *
      * @param request GetAccessKeyLastUsedResourcesRequest
      * @return GetAccessKeyLastUsedResourcesResponse
     */
    public GetAccessKeyLastUsedResourcesResponse getAccessKeyLastUsedResources(GetAccessKeyLastUsedResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAccessKeyLastUsedResourcesWithOptions(request, runtime);
    }

    /**
      * This topic describes how to query the details of a historical event delivery tasks created within your Alibaba Cloud account. In this example, the details of a historical event delivery task whose ID is `16602` are returned. The sample response shows that this task is used to deliver the historical events recorded by the trail named `trail-name` to Log Service and the task is complete.
      *
      * @param request GetDeliveryHistoryJobRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetDeliveryHistoryJobResponse
     */
    public GetDeliveryHistoryJobResponse getDeliveryHistoryJobWithOptions(GetDeliveryHistoryJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeliveryHistoryJob"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeliveryHistoryJobResponse());
    }

    /**
      * This topic describes how to query the details of a historical event delivery tasks created within your Alibaba Cloud account. In this example, the details of a historical event delivery task whose ID is `16602` are returned. The sample response shows that this task is used to deliver the historical events recorded by the trail named `trail-name` to Log Service and the task is complete.
      *
      * @param request GetDeliveryHistoryJobRequest
      * @return GetDeliveryHistoryJobResponse
     */
    public GetDeliveryHistoryJobResponse getDeliveryHistoryJob(GetDeliveryHistoryJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDeliveryHistoryJobWithOptions(request, runtime);
    }

    /**
      * By default, global events are stored in the Singapore region.
      * To obtain the permissions to call the API operation, you must submit a ticket.
      *
      * @param request GetGlobalEventsStorageRegionRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetGlobalEventsStorageRegionResponse
     */
    public GetGlobalEventsStorageRegionResponse getGlobalEventsStorageRegionWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGlobalEventsStorageRegion"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGlobalEventsStorageRegionResponse());
    }

    /**
      * By default, global events are stored in the Singapore region.
      * To obtain the permissions to call the API operation, you must submit a ticket.
      *
      * @return GetGlobalEventsStorageRegionResponse
     */
    public GetGlobalEventsStorageRegionResponse getGlobalEventsStorageRegion() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getGlobalEventsStorageRegionWithOptions(runtime);
    }

    /**
      * This topic describes how to query the status of a sample single-account trail named `trail-test`.
      *
      * @param request GetTrailStatusRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetTrailStatusResponse
     */
    public GetTrailStatusResponse getTrailStatusWithOptions(GetTrailStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isOrganizationTrail)) {
            query.put("IsOrganizationTrail", request.isOrganizationTrail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTrailStatus"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTrailStatusResponse());
    }

    /**
      * This topic describes how to query the status of a sample single-account trail named `trail-test`.
      *
      * @param request GetTrailStatusRequest
      * @return GetTrailStatusResponse
     */
    public GetTrailStatusResponse getTrailStatus(GetTrailStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTrailStatusWithOptions(request, runtime);
    }

    /**
      * This topic describes how to query the historical event delivery tasks created within your Alibaba Cloud account. In this example, a historical event delivery task whose ID is `16602` is returned. This task is used to deliver historical events for the trail named `trail-name` to Log Service.
      *
      * @param request ListDeliveryHistoryJobsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListDeliveryHistoryJobsResponse
     */
    public ListDeliveryHistoryJobsResponse listDeliveryHistoryJobsWithOptions(ListDeliveryHistoryJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
            new TeaPair("action", "ListDeliveryHistoryJobs"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeliveryHistoryJobsResponse());
    }

    /**
      * This topic describes how to query the historical event delivery tasks created within your Alibaba Cloud account. In this example, a historical event delivery task whose ID is `16602` is returned. This task is used to deliver historical events for the trail named `trail-name` to Log Service.
      *
      * @param request ListDeliveryHistoryJobsRequest
      * @return ListDeliveryHistoryJobsResponse
     */
    public ListDeliveryHistoryJobsResponse listDeliveryHistoryJobs(ListDeliveryHistoryJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDeliveryHistoryJobsWithOptions(request, runtime);
    }

    /**
      * When you call this operation to query event details, you can query the event details at most twice per second.
      * > Do not frequently call this operation. You can create a trail to deliver events to Log Service. Then, you can query event details in near real time by using the real-time log consumption feature of Log Service. For more information, see [Create a single-account trail](~~28810~~), [Create a multi-account trail](~~160661~~), and [Overview](~~28997~~).
      *
      * @param request LookupEventsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return LookupEventsResponse
     */
    public LookupEventsResponse lookupEventsWithOptions(LookupEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lookupAttribute)) {
            query.put("LookupAttribute", request.lookupAttribute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LookupEvents"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LookupEventsResponse());
    }

    /**
      * When you call this operation to query event details, you can query the event details at most twice per second.
      * > Do not frequently call this operation. You can create a trail to deliver events to Log Service. Then, you can query event details in near real time by using the real-time log consumption feature of Log Service. For more information, see [Create a single-account trail](~~28810~~), [Create a multi-account trail](~~160661~~), and [Overview](~~28997~~).
      *
      * @param request LookupEventsRequest
      * @return LookupEventsResponse
     */
    public LookupEventsResponse lookupEvents(LookupEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.lookupEventsWithOptions(request, runtime);
    }

    /**
      * This topic describes how to enable logging for a sample trail named `trail-test`.
      *
      * @param request StartLoggingRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return StartLoggingResponse
     */
    public StartLoggingResponse startLoggingWithOptions(StartLoggingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartLogging"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartLoggingResponse());
    }

    /**
      * This topic describes how to enable logging for a sample trail named `trail-test`.
      *
      * @param request StartLoggingRequest
      * @return StartLoggingResponse
     */
    public StartLoggingResponse startLogging(StartLoggingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startLoggingWithOptions(request, runtime);
    }

    /**
      * This topic describes how to disable logging for a sample trail named `trail-test`.
      *
      * @param request StopLoggingRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return StopLoggingResponse
     */
    public StopLoggingResponse stopLoggingWithOptions(StopLoggingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopLogging"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopLoggingResponse());
    }

    /**
      * This topic describes how to disable logging for a sample trail named `trail-test`.
      *
      * @param request StopLoggingRequest
      * @return StopLoggingResponse
     */
    public StopLoggingResponse stopLogging(StopLoggingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopLoggingWithOptions(request, runtime);
    }

    /**
      * By default, global events are stored in the Singapore region.
      * *   To obtain the permissions to call the API operation, you must submit a ticket.
      * *   Only the China (Hangzhou) region (cn-hangzhou) and the Singapore region (ap-southeast-1) are supported.
      *
      * @param request UpdateGlobalEventsStorageRegionRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateGlobalEventsStorageRegionResponse
     */
    public UpdateGlobalEventsStorageRegionResponse updateGlobalEventsStorageRegionWithOptions(UpdateGlobalEventsStorageRegionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.storageRegion)) {
            query.put("StorageRegion", request.storageRegion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGlobalEventsStorageRegion"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGlobalEventsStorageRegionResponse());
    }

    /**
      * By default, global events are stored in the Singapore region.
      * *   To obtain the permissions to call the API operation, you must submit a ticket.
      * *   Only the China (Hangzhou) region (cn-hangzhou) and the Singapore region (ap-southeast-1) are supported.
      *
      * @param request UpdateGlobalEventsStorageRegionRequest
      * @return UpdateGlobalEventsStorageRegionResponse
     */
    public UpdateGlobalEventsStorageRegionResponse updateGlobalEventsStorageRegion(UpdateGlobalEventsStorageRegionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGlobalEventsStorageRegionWithOptions(request, runtime);
    }

    /**
      * This topic shows you how to change the destination Object Storage Service (OSS) bucket of a sample trail named `trail-test` to `audit-log`.
      *
      * @param request UpdateTrailRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateTrailResponse
     */
    public UpdateTrailResponse updateTrailWithOptions(UpdateTrailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventRW)) {
            query.put("EventRW", request.eventRW);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxComputeProjectArn)) {
            query.put("MaxComputeProjectArn", request.maxComputeProjectArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxComputeWriteRoleArn)) {
            query.put("MaxComputeWriteRoleArn", request.maxComputeWriteRoleArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossBucketName)) {
            query.put("OssBucketName", request.ossBucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossKeyPrefix)) {
            query.put("OssKeyPrefix", request.ossKeyPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossWriteRoleArn)) {
            query.put("OssWriteRoleArn", request.ossWriteRoleArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsProjectArn)) {
            query.put("SlsProjectArn", request.slsProjectArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsWriteRoleArn)) {
            query.put("SlsWriteRoleArn", request.slsWriteRoleArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trailRegion)) {
            query.put("TrailRegion", request.trailRegion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTrail"),
            new TeaPair("version", "2020-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTrailResponse());
    }

    /**
      * This topic shows you how to change the destination Object Storage Service (OSS) bucket of a sample trail named `trail-test` to `audit-log`.
      *
      * @param request UpdateTrailRequest
      * @return UpdateTrailResponse
     */
    public UpdateTrailResponse updateTrail(UpdateTrailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTrailWithOptions(request, runtime);
    }
}
