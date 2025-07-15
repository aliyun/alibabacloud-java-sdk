// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListLiveMessageGroupMessagesRequest extends TeaModel {
    /**
     * <p>The ID of the interactive messaging application to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds. If you leave this parameter empty, the earliest available time is used.</p>
     * 
     * <strong>example:</strong>
     * <p>1697783235</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>The data center. It must be the same as the data center that was specified when you called the <a href="https://help.aliyun.com/document_detail/2848162.html">CreateLiveMessageApp</a> operation to create the interactive messaging application. Valid values: cn-shanghai and ap-southeast-1 (Singapore).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("DataCenter")
    public String dataCenter;

    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: seconds. If you leave this parameter empty, the latest available time is used.</p>
     * 
     * <strong>example:</strong>
     * <p>1698301635</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The ID of the group to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>grouptest</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The type of messages that you want to query. If you leave this parameter empty, all types of messages are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MsgType")
    public Long msgType;

    /**
     * <p>The starting page number for the query. If you leave this parameter empty, the query starts from the first page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NextPageToken")
    public Long nextPageToken;

    /**
     * <p>The number of entries per page. Valid values: <strong>10 to 50</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The sort order based on the time when the messages were sent. Valid values:</p>
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
