// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CloseMessageGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CloseMessageGroupResponseBodyResult result;

    public static CloseMessageGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloseMessageGroupResponseBody self = new CloseMessageGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CloseMessageGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CloseMessageGroupResponseBody setResult(CloseMessageGroupResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CloseMessageGroupResponseBodyResult getResult() {
        return this.result;
    }

    public static class CloseMessageGroupResponseBodyResult extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        public static CloseMessageGroupResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CloseMessageGroupResponseBodyResult self = new CloseMessageGroupResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CloseMessageGroupResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
