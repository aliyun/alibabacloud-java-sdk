// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListLiveMessageGroupMessagesRequest extends TeaModel {
    /**
     * <p>The ID of the interactive message application to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The query start time, expressed as a UNIX timestamp. Unit: seconds. If this parameter is left empty, the earliest time is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>1697783235</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>The data center. This value must be consistent with the data center specified in <a href="https://help.aliyun.com/document_detail/2848162.html">CreateLiveMessageApp</a>. Currently supported data centers are Shanghai (cn-shanghai) and Singapore (ap-southeast-1).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("DataCenter")
    public String dataCenter;

    /**
     * <p>The query end time, expressed as a UNIX timestamp. Unit: seconds. If this parameter is left empty, the latest time is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>1698301635</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The group ID of the group to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>grouptest</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The message type to query. If this parameter is left empty, all message types are returned by default.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MsgType")
    public Long msgType;

    /**
     * <p>The start position of the query page. If this parameter is left empty, the first page is returned by default.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NextPageToken")
    public Long nextPageToken;

    /**
     * <p>The number of messages to display at a time. Valid values: <strong>[10,50]</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The sort type. Messages are sorted by the time they were sent. Valid values:</p>
     * <ul>
     * <li><p>1: ascending order</p>
     * </li>
     * <li><p>2: descending order</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SortType")
    public Integer sortType;

    public static ListLiveMessageGroupMessagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLiveMessageGroupMessagesRequest self = new ListLiveMessageGroupMessagesRequest();
        return TeaModel.build(map, self);
    }

    public ListLiveMessageGroupMessagesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListLiveMessageGroupMessagesRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public ListLiveMessageGroupMessagesRequest setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }
    public String getDataCenter() {
        return this.dataCenter;
    }

    public ListLiveMessageGroupMessagesRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListLiveMessageGroupMessagesRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ListLiveMessageGroupMessagesRequest setMsgType(Long msgType) {
        this.msgType = msgType;
        return this;
    }
    public Long getMsgType() {
        return this.msgType;
    }

    public ListLiveMessageGroupMessagesRequest setNextPageToken(Long nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public Long getNextPageToken() {
        return this.nextPageToken;
    }

    public ListLiveMessageGroupMessagesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListLiveMessageGroupMessagesRequest setSortType(Integer sortType) {
        this.sortType = sortType;
        return this;
    }
    public Integer getSortType() {
        return this.sortType;
    }

}
