// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeGrantRulesToResourceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("GrantRules")
    public java.util.List<DescribeGrantRulesToResourceResponseBodyGrantRules> grantRules;

    /**
     * <p>The entity that pays the fees of the network instance. Valid values:</p>
     * <br>
     * <p>*   **PayByCenOwner**: The fees of the connections and data forwarding on the transit router are paid by the Alibaba Cloud account to which the CEN instance belongs.</p>
     * <p>*   **PayByResourceOwner**: The fees of the connections and data forwarding on the transit router are paid by the Alibaba Cloud account to which the network instance belongs.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The ID of the Alibaba Cloud account to which the CEN instance belongs.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region where the network instance is deployed.</p>
     * <br>
     * <p>You can call the [DescribeChildInstanceRegions](~~132080~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>*   If you do not set **MaxResults**, it indicates that you do not need to query results in batches. The value of **MaxResults** indicates the total number of entries.</p>
     * <p>*   If you specify a value for **MaxResults**, it indicates that you need to query results in batches. The value of **MaxResults** indicates the number of entries to return in each batch. Valid values: **1** to **100**. The value of **MaxResults** in the response indicates the number of entries in the current batch. We recommend that you set **MaxResults** to **20**.</p>
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
        @NameInMap("CenId")
        public String cenId;

        @NameInMap("CenOwnerId")
        public Long cenOwnerId;

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
