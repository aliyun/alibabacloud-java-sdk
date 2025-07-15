// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListLiveMessageGroupsRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The data center. It must be the same as the data center that was specified when you called the <a href="https://help.aliyun.com/document_detail/2848162.html">CreateLiveMessageApp</a> operation to create the interactive messaging application. Valid values: cn-shanghai and ap-southeast-1 (Singapore).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("DataCenter")
    public String dataCenter;

    /**
     * <p>The status of the groups to query. Default value: 0. Valid values:</p>
     * <ul>
     * <li>0: all groups</li>
     * <li>1: existing groups</li>
     * <li>2: deleted groups</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("GroupStatus")
    public Integer groupStatus;

    /**
     * <p>The starting page number for the query. If you leave this parameter empty, the query starts from the first page.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("NextPageToken")
    public Long nextPageToken;

    /**
     * <p>The sort order based on the time when the groups were created. Valid values:</p>
     * <ul>
     * <li>1: ascending order</li>
     * <li>2: descending order</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SortType")
    public Integer sortType;

    public static ListLiveMessageGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLiveMessageGroupsRequest self = new ListLiveMessageGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListLiveMessageGroupsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListLiveMessageGroupsRequest setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }
    public String getDataCenter() {
        return this.dataCenter;
    }

    public ListLiveMessageGroupsRequest setGroupStatus(Integer groupStatus) {
        this.groupStatus = groupStatus;
        return this;
    }
    public Integer getGroupStatus() {
        return this.groupStatus;
    }

    public ListLiveMessageGroupsRequest setNextPageToken(Long nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public Long getNextPageToken() {
        return this.nextPageToken;
    }

    public ListLiveMessageGroupsRequest setSortType(Integer sortType) {
        this.sortType = sortType;
        return this;
    }
    public Integer getSortType() {
        return this.sortType;
    }

}
