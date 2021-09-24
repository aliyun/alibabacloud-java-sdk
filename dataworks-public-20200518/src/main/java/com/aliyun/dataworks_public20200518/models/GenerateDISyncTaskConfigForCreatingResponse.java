// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GenerateDISyncTaskConfigForCreatingResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public GenerateDISyncTaskConfigForCreatingResponseData data;

    public static GenerateDISyncTaskConfigForCreatingResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateDISyncTaskConfigForCreatingResponse self = new GenerateDISyncTaskConfigForCreatingResponse();
        return TeaModel.build(map, self);
    }

    public GenerateDISyncTaskConfigForCreatingResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateDISyncTaskConfigForCreatingResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GenerateDISyncTaskConfigForCreatingResponse setData(GenerateDISyncTaskConfigForCreatingResponseData data) {
        this.data = data;
        return this;
    }
    public GenerateDISyncTaskConfigForCreatingResponseData getData() {
        return this.data;
    }

    public static class GenerateDISyncTaskConfigForCreatingResponseData extends TeaModel {
        @NameInMap("ProcessId")
        @Validation(required = true)
        public Long processId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        public static GenerateDISyncTaskConfigForCreatingResponseData build(java.util.Map<String, ?> map) throws Exception {
            GenerateDISyncTaskConfigForCreatingResponseData self = new GenerateDISyncTaskConfigForCreatingResponseData();
            return TeaModel.build(map, self);
        }

        public GenerateDISyncTaskConfigForCreatingResponseData setProcessId(Long processId) {
            this.processId = processId;
            return this;
        }
        public Long getProcessId() {
            return this.processId;
        }

        public GenerateDISyncTaskConfigForCreatingResponseData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GenerateDISyncTaskConfigForCreatingResponseData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
