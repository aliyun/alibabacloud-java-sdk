// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListBasicAccelerateIpsResponseBody extends TeaModel {
    /**
     * <p>The accelerated IP addresses of the basic GA instance.</p>
     */
    @NameInMap("AccelerateIps")
    public java.util.List<ListBasicAccelerateIpsResponseBodyAccelerateIps> accelerateIps;

    /**
     * <p>The number of entries returned on each page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that determines the start point of the query. Valid values:</p>
     * <br>
     * <p>*   If **NextToken** was not returned, it indicates that no additional results exist.</p>
     * <p>*   If **NextToken** was returned in the previous query, specify the value to obtain the next set of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListBasicAccelerateIpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBasicAccelerateIpsResponseBody self = new ListBasicAccelerateIpsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBasicAccelerateIpsResponseBody setAccelerateIps(java.util.List<ListBasicAccelerateIpsResponseBodyAccelerateIps> accelerateIps) {
        this.accelerateIps = accelerateIps;
        return this;
    }
    public java.util.List<ListBasicAccelerateIpsResponseBodyAccelerateIps> getAccelerateIps() {
        return this.accelerateIps;
    }

    public ListBasicAccelerateIpsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListBasicAccelerateIpsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListBasicAccelerateIpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBasicAccelerateIpsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListBasicAccelerateIpsResponseBodyAccelerateIps extends TeaModel {
        /**
         * <p>The accelerated IP address of the basic GA instance.</p>
         */
        @NameInMap("AccelerateIpAddress")
        public String accelerateIpAddress;

        /**
         * <p>The ID of the accelerated IP address of the basic GA instance.</p>
         */
        @NameInMap("AccelerateIpId")
        public String accelerateIpId;

        /**
         * <p>The ID of the basic GA instance.</p>
         */
        @NameInMap("AcceleratorId")
        public String acceleratorId;

        /**
         * <p>The ID of the acceleration region.</p>
         */
        @NameInMap("IpSetId")
        public String ipSetId;

        /**
         * <p>The status of the accelerated IP address. Valid values:</p>
         * <br>
         * <p>*   **active**: The accelerated IP address is available.</p>
         * <p>*   **binding**: The accelerated IP address is being associated.</p>
         * <p>*   **bound**: The accelerated IP address is associated.</p>
         * <p>*   **unbinding**: The accelerated IP address is being disassociated.</p>
         * <p>*   **deleting**: The accelerated IP address is being deleted.</p>
         * <br>
         * <p>>  This parameter is unavailable when the accelerated IP address is being created.</p>
         */
        @NameInMap("State")
        public String state;

        public static ListBasicAccelerateIpsResponseBodyAccelerateIps build(java.util.Map<String, ?> map) throws Exception {
            ListBasicAccelerateIpsResponseBodyAccelerateIps self = new ListBasicAccelerateIpsResponseBodyAccelerateIps();
            return TeaModel.build(map, self);
        }

        public ListBasicAccelerateIpsResponseBodyAccelerateIps setAccelerateIpAddress(String accelerateIpAddress) {
            this.accelerateIpAddress = accelerateIpAddress;
            return this;
        }
        public String getAccelerateIpAddress() {
            return this.accelerateIpAddress;
        }

        public ListBasicAccelerateIpsResponseBodyAccelerateIps setAccelerateIpId(String accelerateIpId) {
            this.accelerateIpId = accelerateIpId;
            return this;
        }
        public String getAccelerateIpId() {
            return this.accelerateIpId;
        }

        public ListBasicAccelerateIpsResponseBodyAccelerateIps setAcceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }
        public String getAcceleratorId() {
            return this.acceleratorId;
        }

        public ListBasicAccelerateIpsResponseBodyAccelerateIps setIpSetId(String ipSetId) {
            this.ipSetId = ipSetId;
            return this;
        }
        public String getIpSetId() {
            return this.ipSetId;
        }

        public ListBasicAccelerateIpsResponseBodyAccelerateIps setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
