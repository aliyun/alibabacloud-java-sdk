// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeForbidPushStreamRoomListResponse extends TeaModel {
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
    public java.util.List<DescribeForbidPushStreamRoomListResponseRoomList> roomList;

    public static DescribeForbidPushStreamRoomListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeForbidPushStreamRoomListResponse self = new DescribeForbidPushStreamRoomListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeForbidPushStreamRoomListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeForbidPushStreamRoomListResponse setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public DescribeForbidPushStreamRoomListResponse setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public DescribeForbidPushStreamRoomListResponse setRoomList(java.util.List<DescribeForbidPushStreamRoomListResponseRoomList> roomList) {
        this.roomList = roomList;
        return this;
    }
    public java.util.List<DescribeForbidPushStreamRoomListResponseRoomList> getRoomList() {
        return this.roomList;
    }

    public static class DescribeForbidPushStreamRoomListResponseRoomList extends TeaModel {
        @NameInMap("RoomId")
        @Validation(required = true)
        public String roomId;

        @NameInMap("AnchorId")
        @Validation(required = true)
        public String anchorId;

        @NameInMap("OpStartTime")
        @Validation(required = true)
        public String opStartTime;

        @NameInMap("OpEndTime")
        @Validation(required = true)
        public String opEndTime;

        public static DescribeForbidPushStreamRoomListResponseRoomList build(java.util.Map<String, ?> map) throws Exception {
            DescribeForbidPushStreamRoomListResponseRoomList self = new DescribeForbidPushStreamRoomListResponseRoomList();
            return TeaModel.build(map, self);
        }

        public DescribeForbidPushStreamRoomListResponseRoomList setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public DescribeForbidPushStreamRoomListResponseRoomList setAnchorId(String anchorId) {
            this.anchorId = anchorId;
            return this;
        }
        public String getAnchorId() {
            return this.anchorId;
        }

        public DescribeForbidPushStreamRoomListResponseRoomList setOpStartTime(String opStartTime) {
            this.opStartTime = opStartTime;
            return this;
        }
        public String getOpStartTime() {
            return this.opStartTime;
        }

        public DescribeForbidPushStreamRoomListResponseRoomList setOpEndTime(String opEndTime) {
            this.opEndTime = opEndTime;
            return this;
        }
        public String getOpEndTime() {
            return this.opEndTime;
        }

    }

}
