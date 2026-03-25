// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeGrantRulesToCenResponseBody extends TeaModel {
    @NameInMap("GrantRules")
    public DescribeGrantRulesToCenResponseBodyGrantRules grantRules;

    /**
     * <ul>
     * <li>If no value is specified for <strong>MaxResults</strong>, query results are returned in one batch. The value of <strong>MaxResults</strong> indicates the total number of entries.</li>
     * <li>If a value is specified for <strong>MaxResults</strong>, it indicates that you need to query results in batches. The value of <strong>MaxResults</strong> in the response indicates the number of entries in the current batch.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
     * <li>If a value of <strong>NextToken</strong> was returned in the previous query, specify the value to obtain the next set of results.</li>
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
     * <p>4906B209-8613-5C19-9CC9-B7A3FFDA731C</p>
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
    public Long totalCount;

    public static DescribeGrantRulesToCenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGrantRulesToCenResponseBody self = new DescribeGrantRulesToCenResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGrantRulesToCenResponseBody setGrantRules(DescribeGrantRulesToCenResponseBodyGrantRules grantRules) {
        this.grantRules = grantRules;
        return this;
    }
    public DescribeGrantRulesToCenResponseBodyGrantRules getGrantRules() {
        return this.grantRules;
    }

    public DescribeGrantRulesToCenResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public DescribeGrantRulesToCenResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeGrantRulesToCenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGrantRulesToCenResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeGrantRulesToCenResponseBodyGrantRulesGrantRule extends TeaModel {
        @NameInMap("CenId")
        public String cenId;

        @NameInMap("CenOwnerId")
        public Long cenOwnerId;

        @NameInMap("ChildInstanceId")
        public String childInstanceId;

        @NameInMap("ChildInstanceOwnerId")
        public Long childInstanceOwnerId;

        @NameInMap("ChildInstanceRegionId")
        public String childInstanceRegionId;

        @NameInMap("ChildInstanceType")
        public String childInstanceType;

        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>PayByCenOwner</p>
         */
        @NameInMap("EffectiveOrderType")
        public String effectiveOrderType;

        /**
         * <strong>example:</strong>
         * <p>PayByCenOwner</p>
         */
        @NameInMap("OrderType")
        public String orderType;

        public static DescribeGrantRulesToCenResponseBodyGrantRulesGrantRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeGrantRulesToCenResponseBodyGrantRulesGrantRule self = new DescribeGrantRulesToCenResponseBodyGrantRulesGrantRule();
            return TeaModel.build(map, self);
        }

        public DescribeGrantRulesToCenResponseBodyGrantRulesGrantRule setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public DescribeGrantRulesToCenResponseBodyGrantRulesGrantRule setCenOwnerId(Long cenOwnerId) {
            this.cenOwnerId = cenOwnerId;
            return this;
        }
        public Long getCenOwnerId() {
            return this.cenOwnerId;
        }

        public DescribeGrantRulesToCenResponseBodyGrantRulesGrantRule setChildInstanceId(String childInstanceId) {
            this.childInstanceId = childInstanceId;
            return this;
        }
        public String getChildInstanceId() {
            return this.childInstanceId;
        }

        public DescribeGrantRulesToCenResponseBodyGrantRulesGrantRule setChildInstanceOwnerId(Long childInstanceOwnerId) {
            this.childInstanceOwnerId = childInstanceOwnerId;
            return this;
        }
        public Long getChildInstanceOwnerId() {
            return this.childInstanceOwnerId;
        }

        public DescribeGrantRulesToCenResponseBodyGrantRulesGrantRule setChildInstanceRegionId(String childInstanceRegionId) {
            this.childInstanceRegionId = childInstanceRegionId;
            return this;
        }
        public String getChildInstanceRegionId() {
            return this.childInstanceRegionId;
        }

        public DescribeGrantRulesToCenResponseBodyGrantRulesGrantRule setChildInstanceType(String childInstanceType) {
            this.childInstanceType = childInstanceType;
            return this;
        }
        public String getChildInstanceType() {
            return this.childInstanceType;
        }

        public DescribeGrantRulesToCenResponseBodyGrantRulesGrantRule setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeGrantRulesToCenResponseBodyGrantRulesGrantRule setEffectiveOrderType(String effectiveOrderType) {
            this.effectiveOrderType = effectiveOrderType;
            return this;
        }
        public String getEffectiveOrderType() {
            return this.effectiveOrderType;
        }

        public DescribeGrantRulesToCenResponseBodyGrantRulesGrantRule setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

    }

    public static class DescribeGrantRulesToCenResponseBodyGrantRules extends TeaModel {
        @NameInMap("GrantRule")
        public java.util.List<DescribeGrantRulesToCenResponseBodyGrantRulesGrantRule> grantRule;

        public static DescribeGrantRulesToCenResponseBodyGrantRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeGrantRulesToCenResponseBodyGrantRules self = new DescribeGrantRulesToCenResponseBodyGrantRules();
            return TeaModel.build(map, self);
        }

        public DescribeGrantRulesToCenResponseBodyGrantRules setGrantRule(java.util.List<DescribeGrantRulesToCenResponseBodyGrantRulesGrantRule> grantRule) {
            this.grantRule = grantRule;
            return this;
        }
        public java.util.List<DescribeGrantRulesToCenResponseBodyGrantRulesGrantRule> getGrantRule() {
            return this.grantRule;
        }

    }

}
