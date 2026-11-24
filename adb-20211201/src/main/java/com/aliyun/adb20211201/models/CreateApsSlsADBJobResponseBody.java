// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateApsSlsADBJobResponseBody extends TeaModel {
    /**
     * <p>The operation status code or POP error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidInput</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>aps-aa11111aa1aa1a1a</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The HTTP status code returned by the request. A status code of 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message returned for the call result. Valid values:</p>
     * <ul>
     * <li>If the request is normal, <strong>Success</strong> is returned. </li>
     * <li>If the request is abnormal, the specific error message is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>-3EEC-</strong></strong></strong>-9F06-******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The precheck result. Valid values:</p>
     * <ul>
     * <li><strong>success</strong>: The check passed.</li>
     * <li><strong>false</strong>: The check failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateApsSlsADBJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateApsSlsADBJobResponseBody self = new CreateApsSlsADBJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateApsSlsADBJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateApsSlsADBJobResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateApsSlsADBJobResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateApsSlsADBJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateApsSlsADBJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateApsSlsADBJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
