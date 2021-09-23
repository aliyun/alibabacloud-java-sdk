// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeAccessRulesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("AccessRules")
    public DescribeAccessRulesResponseBodyAccessRules accessRules;

    public static DescribeAccessRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessRulesResponseBody self = new DescribeAccessRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccessRulesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAccessRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccessRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAccessRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeAccessRulesResponseBody setAccessRules(DescribeAccessRulesResponseBodyAccessRules accessRules) {
        this.accessRules = accessRules;
        return this;
    }
    public DescribeAccessRulesResponseBodyAccessRules getAccessRules() {
        return this.accessRules;
    }

    public static class DescribeAccessRulesResponseBodyAccessRulesAccessRule extends TeaModel {
        @NameInMap("AccessRuleId")
        public String accessRuleId;

        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        @NameInMap("Ipv6SourceCidrIp")
        public String ipv6SourceCidrIp;

        @NameInMap("RWAccess")
        public String RWAccess;

        @NameInMap("UserAccess")
        public String userAccess;

        @NameInMap("Priority")
        public Integer priority;

        public static DescribeAccessRulesResponseBodyAccessRulesAccessRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessRulesResponseBodyAccessRulesAccessRule self = new DescribeAccessRulesResponseBodyAccessRulesAccessRule();
            return TeaModel.build(map, self);
        }

        public DescribeAccessRulesResponseBodyAccessRulesAccessRule setAccessRuleId(String accessRuleId) {
            this.accessRuleId = accessRuleId;
            return this;
        }
        public String getAccessRuleId() {
            return this.accessRuleId;
        }

        public DescribeAccessRulesResponseBodyAccessRulesAccessRule setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public DescribeAccessRulesResponseBodyAccessRulesAccessRule setIpv6SourceCidrIp(String ipv6SourceCidrIp) {
            this.ipv6SourceCidrIp = ipv6SourceCidrIp;
            return this;
        }
        public String getIpv6SourceCidrIp() {
            return this.ipv6SourceCidrIp;
        }

        public DescribeAccessRulesResponseBodyAccessRulesAccessRule setRWAccess(String RWAccess) {
            this.RWAccess = RWAccess;
            return this;
        }
        public String getRWAccess() {
            return this.RWAccess;
        }

        public DescribeAccessRulesResponseBodyAccessRulesAccessRule setUserAccess(String userAccess) {
            this.userAccess = userAccess;
            return this;
        }
        public String getUserAccess() {
            return this.userAccess;
        }

        public DescribeAccessRulesResponseBodyAccessRulesAccessRule setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class DescribeAccessRulesResponseBodyAccessRules extends TeaModel {
        @NameInMap("AccessRule")
        public java.util.List<DescribeAccessRulesResponseBodyAccessRulesAccessRule> accessRule;

        public static DescribeAccessRulesResponseBodyAccessRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessRulesResponseBodyAccessRules self = new DescribeAccessRulesResponseBodyAccessRules();
            return TeaModel.build(map, self);
        }

        public DescribeAccessRulesResponseBodyAccessRules setAccessRule(java.util.List<DescribeAccessRulesResponseBodyAccessRulesAccessRule> accessRule) {
            this.accessRule = accessRule;
            return this;
        }
        public java.util.List<DescribeAccessRulesResponseBodyAccessRulesAccessRule> getAccessRule() {
            return this.accessRule;
        }

    }

}
