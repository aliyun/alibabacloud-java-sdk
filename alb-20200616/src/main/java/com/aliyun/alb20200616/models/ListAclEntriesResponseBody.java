// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListAclEntriesResponseBody extends TeaModel {
    /**
     * <p>The ACL entries.</p>
     */
    @NameInMap("AclEntries")
    public java.util.List<ListAclEntriesResponseBodyAclEntries> aclEntries;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <br>
     * <p>*   If **NextToken** is empty, no next page exists.</p>
     * <p>*   If a value is returned for **NextToken**, the value is the token that determines the start point of the next query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAclEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAclEntriesResponseBody self = new ListAclEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAclEntriesResponseBody setAclEntries(java.util.List<ListAclEntriesResponseBodyAclEntries> aclEntries) {
        this.aclEntries = aclEntries;
        return this;
    }
    public java.util.List<ListAclEntriesResponseBodyAclEntries> getAclEntries() {
        return this.aclEntries;
    }

    public ListAclEntriesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAclEntriesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAclEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAclEntriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAclEntriesResponseBodyAclEntries extends TeaModel {
        /**
         * <p>The description of the ACL entry. The description must be 1 to 256 characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (\_).</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The CIDR block of the ACL entry.</p>
         */
        @NameInMap("Entry")
        public String entry;

        /**
         * <p>The status of the ACL entry. Valid values:</p>
         * <br>
         * <p>*   **Adding**</p>
         * <p>*   **Available**</p>
         * <p>*   **Removing**</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListAclEntriesResponseBodyAclEntries build(java.util.Map<String, ?> map) throws Exception {
            ListAclEntriesResponseBodyAclEntries self = new ListAclEntriesResponseBodyAclEntries();
            return TeaModel.build(map, self);
        }

        public ListAclEntriesResponseBodyAclEntries setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAclEntriesResponseBodyAclEntries setEntry(String entry) {
            this.entry = entry;
            return this;
        }
        public String getEntry() {
            return this.entry;
        }

        public ListAclEntriesResponseBodyAclEntries setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
