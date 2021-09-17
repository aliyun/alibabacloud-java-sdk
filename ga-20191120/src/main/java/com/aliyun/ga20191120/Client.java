// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120;

import com.aliyun.tea.*;
import com.aliyun.ga20191120.models.*;
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
        this._endpoint = this.getEndpoint("ga", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public DescribeIpSetResponse describeIpSetWithOptions(DescribeIpSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("IpSetId", request.ipSetId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeIpSet"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeIpSetResponse());
    }

    public DescribeIpSetResponse describeIpSet(DescribeIpSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeIpSetWithOptions(request, runtime);
    }

    public ListAclsResponse listAclsWithOptions(ListAclsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("ClientToken", request.clientToken);
        query.put("AclIds", request.aclIds);
        query.put("AclName", request.aclName);
        query.put("NextToken", request.nextToken);
        query.put("MaxResults", request.maxResults);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAcls"),
            new TeaPair("version", "2019-11-20"),
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

    public CreateAcceleratorResponse createAcceleratorWithOptions(CreateAcceleratorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("ClientToken", request.clientToken);
        query.put("Name", request.name);
        query.put("Duration", request.duration);
        query.put("PricingCycle", request.pricingCycle);
        query.put("Spec", request.spec);
        query.put("AutoPay", request.autoPay);
        query.put("AutoUseCoupon", request.autoUseCoupon);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAccelerator"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAcceleratorResponse());
    }

    public CreateAcceleratorResponse createAccelerator(CreateAcceleratorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAcceleratorWithOptions(request, runtime);
    }

    public DescribeListenerResponse describeListenerWithOptions(DescribeListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("ListenerId", request.listenerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeListener"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeListenerResponse());
    }

    public DescribeListenerResponse describeListener(DescribeListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeListenerWithOptions(request, runtime);
    }

    public DeleteSpareIpsResponse deleteSpareIpsWithOptions(DeleteSpareIpsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("AcceleratorId", request.acceleratorId);
        query.put("SpareIps", request.spareIps);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSpareIps"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSpareIpsResponse());
    }

    public DeleteSpareIpsResponse deleteSpareIps(DeleteSpareIpsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSpareIpsWithOptions(request, runtime);
    }

    public UpdateIpSetsResponse updateIpSetsWithOptions(UpdateIpSetsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("IpSets", request.ipSets);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateIpSets"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateIpSetsResponse());
    }

    public UpdateIpSetsResponse updateIpSets(UpdateIpSetsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateIpSetsWithOptions(request, runtime);
    }

    public ConfigEndpointProbeResponse configEndpointProbeWithOptions(ConfigEndpointProbeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("ClientToken", request.clientToken);
        query.put("EndpointGroupId", request.endpointGroupId);
        query.put("EndpointType", request.endpointType);
        query.put("Endpoint", request.endpoint);
        query.put("ProbeProtocol", request.probeProtocol);
        query.put("ProbePort", request.probePort);
        query.put("Enable", request.enable);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigEndpointProbe"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigEndpointProbeResponse());
    }

    public ConfigEndpointProbeResponse configEndpointProbe(ConfigEndpointProbeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configEndpointProbeWithOptions(request, runtime);
    }

    public RemoveEntriesFromAclResponse removeEntriesFromAclWithOptions(RemoveEntriesFromAclRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("AclId", request.aclId);
        query.put("AclEntries", request.aclEntries);
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveEntriesFromAcl"),
            new TeaPair("version", "2019-11-20"),
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

    public DescribeBandwidthPackageResponse describeBandwidthPackageWithOptions(DescribeBandwidthPackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("BandwidthPackageId", request.bandwidthPackageId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBandwidthPackage"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBandwidthPackageResponse());
    }

    public DescribeBandwidthPackageResponse describeBandwidthPackage(DescribeBandwidthPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBandwidthPackageWithOptions(request, runtime);
    }

    public ListBandwidthPackagesResponse listBandwidthPackagesWithOptions(ListBandwidthPackagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("State", request.state);
        query.put("Type", request.type);
        query.put("BandwidthPackageId", request.bandwidthPackageId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBandwidthPackages"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBandwidthPackagesResponse());
    }

    public ListBandwidthPackagesResponse listBandwidthPackages(ListBandwidthPackagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listBandwidthPackagesWithOptions(request, runtime);
    }

    public UpdateEndpointGroupResponse updateEndpointGroupWithOptions(UpdateEndpointGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("ClientToken", request.clientToken);
        query.put("EndpointGroupId", request.endpointGroupId);
        query.put("Name", request.name);
        query.put("Description", request.description);
        query.put("EndpointGroupRegion", request.endpointGroupRegion);
        query.put("TrafficPercentage", request.trafficPercentage);
        query.put("HealthCheckIntervalSeconds", request.healthCheckIntervalSeconds);
        query.put("HealthCheckPath", request.healthCheckPath);
        query.put("HealthCheckPort", request.healthCheckPort);
        query.put("HealthCheckProtocol", request.healthCheckProtocol);
        query.put("ThresholdCount", request.thresholdCount);
        query.put("EndpointConfigurations", request.endpointConfigurations);
        query.put("EndpointRequestProtocol", request.endpointRequestProtocol);
        query.put("PortOverrides", request.portOverrides);
        query.put("HealthCheckEnabled", request.healthCheckEnabled);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEndpointGroup"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEndpointGroupResponse());
    }

    public UpdateEndpointGroupResponse updateEndpointGroup(UpdateEndpointGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateEndpointGroupWithOptions(request, runtime);
    }

    public AttachDdosToAcceleratorResponse attachDdosToAcceleratorWithOptions(AttachDdosToAcceleratorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AcceleratorId", request.acceleratorId);
        query.put("DdosId", request.ddosId);
        query.put("DdosRegionId", request.ddosRegionId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachDdosToAccelerator"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachDdosToAcceleratorResponse());
    }

    public AttachDdosToAcceleratorResponse attachDdosToAccelerator(AttachDdosToAcceleratorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachDdosToAcceleratorWithOptions(request, runtime);
    }

    public GetAclResponse getAclWithOptions(GetAclRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("AclId", request.aclId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAcl"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAclResponse());
    }

    public GetAclResponse getAcl(GetAclRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAclWithOptions(request, runtime);
    }

    public AssociateAclsWithListenerResponse associateAclsWithListenerWithOptions(AssociateAclsWithListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("AclIds", request.aclIds);
        query.put("ListenerId", request.listenerId);
        query.put("AclType", request.aclType);
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateAclsWithListener"),
            new TeaPair("version", "2019-11-20"),
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

    public ListForwardingRulesResponse listForwardingRulesWithOptions(ListForwardingRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("ClientToken", request.clientToken);
        query.put("ListenerId", request.listenerId);
        query.put("AcceleratorId", request.acceleratorId);
        query.put("ForwardingRuleId", request.forwardingRuleId);
        query.put("NextToken", request.nextToken);
        query.put("MaxResults", request.maxResults);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListForwardingRules"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListForwardingRulesResponse());
    }

    public ListForwardingRulesResponse listForwardingRules(ListForwardingRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listForwardingRulesWithOptions(request, runtime);
    }

    public CreateBandwidthPackageResponse createBandwidthPackageWithOptions(CreateBandwidthPackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("Bandwidth", request.bandwidth);
        query.put("Duration", request.duration);
        query.put("PricingCycle", request.pricingCycle);
        query.put("AutoPay", request.autoPay);
        query.put("ClientToken", request.clientToken);
        query.put("Type", request.type);
        query.put("BandwidthType", request.bandwidthType);
        query.put("AutoUseCoupon", request.autoUseCoupon);
        query.put("Ratio", request.ratio);
        query.put("BillingType", request.billingType);
        query.put("ChargeType", request.chargeType);
        query.put("CbnGeographicRegionIdA", request.cbnGeographicRegionIdA);
        query.put("CbnGeographicRegionIdB", request.cbnGeographicRegionIdB);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBandwidthPackage"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBandwidthPackageResponse());
    }

    public CreateBandwidthPackageResponse createBandwidthPackage(CreateBandwidthPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createBandwidthPackageWithOptions(request, runtime);
    }

    public ListBandwidthackagesResponse listBandwidthackagesWithOptions(ListBandwidthackagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBandwidthackages"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBandwidthackagesResponse());
    }

    public ListBandwidthackagesResponse listBandwidthackages(ListBandwidthackagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listBandwidthackagesWithOptions(request, runtime);
    }

    public DeleteBandwidthPackageResponse deleteBandwidthPackageWithOptions(DeleteBandwidthPackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("BandwidthPackageId", request.bandwidthPackageId);
        query.put("ClientToken", request.clientToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBandwidthPackage"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBandwidthPackageResponse());
    }

    public DeleteBandwidthPackageResponse deleteBandwidthPackage(DeleteBandwidthPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteBandwidthPackageWithOptions(request, runtime);
    }

    public GetHealthStatusResponse getHealthStatusWithOptions(GetHealthStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("AcceleratorId", request.acceleratorId);
        query.put("ListenerId", request.listenerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHealthStatus"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHealthStatusResponse());
    }

    public GetHealthStatusResponse getHealthStatus(GetHealthStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getHealthStatusWithOptions(request, runtime);
    }

    public DescribeAcceleratorResponse describeAcceleratorWithOptions(DescribeAcceleratorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("AcceleratorId", request.acceleratorId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAccelerator"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAcceleratorResponse());
    }

    public DescribeAcceleratorResponse describeAccelerator(DescribeAcceleratorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAcceleratorWithOptions(request, runtime);
    }

    public DetachLogStoreFromEndpointGroupResponse detachLogStoreFromEndpointGroupWithOptions(DetachLogStoreFromEndpointGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("AcceleratorId", request.acceleratorId);
        query.put("ListenerId", request.listenerId);
        query.put("EndpointGroupIds", request.endpointGroupIds);
        query.put("ClientToken", request.clientToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachLogStoreFromEndpointGroup"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachLogStoreFromEndpointGroupResponse());
    }

    public DetachLogStoreFromEndpointGroupResponse detachLogStoreFromEndpointGroup(DetachLogStoreFromEndpointGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detachLogStoreFromEndpointGroupWithOptions(request, runtime);
    }

    public CreateIpSetsResponse createIpSetsWithOptions(CreateIpSetsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("ClientToken", request.clientToken);
        query.put("AcceleratorId", request.acceleratorId);
        query.put("AccelerateRegion", request.accelerateRegion);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIpSets"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIpSetsResponse());
    }

    public CreateIpSetsResponse createIpSets(CreateIpSetsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createIpSetsWithOptions(request, runtime);
    }

    public CreateForwardingRulesResponse createForwardingRulesWithOptions(CreateForwardingRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("ClientToken", request.clientToken);
        query.put("AcceleratorId", request.acceleratorId);
        query.put("ListenerId", request.listenerId);
        query.put("ForwardingRules", request.forwardingRules);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateForwardingRules"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateForwardingRulesResponse());
    }

    public CreateForwardingRulesResponse createForwardingRules(CreateForwardingRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createForwardingRulesWithOptions(request, runtime);
    }

    public ListAvailableAccelerateAreasResponse listAvailableAccelerateAreasWithOptions(ListAvailableAccelerateAreasRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("AcceleratorId", request.acceleratorId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAvailableAccelerateAreas"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAvailableAccelerateAreasResponse());
    }

    public ListAvailableAccelerateAreasResponse listAvailableAccelerateAreas(ListAvailableAccelerateAreasRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAvailableAccelerateAreasWithOptions(request, runtime);
    }

    public DeleteAclResponse deleteAclWithOptions(DeleteAclRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("AclId", request.aclId);
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAcl"),
            new TeaPair("version", "2019-11-20"),
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

    public AddEntriesToAclResponse addEntriesToAclWithOptions(AddEntriesToAclRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("AclId", request.aclId);
        query.put("AclEntries", request.aclEntries);
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddEntriesToAcl"),
            new TeaPair("version", "2019-11-20"),
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

    public CreateSpareIpsResponse createSpareIpsWithOptions(CreateSpareIpsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("AcceleratorId", request.acceleratorId);
        query.put("SpareIps", request.spareIps);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSpareIps"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSpareIpsResponse());
    }

    public CreateSpareIpsResponse createSpareIps(CreateSpareIpsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSpareIpsWithOptions(request, runtime);
    }

    public DissociateAdditionalCertificatesFromListenerResponse dissociateAdditionalCertificatesFromListenerWithOptions(DissociateAdditionalCertificatesFromListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("ClientToken", request.clientToken);
        query.put("AcceleratorId", request.acceleratorId);
        query.put("ListenerId", request.listenerId);
        query.put("Domains", request.domains);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DissociateAdditionalCertificatesFromListener"),
            new TeaPair("version", "2019-11-20"),
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

    public ListEndpointGroupsResponse listEndpointGroupsWithOptions(ListEndpointGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("AcceleratorId", request.acceleratorId);
        query.put("ListenerId", request.listenerId);
        query.put("EndpointGroupType", request.endpointGroupType);
        query.put("AccessLogSwitch", request.accessLogSwitch);
        query.put("EndpointGroupId", request.endpointGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEndpointGroups"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEndpointGroupsResponse());
    }

    public ListEndpointGroupsResponse listEndpointGroups(ListEndpointGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listEndpointGroupsWithOptions(request, runtime);
    }

    public ListBusiRegionsResponse listBusiRegionsWithOptions(ListBusiRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBusiRegions"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBusiRegionsResponse());
    }

    public ListBusiRegionsResponse listBusiRegions(ListBusiRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listBusiRegionsWithOptions(request, runtime);
    }

    public ReplaceBandwidthPackageResponse replaceBandwidthPackageWithOptions(ReplaceBandwidthPackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("BandwidthPackageId", request.bandwidthPackageId);
        query.put("TargetBandwidthPackageId", request.targetBandwidthPackageId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReplaceBandwidthPackage"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReplaceBandwidthPackageResponse());
    }

    public ReplaceBandwidthPackageResponse replaceBandwidthPackage(ReplaceBandwidthPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.replaceBandwidthPackageWithOptions(request, runtime);
    }

    public UpdateEndpointGroupAttributeResponse updateEndpointGroupAttributeWithOptions(UpdateEndpointGroupAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("ClientToken", request.clientToken);
        query.put("EndpointGroupId", request.endpointGroupId);
        query.put("Name", request.name);
        query.put("Description", request.description);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEndpointGroupAttribute"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEndpointGroupAttributeResponse());
    }

    public UpdateEndpointGroupAttributeResponse updateEndpointGroupAttribute(UpdateEndpointGroupAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateEndpointGroupAttributeWithOptions(request, runtime);
    }

    public UpdateForwardingRulesResponse updateForwardingRulesWithOptions(UpdateForwardingRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("ClientToken", request.clientToken);
        query.put("AcceleratorId", request.acceleratorId);
        query.put("ListenerId", request.listenerId);
        query.put("ForwardingRules", request.forwardingRules);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateForwardingRules"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateForwardingRulesResponse());
    }

    public UpdateForwardingRulesResponse updateForwardingRules(UpdateForwardingRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateForwardingRulesWithOptions(request, runtime);
    }

    public ListListenersResponse listListenersWithOptions(ListListenersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("AcceleratorId", request.acceleratorId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListListeners"),
            new TeaPair("version", "2019-11-20"),
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

    public DescribeEndpointGroupResponse describeEndpointGroupWithOptions(DescribeEndpointGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("EndpointGroupId", request.endpointGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEndpointGroup"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEndpointGroupResponse());
    }

    public DescribeEndpointGroupResponse describeEndpointGroup(DescribeEndpointGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEndpointGroupWithOptions(request, runtime);
    }

    public DeleteListenerResponse deleteListenerWithOptions(DeleteListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("AcceleratorId", request.acceleratorId);
        query.put("ListenerId", request.listenerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteListener"),
            new TeaPair("version", "2019-11-20"),
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

    public AssociateAdditionalCertificatesWithListenerResponse associateAdditionalCertificatesWithListenerWithOptions(AssociateAdditionalCertificatesWithListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("ClientToken", request.clientToken);
        query.put("AcceleratorId", request.acceleratorId);
        query.put("ListenerId", request.listenerId);
        query.put("Certificates", request.certificates);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateAdditionalCertificatesWithListener"),
            new TeaPair("version", "2019-11-20"),
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

    public AttachLogStoreToEndpointGroupResponse attachLogStoreToEndpointGroupWithOptions(AttachLogStoreToEndpointGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("SlsProjectName", request.slsProjectName);
        query.put("SlsLogStoreName", request.slsLogStoreName);
        query.put("AcceleratorId", request.acceleratorId);
        query.put("ListenerId", request.listenerId);
        query.put("SlsRegionId", request.slsRegionId);
        query.put("EndpointGroupIds", request.endpointGroupIds);
        query.put("ClientToken", request.clientToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachLogStoreToEndpointGroup"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachLogStoreToEndpointGroupResponse());
    }

    public AttachLogStoreToEndpointGroupResponse attachLogStoreToEndpointGroup(AttachLogStoreToEndpointGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachLogStoreToEndpointGroupWithOptions(request, runtime);
    }

    public UpdateBandwidthPackageResponse updateBandwidthPackageWithOptions(UpdateBandwidthPackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("BandwidthPackageId", request.bandwidthPackageId);
        query.put("Name", request.name);
        query.put("Description", request.description);
        query.put("Bandwidth", request.bandwidth);
        query.put("BandwidthType", request.bandwidthType);
        query.put("AutoPay", request.autoPay);
        query.put("AutoUseCoupon", request.autoUseCoupon);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBandwidthPackage"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBandwidthPackageResponse());
    }

    public UpdateBandwidthPackageResponse updateBandwidthPackage(UpdateBandwidthPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateBandwidthPackageWithOptions(request, runtime);
    }

    public DeleteAcceleratorResponse deleteAcceleratorWithOptions(DeleteAcceleratorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("AcceleratorId", request.acceleratorId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAccelerator"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAcceleratorResponse());
    }

    public DeleteAcceleratorResponse deleteAccelerator(DeleteAcceleratorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAcceleratorWithOptions(request, runtime);
    }

    public CreateEndpointGroupResponse createEndpointGroupWithOptions(CreateEndpointGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("ClientToken", request.clientToken);
        query.put("AcceleratorId", request.acceleratorId);
        query.put("Name", request.name);
        query.put("Description", request.description);
        query.put("EndpointGroupRegion", request.endpointGroupRegion);
        query.put("ListenerId", request.listenerId);
        query.put("TrafficPercentage", request.trafficPercentage);
        query.put("HealthCheckIntervalSeconds", request.healthCheckIntervalSeconds);
        query.put("HealthCheckPath", request.healthCheckPath);
        query.put("HealthCheckPort", request.healthCheckPort);
        query.put("HealthCheckProtocol", request.healthCheckProtocol);
        query.put("ThresholdCount", request.thresholdCount);
        query.put("EndpointConfigurations", request.endpointConfigurations);
        query.put("EndpointRequestProtocol", request.endpointRequestProtocol);
        query.put("EndpointGroupType", request.endpointGroupType);
        query.put("PortOverrides", request.portOverrides);
        query.put("HealthCheckEnabled", request.healthCheckEnabled);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEndpointGroup"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEndpointGroupResponse());
    }

    public CreateEndpointGroupResponse createEndpointGroup(CreateEndpointGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEndpointGroupWithOptions(request, runtime);
    }

    public DeleteEndpointGroupResponse deleteEndpointGroupWithOptions(DeleteEndpointGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("AcceleratorId", request.acceleratorId);
        query.put("EndpointGroupId", request.endpointGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEndpointGroup"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEndpointGroupResponse());
    }

    public DeleteEndpointGroupResponse deleteEndpointGroup(DeleteEndpointGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteEndpointGroupWithOptions(request, runtime);
    }

    public ListIpSetsResponse listIpSetsWithOptions(ListIpSetsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("AcceleratorId", request.acceleratorId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIpSets"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIpSetsResponse());
    }

    public ListIpSetsResponse listIpSets(ListIpSetsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listIpSetsWithOptions(request, runtime);
    }

    public UpdateAcceleratorConfirmResponse updateAcceleratorConfirmWithOptions(UpdateAcceleratorConfirmRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("AcceleratorId", request.acceleratorId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAcceleratorConfirm"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAcceleratorConfirmResponse());
    }

    public UpdateAcceleratorConfirmResponse updateAcceleratorConfirm(UpdateAcceleratorConfirmRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAcceleratorConfirmWithOptions(request, runtime);
    }

    public BandwidthPackageRemoveAcceleratorResponse bandwidthPackageRemoveAcceleratorWithOptions(BandwidthPackageRemoveAcceleratorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("BandwidthPackageId", request.bandwidthPackageId);
        query.put("AcceleratorId", request.acceleratorId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BandwidthPackageRemoveAccelerator"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BandwidthPackageRemoveAcceleratorResponse());
    }

    public BandwidthPackageRemoveAcceleratorResponse bandwidthPackageRemoveAccelerator(BandwidthPackageRemoveAcceleratorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bandwidthPackageRemoveAcceleratorWithOptions(request, runtime);
    }

    public DeleteForwardingRulesResponse deleteForwardingRulesWithOptions(DeleteForwardingRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("ClientToken", request.clientToken);
        query.put("ForwardingRuleIds", request.forwardingRuleIds);
        query.put("AcceleratorId", request.acceleratorId);
        query.put("ListenerId", request.listenerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteForwardingRules"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteForwardingRulesResponse());
    }

    public DeleteForwardingRulesResponse deleteForwardingRules(DeleteForwardingRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteForwardingRulesWithOptions(request, runtime);
    }

    public DissociateAclsFromListenerResponse dissociateAclsFromListenerWithOptions(DissociateAclsFromListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("AclIds", request.aclIds);
        query.put("ListenerId", request.listenerId);
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DissociateAclsFromListener"),
            new TeaPair("version", "2019-11-20"),
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

    public ListAccelerateAreasResponse listAccelerateAreasWithOptions(ListAccelerateAreasRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAccelerateAreas"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAccelerateAreasResponse());
    }

    public ListAccelerateAreasResponse listAccelerateAreas(ListAccelerateAreasRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAccelerateAreasWithOptions(request, runtime);
    }

    public ListListenerCertificatesResponse listListenerCertificatesWithOptions(ListListenerCertificatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("AcceleratorId", request.acceleratorId);
        query.put("Role", request.role);
        query.put("ListenerId", request.listenerId);
        query.put("NextToken", request.nextToken);
        query.put("MaxResults", request.maxResults);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListListenerCertificates"),
            new TeaPair("version", "2019-11-20"),
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

    public UpdateIpSetResponse updateIpSetWithOptions(UpdateIpSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("ClientToken", request.clientToken);
        query.put("IpSetId", request.ipSetId);
        query.put("Bandwidth", request.bandwidth);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateIpSet"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateIpSetResponse());
    }

    public UpdateIpSetResponse updateIpSet(UpdateIpSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateIpSetWithOptions(request, runtime);
    }

    public CreateAclResponse createAclWithOptions(CreateAclRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("AclName", request.aclName);
        query.put("AddressIPVersion", request.addressIPVersion);
        query.put("AclEntries", request.aclEntries);
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAcl"),
            new TeaPair("version", "2019-11-20"),
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

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2019-11-20"),
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

    public UpdateListenerResponse updateListenerWithOptions(UpdateListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("ClientToken", request.clientToken);
        query.put("Name", request.name);
        query.put("Description", request.description);
        query.put("ClientAffinity", request.clientAffinity);
        query.put("Protocol", request.protocol);
        query.put("ListenerId", request.listenerId);
        query.put("ProxyProtocol", request.proxyProtocol);
        query.put("PortRanges", request.portRanges);
        query.put("Certificates", request.certificates);
        query.put("BackendPorts", request.backendPorts);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateListener"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateListenerResponse());
    }

    public UpdateListenerResponse updateListener(UpdateListenerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateListenerWithOptions(request, runtime);
    }

    public ListAvailableBusiRegionsResponse listAvailableBusiRegionsWithOptions(ListAvailableBusiRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("AcceleratorId", request.acceleratorId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAvailableBusiRegions"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAvailableBusiRegionsResponse());
    }

    public ListAvailableBusiRegionsResponse listAvailableBusiRegions(ListAvailableBusiRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAvailableBusiRegionsWithOptions(request, runtime);
    }

    public UpdateAcceleratorResponse updateAcceleratorWithOptions(UpdateAcceleratorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("ClientToken", request.clientToken);
        query.put("Name", request.name);
        query.put("Description", request.description);
        query.put("AcceleratorId", request.acceleratorId);
        query.put("Spec", request.spec);
        query.put("AutoPay", request.autoPay);
        query.put("AutoUseCoupon", request.autoUseCoupon);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAccelerator"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAcceleratorResponse());
    }

    public UpdateAcceleratorResponse updateAccelerator(UpdateAcceleratorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAcceleratorWithOptions(request, runtime);
    }

    public DeleteEndpointGroupsResponse deleteEndpointGroupsWithOptions(DeleteEndpointGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("EndpointGroupIds", request.endpointGroupIds);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEndpointGroups"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEndpointGroupsResponse());
    }

    public DeleteEndpointGroupsResponse deleteEndpointGroups(DeleteEndpointGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteEndpointGroupsWithOptions(request, runtime);
    }

    public DeleteIpSetResponse deleteIpSetWithOptions(DeleteIpSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("ClientToken", request.clientToken);
        query.put("AcceleratorId", request.acceleratorId);
        query.put("IpSetId", request.ipSetId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIpSet"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIpSetResponse());
    }

    public DeleteIpSetResponse deleteIpSet(DeleteIpSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteIpSetWithOptions(request, runtime);
    }

    public UpdateEndpointGroupsResponse updateEndpointGroupsWithOptions(UpdateEndpointGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("EndpointGroupConfigurations", request.endpointGroupConfigurations);
        query.put("ListenerId", request.listenerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEndpointGroups"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEndpointGroupsResponse());
    }

    public UpdateEndpointGroupsResponse updateEndpointGroups(UpdateEndpointGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateEndpointGroupsWithOptions(request, runtime);
    }

    public DeleteIpSetsResponse deleteIpSetsWithOptions(DeleteIpSetsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("IpSetIds", request.ipSetIds);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIpSets"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIpSetsResponse());
    }

    public DeleteIpSetsResponse deleteIpSets(DeleteIpSetsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteIpSetsWithOptions(request, runtime);
    }

    public BandwidthPackageAddAcceleratorResponse bandwidthPackageAddAcceleratorWithOptions(BandwidthPackageAddAcceleratorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("BandwidthPackageId", request.bandwidthPackageId);
        query.put("AcceleratorId", request.acceleratorId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BandwidthPackageAddAccelerator"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BandwidthPackageAddAcceleratorResponse());
    }

    public BandwidthPackageAddAcceleratorResponse bandwidthPackageAddAccelerator(BandwidthPackageAddAcceleratorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bandwidthPackageAddAcceleratorWithOptions(request, runtime);
    }

    public UpdateAclAttributeResponse updateAclAttributeWithOptions(UpdateAclAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
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
            new TeaPair("version", "2019-11-20"),
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

    public ListAcceleratorsResponse listAcceleratorsWithOptions(ListAcceleratorsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("AcceleratorId", request.acceleratorId);
        query.put("State", request.state);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAccelerators"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAcceleratorsResponse());
    }

    public ListAcceleratorsResponse listAccelerators(ListAcceleratorsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAcceleratorsWithOptions(request, runtime);
    }

    public CreateListenerResponse createListenerWithOptions(CreateListenerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("ClientToken", request.clientToken);
        query.put("AcceleratorId", request.acceleratorId);
        query.put("Name", request.name);
        query.put("Description", request.description);
        query.put("ClientAffinity", request.clientAffinity);
        query.put("Protocol", request.protocol);
        query.put("ProxyProtocol", request.proxyProtocol);
        query.put("PortRanges", request.portRanges);
        query.put("Certificates", request.certificates);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateListener"),
            new TeaPair("version", "2019-11-20"),
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

    public ListSpareIpsResponse listSpareIpsWithOptions(ListSpareIpsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("AcceleratorId", request.acceleratorId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSpareIps"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSpareIpsResponse());
    }

    public ListSpareIpsResponse listSpareIps(ListSpareIpsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSpareIpsWithOptions(request, runtime);
    }

    public CreateEndpointGroupsResponse createEndpointGroupsWithOptions(CreateEndpointGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("AcceleratorId", request.acceleratorId);
        query.put("ListenerId", request.listenerId);
        query.put("EndpointGroupConfigurations", request.endpointGroupConfigurations);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEndpointGroups"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEndpointGroupsResponse());
    }

    public CreateEndpointGroupsResponse createEndpointGroups(CreateEndpointGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEndpointGroupsWithOptions(request, runtime);
    }

    public DetachDdosFromAcceleratorResponse detachDdosFromAcceleratorWithOptions(DetachDdosFromAcceleratorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AcceleratorId", request.acceleratorId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachDdosFromAccelerator"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachDdosFromAcceleratorResponse());
    }

    public DetachDdosFromAcceleratorResponse detachDdosFromAccelerator(DetachDdosFromAcceleratorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detachDdosFromAcceleratorWithOptions(request, runtime);
    }

    public GetSpareIpResponse getSpareIpWithOptions(GetSpareIpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("AcceleratorId", request.acceleratorId);
        query.put("SpareIp", request.spareIp);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSpareIp"),
            new TeaPair("version", "2019-11-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSpareIpResponse());
    }

    public GetSpareIpResponse getSpareIp(GetSpareIpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSpareIpWithOptions(request, runtime);
    }
}
