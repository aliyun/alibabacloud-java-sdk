// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeRoomListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalNum")
    @Validation(required = true)
    public Integer totalNum;

    @NameInMap("TotalPage")
    @Validation(required = true)
    public Integer totalPage;

    @NameInMap("RoomList")
    @Validation(required = true)
    public java.util.List<DescribeRoomListResponseRoomList> roomList;

    public static DescribeRoomListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRoomListResponse self = new DescribeRoomListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRoomListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRoomListResponse setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public DescribeRoomListResponse setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public DescribeRoomListResponse setRoomList(java.util.List<DescribeRoomListResponseRoomList> roomList) {
        this.roomList = roomList;
        return this;
    }
    public java.util.List<DescribeRoomListResponseRoomList> getRoomList() {
        return this.roomList;
    }

    public static class DescribeRoomListResponseRoomList extends TeaModel {
        @NameInMap("RoomId")
        @Validation(required = true)
        public String roomId;

        @NameInMap("AnchorId")
        @Validation(required = true)
        public String anchorId;

        @NameInMap("RoomStatus")
        @Validation(required = true)
        public Integer roomStatus;

        @NameInMap("ForbidStream")
        @Validation(required = true)
        public String forbidStream;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        public static DescribeRoomListResponseRoomList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRoomListResponseRoomList self = new DescribeRoomListResponseRoomList();
            return TeaModel.build(map, self);
        }

        public DescribeRoomListResponseRoomList setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public DescribeRoomListResponseRoomList setAnchorId(String anchorId) {
            this.anchorId = anchorId;
            return this;
        }
        public String getAnchorId() {
            return this.anchorId;
        }

        public DescribeRoomListResponseRoomList setRoomStatus(Integer roomStatus) {
            this.roomStatus = roomStatus;
            return this;
        }
        public Integer getRoomStatus() {
            return this.roomStatus;
        }

        public DescribeRoomListResponseRoomList setForbidStream(String forbidStream) {
            this.forbidStream = forbidStream;
            return this;
        }
        public String getForbidStream() {
            return this.forbidStream;
        }

        public DescribeRoomListResponseRoomList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

    }

}
