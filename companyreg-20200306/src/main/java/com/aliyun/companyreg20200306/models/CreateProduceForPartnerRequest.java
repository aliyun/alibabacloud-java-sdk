// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class CreateProduceForPartnerRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>P20210301102840000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>esp.hightech</p>
     */
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("ExtInfo")
    public String extInfo;

    public static CreateProduceForPartnerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProduceForPartnerRequest self = new CreateProduceForPartnerRequest();
        return TeaModel.build(map, self);
    }

    public CreateProduceForPartnerRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateProduceForPartnerRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateProduceForPartnerRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
