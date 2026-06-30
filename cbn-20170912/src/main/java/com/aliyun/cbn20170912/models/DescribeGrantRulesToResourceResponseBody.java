// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeGrantRulesToResourceResponseBody extends TeaModel {
    /**
     * <p>A list of permission records.</p>
     */
    @NameInMap("GrantRules")
    public java.util.List<DescribeGrantRulesToResourceResponseBodyGrantRules> grantRules;

    /**
     * <ul>
     * <li><p>If the <strong>MaxResults</strong> parameter was not included in the request, this field indicates the total number of entries.</p>
     * </li>
     * <li><p>If the <strong>MaxResults</strong> parameter was included in the request, this field indicates the number of entries on the current page.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token to use in your next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li><p>If the <strong>NextToken</strong> parameter is empty, no more results are available.</p>
     * </li>
     * <li><p>If a value is returned for <strong>NextToken</strong>, use it for the next request to get the next page of results.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C6E5992C-A57B-5A6C-9B26-568074DC68BA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * <p>The ID of the Cloud Enterprise Network (CEN) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-44m0p68spvlrqq****</p>
         */
        @NameInMap("CenId")
        public String cenId;

        /**
         * <p>The ID of the main account that owns the Cloud Enterprise Network (CEN) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1250123456123456</p>
         */
        @NameInMap("CenOwnerId")
        public Long cenOwnerId;

        /**
         * <p>The timestamp when the permission was granted. The value is in UTC and follows the ISO 8601 standard: <code>YYYY-MM-DDThh:mmZ</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-24T16:46Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>PayByCenOwner</p>
         */
        @NameInMap("EffectiveOrderType")
        public String effectiveOrderType;

        /**
         * <p>The payer for the network instance. Valid values:</p>
         * <ul>
         * <li><p><strong>PayByCenOwner</strong>: The CEN instance owner pays the Transit Router connection and data processing fees for the network instance.</p>
         * </li>
         * <li><p><strong>PayByResourceOwner</strong>: The network instance owner pays the Transit Router connection and data processing fees for the network instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayByCenOwner</p>
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

        public DescribeGrantRulesToResourceResponseBodyGrantRules setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeGrantRulesToResourceResponseBodyGrantRules setEffectiveOrderType(String effectiveOrderType) {
            this.effectiveOrderType = effectiveOrderType;
            return this;
        }
        public String getEffectiveOrderType() {
            return this.effectiveOrderType;
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
