// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CreateRoomResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // API请求的返回结果结构体。
    @NameInMap("Result")
    public CreateRoomResponseBodyResult result;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

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

    public CreateRoomResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateRoomResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public static class CreateRoomResponseBodyResult extends TeaModel {
        // 房间id
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
