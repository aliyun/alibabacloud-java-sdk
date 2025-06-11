// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListAccessConfigurationsRequest extends TeaModel {
    /**
     * <p>The ID of the directory.</p>
     * 
     * <strong>example:</strong>
     * <p>d-00fc2p61****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The filter condition.</p>
     * <p>The value is not case-sensitive. You must specify the value in the \<Attribute> \<Operator> \<Value> format. You can set \<Attribute> only to AccessConfigurationName and \<Operator> only to eq or sw. The value eq indicates Equals. The value sw indicates Starts With.</p>
     * <p>For example, if you set Filter to AccessConfigurationName sw test, the operation queries all access configurations whose names start with test. If you set Filter to AccessConfigurationName eq TestAccessConfiguration, the operation queries the access configuration whose name is TestAccessConfiguration.</p>
     * 
     * <strong>example:</strong>
     * <p>AccessConfigurationName sw test</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The number of entries per page.</p>
     * <p>Valid values: 1 to 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of <code>NextToken</code>.</p>
     * <p>When you call this operation for the first time, if the total number of entries to return is larger than the value of the <code>MaxResults</code> parameter, the entries are truncated. The system returns entries based on the value of the <code>MaxResults</code> parameter, and does not return the excess entries. In this case, the value of the response parameter <code>IsTruncated</code> is <code>true</code>, and the <code>NextToken</code> parameter is returned. In the next call, you can use the value of the <code>NextToken</code> parameter and maintain the settings of the other request parameters to query the excess entries. You can repeat the call until the value of <code>IsTruncated</code> becomes <code>false</code>. This way, all entries are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>K1c3o9K7pFxoTtxH1Nm7MMLb7zrDGvftYBQBPDVv7AD3a8yhRb3Mk8L9ivmN6bFSjfkZNTAg3h4****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The status notification. The status notification can be used to filter access configurations.</p>
     * <p>Set the value to ReprovisionRequired, which indicates that the operation queries all access configurations that need to be re-provisioned.</p>
     * 
     * <strong>example:</strong>
     * <p>ReprovisionRequired</p>
     */
    @NameInMap("StatusNotifications")
    public String statusNotifications;

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
        @NameInMap("Key")
        public String key;

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
