// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateProjectBasicMetaResponseBody extends TeaModel {
    /**
     * <p>The response result.</p>
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
     * <li>1xx: Informational responses - The request has been received and is being processed.</li>
     * <li>2xx: Success - The request has been successfully received, understood, and accepted by the server.</li>
     * <li>3xx: Redirection - The request has been redirected. Further action is required to complete the request.</li>
     * <li>4xx: Client error - The request contains invalid parameters, syntax errors, or specific request conditions that cannot be met.</li>
     * <li>5xx: Server error - The server is unable to fulfill the request due to other reasons.</li>
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
