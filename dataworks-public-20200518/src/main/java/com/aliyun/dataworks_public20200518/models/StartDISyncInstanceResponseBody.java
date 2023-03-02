// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class StartDISyncInstanceResponseBody extends TeaModel {
    /**
     * <p>The result returned for the start.</p>
     */
    @NameInMap("Data")
    public StartDISyncInstanceResponseBodyData data;

    /**
     * <p>The ID of the request. You can locate logs and troubleshoot issues based on the ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   true: The request succeeded.</p>
     * <p>*   false: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static StartDISyncInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartDISyncInstanceResponseBody self = new StartDISyncInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public StartDISyncInstanceResponseBody setData(StartDISyncInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StartDISyncInstanceResponseBodyData getData() {
        return this.data;
    }

    public StartDISyncInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartDISyncInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class StartDISyncInstanceResponseBodyData extends TeaModel {
        /**
         * <p>The reason why the real-time synchronization node or the data synchronization solution fails to be started.</p>
         * <br>
         * <p>If the real-time synchronization node or the data synchronization solution is started, the value null is returned.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Indicates whether the real-time synchronization node or the data synchronization solution is started. Valid values:</p>
         * <br>
         * <p>*   success: The real-time synchronization node or the data synchronization solution is started.</p>
         * <p>*   fail: The real-time synchronization node or the data synchronization solution fails to be started. You can troubleshoot the issue based on the provided cause.</p>
         */
        @NameInMap("Status")
        public String status;

        public static StartDISyncInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StartDISyncInstanceResponseBodyData self = new StartDISyncInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StartDISyncInstanceResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public StartDISyncInstanceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
