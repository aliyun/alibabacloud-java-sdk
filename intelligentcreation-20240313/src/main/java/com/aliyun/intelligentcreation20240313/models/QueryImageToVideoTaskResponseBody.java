// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class QueryImageToVideoTaskResponseBody extends TeaModel {
    @NameInMap("message")
    public String message;

    @NameInMap("originUrl")
    public String originUrl;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("status")
    public Integer status;

    @NameInMap("success")
    public Boolean success;

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
