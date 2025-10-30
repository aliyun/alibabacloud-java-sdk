// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class RecordCallCenterEventForPartnerRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>P20211117141528000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

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
     * <p>18578602216</p>
     */
    @NameInMap("Callee")
    public String callee;

    /**
     * <strong>example:</strong>
     * <p>13162828888</p>
     */
    @NameInMap("Caller")
    public String caller;

    /**
     * <strong>example:</strong>
     * <p>12313</p>
     */
    @NameInMap("ConnId")
    public String connId;

    /**
     * <strong>example:</strong>
     * <p>897265</p>
     */
    @NameInMap("ContactId")
    public String contactId;

    @NameInMap("EmployeeCode")
    public String employeeCode;

    /**
     * <strong>example:</strong>
     * <p>ufbo502ma94m480</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>RequestId</p>
     * 
     * <strong>example:</strong>
     * <p>1000030990004</p>
     */
    @NameInMap("RelatedId")
    public Long relatedId;

    /**
     * <strong>example:</strong>
     * <p>MTAFA/DF#</p>
     */
    @NameInMap("SecretMobile")
    public String secretMobile;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SkillType")
    public Integer skillType;

    @NameInMap("TenantId")
    public String tenantId;

    public static RecordCallCenterEventForPartnerRequest build(java.util.Map<String, ?> map) throws Exception {
        RecordCallCenterEventForPartnerRequest self = new RecordCallCenterEventForPartnerRequest();
        return TeaModel.build(map, self);
    }

    public RecordCallCenterEventForPartnerRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public RecordCallCenterEventForPartnerRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public RecordCallCenterEventForPartnerRequest setCallAction(String callAction) {
        this.callAction = callAction;
        return this;
    }
    public String getCallAction() {
        return this.callAction;
    }

    public RecordCallCenterEventForPartnerRequest setCallee(String callee) {
        this.callee = callee;
        return this;
    }
    public String getCallee() {
        return this.callee;
    }

    public RecordCallCenterEventForPartnerRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

    public RecordCallCenterEventForPartnerRequest setConnId(String connId) {
        this.connId = connId;
        return this;
    }
    public String getConnId() {
        return this.connId;
    }

    public RecordCallCenterEventForPartnerRequest setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public RecordCallCenterEventForPartnerRequest setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
        return this;
    }
    public String getEmployeeCode() {
        return this.employeeCode;
    }

    public RecordCallCenterEventForPartnerRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public RecordCallCenterEventForPartnerRequest setRelatedId(Long relatedId) {
        this.relatedId = relatedId;
        return this;
    }
    public Long getRelatedId() {
        return this.relatedId;
    }

    public RecordCallCenterEventForPartnerRequest setSecretMobile(String secretMobile) {
        this.secretMobile = secretMobile;
        return this;
    }
    public String getSecretMobile() {
        return this.secretMobile;
    }

    public RecordCallCenterEventForPartnerRequest setSkillType(Integer skillType) {
        this.skillType = skillType;
        return this;
    }
    public Integer getSkillType() {
        return this.skillType;
    }

    public RecordCallCenterEventForPartnerRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
