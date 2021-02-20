// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101;

import com.aliyun.tea.*;
import com.aliyun.ddoscoo20200101.models.*;
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

    public AddAutoCcBlacklistResponse addAutoCcBlacklistWithOptions(AddAutoCcBlacklistRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddAutoCcBlacklist", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddAutoCcBlacklistResponse());
    }

    public AddAutoCcBlacklistResponse addAutoCcBlacklist(AddAutoCcBlacklistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addAutoCcBlacklistWithOptions(request, runtime);
    }

    public AddAutoCcWhitelistResponse addAutoCcWhitelistWithOptions(AddAutoCcWhitelistRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddAutoCcWhitelist", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddAutoCcWhitelistResponse());
    }

    public AddAutoCcWhitelistResponse addAutoCcWhitelist(AddAutoCcWhitelistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addAutoCcWhitelistWithOptions(request, runtime);
    }

    public AssociateWebCertResponse associateWebCertWithOptions(AssociateWebCertRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AssociateWebCert", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new AssociateWebCertResponse());
    }

    public AssociateWebCertResponse associateWebCert(AssociateWebCertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.associateWebCertWithOptions(request, runtime);
    }

    public AttachSceneDefenseObjectResponse attachSceneDefenseObjectWithOptions(AttachSceneDefenseObjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AttachSceneDefenseObject", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new AttachSceneDefenseObjectResponse());
    }

    public AttachSceneDefenseObjectResponse attachSceneDefenseObject(AttachSceneDefenseObjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachSceneDefenseObjectWithOptions(request, runtime);
    }

    public ConfigL7RsPolicyResponse configL7RsPolicyWithOptions(ConfigL7RsPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfigL7RsPolicy", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ConfigL7RsPolicyResponse());
    }

    public ConfigL7RsPolicyResponse configL7RsPolicy(ConfigL7RsPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configL7RsPolicyWithOptions(request, runtime);
    }

    public ConfigNetworkRegionBlockResponse configNetworkRegionBlockWithOptions(ConfigNetworkRegionBlockRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfigNetworkRegionBlock", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ConfigNetworkRegionBlockResponse());
    }

    public ConfigNetworkRegionBlockResponse configNetworkRegionBlock(ConfigNetworkRegionBlockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configNetworkRegionBlockWithOptions(request, runtime);
    }

    public ConfigNetworkRulesResponse configNetworkRulesWithOptions(ConfigNetworkRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfigNetworkRules", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ConfigNetworkRulesResponse());
    }

    public ConfigNetworkRulesResponse configNetworkRules(ConfigNetworkRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configNetworkRulesWithOptions(request, runtime);
    }

    public ConfigWebCCTemplateResponse configWebCCTemplateWithOptions(ConfigWebCCTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfigWebCCTemplate", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ConfigWebCCTemplateResponse());
    }

    public ConfigWebCCTemplateResponse configWebCCTemplate(ConfigWebCCTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configWebCCTemplateWithOptions(request, runtime);
    }

    public ConfigWebIpSetResponse configWebIpSetWithOptions(ConfigWebIpSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfigWebIpSet", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ConfigWebIpSetResponse());
    }

    public ConfigWebIpSetResponse configWebIpSet(ConfigWebIpSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configWebIpSetWithOptions(request, runtime);
    }

    public CreateAsyncTaskResponse createAsyncTaskWithOptions(CreateAsyncTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAsyncTask", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAsyncTaskResponse());
    }

    public CreateAsyncTaskResponse createAsyncTask(CreateAsyncTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAsyncTaskWithOptions(request, runtime);
    }

    public CreateNetworkRulesResponse createNetworkRulesWithOptions(CreateNetworkRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateNetworkRules", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateNetworkRulesResponse());
    }

    public CreateNetworkRulesResponse createNetworkRules(CreateNetworkRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createNetworkRulesWithOptions(request, runtime);
    }

    public CreateSceneDefensePolicyResponse createSceneDefensePolicyWithOptions(CreateSceneDefensePolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSceneDefensePolicy", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSceneDefensePolicyResponse());
    }

    public CreateSceneDefensePolicyResponse createSceneDefensePolicy(CreateSceneDefensePolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSceneDefensePolicyWithOptions(request, runtime);
    }

    public CreateSchedulerRuleResponse createSchedulerRuleWithOptions(CreateSchedulerRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSchedulerRule", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSchedulerRuleResponse());
    }

    public CreateSchedulerRuleResponse createSchedulerRule(CreateSchedulerRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSchedulerRuleWithOptions(request, runtime);
    }

    public CreateTagResourcesResponse createTagResourcesWithOptions(CreateTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateTagResources", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateTagResourcesResponse());
    }

    public CreateTagResourcesResponse createTagResources(CreateTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTagResourcesWithOptions(request, runtime);
    }

    public CreateWebCCRuleResponse createWebCCRuleWithOptions(CreateWebCCRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateWebCCRule", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateWebCCRuleResponse());
    }

    public CreateWebCCRuleResponse createWebCCRule(CreateWebCCRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createWebCCRuleWithOptions(request, runtime);
    }

    public CreateWebRuleResponse createWebRuleWithOptions(CreateWebRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateWebRule", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateWebRuleResponse());
    }

    public CreateWebRuleResponse createWebRule(CreateWebRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createWebRuleWithOptions(request, runtime);
    }

    public DeleteAsyncTaskResponse deleteAsyncTaskWithOptions(DeleteAsyncTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAsyncTask", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAsyncTaskResponse());
    }

    public DeleteAsyncTaskResponse deleteAsyncTask(DeleteAsyncTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAsyncTaskWithOptions(request, runtime);
    }

    public DeleteAutoCcBlacklistResponse deleteAutoCcBlacklistWithOptions(DeleteAutoCcBlacklistRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAutoCcBlacklist", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAutoCcBlacklistResponse());
    }

    public DeleteAutoCcBlacklistResponse deleteAutoCcBlacklist(DeleteAutoCcBlacklistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAutoCcBlacklistWithOptions(request, runtime);
    }

    public DeleteAutoCcWhitelistResponse deleteAutoCcWhitelistWithOptions(DeleteAutoCcWhitelistRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAutoCcWhitelist", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAutoCcWhitelistResponse());
    }

    public DeleteAutoCcWhitelistResponse deleteAutoCcWhitelist(DeleteAutoCcWhitelistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAutoCcWhitelistWithOptions(request, runtime);
    }

    public DeleteNetworkRuleResponse deleteNetworkRuleWithOptions(DeleteNetworkRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteNetworkRule", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteNetworkRuleResponse());
    }

    public DeleteNetworkRuleResponse deleteNetworkRule(DeleteNetworkRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteNetworkRuleWithOptions(request, runtime);
    }

    public DeleteSceneDefensePolicyResponse deleteSceneDefensePolicyWithOptions(DeleteSceneDefensePolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSceneDefensePolicy", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSceneDefensePolicyResponse());
    }

    public DeleteSceneDefensePolicyResponse deleteSceneDefensePolicy(DeleteSceneDefensePolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSceneDefensePolicyWithOptions(request, runtime);
    }

    public DeleteSchedulerRuleResponse deleteSchedulerRuleWithOptions(DeleteSchedulerRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSchedulerRule", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSchedulerRuleResponse());
    }

    public DeleteSchedulerRuleResponse deleteSchedulerRule(DeleteSchedulerRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSchedulerRuleWithOptions(request, runtime);
    }

    public DeleteTagResourcesResponse deleteTagResourcesWithOptions(DeleteTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteTagResources", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteTagResourcesResponse());
    }

    public DeleteTagResourcesResponse deleteTagResources(DeleteTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTagResourcesWithOptions(request, runtime);
    }

    public DeleteWebCacheCustomRuleResponse deleteWebCacheCustomRuleWithOptions(DeleteWebCacheCustomRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteWebCacheCustomRule", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteWebCacheCustomRuleResponse());
    }

    public DeleteWebCacheCustomRuleResponse deleteWebCacheCustomRule(DeleteWebCacheCustomRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteWebCacheCustomRuleWithOptions(request, runtime);
    }

    public DeleteWebCCRuleResponse deleteWebCCRuleWithOptions(DeleteWebCCRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteWebCCRule", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteWebCCRuleResponse());
    }

    public DeleteWebCCRuleResponse deleteWebCCRule(DeleteWebCCRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteWebCCRuleWithOptions(request, runtime);
    }

    public DeleteWebPreciseAccessRuleResponse deleteWebPreciseAccessRuleWithOptions(DeleteWebPreciseAccessRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteWebPreciseAccessRule", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteWebPreciseAccessRuleResponse());
    }

    public DeleteWebPreciseAccessRuleResponse deleteWebPreciseAccessRule(DeleteWebPreciseAccessRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteWebPreciseAccessRuleWithOptions(request, runtime);
    }

    public DeleteWebRuleResponse deleteWebRuleWithOptions(DeleteWebRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteWebRule", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteWebRuleResponse());
    }

    public DeleteWebRuleResponse deleteWebRule(DeleteWebRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteWebRuleWithOptions(request, runtime);
    }

    public DescribeAsyncTasksResponse describeAsyncTasksWithOptions(DescribeAsyncTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAsyncTasks", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAsyncTasksResponse());
    }

    public DescribeAsyncTasksResponse describeAsyncTasks(DescribeAsyncTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAsyncTasksWithOptions(request, runtime);
    }

    public DescribeAutoCcBlacklistResponse describeAutoCcBlacklistWithOptions(DescribeAutoCcBlacklistRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAutoCcBlacklist", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAutoCcBlacklistResponse());
    }

    public DescribeAutoCcBlacklistResponse describeAutoCcBlacklist(DescribeAutoCcBlacklistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAutoCcBlacklistWithOptions(request, runtime);
    }

    public DescribeAutoCcListCountResponse describeAutoCcListCountWithOptions(DescribeAutoCcListCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAutoCcListCount", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAutoCcListCountResponse());
    }

    public DescribeAutoCcListCountResponse describeAutoCcListCount(DescribeAutoCcListCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAutoCcListCountWithOptions(request, runtime);
    }

    public DescribeAutoCcWhitelistResponse describeAutoCcWhitelistWithOptions(DescribeAutoCcWhitelistRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAutoCcWhitelist", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAutoCcWhitelistResponse());
    }

    public DescribeAutoCcWhitelistResponse describeAutoCcWhitelist(DescribeAutoCcWhitelistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAutoCcWhitelistWithOptions(request, runtime);
    }

    public DescribeBackSourceCidrResponse describeBackSourceCidrWithOptions(DescribeBackSourceCidrRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBackSourceCidr", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackSourceCidrResponse());
    }

    public DescribeBackSourceCidrResponse describeBackSourceCidr(DescribeBackSourceCidrRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackSourceCidrWithOptions(request, runtime);
    }

    public DescribeBlackholeStatusResponse describeBlackholeStatusWithOptions(DescribeBlackholeStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBlackholeStatus", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBlackholeStatusResponse());
    }

    public DescribeBlackholeStatusResponse describeBlackholeStatus(DescribeBlackholeStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBlackholeStatusWithOptions(request, runtime);
    }

    public DescribeBlockStatusResponse describeBlockStatusWithOptions(DescribeBlockStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBlockStatus", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBlockStatusResponse());
    }

    public DescribeBlockStatusResponse describeBlockStatus(DescribeBlockStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBlockStatusWithOptions(request, runtime);
    }

    public DescribeCertsResponse describeCertsWithOptions(DescribeCertsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCerts", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCertsResponse());
    }

    public DescribeCertsResponse describeCerts(DescribeCertsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCertsWithOptions(request, runtime);
    }

    public DescribeCnameReusesResponse describeCnameReusesWithOptions(DescribeCnameReusesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCnameReuses", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCnameReusesResponse());
    }

    public DescribeCnameReusesResponse describeCnameReuses(DescribeCnameReusesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCnameReusesWithOptions(request, runtime);
    }

    public DescribeDDosAllEventListResponse describeDDosAllEventListWithOptions(DescribeDDosAllEventListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDDosAllEventList", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDDosAllEventListResponse());
    }

    public DescribeDDosAllEventListResponse describeDDosAllEventList(DescribeDDosAllEventListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDDosAllEventListWithOptions(request, runtime);
    }

    public DescribeDDosEventAreaResponse describeDDosEventAreaWithOptions(DescribeDDosEventAreaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDDosEventArea", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDDosEventAreaResponse());
    }

    public DescribeDDosEventAreaResponse describeDDosEventArea(DescribeDDosEventAreaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDDosEventAreaWithOptions(request, runtime);
    }

    public DescribeDDosEventAttackTypeResponse describeDDosEventAttackTypeWithOptions(DescribeDDosEventAttackTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDDosEventAttackType", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDDosEventAttackTypeResponse());
    }

    public DescribeDDosEventAttackTypeResponse describeDDosEventAttackType(DescribeDDosEventAttackTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDDosEventAttackTypeWithOptions(request, runtime);
    }

    public DescribeDDosEventIspResponse describeDDosEventIspWithOptions(DescribeDDosEventIspRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDDosEventIsp", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDDosEventIspResponse());
    }

    public DescribeDDosEventIspResponse describeDDosEventIsp(DescribeDDosEventIspRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDDosEventIspWithOptions(request, runtime);
    }

    public DescribeDDosEventMaxResponse describeDDosEventMaxWithOptions(DescribeDDosEventMaxRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDDosEventMax", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDDosEventMaxResponse());
    }

    public DescribeDDosEventMaxResponse describeDDosEventMax(DescribeDDosEventMaxRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDDosEventMaxWithOptions(request, runtime);
    }

    public DescribeDDoSEventsResponse describeDDoSEventsWithOptions(DescribeDDoSEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDDoSEvents", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDDoSEventsResponse());
    }

    public DescribeDDoSEventsResponse describeDDoSEvents(DescribeDDoSEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDDoSEventsWithOptions(request, runtime);
    }

    public DescribeDDosEventSrcIpResponse describeDDosEventSrcIpWithOptions(DescribeDDosEventSrcIpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDDosEventSrcIp", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDDosEventSrcIpResponse());
    }

    public DescribeDDosEventSrcIpResponse describeDDosEventSrcIp(DescribeDDosEventSrcIpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDDosEventSrcIpWithOptions(request, runtime);
    }

    public DescribeDefenseCountStatisticsResponse describeDefenseCountStatisticsWithOptions(DescribeDefenseCountStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDefenseCountStatistics", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDefenseCountStatisticsResponse());
    }

    public DescribeDefenseCountStatisticsResponse describeDefenseCountStatistics(DescribeDefenseCountStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDefenseCountStatisticsWithOptions(request, runtime);
    }

    public DescribeDefenseRecordsResponse describeDefenseRecordsWithOptions(DescribeDefenseRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDefenseRecords", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDefenseRecordsResponse());
    }

    public DescribeDefenseRecordsResponse describeDefenseRecords(DescribeDefenseRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDefenseRecordsWithOptions(request, runtime);
    }

    public DescribeDomainAttackEventsResponse describeDomainAttackEventsWithOptions(DescribeDomainAttackEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainAttackEvents", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainAttackEventsResponse());
    }

    public DescribeDomainAttackEventsResponse describeDomainAttackEvents(DescribeDomainAttackEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainAttackEventsWithOptions(request, runtime);
    }

    public DescribeDomainOverviewResponse describeDomainOverviewWithOptions(DescribeDomainOverviewRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainOverview", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainOverviewResponse());
    }

    public DescribeDomainOverviewResponse describeDomainOverview(DescribeDomainOverviewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainOverviewWithOptions(request, runtime);
    }

    public DescribeDomainQPSListResponse describeDomainQPSListWithOptions(DescribeDomainQPSListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainQPSList", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainQPSListResponse());
    }

    public DescribeDomainQPSListResponse describeDomainQPSList(DescribeDomainQPSListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainQPSListWithOptions(request, runtime);
    }

    public DescribeDomainQpsWithCacheResponse describeDomainQpsWithCacheWithOptions(DescribeDomainQpsWithCacheRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainQpsWithCache", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainQpsWithCacheResponse());
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
        return TeaModel.toModel(this.doRPCRequest("DescribeDomains", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainsResponse());
    }

    public DescribeDomainsResponse describeDomains(DescribeDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainsWithOptions(request, runtime);
    }

    public DescribeDomainStatusCodeCountResponse describeDomainStatusCodeCountWithOptions(DescribeDomainStatusCodeCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainStatusCodeCount", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainStatusCodeCountResponse());
    }

    public DescribeDomainStatusCodeCountResponse describeDomainStatusCodeCount(DescribeDomainStatusCodeCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainStatusCodeCountWithOptions(request, runtime);
    }

    public DescribeDomainStatusCodeListResponse describeDomainStatusCodeListWithOptions(DescribeDomainStatusCodeListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainStatusCodeList", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainStatusCodeListResponse());
    }

    public DescribeDomainStatusCodeListResponse describeDomainStatusCodeList(DescribeDomainStatusCodeListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainStatusCodeListWithOptions(request, runtime);
    }

    public DescribeDomainTopAttackListResponse describeDomainTopAttackListWithOptions(DescribeDomainTopAttackListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainTopAttackList", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainTopAttackListResponse());
    }

    public DescribeDomainTopAttackListResponse describeDomainTopAttackList(DescribeDomainTopAttackListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainTopAttackListWithOptions(request, runtime);
    }

    public DescribeDomainViewSourceCountriesResponse describeDomainViewSourceCountriesWithOptions(DescribeDomainViewSourceCountriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainViewSourceCountries", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainViewSourceCountriesResponse());
    }

    public DescribeDomainViewSourceCountriesResponse describeDomainViewSourceCountries(DescribeDomainViewSourceCountriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainViewSourceCountriesWithOptions(request, runtime);
    }

    public DescribeDomainViewSourceProvincesResponse describeDomainViewSourceProvincesWithOptions(DescribeDomainViewSourceProvincesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainViewSourceProvinces", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainViewSourceProvincesResponse());
    }

    public DescribeDomainViewSourceProvincesResponse describeDomainViewSourceProvinces(DescribeDomainViewSourceProvincesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainViewSourceProvincesWithOptions(request, runtime);
    }

    public DescribeDomainViewTopCostTimeResponse describeDomainViewTopCostTimeWithOptions(DescribeDomainViewTopCostTimeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainViewTopCostTime", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainViewTopCostTimeResponse());
    }

    public DescribeDomainViewTopCostTimeResponse describeDomainViewTopCostTime(DescribeDomainViewTopCostTimeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainViewTopCostTimeWithOptions(request, runtime);
    }

    public DescribeDomainViewTopUrlResponse describeDomainViewTopUrlWithOptions(DescribeDomainViewTopUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainViewTopUrl", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainViewTopUrlResponse());
    }

    public DescribeDomainViewTopUrlResponse describeDomainViewTopUrl(DescribeDomainViewTopUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainViewTopUrlWithOptions(request, runtime);
    }

    public DescribeElasticBandwidthSpecResponse describeElasticBandwidthSpecWithOptions(DescribeElasticBandwidthSpecRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeElasticBandwidthSpec", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeElasticBandwidthSpecResponse());
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
        return TeaModel.toModel(this.doRPCRequest("DescribeHealthCheckList", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeHealthCheckListResponse());
    }

    public DescribeHealthCheckListResponse describeHealthCheckList(DescribeHealthCheckListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHealthCheckListWithOptions(request, runtime);
    }

    public DescribeHealthCheckStatusResponse describeHealthCheckStatusWithOptions(DescribeHealthCheckStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeHealthCheckStatus", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeHealthCheckStatusResponse());
    }

    public DescribeHealthCheckStatusResponse describeHealthCheckStatus(DescribeHealthCheckStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHealthCheckStatusWithOptions(request, runtime);
    }

    public DescribeInstanceDetailsResponse describeInstanceDetailsWithOptions(DescribeInstanceDetailsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceDetails", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceDetailsResponse());
    }

    public DescribeInstanceDetailsResponse describeInstanceDetails(DescribeInstanceDetailsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceDetailsWithOptions(request, runtime);
    }

    public DescribeInstanceIdsResponse describeInstanceIdsWithOptions(DescribeInstanceIdsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceIds", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceIdsResponse());
    }

    public DescribeInstanceIdsResponse describeInstanceIds(DescribeInstanceIdsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceIdsWithOptions(request, runtime);
    }

    public DescribeInstancesResponse describeInstancesWithOptions(DescribeInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstances", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstancesResponse());
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
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceSpecs", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceSpecsResponse());
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
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceStatistics", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceStatisticsResponse());
    }

    public DescribeInstanceStatisticsResponse describeInstanceStatistics(DescribeInstanceStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceStatisticsWithOptions(request, runtime);
    }

    public DescribeInstanceStatusResponse describeInstanceStatusWithOptions(DescribeInstanceStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceStatus", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceStatusResponse());
    }

    public DescribeInstanceStatusResponse describeInstanceStatus(DescribeInstanceStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceStatusWithOptions(request, runtime);
    }

    public DescribeL7RsPolicyResponse describeL7RsPolicyWithOptions(DescribeL7RsPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeL7RsPolicy", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeL7RsPolicyResponse());
    }

    public DescribeL7RsPolicyResponse describeL7RsPolicy(DescribeL7RsPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeL7RsPolicyWithOptions(request, runtime);
    }

    public DescribeLogStoreExistStatusResponse describeLogStoreExistStatusWithOptions(DescribeLogStoreExistStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLogStoreExistStatus", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLogStoreExistStatusResponse());
    }

    public DescribeLogStoreExistStatusResponse describeLogStoreExistStatus(DescribeLogStoreExistStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLogStoreExistStatusWithOptions(request, runtime);
    }

    public DescribeNetworkRegionBlockResponse describeNetworkRegionBlockWithOptions(DescribeNetworkRegionBlockRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeNetworkRegionBlock", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeNetworkRegionBlockResponse());
    }

    public DescribeNetworkRegionBlockResponse describeNetworkRegionBlock(DescribeNetworkRegionBlockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNetworkRegionBlockWithOptions(request, runtime);
    }

    public DescribeNetworkRuleAttributesResponse describeNetworkRuleAttributesWithOptions(DescribeNetworkRuleAttributesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeNetworkRuleAttributes", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeNetworkRuleAttributesResponse());
    }

    public DescribeNetworkRuleAttributesResponse describeNetworkRuleAttributes(DescribeNetworkRuleAttributesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNetworkRuleAttributesWithOptions(request, runtime);
    }

    public DescribeNetworkRulesResponse describeNetworkRulesWithOptions(DescribeNetworkRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeNetworkRules", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeNetworkRulesResponse());
    }

    public DescribeNetworkRulesResponse describeNetworkRules(DescribeNetworkRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNetworkRulesWithOptions(request, runtime);
    }

    public DescribeOpEntitiesResponse describeOpEntitiesWithOptions(DescribeOpEntitiesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeOpEntities", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeOpEntitiesResponse());
    }

    public DescribeOpEntitiesResponse describeOpEntities(DescribeOpEntitiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeOpEntitiesWithOptions(request, runtime);
    }

    public DescribePortAttackMaxFlowResponse describePortAttackMaxFlowWithOptions(DescribePortAttackMaxFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePortAttackMaxFlow", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePortAttackMaxFlowResponse());
    }

    public DescribePortAttackMaxFlowResponse describePortAttackMaxFlow(DescribePortAttackMaxFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePortAttackMaxFlowWithOptions(request, runtime);
    }

    public DescribePortAutoCcStatusResponse describePortAutoCcStatusWithOptions(DescribePortAutoCcStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePortAutoCcStatus", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePortAutoCcStatusResponse());
    }

    public DescribePortAutoCcStatusResponse describePortAutoCcStatus(DescribePortAutoCcStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePortAutoCcStatusWithOptions(request, runtime);
    }

    public DescribePortConnsCountResponse describePortConnsCountWithOptions(DescribePortConnsCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePortConnsCount", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePortConnsCountResponse());
    }

    public DescribePortConnsCountResponse describePortConnsCount(DescribePortConnsCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePortConnsCountWithOptions(request, runtime);
    }

    public DescribePortConnsListResponse describePortConnsListWithOptions(DescribePortConnsListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePortConnsList", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePortConnsListResponse());
    }

    public DescribePortConnsListResponse describePortConnsList(DescribePortConnsListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePortConnsListWithOptions(request, runtime);
    }

    public DescribePortFlowListResponse describePortFlowListWithOptions(DescribePortFlowListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePortFlowList", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePortFlowListResponse());
    }

    public DescribePortFlowListResponse describePortFlowList(DescribePortFlowListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePortFlowListWithOptions(request, runtime);
    }

    public DescribePortMaxConnsResponse describePortMaxConnsWithOptions(DescribePortMaxConnsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePortMaxConns", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePortMaxConnsResponse());
    }

    public DescribePortMaxConnsResponse describePortMaxConns(DescribePortMaxConnsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePortMaxConnsWithOptions(request, runtime);
    }

    public DescribePortViewSourceCountriesResponse describePortViewSourceCountriesWithOptions(DescribePortViewSourceCountriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePortViewSourceCountries", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePortViewSourceCountriesResponse());
    }

    public DescribePortViewSourceCountriesResponse describePortViewSourceCountries(DescribePortViewSourceCountriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePortViewSourceCountriesWithOptions(request, runtime);
    }

    public DescribePortViewSourceIspsResponse describePortViewSourceIspsWithOptions(DescribePortViewSourceIspsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePortViewSourceIsps", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePortViewSourceIspsResponse());
    }

    public DescribePortViewSourceIspsResponse describePortViewSourceIsps(DescribePortViewSourceIspsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePortViewSourceIspsWithOptions(request, runtime);
    }

    public DescribePortViewSourceProvincesResponse describePortViewSourceProvincesWithOptions(DescribePortViewSourceProvincesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePortViewSourceProvinces", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePortViewSourceProvincesResponse());
    }

    public DescribePortViewSourceProvincesResponse describePortViewSourceProvinces(DescribePortViewSourceProvincesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePortViewSourceProvincesWithOptions(request, runtime);
    }

    public DescribeSceneDefenseObjectsResponse describeSceneDefenseObjectsWithOptions(DescribeSceneDefenseObjectsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSceneDefenseObjects", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSceneDefenseObjectsResponse());
    }

    public DescribeSceneDefenseObjectsResponse describeSceneDefenseObjects(DescribeSceneDefenseObjectsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSceneDefenseObjectsWithOptions(request, runtime);
    }

    public DescribeSceneDefensePoliciesResponse describeSceneDefensePoliciesWithOptions(DescribeSceneDefensePoliciesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSceneDefensePolicies", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSceneDefensePoliciesResponse());
    }

    public DescribeSceneDefensePoliciesResponse describeSceneDefensePolicies(DescribeSceneDefensePoliciesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSceneDefensePoliciesWithOptions(request, runtime);
    }

    public DescribeSchedulerRulesResponse describeSchedulerRulesWithOptions(DescribeSchedulerRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSchedulerRules", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSchedulerRulesResponse());
    }

    public DescribeSchedulerRulesResponse describeSchedulerRules(DescribeSchedulerRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSchedulerRulesWithOptions(request, runtime);
    }

    public DescribeSlsAuthStatusResponse describeSlsAuthStatusWithOptions(DescribeSlsAuthStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSlsAuthStatus", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSlsAuthStatusResponse());
    }

    public DescribeSlsAuthStatusResponse describeSlsAuthStatus(DescribeSlsAuthStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSlsAuthStatusWithOptions(request, runtime);
    }

    public DescribeSlsLogstoreInfoResponse describeSlsLogstoreInfoWithOptions(DescribeSlsLogstoreInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSlsLogstoreInfo", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSlsLogstoreInfoResponse());
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
        return TeaModel.toModel(this.doRPCRequest("DescribeSlsOpenStatus", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSlsOpenStatusResponse());
    }

    public DescribeSlsOpenStatusResponse describeSlsOpenStatus(DescribeSlsOpenStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSlsOpenStatusWithOptions(request, runtime);
    }

    public DescribeStsGrantStatusResponse describeStsGrantStatusWithOptions(DescribeStsGrantStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeStsGrantStatus", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeStsGrantStatusResponse());
    }

    public DescribeStsGrantStatusResponse describeStsGrantStatus(DescribeStsGrantStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeStsGrantStatusWithOptions(request, runtime);
    }

    public DescribeTagKeysResponse describeTagKeysWithOptions(DescribeTagKeysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeTagKeys", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeTagKeysResponse());
    }

    public DescribeTagKeysResponse describeTagKeys(DescribeTagKeysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTagKeysWithOptions(request, runtime);
    }

    public DescribeTagResourcesResponse describeTagResourcesWithOptions(DescribeTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeTagResources", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeTagResourcesResponse());
    }

    public DescribeTagResourcesResponse describeTagResources(DescribeTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTagResourcesWithOptions(request, runtime);
    }

    public DescribeUnBlackholeCountResponse describeUnBlackholeCountWithOptions(DescribeUnBlackholeCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUnBlackholeCount", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUnBlackholeCountResponse());
    }

    public DescribeUnBlackholeCountResponse describeUnBlackholeCount(DescribeUnBlackholeCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUnBlackholeCountWithOptions(request, runtime);
    }

    public DescribeUnBlockCountResponse describeUnBlockCountWithOptions(DescribeUnBlockCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUnBlockCount", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUnBlockCountResponse());
    }

    public DescribeUnBlockCountResponse describeUnBlockCount(DescribeUnBlockCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUnBlockCountWithOptions(request, runtime);
    }

    public DescribeWebAccessLogDispatchStatusResponse describeWebAccessLogDispatchStatusWithOptions(DescribeWebAccessLogDispatchStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeWebAccessLogDispatchStatus", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeWebAccessLogDispatchStatusResponse());
    }

    public DescribeWebAccessLogDispatchStatusResponse describeWebAccessLogDispatchStatus(DescribeWebAccessLogDispatchStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeWebAccessLogDispatchStatusWithOptions(request, runtime);
    }

    public DescribeWebAccessLogEmptyCountResponse describeWebAccessLogEmptyCountWithOptions(DescribeWebAccessLogEmptyCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeWebAccessLogEmptyCount", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeWebAccessLogEmptyCountResponse());
    }

    public DescribeWebAccessLogEmptyCountResponse describeWebAccessLogEmptyCount(DescribeWebAccessLogEmptyCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeWebAccessLogEmptyCountWithOptions(request, runtime);
    }

    public DescribeWebAccessLogStatusResponse describeWebAccessLogStatusWithOptions(DescribeWebAccessLogStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeWebAccessLogStatus", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeWebAccessLogStatusResponse());
    }

    public DescribeWebAccessLogStatusResponse describeWebAccessLogStatus(DescribeWebAccessLogStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeWebAccessLogStatusWithOptions(request, runtime);
    }

    public DescribeWebAccessModeResponse describeWebAccessModeWithOptions(DescribeWebAccessModeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeWebAccessMode", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeWebAccessModeResponse());
    }

    public DescribeWebAccessModeResponse describeWebAccessMode(DescribeWebAccessModeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeWebAccessModeWithOptions(request, runtime);
    }

    public DescribeWebAreaBlockConfigsResponse describeWebAreaBlockConfigsWithOptions(DescribeWebAreaBlockConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeWebAreaBlockConfigs", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeWebAreaBlockConfigsResponse());
    }

    public DescribeWebAreaBlockConfigsResponse describeWebAreaBlockConfigs(DescribeWebAreaBlockConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeWebAreaBlockConfigsWithOptions(request, runtime);
    }

    public DescribeWebCacheConfigsResponse describeWebCacheConfigsWithOptions(DescribeWebCacheConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeWebCacheConfigs", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeWebCacheConfigsResponse());
    }

    public DescribeWebCacheConfigsResponse describeWebCacheConfigs(DescribeWebCacheConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeWebCacheConfigsWithOptions(request, runtime);
    }

    public DescribeWebCcProtectSwitchResponse describeWebCcProtectSwitchWithOptions(DescribeWebCcProtectSwitchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeWebCcProtectSwitch", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeWebCcProtectSwitchResponse());
    }

    public DescribeWebCcProtectSwitchResponse describeWebCcProtectSwitch(DescribeWebCcProtectSwitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeWebCcProtectSwitchWithOptions(request, runtime);
    }

    public DescribeWebCCRulesResponse describeWebCCRulesWithOptions(DescribeWebCCRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeWebCCRules", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeWebCCRulesResponse());
    }

    public DescribeWebCCRulesResponse describeWebCCRules(DescribeWebCCRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeWebCCRulesWithOptions(request, runtime);
    }

    public DescribeWebCustomPortsResponse describeWebCustomPortsWithOptions(DescribeWebCustomPortsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeWebCustomPorts", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeWebCustomPortsResponse());
    }

    public DescribeWebCustomPortsResponse describeWebCustomPorts(DescribeWebCustomPortsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeWebCustomPortsWithOptions(request, runtime);
    }

    public DescribeWebInstanceRelationsResponse describeWebInstanceRelationsWithOptions(DescribeWebInstanceRelationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeWebInstanceRelations", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeWebInstanceRelationsResponse());
    }

    public DescribeWebInstanceRelationsResponse describeWebInstanceRelations(DescribeWebInstanceRelationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeWebInstanceRelationsWithOptions(request, runtime);
    }

    public DescribeWebPreciseAccessRuleResponse describeWebPreciseAccessRuleWithOptions(DescribeWebPreciseAccessRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeWebPreciseAccessRule", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeWebPreciseAccessRuleResponse());
    }

    public DescribeWebPreciseAccessRuleResponse describeWebPreciseAccessRule(DescribeWebPreciseAccessRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeWebPreciseAccessRuleWithOptions(request, runtime);
    }

    public DescribeWebRulesResponse describeWebRulesWithOptions(DescribeWebRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeWebRules", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeWebRulesResponse());
    }

    public DescribeWebRulesResponse describeWebRules(DescribeWebRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeWebRulesWithOptions(request, runtime);
    }

    public DetachSceneDefenseObjectResponse detachSceneDefenseObjectWithOptions(DetachSceneDefenseObjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DetachSceneDefenseObject", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DetachSceneDefenseObjectResponse());
    }

    public DetachSceneDefenseObjectResponse detachSceneDefenseObject(DetachSceneDefenseObjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detachSceneDefenseObjectWithOptions(request, runtime);
    }

    public DisableSceneDefensePolicyResponse disableSceneDefensePolicyWithOptions(DisableSceneDefensePolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableSceneDefensePolicy", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DisableSceneDefensePolicyResponse());
    }

    public DisableSceneDefensePolicyResponse disableSceneDefensePolicy(DisableSceneDefensePolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableSceneDefensePolicyWithOptions(request, runtime);
    }

    public DisableWebAccessLogConfigResponse disableWebAccessLogConfigWithOptions(DisableWebAccessLogConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableWebAccessLogConfig", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DisableWebAccessLogConfigResponse());
    }

    public DisableWebAccessLogConfigResponse disableWebAccessLogConfig(DisableWebAccessLogConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableWebAccessLogConfigWithOptions(request, runtime);
    }

    public DisableWebCCResponse disableWebCCWithOptions(DisableWebCCRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableWebCC", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DisableWebCCResponse());
    }

    public DisableWebCCResponse disableWebCC(DisableWebCCRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableWebCCWithOptions(request, runtime);
    }

    public DisableWebCCRuleResponse disableWebCCRuleWithOptions(DisableWebCCRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableWebCCRule", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DisableWebCCRuleResponse());
    }

    public DisableWebCCRuleResponse disableWebCCRule(DisableWebCCRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableWebCCRuleWithOptions(request, runtime);
    }

    public EmptyAutoCcBlacklistResponse emptyAutoCcBlacklistWithOptions(EmptyAutoCcBlacklistRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EmptyAutoCcBlacklist", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new EmptyAutoCcBlacklistResponse());
    }

    public EmptyAutoCcBlacklistResponse emptyAutoCcBlacklist(EmptyAutoCcBlacklistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.emptyAutoCcBlacklistWithOptions(request, runtime);
    }

    public EmptyAutoCcWhitelistResponse emptyAutoCcWhitelistWithOptions(EmptyAutoCcWhitelistRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EmptyAutoCcWhitelist", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new EmptyAutoCcWhitelistResponse());
    }

    public EmptyAutoCcWhitelistResponse emptyAutoCcWhitelist(EmptyAutoCcWhitelistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.emptyAutoCcWhitelistWithOptions(request, runtime);
    }

    public EmptySlsLogstoreResponse emptySlsLogstoreWithOptions(EmptySlsLogstoreRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EmptySlsLogstore", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new EmptySlsLogstoreResponse());
    }

    public EmptySlsLogstoreResponse emptySlsLogstore(EmptySlsLogstoreRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.emptySlsLogstoreWithOptions(request, runtime);
    }

    public EnableSceneDefensePolicyResponse enableSceneDefensePolicyWithOptions(EnableSceneDefensePolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableSceneDefensePolicy", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new EnableSceneDefensePolicyResponse());
    }

    public EnableSceneDefensePolicyResponse enableSceneDefensePolicy(EnableSceneDefensePolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableSceneDefensePolicyWithOptions(request, runtime);
    }

    public EnableWebAccessLogConfigResponse enableWebAccessLogConfigWithOptions(EnableWebAccessLogConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableWebAccessLogConfig", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new EnableWebAccessLogConfigResponse());
    }

    public EnableWebAccessLogConfigResponse enableWebAccessLogConfig(EnableWebAccessLogConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableWebAccessLogConfigWithOptions(request, runtime);
    }

    public EnableWebCCResponse enableWebCCWithOptions(EnableWebCCRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableWebCC", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new EnableWebCCResponse());
    }

    public EnableWebCCResponse enableWebCC(EnableWebCCRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableWebCCWithOptions(request, runtime);
    }

    public EnableWebCCRuleResponse enableWebCCRuleWithOptions(EnableWebCCRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableWebCCRule", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new EnableWebCCRuleResponse());
    }

    public EnableWebCCRuleResponse enableWebCCRule(EnableWebCCRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableWebCCRuleWithOptions(request, runtime);
    }

    public ModifyBlackholeStatusResponse modifyBlackholeStatusWithOptions(ModifyBlackholeStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyBlackholeStatus", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyBlackholeStatusResponse());
    }

    public ModifyBlackholeStatusResponse modifyBlackholeStatus(ModifyBlackholeStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyBlackholeStatusWithOptions(request, runtime);
    }

    public ModifyBlockStatusResponse modifyBlockStatusWithOptions(ModifyBlockStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyBlockStatus", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyBlockStatusResponse());
    }

    public ModifyBlockStatusResponse modifyBlockStatus(ModifyBlockStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyBlockStatusWithOptions(request, runtime);
    }

    public ModifyCnameReuseResponse modifyCnameReuseWithOptions(ModifyCnameReuseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyCnameReuse", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyCnameReuseResponse());
    }

    public ModifyCnameReuseResponse modifyCnameReuse(ModifyCnameReuseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyCnameReuseWithOptions(request, runtime);
    }

    public ModifyElasticBandWidthResponse modifyElasticBandWidthWithOptions(ModifyElasticBandWidthRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyElasticBandWidth", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyElasticBandWidthResponse());
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
        return TeaModel.toModel(this.doRPCRequest("ModifyFullLogTtl", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyFullLogTtlResponse());
    }

    public ModifyFullLogTtlResponse modifyFullLogTtl(ModifyFullLogTtlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyFullLogTtlWithOptions(request, runtime);
    }

    public ModifyHealthCheckConfigResponse modifyHealthCheckConfigWithOptions(ModifyHealthCheckConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyHealthCheckConfig", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyHealthCheckConfigResponse());
    }

    public ModifyHealthCheckConfigResponse modifyHealthCheckConfig(ModifyHealthCheckConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyHealthCheckConfigWithOptions(request, runtime);
    }

    public ModifyHttp2EnableResponse modifyHttp2EnableWithOptions(ModifyHttp2EnableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyHttp2Enable", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyHttp2EnableResponse());
    }

    public ModifyHttp2EnableResponse modifyHttp2Enable(ModifyHttp2EnableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyHttp2EnableWithOptions(request, runtime);
    }

    public ModifyInstanceRemarkResponse modifyInstanceRemarkWithOptions(ModifyInstanceRemarkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstanceRemark", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceRemarkResponse());
    }

    public ModifyInstanceRemarkResponse modifyInstanceRemark(ModifyInstanceRemarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceRemarkWithOptions(request, runtime);
    }

    public ModifyNetworkRuleAttributeResponse modifyNetworkRuleAttributeWithOptions(ModifyNetworkRuleAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyNetworkRuleAttribute", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyNetworkRuleAttributeResponse());
    }

    public ModifyNetworkRuleAttributeResponse modifyNetworkRuleAttribute(ModifyNetworkRuleAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyNetworkRuleAttributeWithOptions(request, runtime);
    }

    public ModifyPortAutoCcStatusResponse modifyPortAutoCcStatusWithOptions(ModifyPortAutoCcStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyPortAutoCcStatus", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyPortAutoCcStatusResponse());
    }

    public ModifyPortAutoCcStatusResponse modifyPortAutoCcStatus(ModifyPortAutoCcStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyPortAutoCcStatusWithOptions(request, runtime);
    }

    public ModifySceneDefensePolicyResponse modifySceneDefensePolicyWithOptions(ModifySceneDefensePolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySceneDefensePolicy", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySceneDefensePolicyResponse());
    }

    public ModifySceneDefensePolicyResponse modifySceneDefensePolicy(ModifySceneDefensePolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySceneDefensePolicyWithOptions(request, runtime);
    }

    public ModifySchedulerRuleResponse modifySchedulerRuleWithOptions(ModifySchedulerRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySchedulerRule", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySchedulerRuleResponse());
    }

    public ModifySchedulerRuleResponse modifySchedulerRule(ModifySchedulerRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySchedulerRuleWithOptions(request, runtime);
    }

    public ModifyTlsConfigResponse modifyTlsConfigWithOptions(ModifyTlsConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyTlsConfig", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyTlsConfigResponse());
    }

    public ModifyTlsConfigResponse modifyTlsConfig(ModifyTlsConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyTlsConfigWithOptions(request, runtime);
    }

    public ModifyWebAccessModeResponse modifyWebAccessModeWithOptions(ModifyWebAccessModeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyWebAccessMode", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyWebAccessModeResponse());
    }

    public ModifyWebAccessModeResponse modifyWebAccessMode(ModifyWebAccessModeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyWebAccessModeWithOptions(request, runtime);
    }

    public ModifyWebAIProtectModeResponse modifyWebAIProtectModeWithOptions(ModifyWebAIProtectModeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyWebAIProtectMode", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyWebAIProtectModeResponse());
    }

    public ModifyWebAIProtectModeResponse modifyWebAIProtectMode(ModifyWebAIProtectModeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyWebAIProtectModeWithOptions(request, runtime);
    }

    public ModifyWebAIProtectSwitchResponse modifyWebAIProtectSwitchWithOptions(ModifyWebAIProtectSwitchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyWebAIProtectSwitch", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyWebAIProtectSwitchResponse());
    }

    public ModifyWebAIProtectSwitchResponse modifyWebAIProtectSwitch(ModifyWebAIProtectSwitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyWebAIProtectSwitchWithOptions(request, runtime);
    }

    public ModifyWebAreaBlockResponse modifyWebAreaBlockWithOptions(ModifyWebAreaBlockRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyWebAreaBlock", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyWebAreaBlockResponse());
    }

    public ModifyWebAreaBlockResponse modifyWebAreaBlock(ModifyWebAreaBlockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyWebAreaBlockWithOptions(request, runtime);
    }

    public ModifyWebAreaBlockSwitchResponse modifyWebAreaBlockSwitchWithOptions(ModifyWebAreaBlockSwitchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyWebAreaBlockSwitch", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyWebAreaBlockSwitchResponse());
    }

    public ModifyWebAreaBlockSwitchResponse modifyWebAreaBlockSwitch(ModifyWebAreaBlockSwitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyWebAreaBlockSwitchWithOptions(request, runtime);
    }

    public ModifyWebCacheCustomRuleResponse modifyWebCacheCustomRuleWithOptions(ModifyWebCacheCustomRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyWebCacheCustomRule", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyWebCacheCustomRuleResponse());
    }

    public ModifyWebCacheCustomRuleResponse modifyWebCacheCustomRule(ModifyWebCacheCustomRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyWebCacheCustomRuleWithOptions(request, runtime);
    }

    public ModifyWebCacheModeResponse modifyWebCacheModeWithOptions(ModifyWebCacheModeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyWebCacheMode", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyWebCacheModeResponse());
    }

    public ModifyWebCacheModeResponse modifyWebCacheMode(ModifyWebCacheModeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyWebCacheModeWithOptions(request, runtime);
    }

    public ModifyWebCacheSwitchResponse modifyWebCacheSwitchWithOptions(ModifyWebCacheSwitchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyWebCacheSwitch", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyWebCacheSwitchResponse());
    }

    public ModifyWebCacheSwitchResponse modifyWebCacheSwitch(ModifyWebCacheSwitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyWebCacheSwitchWithOptions(request, runtime);
    }

    public ModifyWebCCRuleResponse modifyWebCCRuleWithOptions(ModifyWebCCRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyWebCCRule", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyWebCCRuleResponse());
    }

    public ModifyWebCCRuleResponse modifyWebCCRule(ModifyWebCCRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyWebCCRuleWithOptions(request, runtime);
    }

    public ModifyWebIpSetSwitchResponse modifyWebIpSetSwitchWithOptions(ModifyWebIpSetSwitchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyWebIpSetSwitch", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyWebIpSetSwitchResponse());
    }

    public ModifyWebIpSetSwitchResponse modifyWebIpSetSwitch(ModifyWebIpSetSwitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyWebIpSetSwitchWithOptions(request, runtime);
    }

    public ModifyWebPreciseAccessRuleResponse modifyWebPreciseAccessRuleWithOptions(ModifyWebPreciseAccessRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyWebPreciseAccessRule", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyWebPreciseAccessRuleResponse());
    }

    public ModifyWebPreciseAccessRuleResponse modifyWebPreciseAccessRule(ModifyWebPreciseAccessRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyWebPreciseAccessRuleWithOptions(request, runtime);
    }

    public ModifyWebPreciseAccessSwitchResponse modifyWebPreciseAccessSwitchWithOptions(ModifyWebPreciseAccessSwitchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyWebPreciseAccessSwitch", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyWebPreciseAccessSwitchResponse());
    }

    public ModifyWebPreciseAccessSwitchResponse modifyWebPreciseAccessSwitch(ModifyWebPreciseAccessSwitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyWebPreciseAccessSwitchWithOptions(request, runtime);
    }

    public ModifyWebRuleResponse modifyWebRuleWithOptions(ModifyWebRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyWebRule", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyWebRuleResponse());
    }

    public ModifyWebRuleResponse modifyWebRule(ModifyWebRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyWebRuleWithOptions(request, runtime);
    }

    public ReleaseInstanceResponse releaseInstanceWithOptions(ReleaseInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleaseInstance", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ReleaseInstanceResponse());
    }

    public ReleaseInstanceResponse releaseInstance(ReleaseInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseInstanceWithOptions(request, runtime);
    }

    public SwitchSchedulerRuleResponse switchSchedulerRuleWithOptions(SwitchSchedulerRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SwitchSchedulerRule", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new SwitchSchedulerRuleResponse());
    }

    public SwitchSchedulerRuleResponse switchSchedulerRule(SwitchSchedulerRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.switchSchedulerRuleWithOptions(request, runtime);
    }
}
