// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class QueryDISyncTaskConfigProcessResultResponseBody extends TeaModel {
    @NameInMap("Data")
    public QueryDISyncTaskConfigProcessResultResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryDISyncTaskConfigProcessResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDISyncTaskConfigProcessResultResponseBody self = new QueryDISyncTaskConfigProcessResultResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDISyncTaskConfigProcessResultResponseBody setData(QueryDISyncTaskConfigProcessResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDISyncTaskConfigProcessResultResponseBodyData getData() {
        return this.data;
    }

    public QueryDISyncTaskConfigProcessResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDISyncTaskConfigProcessResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDISyncTaskConfigProcessResultResponseBodyData extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskContent")
        public String taskContent;

        public static QueryDISyncTaskConfigProcessResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDISyncTaskConfigProcessResultResponseBodyData self = new QueryDISyncTaskConfigProcessResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDISyncTaskConfigProcessResultResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryDISyncTaskConfigProcessResultResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryDISyncTaskConfigProcessResultResponseBodyData setTaskContent(String taskContent) {
            this.taskContent = taskContent;
            return this;
        }
        public String getTaskContent() {
            return this.taskContent;
        }

    }

}
