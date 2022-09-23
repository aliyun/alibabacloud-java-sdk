// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeGrantRulesToResourceResponseBody extends TeaModel {
    @NameInMap("GrantRules")
    public java.util.List<DescribeGrantRulesToResourceResponseBodyGrantRules> grantRules;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

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
