// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class CloseUserIntentionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>esp.bookkeeping</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>I20201027162033000001</p>
     */
    @NameInMap("IntentionBizId")
    public String intentionBizId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Note")
    public String note;

    public static CloseUserIntentionRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseUserIntentionRequest self = new CloseUserIntentionRequest();
        return TeaModel.build(map, self);
    }

    public CloseUserIntentionRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CloseUserIntentionRequest setIntentionBizId(String intentionBizId) {
        this.intentionBizId = intentionBizId;
        return this;
    }
    public String getIntentionBizId() {
        return this.intentionBizId;
    }

    public CloseUserIntentionRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

}
