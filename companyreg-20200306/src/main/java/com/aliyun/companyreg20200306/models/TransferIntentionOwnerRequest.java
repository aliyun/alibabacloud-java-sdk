// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class TransferIntentionOwnerRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("BizType")
    public String bizType;

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
