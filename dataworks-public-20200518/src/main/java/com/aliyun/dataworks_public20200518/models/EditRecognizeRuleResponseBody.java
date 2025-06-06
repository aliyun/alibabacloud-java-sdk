// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class EditRecognizeRuleResponseBody extends TeaModel {
    /**
     * <p>The returned result in the JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;HttpStatusCode&quot;: 200, &quot;Success&quot;: true }</p>
     */
    @NameInMap("Data")
    public Object data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>9990030003</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Missing parameter</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static EditRecognizeRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EditRecognizeRuleResponseBody self = new EditRecognizeRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public EditRecognizeRuleResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public EditRecognizeRuleResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public EditRecognizeRuleResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public EditRecognizeRuleResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public EditRecognizeRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EditRecognizeRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
