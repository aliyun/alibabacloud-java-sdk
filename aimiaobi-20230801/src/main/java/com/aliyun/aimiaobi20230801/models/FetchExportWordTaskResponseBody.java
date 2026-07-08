// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class FetchExportWordTaskResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public FetchExportWordTaskResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. \<code>true\\</code>: successful. \<code>false\\</code>: failed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static FetchExportWordTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FetchExportWordTaskResponseBody self = new FetchExportWordTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public FetchExportWordTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FetchExportWordTaskResponseBody setData(FetchExportWordTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public FetchExportWordTaskResponseBodyData getData() {
        return this.data;
    }

    public FetchExportWordTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public FetchExportWordTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FetchExportWordTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FetchExportWordTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class FetchExportWordTaskResponseBodyData extends TeaModel {
        /**
         * <p>The file URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxx/xxx.xls">http://xxx/xxx.xls</a></p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <p>The status of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>PENDING-待执行、RUNNING-执行中、SUCCESSED-成功、SUSPENDED-暂停、FAILED-失败、CANCELLED-取消</p>
         */
        @NameInMap("TaskStats")
        public String taskStats;

        public static FetchExportWordTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FetchExportWordTaskResponseBodyData self = new FetchExportWordTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FetchExportWordTaskResponseBodyData setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public FetchExportWordTaskResponseBodyData setTaskStats(String taskStats) {
            this.taskStats = taskStats;
            return this;
        }
        public String getTaskStats() {
            return this.taskStats;
        }

    }

}
