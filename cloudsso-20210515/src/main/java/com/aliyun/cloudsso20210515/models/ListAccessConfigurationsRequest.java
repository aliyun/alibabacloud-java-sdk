// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListAccessConfigurationsRequest extends TeaModel {
    /**
     * <p>The ID of the directory.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The filter condition.</p>
     * <br>
     * <p>Specify the value in the \\<Attribute> \\<Operator> \\<Value> format. The value is not case sensitive. You can set \\<Attribute> only to AccessConfigurationName and \\<Operator> only to eq or sw. The value eq indicates Equals. The value sw indicates Starts With.</p>
     * <br>
     * <p>For example, if you set Filter to AccessConfigurationName sw test, the operation queries all access configurations whose names start with test. If you set Filter to AccessConfigurationName eq TestAccessConfiguration, the operation queries the access configuration whose name is TestAccessConfiguration.</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Valid values: 1 to 100.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token to return for the next page. If this is your first time to call this operation, you do not need to specify the `NextToken` parameter.</p>
     * <br>
     * <p>When you call this operation for the first time, if the total number of entries to return exceeds the value of `MaxResults`, the entries are truncated. Only the entries that match the value of `MaxResults` are returned, and the excess entries are not returned. In this case, the value of the response parameter `IsTruncated` is `true`, and `NextToken` is returned. In the next call, you can use the value of `NextToken` and maintain the settings of the other request parameters to query the excess entries. You can repeat the call until the value of `IsTruncated` becomes `false`. This way, all entries are returned.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The status notification. The status notification can be used to filter access configurations.</p>
     * <br>
     * <p>Set the value to ReprovisionRequired, which indicates that the operation queries all access configurations that need to be re-provisioned.</p>
     */
    @NameInMap("StatusNotifications")
    public String statusNotifications;

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

}
