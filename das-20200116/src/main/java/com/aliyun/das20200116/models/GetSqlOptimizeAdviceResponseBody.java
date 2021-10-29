// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetSqlOptimizeAdviceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSqlOptimizeAdviceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static GetSqlOptimizeAdviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSqlOptimizeAdviceResponseBody self = new GetSqlOptimizeAdviceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSqlOptimizeAdviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSqlOptimizeAdviceResponseBody setData(GetSqlOptimizeAdviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSqlOptimizeAdviceResponseBodyData getData() {
        return this.data;
    }

    public GetSqlOptimizeAdviceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSqlOptimizeAdviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSqlOptimizeAdviceResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetSqlOptimizeAdviceResponseBodyData extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("StatusCode")
        public String statusCode;

        @NameInMap("TaskId")
        public String taskId;

        public static GetSqlOptimizeAdviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSqlOptimizeAdviceResponseBodyData self = new GetSqlOptimizeAdviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSqlOptimizeAdviceResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetSqlOptimizeAdviceResponseBodyData setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public GetSqlOptimizeAdviceResponseBodyData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public GetSqlOptimizeAdviceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetSqlOptimizeAdviceResponseBodyData setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

        public GetSqlOptimizeAdviceResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
