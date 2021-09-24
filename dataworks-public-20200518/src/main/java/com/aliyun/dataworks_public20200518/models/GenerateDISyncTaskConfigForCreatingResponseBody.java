// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GenerateDISyncTaskConfigForCreatingResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GenerateDISyncTaskConfigForCreatingResponseBodyData data;

    public static GenerateDISyncTaskConfigForCreatingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateDISyncTaskConfigForCreatingResponseBody self = new GenerateDISyncTaskConfigForCreatingResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateDISyncTaskConfigForCreatingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GenerateDISyncTaskConfigForCreatingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateDISyncTaskConfigForCreatingResponseBody setData(GenerateDISyncTaskConfigForCreatingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateDISyncTaskConfigForCreatingResponseBodyData getData() {
        return this.data;
    }

    public static class GenerateDISyncTaskConfigForCreatingResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ProcessId")
        public Long processId;

        @NameInMap("Message")
        public String message;

        public static GenerateDISyncTaskConfigForCreatingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateDISyncTaskConfigForCreatingResponseBodyData self = new GenerateDISyncTaskConfigForCreatingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateDISyncTaskConfigForCreatingResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GenerateDISyncTaskConfigForCreatingResponseBodyData setProcessId(Long processId) {
            this.processId = processId;
            return this;
        }
        public Long getProcessId() {
            return this.processId;
        }

        public GenerateDISyncTaskConfigForCreatingResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
