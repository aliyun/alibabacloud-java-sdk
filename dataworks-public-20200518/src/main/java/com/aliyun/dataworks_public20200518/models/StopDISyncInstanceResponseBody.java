// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class StopDISyncInstanceResponseBody extends TeaModel {
    /**
     * <p>The information returned for the synchronization task.</p>
     */
    @NameInMap("Data")
    public StopDISyncInstanceResponseBodyData data;

    /**
     * <p>The request ID. You can locate logs and troubleshoot issues based on the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc1411515937635973****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static StopDISyncInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopDISyncInstanceResponseBody self = new StopDISyncInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public StopDISyncInstanceResponseBody setData(StopDISyncInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StopDISyncInstanceResponseBodyData getData() {
        return this.data;
    }

    public StopDISyncInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopDISyncInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class StopDISyncInstanceResponseBodyData extends TeaModel {
        /**
         * <p>The reason why the synchronization task fails to be stopped.</p>
         * <p>If the synchronization task is stopped, the value null is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>fileId:[100] is invalid.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Indicates whether the synchronization task is stopped. Valid values:</p>
         * <ul>
         * <li>success</li>
         * <li>fail</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        public static StopDISyncInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StopDISyncInstanceResponseBodyData self = new StopDISyncInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StopDISyncInstanceResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public StopDISyncInstanceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
