// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListUsersRequest extends TeaModel {
    /**
     * <p>The directory ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d-00fc2p61****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The filter condition.</p>
     * <p>Format: <code>&lt;Attribute&gt; &lt;Operator&gt; &lt;Value&gt;</code>. This value is case-insensitive. Currently, <code>&lt;Attribute&gt;</code> supports only <code>UserName</code>, and <code>Operator</code> supports only <code>eq</code> (Equals) and <code>sw</code> (Start With).</p>
     * <p>Example: Filter = &quot;UserName sw test&quot; queries all users whose usernames start with test. Filter = &quot;UserName eq testuser&quot; queries the user whose username is <code>testuser</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>UserName sw test</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The maximum number of entries per page.</p>
     * <p>Valid values: 1 to 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next page of results. You do not need to specify <code>NextToken</code> for the first API call.</p>
     * <p>When you call the API for the first time, if the total number of entries exceeds the <code>MaxResults</code> limit, the data is truncated and only <code>MaxResults</code> entries are returned. In this case, the response parameter <code>IsTruncated</code> is <code>true</code> and a <code>NextToken</code> is returned. You can use the <code>NextToken</code> returned from the previous call to continue calling the API while keeping other request parameters unchanged to query the truncated data. You can repeat this process until <code>IsTruncated</code> is <code>false</code>, which indicates that all data has been retrieved.</p>
     * 
     * <strong>example:</strong>
     * <p>K1c3o9K7pFxoTtxH1Nm7MMLb7zrDGvftYBQBPDVv7AD3a8yhRb3Mk8L9ivmN6bFSjfkZNTAg3h4****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The user type. This parameter is used as a filter condition. Valid values:</p>
     * <ul>
     * <li>Manual: The user is manually created.</li>
     * <li>Synchronized: The user is synchronized from an external identity provider.</li>
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
     * <li>Enabled: The user is enabled.</li>
     * <li>Disabled: The user is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tag list.</p>
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
