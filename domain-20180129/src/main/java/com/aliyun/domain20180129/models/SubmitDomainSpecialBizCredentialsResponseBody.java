// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SubmitDomainSpecialBizCredentialsResponseBody extends TeaModel {
    /**
     * <p>Indicates whether retries are allowed.</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <p>The name of the application for which the error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>test-com</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The array of error parameters that are returned.</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>The error code.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>110001</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <p>The HTTP status code that is directly returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned data.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Module")
    public Object module;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A83E1D74-E46B-505C-947A-8C6B7E41C011</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>Indicates whether to perform synchronous processing.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Synchro")
    public Boolean synchro;

    public static SubmitDomainSpecialBizCredentialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitDomainSpecialBizCredentialsResponseBody self = new SubmitDomainSpecialBizCredentialsResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitDomainSpecialBizCredentialsResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public SubmitDomainSpecialBizCredentialsResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SubmitDomainSpecialBizCredentialsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public SubmitDomainSpecialBizCredentialsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public SubmitDomainSpecialBizCredentialsResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public SubmitDomainSpecialBizCredentialsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SubmitDomainSpecialBizCredentialsResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public SubmitDomainSpecialBizCredentialsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SubmitDomainSpecialBizCredentialsResponseBody setModule(Object module) {
        this.module = module;
        return this;
    }
    public Object getModule() {
        return this.module;
    }

    public SubmitDomainSpecialBizCredentialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitDomainSpecialBizCredentialsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SubmitDomainSpecialBizCredentialsResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

}
