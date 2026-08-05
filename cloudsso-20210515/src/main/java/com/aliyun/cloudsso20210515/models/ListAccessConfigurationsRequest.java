// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListAccessConfigurationsRequest extends TeaModel {
    /**
     * <p>The ID of the folder.</p>
     * 
     * <strong>example:</strong>
     * <p>d-00fc2p61****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The filter condition.</p>
     * <p>The format is <code>&lt;Attribute&gt; &lt;Operator&gt; &lt;Value&gt;</code> . The filter is not case-sensitive. The <code>&lt;Attribute&gt;</code> only supports <code>AccessConfigurationName</code>. The <code>&lt;Operator&gt;</code> only supports <code>eq</code> (equal to) and <code>sw</code> (starts with).</p>
     * <p>Examples:</p>
     * <p>If you configure this parameter to <code>AccessConfigurationName sw test</code>, the system queries all access configurations whose names start with <code>test</code>. If you configure this parameter to <code>AccessConfigurationName eq TestAccessConfiguration</code>, the system queries the access configuration named <code>TestAccessConfiguration</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>AccessConfigurationName sw test</p>
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
     * <p>If the number of results exceeds the value of <code>MaxResults</code>, the response is truncated. The <code>IsTruncated</code> parameter is set to <code>true</code>, and a <code>NextToken</code> is returned. You can use the <code>NextToken</code> in a subsequent request with the same parameters to retrieve the next page of results. Repeat this process until <code>IsTruncated</code> is <code>false</code> to query all results.</p>
     * 
     * <strong>example:</strong>
     * <p>K1c3o9K7pFxoTtxH1Nm7MMLb7zrDGvftYBQBPDVv7AD3a8yhRb3Mk8L9ivmN6bFSjfkZNTAg3h4****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The status notification, which is used as a filter condition.</p>
     * <p>A value of ReprovisionRequired returns only the access configurations that need to be reprovisioned.</p>
     * 
     * <strong>example:</strong>
     * <p>ReprovisionRequired</p>
     */
    @NameInMap("StatusNotifications")
    public String statusNotifications;

    /**
     * <p>The tags attached to the access configuration.</p>
     */
    @NameInMap("Tags")
    public java.util.List<ListAccessConfigurationsRequestTags> tags;

    public static ListAccessConfigurationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAccessConfigurationsRequest self = new ListAccessConfigurationsRequest();
        return TeaModel.build(map, self);
    }

    public ListAccessConfigurationsRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public ListAccessConfigurationsRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListAccessConfigurationsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAccessConfigurationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAccessConfigurationsRequest setStatusNotifications(String statusNotifications) {
        this.statusNotifications = statusNotifications;
        return this;
    }
    public String getStatusNotifications() {
        return this.statusNotifications;
    }

    public ListAccessConfigurationsRequest setTags(java.util.List<ListAccessConfigurationsRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListAccessConfigurationsRequestTags> getTags() {
        return this.tags;
    }

    public static class ListAccessConfigurationsRequestTags extends TeaModel {
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

        public static ListAccessConfigurationsRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListAccessConfigurationsRequestTags self = new ListAccessConfigurationsRequestTags();
            return TeaModel.build(map, self);
        }

        public ListAccessConfigurationsRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListAccessConfigurationsRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
