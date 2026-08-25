// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CancelImageTestResponseBody extends TeaModel {
    /**
     * <p>The result of the API request.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public CancelImageTestResponseBodyData data;

    /**
     * <p>The request ID, which is used to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>6A6CBE87-9F91-1323-B680-E7A7065XXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CancelImageTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelImageTestResponseBody self = new CancelImageTestResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelImageTestResponseBody setData(CancelImageTestResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CancelImageTestResponseBodyData getData() {
        return this.data;
    }

    public CancelImageTestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelImageTestResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CancelImageTestResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the canceled image test execution.</p>
         * 
         * <strong>example:</strong>
         * <p>582d4896-d224-413b-b883-239eeebe0bc5</p>
         */
        @NameInMap("ProcessId")
        public String processId;

        /**
         * <p>Indicates whether the cancellation was triggered successfully.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static CancelImageTestResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CancelImageTestResponseBodyData self = new CancelImageTestResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CancelImageTestResponseBodyData setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public CancelImageTestResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
