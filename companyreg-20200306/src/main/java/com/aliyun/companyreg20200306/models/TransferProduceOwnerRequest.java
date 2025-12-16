// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class TransferProduceOwnerRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>P20210208152920000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>esp.companyreg_cloud</p>
     */
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("EmployeeCode")
    public String employeeCode;

    /**
     * <strong>example:</strong>
     * <p>15565</p>
     */
    @NameInMap("PersonId")
    public Integer personId;

    @NameInMap("Remark")
    public String remark;

    public static TransferProduceOwnerRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferProduceOwnerRequest self = new TransferProduceOwnerRequest();
        return TeaModel.build(map, self);
    }

    public TransferProduceOwnerRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public TransferProduceOwnerRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public TransferProduceOwnerRequest setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
        return this;
    }
    public String getEmployeeCode() {
        return this.employeeCode;
    }

    public TransferProduceOwnerRequest setPersonId(Integer personId) {
        this.personId = personId;
        return this;
    }
    public Integer getPersonId() {
        return this.personId;
    }

    public TransferProduceOwnerRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
