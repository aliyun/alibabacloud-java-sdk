// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228;

import com.aliyun.tea.*;
import com.aliyun.ddoscoo20171228.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ddoscoo", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddLayer7CCRuleResponse addLayer7CCRuleWithOptions(AddLayer7CCRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddLayer7CCRule", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new AddLayer7CCRuleResponse());
    }

    public AddLayer7CCRuleResponse addLayer7CCRule(AddLayer7CCRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addLayer7CCRuleWithOptions(request, runtime);
    }

    public CloseDomainSlsConfigResponse closeDomainSlsConfigWithOptions(CloseDomainSlsConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CloseDomainSlsConfig", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new CloseDomainSlsConfigResponse());
    }

    public CloseDomainSlsConfigResponse closeDomainSlsConfig(CloseDomainSlsConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.closeDomainSlsConfigWithOptions(request, runtime);
    }

    public ConfigDomainAccessModeResponse configDomainAccessModeWithOptions(ConfigDomainAccessModeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfigDomainAccessMode", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new ConfigDomainAccessModeResponse());
    }

    public ConfigDomainAccessModeResponse configDomainAccessMode(ConfigDomainAccessModeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configDomainAccessModeWithOptions(request, runtime);
    }

    public ConfigHealthCheckResponse configHealthCheckWithOptions(ConfigHealthCheckRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfigHealthCheck", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new ConfigHealthCheckResponse());
    }

    public ConfigHealthCheckResponse configHealthCheck(ConfigHealthCheckRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configHealthCheckWithOptions(request, runtime);
    }

    public ConfigLayer4RuleResponse configLayer4RuleWithOptions(ConfigLayer4RuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfigLayer4Rule", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new ConfigLayer4RuleResponse());
    }

    public ConfigLayer4RuleResponse configLayer4Rule(ConfigLayer4RuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configLayer4RuleWithOptions(request, runtime);
    }

    public ConfigLayer4RuleAttributeResponse configLayer4RuleAttributeWithOptions(ConfigLayer4RuleAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfigLayer4RuleAttribute", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new ConfigLayer4RuleAttributeResponse());
    }

    public ConfigLayer4RuleAttributeResponse configLayer4RuleAttribute(ConfigLayer4RuleAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configLayer4RuleAttributeWithOptions(request, runtime);
    }

    public ConfigLayer7BlackWhiteListResponse configLayer7BlackWhiteListWithOptions(ConfigLayer7BlackWhiteListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfigLayer7BlackWhiteList", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new ConfigLayer7BlackWhiteListResponse());
    }

    public ConfigLayer7BlackWhiteListResponse configLayer7BlackWhiteList(ConfigLayer7BlackWhiteListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configLayer7BlackWhiteListWithOptions(request, runtime);
    }

    public ConfigLayer7CCRuleResponse configLayer7CCRuleWithOptions(ConfigLayer7CCRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfigLayer7CCRule", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new ConfigLayer7CCRuleResponse());
    }

    public ConfigLayer7CCRuleResponse configLayer7CCRule(ConfigLayer7CCRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configLayer7CCRuleWithOptions(request, runtime);
    }

    public ConfigLayer7CCTemplateResponse configLayer7CCTemplateWithOptions(ConfigLayer7CCTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfigLayer7CCTemplate", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new ConfigLayer7CCTemplateResponse());
    }

    public ConfigLayer7CCTemplateResponse configLayer7CCTemplate(ConfigLayer7CCTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configLayer7CCTemplateWithOptions(request, runtime);
    }

    public ConfigLayer7CertResponse configLayer7CertWithOptions(ConfigLayer7CertRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfigLayer7Cert", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new ConfigLayer7CertResponse());
    }

    public ConfigLayer7CertResponse configLayer7Cert(ConfigLayer7CertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configLayer7CertWithOptions(request, runtime);
    }

    public ConfigLayer7RuleResponse configLayer7RuleWithOptions(ConfigLayer7RuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfigLayer7Rule", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new ConfigLayer7RuleResponse());
    }

    public ConfigLayer7RuleResponse configLayer7Rule(ConfigLayer7RuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configLayer7RuleWithOptions(request, runtime);
    }

    public CreateAsyncTaskResponse createAsyncTaskWithOptions(CreateAsyncTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAsyncTask", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAsyncTaskResponse());
    }

    public CreateAsyncTaskResponse createAsyncTask(CreateAsyncTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAsyncTaskWithOptions(request, runtime);
    }

    public CreateLayer4RuleResponse createLayer4RuleWithOptions(CreateLayer4RuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateLayer4Rule", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateLayer4RuleResponse());
    }

    public CreateLayer4RuleResponse createLayer4Rule(CreateLayer4RuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLayer4RuleWithOptions(request, runtime);
    }

    public CreateLayer7RuleResponse createLayer7RuleWithOptions(CreateLayer7RuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateLayer7Rule", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateLayer7RuleResponse());
    }

    public CreateLayer7RuleResponse createLayer7Rule(CreateLayer7RuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLayer7RuleWithOptions(request, runtime);
    }

    public DeleteAsyncTaskResponse deleteAsyncTaskWithOptions(DeleteAsyncTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAsyncTask", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAsyncTaskResponse());
    }

    public DeleteAsyncTaskResponse deleteAsyncTask(DeleteAsyncTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAsyncTaskWithOptions(request, runtime);
    }

    public DeleteLayer4RuleResponse deleteLayer4RuleWithOptions(DeleteLayer4RuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteLayer4Rule", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteLayer4RuleResponse());
    }

    public DeleteLayer4RuleResponse deleteLayer4Rule(DeleteLayer4RuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLayer4RuleWithOptions(request, runtime);
    }

    public DeleteLayer7CCRuleResponse deleteLayer7CCRuleWithOptions(DeleteLayer7CCRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteLayer7CCRule", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteLayer7CCRuleResponse());
    }

    public DeleteLayer7CCRuleResponse deleteLayer7CCRule(DeleteLayer7CCRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLayer7CCRuleWithOptions(request, runtime);
    }

    public DeleteLayer7RuleResponse deleteLayer7RuleWithOptions(DeleteLayer7RuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteLayer7Rule", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteLayer7RuleResponse());
    }

    public DeleteLayer7RuleResponse deleteLayer7Rule(DeleteLayer7RuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLayer7RuleWithOptions(request, runtime);
    }

    public DescribeBackSourceCidrResponse describeBackSourceCidrWithOptions(DescribeBackSourceCidrRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBackSourceCidr", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackSourceCidrResponse());
    }

    public DescribeBackSourceCidrResponse describeBackSourceCidr(DescribeBackSourceCidrRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackSourceCidrWithOptions(request, runtime);
    }

    public DescribeBatchSlsDispatchStatusResponse describeBatchSlsDispatchStatusWithOptions(DescribeBatchSlsDispatchStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBatchSlsDispatchStatus", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBatchSlsDispatchStatusResponse());
    }

    public DescribeBatchSlsDispatchStatusResponse describeBatchSlsDispatchStatus(DescribeBatchSlsDispatchStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBatchSlsDispatchStatusWithOptions(request, runtime);
    }

    public DescribeDDoSEventsResponse describeDDoSEventsWithOptions(DescribeDDoSEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDDoSEvents", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDDoSEventsResponse());
    }

    public DescribeDDoSEventsResponse describeDDoSEvents(DescribeDDoSEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDDoSEventsWithOptions(request, runtime);
    }

    public DescribeDDoSTrafficResponse describeDDoSTrafficWithOptions(DescribeDDoSTrafficRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDDoSTraffic", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDDoSTrafficResponse());
    }

    public DescribeDDoSTrafficResponse describeDDoSTraffic(DescribeDDoSTrafficRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDDoSTrafficWithOptions(request, runtime);
    }

    public DescribeDefenseCountStatisticsResponse describeDefenseCountStatisticsWithOptions(DescribeDefenseCountStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDefenseCountStatistics", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDefenseCountStatisticsResponse());
    }

    public DescribeDefenseCountStatisticsResponse describeDefenseCountStatistics(DescribeDefenseCountStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDefenseCountStatisticsWithOptions(request, runtime);
    }

    public DescribeDomainAccessModeResponse describeDomainAccessModeWithOptions(DescribeDomainAccessModeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainAccessMode", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainAccessModeResponse());
    }

    public DescribeDomainAccessModeResponse describeDomainAccessMode(DescribeDomainAccessModeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainAccessModeWithOptions(request, runtime);
    }

    public DescribeDomainAttackEventsResponse describeDomainAttackEventsWithOptions(DescribeDomainAttackEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainAttackEvents", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainAttackEventsResponse());
    }

    public DescribeDomainAttackEventsResponse describeDomainAttackEvents(DescribeDomainAttackEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainAttackEventsWithOptions(request, runtime);
    }

    public DescribeDomainQpsResponse describeDomainQpsWithOptions(DescribeDomainQpsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainQps", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainQpsResponse());
    }

    public DescribeDomainQpsResponse describeDomainQps(DescribeDomainQpsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainQpsWithOptions(request, runtime);
    }

    public DescribeDomainQpsWithCacheResponse describeDomainQpsWithCacheWithOptions(DescribeDomainQpsWithCacheRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainQpsWithCache", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainQpsWithCacheResponse());
    }

    public DescribeDomainQpsWithCacheResponse describeDomainQpsWithCache(DescribeDomainQpsWithCacheRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainQpsWithCacheWithOptions(request, runtime);
    }

    public DescribeDomainsResponse describeDomainsWithOptions(DescribeDomainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomains", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainsResponse());
    }

    public DescribeDomainsResponse describeDomains(DescribeDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainsWithOptions(request, runtime);
    }

    public DescribeDomainSlsStatusResponse describeDomainSlsStatusWithOptions(DescribeDomainSlsStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainSlsStatus", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainSlsStatusResponse());
    }

    public DescribeDomainSlsStatusResponse describeDomainSlsStatus(DescribeDomainSlsStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainSlsStatusWithOptions(request, runtime);
    }

    public DescribeElasticBandwidthSpecResponse describeElasticBandwidthSpecWithOptions(DescribeElasticBandwidthSpecRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeElasticBandwidthSpec", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeElasticBandwidthSpecResponse());
    }

    public DescribeElasticBandwidthSpecResponse describeElasticBandwidthSpec(DescribeElasticBandwidthSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeElasticBandwidthSpecWithOptions(request, runtime);
    }

    public DescribeHealthCheckListResponse describeHealthCheckListWithOptions(DescribeHealthCheckListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeHealthCheckList", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeHealthCheckListResponse());
    }

    public DescribeHealthCheckListResponse describeHealthCheckList(DescribeHealthCheckListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHealthCheckListWithOptions(request, runtime);
    }

    public DescribeHealthCheckStatusListResponse describeHealthCheckStatusListWithOptions(DescribeHealthCheckStatusListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeHealthCheckStatusList", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeHealthCheckStatusListResponse());
    }

    public DescribeHealthCheckStatusListResponse describeHealthCheckStatusList(DescribeHealthCheckStatusListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHealthCheckStatusListWithOptions(request, runtime);
    }

    public DescribeInstanceDetailsResponse describeInstanceDetailsWithOptions(DescribeInstanceDetailsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceDetails", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceDetailsResponse());
    }

    public DescribeInstanceDetailsResponse describeInstanceDetails(DescribeInstanceDetailsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceDetailsWithOptions(request, runtime);
    }

    public DescribeInstancesResponse describeInstancesWithOptions(DescribeInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstances", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstancesResponse());
    }

    public DescribeInstancesResponse describeInstances(DescribeInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstancesWithOptions(request, runtime);
    }

    public DescribeInstanceSpecsResponse describeInstanceSpecsWithOptions(DescribeInstanceSpecsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceSpecs", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceSpecsResponse());
    }

    public DescribeInstanceSpecsResponse describeInstanceSpecs(DescribeInstanceSpecsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceSpecsWithOptions(request, runtime);
    }

    public DescribeInstanceStatisticsResponse describeInstanceStatisticsWithOptions(DescribeInstanceStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceStatistics", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceStatisticsResponse());
    }

    public DescribeInstanceStatisticsResponse describeInstanceStatistics(DescribeInstanceStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceStatisticsWithOptions(request, runtime);
    }

    public DescribeIpTrafficResponse describeIpTrafficWithOptions(DescribeIpTrafficRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeIpTraffic", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeIpTrafficResponse());
    }

    public DescribeIpTrafficResponse describeIpTraffic(DescribeIpTrafficRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeIpTrafficWithOptions(request, runtime);
    }

    public DescribeLayer4RuleAttributesResponse describeLayer4RuleAttributesWithOptions(DescribeLayer4RuleAttributesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLayer4RuleAttributes", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLayer4RuleAttributesResponse());
    }

    public DescribeLayer4RuleAttributesResponse describeLayer4RuleAttributes(DescribeLayer4RuleAttributesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLayer4RuleAttributesWithOptions(request, runtime);
    }

    public DescribeLayer4RulesResponse describeLayer4RulesWithOptions(DescribeLayer4RulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLayer4Rules", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLayer4RulesResponse());
    }

    public DescribeLayer4RulesResponse describeLayer4Rules(DescribeLayer4RulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLayer4RulesWithOptions(request, runtime);
    }

    public DescribeLayer7CCRulesResponse describeLayer7CCRulesWithOptions(DescribeLayer7CCRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLayer7CCRules", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLayer7CCRulesResponse());
    }

    public DescribeLayer7CCRulesResponse describeLayer7CCRules(DescribeLayer7CCRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLayer7CCRulesWithOptions(request, runtime);
    }

    public DescribeLogStoreExistStatusResponse describeLogStoreExistStatusWithOptions(DescribeLogStoreExistStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLogStoreExistStatus", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLogStoreExistStatusResponse());
    }

    public DescribeLogStoreExistStatusResponse describeLogStoreExistStatus(DescribeLogStoreExistStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLogStoreExistStatusWithOptions(request, runtime);
    }

    public DescribeOpEntitiesResponse describeOpEntitiesWithOptions(DescribeOpEntitiesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeOpEntities", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeOpEntitiesResponse());
    }

    public DescribeOpEntitiesResponse describeOpEntities(DescribeOpEntitiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeOpEntitiesWithOptions(request, runtime);
    }

    public DescribeSimpleDomainsResponse describeSimpleDomainsWithOptions(DescribeSimpleDomainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSimpleDomains", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSimpleDomainsResponse());
    }

    public DescribeSimpleDomainsResponse describeSimpleDomains(DescribeSimpleDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSimpleDomainsWithOptions(request, runtime);
    }

    public DescribeSlsAuthStatusResponse describeSlsAuthStatusWithOptions(DescribeSlsAuthStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSlsAuthStatus", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSlsAuthStatusResponse());
    }

    public DescribeSlsAuthStatusResponse describeSlsAuthStatus(DescribeSlsAuthStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSlsAuthStatusWithOptions(request, runtime);
    }

    public DescribeSlsEmptyCountResponse describeSlsEmptyCountWithOptions(DescribeSlsEmptyCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSlsEmptyCount", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSlsEmptyCountResponse());
    }

    public DescribeSlsEmptyCountResponse describeSlsEmptyCount(DescribeSlsEmptyCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSlsEmptyCountWithOptions(request, runtime);
    }

    public DescribeSlsLogstoreInfoResponse describeSlsLogstoreInfoWithOptions(DescribeSlsLogstoreInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSlsLogstoreInfo", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSlsLogstoreInfoResponse());
    }

    public DescribeSlsLogstoreInfoResponse describeSlsLogstoreInfo(DescribeSlsLogstoreInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSlsLogstoreInfoWithOptions(request, runtime);
    }

    public DescribeSlsOpenStatusResponse describeSlsOpenStatusWithOptions(DescribeSlsOpenStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSlsOpenStatus", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSlsOpenStatusResponse());
    }

    public DescribeSlsOpenStatusResponse describeSlsOpenStatus(DescribeSlsOpenStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSlsOpenStatusWithOptions(request, runtime);
    }

    public DescribleCertListResponse describleCertListWithOptions(DescribleCertListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribleCertList", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribleCertListResponse());
    }

    public DescribleCertListResponse describleCertList(DescribleCertListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describleCertListWithOptions(request, runtime);
    }

    public DescribleLayer7InstanceRelationsResponse describleLayer7InstanceRelationsWithOptions(DescribleLayer7InstanceRelationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribleLayer7InstanceRelations", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribleLayer7InstanceRelationsResponse());
    }

    public DescribleLayer7InstanceRelationsResponse describleLayer7InstanceRelations(DescribleLayer7InstanceRelationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describleLayer7InstanceRelationsWithOptions(request, runtime);
    }

    public DisableLayer7CCResponse disableLayer7CCWithOptions(DisableLayer7CCRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableLayer7CC", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new DisableLayer7CCResponse());
    }

    public DisableLayer7CCResponse disableLayer7CC(DisableLayer7CCRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableLayer7CCWithOptions(request, runtime);
    }

    public DisableLayer7CCRuleResponse disableLayer7CCRuleWithOptions(DisableLayer7CCRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableLayer7CCRule", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new DisableLayer7CCRuleResponse());
    }

    public DisableLayer7CCRuleResponse disableLayer7CCRule(DisableLayer7CCRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableLayer7CCRuleWithOptions(request, runtime);
    }

    public EmptySlsLogstoreResponse emptySlsLogstoreWithOptions(EmptySlsLogstoreRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EmptySlsLogstore", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new EmptySlsLogstoreResponse());
    }

    public EmptySlsLogstoreResponse emptySlsLogstore(EmptySlsLogstoreRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.emptySlsLogstoreWithOptions(request, runtime);
    }

    public EnableLayer7CCResponse enableLayer7CCWithOptions(EnableLayer7CCRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableLayer7CC", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new EnableLayer7CCResponse());
    }

    public EnableLayer7CCResponse enableLayer7CC(EnableLayer7CCRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableLayer7CCWithOptions(request, runtime);
    }

    public EnableLayer7CCRuleResponse enableLayer7CCRuleWithOptions(EnableLayer7CCRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableLayer7CCRule", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new EnableLayer7CCRuleResponse());
    }

    public EnableLayer7CCRuleResponse enableLayer7CCRule(EnableLayer7CCRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableLayer7CCRuleWithOptions(request, runtime);
    }

    public ListAsyncTaskResponse listAsyncTaskWithOptions(ListAsyncTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAsyncTask", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new ListAsyncTaskResponse());
    }

    public ListAsyncTaskResponse listAsyncTask(ListAsyncTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAsyncTaskWithOptions(request, runtime);
    }

    public ListLayer7CustomPortsResponse listLayer7CustomPortsWithOptions(ListLayer7CustomPortsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListLayer7CustomPorts", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new ListLayer7CustomPortsResponse());
    }

    public ListLayer7CustomPortsResponse listLayer7CustomPorts(ListLayer7CustomPortsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listLayer7CustomPortsWithOptions(request, runtime);
    }

    public ListTagKeysResponse listTagKeysWithOptions(ListTagKeysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagKeys", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagKeysResponse());
    }

    public ListTagKeysResponse listTagKeys(ListTagKeysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagKeysWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagResources", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public ListValueAddedResponse listValueAddedWithOptions(ListValueAddedRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListValueAdded", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new ListValueAddedResponse());
    }

    public ListValueAddedResponse listValueAdded(ListValueAddedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listValueAddedWithOptions(request, runtime);
    }

    public ModifyElasticBandWidthResponse modifyElasticBandWidthWithOptions(ModifyElasticBandWidthRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyElasticBandWidth", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyElasticBandWidthResponse());
    }

    public ModifyElasticBandWidthResponse modifyElasticBandWidth(ModifyElasticBandWidthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyElasticBandWidthWithOptions(request, runtime);
    }

    public ModifyFullLogTtlResponse modifyFullLogTtlWithOptions(ModifyFullLogTtlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyFullLogTtl", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyFullLogTtlResponse());
    }

    public ModifyFullLogTtlResponse modifyFullLogTtl(ModifyFullLogTtlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyFullLogTtlWithOptions(request, runtime);
    }

    public ModifyInstanceRemarkResponse modifyInstanceRemarkWithOptions(ModifyInstanceRemarkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstanceRemark", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceRemarkResponse());
    }

    public ModifyInstanceRemarkResponse modifyInstanceRemark(ModifyInstanceRemarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceRemarkWithOptions(request, runtime);
    }

    public OpenDomainSlsConfigResponse openDomainSlsConfigWithOptions(OpenDomainSlsConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OpenDomainSlsConfig", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new OpenDomainSlsConfigResponse());
    }

    public OpenDomainSlsConfigResponse openDomainSlsConfig(OpenDomainSlsConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.openDomainSlsConfigWithOptions(request, runtime);
    }

    public ReleaseInstanceResponse releaseInstanceWithOptions(ReleaseInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleaseInstance", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new ReleaseInstanceResponse());
    }

    public ReleaseInstanceResponse releaseInstance(ReleaseInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseInstanceWithOptions(request, runtime);
    }

    public ReleaseValueAddedResponse releaseValueAddedWithOptions(ReleaseValueAddedRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleaseValueAdded", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new ReleaseValueAddedResponse());
    }

    public ReleaseValueAddedResponse releaseValueAdded(ReleaseValueAddedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseValueAddedWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TagResources", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UntagResources", "2017-12-28", "HTTPS", "POST", "AK", "json", req, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }
}
