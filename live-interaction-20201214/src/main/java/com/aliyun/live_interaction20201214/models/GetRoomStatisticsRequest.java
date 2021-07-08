// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class GetRoomStatisticsRequest extends TeaModel {
    // 请求参数的结构体。
    @NameInMap("Request")
    public GetRoomStatisticsRequestRequest request;

    public static GetRoomStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRoomStatisticsRequest self = new GetRoomStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetRoomStatisticsRequest setRequest(GetRoomStatisticsRequestRequest request) {
        this.request = request;
        return this;
    }
    public GetRoomStatisticsRequestRequest getRequest() {
        return this.request;
    }

    public static class GetRoomStatisticsRequestRequest extends TeaModel {
        // 应用的appKey。
        @NameInMap("Domain")
        public String domain;

        // 房间ID，由调用CreateRoom时返回。
        @NameInMap("RoomId")
        public String roomId;

        public static GetRoomStatisticsRequestRequest build(java.util.Map<String, ?> map) throws Exception {
            GetRoomStatisticsRequestRequest self = new GetRoomStatisticsRequestRequest();
            return TeaModel.build(map, self);
        }

        public GetRoomStatisticsRequestRequest setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetRoomStatisticsRequestRequest setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

    }

}
