// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GenerateDISyncTaskConfigForCreatingResponseBody extends TeaModel {
    @NameInMap("Data")
    public GenerateDISyncTaskConfigForCreatingResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Message")
        public String message;

        @NameInMap("ProcessId")
        public Long processId;

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
