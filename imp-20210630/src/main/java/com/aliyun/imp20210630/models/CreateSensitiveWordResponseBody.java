// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CreateSensitiveWordResponseBody extends TeaModel {
    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    // 调用发送直播间弹幕的返回结果。
    @NameInMap("Result")
    public CreateSensitiveWordResponseBodyResult result;

    public static CreateSensitiveWordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSensitiveWordResponseBody self = new CreateSensitiveWordResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSensitiveWordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSensitiveWordResponseBody setResult(CreateSensitiveWordResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateSensitiveWordResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateSensitiveWordResponseBodyResult extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        public static CreateSensitiveWordResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateSensitiveWordResponseBodyResult self = new CreateSensitiveWordResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateSensitiveWordResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
