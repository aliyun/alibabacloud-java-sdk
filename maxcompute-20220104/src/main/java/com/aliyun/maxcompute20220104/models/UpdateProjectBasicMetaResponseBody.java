// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateProjectBasicMetaResponseBody extends TeaModel {
    /**
     * <p>The result of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("data")
    public String data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>OBJECT_NOT_EXIST</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>This object does not exist.</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>The HTTP status code.</p>
     * <ul>
     * <li><p>1xx: Informational response - The request has been received and is being processed.</p>
     * </li>
     * <li><p>2xx: Success - The request was successfully received, understood, and accepted.</p>
     * </li>
     * <li><p>3xx: Redirection - The request was redirected. Further action is needed to complete the request.</p>
     * </li>
     * <li><p>4xx: Client error - The request contains incorrect request parameters or syntax, or cannot be fulfilled.</p>
     * </li>
     * <li><p>5xx: Server error - The server failed to fulfill the request for other reasons.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0b87b7e216652820458545253e8b0a</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateProjectBasicMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectBasicMetaResponseBody self = new UpdateProjectBasicMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProjectBasicMetaResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UpdateProjectBasicMetaResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateProjectBasicMetaResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public UpdateProjectBasicMetaResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public UpdateProjectBasicMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
