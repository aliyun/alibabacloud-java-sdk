// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class QueryImageToVideoTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p><a href="https://xxx/xxx.mp4">https://xxx/xxx.mp4</a></p>
     */
    @NameInMap("originUrl")
    public String originUrl;

    /**
     * <strong>example:</strong>
     * <p>CC2967CA-0114-57E0-A0CF-7DEEEDAB953D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("status")
    public Integer status;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>868125994191405056</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static QueryImageToVideoTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryImageToVideoTaskResponseBody self = new QueryImageToVideoTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryImageToVideoTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryImageToVideoTaskResponseBody setOriginUrl(String originUrl) {
        this.originUrl = originUrl;
        return this;
    }
    public String getOriginUrl() {
        return this.originUrl;
    }

    public QueryImageToVideoTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryImageToVideoTaskResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public QueryImageToVideoTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryImageToVideoTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
