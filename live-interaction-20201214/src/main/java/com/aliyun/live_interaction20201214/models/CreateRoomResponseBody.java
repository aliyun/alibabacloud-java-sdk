// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class CreateRoomResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("success")
    public Boolean success;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMsg")
    public String errorMsg;

    @NameInMap("Result")
    public CreateRoomResponseBodyResult result;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateRoomResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRoomResponseBody self = new CreateRoomResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRoomResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateRoomResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateRoomResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public CreateRoomResponseBody setResult(CreateRoomResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateRoomResponseBodyResult getResult() {
        return this.result;
    }

    public CreateRoomResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateRoomResponseBodyResult extends TeaModel {
        @NameInMap("roomId")
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
