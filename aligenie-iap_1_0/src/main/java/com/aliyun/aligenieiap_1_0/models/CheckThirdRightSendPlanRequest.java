// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class CheckThirdRightSendPlanRequest extends TeaModel {
    @NameInMap("BizGroup")
    public String bizGroup;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("ExtendInfo")
    public java.util.Map<String, ?> extendInfo;

    @NameInMap("Sn")
    public String sn;

    @NameInMap("SupplierId")
    public Long supplierId;

    public static CheckThirdRightSendPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckThirdRightSendPlanRequest self = new CheckThirdRightSendPlanRequest();
        return TeaModel.build(map, self);
    }

    public CheckThirdRightSendPlanRequest setBizGroup(String bizGroup) {
        this.bizGroup = bizGroup;
        return this;
    }
    public String getBizGroup() {
        return this.bizGroup;
    }

    public CheckThirdRightSendPlanRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CheckThirdRightSendPlanRequest setExtendInfo(java.util.Map<String, ?> extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public java.util.Map<String, ?> getExtendInfo() {
        return this.extendInfo;
    }

    public CheckThirdRightSendPlanRequest setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

    public CheckThirdRightSendPlanRequest setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
        return this;
    }
    public Long getSupplierId() {
        return this.supplierId;
    }

}
