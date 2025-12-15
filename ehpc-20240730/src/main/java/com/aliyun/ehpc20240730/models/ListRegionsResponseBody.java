// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListRegionsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0axxxx</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Regions")
    public java.util.List<ListRegionsResponseBodyRegions> regions;

    /**
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRegionsResponseBody self = new ListRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRegionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListRegionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRegionsResponseBody setRegions(java.util.List<ListRegionsResponseBodyRegions> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<ListRegionsResponseBodyRegions> getRegions() {
        return this.regions;
    }

    public ListRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRegionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListRegionsResponseBodyRegions extends TeaModel {
        @NameInMap("LocalName")
        public String localName;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static ListRegionsResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            ListRegionsResponseBodyRegions self = new ListRegionsResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public ListRegionsResponseBodyRegions setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public ListRegionsResponseBodyRegions setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
