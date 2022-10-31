// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class JoinMessageGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public JoinMessageGroupResponseBodyResult result;

    public static JoinMessageGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        JoinMessageGroupResponseBody self = new JoinMessageGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public JoinMessageGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public JoinMessageGroupResponseBody setResult(JoinMessageGroupResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public JoinMessageGroupResponseBodyResult getResult() {
        return this.result;
    }

    public static class JoinMessageGroupResponseBodyResult extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        public static JoinMessageGroupResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            JoinMessageGroupResponseBodyResult self = new JoinMessageGroupResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public JoinMessageGroupResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
