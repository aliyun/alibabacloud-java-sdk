// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class QueryDISyncTaskConfigProcessResultResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryDISyncTaskConfigProcessResultResponseData data;

    public static QueryDISyncTaskConfigProcessResultResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDISyncTaskConfigProcessResultResponse self = new QueryDISyncTaskConfigProcessResultResponse();
        return TeaModel.build(map, self);
    }

    public QueryDISyncTaskConfigProcessResultResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDISyncTaskConfigProcessResultResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDISyncTaskConfigProcessResultResponse setData(QueryDISyncTaskConfigProcessResultResponseData data) {
        this.data = data;
        return this;
    }
    public QueryDISyncTaskConfigProcessResultResponseData getData() {
        return this.data;
    }

    public static class QueryDISyncTaskConfigProcessResultResponseData extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        @NameInMap("TaskContent")
        @Validation(required = true)
        public String taskContent;

        public static QueryDISyncTaskConfigProcessResultResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryDISyncTaskConfigProcessResultResponseData self = new QueryDISyncTaskConfigProcessResultResponseData();
            return TeaModel.build(map, self);
        }

        public QueryDISyncTaskConfigProcessResultResponseData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryDISyncTaskConfigProcessResultResponseData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryDISyncTaskConfigProcessResultResponseData setTaskContent(String taskContent) {
            this.taskContent = taskContent;
            return this;
        }
        public String getTaskContent() {
            return this.taskContent;
        }

    }

}
