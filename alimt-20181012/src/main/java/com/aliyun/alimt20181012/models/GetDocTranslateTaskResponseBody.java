// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetDocTranslateTaskResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("TranslateErrorMessage")
    public String translateErrorMessage;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageCount")
    public Integer pageCount;

    @NameInMap("TranslateFileUrl")
    public String translateFileUrl;

    @NameInMap("TranslateErrorCode")
    public String translateErrorCode;

    public static GetDocTranslateTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDocTranslateTaskResponseBody self = new GetDocTranslateTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDocTranslateTaskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetDocTranslateTaskResponseBody setTranslateErrorMessage(String translateErrorMessage) {
        this.translateErrorMessage = translateErrorMessage;
        return this;
    }
    public String getTranslateErrorMessage() {
        return this.translateErrorMessage;
    }

    public GetDocTranslateTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetDocTranslateTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDocTranslateTaskResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public GetDocTranslateTaskResponseBody setTranslateFileUrl(String translateFileUrl) {
        this.translateFileUrl = translateFileUrl;
        return this;
    }
    public String getTranslateFileUrl() {
        return this.translateFileUrl;
    }

    public GetDocTranslateTaskResponseBody setTranslateErrorCode(String translateErrorCode) {
        this.translateErrorCode = translateErrorCode;
        return this;
    }
    public String getTranslateErrorCode() {
        return this.translateErrorCode;
    }

}
