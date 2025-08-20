// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class CheckThirdRightSendPlanShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cc</p>
     */
    @NameInMap("BizGroup")
    public String bizGroup;

    /**
     * <strong>example:</strong>
     * <p>ailabs</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ExtendInfo")
    public String extendInfoShrink;

    /**
     * <strong>example:</strong>
     * <p>01000019100307010000600</p>
     */
    @NameInMap("Sn")
    public String sn;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SupplierId")
    public Long supplierId;

    public static CheckThirdRightSendPlanShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckThirdRightSendPlanShrinkRequest self = new CheckThirdRightSendPlanShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CheckThirdRightSendPlanShrinkRequest setBizGroup(String bizGroup) {
        this.bizGroup = bizGroup;
        return this;
    }
    public String getBizGroup() {
        return this.bizGroup;
    }

    public CheckThirdRightSendPlanShrinkRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CheckThirdRightSendPlanShrinkRequest setExtendInfoShrink(String extendInfoShrink) {
        this.extendInfoShrink = extendInfoShrink;
        return this;
    }
    public String getExtendInfoShrink() {
        return this.extendInfoShrink;
    }

    public CheckThirdRightSendPlanShrinkRequest setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

    public CheckThirdRightSendPlanShrinkRequest setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
        return this;
    }
    public Long getSupplierId() {
        return this.supplierId;
    }

}
