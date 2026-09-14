// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetUpdateTaskResultResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>7C352CB7-CD88-50CF-9D0D-E81BDF020E7F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The node update result.</p>
     */
    @NameInMap("Result")
    public GetUpdateTaskResultResponseBodyResult result;

    public static GetUpdateTaskResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUpdateTaskResultResponseBody self = new GetUpdateTaskResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUpdateTaskResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUpdateTaskResultResponseBody setResult(GetUpdateTaskResultResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetUpdateTaskResultResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetUpdateTaskResultResponseBodyResult extends TeaModel {
        /**
         * <p>The failure message. This field is returned if the update fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Invalid Param xxx</p>
         */
        @NameInMap("FailureMessage")
        public String failureMessage;

        /**
         * <p>The update status. Valid values:</p>
         * <ul>
         * <li>Updating: The node is being updated.</li>
         * <li>Updated: The node is updated.</li>
         * <li>UpdateFailed: The node failed to be updated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Updated</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetUpdateTaskResultResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetUpdateTaskResultResponseBodyResult self = new GetUpdateTaskResultResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetUpdateTaskResultResponseBodyResult setFailureMessage(String failureMessage) {
            this.failureMessage = failureMessage;
            return this;
        }
        public String getFailureMessage() {
            return this.failureMessage;
        }

        public GetUpdateTaskResultResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
