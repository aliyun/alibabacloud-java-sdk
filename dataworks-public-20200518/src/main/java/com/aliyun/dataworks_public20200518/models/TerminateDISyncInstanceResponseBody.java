// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class TerminateDISyncInstanceResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the real-time synchronization node is terminated. Valid values:</p>
     * <br>
     * <p>*   success</p>
     * <p>*   fail</p>
     */
    @NameInMap("Data")
    public TerminateDISyncInstanceResponseBodyData data;

    /**
     * <p>The result of the operation.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the request. You can query logs and troubleshoot issues based on the ID.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static TerminateDISyncInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TerminateDISyncInstanceResponseBody self = new TerminateDISyncInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public TerminateDISyncInstanceResponseBody setData(TerminateDISyncInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TerminateDISyncInstanceResponseBodyData getData() {
        return this.data;
    }

    public TerminateDISyncInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TerminateDISyncInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TerminateDISyncInstanceResponseBodyData extends TeaModel {
        @NameInMap("Message")
        public String message;

        /**
         * <p>The reason why the real-time synchronization node fails to be terminated. If the real-time synchronization node is terminated, this parameter is left empty.</p>
         */
        @NameInMap("Status")
        public String status;

        public static TerminateDISyncInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TerminateDISyncInstanceResponseBodyData self = new TerminateDISyncInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TerminateDISyncInstanceResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public TerminateDISyncInstanceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
