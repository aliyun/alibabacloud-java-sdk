// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenRouteMapsResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RouteMaps")
    public DescribeCenRouteMapsResponseBodyRouteMaps routeMaps;

    public static DescribeCenRouteMapsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenRouteMapsResponseBody self = new DescribeCenRouteMapsResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeCenRouteMapsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeCenRouteMapsResponseBody setRouteMaps(DescribeCenRouteMapsResponseBodyRouteMaps routeMaps) {
        this.routeMaps = routeMaps;
        return this;
    }
    public DescribeCenRouteMapsResponseBodyRouteMaps getRouteMaps() {
        return this.routeMaps;
    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRegionIds extends TeaModel {
        @NameInMap("SourceRegionId")
        public java.util.List<String> sourceRegionId;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRegionIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRegionIds self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRegionIds();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRegionIds setSourceRegionId(java.util.List<String> sourceRegionId) {
            this.sourceRegionId = sourceRegionId;
            return this;
        }
        public java.util.List<String> getSourceRegionId() {
            return this.sourceRegionId;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceChildInstanceTypes extends TeaModel {
        @NameInMap("SourceChildInstanceType")
        public java.util.List<String> sourceChildInstanceType;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceChildInstanceTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceChildInstanceTypes self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceChildInstanceTypes();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceChildInstanceTypes setSourceChildInstanceType(java.util.List<String> sourceChildInstanceType) {
            this.sourceChildInstanceType = sourceChildInstanceType;
            return this;
        }
        public java.util.List<String> getSourceChildInstanceType() {
            return this.sourceChildInstanceType;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationRouteTableIds extends TeaModel {
        @NameInMap("DestinationRouteTableId")
        public java.util.List<String> destinationRouteTableId;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationRouteTableIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationRouteTableIds self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationRouteTableIds();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationRouteTableIds setDestinationRouteTableId(java.util.List<String> destinationRouteTableId) {
            this.destinationRouteTableId = destinationRouteTableId;
            return this;
        }
        public java.util.List<String> getDestinationRouteTableId() {
            return this.destinationRouteTableId;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceInstanceIds extends TeaModel {
        @NameInMap("SourceInstanceId")
        public java.util.List<String> sourceInstanceId;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceInstanceIds self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceInstanceIds();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceInstanceIds setSourceInstanceId(java.util.List<String> sourceInstanceId) {
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }
        public java.util.List<String> getSourceInstanceId() {
            return this.sourceInstanceId;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationCidrBlocks extends TeaModel {
        @NameInMap("DestinationCidrBlock")
        public java.util.List<String> destinationCidrBlock;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationCidrBlocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationCidrBlocks self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationCidrBlocks();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationCidrBlocks setDestinationCidrBlock(java.util.List<String> destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public java.util.List<String> getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRouteTableIds extends TeaModel {
        @NameInMap("SourceRouteTableId")
        public java.util.List<String> sourceRouteTableId;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRouteTableIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRouteTableIds self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRouteTableIds();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRouteTableIds setSourceRouteTableId(java.util.List<String> sourceRouteTableId) {
            this.sourceRouteTableId = sourceRouteTableId;
            return this;
        }
        public java.util.List<String> getSourceRouteTableId() {
            return this.sourceRouteTableId;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchCommunitySet extends TeaModel {
        @NameInMap("MatchCommunity")
        public java.util.List<String> matchCommunity;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchCommunitySet build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchCommunitySet self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchCommunitySet();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchCommunitySet setMatchCommunity(java.util.List<String> matchCommunity) {
            this.matchCommunity = matchCommunity;
            return this;
        }
        public java.util.List<String> getMatchCommunity() {
            return this.matchCommunity;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMapPrependAsPath extends TeaModel {
        @NameInMap("AsPath")
        public java.util.List<String> asPath;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMapPrependAsPath build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMapPrependAsPath self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMapPrependAsPath();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapPrependAsPath setAsPath(java.util.List<String> asPath) {
            this.asPath = asPath;
            return this;
        }
        public java.util.List<String> getAsPath() {
            return this.asPath;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMapRouteTypes extends TeaModel {
        @NameInMap("RouteType")
        public java.util.List<String> routeType;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMapRouteTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMapRouteTypes self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMapRouteTypes();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapRouteTypes setRouteType(java.util.List<String> routeType) {
            this.routeType = routeType;
            return this;
        }
        public java.util.List<String> getRouteType() {
            return this.routeType;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationChildInstanceTypes extends TeaModel {
        @NameInMap("DestinationChildInstanceType")
        public java.util.List<String> destinationChildInstanceType;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationChildInstanceTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationChildInstanceTypes self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationChildInstanceTypes();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationChildInstanceTypes setDestinationChildInstanceType(java.util.List<String> destinationChildInstanceType) {
            this.destinationChildInstanceType = destinationChildInstanceType;
            return this;
        }
        public java.util.List<String> getDestinationChildInstanceType() {
            return this.destinationChildInstanceType;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationInstanceIds extends TeaModel {
        @NameInMap("DestinationInstanceId")
        public java.util.List<String> destinationInstanceId;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationInstanceIds self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationInstanceIds();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationInstanceIds setDestinationInstanceId(java.util.List<String> destinationInstanceId) {
            this.destinationInstanceId = destinationInstanceId;
            return this;
        }
        public java.util.List<String> getDestinationInstanceId() {
            return this.destinationInstanceId;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchAsns extends TeaModel {
        @NameInMap("MatchAsn")
        public java.util.List<String> matchAsn;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchAsns build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchAsns self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchAsns();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchAsns setMatchAsn(java.util.List<String> matchAsn) {
            this.matchAsn = matchAsn;
            return this;
        }
        public java.util.List<String> getMatchAsn() {
            return this.matchAsn;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMapOperateCommunitySet extends TeaModel {
        @NameInMap("OperateCommunity")
        public java.util.List<String> operateCommunity;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMapOperateCommunitySet build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMapOperateCommunitySet self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMapOperateCommunitySet();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapOperateCommunitySet setOperateCommunity(java.util.List<String> operateCommunity) {
            this.operateCommunity = operateCommunity;
            return this;
        }
        public java.util.List<String> getOperateCommunity() {
            return this.operateCommunity;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMap extends TeaModel {
        @NameInMap("RouteMapId")
        public String routeMapId;

        @NameInMap("Status")
        public String status;

        @NameInMap("TransmitDirection")
        public String transmitDirection;

        @NameInMap("SourceInstanceIdsReverseMatch")
        public Boolean sourceInstanceIdsReverseMatch;

        @NameInMap("CenRegionId")
        public String cenRegionId;

        @NameInMap("CenId")
        public String cenId;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("CommunityOperateMode")
        public String communityOperateMode;

        @NameInMap("MapResult")
        public String mapResult;

        @NameInMap("CommunityMatchMode")
        public String communityMatchMode;

        @NameInMap("Description")
        public String description;

        @NameInMap("AsPathMatchMode")
        public String asPathMatchMode;

        @NameInMap("Preference")
        public Integer preference;

        @NameInMap("DestinationInstanceIdsReverseMatch")
        public Boolean destinationInstanceIdsReverseMatch;

        @NameInMap("CidrMatchMode")
        public String cidrMatchMode;

        @NameInMap("NextPriority")
        public Integer nextPriority;

        @NameInMap("SourceRegionIds")
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRegionIds sourceRegionIds;

        @NameInMap("SourceChildInstanceTypes")
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceChildInstanceTypes sourceChildInstanceTypes;

        @NameInMap("DestinationRouteTableIds")
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationRouteTableIds destinationRouteTableIds;

        @NameInMap("SourceInstanceIds")
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceInstanceIds sourceInstanceIds;

        @NameInMap("DestinationCidrBlocks")
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationCidrBlocks destinationCidrBlocks;

        @NameInMap("SourceRouteTableIds")
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRouteTableIds sourceRouteTableIds;

        @NameInMap("MatchCommunitySet")
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchCommunitySet matchCommunitySet;

        @NameInMap("PrependAsPath")
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapPrependAsPath prependAsPath;

        @NameInMap("RouteTypes")
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapRouteTypes routeTypes;

        @NameInMap("DestinationChildInstanceTypes")
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationChildInstanceTypes destinationChildInstanceTypes;

        @NameInMap("DestinationInstanceIds")
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationInstanceIds destinationInstanceIds;

        @NameInMap("MatchAsns")
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchAsns matchAsns;

        @NameInMap("OperateCommunitySet")
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapOperateCommunitySet operateCommunitySet;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMap build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMap self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMap();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setRouteMapId(String routeMapId) {
            this.routeMapId = routeMapId;
            return this;
        }
        public String getRouteMapId() {
            return this.routeMapId;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setTransmitDirection(String transmitDirection) {
            this.transmitDirection = transmitDirection;
            return this;
        }
        public String getTransmitDirection() {
            return this.transmitDirection;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setSourceInstanceIdsReverseMatch(Boolean sourceInstanceIdsReverseMatch) {
            this.sourceInstanceIdsReverseMatch = sourceInstanceIdsReverseMatch;
            return this;
        }
        public Boolean getSourceInstanceIdsReverseMatch() {
            return this.sourceInstanceIdsReverseMatch;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setCenRegionId(String cenRegionId) {
            this.cenRegionId = cenRegionId;
            return this;
        }
        public String getCenRegionId() {
            return this.cenRegionId;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setCommunityOperateMode(String communityOperateMode) {
            this.communityOperateMode = communityOperateMode;
            return this;
        }
        public String getCommunityOperateMode() {
            return this.communityOperateMode;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setMapResult(String mapResult) {
            this.mapResult = mapResult;
            return this;
        }
        public String getMapResult() {
            return this.mapResult;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setCommunityMatchMode(String communityMatchMode) {
            this.communityMatchMode = communityMatchMode;
            return this;
        }
        public String getCommunityMatchMode() {
            return this.communityMatchMode;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setAsPathMatchMode(String asPathMatchMode) {
            this.asPathMatchMode = asPathMatchMode;
            return this;
        }
        public String getAsPathMatchMode() {
            return this.asPathMatchMode;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setPreference(Integer preference) {
            this.preference = preference;
            return this;
        }
        public Integer getPreference() {
            return this.preference;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setDestinationInstanceIdsReverseMatch(Boolean destinationInstanceIdsReverseMatch) {
            this.destinationInstanceIdsReverseMatch = destinationInstanceIdsReverseMatch;
            return this;
        }
        public Boolean getDestinationInstanceIdsReverseMatch() {
            return this.destinationInstanceIdsReverseMatch;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setCidrMatchMode(String cidrMatchMode) {
            this.cidrMatchMode = cidrMatchMode;
            return this;
        }
        public String getCidrMatchMode() {
            return this.cidrMatchMode;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setNextPriority(Integer nextPriority) {
            this.nextPriority = nextPriority;
            return this;
        }
        public Integer getNextPriority() {
            return this.nextPriority;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setSourceRegionIds(DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRegionIds sourceRegionIds) {
            this.sourceRegionIds = sourceRegionIds;
            return this;
        }
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRegionIds getSourceRegionIds() {
            return this.sourceRegionIds;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setSourceChildInstanceTypes(DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceChildInstanceTypes sourceChildInstanceTypes) {
            this.sourceChildInstanceTypes = sourceChildInstanceTypes;
            return this;
        }
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceChildInstanceTypes getSourceChildInstanceTypes() {
            return this.sourceChildInstanceTypes;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setDestinationRouteTableIds(DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationRouteTableIds destinationRouteTableIds) {
            this.destinationRouteTableIds = destinationRouteTableIds;
            return this;
        }
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationRouteTableIds getDestinationRouteTableIds() {
            return this.destinationRouteTableIds;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setSourceInstanceIds(DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceInstanceIds sourceInstanceIds) {
            this.sourceInstanceIds = sourceInstanceIds;
            return this;
        }
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceInstanceIds getSourceInstanceIds() {
            return this.sourceInstanceIds;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setDestinationCidrBlocks(DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationCidrBlocks destinationCidrBlocks) {
            this.destinationCidrBlocks = destinationCidrBlocks;
            return this;
        }
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationCidrBlocks getDestinationCidrBlocks() {
            return this.destinationCidrBlocks;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setSourceRouteTableIds(DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRouteTableIds sourceRouteTableIds) {
            this.sourceRouteTableIds = sourceRouteTableIds;
            return this;
        }
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRouteTableIds getSourceRouteTableIds() {
            return this.sourceRouteTableIds;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setMatchCommunitySet(DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchCommunitySet matchCommunitySet) {
            this.matchCommunitySet = matchCommunitySet;
            return this;
        }
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchCommunitySet getMatchCommunitySet() {
            return this.matchCommunitySet;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setPrependAsPath(DescribeCenRouteMapsResponseBodyRouteMapsRouteMapPrependAsPath prependAsPath) {
            this.prependAsPath = prependAsPath;
            return this;
        }
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapPrependAsPath getPrependAsPath() {
            return this.prependAsPath;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setRouteTypes(DescribeCenRouteMapsResponseBodyRouteMapsRouteMapRouteTypes routeTypes) {
            this.routeTypes = routeTypes;
            return this;
        }
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapRouteTypes getRouteTypes() {
            return this.routeTypes;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setDestinationChildInstanceTypes(DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationChildInstanceTypes destinationChildInstanceTypes) {
            this.destinationChildInstanceTypes = destinationChildInstanceTypes;
            return this;
        }
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationChildInstanceTypes getDestinationChildInstanceTypes() {
            return this.destinationChildInstanceTypes;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setDestinationInstanceIds(DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationInstanceIds destinationInstanceIds) {
            this.destinationInstanceIds = destinationInstanceIds;
            return this;
        }
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationInstanceIds getDestinationInstanceIds() {
            return this.destinationInstanceIds;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setMatchAsns(DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchAsns matchAsns) {
            this.matchAsns = matchAsns;
            return this;
        }
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchAsns getMatchAsns() {
            return this.matchAsns;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setOperateCommunitySet(DescribeCenRouteMapsResponseBodyRouteMapsRouteMapOperateCommunitySet operateCommunitySet) {
            this.operateCommunitySet = operateCommunitySet;
            return this;
        }
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapOperateCommunitySet getOperateCommunitySet() {
            return this.operateCommunitySet;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMaps extends TeaModel {
        @NameInMap("RouteMap")
        public java.util.List<DescribeCenRouteMapsResponseBodyRouteMapsRouteMap> routeMap;

        public static DescribeCenRouteMapsResponseBodyRouteMaps build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMaps self = new DescribeCenRouteMapsResponseBodyRouteMaps();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMaps setRouteMap(java.util.List<DescribeCenRouteMapsResponseBodyRouteMapsRouteMap> routeMap) {
            this.routeMap = routeMap;
            return this;
        }
        public java.util.List<DescribeCenRouteMapsResponseBodyRouteMapsRouteMap> getRouteMap() {
            return this.routeMap;
        }

    }

}
