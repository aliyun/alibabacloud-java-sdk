// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeRoomListResponseBody extends TeaModel {
    @NameInMap("TotalNum")
    public Integer totalNum;

    @NameInMap("TotalPage")
    public Integer totalPage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RoomList")
    public java.util.List<DescribeRoomListResponseBodyRoomList> roomList;

    public static DescribeRoomListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRoomListResponseBody self = new DescribeRoomListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRoomListResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public DescribeRoomListResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public DescribeRoomListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRoomListResponseBody setRoomList(java.util.List<DescribeRoomListResponseBodyRoomList> roomList) {
        this.roomList = roomList;
        return this;
    }
    public java.util.List<DescribeRoomListResponseBodyRoomList> getRoomList() {
        return this.roomList;
    }

    public static class DescribeRoomListResponseBodyRoomList extends TeaModel {
        @NameInMap("AnchorId")
        public String anchorId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ForbidStream")
        public String forbidStream;

        @NameInMap("RoomId")
        public String roomId;

        @NameInMap("RoomStatus")
        public Integer roomStatus;

        public static DescribeRoomListResponseBodyRoomList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRoomListResponseBodyRoomList self = new DescribeRoomListResponseBodyRoomList();
            return TeaModel.build(map, self);
        }

        public DescribeRoomListResponseBodyRoomList setAnchorId(String anchorId) {
            this.anchorId = anchorId;
            return this;
        }
        public String getAnchorId() {
            return this.anchorId;
        }

        public DescribeRoomListResponseBodyRoomList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeRoomListResponseBodyRoomList setForbidStream(String forbidStream) {
            this.forbidStream = forbidStream;
            return this;
        }
        public String getForbidStream() {
            return this.forbidStream;
        }

        public DescribeRoomListResponseBodyRoomList setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public DescribeRoomListResponseBodyRoomList setRoomStatus(Integer roomStatus) {
            this.roomStatus = roomStatus;
            return this;
        }
        public Integer getRoomStatus() {
            return this.roomStatus;
        }

    }

}
