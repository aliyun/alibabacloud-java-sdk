// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeAccessRulesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("AccessRules")
    @Validation(required = true)
    public DescribeAccessRulesResponseAccessRules accessRules;

    public static DescribeAccessRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessRulesResponse self = new DescribeAccessRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccessRulesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccessRulesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeAccessRulesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAccessRulesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAccessRulesResponse setAccessRules(DescribeAccessRulesResponseAccessRules accessRules) {
        this.accessRules = accessRules;
        return this;
    }
    public DescribeAccessRulesResponseAccessRules getAccessRules() {
        return this.accessRules;
    }

    public static class DescribeAccessRulesResponseAccessRulesAccessRule extends TeaModel {
        @NameInMap("SourceCidrIp")
        @Validation(required = true)
        public String sourceCidrIp;

        @NameInMap("Priority")
        @Validation(required = true)
        public Integer priority;

        @NameInMap("AccessRuleId")
        @Validation(required = true)
        public String accessRuleId;

        @NameInMap("RWAccess")
        @Validation(required = true)
        public String RWAccess;

        @NameInMap("UserAccess")
        @Validation(required = true)
        public String userAccess;

        public static DescribeAccessRulesResponseAccessRulesAccessRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessRulesResponseAccessRulesAccessRule self = new DescribeAccessRulesResponseAccessRulesAccessRule();
            return TeaModel.build(map, self);
        }

        public DescribeAccessRulesResponseAccessRulesAccessRule setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public DescribeAccessRulesResponseAccessRulesAccessRule setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public DescribeAccessRulesResponseAccessRulesAccessRule setAccessRuleId(String accessRuleId) {
            this.accessRuleId = accessRuleId;
            return this;
        }
        public String getAccessRuleId() {
            return this.accessRuleId;
        }

        public DescribeAccessRulesResponseAccessRulesAccessRule setRWAccess(String RWAccess) {
            this.RWAccess = RWAccess;
            return this;
        }
        public String getRWAccess() {
            return this.RWAccess;
        }

        public DescribeAccessRulesResponseAccessRulesAccessRule setUserAccess(String userAccess) {
            this.userAccess = userAccess;
            return this;
        }
        public String getUserAccess() {
            return this.userAccess;
        }

    }

    public static class DescribeAccessRulesResponseAccessRules extends TeaModel {
        @NameInMap("AccessRule")
        @Validation(required = true)
        public java.util.List<DescribeAccessRulesResponseAccessRulesAccessRule> accessRule;

        public static DescribeAccessRulesResponseAccessRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessRulesResponseAccessRules self = new DescribeAccessRulesResponseAccessRules();
            return TeaModel.build(map, self);
        }

        public DescribeAccessRulesResponseAccessRules setAccessRule(java.util.List<DescribeAccessRulesResponseAccessRulesAccessRule> accessRule) {
            this.accessRule = accessRule;
            return this;
        }
        public java.util.List<DescribeAccessRulesResponseAccessRulesAccessRule> getAccessRule() {
            return this.accessRule;
        }

    }

}
