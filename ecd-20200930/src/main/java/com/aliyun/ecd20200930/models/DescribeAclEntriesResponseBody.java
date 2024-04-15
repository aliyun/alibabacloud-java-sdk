// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeAclEntriesResponseBody extends TeaModel {
    /**
     * <p>The ACL entries.</p>
     */
    @NameInMap("AclEntries")
    public java.util.List<DescribeAclEntriesResponseBodyAclEntries> aclEntries;

    /**
     * <p>The token that is used to start the next query. If the value of this parameter is empty, all results are returned.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAclEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAclEntriesResponseBody self = new DescribeAclEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAclEntriesResponseBody setAclEntries(java.util.List<DescribeAclEntriesResponseBodyAclEntries> aclEntries) {
        this.aclEntries = aclEntries;
        return this;
    }
    public java.util.List<DescribeAclEntriesResponseBodyAclEntries> getAclEntries() {
        return this.aclEntries;
    }

    public DescribeAclEntriesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeAclEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAclEntriesResponseBodyAclEntries extends TeaModel {
        /**
         * <p>The ACL type.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   allow: whitelist</p>
         * <p>*   disable: blacklist</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The ID of the instance to which the ACL applies, such as an office network ID or a cloud computer ID.</p>
         */
        @NameInMap("SourceId")
        public String sourceId;

        /**
         * <p>The granularity of the ACL.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   desktop: cloud computer</p>
         * <p>*   vpc: office network</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        public static DescribeAclEntriesResponseBodyAclEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeAclEntriesResponseBodyAclEntries self = new DescribeAclEntriesResponseBodyAclEntries();
            return TeaModel.build(map, self);
        }

        public DescribeAclEntriesResponseBodyAclEntries setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public DescribeAclEntriesResponseBodyAclEntries setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public DescribeAclEntriesResponseBodyAclEntries setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

}
