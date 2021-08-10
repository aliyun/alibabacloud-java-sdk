// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class OperateProduceForPartnerRequest extends TeaModel {
    @NameInMap("OperateType")
    public String operateType;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("ExtInfo")
    public String extInfo;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("Note")
    public String note;

    public static OperateProduceForPartnerRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateProduceForPartnerRequest self = new OperateProduceForPartnerRequest();
        return TeaModel.build(map, self);
    }

    public OperateProduceForPartnerRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public OperateProduceForPartnerRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public OperateProduceForPartnerRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public OperateProduceForPartnerRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public OperateProduceForPartnerRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

}
