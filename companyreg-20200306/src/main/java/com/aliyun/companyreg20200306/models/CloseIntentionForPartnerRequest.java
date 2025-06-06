// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class CloseIntentionForPartnerRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>esp.beian_assist</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>I20211105230733000001</p>
     */
    @NameInMap("IntentionBizId")
    public String intentionBizId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Note")
    public String note;

    public static CloseIntentionForPartnerRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseIntentionForPartnerRequest self = new CloseIntentionForPartnerRequest();
        return TeaModel.build(map, self);
    }

    public CloseIntentionForPartnerRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CloseIntentionForPartnerRequest setIntentionBizId(String intentionBizId) {
        this.intentionBizId = intentionBizId;
        return this;
    }
    public String getIntentionBizId() {
        return this.intentionBizId;
    }

    public CloseIntentionForPartnerRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

}
