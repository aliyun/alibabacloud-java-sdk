// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyApsSlsADBJobResponseBody extends TeaModel {
    /**
     * <p>The status code or POP error code.</p>
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
     * <p>{&quot;test&quot;:&quot;test&quot;,&quot;test2&quot;:1}</p>
     */
    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    /**
     * <p>The HTTP status code returned by the request. A status code of 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The execution result of applying the suggestion. Valid values:</p>
     * <ul>
     * <li>If the request is successful, <strong>SUCCESS</strong> is returned.</li>
     * <li>If an exception occurs, the specific error message is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>-3EEC-</strong></strong></strong>-9F06-******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ModifyApsSlsADBJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyApsSlsADBJobResponseBody self = new ModifyApsSlsADBJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyApsSlsADBJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyApsSlsADBJobResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public ModifyApsSlsADBJobResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModifyApsSlsADBJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyApsSlsADBJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyApsSlsADBJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
