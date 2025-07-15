// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class JoinMessageGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-****-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
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
        /**
         * <p>Indicates whether the users successfully joined the message group. Valid values:</p>
         * <ul>
         * <li>true: The users successfully joined the message group.</li>
         * <li>false: The users failed to join the message group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
