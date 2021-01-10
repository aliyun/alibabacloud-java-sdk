// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeForbidPushStreamRoomListResponseBody extends TeaModel {
    @NameInMap("TotalNum")
    public Integer totalNum;

    @NameInMap("TotalPage")
    public Integer totalPage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RoomList")
    public java.util.List<DescribeForbidPushStreamRoomListResponseBodyRoomList> roomList;

    public static DescribeForbidPushStreamRoomListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeForbidPushStreamRoomListResponseBody self = new DescribeForbidPushStreamRoomListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeForbidPushStreamRoomListResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public DescribeForbidPushStreamRoomListResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public DescribeForbidPushStreamRoomListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeForbidPushStreamRoomListResponseBody setRoomList(java.util.List<DescribeForbidPushStreamRoomListResponseBodyRoomList> roomList) {
        this.roomList = roomList;
        return this;
    }
    public java.util.List<DescribeForbidPushStreamRoomListResponseBodyRoomList> getRoomList() {
        return this.roomList;
    }

    public static class DescribeForbidPushStreamRoomListResponseBodyRoomList extends TeaModel {
        @NameInMap("OpEndTime")
        public String opEndTime;

        @NameInMap("AnchorId")
        public String anchorId;

        @NameInMap("OpStartTime")
        public String opStartTime;

        @NameInMap("RoomId")
        public String roomId;

        public static DescribeForbidPushStreamRoomListResponseBodyRoomList build(java.util.Map<String, ?> map) throws Exception {
            DescribeForbidPushStreamRoomListResponseBodyRoomList self = new DescribeForbidPushStreamRoomListResponseBodyRoomList();
            return TeaModel.build(map, self);
        }

        public DescribeForbidPushStreamRoomListResponseBodyRoomList setOpEndTime(String opEndTime) {
            this.opEndTime = opEndTime;
            return this;
        }
        public String getOpEndTime() {
            return this.opEndTime;
        }

        public DescribeForbidPushStreamRoomListResponseBodyRoomList setAnchorId(String anchorId) {
            this.anchorId = anchorId;
            return this;
        }
        public String getAnchorId() {
            return this.anchorId;
        }

        public DescribeForbidPushStreamRoomListResponseBodyRoomList setOpStartTime(String opStartTime) {
            this.opStartTime = opStartTime;
            return this;
        }
        public String getOpStartTime() {
            return this.opStartTime;
        }

        public DescribeForbidPushStreamRoomListResponseBodyRoomList setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

    }

}
