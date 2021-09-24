// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GenerateDISyncTaskConfigForUpdatingResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public GenerateDISyncTaskConfigForUpdatingResponseData data;

    public static GenerateDISyncTaskConfigForUpdatingResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateDISyncTaskConfigForUpdatingResponse self = new GenerateDISyncTaskConfigForUpdatingResponse();
        return TeaModel.build(map, self);
    }

    public GenerateDISyncTaskConfigForUpdatingResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateDISyncTaskConfigForUpdatingResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GenerateDISyncTaskConfigForUpdatingResponse setData(GenerateDISyncTaskConfigForUpdatingResponseData data) {
        this.data = data;
        return this;
    }
    public GenerateDISyncTaskConfigForUpdatingResponseData getData() {
        return this.data;
    }

    public static class GenerateDISyncTaskConfigForUpdatingResponseData extends TeaModel {
        @NameInMap("ProcessId")
        @Validation(required = true)
        public Long processId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        public static GenerateDISyncTaskConfigForUpdatingResponseData build(java.util.Map<String, ?> map) throws Exception {
            GenerateDISyncTaskConfigForUpdatingResponseData self = new GenerateDISyncTaskConfigForUpdatingResponseData();
            return TeaModel.build(map, self);
        }

        public GenerateDISyncTaskConfigForUpdatingResponseData setProcessId(Long processId) {
            this.processId = processId;
            return this;
        }
        public Long getProcessId() {
            return this.processId;
        }

        public GenerateDISyncTaskConfigForUpdatingResponseData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GenerateDISyncTaskConfigForUpdatingResponseData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
