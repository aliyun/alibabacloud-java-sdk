// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetDocTranslateTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageCount")
    public Integer pageCount;

    /**
     * <strong>example:</strong>
     * <p>12952E92-FDF3-4D3C-88E3-242D72BA7150</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>translated</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>0586df512c8b4bb382d7d9a6a01b5854</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <strong>example:</strong>
     * <p>Error</p>
     */
    @NameInMap("TranslateErrorCode")
    public String translateErrorCode;

    /**
     * <strong>example:</strong>
     * <p>Fail to get the page number of document.</p>
     */
    @NameInMap("TranslateErrorMessage")
    public String translateErrorMessage;

    /**
     * <strong>example:</strong>
     * <p><a href="http://translateFileUrl">http://translateFileUrl</a></p>
     */
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
