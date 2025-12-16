// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class TransferIntentionOwnerRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>P20210709190452000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>esp.wangwen</p>
     */
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("EmployeeCode")
    public String employeeCode;

    /**
     * <strong>example:</strong>
     * <p>67842</p>
     */
    @NameInMap("PersonId")
    public Integer personId;

    @NameInMap("Remark")
    public String remark;

    public static TransferIntentionOwnerRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferIntentionOwnerRequest self = new TransferIntentionOwnerRequest();
        return TeaModel.build(map, self);
    }

    public TransferIntentionOwnerRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public TransferIntentionOwnerRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public TransferIntentionOwnerRequest setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
        return this;
    }
    public String getEmployeeCode() {
        return this.employeeCode;
    }

    public TransferIntentionOwnerRequest setPersonId(Integer personId) {
        this.personId = personId;
        return this;
    }
    public Integer getPersonId() {
        return this.personId;
    }

    public TransferIntentionOwnerRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
