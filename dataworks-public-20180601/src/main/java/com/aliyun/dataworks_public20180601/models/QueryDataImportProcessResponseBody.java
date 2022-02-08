// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class QueryDataImportProcessResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public QueryDataImportProcessResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryDataImportProcessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDataImportProcessResponseBody self = new QueryDataImportProcessResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDataImportProcessResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryDataImportProcessResponseBody setData(QueryDataImportProcessResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDataImportProcessResponseBodyData getData() {
        return this.data;
    }

    public QueryDataImportProcessResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryDataImportProcessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryDataImportProcessResponseBodyData extends TeaModel {
        @NameInMap("TaskId")
        public String taskId;

        public static QueryDataImportProcessResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDataImportProcessResponseBodyData self = new QueryDataImportProcessResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDataImportProcessResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
