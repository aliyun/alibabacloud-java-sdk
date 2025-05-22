// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class SubmitIntentionNoteRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>I20210927144823000001</p>
     */
    @NameInMap("IntentionBizId")
    public String intentionBizId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Note")
    public String note;

    public static SubmitIntentionNoteRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitIntentionNoteRequest self = new SubmitIntentionNoteRequest();
        return TeaModel.build(map, self);
    }

    public SubmitIntentionNoteRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public SubmitIntentionNoteRequest setIntentionBizId(String intentionBizId) {
        this.intentionBizId = intentionBizId;
        return this;
    }
    public String getIntentionBizId() {
        return this.intentionBizId;
    }

    public SubmitIntentionNoteRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

}
