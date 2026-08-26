// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class LeaveMessageGroupResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-****-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return result.</p>
     */
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
        /**
         * <p>Indicates whether the user successfully left the message group. Valid values:</p>
         * <ul>
         * <li>true: Successful.</li>
         * <li>false: Unsuccessful.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
