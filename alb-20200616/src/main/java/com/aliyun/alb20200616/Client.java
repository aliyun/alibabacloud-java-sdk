// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616;

import com.aliyun.tea.*;
import com.aliyun.alb20200616.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-beijing", "alb.cn-beijing.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "alb.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "alb.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shanghai", "alb.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "alb.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-hongkong", "alb.cn-hongkong.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "alb.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "alb.ap-southeast-2.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "alb.ap-southeast-5.aliyuncs.com"),
            new TeaPair("us-east-1", "alb.us-east-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "alb.eu-central-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "alb.ap-south-1.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "alb.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "alb.ap-southeast-3.aliyuncs.com"),
            new TeaPair("cn-chengdu", "alb.cn-chengdu.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "alb.cn-huhehaote.aliyuncs.com"),
            new TeaPair("cn-qingdao", "alb.cn-qingdao.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "alb.cn-wulanchabu.aliyuncs.com"),
            new TeaPair("eu-west-1", "alb.eu-west-1.aliyuncs.com"),
            new TeaPair("us-west-1", "alb.us-west-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("alb", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddEntriesToAclResponse addEntriesToAclWithOptions(AddEntriesToAclRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddEntriesToAcl", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new AddEntriesToAclResponse());
    }

    public AddEntriesToAclResponse addEntriesToAcl(AddEntriesToAclRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addEntriesToAclWithOptions(request, runtime);
    }

    public AddServersToServerGroupResponse addServersToServerGroupWithOptions(AddServersToServerGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddServersToServerGroup", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new AddServersToServerGroupResponse());
    }

    public AddServersToServerGroupResponse addServersToServerGroup(AddServersToServerGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addServersToServerGroupWithOptions(request, runtime);
    }

    public AssociateAclsWithListenerResponse associateAclsWithListenerWithOptions(AssociateAclsWithListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AssociateAclsWithListener", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new AssociateAclsWithListenerResponse());
    }

    public AssociateAclsWithListenerResponse associateAclsWithListener(AssociateAclsWithListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.associateAclsWithListenerWithOptions(request, runtime);
    }

    public AssociateAdditionalCertificatesWithListenerResponse associateAdditionalCertificatesWithListenerWithOptions(AssociateAdditionalCertificatesWithListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AssociateAdditionalCertificatesWithListener", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new AssociateAdditionalCertificatesWithListenerResponse());
    }

    public AssociateAdditionalCertificatesWithListenerResponse associateAdditionalCertificatesWithListener(AssociateAdditionalCertificatesWithListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.associateAdditionalCertificatesWithListenerWithOptions(request, runtime);
    }

    public CreateAclResponse createAclWithOptions(CreateAclRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAcl", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAclResponse());
    }

    public CreateAclResponse createAcl(CreateAclRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAclWithOptions(request, runtime);
    }

    public CreateHealthCheckTemplateResponse createHealthCheckTemplateWithOptions(CreateHealthCheckTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateHealthCheckTemplate", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new CreateHealthCheckTemplateResponse());
    }

    public CreateHealthCheckTemplateResponse createHealthCheckTemplate(CreateHealthCheckTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createHealthCheckTemplateWithOptions(request, runtime);
    }

    public CreateListenerResponse createListenerWithOptions(CreateListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateListener", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new CreateListenerResponse());
    }

    public CreateListenerResponse createListener(CreateListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createListenerWithOptions(request, runtime);
    }

    public CreateLoadBalancerResponse createLoadBalancerWithOptions(CreateLoadBalancerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateLoadBalancer", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new CreateLoadBalancerResponse());
    }

    public CreateLoadBalancerResponse createLoadBalancer(CreateLoadBalancerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLoadBalancerWithOptions(request, runtime);
    }

    public CreateRuleResponse createRuleWithOptions(CreateRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRule", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRuleResponse());
    }

    public CreateRuleResponse createRule(CreateRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRuleWithOptions(request, runtime);
    }

    public CreateRulesResponse createRulesWithOptions(CreateRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRules", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRulesResponse());
    }

    public CreateRulesResponse createRules(CreateRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRulesWithOptions(request, runtime);
    }

    public CreateSecurityPolicyResponse createSecurityPolicyWithOptions(CreateSecurityPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSecurityPolicy", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSecurityPolicyResponse());
    }

    public CreateSecurityPolicyResponse createSecurityPolicy(CreateSecurityPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSecurityPolicyWithOptions(request, runtime);
    }

    public CreateServerGroupResponse createServerGroupWithOptions(CreateServerGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateServerGroup", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new CreateServerGroupResponse());
    }

    public CreateServerGroupResponse createServerGroup(CreateServerGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createServerGroupWithOptions(request, runtime);
    }

    public DeleteAclResponse deleteAclWithOptions(DeleteAclRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAcl", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAclResponse());
    }

    public DeleteAclResponse deleteAcl(DeleteAclRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAclWithOptions(request, runtime);
    }

    public DeleteHealthCheckTemplatesResponse deleteHealthCheckTemplatesWithOptions(DeleteHealthCheckTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteHealthCheckTemplates", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteHealthCheckTemplatesResponse());
    }

    public DeleteHealthCheckTemplatesResponse deleteHealthCheckTemplates(DeleteHealthCheckTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteHealthCheckTemplatesWithOptions(request, runtime);
    }

    public DeleteListenerResponse deleteListenerWithOptions(DeleteListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteListener", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteListenerResponse());
    }

    public DeleteListenerResponse deleteListener(DeleteListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteListenerWithOptions(request, runtime);
    }

    public DeleteLoadBalancerResponse deleteLoadBalancerWithOptions(DeleteLoadBalancerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteLoadBalancer", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteLoadBalancerResponse());
    }

    public DeleteLoadBalancerResponse deleteLoadBalancer(DeleteLoadBalancerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLoadBalancerWithOptions(request, runtime);
    }

    public DeleteRuleResponse deleteRuleWithOptions(DeleteRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteRule", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteRuleResponse());
    }

    public DeleteRuleResponse deleteRule(DeleteRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRuleWithOptions(request, runtime);
    }

    public DeleteRulesResponse deleteRulesWithOptions(DeleteRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteRules", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteRulesResponse());
    }

    public DeleteRulesResponse deleteRules(DeleteRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRulesWithOptions(request, runtime);
    }

    public DeleteSecurityPolicyResponse deleteSecurityPolicyWithOptions(DeleteSecurityPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSecurityPolicy", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSecurityPolicyResponse());
    }

    public DeleteSecurityPolicyResponse deleteSecurityPolicy(DeleteSecurityPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSecurityPolicyWithOptions(request, runtime);
    }

    public DeleteServerGroupResponse deleteServerGroupWithOptions(DeleteServerGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteServerGroup", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteServerGroupResponse());
    }

    public DeleteServerGroupResponse deleteServerGroup(DeleteServerGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteServerGroupWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRegions", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DescribeZonesResponse describeZonesWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeZones", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeZonesResponse());
    }

    public DescribeZonesResponse describeZones() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeZonesWithOptions(runtime);
    }

    public DisableDeletionProtectionResponse disableDeletionProtectionWithOptions(DisableDeletionProtectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableDeletionProtection", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new DisableDeletionProtectionResponse());
    }

    public DisableDeletionProtectionResponse disableDeletionProtection(DisableDeletionProtectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableDeletionProtectionWithOptions(request, runtime);
    }

    public DisableLoadBalancerAccessLogResponse disableLoadBalancerAccessLogWithOptions(DisableLoadBalancerAccessLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableLoadBalancerAccessLog", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new DisableLoadBalancerAccessLogResponse());
    }

    public DisableLoadBalancerAccessLogResponse disableLoadBalancerAccessLog(DisableLoadBalancerAccessLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableLoadBalancerAccessLogWithOptions(request, runtime);
    }

    public DissociateAclsFromListenerResponse dissociateAclsFromListenerWithOptions(DissociateAclsFromListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DissociateAclsFromListener", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new DissociateAclsFromListenerResponse());
    }

    public DissociateAclsFromListenerResponse dissociateAclsFromListener(DissociateAclsFromListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.dissociateAclsFromListenerWithOptions(request, runtime);
    }

    public DissociateAdditionalCertificatesFromListenerResponse dissociateAdditionalCertificatesFromListenerWithOptions(DissociateAdditionalCertificatesFromListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DissociateAdditionalCertificatesFromListener", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new DissociateAdditionalCertificatesFromListenerResponse());
    }

    public DissociateAdditionalCertificatesFromListenerResponse dissociateAdditionalCertificatesFromListener(DissociateAdditionalCertificatesFromListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.dissociateAdditionalCertificatesFromListenerWithOptions(request, runtime);
    }

    public EnableDeletionProtectionResponse enableDeletionProtectionWithOptions(EnableDeletionProtectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableDeletionProtection", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new EnableDeletionProtectionResponse());
    }

    public EnableDeletionProtectionResponse enableDeletionProtection(EnableDeletionProtectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableDeletionProtectionWithOptions(request, runtime);
    }

    public EnableLoadBalancerAccessLogResponse enableLoadBalancerAccessLogWithOptions(EnableLoadBalancerAccessLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableLoadBalancerAccessLog", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new EnableLoadBalancerAccessLogResponse());
    }

    public EnableLoadBalancerAccessLogResponse enableLoadBalancerAccessLog(EnableLoadBalancerAccessLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableLoadBalancerAccessLogWithOptions(request, runtime);
    }

    public GetHealthCheckTemplateAttributeResponse getHealthCheckTemplateAttributeWithOptions(GetHealthCheckTemplateAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetHealthCheckTemplateAttribute", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new GetHealthCheckTemplateAttributeResponse());
    }

    public GetHealthCheckTemplateAttributeResponse getHealthCheckTemplateAttribute(GetHealthCheckTemplateAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getHealthCheckTemplateAttributeWithOptions(request, runtime);
    }

    public GetListenerAttributeResponse getListenerAttributeWithOptions(GetListenerAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetListenerAttribute", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new GetListenerAttributeResponse());
    }

    public GetListenerAttributeResponse getListenerAttribute(GetListenerAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getListenerAttributeWithOptions(request, runtime);
    }

    public GetListenerHealthStatusResponse getListenerHealthStatusWithOptions(GetListenerHealthStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetListenerHealthStatus", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new GetListenerHealthStatusResponse());
    }

    public GetListenerHealthStatusResponse getListenerHealthStatus(GetListenerHealthStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getListenerHealthStatusWithOptions(request, runtime);
    }

    public GetLoadBalancerAttributeResponse getLoadBalancerAttributeWithOptions(GetLoadBalancerAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetLoadBalancerAttribute", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new GetLoadBalancerAttributeResponse());
    }

    public GetLoadBalancerAttributeResponse getLoadBalancerAttribute(GetLoadBalancerAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLoadBalancerAttributeWithOptions(request, runtime);
    }

    public ListAclEntriesResponse listAclEntriesWithOptions(ListAclEntriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAclEntries", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new ListAclEntriesResponse());
    }

    public ListAclEntriesResponse listAclEntries(ListAclEntriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAclEntriesWithOptions(request, runtime);
    }

    public ListAclRelationsResponse listAclRelationsWithOptions(ListAclRelationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAclRelations", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new ListAclRelationsResponse());
    }

    public ListAclRelationsResponse listAclRelations(ListAclRelationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAclRelationsWithOptions(request, runtime);
    }

    public ListAclsResponse listAclsWithOptions(ListAclsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAcls", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new ListAclsResponse());
    }

    public ListAclsResponse listAcls(ListAclsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAclsWithOptions(request, runtime);
    }

    public ListAsynJobsResponse listAsynJobsWithOptions(ListAsynJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAsynJobs", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new ListAsynJobsResponse());
    }

    public ListAsynJobsResponse listAsynJobs(ListAsynJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAsynJobsWithOptions(request, runtime);
    }

    public ListHealthCheckTemplatesResponse listHealthCheckTemplatesWithOptions(ListHealthCheckTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListHealthCheckTemplates", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new ListHealthCheckTemplatesResponse());
    }

    public ListHealthCheckTemplatesResponse listHealthCheckTemplates(ListHealthCheckTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listHealthCheckTemplatesWithOptions(request, runtime);
    }

    public ListListenerCertificatesResponse listListenerCertificatesWithOptions(ListListenerCertificatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListListenerCertificates", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new ListListenerCertificatesResponse());
    }

    public ListListenerCertificatesResponse listListenerCertificates(ListListenerCertificatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listListenerCertificatesWithOptions(request, runtime);
    }

    public ListListenersResponse listListenersWithOptions(ListListenersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListListeners", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new ListListenersResponse());
    }

    public ListListenersResponse listListeners(ListListenersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listListenersWithOptions(request, runtime);
    }

    public ListLoadBalancersResponse listLoadBalancersWithOptions(ListLoadBalancersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListLoadBalancers", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new ListLoadBalancersResponse());
    }

    public ListLoadBalancersResponse listLoadBalancers(ListLoadBalancersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listLoadBalancersWithOptions(request, runtime);
    }

    public ListRulesResponse listRulesWithOptions(ListRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRules", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new ListRulesResponse());
    }

    public ListRulesResponse listRules(ListRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRulesWithOptions(request, runtime);
    }

    public ListSecurityPoliciesResponse listSecurityPoliciesWithOptions(ListSecurityPoliciesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSecurityPolicies", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new ListSecurityPoliciesResponse());
    }

    public ListSecurityPoliciesResponse listSecurityPolicies(ListSecurityPoliciesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSecurityPoliciesWithOptions(request, runtime);
    }

    public ListSecurityPolicyRelationsResponse listSecurityPolicyRelationsWithOptions(ListSecurityPolicyRelationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSecurityPolicyRelations", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new ListSecurityPolicyRelationsResponse());
    }

    public ListSecurityPolicyRelationsResponse listSecurityPolicyRelations(ListSecurityPolicyRelationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSecurityPolicyRelationsWithOptions(request, runtime);
    }

    public ListServerGroupsResponse listServerGroupsWithOptions(ListServerGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListServerGroups", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new ListServerGroupsResponse());
    }

    public ListServerGroupsResponse listServerGroups(ListServerGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listServerGroupsWithOptions(request, runtime);
    }

    public ListServerGroupServersResponse listServerGroupServersWithOptions(ListServerGroupServersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListServerGroupServers", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new ListServerGroupServersResponse());
    }

    public ListServerGroupServersResponse listServerGroupServers(ListServerGroupServersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listServerGroupServersWithOptions(request, runtime);
    }

    public ListSystemSecurityPoliciesResponse listSystemSecurityPoliciesWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("ListSystemSecurityPolicies", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new ListSystemSecurityPoliciesResponse());
    }

    public ListSystemSecurityPoliciesResponse listSystemSecurityPolicies() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSystemSecurityPoliciesWithOptions(runtime);
    }

    public ListTagKeysResponse listTagKeysWithOptions(ListTagKeysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagKeys", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagKeysResponse());
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
        return TeaModel.toModel(this.doRPCRequest("ListTagResources", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public ListTagValuesResponse listTagValuesWithOptions(ListTagValuesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagValues", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagValuesResponse());
    }

    public ListTagValuesResponse listTagValues(ListTagValuesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagValuesWithOptions(request, runtime);
    }

    public MoveResourceGroupResponse moveResourceGroupWithOptions(MoveResourceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("MoveResourceGroup", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new MoveResourceGroupResponse());
    }

    public MoveResourceGroupResponse moveResourceGroup(MoveResourceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.moveResourceGroupWithOptions(request, runtime);
    }

    public RemoveEntriesFromAclResponse removeEntriesFromAclWithOptions(RemoveEntriesFromAclRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveEntriesFromAcl", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveEntriesFromAclResponse());
    }

    public RemoveEntriesFromAclResponse removeEntriesFromAcl(RemoveEntriesFromAclRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeEntriesFromAclWithOptions(request, runtime);
    }

    public RemoveServersFromServerGroupResponse removeServersFromServerGroupWithOptions(RemoveServersFromServerGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveServersFromServerGroup", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveServersFromServerGroupResponse());
    }

    public RemoveServersFromServerGroupResponse removeServersFromServerGroup(RemoveServersFromServerGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeServersFromServerGroupWithOptions(request, runtime);
    }

    public StartListenerResponse startListenerWithOptions(StartListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartListener", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new StartListenerResponse());
    }

    public StartListenerResponse startListener(StartListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startListenerWithOptions(request, runtime);
    }

    public StopListenerResponse stopListenerWithOptions(StopListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopListener", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new StopListenerResponse());
    }

    public StopListenerResponse stopListener(StopListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopListenerWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TagResources", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public UnTagResourcesResponse unTagResourcesWithOptions(UnTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnTagResources", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new UnTagResourcesResponse());
    }

    public UnTagResourcesResponse unTagResources(UnTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unTagResourcesWithOptions(request, runtime);
    }

    public UpdateAclAttributeResponse updateAclAttributeWithOptions(UpdateAclAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAclAttribute", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAclAttributeResponse());
    }

    public UpdateAclAttributeResponse updateAclAttribute(UpdateAclAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAclAttributeWithOptions(request, runtime);
    }

    public UpdateHealthCheckTemplateAttributeResponse updateHealthCheckTemplateAttributeWithOptions(UpdateHealthCheckTemplateAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateHealthCheckTemplateAttribute", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateHealthCheckTemplateAttributeResponse());
    }

    public UpdateHealthCheckTemplateAttributeResponse updateHealthCheckTemplateAttribute(UpdateHealthCheckTemplateAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateHealthCheckTemplateAttributeWithOptions(request, runtime);
    }

    public UpdateListenerAttributeResponse updateListenerAttributeWithOptions(UpdateListenerAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateListenerAttribute", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateListenerAttributeResponse());
    }

    public UpdateListenerAttributeResponse updateListenerAttribute(UpdateListenerAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateListenerAttributeWithOptions(request, runtime);
    }

    public UpdateListenerLogConfigResponse updateListenerLogConfigWithOptions(UpdateListenerLogConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateListenerLogConfig", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateListenerLogConfigResponse());
    }

    public UpdateListenerLogConfigResponse updateListenerLogConfig(UpdateListenerLogConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateListenerLogConfigWithOptions(request, runtime);
    }

    public UpdateLoadBalancerAttributeResponse updateLoadBalancerAttributeWithOptions(UpdateLoadBalancerAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateLoadBalancerAttribute", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateLoadBalancerAttributeResponse());
    }

    public UpdateLoadBalancerAttributeResponse updateLoadBalancerAttribute(UpdateLoadBalancerAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateLoadBalancerAttributeWithOptions(request, runtime);
    }

    public UpdateLoadBalancerEditionResponse updateLoadBalancerEditionWithOptions(UpdateLoadBalancerEditionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateLoadBalancerEdition", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateLoadBalancerEditionResponse());
    }

    public UpdateLoadBalancerEditionResponse updateLoadBalancerEdition(UpdateLoadBalancerEditionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateLoadBalancerEditionWithOptions(request, runtime);
    }

    public UpdateRuleAttributeResponse updateRuleAttributeWithOptions(UpdateRuleAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateRuleAttribute", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateRuleAttributeResponse());
    }

    public UpdateRuleAttributeResponse updateRuleAttribute(UpdateRuleAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateRuleAttributeWithOptions(request, runtime);
    }

    public UpdateSecurityPolicyAttributeResponse updateSecurityPolicyAttributeWithOptions(UpdateSecurityPolicyAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateSecurityPolicyAttribute", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateSecurityPolicyAttributeResponse());
    }

    public UpdateSecurityPolicyAttributeResponse updateSecurityPolicyAttribute(UpdateSecurityPolicyAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSecurityPolicyAttributeWithOptions(request, runtime);
    }

    public UpdateServerGroupAttributeResponse updateServerGroupAttributeWithOptions(UpdateServerGroupAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateServerGroupAttribute", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateServerGroupAttributeResponse());
    }

    public UpdateServerGroupAttributeResponse updateServerGroupAttribute(UpdateServerGroupAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateServerGroupAttributeWithOptions(request, runtime);
    }

    public UpdateServerGroupServersAttributeResponse updateServerGroupServersAttributeWithOptions(UpdateServerGroupServersAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateServerGroupServersAttribute", "2020-06-16", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateServerGroupServersAttributeResponse());
    }

    public UpdateServerGroupServersAttributeResponse updateServerGroupServersAttribute(UpdateServerGroupServersAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateServerGroupServersAttributeWithOptions(request, runtime);
    }
}
