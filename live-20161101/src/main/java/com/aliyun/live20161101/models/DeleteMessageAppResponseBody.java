// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteMessageAppResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DeleteMessageAppResponseBodyResult result;

    public static DeleteMessageAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMessageAppResponseBody self = new DeleteMessageAppResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMessageAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMessageAppResponseBody setResult(DeleteMessageAppResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteMessageAppResponseBodyResult getResult() {
        return this.result;
    }

    public static class DeleteMessageAppResponseBodyResult extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        public static DeleteMessageAppResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteMessageAppResponseBodyResult self = new DeleteMessageAppResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteMessageAppResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
