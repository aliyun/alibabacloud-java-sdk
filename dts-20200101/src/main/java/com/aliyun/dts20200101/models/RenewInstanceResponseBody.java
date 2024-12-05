// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class RenewInstanceResponseBody extends TeaModel {
    /**
     * <p>The billing method of the DTS instance. Only <strong>PREPAY</strong> may be returned, which indicates the subscription billing method.</p>
     * 
     * <strong>example:</strong>
     * <p>PREPAY</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The error code returned if the request failed.</p>
     * <blockquote>
     * <p>This parameter will be removed in the future.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The ID of the data synchronization or change tracking task.</p>
     * 
     * <strong>example:</strong>
     * <p>qi0r643lc31****</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The dynamic part in the error message. This parameter is used to replace the <strong>%s</strong> variable in the value of <strong>ErrMessage</strong>.</p>
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
     * <p>The time when the DTS instance expires after renewal. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ssZZZ</em> format. The time is displayed in UTC.</p>
     * <blockquote>
     * <p><strong>ZZZ</strong> indicates the offset of the time zone, which is displayed in the format of a plus sign (+) or a minus sign (-) followed by hours and minutes, such as <strong>+00:00</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-08-04T16:00:00.000+00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>The request processing has failed due to some unknown error.</p>
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
     * <p>The ID of the instance</p>
     * 
     * <strong>example:</strong>
     * <p>dtsqi0r643lc31****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1112E255-0C38-4970-8159-1D54AD92****</p>
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

    public static RenewInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenewInstanceResponseBody self = new RenewInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RenewInstanceResponseBody setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public RenewInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RenewInstanceResponseBody setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public RenewInstanceResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public RenewInstanceResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public RenewInstanceResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public RenewInstanceResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public RenewInstanceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public RenewInstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RenewInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RenewInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
