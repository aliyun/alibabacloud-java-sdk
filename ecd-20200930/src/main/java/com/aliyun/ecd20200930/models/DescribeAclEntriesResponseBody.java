// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeAclEntriesResponseBody extends TeaModel {
    /**
     * <p>The ACL entry.</p>
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
         * <p>The ACL policy.</p>
         * <br>
         * <p>*   **allow**: allows access.</p>
         * <p>*   **drop**: denies access.</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The ID of the instance corresponding to the ACL.</p>
         */
        @NameInMap("SourceId")
        public String sourceId;

        /**
         * <p>The object on which the ACL takes effect.</p>
         * <br>
         * <p>*   **vpc**: workspace.</p>
         * <p>*   **desktop**: cloud desktop.</p>
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
