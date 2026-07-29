// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class GetExecuteStatementEnabledResponseBody extends TeaModel {
    /**
     * <p>Indicates whether SQL execution through OpenAPI is allowed (<code>true</code>) or not (<code>false</code>).</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("data")
    public Boolean data;

    /**
     * <ul>
     * <li><p>The error code that is returned if the request fails (when <code>success</code> is <code>false</code>).</p>
     * </li>
     * <li><p>This parameter is empty if the request is successful (when <code>success</code> is <code>true</code>).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <ul>
     * <li><p>The error message that is returned if the request fails (when <code>success</code> is <code>false</code>).</p>
     * </li>
     * <li><p>This parameter is empty if the request is successful (when <code>success</code> is <code>true</code>).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2C2ECDC1-FBAD-14A5-AA4A-96BC787FBDBC</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetExecuteStatementEnabledResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExecuteStatementEnabledResponseBody self = new GetExecuteStatementEnabledResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExecuteStatementEnabledResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public GetExecuteStatementEnabledResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetExecuteStatementEnabledResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetExecuteStatementEnabledResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetExecuteStatementEnabledResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetExecuteStatementEnabledResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
