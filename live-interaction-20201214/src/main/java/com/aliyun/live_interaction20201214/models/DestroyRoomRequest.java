// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class DestroyRoomRequest extends TeaModel {
    @NameInMap("Request")
    public DestroyRoomRequestRequest request;

    public static DestroyRoomRequest build(java.util.Map<String, ?> map) throws Exception {
        DestroyRoomRequest self = new DestroyRoomRequest();
        return TeaModel.build(map, self);
    }

    public DestroyRoomRequest setRequest(DestroyRoomRequestRequest request) {
        this.request = request;
        return this;
    }
    public DestroyRoomRequestRequest getRequest() {
        return this.request;
    }

    public static class DestroyRoomRequestRequest extends TeaModel {
        @NameInMap("domain")
        public String domain;

        @NameInMap("openId")
        public String openId;

        @NameInMap("roomId")
        public String roomId;

        public static DestroyRoomRequestRequest build(java.util.Map<String, ?> map) throws Exception {
            DestroyRoomRequestRequest self = new DestroyRoomRequestRequest();
            return TeaModel.build(map, self);
        }

        public DestroyRoomRequestRequest setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DestroyRoomRequestRequest setOpenId(String openId) {
            this.openId = openId;
            return this;
        }
        public String getOpenId() {
            return this.openId;
        }

        public DestroyRoomRequestRequest setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

    }

}
