// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ListCommentsRequest extends TeaModel {
    // 用户的应用ID，在控制台创建应用时生成。包含小写字母、数字，长度为6个字符。
    @NameInMap("AppId")
    public String appId;

    // 查询弹幕消息列表的分页页数。应该从1开始，每次分页拉取时递增。
    @NameInMap("PageNum")
    public Integer pageNum;

    // 查询弹幕消息列表的分页大小。最小不得小于1，最大不得超过100。如果超过100，会被截断为前100条。
    @NameInMap("PageSize")
    public Integer pageSize;

    // 房间的唯一标识，在调用CreateRoom时返回。
    @NameInMap("RoomId")
    public String roomId;

    // 查询弹幕消息列表的排序方式。取值仅限0和1，其中0表示按照弹幕消息创建时间递增的顺序拉取，1表示按照弹幕消息创建时间递减的时间拉取。
    @NameInMap("SortType")
    public Integer sortType;

    // 操作人用户ID，表示谁执行了查询弹幕消息列表的操作。
    @NameInMap("UserId")
    public String userId;

    public static ListCommentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCommentsRequest self = new ListCommentsRequest();
        return TeaModel.build(map, self);
    }

    public ListCommentsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListCommentsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListCommentsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCommentsRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public ListCommentsRequest setSortType(Integer sortType) {
        this.sortType = sortType;
        return this;
    }
    public Integer getSortType() {
        return this.sortType;
    }

    public ListCommentsRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
