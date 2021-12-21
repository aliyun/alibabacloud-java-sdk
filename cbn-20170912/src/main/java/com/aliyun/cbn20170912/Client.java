// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912;

import com.aliyun.tea.*;
import com.aliyun.cbn20170912.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cbn", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ActiveFlowLogResponse activeFlowLogWithOptions(ActiveFlowLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenId", request.cenId);
        query.put("ClientToken", request.clientToken);
        query.put("FlowLogId", request.flowLogId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ActiveFlowLog"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ActiveFlowLogResponse());
    }

    public ActiveFlowLogResponse activeFlowLog(ActiveFlowLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.activeFlowLogWithOptions(request, runtime);
    }

    public AddTraficMatchRuleToTrafficMarkingPolicyResponse addTraficMatchRuleToTrafficMarkingPolicyWithOptions(AddTraficMatchRuleToTrafficMarkingPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TrafficMarkingPolicyId", request.trafficMarkingPolicyId);
        query.put("TrafficMatchRules", request.trafficMatchRules);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddTraficMatchRuleToTrafficMarkingPolicy"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddTraficMatchRuleToTrafficMarkingPolicyResponse());
    }

    public AddTraficMatchRuleToTrafficMarkingPolicyResponse addTraficMatchRuleToTrafficMarkingPolicy(AddTraficMatchRuleToTrafficMarkingPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addTraficMatchRuleToTrafficMarkingPolicyWithOptions(request, runtime);
    }

    public AssociateCenBandwidthPackageResponse associateCenBandwidthPackageWithOptions(AssociateCenBandwidthPackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenBandwidthPackageId", request.cenBandwidthPackageId);
        query.put("CenId", request.cenId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateCenBandwidthPackage"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateCenBandwidthPackageResponse());
    }

    public AssociateCenBandwidthPackageResponse associateCenBandwidthPackage(AssociateCenBandwidthPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.associateCenBandwidthPackageWithOptions(request, runtime);
    }

    public AssociateTransitRouterAttachmentWithRouteTableResponse associateTransitRouterAttachmentWithRouteTableWithOptions(AssociateTransitRouterAttachmentWithRouteTableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        query.put("TransitRouterRouteTableId", request.transitRouterRouteTableId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateTransitRouterAttachmentWithRouteTable"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateTransitRouterAttachmentWithRouteTableResponse());
    }

    public AssociateTransitRouterAttachmentWithRouteTableResponse associateTransitRouterAttachmentWithRouteTable(AssociateTransitRouterAttachmentWithRouteTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.associateTransitRouterAttachmentWithRouteTableWithOptions(request, runtime);
    }

    public AttachCenChildInstanceResponse attachCenChildInstanceWithOptions(AttachCenChildInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenId", request.cenId);
        query.put("ChildInstanceId", request.childInstanceId);
        query.put("ChildInstanceOwnerId", request.childInstanceOwnerId);
        query.put("ChildInstanceRegionId", request.childInstanceRegionId);
        query.put("ChildInstanceType", request.childInstanceType);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachCenChildInstance"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachCenChildInstanceResponse());
    }

    public AttachCenChildInstanceResponse attachCenChildInstance(AttachCenChildInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachCenChildInstanceWithOptions(request, runtime);
    }

    public CheckTransitRouterServiceResponse checkTransitRouterServiceWithOptions(CheckTransitRouterServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckTransitRouterService"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckTransitRouterServiceResponse());
    }

    public CheckTransitRouterServiceResponse checkTransitRouterService(CheckTransitRouterServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkTransitRouterServiceWithOptions(request, runtime);
    }

    public CreateCenResponse createCenWithOptions(CreateCenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("Description", request.description);
        query.put("Name", request.name);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ProtectionLevel", request.protectionLevel);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCen"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCenResponse());
    }

    public CreateCenResponse createCen(CreateCenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCenWithOptions(request, runtime);
    }

    public CreateCenBandwidthPackageResponse createCenBandwidthPackageWithOptions(CreateCenBandwidthPackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AutoPay", request.autoPay);
        query.put("AutoRenew", request.autoRenew);
        query.put("AutoRenewDuration", request.autoRenewDuration);
        query.put("Bandwidth", request.bandwidth);
        query.put("BandwidthPackageChargeType", request.bandwidthPackageChargeType);
        query.put("ClientToken", request.clientToken);
        query.put("Description", request.description);
        query.put("GeographicRegionAId", request.geographicRegionAId);
        query.put("GeographicRegionBId", request.geographicRegionBId);
        query.put("Name", request.name);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("Period", request.period);
        query.put("PricingCycle", request.pricingCycle);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCenBandwidthPackage"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCenBandwidthPackageResponse());
    }

    public CreateCenBandwidthPackageResponse createCenBandwidthPackage(CreateCenBandwidthPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCenBandwidthPackageWithOptions(request, runtime);
    }

    public CreateCenChildInstanceRouteEntryToAttachmentResponse createCenChildInstanceRouteEntryToAttachmentWithOptions(CreateCenChildInstanceRouteEntryToAttachmentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenId", request.cenId);
        query.put("ClientToken", request.clientToken);
        query.put("DestinationCidrBlock", request.destinationCidrBlock);
        query.put("DryRun", request.dryRun);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RouteTableId", request.routeTableId);
        query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCenChildInstanceRouteEntryToAttachment"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCenChildInstanceRouteEntryToAttachmentResponse());
    }

    public CreateCenChildInstanceRouteEntryToAttachmentResponse createCenChildInstanceRouteEntryToAttachment(CreateCenChildInstanceRouteEntryToAttachmentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCenChildInstanceRouteEntryToAttachmentWithOptions(request, runtime);
    }

    public CreateCenChildInstanceRouteEntryToCenResponse createCenChildInstanceRouteEntryToCenWithOptions(CreateCenChildInstanceRouteEntryToCenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenId", request.cenId);
        query.put("ChildInstanceAliUid", request.childInstanceAliUid);
        query.put("ChildInstanceId", request.childInstanceId);
        query.put("ChildInstanceRegionId", request.childInstanceRegionId);
        query.put("ChildInstanceType", request.childInstanceType);
        query.put("DestinationCidrBlock", request.destinationCidrBlock);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RouteTableId", request.routeTableId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCenChildInstanceRouteEntryToCen"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCenChildInstanceRouteEntryToCenResponse());
    }

    public CreateCenChildInstanceRouteEntryToCenResponse createCenChildInstanceRouteEntryToCen(CreateCenChildInstanceRouteEntryToCenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCenChildInstanceRouteEntryToCenWithOptions(request, runtime);
    }

    public CreateCenInterRegionTrafficQosPolicyResponse createCenInterRegionTrafficQosPolicyWithOptions(CreateCenInterRegionTrafficQosPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TrafficQosPolicyDescription", request.trafficQosPolicyDescription);
        query.put("TrafficQosPolicyName", request.trafficQosPolicyName);
        query.put("TrafficQosQueues", request.trafficQosQueues);
        query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        query.put("TransitRouterId", request.transitRouterId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCenInterRegionTrafficQosPolicy"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCenInterRegionTrafficQosPolicyResponse());
    }

    public CreateCenInterRegionTrafficQosPolicyResponse createCenInterRegionTrafficQosPolicy(CreateCenInterRegionTrafficQosPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCenInterRegionTrafficQosPolicyWithOptions(request, runtime);
    }

    public CreateCenRouteMapResponse createCenRouteMapWithOptions(CreateCenRouteMapRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AsPathMatchMode", request.asPathMatchMode);
        query.put("CenId", request.cenId);
        query.put("CenRegionId", request.cenRegionId);
        query.put("CidrMatchMode", request.cidrMatchMode);
        query.put("CommunityMatchMode", request.communityMatchMode);
        query.put("CommunityOperateMode", request.communityOperateMode);
        query.put("Description", request.description);
        query.put("DestinationChildInstanceTypes", request.destinationChildInstanceTypes);
        query.put("DestinationCidrBlocks", request.destinationCidrBlocks);
        query.put("DestinationInstanceIds", request.destinationInstanceIds);
        query.put("DestinationInstanceIdsReverseMatch", request.destinationInstanceIdsReverseMatch);
        query.put("DestinationRouteTableIds", request.destinationRouteTableIds);
        query.put("MapResult", request.mapResult);
        query.put("MatchAsns", request.matchAsns);
        query.put("MatchCommunitySet", request.matchCommunitySet);
        query.put("NextPriority", request.nextPriority);
        query.put("OperateCommunitySet", request.operateCommunitySet);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("Preference", request.preference);
        query.put("PrependAsPath", request.prependAsPath);
        query.put("Priority", request.priority);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RouteTypes", request.routeTypes);
        query.put("SourceChildInstanceTypes", request.sourceChildInstanceTypes);
        query.put("SourceInstanceIds", request.sourceInstanceIds);
        query.put("SourceInstanceIdsReverseMatch", request.sourceInstanceIdsReverseMatch);
        query.put("SourceRegionIds", request.sourceRegionIds);
        query.put("SourceRouteTableIds", request.sourceRouteTableIds);
        query.put("TransmitDirection", request.transmitDirection);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCenRouteMap"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCenRouteMapResponse());
    }

    public CreateCenRouteMapResponse createCenRouteMap(CreateCenRouteMapRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCenRouteMapWithOptions(request, runtime);
    }

    public CreateFlowlogResponse createFlowlogWithOptions(CreateFlowlogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenId", request.cenId);
        query.put("ClientToken", request.clientToken);
        query.put("Description", request.description);
        query.put("FlowLogName", request.flowLogName);
        query.put("LogStoreName", request.logStoreName);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ProjectName", request.projectName);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFlowlog"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFlowlogResponse());
    }

    public CreateFlowlogResponse createFlowlog(CreateFlowlogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFlowlogWithOptions(request, runtime);
    }

    public CreateTrafficMarkingPolicyResponse createTrafficMarkingPolicyWithOptions(CreateTrafficMarkingPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("MarkingDscp", request.markingDscp);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("Priority", request.priority);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TrafficMarkingPolicyDescription", request.trafficMarkingPolicyDescription);
        query.put("TrafficMarkingPolicyName", request.trafficMarkingPolicyName);
        query.put("TrafficMatchRules", request.trafficMatchRules);
        query.put("TransitRouterId", request.transitRouterId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTrafficMarkingPolicy"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTrafficMarkingPolicyResponse());
    }

    public CreateTrafficMarkingPolicyResponse createTrafficMarkingPolicy(CreateTrafficMarkingPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTrafficMarkingPolicyWithOptions(request, runtime);
    }

    public CreateTransitRouterResponse createTransitRouterWithOptions(CreateTransitRouterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenId", request.cenId);
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TransitRouterDescription", request.transitRouterDescription);
        query.put("TransitRouterName", request.transitRouterName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTransitRouter"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTransitRouterResponse());
    }

    public CreateTransitRouterResponse createTransitRouter(CreateTransitRouterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTransitRouterWithOptions(request, runtime);
    }

    public CreateTransitRouterPeerAttachmentResponse createTransitRouterPeerAttachmentWithOptions(CreateTransitRouterPeerAttachmentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AutoPublishRouteEnabled", request.autoPublishRouteEnabled);
        query.put("Bandwidth", request.bandwidth);
        query.put("BandwidthType", request.bandwidthType);
        query.put("CenBandwidthPackageId", request.cenBandwidthPackageId);
        query.put("CenId", request.cenId);
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("PeerTransitRouterId", request.peerTransitRouterId);
        query.put("PeerTransitRouterRegionId", request.peerTransitRouterRegionId);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TransitRouterAttachmentDescription", request.transitRouterAttachmentDescription);
        query.put("TransitRouterAttachmentName", request.transitRouterAttachmentName);
        query.put("TransitRouterId", request.transitRouterId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTransitRouterPeerAttachment"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTransitRouterPeerAttachmentResponse());
    }

    public CreateTransitRouterPeerAttachmentResponse createTransitRouterPeerAttachment(CreateTransitRouterPeerAttachmentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTransitRouterPeerAttachmentWithOptions(request, runtime);
    }

    public CreateTransitRouterRouteEntryResponse createTransitRouterRouteEntryWithOptions(CreateTransitRouterRouteEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TransitRouterRouteEntryDescription", request.transitRouterRouteEntryDescription);
        query.put("TransitRouterRouteEntryDestinationCidrBlock", request.transitRouterRouteEntryDestinationCidrBlock);
        query.put("TransitRouterRouteEntryName", request.transitRouterRouteEntryName);
        query.put("TransitRouterRouteEntryNextHopId", request.transitRouterRouteEntryNextHopId);
        query.put("TransitRouterRouteEntryNextHopType", request.transitRouterRouteEntryNextHopType);
        query.put("TransitRouterRouteTableId", request.transitRouterRouteTableId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTransitRouterRouteEntry"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTransitRouterRouteEntryResponse());
    }

    public CreateTransitRouterRouteEntryResponse createTransitRouterRouteEntry(CreateTransitRouterRouteEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTransitRouterRouteEntryWithOptions(request, runtime);
    }

    public CreateTransitRouterRouteTableResponse createTransitRouterRouteTableWithOptions(CreateTransitRouterRouteTableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TransitRouterId", request.transitRouterId);
        query.put("TransitRouterRouteTableDescription", request.transitRouterRouteTableDescription);
        query.put("TransitRouterRouteTableName", request.transitRouterRouteTableName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTransitRouterRouteTable"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTransitRouterRouteTableResponse());
    }

    public CreateTransitRouterRouteTableResponse createTransitRouterRouteTable(CreateTransitRouterRouteTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTransitRouterRouteTableWithOptions(request, runtime);
    }

    public CreateTransitRouterVbrAttachmentResponse createTransitRouterVbrAttachmentWithOptions(CreateTransitRouterVbrAttachmentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AutoPublishRouteEnabled", request.autoPublishRouteEnabled);
        query.put("CenId", request.cenId);
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TransitRouterAttachmentDescription", request.transitRouterAttachmentDescription);
        query.put("TransitRouterAttachmentName", request.transitRouterAttachmentName);
        query.put("TransitRouterId", request.transitRouterId);
        query.put("VbrId", request.vbrId);
        query.put("VbrOwnerId", request.vbrOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTransitRouterVbrAttachment"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTransitRouterVbrAttachmentResponse());
    }

    public CreateTransitRouterVbrAttachmentResponse createTransitRouterVbrAttachment(CreateTransitRouterVbrAttachmentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTransitRouterVbrAttachmentWithOptions(request, runtime);
    }

    public CreateTransitRouterVpcAttachmentResponse createTransitRouterVpcAttachmentWithOptions(CreateTransitRouterVpcAttachmentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenId", request.cenId);
        query.put("ChargeType", request.chargeType);
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TransitRouterAttachmentDescription", request.transitRouterAttachmentDescription);
        query.put("TransitRouterAttachmentName", request.transitRouterAttachmentName);
        query.put("TransitRouterId", request.transitRouterId);
        query.put("VpcId", request.vpcId);
        query.put("VpcOwnerId", request.vpcOwnerId);
        query.put("ZoneMappings", request.zoneMappings);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTransitRouterVpcAttachment"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTransitRouterVpcAttachmentResponse());
    }

    public CreateTransitRouterVpcAttachmentResponse createTransitRouterVpcAttachment(CreateTransitRouterVpcAttachmentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTransitRouterVpcAttachmentWithOptions(request, runtime);
    }

    public DeactiveFlowLogResponse deactiveFlowLogWithOptions(DeactiveFlowLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenId", request.cenId);
        query.put("ClientToken", request.clientToken);
        query.put("FlowLogId", request.flowLogId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeactiveFlowLog"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeactiveFlowLogResponse());
    }

    public DeactiveFlowLogResponse deactiveFlowLog(DeactiveFlowLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deactiveFlowLogWithOptions(request, runtime);
    }

    public DeleteCenResponse deleteCenWithOptions(DeleteCenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenId", request.cenId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCen"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCenResponse());
    }

    public DeleteCenResponse deleteCen(DeleteCenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCenWithOptions(request, runtime);
    }

    public DeleteCenBandwidthPackageResponse deleteCenBandwidthPackageWithOptions(DeleteCenBandwidthPackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenBandwidthPackageId", request.cenBandwidthPackageId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCenBandwidthPackage"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCenBandwidthPackageResponse());
    }

    public DeleteCenBandwidthPackageResponse deleteCenBandwidthPackage(DeleteCenBandwidthPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCenBandwidthPackageWithOptions(request, runtime);
    }

    public DeleteCenChildInstanceRouteEntryToAttachmentResponse deleteCenChildInstanceRouteEntryToAttachmentWithOptions(DeleteCenChildInstanceRouteEntryToAttachmentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenId", request.cenId);
        query.put("ClientToken", request.clientToken);
        query.put("DestinationCidrBlock", request.destinationCidrBlock);
        query.put("DryRun", request.dryRun);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RouteTableId", request.routeTableId);
        query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCenChildInstanceRouteEntryToAttachment"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCenChildInstanceRouteEntryToAttachmentResponse());
    }

    public DeleteCenChildInstanceRouteEntryToAttachmentResponse deleteCenChildInstanceRouteEntryToAttachment(DeleteCenChildInstanceRouteEntryToAttachmentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCenChildInstanceRouteEntryToAttachmentWithOptions(request, runtime);
    }

    public DeleteCenChildInstanceRouteEntryToCenResponse deleteCenChildInstanceRouteEntryToCenWithOptions(DeleteCenChildInstanceRouteEntryToCenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenId", request.cenId);
        query.put("ChildInstanceAliUid", request.childInstanceAliUid);
        query.put("ChildInstanceId", request.childInstanceId);
        query.put("ChildInstanceRegionId", request.childInstanceRegionId);
        query.put("ChildInstanceType", request.childInstanceType);
        query.put("DestinationCidrBlock", request.destinationCidrBlock);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RouteTableId", request.routeTableId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCenChildInstanceRouteEntryToCen"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCenChildInstanceRouteEntryToCenResponse());
    }

    public DeleteCenChildInstanceRouteEntryToCenResponse deleteCenChildInstanceRouteEntryToCen(DeleteCenChildInstanceRouteEntryToCenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCenChildInstanceRouteEntryToCenWithOptions(request, runtime);
    }

    public DeleteCenInterRegionTrafficQosPolicyResponse deleteCenInterRegionTrafficQosPolicyWithOptions(DeleteCenInterRegionTrafficQosPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TrafficQosPolicyId", request.trafficQosPolicyId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCenInterRegionTrafficQosPolicy"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCenInterRegionTrafficQosPolicyResponse());
    }

    public DeleteCenInterRegionTrafficQosPolicyResponse deleteCenInterRegionTrafficQosPolicy(DeleteCenInterRegionTrafficQosPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCenInterRegionTrafficQosPolicyWithOptions(request, runtime);
    }

    public DeleteCenInterRegionTrafficQosQueueResponse deleteCenInterRegionTrafficQosQueueWithOptions(DeleteCenInterRegionTrafficQosQueueRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("QosQueueId", request.qosQueueId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCenInterRegionTrafficQosQueue"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCenInterRegionTrafficQosQueueResponse());
    }

    public DeleteCenInterRegionTrafficQosQueueResponse deleteCenInterRegionTrafficQosQueue(DeleteCenInterRegionTrafficQosQueueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCenInterRegionTrafficQosQueueWithOptions(request, runtime);
    }

    public DeleteCenRouteMapResponse deleteCenRouteMapWithOptions(DeleteCenRouteMapRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenId", request.cenId);
        query.put("CenRegionId", request.cenRegionId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RouteMapId", request.routeMapId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCenRouteMap"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCenRouteMapResponse());
    }

    public DeleteCenRouteMapResponse deleteCenRouteMap(DeleteCenRouteMapRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCenRouteMapWithOptions(request, runtime);
    }

    public DeleteFlowlogResponse deleteFlowlogWithOptions(DeleteFlowlogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenId", request.cenId);
        query.put("ClientToken", request.clientToken);
        query.put("FlowLogId", request.flowLogId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFlowlog"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFlowlogResponse());
    }

    public DeleteFlowlogResponse deleteFlowlog(DeleteFlowlogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFlowlogWithOptions(request, runtime);
    }

    public DeleteRouteServiceInCenResponse deleteRouteServiceInCenWithOptions(DeleteRouteServiceInCenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccessRegionId", request.accessRegionId);
        query.put("CenId", request.cenId);
        query.put("Host", request.host);
        query.put("HostRegionId", request.hostRegionId);
        query.put("HostVpcId", request.hostVpcId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRouteServiceInCen"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRouteServiceInCenResponse());
    }

    public DeleteRouteServiceInCenResponse deleteRouteServiceInCen(DeleteRouteServiceInCenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRouteServiceInCenWithOptions(request, runtime);
    }

    public DeleteTrafficMarkingPolicyResponse deleteTrafficMarkingPolicyWithOptions(DeleteTrafficMarkingPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TrafficMarkingPolicyId", request.trafficMarkingPolicyId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTrafficMarkingPolicy"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTrafficMarkingPolicyResponse());
    }

    public DeleteTrafficMarkingPolicyResponse deleteTrafficMarkingPolicy(DeleteTrafficMarkingPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTrafficMarkingPolicyWithOptions(request, runtime);
    }

    public DeleteTransitRouterPeerAttachmentResponse deleteTransitRouterPeerAttachmentWithOptions(DeleteTransitRouterPeerAttachmentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTransitRouterPeerAttachment"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTransitRouterPeerAttachmentResponse());
    }

    public DeleteTransitRouterPeerAttachmentResponse deleteTransitRouterPeerAttachment(DeleteTransitRouterPeerAttachmentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTransitRouterPeerAttachmentWithOptions(request, runtime);
    }

    public DeleteTransitRouterRouteEntryResponse deleteTransitRouterRouteEntryWithOptions(DeleteTransitRouterRouteEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TransitRouterRouteEntryDestinationCidrBlock", request.transitRouterRouteEntryDestinationCidrBlock);
        query.put("TransitRouterRouteEntryId", request.transitRouterRouteEntryId);
        query.put("TransitRouterRouteEntryNextHopId", request.transitRouterRouteEntryNextHopId);
        query.put("TransitRouterRouteEntryNextHopType", request.transitRouterRouteEntryNextHopType);
        query.put("TransitRouterRouteTableId", request.transitRouterRouteTableId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTransitRouterRouteEntry"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTransitRouterRouteEntryResponse());
    }

    public DeleteTransitRouterRouteEntryResponse deleteTransitRouterRouteEntry(DeleteTransitRouterRouteEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTransitRouterRouteEntryWithOptions(request, runtime);
    }

    public DeleteTransitRouterRouteTableResponse deleteTransitRouterRouteTableWithOptions(DeleteTransitRouterRouteTableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TransitRouterRouteTableId", request.transitRouterRouteTableId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTransitRouterRouteTable"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTransitRouterRouteTableResponse());
    }

    public DeleteTransitRouterRouteTableResponse deleteTransitRouterRouteTable(DeleteTransitRouterRouteTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTransitRouterRouteTableWithOptions(request, runtime);
    }

    public DeleteTransitRouterVbrAttachmentResponse deleteTransitRouterVbrAttachmentWithOptions(DeleteTransitRouterVbrAttachmentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTransitRouterVbrAttachment"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTransitRouterVbrAttachmentResponse());
    }

    public DeleteTransitRouterVbrAttachmentResponse deleteTransitRouterVbrAttachment(DeleteTransitRouterVbrAttachmentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTransitRouterVbrAttachmentWithOptions(request, runtime);
    }

    public DeleteTransitRouterVpcAttachmentResponse deleteTransitRouterVpcAttachmentWithOptions(DeleteTransitRouterVpcAttachmentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTransitRouterVpcAttachment"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTransitRouterVpcAttachmentResponse());
    }

    public DeleteTransitRouterVpcAttachmentResponse deleteTransitRouterVpcAttachment(DeleteTransitRouterVpcAttachmentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTransitRouterVpcAttachmentWithOptions(request, runtime);
    }

    public DescribeCenAttachedChildInstanceAttributeResponse describeCenAttachedChildInstanceAttributeWithOptions(DescribeCenAttachedChildInstanceAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenId", request.cenId);
        query.put("ChildInstanceId", request.childInstanceId);
        query.put("ChildInstanceRegionId", request.childInstanceRegionId);
        query.put("ChildInstanceType", request.childInstanceType);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCenAttachedChildInstanceAttribute"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCenAttachedChildInstanceAttributeResponse());
    }

    public DescribeCenAttachedChildInstanceAttributeResponse describeCenAttachedChildInstanceAttribute(DescribeCenAttachedChildInstanceAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCenAttachedChildInstanceAttributeWithOptions(request, runtime);
    }

    public DescribeCenAttachedChildInstancesResponse describeCenAttachedChildInstancesWithOptions(DescribeCenAttachedChildInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenId", request.cenId);
        query.put("ChildInstanceRegionId", request.childInstanceRegionId);
        query.put("ChildInstanceType", request.childInstanceType);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCenAttachedChildInstances"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCenAttachedChildInstancesResponse());
    }

    public DescribeCenAttachedChildInstancesResponse describeCenAttachedChildInstances(DescribeCenAttachedChildInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCenAttachedChildInstancesWithOptions(request, runtime);
    }

    public DescribeCenBandwidthPackagesResponse describeCenBandwidthPackagesWithOptions(DescribeCenBandwidthPackagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Filter", request.filter);
        query.put("IncludeReservationData", request.includeReservationData);
        query.put("IsOrKey", request.isOrKey);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCenBandwidthPackages"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCenBandwidthPackagesResponse());
    }

    public DescribeCenBandwidthPackagesResponse describeCenBandwidthPackages(DescribeCenBandwidthPackagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCenBandwidthPackagesWithOptions(request, runtime);
    }

    public DescribeCenChildInstanceRouteEntriesResponse describeCenChildInstanceRouteEntriesWithOptions(DescribeCenChildInstanceRouteEntriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenId", request.cenId);
        query.put("ChildInstanceId", request.childInstanceId);
        query.put("ChildInstanceRegionId", request.childInstanceRegionId);
        query.put("ChildInstanceType", request.childInstanceType);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("Status", request.status);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCenChildInstanceRouteEntries"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCenChildInstanceRouteEntriesResponse());
    }

    public DescribeCenChildInstanceRouteEntriesResponse describeCenChildInstanceRouteEntries(DescribeCenChildInstanceRouteEntriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCenChildInstanceRouteEntriesWithOptions(request, runtime);
    }

    public DescribeCenGeographicSpanRemainingBandwidthResponse describeCenGeographicSpanRemainingBandwidthWithOptions(DescribeCenGeographicSpanRemainingBandwidthRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenId", request.cenId);
        query.put("GeographicRegionAId", request.geographicRegionAId);
        query.put("GeographicRegionBId", request.geographicRegionBId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCenGeographicSpanRemainingBandwidth"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCenGeographicSpanRemainingBandwidthResponse());
    }

    public DescribeCenGeographicSpanRemainingBandwidthResponse describeCenGeographicSpanRemainingBandwidth(DescribeCenGeographicSpanRemainingBandwidthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCenGeographicSpanRemainingBandwidthWithOptions(request, runtime);
    }

    public DescribeCenGeographicSpansResponse describeCenGeographicSpansWithOptions(DescribeCenGeographicSpansRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GeographicSpanId", request.geographicSpanId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCenGeographicSpans"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCenGeographicSpansResponse());
    }

    public DescribeCenGeographicSpansResponse describeCenGeographicSpans(DescribeCenGeographicSpansRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCenGeographicSpansWithOptions(request, runtime);
    }

    public DescribeCenInterRegionBandwidthLimitsResponse describeCenInterRegionBandwidthLimitsWithOptions(DescribeCenInterRegionBandwidthLimitsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenId", request.cenId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCenInterRegionBandwidthLimits"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCenInterRegionBandwidthLimitsResponse());
    }

    public DescribeCenInterRegionBandwidthLimitsResponse describeCenInterRegionBandwidthLimits(DescribeCenInterRegionBandwidthLimitsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCenInterRegionBandwidthLimitsWithOptions(request, runtime);
    }

    public DescribeCenPrivateZoneRoutesResponse describeCenPrivateZoneRoutesWithOptions(DescribeCenPrivateZoneRoutesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccessRegionId", request.accessRegionId);
        query.put("CenId", request.cenId);
        query.put("HostRegionId", request.hostRegionId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCenPrivateZoneRoutes"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCenPrivateZoneRoutesResponse());
    }

    public DescribeCenPrivateZoneRoutesResponse describeCenPrivateZoneRoutes(DescribeCenPrivateZoneRoutesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCenPrivateZoneRoutesWithOptions(request, runtime);
    }

    public DescribeCenRegionDomainRouteEntriesResponse describeCenRegionDomainRouteEntriesWithOptions(DescribeCenRegionDomainRouteEntriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenId", request.cenId);
        query.put("CenRegionId", request.cenRegionId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("Status", request.status);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCenRegionDomainRouteEntries"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCenRegionDomainRouteEntriesResponse());
    }

    public DescribeCenRegionDomainRouteEntriesResponse describeCenRegionDomainRouteEntries(DescribeCenRegionDomainRouteEntriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCenRegionDomainRouteEntriesWithOptions(request, runtime);
    }

    public DescribeCenRouteMapsResponse describeCenRouteMapsWithOptions(DescribeCenRouteMapsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenId", request.cenId);
        query.put("CenRegionId", request.cenRegionId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RouteMapId", request.routeMapId);
        query.put("TransmitDirection", request.transmitDirection);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCenRouteMaps"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCenRouteMapsResponse());
    }

    public DescribeCenRouteMapsResponse describeCenRouteMaps(DescribeCenRouteMapsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCenRouteMapsWithOptions(request, runtime);
    }

    public DescribeCenVbrHealthCheckResponse describeCenVbrHealthCheckWithOptions(DescribeCenVbrHealthCheckRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenId", request.cenId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("VbrInstanceId", request.vbrInstanceId);
        query.put("VbrInstanceOwnerId", request.vbrInstanceOwnerId);
        query.put("VbrInstanceRegionId", request.vbrInstanceRegionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCenVbrHealthCheck"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCenVbrHealthCheckResponse());
    }

    public DescribeCenVbrHealthCheckResponse describeCenVbrHealthCheck(DescribeCenVbrHealthCheckRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCenVbrHealthCheckWithOptions(request, runtime);
    }

    public DescribeCensResponse describeCensWithOptions(DescribeCensRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Filter", request.filter);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCens"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCensResponse());
    }

    public DescribeCensResponse describeCens(DescribeCensRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCensWithOptions(request, runtime);
    }

    public DescribeChildInstanceRegionsResponse describeChildInstanceRegionsWithOptions(DescribeChildInstanceRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ProductType", request.productType);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeChildInstanceRegions"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeChildInstanceRegionsResponse());
    }

    public DescribeChildInstanceRegionsResponse describeChildInstanceRegions(DescribeChildInstanceRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeChildInstanceRegionsWithOptions(request, runtime);
    }

    public DescribeFlowlogsResponse describeFlowlogsWithOptions(DescribeFlowlogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenId", request.cenId);
        query.put("ClientToken", request.clientToken);
        query.put("Description", request.description);
        query.put("FlowLogId", request.flowLogId);
        query.put("FlowLogName", request.flowLogName);
        query.put("LogStoreName", request.logStoreName);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("ProjectName", request.projectName);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("Status", request.status);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFlowlogs"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFlowlogsResponse());
    }

    public DescribeFlowlogsResponse describeFlowlogs(DescribeFlowlogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowlogsWithOptions(request, runtime);
    }

    public DescribeGeographicRegionMembershipResponse describeGeographicRegionMembershipWithOptions(DescribeGeographicRegionMembershipRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GeographicRegionId", request.geographicRegionId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGeographicRegionMembership"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGeographicRegionMembershipResponse());
    }

    public DescribeGeographicRegionMembershipResponse describeGeographicRegionMembership(DescribeGeographicRegionMembershipRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGeographicRegionMembershipWithOptions(request, runtime);
    }

    public DescribeGrantRulesToCenResponse describeGrantRulesToCenWithOptions(DescribeGrantRulesToCenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenId", request.cenId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ProductType", request.productType);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGrantRulesToCen"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGrantRulesToCenResponse());
    }

    public DescribeGrantRulesToCenResponse describeGrantRulesToCen(DescribeGrantRulesToCenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGrantRulesToCenWithOptions(request, runtime);
    }

    public DescribePublishedRouteEntriesResponse describePublishedRouteEntriesWithOptions(DescribePublishedRouteEntriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenId", request.cenId);
        query.put("ChildInstanceId", request.childInstanceId);
        query.put("ChildInstanceRegionId", request.childInstanceRegionId);
        query.put("ChildInstanceRouteTableId", request.childInstanceRouteTableId);
        query.put("ChildInstanceType", request.childInstanceType);
        query.put("DestinationCidrBlock", request.destinationCidrBlock);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePublishedRouteEntries"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePublishedRouteEntriesResponse());
    }

    public DescribePublishedRouteEntriesResponse describePublishedRouteEntries(DescribePublishedRouteEntriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePublishedRouteEntriesWithOptions(request, runtime);
    }

    public DescribeRouteConflictResponse describeRouteConflictWithOptions(DescribeRouteConflictRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ChildInstanceId", request.childInstanceId);
        query.put("ChildInstanceRegionId", request.childInstanceRegionId);
        query.put("ChildInstanceRouteTableId", request.childInstanceRouteTableId);
        query.put("ChildInstanceType", request.childInstanceType);
        query.put("DestinationCidrBlock", request.destinationCidrBlock);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRouteConflict"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRouteConflictResponse());
    }

    public DescribeRouteConflictResponse describeRouteConflict(DescribeRouteConflictRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRouteConflictWithOptions(request, runtime);
    }

    public DescribeRouteServicesInCenResponse describeRouteServicesInCenWithOptions(DescribeRouteServicesInCenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccessRegionId", request.accessRegionId);
        query.put("CenId", request.cenId);
        query.put("Host", request.host);
        query.put("HostRegionId", request.hostRegionId);
        query.put("HostVpcId", request.hostVpcId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRouteServicesInCen"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRouteServicesInCenResponse());
    }

    public DescribeRouteServicesInCenResponse describeRouteServicesInCen(DescribeRouteServicesInCenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRouteServicesInCenWithOptions(request, runtime);
    }

    public DetachCenChildInstanceResponse detachCenChildInstanceWithOptions(DetachCenChildInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenId", request.cenId);
        query.put("CenOwnerId", request.cenOwnerId);
        query.put("ChildInstanceId", request.childInstanceId);
        query.put("ChildInstanceOwnerId", request.childInstanceOwnerId);
        query.put("ChildInstanceRegionId", request.childInstanceRegionId);
        query.put("ChildInstanceType", request.childInstanceType);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachCenChildInstance"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachCenChildInstanceResponse());
    }

    public DetachCenChildInstanceResponse detachCenChildInstance(DetachCenChildInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detachCenChildInstanceWithOptions(request, runtime);
    }

    public DisableCenVbrHealthCheckResponse disableCenVbrHealthCheckWithOptions(DisableCenVbrHealthCheckRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenId", request.cenId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("VbrInstanceId", request.vbrInstanceId);
        query.put("VbrInstanceOwnerId", request.vbrInstanceOwnerId);
        query.put("VbrInstanceRegionId", request.vbrInstanceRegionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableCenVbrHealthCheck"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableCenVbrHealthCheckResponse());
    }

    public DisableCenVbrHealthCheckResponse disableCenVbrHealthCheck(DisableCenVbrHealthCheckRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableCenVbrHealthCheckWithOptions(request, runtime);
    }

    public DisableTransitRouterRouteTablePropagationResponse disableTransitRouterRouteTablePropagationWithOptions(DisableTransitRouterRouteTablePropagationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        query.put("TransitRouterRouteTableId", request.transitRouterRouteTableId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableTransitRouterRouteTablePropagation"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableTransitRouterRouteTablePropagationResponse());
    }

    public DisableTransitRouterRouteTablePropagationResponse disableTransitRouterRouteTablePropagation(DisableTransitRouterRouteTablePropagationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableTransitRouterRouteTablePropagationWithOptions(request, runtime);
    }

    public DissociateTransitRouterAttachmentFromRouteTableResponse dissociateTransitRouterAttachmentFromRouteTableWithOptions(DissociateTransitRouterAttachmentFromRouteTableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        query.put("TransitRouterRouteTableId", request.transitRouterRouteTableId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DissociateTransitRouterAttachmentFromRouteTable"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DissociateTransitRouterAttachmentFromRouteTableResponse());
    }

    public DissociateTransitRouterAttachmentFromRouteTableResponse dissociateTransitRouterAttachmentFromRouteTable(DissociateTransitRouterAttachmentFromRouteTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.dissociateTransitRouterAttachmentFromRouteTableWithOptions(request, runtime);
    }

    public EnableCenVbrHealthCheckResponse enableCenVbrHealthCheckWithOptions(EnableCenVbrHealthCheckRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenId", request.cenId);
        query.put("HealthCheckInterval", request.healthCheckInterval);
        query.put("HealthCheckOnly", request.healthCheckOnly);
        query.put("HealthCheckSourceIp", request.healthCheckSourceIp);
        query.put("HealthCheckTargetIp", request.healthCheckTargetIp);
        query.put("HealthyThreshold", request.healthyThreshold);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("VbrInstanceId", request.vbrInstanceId);
        query.put("VbrInstanceOwnerId", request.vbrInstanceOwnerId);
        query.put("VbrInstanceRegionId", request.vbrInstanceRegionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableCenVbrHealthCheck"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableCenVbrHealthCheckResponse());
    }

    public EnableCenVbrHealthCheckResponse enableCenVbrHealthCheck(EnableCenVbrHealthCheckRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableCenVbrHealthCheckWithOptions(request, runtime);
    }

    public EnableTransitRouterRouteTablePropagationResponse enableTransitRouterRouteTablePropagationWithOptions(EnableTransitRouterRouteTablePropagationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        query.put("TransitRouterRouteTableId", request.transitRouterRouteTableId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableTransitRouterRouteTablePropagation"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableTransitRouterRouteTablePropagationResponse());
    }

    public EnableTransitRouterRouteTablePropagationResponse enableTransitRouterRouteTablePropagation(EnableTransitRouterRouteTablePropagationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableTransitRouterRouteTablePropagationWithOptions(request, runtime);
    }

    public GrantInstanceToTransitRouterResponse grantInstanceToTransitRouterWithOptions(GrantInstanceToTransitRouterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenId", request.cenId);
        query.put("CenOwnerId", request.cenOwnerId);
        query.put("InstanceId", request.instanceId);
        query.put("InstanceType", request.instanceType);
        query.put("OrderType", request.orderType);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GrantInstanceToTransitRouter"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrantInstanceToTransitRouterResponse());
    }

    public GrantInstanceToTransitRouterResponse grantInstanceToTransitRouter(GrantInstanceToTransitRouterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.grantInstanceToTransitRouterWithOptions(request, runtime);
    }

    public ListCenInterRegionTrafficQosPoliciesResponse listCenInterRegionTrafficQosPoliciesWithOptions(ListCenInterRegionTrafficQosPoliciesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TrafficQosPolicyDescription", request.trafficQosPolicyDescription);
        query.put("TrafficQosPolicyId", request.trafficQosPolicyId);
        query.put("TrafficQosPolicyName", request.trafficQosPolicyName);
        query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        query.put("TransitRouterId", request.transitRouterId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCenInterRegionTrafficQosPolicies"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCenInterRegionTrafficQosPoliciesResponse());
    }

    public ListCenInterRegionTrafficQosPoliciesResponse listCenInterRegionTrafficQosPolicies(ListCenInterRegionTrafficQosPoliciesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCenInterRegionTrafficQosPoliciesWithOptions(request, runtime);
    }

    public ListGrantVSwitchesToCenResponse listGrantVSwitchesToCenWithOptions(ListGrantVSwitchesToCenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenId", request.cenId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("VpcId", request.vpcId);
        query.put("ZoneId", request.zoneId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGrantVSwitchesToCen"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGrantVSwitchesToCenResponse());
    }

    public ListGrantVSwitchesToCenResponse listGrantVSwitchesToCen(ListGrantVSwitchesToCenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listGrantVSwitchesToCenWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("NextToken", request.nextToken);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("PageSize", request.pageSize);
        query.put("ResourceId", request.resourceId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("ResourceType", request.resourceType);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public ListTrafficMarkingPoliciesResponse listTrafficMarkingPoliciesWithOptions(ListTrafficMarkingPoliciesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TrafficMarkingPolicyDescription", request.trafficMarkingPolicyDescription);
        query.put("TrafficMarkingPolicyId", request.trafficMarkingPolicyId);
        query.put("TrafficMarkingPolicyName", request.trafficMarkingPolicyName);
        query.put("TransitRouterId", request.transitRouterId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTrafficMarkingPolicies"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTrafficMarkingPoliciesResponse());
    }

    public ListTrafficMarkingPoliciesResponse listTrafficMarkingPolicies(ListTrafficMarkingPoliciesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTrafficMarkingPoliciesWithOptions(request, runtime);
    }

    public ListTransitRouterAvailableResourceResponse listTransitRouterAvailableResourceWithOptions(ListTransitRouterAvailableResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTransitRouterAvailableResource"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRouterAvailableResourceResponse());
    }

    public ListTransitRouterAvailableResourceResponse listTransitRouterAvailableResource(ListTransitRouterAvailableResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTransitRouterAvailableResourceWithOptions(request, runtime);
    }

    public ListTransitRouterPeerAttachmentsResponse listTransitRouterPeerAttachmentsWithOptions(ListTransitRouterPeerAttachmentsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenId", request.cenId);
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        query.put("TransitRouterId", request.transitRouterId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTransitRouterPeerAttachments"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRouterPeerAttachmentsResponse());
    }

    public ListTransitRouterPeerAttachmentsResponse listTransitRouterPeerAttachments(ListTransitRouterPeerAttachmentsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTransitRouterPeerAttachmentsWithOptions(request, runtime);
    }

    public ListTransitRouterRouteEntriesResponse listTransitRouterRouteEntriesWithOptions(ListTransitRouterRouteEntriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TransitRouterRouteEntryDestinationCidrBlock", request.transitRouterRouteEntryDestinationCidrBlock);
        query.put("TransitRouterRouteEntryIds", request.transitRouterRouteEntryIds);
        query.put("TransitRouterRouteEntryNames", request.transitRouterRouteEntryNames);
        query.put("TransitRouterRouteEntryStatus", request.transitRouterRouteEntryStatus);
        query.put("TransitRouterRouteTableId", request.transitRouterRouteTableId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTransitRouterRouteEntries"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRouterRouteEntriesResponse());
    }

    public ListTransitRouterRouteEntriesResponse listTransitRouterRouteEntries(ListTransitRouterRouteEntriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTransitRouterRouteEntriesWithOptions(request, runtime);
    }

    public ListTransitRouterRouteTableAssociationsResponse listTransitRouterRouteTableAssociationsWithOptions(ListTransitRouterRouteTableAssociationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        query.put("TransitRouterRouteTableId", request.transitRouterRouteTableId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTransitRouterRouteTableAssociations"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRouterRouteTableAssociationsResponse());
    }

    public ListTransitRouterRouteTableAssociationsResponse listTransitRouterRouteTableAssociations(ListTransitRouterRouteTableAssociationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTransitRouterRouteTableAssociationsWithOptions(request, runtime);
    }

    public ListTransitRouterRouteTablePropagationsResponse listTransitRouterRouteTablePropagationsWithOptions(ListTransitRouterRouteTablePropagationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        query.put("TransitRouterRouteTableId", request.transitRouterRouteTableId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTransitRouterRouteTablePropagations"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRouterRouteTablePropagationsResponse());
    }

    public ListTransitRouterRouteTablePropagationsResponse listTransitRouterRouteTablePropagations(ListTransitRouterRouteTablePropagationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTransitRouterRouteTablePropagationsWithOptions(request, runtime);
    }

    public ListTransitRouterRouteTablesResponse listTransitRouterRouteTablesWithOptions(ListTransitRouterRouteTablesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TransitRouterId", request.transitRouterId);
        query.put("TransitRouterRouteTableIds", request.transitRouterRouteTableIds);
        query.put("TransitRouterRouteTableNames", request.transitRouterRouteTableNames);
        query.put("TransitRouterRouteTableStatus", request.transitRouterRouteTableStatus);
        query.put("TransitRouterRouteTableType", request.transitRouterRouteTableType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTransitRouterRouteTables"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRouterRouteTablesResponse());
    }

    public ListTransitRouterRouteTablesResponse listTransitRouterRouteTables(ListTransitRouterRouteTablesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTransitRouterRouteTablesWithOptions(request, runtime);
    }

    public ListTransitRouterVbrAttachmentsResponse listTransitRouterVbrAttachmentsWithOptions(ListTransitRouterVbrAttachmentsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenId", request.cenId);
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        query.put("TransitRouterId", request.transitRouterId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTransitRouterVbrAttachments"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRouterVbrAttachmentsResponse());
    }

    public ListTransitRouterVbrAttachmentsResponse listTransitRouterVbrAttachments(ListTransitRouterVbrAttachmentsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTransitRouterVbrAttachmentsWithOptions(request, runtime);
    }

    public ListTransitRouterVpcAttachmentsResponse listTransitRouterVpcAttachmentsWithOptions(ListTransitRouterVpcAttachmentsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenId", request.cenId);
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        query.put("TransitRouterId", request.transitRouterId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTransitRouterVpcAttachments"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRouterVpcAttachmentsResponse());
    }

    public ListTransitRouterVpcAttachmentsResponse listTransitRouterVpcAttachments(ListTransitRouterVpcAttachmentsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTransitRouterVpcAttachmentsWithOptions(request, runtime);
    }

    public ListTransitRoutersResponse listTransitRoutersWithOptions(ListTransitRoutersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenId", request.cenId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TransitRouterId", request.transitRouterId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTransitRouters"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRoutersResponse());
    }

    public ListTransitRoutersResponse listTransitRouters(ListTransitRoutersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTransitRoutersWithOptions(request, runtime);
    }

    public ModifyCenAttributeResponse modifyCenAttributeWithOptions(ModifyCenAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenId", request.cenId);
        query.put("Description", request.description);
        query.put("Name", request.name);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ProtectionLevel", request.protectionLevel);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCenAttribute"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCenAttributeResponse());
    }

    public ModifyCenAttributeResponse modifyCenAttribute(ModifyCenAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyCenAttributeWithOptions(request, runtime);
    }

    public ModifyCenBandwidthPackageAttributeResponse modifyCenBandwidthPackageAttributeWithOptions(ModifyCenBandwidthPackageAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenBandwidthPackageId", request.cenBandwidthPackageId);
        query.put("Description", request.description);
        query.put("Name", request.name);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCenBandwidthPackageAttribute"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCenBandwidthPackageAttributeResponse());
    }

    public ModifyCenBandwidthPackageAttributeResponse modifyCenBandwidthPackageAttribute(ModifyCenBandwidthPackageAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyCenBandwidthPackageAttributeWithOptions(request, runtime);
    }

    public ModifyCenBandwidthPackageSpecResponse modifyCenBandwidthPackageSpecWithOptions(ModifyCenBandwidthPackageSpecRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Bandwidth", request.bandwidth);
        query.put("CenBandwidthPackageId", request.cenBandwidthPackageId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCenBandwidthPackageSpec"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCenBandwidthPackageSpecResponse());
    }

    public ModifyCenBandwidthPackageSpecResponse modifyCenBandwidthPackageSpec(ModifyCenBandwidthPackageSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyCenBandwidthPackageSpecWithOptions(request, runtime);
    }

    public ModifyCenRouteMapResponse modifyCenRouteMapWithOptions(ModifyCenRouteMapRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AsPathMatchMode", request.asPathMatchMode);
        query.put("CenId", request.cenId);
        query.put("CenRegionId", request.cenRegionId);
        query.put("CidrMatchMode", request.cidrMatchMode);
        query.put("CommunityMatchMode", request.communityMatchMode);
        query.put("CommunityOperateMode", request.communityOperateMode);
        query.put("Description", request.description);
        query.put("DestinationChildInstanceTypes", request.destinationChildInstanceTypes);
        query.put("DestinationCidrBlocks", request.destinationCidrBlocks);
        query.put("DestinationInstanceIds", request.destinationInstanceIds);
        query.put("DestinationInstanceIdsReverseMatch", request.destinationInstanceIdsReverseMatch);
        query.put("DestinationRouteTableIds", request.destinationRouteTableIds);
        query.put("MapResult", request.mapResult);
        query.put("MatchAsns", request.matchAsns);
        query.put("MatchCommunitySet", request.matchCommunitySet);
        query.put("NextPriority", request.nextPriority);
        query.put("OperateCommunitySet", request.operateCommunitySet);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("Preference", request.preference);
        query.put("PrependAsPath", request.prependAsPath);
        query.put("Priority", request.priority);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RouteMapId", request.routeMapId);
        query.put("RouteTypes", request.routeTypes);
        query.put("SourceChildInstanceTypes", request.sourceChildInstanceTypes);
        query.put("SourceInstanceIds", request.sourceInstanceIds);
        query.put("SourceInstanceIdsReverseMatch", request.sourceInstanceIdsReverseMatch);
        query.put("SourceRegionIds", request.sourceRegionIds);
        query.put("SourceRouteTableIds", request.sourceRouteTableIds);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCenRouteMap"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCenRouteMapResponse());
    }

    public ModifyCenRouteMapResponse modifyCenRouteMap(ModifyCenRouteMapRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyCenRouteMapWithOptions(request, runtime);
    }

    public ModifyFlowLogAttributeResponse modifyFlowLogAttributeWithOptions(ModifyFlowLogAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenId", request.cenId);
        query.put("ClientToken", request.clientToken);
        query.put("Description", request.description);
        query.put("FlowLogId", request.flowLogId);
        query.put("FlowLogName", request.flowLogName);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyFlowLogAttribute"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyFlowLogAttributeResponse());
    }

    public ModifyFlowLogAttributeResponse modifyFlowLogAttribute(ModifyFlowLogAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyFlowLogAttributeWithOptions(request, runtime);
    }

    public MoveResourceGroupResponse moveResourceGroupWithOptions(MoveResourceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("NewResourceGroupId", request.newResourceGroupId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceId", request.resourceId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("ResourceType", request.resourceType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveResourceGroup"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MoveResourceGroupResponse());
    }

    public MoveResourceGroupResponse moveResourceGroup(MoveResourceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.moveResourceGroupWithOptions(request, runtime);
    }

    public OpenTransitRouterServiceResponse openTransitRouterServiceWithOptions(OpenTransitRouterServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenTransitRouterService"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenTransitRouterServiceResponse());
    }

    public OpenTransitRouterServiceResponse openTransitRouterService(OpenTransitRouterServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.openTransitRouterServiceWithOptions(request, runtime);
    }

    public PublishRouteEntriesResponse publishRouteEntriesWithOptions(PublishRouteEntriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenId", request.cenId);
        query.put("ChildInstanceId", request.childInstanceId);
        query.put("ChildInstanceRegionId", request.childInstanceRegionId);
        query.put("ChildInstanceRouteTableId", request.childInstanceRouteTableId);
        query.put("ChildInstanceType", request.childInstanceType);
        query.put("DestinationCidrBlock", request.destinationCidrBlock);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishRouteEntries"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishRouteEntriesResponse());
    }

    public PublishRouteEntriesResponse publishRouteEntries(PublishRouteEntriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.publishRouteEntriesWithOptions(request, runtime);
    }

    public RemoveTraficMatchRuleFromTrafficMarkingPolicyResponse removeTraficMatchRuleFromTrafficMarkingPolicyWithOptions(RemoveTraficMatchRuleFromTrafficMarkingPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TrafficMarkRuleIds", request.trafficMarkRuleIds);
        query.put("TrafficMarkingPolicyId", request.trafficMarkingPolicyId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveTraficMatchRuleFromTrafficMarkingPolicy"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveTraficMatchRuleFromTrafficMarkingPolicyResponse());
    }

    public RemoveTraficMatchRuleFromTrafficMarkingPolicyResponse removeTraficMatchRuleFromTrafficMarkingPolicy(RemoveTraficMatchRuleFromTrafficMarkingPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeTraficMatchRuleFromTrafficMarkingPolicyWithOptions(request, runtime);
    }

    public ReplaceTransitRouterRouteTableAssociationResponse replaceTransitRouterRouteTableAssociationWithOptions(ReplaceTransitRouterRouteTableAssociationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        query.put("TransitRouterRouteTableId", request.transitRouterRouteTableId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReplaceTransitRouterRouteTableAssociation"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReplaceTransitRouterRouteTableAssociationResponse());
    }

    public ReplaceTransitRouterRouteTableAssociationResponse replaceTransitRouterRouteTableAssociation(ReplaceTransitRouterRouteTableAssociationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.replaceTransitRouterRouteTableAssociationWithOptions(request, runtime);
    }

    public ResolveAndRouteServiceInCenResponse resolveAndRouteServiceInCenWithOptions(ResolveAndRouteServiceInCenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccessRegionIds", request.accessRegionIds);
        query.put("CenId", request.cenId);
        query.put("ClientToken", request.clientToken);
        query.put("Description", request.description);
        query.put("Host", request.host);
        query.put("HostRegionId", request.hostRegionId);
        query.put("HostVpcId", request.hostVpcId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResolveAndRouteServiceInCen"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResolveAndRouteServiceInCenResponse());
    }

    public ResolveAndRouteServiceInCenResponse resolveAndRouteServiceInCen(ResolveAndRouteServiceInCenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resolveAndRouteServiceInCenWithOptions(request, runtime);
    }

    public RevokeInstanceFromTransitRouterResponse revokeInstanceFromTransitRouterWithOptions(RevokeInstanceFromTransitRouterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenId", request.cenId);
        query.put("CenOwnerId", request.cenOwnerId);
        query.put("InstanceId", request.instanceId);
        query.put("InstanceType", request.instanceType);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeInstanceFromTransitRouter"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeInstanceFromTransitRouterResponse());
    }

    public RevokeInstanceFromTransitRouterResponse revokeInstanceFromTransitRouter(RevokeInstanceFromTransitRouterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.revokeInstanceFromTransitRouterWithOptions(request, runtime);
    }

    public RoutePrivateZoneInCenToVpcResponse routePrivateZoneInCenToVpcWithOptions(RoutePrivateZoneInCenToVpcRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccessRegionId", request.accessRegionId);
        query.put("CenId", request.cenId);
        query.put("HostRegionId", request.hostRegionId);
        query.put("HostVpcId", request.hostVpcId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RoutePrivateZoneInCenToVpc"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RoutePrivateZoneInCenToVpcResponse());
    }

    public RoutePrivateZoneInCenToVpcResponse routePrivateZoneInCenToVpc(RoutePrivateZoneInCenToVpcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.routePrivateZoneInCenToVpcWithOptions(request, runtime);
    }

    public SetCenInterRegionBandwidthLimitResponse setCenInterRegionBandwidthLimitWithOptions(SetCenInterRegionBandwidthLimitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BandwidthLimit", request.bandwidthLimit);
        query.put("CenId", request.cenId);
        query.put("LocalRegionId", request.localRegionId);
        query.put("OppositeRegionId", request.oppositeRegionId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetCenInterRegionBandwidthLimit"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetCenInterRegionBandwidthLimitResponse());
    }

    public SetCenInterRegionBandwidthLimitResponse setCenInterRegionBandwidthLimit(SetCenInterRegionBandwidthLimitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setCenInterRegionBandwidthLimitWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceId", request.resourceId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("ResourceType", request.resourceType);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public TempUpgradeCenBandwidthPackageSpecResponse tempUpgradeCenBandwidthPackageSpecWithOptions(TempUpgradeCenBandwidthPackageSpecRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Bandwidth", request.bandwidth);
        query.put("CenBandwidthPackageId", request.cenBandwidthPackageId);
        query.put("EndTime", request.endTime);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TempUpgradeCenBandwidthPackageSpec"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TempUpgradeCenBandwidthPackageSpecResponse());
    }

    public TempUpgradeCenBandwidthPackageSpecResponse tempUpgradeCenBandwidthPackageSpec(TempUpgradeCenBandwidthPackageSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tempUpgradeCenBandwidthPackageSpecWithOptions(request, runtime);
    }

    public UnassociateCenBandwidthPackageResponse unassociateCenBandwidthPackageWithOptions(UnassociateCenBandwidthPackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenBandwidthPackageId", request.cenBandwidthPackageId);
        query.put("CenId", request.cenId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnassociateCenBandwidthPackage"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnassociateCenBandwidthPackageResponse());
    }

    public UnassociateCenBandwidthPackageResponse unassociateCenBandwidthPackage(UnassociateCenBandwidthPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unassociateCenBandwidthPackageWithOptions(request, runtime);
    }

    public UnroutePrivateZoneInCenToVpcResponse unroutePrivateZoneInCenToVpcWithOptions(UnroutePrivateZoneInCenToVpcRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccessRegionId", request.accessRegionId);
        query.put("CenId", request.cenId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnroutePrivateZoneInCenToVpc"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnroutePrivateZoneInCenToVpcResponse());
    }

    public UnroutePrivateZoneInCenToVpcResponse unroutePrivateZoneInCenToVpc(UnroutePrivateZoneInCenToVpcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unroutePrivateZoneInCenToVpcWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("All", request.all);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceId", request.resourceId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("ResourceType", request.resourceType);
        query.put("TagKey", request.tagKey);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    public UpdateCenInterRegionTrafficQosPolicyAttributeResponse updateCenInterRegionTrafficQosPolicyAttributeWithOptions(UpdateCenInterRegionTrafficQosPolicyAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TrafficQosPolicyDescription", request.trafficQosPolicyDescription);
        query.put("TrafficQosPolicyId", request.trafficQosPolicyId);
        query.put("TrafficQosPolicyName", request.trafficQosPolicyName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCenInterRegionTrafficQosPolicyAttribute"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCenInterRegionTrafficQosPolicyAttributeResponse());
    }

    public UpdateCenInterRegionTrafficQosPolicyAttributeResponse updateCenInterRegionTrafficQosPolicyAttribute(UpdateCenInterRegionTrafficQosPolicyAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCenInterRegionTrafficQosPolicyAttributeWithOptions(request, runtime);
    }

    public UpdateCenInterRegionTrafficQosQueueAttributeResponse updateCenInterRegionTrafficQosQueueAttributeWithOptions(UpdateCenInterRegionTrafficQosQueueAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("Dscps", request.dscps);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("QosQueueDescription", request.qosQueueDescription);
        query.put("QosQueueId", request.qosQueueId);
        query.put("QosQueueName", request.qosQueueName);
        query.put("RemainBandwidthPercent", request.remainBandwidthPercent);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCenInterRegionTrafficQosQueueAttribute"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCenInterRegionTrafficQosQueueAttributeResponse());
    }

    public UpdateCenInterRegionTrafficQosQueueAttributeResponse updateCenInterRegionTrafficQosQueueAttribute(UpdateCenInterRegionTrafficQosQueueAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCenInterRegionTrafficQosQueueAttributeWithOptions(request, runtime);
    }

    public UpdateTrafficMarkingPolicyAttributeResponse updateTrafficMarkingPolicyAttributeWithOptions(UpdateTrafficMarkingPolicyAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TrafficMarkingPolicyDescription", request.trafficMarkingPolicyDescription);
        query.put("TrafficMarkingPolicyId", request.trafficMarkingPolicyId);
        query.put("TrafficMarkingPolicyName", request.trafficMarkingPolicyName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTrafficMarkingPolicyAttribute"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTrafficMarkingPolicyAttributeResponse());
    }

    public UpdateTrafficMarkingPolicyAttributeResponse updateTrafficMarkingPolicyAttribute(UpdateTrafficMarkingPolicyAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateTrafficMarkingPolicyAttributeWithOptions(request, runtime);
    }

    public UpdateTransitRouterResponse updateTransitRouterWithOptions(UpdateTransitRouterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TransitRouterDescription", request.transitRouterDescription);
        query.put("TransitRouterId", request.transitRouterId);
        query.put("TransitRouterName", request.transitRouterName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTransitRouter"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTransitRouterResponse());
    }

    public UpdateTransitRouterResponse updateTransitRouter(UpdateTransitRouterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateTransitRouterWithOptions(request, runtime);
    }

    public UpdateTransitRouterPeerAttachmentAttributeResponse updateTransitRouterPeerAttachmentAttributeWithOptions(UpdateTransitRouterPeerAttachmentAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AutoPublishRouteEnabled", request.autoPublishRouteEnabled);
        query.put("Bandwidth", request.bandwidth);
        query.put("BandwidthType", request.bandwidthType);
        query.put("CenBandwidthPackageId", request.cenBandwidthPackageId);
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TransitRouterAttachmentDescription", request.transitRouterAttachmentDescription);
        query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        query.put("TransitRouterAttachmentName", request.transitRouterAttachmentName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTransitRouterPeerAttachmentAttribute"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTransitRouterPeerAttachmentAttributeResponse());
    }

    public UpdateTransitRouterPeerAttachmentAttributeResponse updateTransitRouterPeerAttachmentAttribute(UpdateTransitRouterPeerAttachmentAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateTransitRouterPeerAttachmentAttributeWithOptions(request, runtime);
    }

    public UpdateTransitRouterRouteEntryResponse updateTransitRouterRouteEntryWithOptions(UpdateTransitRouterRouteEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TransitRouterRouteEntryDescription", request.transitRouterRouteEntryDescription);
        query.put("TransitRouterRouteEntryId", request.transitRouterRouteEntryId);
        query.put("TransitRouterRouteEntryName", request.transitRouterRouteEntryName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTransitRouterRouteEntry"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTransitRouterRouteEntryResponse());
    }

    public UpdateTransitRouterRouteEntryResponse updateTransitRouterRouteEntry(UpdateTransitRouterRouteEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateTransitRouterRouteEntryWithOptions(request, runtime);
    }

    public UpdateTransitRouterRouteTableResponse updateTransitRouterRouteTableWithOptions(UpdateTransitRouterRouteTableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TransitRouterRouteTableDescription", request.transitRouterRouteTableDescription);
        query.put("TransitRouterRouteTableId", request.transitRouterRouteTableId);
        query.put("TransitRouterRouteTableName", request.transitRouterRouteTableName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTransitRouterRouteTable"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTransitRouterRouteTableResponse());
    }

    public UpdateTransitRouterRouteTableResponse updateTransitRouterRouteTable(UpdateTransitRouterRouteTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateTransitRouterRouteTableWithOptions(request, runtime);
    }

    public UpdateTransitRouterVbrAttachmentAttributeResponse updateTransitRouterVbrAttachmentAttributeWithOptions(UpdateTransitRouterVbrAttachmentAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TransitRouterAttachmentDescription", request.transitRouterAttachmentDescription);
        query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        query.put("TransitRouterAttachmentName", request.transitRouterAttachmentName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTransitRouterVbrAttachmentAttribute"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTransitRouterVbrAttachmentAttributeResponse());
    }

    public UpdateTransitRouterVbrAttachmentAttributeResponse updateTransitRouterVbrAttachmentAttribute(UpdateTransitRouterVbrAttachmentAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateTransitRouterVbrAttachmentAttributeWithOptions(request, runtime);
    }

    public UpdateTransitRouterVpcAttachmentAttributeResponse updateTransitRouterVpcAttachmentAttributeWithOptions(UpdateTransitRouterVpcAttachmentAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TransitRouterAttachmentDescription", request.transitRouterAttachmentDescription);
        query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        query.put("TransitRouterAttachmentName", request.transitRouterAttachmentName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTransitRouterVpcAttachmentAttribute"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTransitRouterVpcAttachmentAttributeResponse());
    }

    public UpdateTransitRouterVpcAttachmentAttributeResponse updateTransitRouterVpcAttachmentAttribute(UpdateTransitRouterVpcAttachmentAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateTransitRouterVpcAttachmentAttributeWithOptions(request, runtime);
    }

    public WithdrawPublishedRouteEntriesResponse withdrawPublishedRouteEntriesWithOptions(WithdrawPublishedRouteEntriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenId", request.cenId);
        query.put("ChildInstanceId", request.childInstanceId);
        query.put("ChildInstanceRegionId", request.childInstanceRegionId);
        query.put("ChildInstanceRouteTableId", request.childInstanceRouteTableId);
        query.put("ChildInstanceType", request.childInstanceType);
        query.put("DestinationCidrBlock", request.destinationCidrBlock);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "WithdrawPublishedRouteEntries"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new WithdrawPublishedRouteEntriesResponse());
    }

    public WithdrawPublishedRouteEntriesResponse withdrawPublishedRouteEntries(WithdrawPublishedRouteEntriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.withdrawPublishedRouteEntriesWithOptions(request, runtime);
    }
}
