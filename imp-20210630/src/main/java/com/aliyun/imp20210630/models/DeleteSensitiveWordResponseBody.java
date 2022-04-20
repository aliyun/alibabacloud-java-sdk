// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DeleteSensitiveWordResponseBody extends TeaModel {
    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    // 调用发送直播间弹幕的返回结果。
    @NameInMap("Result")
    public DeleteSensitiveWordResponseBodyResult result;

    public static DeleteSensitiveWordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSensitiveWordResponseBody self = new DeleteSensitiveWordResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSensitiveWordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSensitiveWordResponseBody setResult(DeleteSensitiveWordResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteSensitiveWordResponseBodyResult getResult() {
        return this.result;
    }

    public static class DeleteSensitiveWordResponseBodyResult extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        public static DeleteSensitiveWordResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteSensitiveWordResponseBodyResult self = new DeleteSensitiveWordResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteSensitiveWordResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
