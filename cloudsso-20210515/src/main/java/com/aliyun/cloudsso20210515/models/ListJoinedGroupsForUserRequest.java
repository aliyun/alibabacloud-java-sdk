// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListJoinedGroupsForUserRequest extends TeaModel {
    /**
     * <p>The ID of the directory.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

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

    /**
     * <p>The ID of the user.</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static ListJoinedGroupsForUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJoinedGroupsForUserRequest self = new ListJoinedGroupsForUserRequest();
        return TeaModel.build(map, self);
    }

    public ListJoinedGroupsForUserRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public ListJoinedGroupsForUserRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListJoinedGroupsForUserRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListJoinedGroupsForUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
