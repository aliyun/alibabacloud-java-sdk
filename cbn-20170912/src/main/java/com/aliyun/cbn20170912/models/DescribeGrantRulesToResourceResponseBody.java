// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeGrantRulesToResourceResponseBody extends TeaModel {
    /**
     * <p>The permissions that are granted to the CEN instance.</p>
     */
    @NameInMap("GrantRules")
    public java.util.List<DescribeGrantRulesToResourceResponseBodyGrantRules> grantRules;

    /**
     * <p>*   If no value is specified for **MaxResults**, query results are returned in one batch. The value of **MaxResults** indicates the total number of entries.</p>
     * <p>*   If a value is specified for **MaxResults**, it indicates that you need to query results in batches. The value of **MaxResults** in the response indicates the number of entries in the current batch.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that determines the start point of the query. Valid values:</p>
     * <br>
     * <p>*   If **NextToken** was not returned in the previous query, it indicates that no additional results exist.</p>
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

    public static DescribeGrantRulesToResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGrantRulesToResourceResponseBody self = new DescribeGrantRulesToResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGrantRulesToResourceResponseBody setGrantRules(java.util.List<DescribeGrantRulesToResourceResponseBodyGrantRules> grantRules) {
        this.grantRules = grantRules;
        return this;
    }
    public java.util.List<DescribeGrantRulesToResourceResponseBodyGrantRules> getGrantRules() {
        return this.grantRules;
    }

    public DescribeGrantRulesToResourceResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeGrantRulesToResourceResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeGrantRulesToResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGrantRulesToResourceResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeGrantRulesToResourceResponseBodyGrantRules extends TeaModel {
        /**
         * <p>The ID of the CEN instance.</p>
         */
        @NameInMap("CenId")
        public String cenId;

        /**
         * <p>The ID of the Alibaba Cloud account to which the CEN instance belongs.</p>
         */
        @NameInMap("CenOwnerId")
        public Long cenOwnerId;

        /**
         * <p>The entity that pays the fees of the network instance. Valid values:</p>
         * <br>
         * <p>*   **PayByCenOwner**: The fees of the connections and data forwarding on the transit router are paid by the Alibaba Cloud account to which the CEN instance belongs.</p>
         * <p>*   **PayByResourceOwner**: The fees of the connections and data forwarding on the transit router are paid by the Alibaba Cloud account to which the network instance belongs.</p>
         */
        @NameInMap("OrderType")
        public String orderType;

        public static DescribeGrantRulesToResourceResponseBodyGrantRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeGrantRulesToResourceResponseBodyGrantRules self = new DescribeGrantRulesToResourceResponseBodyGrantRules();
            return TeaModel.build(map, self);
        }

        public DescribeGrantRulesToResourceResponseBodyGrantRules setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public DescribeGrantRulesToResourceResponseBodyGrantRules setCenOwnerId(Long cenOwnerId) {
            this.cenOwnerId = cenOwnerId;
            return this;
        }
        public Long getCenOwnerId() {
            return this.cenOwnerId;
        }

        public DescribeGrantRulesToResourceResponseBodyGrantRules setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

    }

}
