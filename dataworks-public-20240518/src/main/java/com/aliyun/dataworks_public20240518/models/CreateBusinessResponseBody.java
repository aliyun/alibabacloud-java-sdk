// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateBusinessResponseBody extends TeaModel {
    /**
     * <p>Business Process ID.</p>
     * 
     * <strong>example:</strong>
     * <p>100001</p>
     */
    @NameInMap("BusinessId")
    public Long businessId;

    /**
     * <p>Error code. The value is as follows:</p>
     * <ul>
     * <li><p>If the request succeeds, the ErrorCode field is not returned.</p>
     * </li>
     * <li><p>If the request fails, the ErrorCode field is returned.</p>
     * </li>
     * </ul>
     * <p>For more information, see the error code list in this topic.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid.Tenant.ConnectionNotExists</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>Error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The connection does not exist.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The unique ID of this request.<br>
     * If an error occurs, you can use this ID to troubleshoot the issue.</p>
     * 
     * <strong>example:</strong>
     * <p>0000-ABCD-EFG****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the invocation succeeded. Valid values:</p>
     * <ul>
     * <li><p>true: The invocation succeeded.</p>
     * </li>
     * <li><p>false: The invocation failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateBusinessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBusinessResponseBody self = new CreateBusinessResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBusinessResponseBody setBusinessId(Long businessId) {
        this.businessId = businessId;
        return this;
    }
    public Long getBusinessId() {
        return this.businessId;
    }

    public CreateBusinessResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateBusinessResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateBusinessResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateBusinessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateBusinessResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
