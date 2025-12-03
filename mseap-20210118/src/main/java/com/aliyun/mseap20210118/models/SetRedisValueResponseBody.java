// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class SetRedisValueResponseBody extends TeaModel {
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
     * <p>cloudquery</p>
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
     * <p>10.151.12.0/24,100.104.36.0/26,47.102.181.0/24,100.104.52.0/24,47.101.109.0/24,120.55.129.0/24,11.115.103.0/24,47.102.234.0/24</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>errorCode</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>errorMsg</p>
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
     * <p>71,135</p>
     */
    @NameInMap("Module")
    public Boolean module;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>195BABE2-7105-5C16-ABCE-2D0997CCE2E3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>success</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SetRedisValueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetRedisValueResponseBody self = new SetRedisValueResponseBody();
        return TeaModel.build(map, self);
    }

    public SetRedisValueResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public SetRedisValueResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SetRedisValueResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public SetRedisValueResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public SetRedisValueResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SetRedisValueResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public SetRedisValueResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SetRedisValueResponseBody setModule(Boolean module) {
        this.module = module;
        return this;
    }
    public Boolean getModule() {
        return this.module;
    }

    public SetRedisValueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetRedisValueResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
