// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class OperateCallCenterForPartnerRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>esp.beian_assist</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <strong>example:</strong>
     * <p>MakeCall</p>
     */
    @NameInMap("CallAction")
    public String callAction;

    /**
     * <strong>example:</strong>
     * <p>12323213</p>
     */
    @NameInMap("EmployeeCode")
    public String employeeCode;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Request")
    public String request;

    /**
     * <strong>example:</strong>
     * <p>t4uor8evmq9nk</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static OperateCallCenterForPartnerRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateCallCenterForPartnerRequest self = new OperateCallCenterForPartnerRequest();
        return TeaModel.build(map, self);
    }

    public OperateCallCenterForPartnerRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public OperateCallCenterForPartnerRequest setCallAction(String callAction) {
        this.callAction = callAction;
        return this;
    }
    public String getCallAction() {
        return this.callAction;
    }

    public OperateCallCenterForPartnerRequest setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
        return this;
    }
    public String getEmployeeCode() {
        return this.employeeCode;
    }

    public OperateCallCenterForPartnerRequest setRequest(String request) {
        this.request = request;
        return this;
    }
    public String getRequest() {
        return this.request;
    }

    public OperateCallCenterForPartnerRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
