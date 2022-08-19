// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListAclEntriesResponseBody extends TeaModel {
    @NameInMap("AclEntries")
    public java.util.List<ListAclEntriesResponseBodyAclEntries> aclEntries;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Description")
        public String description;

        @NameInMap("Entry")
        public String entry;

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
