// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListAccessConfigurationsRequest extends TeaModel {
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
     * <p>Format: <Attribute> <Operator> <Value>. The filter is case-insensitive. Currently, <Attribute> supports only AccessConfigurationName, and <Operator> supports only eq (Equals) and sw (Start With).</p>
     * <p>Example: Filter = &quot;AccessConfigurationName sw test&quot; queries all access configurations whose names start with test. Filter = &quot;AccessConfigurationName eq TestAccessConfiguration&quot; queries the access configuration named TestAccessConfiguration.</p>
     * 
     * <strong>example:</strong>
     * <p>AccessConfigurationName sw test</p>
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
     * <p>When you call this API operation for the first time, if the total number of results exceeds the <code>MaxResults</code> limit, the results are truncated and only <code>MaxResults</code> entries are returned. In this case, the <code>IsTruncated</code> parameter is set to <code>true</code> and a <code>NextToken</code> is returned. You can use the <code>NextToken</code> returned from the previous call to continue calling this API operation while keeping other request parameters unchanged to query the truncated results. You can repeat this process until <code>IsTruncated</code> is <code>false</code>, which indicates that all data has been retrieved.</p>
     * 
     * <strong>example:</strong>
     * <p>K1c3o9K7pFxoTtxH1Nm7MMLb7zrDGvftYBQBPDVv7AD3a8yhRb3Mk8L9ivmN6bFSjfkZNTAg3h4****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The status notification information, which is used as a filter condition for the query.</p>
     * <p>Valid values: ReprovisionRequired, which queries access configurations that need to be reprovisioned.</p>
     * 
     * <strong>example:</strong>
     * <p>ReprovisionRequired</p>
     */
    @NameInMap("StatusNotifications")
    public String statusNotifications;

    /**
     * <p>The list of tags.</p>
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
