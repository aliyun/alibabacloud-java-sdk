// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616;

import com.aliyun.tea.*;
import com.aliyun.alb20200616.models.*;
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
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AclEntries", request.aclEntries);
        query.put("AclId", request.aclId);
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddEntriesToAcl"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddEntriesToAclResponse());
    }

    public AddEntriesToAclResponse addEntriesToAcl(AddEntriesToAclRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addEntriesToAclWithOptions(request, runtime);
    }

    public AddServersToServerGroupResponse addServersToServerGroupWithOptions(AddServersToServerGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("ServerGroupId", request.serverGroupId);
        query.put("Servers", request.servers);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddServersToServerGroup"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddServersToServerGroupResponse());
    }

    public AddServersToServerGroupResponse addServersToServerGroup(AddServersToServerGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addServersToServerGroupWithOptions(request, runtime);
    }

    public ApplyHealthCheckTemplateToServerGroupResponse applyHealthCheckTemplateToServerGroupWithOptions(ApplyHealthCheckTemplateToServerGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("HealthCheckTemplateId", request.healthCheckTemplateId);
        query.put("ServerGroupId", request.serverGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyHealthCheckTemplateToServerGroup"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyHealthCheckTemplateToServerGroupResponse());
    }

    public ApplyHealthCheckTemplateToServerGroupResponse applyHealthCheckTemplateToServerGroup(ApplyHealthCheckTemplateToServerGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.applyHealthCheckTemplateToServerGroupWithOptions(request, runtime);
    }

    public AssociateAclsWithListenerResponse associateAclsWithListenerWithOptions(AssociateAclsWithListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AclIds", request.aclIds);
        query.put("AclType", request.aclType);
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("ListenerId", request.listenerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateAclsWithListener"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateAclsWithListenerResponse());
    }

    public AssociateAclsWithListenerResponse associateAclsWithListener(AssociateAclsWithListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.associateAclsWithListenerWithOptions(request, runtime);
    }

    public AssociateAdditionalCertificatesWithListenerResponse associateAdditionalCertificatesWithListenerWithOptions(AssociateAdditionalCertificatesWithListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Certificates", request.certificates);
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("ListenerId", request.listenerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateAdditionalCertificatesWithListener"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateAdditionalCertificatesWithListenerResponse());
    }

    public AssociateAdditionalCertificatesWithListenerResponse associateAdditionalCertificatesWithListener(AssociateAdditionalCertificatesWithListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.associateAdditionalCertificatesWithListenerWithOptions(request, runtime);
    }

    public AttachCommonBandwidthPackageToLoadBalancerResponse attachCommonBandwidthPackageToLoadBalancerWithOptions(AttachCommonBandwidthPackageToLoadBalancerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BandwidthPackageId", request.bandwidthPackageId);
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("LoadBalancerId", request.loadBalancerId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachCommonBandwidthPackageToLoadBalancer"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachCommonBandwidthPackageToLoadBalancerResponse());
    }

    public AttachCommonBandwidthPackageToLoadBalancerResponse attachCommonBandwidthPackageToLoadBalancer(AttachCommonBandwidthPackageToLoadBalancerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachCommonBandwidthPackageToLoadBalancerWithOptions(request, runtime);
    }

    public CreateAclResponse createAclWithOptions(CreateAclRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AclName", request.aclName);
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("ResourceGroupId", request.resourceGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAcl"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAclResponse());
    }

    public CreateAclResponse createAcl(CreateAclRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAclWithOptions(request, runtime);
    }

    public CreateHealthCheckTemplateResponse createHealthCheckTemplateWithOptions(CreateHealthCheckTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("HealthCheckCodes", request.healthCheckCodes);
        query.put("HealthCheckConnectPort", request.healthCheckConnectPort);
        query.put("HealthCheckHost", request.healthCheckHost);
        query.put("HealthCheckHttpVersion", request.healthCheckHttpVersion);
        query.put("HealthCheckInterval", request.healthCheckInterval);
        query.put("HealthCheckMethod", request.healthCheckMethod);
        query.put("HealthCheckPath", request.healthCheckPath);
        query.put("HealthCheckProtocol", request.healthCheckProtocol);
        query.put("HealthCheckTemplateName", request.healthCheckTemplateName);
        query.put("HealthCheckTimeout", request.healthCheckTimeout);
        query.put("HealthyThreshold", request.healthyThreshold);
        query.put("UnhealthyThreshold", request.unhealthyThreshold);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateHealthCheckTemplate"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateHealthCheckTemplateResponse());
    }

    public CreateHealthCheckTemplateResponse createHealthCheckTemplate(CreateHealthCheckTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createHealthCheckTemplateWithOptions(request, runtime);
    }

    public CreateListenerResponse createListenerWithOptions(CreateListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CaCertificates", request.caCertificates);
        query.put("CaEnabled", request.caEnabled);
        query.put("Certificates", request.certificates);
        query.put("ClientToken", request.clientToken);
        query.put("DefaultActions", request.defaultActions);
        query.put("DryRun", request.dryRun);
        query.put("GzipEnabled", request.gzipEnabled);
        query.put("Http2Enabled", request.http2Enabled);
        query.put("IdleTimeout", request.idleTimeout);
        query.put("ListenerDescription", request.listenerDescription);
        query.put("ListenerPort", request.listenerPort);
        query.put("ListenerProtocol", request.listenerProtocol);
        query.put("LoadBalancerId", request.loadBalancerId);
        query.put("QuicConfig", request.quicConfig);
        query.put("RequestTimeout", request.requestTimeout);
        query.put("SecurityPolicyId", request.securityPolicyId);
        query.put("XForwardedForConfig", request.XForwardedForConfig);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateListener"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateListenerResponse());
    }

    public CreateListenerResponse createListener(CreateListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createListenerWithOptions(request, runtime);
    }

    public CreateLoadBalancerResponse createLoadBalancerWithOptions(CreateLoadBalancerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AddressAllocatedMode", request.addressAllocatedMode);
        query.put("AddressType", request.addressType);
        query.put("ClientToken", request.clientToken);
        query.put("DeletionProtectionEnabled", request.deletionProtectionEnabled);
        query.put("DryRun", request.dryRun);
        query.put("LoadBalancerBillingConfig", request.loadBalancerBillingConfig);
        query.put("LoadBalancerEdition", request.loadBalancerEdition);
        query.put("LoadBalancerName", request.loadBalancerName);
        query.put("ModificationProtectionConfig", request.modificationProtectionConfig);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("VpcId", request.vpcId);
        query.put("ZoneMappings", request.zoneMappings);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLoadBalancer"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLoadBalancerResponse());
    }

    public CreateLoadBalancerResponse createLoadBalancer(CreateLoadBalancerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLoadBalancerWithOptions(request, runtime);
    }

    public CreateRuleResponse createRuleWithOptions(CreateRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("ListenerId", request.listenerId);
        query.put("Priority", request.priority);
        query.put("RuleActions", request.ruleActions);
        query.put("RuleConditions", request.ruleConditions);
        query.put("RuleName", request.ruleName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRule"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRuleResponse());
    }

    public CreateRuleResponse createRule(CreateRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRuleWithOptions(request, runtime);
    }

    public CreateRulesResponse createRulesWithOptions(CreateRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("ListenerId", request.listenerId);
        query.put("Rules", request.rules);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRules"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRulesResponse());
    }

    public CreateRulesResponse createRules(CreateRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRulesWithOptions(request, runtime);
    }

    public CreateSecurityPolicyResponse createSecurityPolicyWithOptions(CreateSecurityPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Ciphers", request.ciphers);
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("SecurityPolicyName", request.securityPolicyName);
        query.put("TLSVersions", request.TLSVersions);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSecurityPolicy"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSecurityPolicyResponse());
    }

    public CreateSecurityPolicyResponse createSecurityPolicy(CreateSecurityPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSecurityPolicyWithOptions(request, runtime);
    }

    public CreateServerGroupResponse createServerGroupWithOptions(CreateServerGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("HealthCheckConfig", request.healthCheckConfig);
        query.put("Protocol", request.protocol);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("Scheduler", request.scheduler);
        query.put("ServerGroupName", request.serverGroupName);
        query.put("ServerGroupType", request.serverGroupType);
        query.put("StickySessionConfig", request.stickySessionConfig);
        query.put("VpcId", request.vpcId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateServerGroup"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServerGroupResponse());
    }

    public CreateServerGroupResponse createServerGroup(CreateServerGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createServerGroupWithOptions(request, runtime);
    }

    public DeleteAclResponse deleteAclWithOptions(DeleteAclRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AclId", request.aclId);
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAcl"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAclResponse());
    }

    public DeleteAclResponse deleteAcl(DeleteAclRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAclWithOptions(request, runtime);
    }

    public DeleteHealthCheckTemplatesResponse deleteHealthCheckTemplatesWithOptions(DeleteHealthCheckTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("HealthCheckTemplateIds", request.healthCheckTemplateIds);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteHealthCheckTemplates"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteHealthCheckTemplatesResponse());
    }

    public DeleteHealthCheckTemplatesResponse deleteHealthCheckTemplates(DeleteHealthCheckTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteHealthCheckTemplatesWithOptions(request, runtime);
    }

    public DeleteListenerResponse deleteListenerWithOptions(DeleteListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("ListenerId", request.listenerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteListener"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteListenerResponse());
    }

    public DeleteListenerResponse deleteListener(DeleteListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteListenerWithOptions(request, runtime);
    }

    public DeleteLoadBalancerResponse deleteLoadBalancerWithOptions(DeleteLoadBalancerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("LoadBalancerId", request.loadBalancerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLoadBalancer"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLoadBalancerResponse());
    }

    public DeleteLoadBalancerResponse deleteLoadBalancer(DeleteLoadBalancerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLoadBalancerWithOptions(request, runtime);
    }

    public DeleteRuleResponse deleteRuleWithOptions(DeleteRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("RuleId", request.ruleId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRule"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRuleResponse());
    }

    public DeleteRuleResponse deleteRule(DeleteRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRuleWithOptions(request, runtime);
    }

    public DeleteRulesResponse deleteRulesWithOptions(DeleteRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("RuleIds", request.ruleIds);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRules"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRulesResponse());
    }

    public DeleteRulesResponse deleteRules(DeleteRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRulesWithOptions(request, runtime);
    }

    public DeleteSecurityPolicyResponse deleteSecurityPolicyWithOptions(DeleteSecurityPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("SecurityPolicyId", request.securityPolicyId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSecurityPolicy"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSecurityPolicyResponse());
    }

    public DeleteSecurityPolicyResponse deleteSecurityPolicy(DeleteSecurityPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSecurityPolicyWithOptions(request, runtime);
    }

    public DeleteServerGroupResponse deleteServerGroupWithOptions(DeleteServerGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("ServerGroupId", request.serverGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteServerGroup"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServerGroupResponse());
    }

    public DeleteServerGroupResponse deleteServerGroup(DeleteServerGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteServerGroupWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AcceptLanguage", request.acceptLanguage);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DescribeZonesResponse describeZonesWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeZones"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeZonesResponse());
    }

    public DescribeZonesResponse describeZones() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeZonesWithOptions(runtime);
    }

    public DetachCommonBandwidthPackageFromLoadBalancerResponse detachCommonBandwidthPackageFromLoadBalancerWithOptions(DetachCommonBandwidthPackageFromLoadBalancerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BandwidthPackageId", request.bandwidthPackageId);
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("LoadBalancerId", request.loadBalancerId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachCommonBandwidthPackageFromLoadBalancer"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachCommonBandwidthPackageFromLoadBalancerResponse());
    }

    public DetachCommonBandwidthPackageFromLoadBalancerResponse detachCommonBandwidthPackageFromLoadBalancer(DetachCommonBandwidthPackageFromLoadBalancerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detachCommonBandwidthPackageFromLoadBalancerWithOptions(request, runtime);
    }

    public DisableDeletionProtectionResponse disableDeletionProtectionWithOptions(DisableDeletionProtectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("ResourceId", request.resourceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableDeletionProtection"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableDeletionProtectionResponse());
    }

    public DisableDeletionProtectionResponse disableDeletionProtection(DisableDeletionProtectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableDeletionProtectionWithOptions(request, runtime);
    }

    public DisableLoadBalancerAccessLogResponse disableLoadBalancerAccessLogWithOptions(DisableLoadBalancerAccessLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("LoadBalancerId", request.loadBalancerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableLoadBalancerAccessLog"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableLoadBalancerAccessLogResponse());
    }

    public DisableLoadBalancerAccessLogResponse disableLoadBalancerAccessLog(DisableLoadBalancerAccessLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableLoadBalancerAccessLogWithOptions(request, runtime);
    }

    public DissociateAclsFromListenerResponse dissociateAclsFromListenerWithOptions(DissociateAclsFromListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AclIds", request.aclIds);
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("ListenerId", request.listenerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DissociateAclsFromListener"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DissociateAclsFromListenerResponse());
    }

    public DissociateAclsFromListenerResponse dissociateAclsFromListener(DissociateAclsFromListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.dissociateAclsFromListenerWithOptions(request, runtime);
    }

    public DissociateAdditionalCertificatesFromListenerResponse dissociateAdditionalCertificatesFromListenerWithOptions(DissociateAdditionalCertificatesFromListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Certificates", request.certificates);
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("ListenerId", request.listenerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DissociateAdditionalCertificatesFromListener"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DissociateAdditionalCertificatesFromListenerResponse());
    }

    public DissociateAdditionalCertificatesFromListenerResponse dissociateAdditionalCertificatesFromListener(DissociateAdditionalCertificatesFromListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.dissociateAdditionalCertificatesFromListenerWithOptions(request, runtime);
    }

    public EnableDeletionProtectionResponse enableDeletionProtectionWithOptions(EnableDeletionProtectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("ResourceId", request.resourceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableDeletionProtection"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableDeletionProtectionResponse());
    }

    public EnableDeletionProtectionResponse enableDeletionProtection(EnableDeletionProtectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableDeletionProtectionWithOptions(request, runtime);
    }

    public EnableLoadBalancerAccessLogResponse enableLoadBalancerAccessLogWithOptions(EnableLoadBalancerAccessLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("LoadBalancerId", request.loadBalancerId);
        query.put("LogProject", request.logProject);
        query.put("LogStore", request.logStore);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableLoadBalancerAccessLog"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableLoadBalancerAccessLogResponse());
    }

    public EnableLoadBalancerAccessLogResponse enableLoadBalancerAccessLog(EnableLoadBalancerAccessLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableLoadBalancerAccessLogWithOptions(request, runtime);
    }

    public GetHealthCheckTemplateAttributeResponse getHealthCheckTemplateAttributeWithOptions(GetHealthCheckTemplateAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("HealthCheckTemplateId", request.healthCheckTemplateId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHealthCheckTemplateAttribute"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHealthCheckTemplateAttributeResponse());
    }

    public GetHealthCheckTemplateAttributeResponse getHealthCheckTemplateAttribute(GetHealthCheckTemplateAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getHealthCheckTemplateAttributeWithOptions(request, runtime);
    }

    public GetListenerAttributeResponse getListenerAttributeWithOptions(GetListenerAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ListenerId", request.listenerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetListenerAttribute"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetListenerAttributeResponse());
    }

    public GetListenerAttributeResponse getListenerAttribute(GetListenerAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getListenerAttributeWithOptions(request, runtime);
    }

    public GetListenerHealthStatusResponse getListenerHealthStatusWithOptions(GetListenerHealthStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("IncludeRule", request.includeRule);
        query.put("ListenerId", request.listenerId);
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetListenerHealthStatus"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetListenerHealthStatusResponse());
    }

    public GetListenerHealthStatusResponse getListenerHealthStatus(GetListenerHealthStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getListenerHealthStatusWithOptions(request, runtime);
    }

    public GetLoadBalancerAttributeResponse getLoadBalancerAttributeWithOptions(GetLoadBalancerAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("LoadBalancerId", request.loadBalancerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLoadBalancerAttribute"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLoadBalancerAttributeResponse());
    }

    public GetLoadBalancerAttributeResponse getLoadBalancerAttribute(GetLoadBalancerAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLoadBalancerAttributeWithOptions(request, runtime);
    }

    public ListAclEntriesResponse listAclEntriesWithOptions(ListAclEntriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AclId", request.aclId);
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAclEntries"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAclEntriesResponse());
    }

    public ListAclEntriesResponse listAclEntries(ListAclEntriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAclEntriesWithOptions(request, runtime);
    }

    public ListAclRelationsResponse listAclRelationsWithOptions(ListAclRelationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AclIds", request.aclIds);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAclRelations"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAclRelationsResponse());
    }

    public ListAclRelationsResponse listAclRelations(ListAclRelationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAclRelationsWithOptions(request, runtime);
    }

    public ListAclsResponse listAclsWithOptions(ListAclsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AclIds", request.aclIds);
        query.put("AclNames", request.aclNames);
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("ResourceGroupId", request.resourceGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAcls"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAclsResponse());
    }

    public ListAclsResponse listAcls(ListAclsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAclsWithOptions(request, runtime);
    }

    public ListAsynJobsResponse listAsynJobsWithOptions(ListAsynJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApiName", request.apiName);
        query.put("BeginTime", request.beginTime);
        query.put("EndTime", request.endTime);
        query.put("JobIds", request.jobIds);
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("ResourceIds", request.resourceIds);
        query.put("ResourceType", request.resourceType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAsynJobs"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAsynJobsResponse());
    }

    public ListAsynJobsResponse listAsynJobs(ListAsynJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAsynJobsWithOptions(request, runtime);
    }

    public ListHealthCheckTemplatesResponse listHealthCheckTemplatesWithOptions(ListHealthCheckTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("HealthCheckTemplateIds", request.healthCheckTemplateIds);
        query.put("HealthCheckTemplateNames", request.healthCheckTemplateNames);
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHealthCheckTemplates"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHealthCheckTemplatesResponse());
    }

    public ListHealthCheckTemplatesResponse listHealthCheckTemplates(ListHealthCheckTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listHealthCheckTemplatesWithOptions(request, runtime);
    }

    public ListListenerCertificatesResponse listListenerCertificatesWithOptions(ListListenerCertificatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CertificateType", request.certificateType);
        query.put("ListenerId", request.listenerId);
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListListenerCertificates"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListListenerCertificatesResponse());
    }

    public ListListenerCertificatesResponse listListenerCertificates(ListListenerCertificatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listListenerCertificatesWithOptions(request, runtime);
    }

    public ListListenersResponse listListenersWithOptions(ListListenersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ListenerIds", request.listenerIds);
        query.put("ListenerProtocol", request.listenerProtocol);
        query.put("LoadBalancerIds", request.loadBalancerIds);
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListListeners"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListListenersResponse());
    }

    public ListListenersResponse listListeners(ListListenersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listListenersWithOptions(request, runtime);
    }

    public ListLoadBalancersResponse listLoadBalancersWithOptions(ListLoadBalancersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AddressType", request.addressType);
        query.put("LoadBalancerBussinessStatus", request.loadBalancerBussinessStatus);
        query.put("LoadBalancerIds", request.loadBalancerIds);
        query.put("LoadBalancerNames", request.loadBalancerNames);
        query.put("LoadBalancerStatus", request.loadBalancerStatus);
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("PayType", request.payType);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("Tag", request.tag);
        query.put("VpcIds", request.vpcIds);
        query.put("ZoneId", request.zoneId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLoadBalancers"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLoadBalancersResponse());
    }

    public ListLoadBalancersResponse listLoadBalancers(ListLoadBalancersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listLoadBalancersWithOptions(request, runtime);
    }

    public ListRulesResponse listRulesWithOptions(ListRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ListenerIds", request.listenerIds);
        query.put("LoadBalancerIds", request.loadBalancerIds);
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("RuleIds", request.ruleIds);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRules"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRulesResponse());
    }

    public ListRulesResponse listRules(ListRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRulesWithOptions(request, runtime);
    }

    public ListSecurityPoliciesResponse listSecurityPoliciesWithOptions(ListSecurityPoliciesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("SecurityPolicyIds", request.securityPolicyIds);
        query.put("SecurityPolicyNames", request.securityPolicyNames);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSecurityPolicies"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSecurityPoliciesResponse());
    }

    public ListSecurityPoliciesResponse listSecurityPolicies(ListSecurityPoliciesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSecurityPoliciesWithOptions(request, runtime);
    }

    public ListSecurityPolicyRelationsResponse listSecurityPolicyRelationsWithOptions(ListSecurityPolicyRelationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("SecurityPolicyIds", request.securityPolicyIds);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSecurityPolicyRelations"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSecurityPolicyRelationsResponse());
    }

    public ListSecurityPolicyRelationsResponse listSecurityPolicyRelations(ListSecurityPolicyRelationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSecurityPolicyRelationsWithOptions(request, runtime);
    }

    public ListServerGroupServersResponse listServerGroupServersWithOptions(ListServerGroupServersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("ServerGroupId", request.serverGroupId);
        query.put("ServerIds", request.serverIds);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServerGroupServers"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServerGroupServersResponse());
    }

    public ListServerGroupServersResponse listServerGroupServers(ListServerGroupServersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listServerGroupServersWithOptions(request, runtime);
    }

    public ListServerGroupsResponse listServerGroupsWithOptions(ListServerGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("ServerGroupIds", request.serverGroupIds);
        query.put("ServerGroupNames", request.serverGroupNames);
        query.put("Tag", request.tag);
        query.put("VpcId", request.vpcId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServerGroups"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServerGroupsResponse());
    }

    public ListServerGroupsResponse listServerGroups(ListServerGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listServerGroupsWithOptions(request, runtime);
    }

    public ListSystemSecurityPoliciesResponse listSystemSecurityPoliciesWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSystemSecurityPolicies"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSystemSecurityPoliciesResponse());
    }

    public ListSystemSecurityPoliciesResponse listSystemSecurityPolicies() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSystemSecurityPoliciesWithOptions(runtime);
    }

    public ListTagKeysResponse listTagKeysWithOptions(ListTagKeysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Category", request.category);
        query.put("Keyword", request.keyword);
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("ResourceType", request.resourceType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagKeys"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagKeysResponse());
    }

    public ListTagKeysResponse listTagKeys(ListTagKeysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagKeysWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("ResourceId", request.resourceId);
        query.put("ResourceType", request.resourceType);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public ListTagValuesResponse listTagValuesWithOptions(ListTagValuesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("ResourceId", request.resourceId);
        query.put("ResourceType", request.resourceType);
        query.put("TagKey", request.tagKey);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagValues"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagValuesResponse());
    }

    public ListTagValuesResponse listTagValues(ListTagValuesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagValuesWithOptions(request, runtime);
    }

    public MoveResourceGroupResponse moveResourceGroupWithOptions(MoveResourceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("NewResourceGroupId", request.newResourceGroupId);
        query.put("ResourceId", request.resourceId);
        query.put("ResourceType", request.resourceType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveResourceGroup"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MoveResourceGroupResponse());
    }

    public MoveResourceGroupResponse moveResourceGroup(MoveResourceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.moveResourceGroupWithOptions(request, runtime);
    }

    public RemoveEntriesFromAclResponse removeEntriesFromAclWithOptions(RemoveEntriesFromAclRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AclId", request.aclId);
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("Entries", request.entries);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveEntriesFromAcl"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveEntriesFromAclResponse());
    }

    public RemoveEntriesFromAclResponse removeEntriesFromAcl(RemoveEntriesFromAclRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeEntriesFromAclWithOptions(request, runtime);
    }

    public RemoveServersFromServerGroupResponse removeServersFromServerGroupWithOptions(RemoveServersFromServerGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("ServerGroupId", request.serverGroupId);
        query.put("Servers", request.servers);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveServersFromServerGroup"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveServersFromServerGroupResponse());
    }

    public RemoveServersFromServerGroupResponse removeServersFromServerGroup(RemoveServersFromServerGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeServersFromServerGroupWithOptions(request, runtime);
    }

    public ReplaceServersInServerGroupResponse replaceServersInServerGroupWithOptions(ReplaceServersInServerGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AddedServers", request.addedServers);
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("RemovedServers", request.removedServers);
        query.put("ServerGroupId", request.serverGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReplaceServersInServerGroup"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReplaceServersInServerGroupResponse());
    }

    public ReplaceServersInServerGroupResponse replaceServersInServerGroup(ReplaceServersInServerGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.replaceServersInServerGroupWithOptions(request, runtime);
    }

    public StartListenerResponse startListenerWithOptions(StartListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("ListenerId", request.listenerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartListener"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartListenerResponse());
    }

    public StartListenerResponse startListener(StartListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startListenerWithOptions(request, runtime);
    }

    public StopListenerResponse stopListenerWithOptions(StopListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("ListenerId", request.listenerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopListener"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopListenerResponse());
    }

    public StopListenerResponse stopListener(StopListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopListenerWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ResourceId", request.resourceId);
        query.put("ResourceType", request.resourceType);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public UnTagResourcesResponse unTagResourcesWithOptions(UnTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ResourceId", request.resourceId);
        query.put("ResourceType", request.resourceType);
        query.put("Tag", request.tag);
        query.put("TagKey", request.tagKey);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnTagResources"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnTagResourcesResponse());
    }

    public UnTagResourcesResponse unTagResources(UnTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unTagResourcesWithOptions(request, runtime);
    }

    public UpdateAclAttributeResponse updateAclAttributeWithOptions(UpdateAclAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AclId", request.aclId);
        query.put("AclName", request.aclName);
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAclAttribute"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAclAttributeResponse());
    }

    public UpdateAclAttributeResponse updateAclAttribute(UpdateAclAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAclAttributeWithOptions(request, runtime);
    }

    public UpdateHealthCheckTemplateAttributeResponse updateHealthCheckTemplateAttributeWithOptions(UpdateHealthCheckTemplateAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("HealthCheckCodes", request.healthCheckCodes);
        query.put("HealthCheckConnectPort", request.healthCheckConnectPort);
        query.put("HealthCheckHost", request.healthCheckHost);
        query.put("HealthCheckHttpVersion", request.healthCheckHttpVersion);
        query.put("HealthCheckInterval", request.healthCheckInterval);
        query.put("HealthCheckMethod", request.healthCheckMethod);
        query.put("HealthCheckPath", request.healthCheckPath);
        query.put("HealthCheckProtocol", request.healthCheckProtocol);
        query.put("HealthCheckTemplateId", request.healthCheckTemplateId);
        query.put("HealthCheckTemplateName", request.healthCheckTemplateName);
        query.put("HealthCheckTimeout", request.healthCheckTimeout);
        query.put("HealthyThreshold", request.healthyThreshold);
        query.put("UnhealthyThreshold", request.unhealthyThreshold);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateHealthCheckTemplateAttribute"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateHealthCheckTemplateAttributeResponse());
    }

    public UpdateHealthCheckTemplateAttributeResponse updateHealthCheckTemplateAttribute(UpdateHealthCheckTemplateAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateHealthCheckTemplateAttributeWithOptions(request, runtime);
    }

    public UpdateListenerAttributeResponse updateListenerAttributeWithOptions(UpdateListenerAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CaCertificates", request.caCertificates);
        query.put("CaEnabled", request.caEnabled);
        query.put("Certificates", request.certificates);
        query.put("ClientToken", request.clientToken);
        query.put("DefaultActions", request.defaultActions);
        query.put("DryRun", request.dryRun);
        query.put("GzipEnabled", request.gzipEnabled);
        query.put("Http2Enabled", request.http2Enabled);
        query.put("IdleTimeout", request.idleTimeout);
        query.put("ListenerDescription", request.listenerDescription);
        query.put("ListenerId", request.listenerId);
        query.put("QuicConfig", request.quicConfig);
        query.put("RequestTimeout", request.requestTimeout);
        query.put("SecurityPolicyId", request.securityPolicyId);
        query.put("XForwardedForConfig", request.XForwardedForConfig);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateListenerAttribute"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateListenerAttributeResponse());
    }

    public UpdateListenerAttributeResponse updateListenerAttribute(UpdateListenerAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateListenerAttributeWithOptions(request, runtime);
    }

    public UpdateListenerLogConfigResponse updateListenerLogConfigWithOptions(UpdateListenerLogConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccessLogRecordCustomizedHeadersEnabled", request.accessLogRecordCustomizedHeadersEnabled);
        query.put("AccessLogTracingConfig", request.accessLogTracingConfig);
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("ListenerId", request.listenerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateListenerLogConfig"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateListenerLogConfigResponse());
    }

    public UpdateListenerLogConfigResponse updateListenerLogConfig(UpdateListenerLogConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateListenerLogConfigWithOptions(request, runtime);
    }

    public UpdateLoadBalancerAttributeResponse updateLoadBalancerAttributeWithOptions(UpdateLoadBalancerAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("LoadBalancerId", request.loadBalancerId);
        query.put("LoadBalancerName", request.loadBalancerName);
        query.put("ModificationProtectionConfig", request.modificationProtectionConfig);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLoadBalancerAttribute"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLoadBalancerAttributeResponse());
    }

    public UpdateLoadBalancerAttributeResponse updateLoadBalancerAttribute(UpdateLoadBalancerAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateLoadBalancerAttributeWithOptions(request, runtime);
    }

    public UpdateLoadBalancerEditionResponse updateLoadBalancerEditionWithOptions(UpdateLoadBalancerEditionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("LoadBalancerEdition", request.loadBalancerEdition);
        query.put("LoadBalancerId", request.loadBalancerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLoadBalancerEdition"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLoadBalancerEditionResponse());
    }

    public UpdateLoadBalancerEditionResponse updateLoadBalancerEdition(UpdateLoadBalancerEditionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateLoadBalancerEditionWithOptions(request, runtime);
    }

    public UpdateLoadBalancerZonesResponse updateLoadBalancerZonesWithOptions(UpdateLoadBalancerZonesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("LoadBalancerId", request.loadBalancerId);
        query.put("ZoneMappings", request.zoneMappings);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLoadBalancerZones"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLoadBalancerZonesResponse());
    }

    public UpdateLoadBalancerZonesResponse updateLoadBalancerZones(UpdateLoadBalancerZonesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateLoadBalancerZonesWithOptions(request, runtime);
    }

    public UpdateRuleAttributeResponse updateRuleAttributeWithOptions(UpdateRuleAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("Priority", request.priority);
        query.put("RuleActions", request.ruleActions);
        query.put("RuleConditions", request.ruleConditions);
        query.put("RuleId", request.ruleId);
        query.put("RuleName", request.ruleName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRuleAttribute"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRuleAttributeResponse());
    }

    public UpdateRuleAttributeResponse updateRuleAttribute(UpdateRuleAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateRuleAttributeWithOptions(request, runtime);
    }

    public UpdateRulesAttributeResponse updateRulesAttributeWithOptions(UpdateRulesAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("Rules", request.rules);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRulesAttribute"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRulesAttributeResponse());
    }

    public UpdateRulesAttributeResponse updateRulesAttribute(UpdateRulesAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateRulesAttributeWithOptions(request, runtime);
    }

    public UpdateSecurityPolicyAttributeResponse updateSecurityPolicyAttributeWithOptions(UpdateSecurityPolicyAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Ciphers", request.ciphers);
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("SecurityPolicyId", request.securityPolicyId);
        query.put("SecurityPolicyName", request.securityPolicyName);
        query.put("TLSVersions", request.TLSVersions);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSecurityPolicyAttribute"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSecurityPolicyAttributeResponse());
    }

    public UpdateSecurityPolicyAttributeResponse updateSecurityPolicyAttribute(UpdateSecurityPolicyAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSecurityPolicyAttributeWithOptions(request, runtime);
    }

    public UpdateServerGroupAttributeResponse updateServerGroupAttributeWithOptions(UpdateServerGroupAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("HealthCheckConfig", request.healthCheckConfig);
        query.put("Scheduler", request.scheduler);
        query.put("ServerGroupId", request.serverGroupId);
        query.put("ServerGroupName", request.serverGroupName);
        query.put("StickySessionConfig", request.stickySessionConfig);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateServerGroupAttribute"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServerGroupAttributeResponse());
    }

    public UpdateServerGroupAttributeResponse updateServerGroupAttribute(UpdateServerGroupAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateServerGroupAttributeWithOptions(request, runtime);
    }

    public UpdateServerGroupServersAttributeResponse updateServerGroupServersAttributeWithOptions(UpdateServerGroupServersAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("ServerGroupId", request.serverGroupId);
        query.put("Servers", request.servers);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateServerGroupServersAttribute"),
            new TeaPair("version", "2020-06-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServerGroupServersAttributeResponse());
    }

    public UpdateServerGroupServersAttributeResponse updateServerGroupServersAttribute(UpdateServerGroupServersAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateServerGroupServersAttributeWithOptions(request, runtime);
    }
}
