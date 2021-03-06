// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class CreateRoomResponseBody extends TeaModel {
    @NameInMap("ResponseSuccess")
    public Boolean responseSuccess;

    // 错误码
    @NameInMap("errorCode")
    public String errorCode;

    // 错误信息
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

    public CreateRoomResponseBody setResponseSuccess(Boolean responseSuccess) {
        this.responseSuccess = responseSuccess;
        return this;
    }
    public Boolean getResponseSuccess() {
        return this.responseSuccess;
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
        // 房间id
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
