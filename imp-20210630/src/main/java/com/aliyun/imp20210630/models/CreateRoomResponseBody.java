// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CreateRoomResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateRoomResponseBodyResult result;

    public static CreateRoomResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRoomResponseBody self = new CreateRoomResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRoomResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRoomResponseBody setResult(CreateRoomResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateRoomResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateRoomResponseBodyResult extends TeaModel {
        @NameInMap("RoomId")
        public String roomId;

        public static CreateRoomResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateRoomResponseBodyResult self = new CreateRoomResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateRoomResponseBodyResult setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

    }

}
