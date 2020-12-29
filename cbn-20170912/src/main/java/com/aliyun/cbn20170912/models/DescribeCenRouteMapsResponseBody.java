// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenRouteMapsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RouteMaps")
    public java.util.List<DescribeCenRouteMapsResponseBodyRouteMaps> routeMaps;

    public static DescribeCenRouteMapsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenRouteMapsResponseBody self = new DescribeCenRouteMapsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCenRouteMapsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeCenRouteMapsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCenRouteMapsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCenRouteMapsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCenRouteMapsResponseBody setRouteMaps(java.util.List<DescribeCenRouteMapsResponseBodyRouteMaps> routeMaps) {
        this.routeMaps = routeMaps;
        return this;
    }
    public java.util.List<DescribeCenRouteMapsResponseBodyRouteMaps> getRouteMaps() {
        return this.routeMaps;
    }

    public static class DescribeCenRouteMapsResponseBodyRouteMaps extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("SourceInstanceIdsReverseMatch")
        public Boolean sourceInstanceIdsReverseMatch;

        @NameInMap("SourceRegionIds")
        public java.util.List<String> sourceRegionIds;

        @NameInMap("MatchCommunitySet")
        public java.util.List<String> matchCommunitySet;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("CommunityOperateMode")
        public String communityOperateMode;

        @NameInMap("PrependAsPath")
        public java.util.List<String> prependAsPath;

        @NameInMap("RouteTypes")
        public java.util.List<String> routeTypes;

        @NameInMap("Description")
        public String description;

        @NameInMap("DestinationInstanceIds")
        public java.util.List<String> destinationInstanceIds;

        @NameInMap("MatchAsns")
        public java.util.List<String> matchAsns;

        @NameInMap("DestinationInstanceIdsReverseMatch")
        public Boolean destinationInstanceIdsReverseMatch;

        @NameInMap("OperateCommunitySet")
        public java.util.List<String> operateCommunitySet;

        @NameInMap("NextPriority")
        public Integer nextPriority;

        @NameInMap("RouteMapId")
        public String routeMapId;

        @NameInMap("TransmitDirection")
        public String transmitDirection;

        @NameInMap("SourceChildInstanceTypes")
        public java.util.List<String> sourceChildInstanceTypes;

        @NameInMap("DestinationRouteTableIds")
        public java.util.List<String> destinationRouteTableIds;

        @NameInMap("SourceInstanceIds")
        public java.util.List<String> sourceInstanceIds;

        @NameInMap("CenRegionId")
        public String cenRegionId;

        @NameInMap("DestinationCidrBlocks")
        public java.util.List<String> destinationCidrBlocks;

        @NameInMap("CenId")
        public String cenId;

        @NameInMap("SourceRouteTableIds")
        public java.util.List<String> sourceRouteTableIds;

        @NameInMap("MapResult")
        public String mapResult;

        @NameInMap("CommunityMatchMode")
        public String communityMatchMode;

        @NameInMap("DestinationChildInstanceTypes")
        public java.util.List<String> destinationChildInstanceTypes;

        @NameInMap("AsPathMatchMode")
        public String asPathMatchMode;

        @NameInMap("Preference")
        public Integer preference;

        @NameInMap("CidrMatchMode")
        public String cidrMatchMode;

        public static DescribeCenRouteMapsResponseBodyRouteMaps build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMaps self = new DescribeCenRouteMapsResponseBodyRouteMaps();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMaps setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCenRouteMapsResponseBodyRouteMaps setSourceInstanceIdsReverseMatch(Boolean sourceInstanceIdsReverseMatch) {
            this.sourceInstanceIdsReverseMatch = sourceInstanceIdsReverseMatch;
            return this;
        }
        public Boolean getSourceInstanceIdsReverseMatch() {
            return this.sourceInstanceIdsReverseMatch;
        }

        public DescribeCenRouteMapsResponseBodyRouteMaps setSourceRegionIds(java.util.List<String> sourceRegionIds) {
            this.sourceRegionIds = sourceRegionIds;
            return this;
        }
        public java.util.List<String> getSourceRegionIds() {
            return this.sourceRegionIds;
        }

        public DescribeCenRouteMapsResponseBodyRouteMaps setMatchCommunitySet(java.util.List<String> matchCommunitySet) {
            this.matchCommunitySet = matchCommunitySet;
            return this;
        }
        public java.util.List<String> getMatchCommunitySet() {
            return this.matchCommunitySet;
        }

        public DescribeCenRouteMapsResponseBodyRouteMaps setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public DescribeCenRouteMapsResponseBodyRouteMaps setCommunityOperateMode(String communityOperateMode) {
            this.communityOperateMode = communityOperateMode;
            return this;
        }
        public String getCommunityOperateMode() {
            return this.communityOperateMode;
        }

        public DescribeCenRouteMapsResponseBodyRouteMaps setPrependAsPath(java.util.List<String> prependAsPath) {
            this.prependAsPath = prependAsPath;
            return this;
        }
        public java.util.List<String> getPrependAsPath() {
            return this.prependAsPath;
        }

        public DescribeCenRouteMapsResponseBodyRouteMaps setRouteTypes(java.util.List<String> routeTypes) {
            this.routeTypes = routeTypes;
            return this;
        }
        public java.util.List<String> getRouteTypes() {
            return this.routeTypes;
        }

        public DescribeCenRouteMapsResponseBodyRouteMaps setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCenRouteMapsResponseBodyRouteMaps setDestinationInstanceIds(java.util.List<String> destinationInstanceIds) {
            this.destinationInstanceIds = destinationInstanceIds;
            return this;
        }
        public java.util.List<String> getDestinationInstanceIds() {
            return this.destinationInstanceIds;
        }

        public DescribeCenRouteMapsResponseBodyRouteMaps setMatchAsns(java.util.List<String> matchAsns) {
            this.matchAsns = matchAsns;
            return this;
        }
        public java.util.List<String> getMatchAsns() {
            return this.matchAsns;
        }

        public DescribeCenRouteMapsResponseBodyRouteMaps setDestinationInstanceIdsReverseMatch(Boolean destinationInstanceIdsReverseMatch) {
            this.destinationInstanceIdsReverseMatch = destinationInstanceIdsReverseMatch;
            return this;
        }
        public Boolean getDestinationInstanceIdsReverseMatch() {
            return this.destinationInstanceIdsReverseMatch;
        }

        public DescribeCenRouteMapsResponseBodyRouteMaps setOperateCommunitySet(java.util.List<String> operateCommunitySet) {
            this.operateCommunitySet = operateCommunitySet;
            return this;
        }
        public java.util.List<String> getOperateCommunitySet() {
            return this.operateCommunitySet;
        }

        public DescribeCenRouteMapsResponseBodyRouteMaps setNextPriority(Integer nextPriority) {
            this.nextPriority = nextPriority;
            return this;
        }
        public Integer getNextPriority() {
            return this.nextPriority;
        }

        public DescribeCenRouteMapsResponseBodyRouteMaps setRouteMapId(String routeMapId) {
            this.routeMapId = routeMapId;
            return this;
        }
        public String getRouteMapId() {
            return this.routeMapId;
        }

        public DescribeCenRouteMapsResponseBodyRouteMaps setTransmitDirection(String transmitDirection) {
            this.transmitDirection = transmitDirection;
            return this;
        }
        public String getTransmitDirection() {
            return this.transmitDirection;
        }

        public DescribeCenRouteMapsResponseBodyRouteMaps setSourceChildInstanceTypes(java.util.List<String> sourceChildInstanceTypes) {
            this.sourceChildInstanceTypes = sourceChildInstanceTypes;
            return this;
        }
        public java.util.List<String> getSourceChildInstanceTypes() {
            return this.sourceChildInstanceTypes;
        }

        public DescribeCenRouteMapsResponseBodyRouteMaps setDestinationRouteTableIds(java.util.List<String> destinationRouteTableIds) {
            this.destinationRouteTableIds = destinationRouteTableIds;
            return this;
        }
        public java.util.List<String> getDestinationRouteTableIds() {
            return this.destinationRouteTableIds;
        }

        public DescribeCenRouteMapsResponseBodyRouteMaps setSourceInstanceIds(java.util.List<String> sourceInstanceIds) {
            this.sourceInstanceIds = sourceInstanceIds;
            return this;
        }
        public java.util.List<String> getSourceInstanceIds() {
            return this.sourceInstanceIds;
        }

        public DescribeCenRouteMapsResponseBodyRouteMaps setCenRegionId(String cenRegionId) {
            this.cenRegionId = cenRegionId;
            return this;
        }
        public String getCenRegionId() {
            return this.cenRegionId;
        }

        public DescribeCenRouteMapsResponseBodyRouteMaps setDestinationCidrBlocks(java.util.List<String> destinationCidrBlocks) {
            this.destinationCidrBlocks = destinationCidrBlocks;
            return this;
        }
        public java.util.List<String> getDestinationCidrBlocks() {
            return this.destinationCidrBlocks;
        }

        public DescribeCenRouteMapsResponseBodyRouteMaps setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public DescribeCenRouteMapsResponseBodyRouteMaps setSourceRouteTableIds(java.util.List<String> sourceRouteTableIds) {
            this.sourceRouteTableIds = sourceRouteTableIds;
            return this;
        }
        public java.util.List<String> getSourceRouteTableIds() {
            return this.sourceRouteTableIds;
        }

        public DescribeCenRouteMapsResponseBodyRouteMaps setMapResult(String mapResult) {
            this.mapResult = mapResult;
            return this;
        }
        public String getMapResult() {
            return this.mapResult;
        }

        public DescribeCenRouteMapsResponseBodyRouteMaps setCommunityMatchMode(String communityMatchMode) {
            this.communityMatchMode = communityMatchMode;
            return this;
        }
        public String getCommunityMatchMode() {
            return this.communityMatchMode;
        }

        public DescribeCenRouteMapsResponseBodyRouteMaps setDestinationChildInstanceTypes(java.util.List<String> destinationChildInstanceTypes) {
            this.destinationChildInstanceTypes = destinationChildInstanceTypes;
            return this;
        }
        public java.util.List<String> getDestinationChildInstanceTypes() {
            return this.destinationChildInstanceTypes;
        }

        public DescribeCenRouteMapsResponseBodyRouteMaps setAsPathMatchMode(String asPathMatchMode) {
            this.asPathMatchMode = asPathMatchMode;
            return this;
        }
        public String getAsPathMatchMode() {
            return this.asPathMatchMode;
        }

        public DescribeCenRouteMapsResponseBodyRouteMaps setPreference(Integer preference) {
            this.preference = preference;
            return this;
        }
        public Integer getPreference() {
            return this.preference;
        }

        public DescribeCenRouteMapsResponseBodyRouteMaps setCidrMatchMode(String cidrMatchMode) {
            this.cidrMatchMode = cidrMatchMode;
            return this;
        }
        public String getCidrMatchMode() {
            return this.cidrMatchMode;
        }

    }

}
