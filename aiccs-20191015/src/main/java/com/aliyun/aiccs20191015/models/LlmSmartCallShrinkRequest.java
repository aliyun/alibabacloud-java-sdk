// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class LlmSmartCallShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>F32XXX2CF9</p>
     */
    @NameInMap("ApplicationCode")
    public String applicationCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>137****0000</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <strong>example:</strong>
     * <p>057188040000</p>
     */
    @NameInMap("CallerNumber")
    public String callerNumber;

    /**
     * <strong>example:</strong>
     * <p>222356****</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("PromptParam")
    public String promptParamShrink;

    @NameInMap("StartWordParam")
    public String startWordParamShrink;

    public static LlmSmartCallShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        LlmSmartCallShrinkRequest self = new LlmSmartCallShrinkRequest();
        return TeaModel.build(map, self);
    }

    public LlmSmartCallShrinkRequest setApplicationCode(String applicationCode) {
        this.applicationCode = applicationCode;
        return this;
    }
    public String getApplicationCode() {
        return this.applicationCode;
    }

    public LlmSmartCallShrinkRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public LlmSmartCallShrinkRequest setCallerNumber(String callerNumber) {
        this.callerNumber = callerNumber;
        return this;
    }
    public String getCallerNumber() {
        return this.callerNumber;
    }

    public LlmSmartCallShrinkRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public LlmSmartCallShrinkRequest setPromptParamShrink(String promptParamShrink) {
        this.promptParamShrink = promptParamShrink;
        return this;
    }
    public String getPromptParamShrink() {
        return this.promptParamShrink;
    }

    public LlmSmartCallShrinkRequest setStartWordParamShrink(String startWordParamShrink) {
        this.startWordParamShrink = startWordParamShrink;
        return this;
    }
    public String getStartWordParamShrink() {
        return this.startWordParamShrink;
    }

}
