// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp_room20210515.models;

import com.aliyun.tea.*;

public class GetRoomDetailRequest extends TeaModel {
    @NameInMap("Request")
    public GetRoomDetailRequestRequest request;

    public static GetRoomDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRoomDetailRequest self = new GetRoomDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetRoomDetailRequest setRequest(GetRoomDetailRequestRequest request) {
        this.request = request;
        return this;
    }
    public GetRoomDetailRequestRequest getRequest() {
        return this.request;
    }

    public static class GetRoomDetailRequestRequest extends TeaModel {
        // 租户名
        @NameInMap("Domain")
        public String domain;

        // 房间id
        @NameInMap("RoomId")
        public String roomId;

        public static GetRoomDetailRequestRequest build(java.util.Map<String, ?> map) throws Exception {
            GetRoomDetailRequestRequest self = new GetRoomDetailRequestRequest();
            return TeaModel.build(map, self);
        }

        public GetRoomDetailRequestRequest setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetRoomDetailRequestRequest setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

    }

}
