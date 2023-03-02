// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GenerateDISyncTaskConfigForCreatingResponseBody extends TeaModel {
    /**
     * <p>The information returned for the ID of the asynchronous thread.</p>
     */
    @NameInMap("Data")
    public GenerateDISyncTaskConfigForCreatingResponseBodyData data;

    /**
     * <p>The ID of the request. You can locate logs and troubleshoot issues based on the ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   true: The request is successful.</p>
     * <p>*   false: The request fails.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GenerateDISyncTaskConfigForCreatingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateDISyncTaskConfigForCreatingResponseBody self = new GenerateDISyncTaskConfigForCreatingResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateDISyncTaskConfigForCreatingResponseBody setData(GenerateDISyncTaskConfigForCreatingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateDISyncTaskConfigForCreatingResponseBodyData getData() {
        return this.data;
    }

    public GenerateDISyncTaskConfigForCreatingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateDISyncTaskConfigForCreatingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GenerateDISyncTaskConfigForCreatingResponseBodyData extends TeaModel {
        /**
         * <p>The reason why the ID of the asynchronous thread fails to be generated.</p>
         * <br>
         * <p>If the ID is successfully generated, the value null is returned.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The ID of the asynchronous thread. You can call the [QueryDISyncTaskConfigProcessResult](~~383465~~) operation to obtain the asynchronously generated parameters based on the ID. The parameters are used to create a real-time synchronization node or a synchronization solution in Data Integration.</p>
         */
        @NameInMap("ProcessId")
        public Long processId;

        /**
         * <p>Indicates whether the ID of the asynchronous thread is generated. Valid values:</p>
         * <br>
         * <p>*   success: indicates that the ID of the asynchronous thread is generated.</p>
         * <p>*   fail: indicates that the ID of the asynchronous thread fails to be generated. You can view the reason for the failure and troubleshoot the issue based on the reason.</p>
         */
        @NameInMap("Status")
        public String status;

        public static GenerateDISyncTaskConfigForCreatingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateDISyncTaskConfigForCreatingResponseBodyData self = new GenerateDISyncTaskConfigForCreatingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateDISyncTaskConfigForCreatingResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GenerateDISyncTaskConfigForCreatingResponseBodyData setProcessId(Long processId) {
            this.processId = processId;
            return this;
        }
        public Long getProcessId() {
            return this.processId;
        }

        public GenerateDISyncTaskConfigForCreatingResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
