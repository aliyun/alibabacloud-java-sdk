// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class SwitchPhysicalDtsJobToCloudResponseBody extends TeaModel {
    /**
     * <p>Dynamic error code, this parameter will be deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>403</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>Dynamic error message used to replace the <strong>%s</strong> in the <strong>ErrMessage</strong> return parameter.  &gt; If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong>, and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, it indicates that the request parameter <strong>DtsJobId</strong> is invalid.</p>
     * 
     * <strong>example:</strong>
     * <p>DtsJobId</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>Error code returned when the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>Returns the corresponding error message when an invocation error occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>The request processing has failed due to some unknown error.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>Status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>659304E3-D44E-5EFA-BDE3-60015E30403B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SwitchPhysicalDtsJobToCloudResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SwitchPhysicalDtsJobToCloudResponseBody self = new SwitchPhysicalDtsJobToCloudResponseBody();
        return TeaModel.build(map, self);
    }

    public SwitchPhysicalDtsJobToCloudResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public SwitchPhysicalDtsJobToCloudResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public SwitchPhysicalDtsJobToCloudResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public SwitchPhysicalDtsJobToCloudResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public SwitchPhysicalDtsJobToCloudResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SwitchPhysicalDtsJobToCloudResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SwitchPhysicalDtsJobToCloudResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
