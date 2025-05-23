// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class OperateProduceForPartnerRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>P20210930105636000001</p>
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
     * <p>{\&quot;beianServiceNumber\&quot;:\&quot;9969c666-0935-4c5b-8042-926ff546e39f\&quot;}</p>
     */
    @NameInMap("ExtInfo")
    public String extInfo;

    /**
     * <strong>example:</strong>
     * <p>CERT_MATERIAL_SUBMITTED</p>
     */
    @NameInMap("OperateType")
    public String operateType;

    public static OperateProduceForPartnerRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateProduceForPartnerRequest self = new OperateProduceForPartnerRequest();
        return TeaModel.build(map, self);
    }

    public OperateProduceForPartnerRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public OperateProduceForPartnerRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public OperateProduceForPartnerRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public OperateProduceForPartnerRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

}
