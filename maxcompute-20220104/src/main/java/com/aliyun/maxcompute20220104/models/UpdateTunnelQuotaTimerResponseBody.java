// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateTunnelQuotaTimerResponseBody extends TeaModel {
    /**
     * <p>The returned result.</p>
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
     * <li><p>1xx: informational response. The request was received and is being processed.</p>
     * </li>
     * <li><p>2xx: success. The request was successfully received, understood, and accepted by the server.</p>
     * </li>
     * <li><p>3xx: redirection. The request is redirected. You must take further action to complete the request.</p>
     * </li>
     * <li><p>4xx: client error. The request contains invalid request parameters or syntax, or cannot be fulfilled.</p>
     * </li>
     * <li><p>5xx: server error. The server cannot fulfill the request for other reasons.</p>
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
     * <p>0bc12e4316675560945192024e1044</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateTunnelQuotaTimerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTunnelQuotaTimerResponseBody self = new UpdateTunnelQuotaTimerResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTunnelQuotaTimerResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UpdateTunnelQuotaTimerResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateTunnelQuotaTimerResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public UpdateTunnelQuotaTimerResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public UpdateTunnelQuotaTimerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
