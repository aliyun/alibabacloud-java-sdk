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
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that determines the start point of the query. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> was not returned, it indicates that no additional results exist.</li>
     * <li>If <strong>NextToken</strong> was returned in the previous query, specify the value to obtain the next set of results.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * 
         * <strong>example:</strong>
         * <p>116.132.XX.XX</p>
         */
        @NameInMap("AccelerateIpAddress")
        public String accelerateIpAddress;

        /**
         * <p>The ID of the accelerated IP address of the basic GA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>gaip-bp1****</p>
         */
        @NameInMap("AccelerateIpId")
        public String accelerateIpId;

        /**
         * <p>The ID of the basic GA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-bp17frjjh0udz4qz****</p>
         */
        @NameInMap("AcceleratorId")
        public String acceleratorId;

        /**
         * <p>The ID of the acceleration region.</p>
         * 
         * <strong>example:</strong>
         * <p>ips-bp11r5jb8ogp122xl****</p>
         */
        @NameInMap("IpSetId")
        public String ipSetId;

        /**
         * <p>The status of the accelerated IP address. Valid values:</p>
         * <ul>
         * <li><strong>active</strong>: The accelerated IP address is available.</li>
         * <li><strong>binding</strong>: The accelerated IP address is being associated.</li>
         * <li><strong>bound</strong>: The accelerated IP address is associated.</li>
         * <li><strong>unbinding</strong>: The accelerated IP address is being disassociated.</li>
         * <li><strong>deleting</strong>: The accelerated IP address is being deleted.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is unavailable when the accelerated IP address is being created.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>active</p>
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
