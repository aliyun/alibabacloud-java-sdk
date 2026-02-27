// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitVideoAuditResponseBody extends TeaModel {
    /**
     * <p>业务处理结果状态码</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>视频审校任务提交后的返回数据</p>
     */
    @NameInMap("Data")
    public SubmitVideoAuditResponseBodyData data;

    /**
     * <p>HTTP响应状态码</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>业务处理结果描述信息</p>
     * 
     * <strong>example:</strong>
     * <p>任务提交成功</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>本次API请求的唯一标识</p>
     * 
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>请求是否处理成功</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SubmitVideoAuditResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoAuditResponseBody self = new SubmitVideoAuditResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitVideoAuditResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitVideoAuditResponseBody setData(SubmitVideoAuditResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitVideoAuditResponseBodyData getData() {
        return this.data;
    }

    public SubmitVideoAuditResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SubmitVideoAuditResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitVideoAuditResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitVideoAuditResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitVideoAuditResponseBodyData extends TeaModel {
        /**
         * <p>视频审校任务的唯一标识，可用于后续查询任务状态和结果</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static SubmitVideoAuditResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitVideoAuditResponseBodyData self = new SubmitVideoAuditResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitVideoAuditResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
