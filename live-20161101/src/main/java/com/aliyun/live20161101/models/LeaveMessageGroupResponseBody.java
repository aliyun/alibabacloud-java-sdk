// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class LeaveMessageGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public LeaveMessageGroupResponseBodyResult result;

    public static LeaveMessageGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LeaveMessageGroupResponseBody self = new LeaveMessageGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public LeaveMessageGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LeaveMessageGroupResponseBody setResult(LeaveMessageGroupResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public LeaveMessageGroupResponseBodyResult getResult() {
        return this.result;
    }

    public static class LeaveMessageGroupResponseBodyResult extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        public static LeaveMessageGroupResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            LeaveMessageGroupResponseBodyResult self = new LeaveMessageGroupResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public LeaveMessageGroupResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
