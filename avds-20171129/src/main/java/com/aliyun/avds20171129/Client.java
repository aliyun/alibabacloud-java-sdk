// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129;

import com.aliyun.tea.*;
import com.aliyun.avds20171129.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("avds", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddAssetsResponse addAssetsWithOptions(AddAssetsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddAssets", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new AddAssetsResponse());
    }

    public AddAssetsResponse addAssets(AddAssetsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addAssetsWithOptions(request, runtime);
    }

    public AddAssetTagsResponse addAssetTagsWithOptions(AddAssetTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddAssetTags", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new AddAssetTagsResponse());
    }

    public AddAssetTagsResponse addAssetTags(AddAssetTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addAssetTagsWithOptions(request, runtime);
    }

    public AddOrgDomainsResponse addOrgDomainsWithOptions(AddOrgDomainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddOrgDomains", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new AddOrgDomainsResponse());
    }

    public AddOrgDomainsResponse addOrgDomains(AddOrgDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addOrgDomainsWithOptions(request, runtime);
    }

    public AddOrgHostsResponse addOrgHostsWithOptions(AddOrgHostsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddOrgHosts", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new AddOrgHostsResponse());
    }

    public AddOrgHostsResponse addOrgHosts(AddOrgHostsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addOrgHostsWithOptions(request, runtime);
    }

    public AddOrgSubdomainsResponse addOrgSubdomainsWithOptions(AddOrgSubdomainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddOrgSubdomains", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new AddOrgSubdomainsResponse());
    }

    public AddOrgSubdomainsResponse addOrgSubdomains(AddOrgSubdomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addOrgSubdomainsWithOptions(request, runtime);
    }

    public AddOrgWebPathsResponse addOrgWebPathsWithOptions(AddOrgWebPathsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddOrgWebPaths", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new AddOrgWebPathsResponse());
    }

    public AddOrgWebPathsResponse addOrgWebPaths(AddOrgWebPathsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addOrgWebPathsWithOptions(request, runtime);
    }

    public CreateAvdsBagOrderResponse createAvdsBagOrderWithOptions(CreateAvdsBagOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAvdsBagOrder", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAvdsBagOrderResponse());
    }

    public CreateAvdsBagOrderResponse createAvdsBagOrder(CreateAvdsBagOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAvdsBagOrderWithOptions(request, runtime);
    }

    public CreateAvdsOrderResponse createAvdsOrderWithOptions(CreateAvdsOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAvdsOrder", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAvdsOrderResponse());
    }

    public CreateAvdsOrderResponse createAvdsOrder(CreateAvdsOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAvdsOrderWithOptions(request, runtime);
    }

    public CreateAvdsPublicOrderResponse createAvdsPublicOrderWithOptions(CreateAvdsPublicOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAvdsPublicOrder", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAvdsPublicOrderResponse());
    }

    public CreateAvdsPublicOrderResponse createAvdsPublicOrder(CreateAvdsPublicOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAvdsPublicOrderWithOptions(request, runtime);
    }

    public CreateOrganizationResponse createOrganizationWithOptions(CreateOrganizationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateOrganization", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new CreateOrganizationResponse());
    }

    public CreateOrganizationResponse createOrganization(CreateOrganizationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOrganizationWithOptions(request, runtime);
    }

    public CreateSessionResponse createSessionWithOptions(CreateSessionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSession", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSessionResponse());
    }

    public CreateSessionResponse createSession(CreateSessionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSessionWithOptions(request, runtime);
    }

    public DeleteAssetsResponse deleteAssetsWithOptions(DeleteAssetsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAssets", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAssetsResponse());
    }

    public DeleteAssetsResponse deleteAssets(DeleteAssetsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAssetsWithOptions(request, runtime);
    }

    public DeleteOrganizationsResponse deleteOrganizationsWithOptions(DeleteOrganizationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteOrganizations", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteOrganizationsResponse());
    }

    public DeleteOrganizationsResponse deleteOrganizations(DeleteOrganizationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteOrganizationsWithOptions(request, runtime);
    }

    public DeleteOrgAttackSurfaceRecordsResponse deleteOrgAttackSurfaceRecordsWithOptions(DeleteOrgAttackSurfaceRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteOrgAttackSurfaceRecords", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteOrgAttackSurfaceRecordsResponse());
    }

    public DeleteOrgAttackSurfaceRecordsResponse deleteOrgAttackSurfaceRecords(DeleteOrgAttackSurfaceRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteOrgAttackSurfaceRecordsWithOptions(request, runtime);
    }

    public DeleteSessionResponse deleteSessionWithOptions(DeleteSessionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSession", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSessionResponse());
    }

    public DeleteSessionResponse deleteSession(DeleteSessionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSessionWithOptions(request, runtime);
    }

    public DeleteUserAttackSurfaceRecordsResponse deleteUserAttackSurfaceRecordsWithOptions(DeleteUserAttackSurfaceRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteUserAttackSurfaceRecords", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteUserAttackSurfaceRecordsResponse());
    }

    public DeleteUserAttackSurfaceRecordsResponse deleteUserAttackSurfaceRecords(DeleteUserAttackSurfaceRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteUserAttackSurfaceRecordsWithOptions(request, runtime);
    }

    public DescribeAllVulnerabilitiesResponse describeAllVulnerabilitiesWithOptions(DescribeAllVulnerabilitiesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAllVulnerabilities", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAllVulnerabilitiesResponse());
    }

    public DescribeAllVulnerabilitiesResponse describeAllVulnerabilities(DescribeAllVulnerabilitiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAllVulnerabilitiesWithOptions(request, runtime);
    }

    public DescribeAssetsResponse describeAssetsWithOptions(DescribeAssetsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAssets", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAssetsResponse());
    }

    public DescribeAssetsResponse describeAssets(DescribeAssetsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAssetsWithOptions(request, runtime);
    }

    public DescribeAttackSurfacesFacetsResponse describeAttackSurfacesFacetsWithOptions(DescribeAttackSurfacesFacetsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAttackSurfacesFacets", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAttackSurfacesFacetsResponse());
    }

    public DescribeAttackSurfacesFacetsResponse describeAttackSurfacesFacets(DescribeAttackSurfacesFacetsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAttackSurfacesFacetsWithOptions(request, runtime);
    }

    public DescribeCrawlerRequestsResponse describeCrawlerRequestsWithOptions(DescribeCrawlerRequestsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCrawlerRequests", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCrawlerRequestsResponse());
    }

    public DescribeCrawlerRequestsResponse describeCrawlerRequests(DescribeCrawlerRequestsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCrawlerRequestsWithOptions(request, runtime);
    }

    public DescribeDNSMapResponse describeDNSMapWithOptions(DescribeDNSMapRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDNSMap", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDNSMapResponse());
    }

    public DescribeDNSMapResponse describeDNSMap(DescribeDNSMapRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDNSMapWithOptions(request, runtime);
    }

    public DescribeDomainAttackSurfacesFacetsResponse describeDomainAttackSurfacesFacetsWithOptions(DescribeDomainAttackSurfacesFacetsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainAttackSurfacesFacets", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainAttackSurfacesFacetsResponse());
    }

    public DescribeDomainAttackSurfacesFacetsResponse describeDomainAttackSurfacesFacets(DescribeDomainAttackSurfacesFacetsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainAttackSurfacesFacetsWithOptions(request, runtime);
    }

    public DescribeDomainsResponse describeDomainsWithOptions(DescribeDomainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomains", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainsResponse());
    }

    public DescribeDomainsResponse describeDomains(DescribeDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainsWithOptions(request, runtime);
    }

    public DescribeHostAttackSurfacesFacetsResponse describeHostAttackSurfacesFacetsWithOptions(DescribeHostAttackSurfacesFacetsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeHostAttackSurfacesFacets", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeHostAttackSurfacesFacetsResponse());
    }

    public DescribeHostAttackSurfacesFacetsResponse describeHostAttackSurfacesFacets(DescribeHostAttackSurfacesFacetsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHostAttackSurfacesFacetsWithOptions(request, runtime);
    }

    public DescribeHostsResponse describeHostsWithOptions(DescribeHostsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeHosts", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeHostsResponse());
    }

    public DescribeHostsResponse describeHosts(DescribeHostsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHostsWithOptions(request, runtime);
    }

    public DescribeListSessionsResponse describeListSessionsWithOptions(DescribeListSessionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeListSessions", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeListSessionsResponse());
    }

    public DescribeListSessionsResponse describeListSessions(DescribeListSessionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeListSessionsWithOptions(request, runtime);
    }

    public DescribeOrgAttackSurfaceDetailsResponse describeOrgAttackSurfaceDetailsWithOptions(DescribeOrgAttackSurfaceDetailsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeOrgAttackSurfaceDetails", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeOrgAttackSurfaceDetailsResponse());
    }

    public DescribeOrgAttackSurfaceDetailsResponse describeOrgAttackSurfaceDetails(DescribeOrgAttackSurfaceDetailsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeOrgAttackSurfaceDetailsWithOptions(request, runtime);
    }

    public DescribeOrgInfoResponse describeOrgInfoWithOptions(DescribeOrgInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeOrgInfo", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeOrgInfoResponse());
    }

    public DescribeOrgInfoResponse describeOrgInfo(DescribeOrgInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeOrgInfoWithOptions(request, runtime);
    }

    public DescribePortsResponse describePortsWithOptions(DescribePortsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePorts", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePortsResponse());
    }

    public DescribePortsResponse describePorts(DescribePortsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePortsWithOptions(request, runtime);
    }

    public DescribeScanSessionsResponse describeScanSessionsWithOptions(DescribeScanSessionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScanSessions", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScanSessionsResponse());
    }

    public DescribeScanSessionsResponse describeScanSessions(DescribeScanSessionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScanSessionsWithOptions(request, runtime);
    }

    public DescribeSessionResponse describeSessionWithOptions(DescribeSessionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSession", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSessionResponse());
    }

    public DescribeSessionResponse describeSession(DescribeSessionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSessionWithOptions(request, runtime);
    }

    public DescribeSubdomainsResponse describeSubdomainsWithOptions(DescribeSubdomainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSubdomains", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSubdomainsResponse());
    }

    public DescribeSubdomainsResponse describeSubdomains(DescribeSubdomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSubdomainsWithOptions(request, runtime);
    }

    public DescribeTaskBriefInfoResponse describeTaskBriefInfoWithOptions(DescribeTaskBriefInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeTaskBriefInfo", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeTaskBriefInfoResponse());
    }

    public DescribeTaskBriefInfoResponse describeTaskBriefInfo(DescribeTaskBriefInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTaskBriefInfoWithOptions(request, runtime);
    }

    public DescribeUserTagsResponse describeUserTagsWithOptions(DescribeUserTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUserTags", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUserTagsResponse());
    }

    public DescribeUserTagsResponse describeUserTags(DescribeUserTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserTagsWithOptions(request, runtime);
    }

    public DescribeVulnerabilityResponse describeVulnerabilityWithOptions(DescribeVulnerabilityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVulnerability", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVulnerabilityResponse());
    }

    public DescribeVulnerabilityResponse describeVulnerability(DescribeVulnerabilityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVulnerabilityWithOptions(request, runtime);
    }

    public DescribeWebPathsResponse describeWebPathsWithOptions(DescribeWebPathsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeWebPaths", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeWebPathsResponse());
    }

    public DescribeWebPathsResponse describeWebPaths(DescribeWebPathsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeWebPathsWithOptions(request, runtime);
    }

    public DescribeWebServersResponse describeWebServersWithOptions(DescribeWebServersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeWebServers", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeWebServersResponse());
    }

    public DescribeWebServersResponse describeWebServers(DescribeWebServersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeWebServersWithOptions(request, runtime);
    }

    public DescribeWebTechsResponse describeWebTechsWithOptions(DescribeWebTechsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeWebTechs", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeWebTechsResponse());
    }

    public DescribeWebTechsResponse describeWebTechs(DescribeWebTechsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeWebTechsWithOptions(request, runtime);
    }

    public EditSessionResponse editSessionWithOptions(EditSessionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EditSession", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new EditSessionResponse());
    }

    public EditSessionResponse editSession(EditSessionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.editSessionWithOptions(request, runtime);
    }

    public GenerateVulReportResponse generateVulReportWithOptions(GenerateVulReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GenerateVulReport", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new GenerateVulReportResponse());
    }

    public GenerateVulReportResponse generateVulReport(GenerateVulReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateVulReportWithOptions(request, runtime);
    }

    public ListOrgDNSMapResponse listOrgDNSMapWithOptions(ListOrgDNSMapRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListOrgDNSMap", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new ListOrgDNSMapResponse());
    }

    public ListOrgDNSMapResponse listOrgDNSMap(ListOrgDNSMapRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOrgDNSMapWithOptions(request, runtime);
    }

    public ListOrgDomainsResponse listOrgDomainsWithOptions(ListOrgDomainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListOrgDomains", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new ListOrgDomainsResponse());
    }

    public ListOrgDomainsResponse listOrgDomains(ListOrgDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOrgDomainsWithOptions(request, runtime);
    }

    public ListOrgHostsResponse listOrgHostsWithOptions(ListOrgHostsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListOrgHosts", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new ListOrgHostsResponse());
    }

    public ListOrgHostsResponse listOrgHosts(ListOrgHostsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOrgHostsWithOptions(request, runtime);
    }

    public ListOrgPortsResponse listOrgPortsWithOptions(ListOrgPortsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListOrgPorts", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new ListOrgPortsResponse());
    }

    public ListOrgPortsResponse listOrgPorts(ListOrgPortsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOrgPortsWithOptions(request, runtime);
    }

    public ListOrgRiskyAssetsResponse listOrgRiskyAssetsWithOptions(ListOrgRiskyAssetsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListOrgRiskyAssets", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new ListOrgRiskyAssetsResponse());
    }

    public ListOrgRiskyAssetsResponse listOrgRiskyAssets(ListOrgRiskyAssetsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOrgRiskyAssetsWithOptions(request, runtime);
    }

    public ListOrgSubdomainsResponse listOrgSubdomainsWithOptions(ListOrgSubdomainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListOrgSubdomains", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new ListOrgSubdomainsResponse());
    }

    public ListOrgSubdomainsResponse listOrgSubdomains(ListOrgSubdomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOrgSubdomainsWithOptions(request, runtime);
    }

    public ListOrgVulFacetsResponse listOrgVulFacetsWithOptions(ListOrgVulFacetsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListOrgVulFacets", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new ListOrgVulFacetsResponse());
    }

    public ListOrgVulFacetsResponse listOrgVulFacets(ListOrgVulFacetsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOrgVulFacetsWithOptions(request, runtime);
    }

    public ListOrgWebPathsResponse listOrgWebPathsWithOptions(ListOrgWebPathsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListOrgWebPaths", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new ListOrgWebPathsResponse());
    }

    public ListOrgWebPathsResponse listOrgWebPaths(ListOrgWebPathsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOrgWebPathsWithOptions(request, runtime);
    }

    public ListOrgWebTechsResponse listOrgWebTechsWithOptions(ListOrgWebTechsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListOrgWebTechs", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new ListOrgWebTechsResponse());
    }

    public ListOrgWebTechsResponse listOrgWebTechs(ListOrgWebTechsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOrgWebTechsWithOptions(request, runtime);
    }

    public ListUserDNSMapResponse listUserDNSMapWithOptions(ListUserDNSMapRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUserDNSMap", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new ListUserDNSMapResponse());
    }

    public ListUserDNSMapResponse listUserDNSMap(ListUserDNSMapRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUserDNSMapWithOptions(request, runtime);
    }

    public ListUserDNSMapHistoriesResponse listUserDNSMapHistoriesWithOptions(ListUserDNSMapHistoriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUserDNSMapHistories", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new ListUserDNSMapHistoriesResponse());
    }

    public ListUserDNSMapHistoriesResponse listUserDNSMapHistories(ListUserDNSMapHistoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUserDNSMapHistoriesWithOptions(request, runtime);
    }

    public ListUserDomainsResponse listUserDomainsWithOptions(ListUserDomainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUserDomains", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new ListUserDomainsResponse());
    }

    public ListUserDomainsResponse listUserDomains(ListUserDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUserDomainsWithOptions(request, runtime);
    }

    public ListUserHostsResponse listUserHostsWithOptions(ListUserHostsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUserHosts", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new ListUserHostsResponse());
    }

    public ListUserHostsResponse listUserHosts(ListUserHostsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUserHostsWithOptions(request, runtime);
    }

    public ListUserOrganizationsResponse listUserOrganizationsWithOptions(ListUserOrganizationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUserOrganizations", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new ListUserOrganizationsResponse());
    }

    public ListUserOrganizationsResponse listUserOrganizations(ListUserOrganizationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUserOrganizationsWithOptions(request, runtime);
    }

    public ListUserPortsResponse listUserPortsWithOptions(ListUserPortsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUserPorts", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new ListUserPortsResponse());
    }

    public ListUserPortsResponse listUserPorts(ListUserPortsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUserPortsWithOptions(request, runtime);
    }

    public ListUserSubdomainsResponse listUserSubdomainsWithOptions(ListUserSubdomainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUserSubdomains", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new ListUserSubdomainsResponse());
    }

    public ListUserSubdomainsResponse listUserSubdomains(ListUserSubdomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUserSubdomainsWithOptions(request, runtime);
    }

    public ListUserWebPathsResponse listUserWebPathsWithOptions(ListUserWebPathsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUserWebPaths", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new ListUserWebPathsResponse());
    }

    public ListUserWebPathsResponse listUserWebPaths(ListUserWebPathsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUserWebPathsWithOptions(request, runtime);
    }

    public ListUserWebTechsResponse listUserWebTechsWithOptions(ListUserWebTechsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUserWebTechs", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new ListUserWebTechsResponse());
    }

    public ListUserWebTechsResponse listUserWebTechs(ListUserWebTechsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUserWebTechsWithOptions(request, runtime);
    }

    public ModifyOrganizationResponse modifyOrganizationWithOptions(ModifyOrganizationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyOrganization", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyOrganizationResponse());
    }

    public ModifyOrganizationResponse modifyOrganization(ModifyOrganizationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyOrganizationWithOptions(request, runtime);
    }

    public TagAssetsByRecordsResponse tagAssetsByRecordsWithOptions(TagAssetsByRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TagAssetsByRecords", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new TagAssetsByRecordsResponse());
    }

    public TagAssetsByRecordsResponse tagAssetsByRecords(TagAssetsByRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagAssetsByRecordsWithOptions(request, runtime);
    }

    public TagAssetsBySearchResponse tagAssetsBySearchWithOptions(TagAssetsBySearchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TagAssetsBySearch", "2017-11-29", "HTTPS", "POST", "AK", "json", req, runtime), new TagAssetsBySearchResponse());
    }

    public TagAssetsBySearchResponse tagAssetsBySearch(TagAssetsBySearchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagAssetsBySearchWithOptions(request, runtime);
    }
}
