// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeRoomListRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("RoomId")
    public String roomId;

    @NameInMap("AnchorId")
    public String anchorId;

    @NameInMap("RoomStatus")
    public Integer roomStatus;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Order")
    public String order;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeRoomListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRoomListRequest self = new DescribeRoomListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRoomListRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeRoomListRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public DescribeRoomListRequest setAnchorId(String anchorId) {
        this.anchorId = anchorId;
        return this;
    }
    public String getAnchorId() {
        return this.anchorId;
    }

    public DescribeRoomListRequest setRoomStatus(Integer roomStatus) {
        this.roomStatus = roomStatus;
        return this;
    }
    public Integer getRoomStatus() {
        return this.roomStatus;
    }

    public DescribeRoomListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeRoomListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeRoomListRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeRoomListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeRoomListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
