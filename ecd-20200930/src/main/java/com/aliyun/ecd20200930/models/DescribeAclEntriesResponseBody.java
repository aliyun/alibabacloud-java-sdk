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
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6nmB7qrRFJ8vmttjxPL****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
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
         * <p>Valid values:</p>
         * <ul>
         * <li>allow: whitelist</li>
         * <li>disable: blacklist</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>allow</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The ID of the instance to which the ACL applies, such as an office network ID or a cloud computer ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-fsafeweh***</p>
         */
        @NameInMap("SourceId")
        public String sourceId;

        /**
         * <p>The granularity of the ACL.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>desktop: cloud computer</li>
         * <li>vpc: office network</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>desktop</p>
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
