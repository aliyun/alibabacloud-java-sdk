// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateMessageGroupResponseBody extends TeaModel {
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
    public UpdateMessageGroupResponseBodyResult result;

    public static UpdateMessageGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMessageGroupResponseBody self = new UpdateMessageGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMessageGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMessageGroupResponseBody setResult(UpdateMessageGroupResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateMessageGroupResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateMessageGroupResponseBodyResult extends TeaModel {
        /**
         * <p>Indicates whether the update was successful. Valid values:</p>
         * <ul>
         * <li>true: The update was successful.</li>
         * <li>false: The update failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static UpdateMessageGroupResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateMessageGroupResponseBodyResult self = new UpdateMessageGroupResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateMessageGroupResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
