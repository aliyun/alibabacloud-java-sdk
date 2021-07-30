// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class DestroyRoomResponseBody extends TeaModel {
    // 错误码。
    @NameInMap("errorCode")
    public String errorCode;

    // 错误信息。
    @NameInMap("errorMsg")
    public String errorMsg;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    // 请求是否成功。
    @NameInMap("ResponseSuccess")
    public Boolean responseSuccess;

    public static DestroyRoomResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DestroyRoomResponseBody self = new DestroyRoomResponseBody();
        return TeaModel.build(map, self);
    }

    public DestroyRoomResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DestroyRoomResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public DestroyRoomResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DestroyRoomResponseBody setResponseSuccess(Boolean responseSuccess) {
        this.responseSuccess = responseSuccess;
        return this;
    }
    public Boolean getResponseSuccess() {
        return this.responseSuccess;
    }

}
