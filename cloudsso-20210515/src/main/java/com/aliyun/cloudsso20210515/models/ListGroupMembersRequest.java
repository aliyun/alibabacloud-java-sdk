// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListGroupMembersRequest extends TeaModel {
    /**
     * <p>The ID of the directory.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The ID of the group.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

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
     * <p>The token to return for the next page. If this is your first time to call this operation, you do not need to specify `NextToken` .</p>
     * <br>
     * <p>When you call this operation for the first time, if the total number of entries to return exceeds the value of `MaxResults`, the entries are truncated. Only the entries that match the value of `MaxResults` are returned, and the excess entries are not returned. In this case, the value of the response parameter `IsTruncated` is `true`, and `NextToken` is returned. In the next call, you can use the value of `NextToken` and maintain the settings of the other request parameters to query the excess entries. You can repeat the call until the value of `IsTruncated` becomes `false`. This way, all entries are returned.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListGroupMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGroupMembersRequest self = new ListGroupMembersRequest();
        return TeaModel.build(map, self);
    }

    public ListGroupMembersRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public ListGroupMembersRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ListGroupMembersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListGroupMembersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
