// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetDocumentDownloadUrlResponseBody extends TeaModel {
    /**
     * <p>API status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>OSS file access URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://oos-cn.ctyunapi.cn/example-bucket/test/1.jpg">https://oos-cn.ctyunapi.cn/example-bucket/test/1.jpg</a></p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Message of the returned result.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>C7BE80B4-7692-54FA-AB22-2A7DF08C4754</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Whether the call was successful: - <strong>true</strong>: The call was successful. - <strong>false</strong>: The call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDocumentDownloadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentDownloadUrlResponseBody self = new GetDocumentDownloadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDocumentDownloadUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDocumentDownloadUrlResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetDocumentDownloadUrlResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDocumentDownloadUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDocumentDownloadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDocumentDownloadUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
