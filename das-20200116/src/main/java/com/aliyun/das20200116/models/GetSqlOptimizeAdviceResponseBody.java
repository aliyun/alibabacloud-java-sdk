// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetSqlOptimizeAdviceResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The detailed information, including the error codes and the number of entries that are returned.</p>
     */
    @NameInMap("Data")
    public GetSqlOptimizeAdviceResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>>  If the request was successful, Successful is returned. If the request failed, an error message such as an error code is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
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
        /**
         * <p>The time when the task was created. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The URL that is used to download the file.</p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>The time when the file expires. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * <br>
         * <p>>  The file expires three days after the task is created.</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The status of the task. Valid values:</p>
         * <br>
         * <p>*   **INIT**: The task is being initialized.</p>
         * <p>*   **RUNNING**: The task is running.</p>
         * <p>*   **FINISH**: The task is complete.</p>
         * <p>*   **FAILED**: The task failed.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The status code of the task. Valid values:</p>
         * <br>
         * <p>*   **NO_DATA**: No data is returned.</p>
         * <p>*   **INTERNAL_ERROR**: An internal error occurred.</p>
         * <p>*   **SUCCESS**: The task is successful.</p>
         */
        @NameInMap("StatusCode")
        public String statusCode;

        /**
         * <p>The task ID.</p>
         */
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
