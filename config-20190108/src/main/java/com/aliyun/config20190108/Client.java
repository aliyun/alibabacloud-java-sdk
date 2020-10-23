// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108;

import com.aliyun.tea.*;
import com.aliyun.config20190108.models.*;

public class Client extends com.aliyun.tearpc.Client {

    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-shanghai", "config.cn-shanghai.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "config.ap-southeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("config", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public GetResourceComplianceTimelineResponse getResourceComplianceTimelineWithOptions(GetResourceComplianceTimelineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetResourceComplianceTimeline", "HTTPS", "GET", "2019-01-08", "AK", TeaModel.buildMap(request), null, runtime), new GetResourceComplianceTimelineResponse());
    }

    public GetResourceComplianceTimelineResponse getResourceComplianceTimeline(GetResourceComplianceTimelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceComplianceTimelineWithOptions(request, runtime);
    }

    public GetResourceConfigurationTimelineResponse getResourceConfigurationTimelineWithOptions(GetResourceConfigurationTimelineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetResourceConfigurationTimeline", "HTTPS", "GET", "2019-01-08", "AK", TeaModel.buildMap(request), null, runtime), new GetResourceConfigurationTimelineResponse());
    }

    public GetResourceConfigurationTimelineResponse getResourceConfigurationTimeline(GetResourceConfigurationTimelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceConfigurationTimelineWithOptions(request, runtime);
    }

    public DescribeDeliveryChannelsResponse describeDeliveryChannelsWithOptions(DescribeDeliveryChannelsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDeliveryChannels", "HTTPS", "GET", "2019-01-08", "AK", TeaModel.buildMap(request), null, runtime), new DescribeDeliveryChannelsResponse());
    }

    public DescribeDeliveryChannelsResponse describeDeliveryChannels(DescribeDeliveryChannelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDeliveryChannelsWithOptions(request, runtime);
    }

    public PutConfigurationRecorderResponse putConfigurationRecorderWithOptions(PutConfigurationRecorderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PutConfigurationRecorder", "HTTPS", "POST", "2019-01-08", "AK", null, TeaModel.buildMap(request), runtime), new PutConfigurationRecorderResponse());
    }

    public PutConfigurationRecorderResponse putConfigurationRecorder(PutConfigurationRecorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putConfigurationRecorderWithOptions(request, runtime);
    }

    public GetDiscoveredResourceSummaryResponse getDiscoveredResourceSummaryWithOptions(GetDiscoveredResourceSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetDiscoveredResourceSummary", "HTTPS", "GET", "2019-01-08", "AK", TeaModel.buildMap(request), null, runtime), new GetDiscoveredResourceSummaryResponse());
    }

    public GetDiscoveredResourceSummaryResponse getDiscoveredResourceSummary(GetDiscoveredResourceSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDiscoveredResourceSummaryWithOptions(request, runtime);
    }

    public ActiveConfigRulesResponse activeConfigRulesWithOptions(ActiveConfigRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ActiveConfigRules", "HTTPS", "POST", "2019-01-08", "AK", null, TeaModel.buildMap(request), runtime), new ActiveConfigRulesResponse());
    }

    public ActiveConfigRulesResponse activeConfigRules(ActiveConfigRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.activeConfigRulesWithOptions(request, runtime);
    }

    public StopConfigRulesResponse stopConfigRulesWithOptions(StopConfigRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StopConfigRules", "HTTPS", "POST", "2019-01-08", "AK", null, TeaModel.buildMap(request), runtime), new StopConfigRulesResponse());
    }

    public StopConfigRulesResponse stopConfigRules(StopConfigRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopConfigRulesWithOptions(request, runtime);
    }

    public DescribeComplianceSummaryResponse describeComplianceSummaryWithOptions(DescribeComplianceSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeComplianceSummary", "HTTPS", "GET", "2019-01-08", "AK", TeaModel.buildMap(request), null, runtime), new DescribeComplianceSummaryResponse());
    }

    public DescribeComplianceSummaryResponse describeComplianceSummary(DescribeComplianceSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeComplianceSummaryWithOptions(request, runtime);
    }

    public ListConfigRulesResponse listConfigRulesWithOptions(ListConfigRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListConfigRules", "HTTPS", "GET", "2019-01-08", "AK", TeaModel.buildMap(request), null, runtime), new ListConfigRulesResponse());
    }

    public ListConfigRulesResponse listConfigRules(ListConfigRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listConfigRulesWithOptions(request, runtime);
    }

    public PutConfigRuleResponse putConfigRuleWithOptions(PutConfigRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PutConfigRule", "HTTPS", "POST", "2019-01-08", "AK", null, TeaModel.buildMap(request), runtime), new PutConfigRuleResponse());
    }

    public PutConfigRuleResponse putConfigRule(PutConfigRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putConfigRuleWithOptions(request, runtime);
    }

    public DescribeEvaluationResultsResponse describeEvaluationResultsWithOptions(DescribeEvaluationResultsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeEvaluationResults", "HTTPS", "GET", "2019-01-08", "AK", TeaModel.buildMap(request), null, runtime), new DescribeEvaluationResultsResponse());
    }

    public DescribeEvaluationResultsResponse describeEvaluationResults(DescribeEvaluationResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEvaluationResultsWithOptions(request, runtime);
    }

    public DeleteConfigRulesResponse deleteConfigRulesWithOptions(DeleteConfigRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteConfigRules", "HTTPS", "POST", "2019-01-08", "AK", null, TeaModel.buildMap(request), runtime), new DeleteConfigRulesResponse());
    }

    public DeleteConfigRulesResponse deleteConfigRules(DeleteConfigRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteConfigRulesWithOptions(request, runtime);
    }

    public DescribeComplianceResponse describeComplianceWithOptions(DescribeComplianceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeCompliance", "HTTPS", "GET", "2019-01-08", "AK", TeaModel.buildMap(request), null, runtime), new DescribeComplianceResponse());
    }

    public DescribeComplianceResponse describeCompliance(DescribeComplianceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeComplianceWithOptions(request, runtime);
    }

    public GetDiscoveredResourceCountsResponse getDiscoveredResourceCountsWithOptions(GetDiscoveredResourceCountsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetDiscoveredResourceCounts", "HTTPS", "GET", "2019-01-08", "AK", TeaModel.buildMap(request), null, runtime), new GetDiscoveredResourceCountsResponse());
    }

    public GetDiscoveredResourceCountsResponse getDiscoveredResourceCounts(GetDiscoveredResourceCountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDiscoveredResourceCountsWithOptions(request, runtime);
    }

    public ListDiscoveredResourcesResponse listDiscoveredResourcesWithOptions(ListDiscoveredResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListDiscoveredResources", "HTTPS", "GET", "2019-01-08", "AK", TeaModel.buildMap(request), null, runtime), new ListDiscoveredResourcesResponse());
    }

    public ListDiscoveredResourcesResponse listDiscoveredResources(ListDiscoveredResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDiscoveredResourcesWithOptions(request, runtime);
    }

    public DescribeConfigurationRecorderResponse describeConfigurationRecorderWithOptions(DescribeConfigurationRecorderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeConfigurationRecorder", "HTTPS", "GET", "2019-01-08", "AK", TeaModel.buildMap(request), null, runtime), new DescribeConfigurationRecorderResponse());
    }

    public DescribeConfigurationRecorderResponse describeConfigurationRecorder(DescribeConfigurationRecorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeConfigurationRecorderWithOptions(request, runtime);
    }

    public DescribeDiscoveredResourceResponse describeDiscoveredResourceWithOptions(DescribeDiscoveredResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDiscoveredResource", "HTTPS", "GET", "2019-01-08", "AK", TeaModel.buildMap(request), null, runtime), new DescribeDiscoveredResourceResponse());
    }

    public DescribeDiscoveredResourceResponse describeDiscoveredResource(DescribeDiscoveredResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDiscoveredResourceWithOptions(request, runtime);
    }

    public StartConfigurationRecorderResponse startConfigurationRecorderWithOptions(StartConfigurationRecorderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StartConfigurationRecorder", "HTTPS", "POST", "2019-01-08", "AK", null, TeaModel.buildMap(request), runtime), new StartConfigurationRecorderResponse());
    }

    public StartConfigurationRecorderResponse startConfigurationRecorder(StartConfigurationRecorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startConfigurationRecorderWithOptions(request, runtime);
    }

    public DescribeConfigRuleResponse describeConfigRuleWithOptions(DescribeConfigRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeConfigRule", "HTTPS", "GET", "2019-01-08", "AK", TeaModel.buildMap(request), null, runtime), new DescribeConfigRuleResponse());
    }

    public DescribeConfigRuleResponse describeConfigRule(DescribeConfigRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeConfigRuleWithOptions(request, runtime);
    }

    public GetSupportedResourceTypesResponse getSupportedResourceTypesWithOptions(GetSupportedResourceTypesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetSupportedResourceTypes", "HTTPS", "GET", "2019-01-08", "AK", TeaModel.buildMap(request), null, runtime), new GetSupportedResourceTypesResponse());
    }

    public GetSupportedResourceTypesResponse getSupportedResourceTypes(GetSupportedResourceTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSupportedResourceTypesWithOptions(request, runtime);
    }

    public PutDeliveryChannelResponse putDeliveryChannelWithOptions(PutDeliveryChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PutDeliveryChannel", "HTTPS", "POST", "2019-01-08", "AK", null, TeaModel.buildMap(request), runtime), new PutDeliveryChannelResponse());
    }

    public PutDeliveryChannelResponse putDeliveryChannel(PutDeliveryChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putDeliveryChannelWithOptions(request, runtime);
    }

    public PutEvaluationsResponse putEvaluationsWithOptions(PutEvaluationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PutEvaluations", "HTTPS", "POST", "2019-01-08", "AK", null, TeaModel.buildMap(request), runtime), new PutEvaluationsResponse());
    }

    public PutEvaluationsResponse putEvaluations(PutEvaluationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putEvaluationsWithOptions(request, runtime);
    }

    public StartConfigRuleEvaluationResponse startConfigRuleEvaluationWithOptions(StartConfigRuleEvaluationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StartConfigRuleEvaluation", "HTTPS", "POST", "2019-01-08", "AK", null, TeaModel.buildMap(request), runtime), new StartConfigRuleEvaluationResponse());
    }

    public StartConfigRuleEvaluationResponse startConfigRuleEvaluation(StartConfigRuleEvaluationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startConfigRuleEvaluationWithOptions(request, runtime);
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
}
