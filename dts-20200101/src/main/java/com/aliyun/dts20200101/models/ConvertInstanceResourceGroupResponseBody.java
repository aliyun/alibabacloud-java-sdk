// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ConvertInstanceResourceGroupResponseBody extends TeaModel {
    /**
     * <p>The error code returned by the backend service. The number is incremented.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The dynamic part in the error message. This parameter is used to replace the \<em>\</em>%s\<em>\</em> variable in the <strong>ErrMessage</strong> parameter.</p>
     * <blockquote>
     * <p> If <strong>The Value of Input Parameter %s is not valid</strong> is returned and DtsJobId is returned for DynamicMessage, it indicates that the request parameter DtsJobId is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>DtsJobId</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error code returned when the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned when the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>The Value of Input Parameter %s is not valid.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of a request.</p>
     * 
     * <strong>example:</strong>
     * <p>AD823BD3-1BA6-4117-A536-165CB280****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ConvertInstanceResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConvertInstanceResourceGroupResponseBody self = new ConvertInstanceResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ConvertInstanceResourceGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ConvertInstanceResourceGroupResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ConvertInstanceResourceGroupResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ConvertInstanceResourceGroupResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ConvertInstanceResourceGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ConvertInstanceResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConvertInstanceResourceGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
