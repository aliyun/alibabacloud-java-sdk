// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class TerminateDISyncInstanceResponseBody extends TeaModel {
    /**
     * <p>The returned results.</p>
     */
    @NameInMap("Data")
    public TerminateDISyncInstanceResponseBodyData data;

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
        /**
         * <p>The reason why the real-time synchronization task fails to be terminated. If the real-time synchronization task is undeployed, the value of this parameter is null.</p>
         * 
         * <strong>example:</strong>
         * <p>fileId:[100] is invalid.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Indicates whether the real-time synchronization task is undeployed. Valid values:</p>
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
