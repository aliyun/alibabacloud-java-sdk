// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class GetVariableResponseBody extends TeaModel {
    /**
     * <p>allowRetry</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <p>appName</p>
     * 
     * <strong>example:</strong>
     * <p>voldemort-aliyun-com</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>dynamicCode</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>dynamicMessage</p>
     * 
     * <strong>example:</strong>
     * <p>can not find env: eleme-zb-pre</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>errorCode</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>errorMsg</p>
     * 
     * <strong>example:</strong>
     * <p>Success. Request Success.</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <p>httpStatusCode</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>module</p>
     * 
     * <strong>example:</strong>
     * <p>207,155</p>
     */
    @NameInMap("Module")
    public String module;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>D28419C9-335E-50A7-BD7D-ACF250A825E8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>success</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetVariableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVariableResponseBody self = new GetVariableResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVariableResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public GetVariableResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetVariableResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetVariableResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetVariableResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetVariableResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetVariableResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetVariableResponseBody setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public GetVariableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVariableResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
