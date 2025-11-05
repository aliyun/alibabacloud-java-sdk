// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class ListReplicaEdgeSupportedResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>e71d8a535bd9c****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>17EE62D8-064E-5404-8B0D-72122478****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SupportedRegions")
    public java.util.List<ListReplicaEdgeSupportedResponseBodySupportedRegions> supportedRegions;

    public static ListReplicaEdgeSupportedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListReplicaEdgeSupportedResponseBody self = new ListReplicaEdgeSupportedResponseBody();
        return TeaModel.build(map, self);
    }

    public ListReplicaEdgeSupportedResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListReplicaEdgeSupportedResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListReplicaEdgeSupportedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListReplicaEdgeSupportedResponseBody setSupportedRegions(java.util.List<ListReplicaEdgeSupportedResponseBodySupportedRegions> supportedRegions) {
        this.supportedRegions = supportedRegions;
        return this;
    }
    public java.util.List<ListReplicaEdgeSupportedResponseBodySupportedRegions> getSupportedRegions() {
        return this.supportedRegions;
    }

    public static class ListReplicaEdgeSupportedResponseBodySupportedRegionsZones extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ListReplicaEdgeSupportedResponseBodySupportedRegionsZones build(java.util.Map<String, ?> map) throws Exception {
            ListReplicaEdgeSupportedResponseBodySupportedRegionsZones self = new ListReplicaEdgeSupportedResponseBodySupportedRegionsZones();
            return TeaModel.build(map, self);
        }

        public ListReplicaEdgeSupportedResponseBodySupportedRegionsZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ListReplicaEdgeSupportedResponseBodySupportedRegions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Zones")
        public java.util.List<ListReplicaEdgeSupportedResponseBodySupportedRegionsZones> zones;

        public static ListReplicaEdgeSupportedResponseBodySupportedRegions build(java.util.Map<String, ?> map) throws Exception {
            ListReplicaEdgeSupportedResponseBodySupportedRegions self = new ListReplicaEdgeSupportedResponseBodySupportedRegions();
            return TeaModel.build(map, self);
        }

        public ListReplicaEdgeSupportedResponseBodySupportedRegions setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListReplicaEdgeSupportedResponseBodySupportedRegions setZones(java.util.List<ListReplicaEdgeSupportedResponseBodySupportedRegionsZones> zones) {
            this.zones = zones;
            return this;
        }
        public java.util.List<ListReplicaEdgeSupportedResponseBodySupportedRegionsZones> getZones() {
            return this.zones;
        }

    }

}
