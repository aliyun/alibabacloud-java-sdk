// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetDocTranslateTaskResponseBody extends TeaModel {
    @NameInMap("PageCount")
    public Integer pageCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TranslateErrorCode")
    public String translateErrorCode;

    @NameInMap("TranslateErrorMessage")
    public String translateErrorMessage;

    @NameInMap("TranslateFileUrl")
    public String translateFileUrl;

    public static GetDocTranslateTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDocTranslateTaskResponseBody self = new GetDocTranslateTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDocTranslateTaskResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public GetDocTranslateTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDocTranslateTaskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetDocTranslateTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetDocTranslateTaskResponseBody setTranslateErrorCode(String translateErrorCode) {
        this.translateErrorCode = translateErrorCode;
        return this;
    }
    public String getTranslateErrorCode() {
        return this.translateErrorCode;
    }

    public GetDocTranslateTaskResponseBody setTranslateErrorMessage(String translateErrorMessage) {
        this.translateErrorMessage = translateErrorMessage;
        return this;
    }
    public String getTranslateErrorMessage() {
        return this.translateErrorMessage;
    }

    public GetDocTranslateTaskResponseBody setTranslateFileUrl(String translateFileUrl) {
        this.translateFileUrl = translateFileUrl;
        return this;
    }
    public String getTranslateFileUrl() {
        return this.translateFileUrl;
    }

}
