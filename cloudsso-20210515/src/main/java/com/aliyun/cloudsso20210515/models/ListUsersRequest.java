// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListUsersRequest extends TeaModel {
    /**
     * <p>The CloudSSO directory ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d-00fc2p61****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The filter condition.</p>
     * <p>The format is <code>&lt;Attribute&gt; &lt;Operator&gt; &lt;Value&gt;</code>. The filter is not case-sensitive. The <code>&lt;Attribute&gt;</code> only supports <code>UserName</code>. The <code>&lt;Operator&gt;</code> only supports <code>eq</code> (equal to) and <code>sw</code> (starts with).</p>
     * <p>Examples:</p>
     * <p>If you configure this parameter to <code>UserName sw test</code>, the system queries all users whose usernames start with <code>test</code>. If you configure this parameter to <code>UserName eq testuser</code>, the system queries the user whose username is <code>testuser</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>UserName sw test</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The maximum number of entries to return on each page.</p>
     * <p>Valid values: 1 to 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request.</p>
     * <p>If the total number of entries exceeds the value of <code>MaxResults</code>, the entries are truncated. The system returns the value of <code>MaxResults</code> and a <code>NextToken</code>. The <code>IsTruncated</code> parameter is set to <code>true</code>. You can use the returned <code>NextToken</code> in the next call to query the remaining entries. Keep the other request parameters unchanged. Repeat this process until the <code>IsTruncated</code> parameter is <code>false</code>. This indicates that all entries are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>K1c3o9K7pFxoTtxH1Nm7MMLb7zrDGvftYBQBPDVv7AD3a8yhRb3Mk8L9ivmN6bFSjfkZNTAg3h4****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The user type. This parameter is used as a filter condition. Valid values:</p>
     * <ul>
     * <li><p>Manual: The user was manually created.</p>
     * </li>
     * <li><p>Synchronized: The user was synchronized from an external IdP.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Manual</p>
     */
    @NameInMap("ProvisionType")
    public String provisionType;

    /**
     * <p>The user status. This parameter is used as a filter condition. Valid values:</p>
     * <ul>
     * <li><p>Enabled</p>
     * </li>
     * <li><p>Disabled</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags attached to the user.</p>
     */
    @NameInMap("Tags")
    public java.util.List<ListUsersRequestTags> tags;

    public static ListUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUsersRequest self = new ListUsersRequest();
        return TeaModel.build(map, self);
    }

    public ListUsersRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public ListUsersRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListUsersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListUsersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListUsersRequest setProvisionType(String provisionType) {
        this.provisionType = provisionType;
        return this;
    }
    public String getProvisionType() {
        return this.provisionType;
    }

    public ListUsersRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListUsersRequest setTags(java.util.List<ListUsersRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListUsersRequestTags> getTags() {
        return this.tags;
    }

    public static class ListUsersRequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListUsersRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListUsersRequestTags self = new ListUsersRequestTags();
            return TeaModel.build(map, self);
        }

        public ListUsersRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListUsersRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
