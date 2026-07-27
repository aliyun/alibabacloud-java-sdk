// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgGetVisitStatResponseBody extends TeaModel {
    /**
     * <p>The authentication error details.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The details of the file.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Data")
    public Object data;

    /**
     * <p>The error code. The value is the same as ErrorCode.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("DynamicErrorCode")
    public String dynamicErrorCode;

    /**
     * <p>The error message. The value is the same as ErrorMessage.</p>
     * 
     * <strong>example:</strong>
     * <p>Missing parameter</p>
     */
    @NameInMap("DynamicErrorMessage")
    public String dynamicErrorMessage;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid.Tenant.ConnectionNotExists</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
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
     * <p>952795279527ab****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DsgGetVisitStatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DsgGetVisitStatResponseBody self = new DsgGetVisitStatResponseBody();
        return TeaModel.build(map, self);
    }

    public DsgGetVisitStatResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DsgGetVisitStatResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public DsgGetVisitStatResponseBody setDynamicErrorCode(String dynamicErrorCode) {
        this.dynamicErrorCode = dynamicErrorCode;
        return this;
    }
    public String getDynamicErrorCode() {
        return this.dynamicErrorCode;
    }

    public DsgGetVisitStatResponseBody setDynamicErrorMessage(String dynamicErrorMessage) {
        this.dynamicErrorMessage = dynamicErrorMessage;
        return this;
    }
    public String getDynamicErrorMessage() {
        return this.dynamicErrorMessage;
    }

    public DsgGetVisitStatResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DsgGetVisitStatResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DsgGetVisitStatResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DsgGetVisitStatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DsgGetVisitStatResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
