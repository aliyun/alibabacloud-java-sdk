// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RunImageTestResponseBody extends TeaModel {
    /**
     * <p>The result of the API request.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public RunImageTestResponseBodyData data;

    /**
     * <p>The request ID, which is used to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>6A6CBE87-9F91-1323-B680-E7A7065XXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static RunImageTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunImageTestResponseBody self = new RunImageTestResponseBody();
        return TeaModel.build(map, self);
    }

    public RunImageTestResponseBody setData(RunImageTestResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RunImageTestResponseBodyData getData() {
        return this.data;
    }

    public RunImageTestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunImageTestResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RunImageTestResponseBodyData extends TeaModel {
        /**
         * <p>The image test execution ID.</p>
         * 
         * <strong>example:</strong>
         * <p>582d4896-d224-413b-b883-239eeebe0bc5</p>
         */
        @NameInMap("ProcessId")
        public String processId;

        /**
         * <p>Indicates whether the trigger is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static RunImageTestResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RunImageTestResponseBodyData self = new RunImageTestResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RunImageTestResponseBodyData setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public RunImageTestResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
