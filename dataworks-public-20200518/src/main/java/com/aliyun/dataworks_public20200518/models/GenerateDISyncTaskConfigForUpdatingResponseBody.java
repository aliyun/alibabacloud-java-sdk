// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GenerateDISyncTaskConfigForUpdatingResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GenerateDISyncTaskConfigForUpdatingResponseBodyData data;

    public static GenerateDISyncTaskConfigForUpdatingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateDISyncTaskConfigForUpdatingResponseBody self = new GenerateDISyncTaskConfigForUpdatingResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateDISyncTaskConfigForUpdatingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GenerateDISyncTaskConfigForUpdatingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateDISyncTaskConfigForUpdatingResponseBody setData(GenerateDISyncTaskConfigForUpdatingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateDISyncTaskConfigForUpdatingResponseBodyData getData() {
        return this.data;
    }

    public static class GenerateDISyncTaskConfigForUpdatingResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ProcessId")
        public Long processId;

        @NameInMap("Message")
        public String message;

        public static GenerateDISyncTaskConfigForUpdatingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateDISyncTaskConfigForUpdatingResponseBodyData self = new GenerateDISyncTaskConfigForUpdatingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateDISyncTaskConfigForUpdatingResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GenerateDISyncTaskConfigForUpdatingResponseBodyData setProcessId(Long processId) {
            this.processId = processId;
            return this;
        }
        public Long getProcessId() {
            return this.processId;
        }

        public GenerateDISyncTaskConfigForUpdatingResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
