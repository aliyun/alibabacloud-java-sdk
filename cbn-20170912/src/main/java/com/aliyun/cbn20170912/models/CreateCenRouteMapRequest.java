// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateCenRouteMapRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("CenId")
    public String cenId;

    @NameInMap("CenRegionId")
    public String cenRegionId;

    @NameInMap("TransmitDirection")
    public String transmitDirection;

    @NameInMap("Description")
    public String description;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("MapResult")
    public String mapResult;

    @NameInMap("NextPriority")
    public Integer nextPriority;

    @NameInMap("CidrMatchMode")
    public String cidrMatchMode;

    @NameInMap("AsPathMatchMode")
    public String asPathMatchMode;

    @NameInMap("CommunityMatchMode")
    public String communityMatchMode;

    @NameInMap("CommunityOperateMode")
    public String communityOperateMode;

    @NameInMap("Preference")
    public Integer preference;

    @NameInMap("SourceInstanceIdsReverseMatch")
    public Boolean sourceInstanceIdsReverseMatch;

    @NameInMap("DestinationInstanceIdsReverseMatch")
    public Boolean destinationInstanceIdsReverseMatch;

    @NameInMap("GatewayZoneId")
    public String gatewayZoneId;

    @NameInMap("SystemPolicy")
    public Boolean systemPolicy;

    @NameInMap("MatchAddressType")
    public String matchAddressType;

    @NameInMap("SourceInstanceIds")
    public java.util.List<String> sourceInstanceIds;

    @NameInMap("DestinationInstanceIds")
    public java.util.List<String> destinationInstanceIds;

    @NameInMap("SourceRouteTableIds")
    public java.util.List<String> sourceRouteTableIds;

    @NameInMap("DestinationRouteTableIds")
    public java.util.List<String> destinationRouteTableIds;

    @NameInMap("SourceRegionIds")
    public java.util.List<String> sourceRegionIds;

    @NameInMap("SourceChildInstanceTypes")
    public java.util.List<String> sourceChildInstanceTypes;

    @NameInMap("DestinationChildInstanceTypes")
    public java.util.List<String> destinationChildInstanceTypes;

    @NameInMap("DestinationCidrBlocks")
    public java.util.List<String> destinationCidrBlocks;

    @NameInMap("RouteTypes")
    public java.util.List<String> routeTypes;

    @NameInMap("MatchAsns")
    public java.util.List<Integer> matchAsns;

    @NameInMap("MatchCommunitySet")
    public java.util.List<String> matchCommunitySet;

    @NameInMap("OperateCommunitySet")
    public java.util.List<String> operateCommunitySet;

    @NameInMap("PrependAsPath")
    public java.util.List<Integer> prependAsPath;

    @NameInMap("DestinationRegionIds")
    public java.util.List<String> destinationRegionIds;

    @NameInMap("SourceZoneIds")
    public java.util.List<String> sourceZoneIds;

    @NameInMap("OriginalRouteTableIds")
    public java.util.List<String> originalRouteTableIds;

    public static CreateCenRouteMapRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCenRouteMapRequest self = new CreateCenRouteMapRequest();
        return TeaModel.build(map, self);
    }

    public CreateCenRouteMapRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateCenRouteMapRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateCenRouteMapRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateCenRouteMapRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateCenRouteMapRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public CreateCenRouteMapRequest setCenRegionId(String cenRegionId) {
        this.cenRegionId = cenRegionId;
        return this;
    }
    public String getCenRegionId() {
        return this.cenRegionId;
    }

    public CreateCenRouteMapRequest setTransmitDirection(String transmitDirection) {
        this.transmitDirection = transmitDirection;
        return this;
    }
    public String getTransmitDirection() {
        return this.transmitDirection;
    }

    public CreateCenRouteMapRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCenRouteMapRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateCenRouteMapRequest setMapResult(String mapResult) {
        this.mapResult = mapResult;
        return this;
    }
    public String getMapResult() {
        return this.mapResult;
    }

    public CreateCenRouteMapRequest setNextPriority(Integer nextPriority) {
        this.nextPriority = nextPriority;
        return this;
    }
    public Integer getNextPriority() {
        return this.nextPriority;
    }

    public CreateCenRouteMapRequest setCidrMatchMode(String cidrMatchMode) {
        this.cidrMatchMode = cidrMatchMode;
        return this;
    }
    public String getCidrMatchMode() {
        return this.cidrMatchMode;
    }

    public CreateCenRouteMapRequest setAsPathMatchMode(String asPathMatchMode) {
        this.asPathMatchMode = asPathMatchMode;
        return this;
    }
    public String getAsPathMatchMode() {
        return this.asPathMatchMode;
    }

    public CreateCenRouteMapRequest setCommunityMatchMode(String communityMatchMode) {
        this.communityMatchMode = communityMatchMode;
        return this;
    }
    public String getCommunityMatchMode() {
        return this.communityMatchMode;
    }

    public CreateCenRouteMapRequest setCommunityOperateMode(String communityOperateMode) {
        this.communityOperateMode = communityOperateMode;
        return this;
    }
    public String getCommunityOperateMode() {
        return this.communityOperateMode;
    }

    public CreateCenRouteMapRequest setPreference(Integer preference) {
        this.preference = preference;
        return this;
    }
    public Integer getPreference() {
        return this.preference;
    }

    public CreateCenRouteMapRequest setSourceInstanceIdsReverseMatch(Boolean sourceInstanceIdsReverseMatch) {
        this.sourceInstanceIdsReverseMatch = sourceInstanceIdsReverseMatch;
        return this;
    }
    public Boolean getSourceInstanceIdsReverseMatch() {
        return this.sourceInstanceIdsReverseMatch;
    }

    public CreateCenRouteMapRequest setDestinationInstanceIdsReverseMatch(Boolean destinationInstanceIdsReverseMatch) {
        this.destinationInstanceIdsReverseMatch = destinationInstanceIdsReverseMatch;
        return this;
    }
    public Boolean getDestinationInstanceIdsReverseMatch() {
        return this.destinationInstanceIdsReverseMatch;
    }

    public CreateCenRouteMapRequest setGatewayZoneId(String gatewayZoneId) {
        this.gatewayZoneId = gatewayZoneId;
        return this;
    }
    public String getGatewayZoneId() {
        return this.gatewayZoneId;
    }

    public CreateCenRouteMapRequest setSystemPolicy(Boolean systemPolicy) {
        this.systemPolicy = systemPolicy;
        return this;
    }
    public Boolean getSystemPolicy() {
        return this.systemPolicy;
    }

    public CreateCenRouteMapRequest setMatchAddressType(String matchAddressType) {
        this.matchAddressType = matchAddressType;
        return this;
    }
    public String getMatchAddressType() {
        return this.matchAddressType;
    }

    public CreateCenRouteMapRequest setSourceInstanceIds(java.util.List<String> sourceInstanceIds) {
        this.sourceInstanceIds = sourceInstanceIds;
        return this;
    }
    public java.util.List<String> getSourceInstanceIds() {
        return this.sourceInstanceIds;
    }

    public CreateCenRouteMapRequest setDestinationInstanceIds(java.util.List<String> destinationInstanceIds) {
        this.destinationInstanceIds = destinationInstanceIds;
        return this;
    }
    public java.util.List<String> getDestinationInstanceIds() {
        return this.destinationInstanceIds;
    }

    public CreateCenRouteMapRequest setSourceRouteTableIds(java.util.List<String> sourceRouteTableIds) {
        this.sourceRouteTableIds = sourceRouteTableIds;
        return this;
    }
    public java.util.List<String> getSourceRouteTableIds() {
        return this.sourceRouteTableIds;
    }

    public CreateCenRouteMapRequest setDestinationRouteTableIds(java.util.List<String> destinationRouteTableIds) {
        this.destinationRouteTableIds = destinationRouteTableIds;
        return this;
    }
    public java.util.List<String> getDestinationRouteTableIds() {
        return this.destinationRouteTableIds;
    }

    public CreateCenRouteMapRequest setSourceRegionIds(java.util.List<String> sourceRegionIds) {
        this.sourceRegionIds = sourceRegionIds;
        return this;
    }
    public java.util.List<String> getSourceRegionIds() {
        return this.sourceRegionIds;
    }

    public CreateCenRouteMapRequest setSourceChildInstanceTypes(java.util.List<String> sourceChildInstanceTypes) {
        this.sourceChildInstanceTypes = sourceChildInstanceTypes;
        return this;
    }
    public java.util.List<String> getSourceChildInstanceTypes() {
        return this.sourceChildInstanceTypes;
    }

    public CreateCenRouteMapRequest setDestinationChildInstanceTypes(java.util.List<String> destinationChildInstanceTypes) {
        this.destinationChildInstanceTypes = destinationChildInstanceTypes;
        return this;
    }
    public java.util.List<String> getDestinationChildInstanceTypes() {
        return this.destinationChildInstanceTypes;
    }

    public CreateCenRouteMapRequest setDestinationCidrBlocks(java.util.List<String> destinationCidrBlocks) {
        this.destinationCidrBlocks = destinationCidrBlocks;
        return this;
    }
    public java.util.List<String> getDestinationCidrBlocks() {
        return this.destinationCidrBlocks;
    }

    public CreateCenRouteMapRequest setRouteTypes(java.util.List<String> routeTypes) {
        this.routeTypes = routeTypes;
        return this;
    }
    public java.util.List<String> getRouteTypes() {
        return this.routeTypes;
    }

    public CreateCenRouteMapRequest setMatchAsns(java.util.List<Integer> matchAsns) {
        this.matchAsns = matchAsns;
        return this;
    }
    public java.util.List<Integer> getMatchAsns() {
        return this.matchAsns;
    }

    public CreateCenRouteMapRequest setMatchCommunitySet(java.util.List<String> matchCommunitySet) {
        this.matchCommunitySet = matchCommunitySet;
        return this;
    }
    public java.util.List<String> getMatchCommunitySet() {
        return this.matchCommunitySet;
    }

    public CreateCenRouteMapRequest setOperateCommunitySet(java.util.List<String> operateCommunitySet) {
        this.operateCommunitySet = operateCommunitySet;
        return this;
    }
    public java.util.List<String> getOperateCommunitySet() {
        return this.operateCommunitySet;
    }

    public CreateCenRouteMapRequest setPrependAsPath(java.util.List<Integer> prependAsPath) {
        this.prependAsPath = prependAsPath;
        return this;
    }
    public java.util.List<Integer> getPrependAsPath() {
        return this.prependAsPath;
    }

    public CreateCenRouteMapRequest setDestinationRegionIds(java.util.List<String> destinationRegionIds) {
        this.destinationRegionIds = destinationRegionIds;
        return this;
    }
    public java.util.List<String> getDestinationRegionIds() {
        return this.destinationRegionIds;
    }

    public CreateCenRouteMapRequest setSourceZoneIds(java.util.List<String> sourceZoneIds) {
        this.sourceZoneIds = sourceZoneIds;
        return this;
    }
    public java.util.List<String> getSourceZoneIds() {
        return this.sourceZoneIds;
    }

    public CreateCenRouteMapRequest setOriginalRouteTableIds(java.util.List<String> originalRouteTableIds) {
        this.originalRouteTableIds = originalRouteTableIds;
        return this;
    }
    public java.util.List<String> getOriginalRouteTableIds() {
        return this.originalRouteTableIds;
    }

}
