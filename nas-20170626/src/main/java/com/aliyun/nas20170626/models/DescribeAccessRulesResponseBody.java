// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeAccessRulesResponseBody extends TeaModel {
    /**
     * <p>The rules in the permission group.</p>
     */
    @NameInMap("AccessRules")
    public DescribeAccessRulesResponseBodyAccessRules accessRules;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of rules.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAccessRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessRulesResponseBody self = new DescribeAccessRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccessRulesResponseBody setAccessRules(DescribeAccessRulesResponseBodyAccessRules accessRules) {
        this.accessRules = accessRules;
        return this;
    }
    public DescribeAccessRulesResponseBodyAccessRules getAccessRules() {
        return this.accessRules;
    }

    public DescribeAccessRulesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAccessRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAccessRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccessRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAccessRulesResponseBodyAccessRulesAccessRule extends TeaModel {
        @NameInMap("AccessGroupName")
        public String accessGroupName;

        /**
         * <p>The ID of the rule.</p>
         */
        @NameInMap("AccessRuleId")
        public String accessRuleId;

        @NameInMap("FileSystemType")
        public String fileSystemType;

        /**
         * <p>The IPv6 address or CIDR block of the authorized object.</p>
         */
        @NameInMap("Ipv6SourceCidrIp")
        public String ipv6SourceCidrIp;

        /**
         * <p>The priority of the rule.</p>
         * <br>
         * <p>If multiple rules are attached to the authorized object, the rule with the highest priority takes effect.</p>
         * <br>
         * <p>Valid values: 1 to 100. The value 1 indicates the highest priority.</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The access permissions of the authorized object on the file system.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   RDWR (default): the read and write permissions</p>
         * <p>*   RDONLY: the read-only permissions</p>
         */
        @NameInMap("RWAccess")
        public String RWAccess;

        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The IP address or CIDR block of the authorized object.</p>
         */
        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        /**
         * <p>The access permissions for different types of users in the authorized object.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   no_squash: allows access from root users to the file system.</p>
         * <p>*   root_squash: grants root users the least permissions as the nobody user.</p>
         * <p>*   all_squash: grants all users the least permissions as the nobody user.</p>
         * <br>
         * <p>The nobody user has the least permissions in Linux and can access only the public content of the file system. This ensures the security of the file system.</p>
         */
        @NameInMap("UserAccess")
        public String userAccess;

        public static DescribeAccessRulesResponseBodyAccessRulesAccessRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessRulesResponseBodyAccessRulesAccessRule self = new DescribeAccessRulesResponseBodyAccessRulesAccessRule();
            return TeaModel.build(map, self);
        }

        public DescribeAccessRulesResponseBodyAccessRulesAccessRule setAccessGroupName(String accessGroupName) {
            this.accessGroupName = accessGroupName;
            return this;
        }
        public String getAccessGroupName() {
            return this.accessGroupName;
        }

        public DescribeAccessRulesResponseBodyAccessRulesAccessRule setAccessRuleId(String accessRuleId) {
            this.accessRuleId = accessRuleId;
            return this;
        }
        public String getAccessRuleId() {
            return this.accessRuleId;
        }

        public DescribeAccessRulesResponseBodyAccessRulesAccessRule setFileSystemType(String fileSystemType) {
            this.fileSystemType = fileSystemType;
            return this;
        }
        public String getFileSystemType() {
            return this.fileSystemType;
        }

        public DescribeAccessRulesResponseBodyAccessRulesAccessRule setIpv6SourceCidrIp(String ipv6SourceCidrIp) {
            this.ipv6SourceCidrIp = ipv6SourceCidrIp;
            return this;
        }
        public String getIpv6SourceCidrIp() {
            return this.ipv6SourceCidrIp;
        }

        public DescribeAccessRulesResponseBodyAccessRulesAccessRule setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public DescribeAccessRulesResponseBodyAccessRulesAccessRule setRWAccess(String RWAccess) {
            this.RWAccess = RWAccess;
            return this;
        }
        public String getRWAccess() {
            return this.RWAccess;
        }

        public DescribeAccessRulesResponseBodyAccessRulesAccessRule setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAccessRulesResponseBodyAccessRulesAccessRule setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public DescribeAccessRulesResponseBodyAccessRulesAccessRule setUserAccess(String userAccess) {
            this.userAccess = userAccess;
            return this;
        }
        public String getUserAccess() {
            return this.userAccess;
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
