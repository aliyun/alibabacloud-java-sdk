// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateMessageAppResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public UpdateMessageAppResponseBodyResult result;

    public static UpdateMessageAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMessageAppResponseBody self = new UpdateMessageAppResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMessageAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMessageAppResponseBody setResult(UpdateMessageAppResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateMessageAppResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateMessageAppResponseBodyResult extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        public static UpdateMessageAppResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateMessageAppResponseBodyResult self = new UpdateMessageAppResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateMessageAppResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
