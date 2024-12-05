// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateJobMonitorRuleResponseBody extends TeaModel {
    /**
     * <p>The error code. This parameter will be removed in the future.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The ID of the data migration, data synchronization, or change tracking task.</p>
     * 
     * <strong>example:</strong>
     * <p>i03e3zty16i****</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The dynamic part in the error message. The value of this parameter is used to replace the \<em>\</em>%s\<em>\</em> variable in the value of <strong>ErrMessage</strong>.</p>
     * <blockquote>
     * <p>If the return value of <strong>ErrMessage</strong> is <strong>The Value of Input Parameter %s is not valid</strong> and the return value of <strong>DynamicMessage</strong> is <strong>DtsJobId</strong>, the specified value of <strong>DtsJobId</strong> is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>DtsJobId</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>403</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>The Value of Input Parameter %s is not valid.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

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
     * <p>8C498360-7892-433C-847A-BA71A850****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateJobMonitorRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateJobMonitorRuleResponseBody self = new CreateJobMonitorRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateJobMonitorRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateJobMonitorRuleResponseBody setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public CreateJobMonitorRuleResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public CreateJobMonitorRuleResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public CreateJobMonitorRuleResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public CreateJobMonitorRuleResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateJobMonitorRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateJobMonitorRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
