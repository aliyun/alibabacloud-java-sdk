// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class PreviewVoiceShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>llm-c11iig67g863rih8</p>
     */
    @NameInMap("BusinessUnitId")
    public String businessUnitId;

    /**
     * <strong>example:</strong>
     * <p>Qwen</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <strong>example:</strong>
     * <p>MANAGED</p>
     */
    @NameInMap("NlsAccessType")
    public String nlsAccessType;

    /**
     * <strong>example:</strong>
     * <p>BAILIAN</p>
     */
    @NameInMap("NlsEngine")
    public String nlsEngine;

    @NameInMap("Params")
    public String paramsShrink;

    @NameInMap("Text")
    public String text;

    /**
     * <strong>example:</strong>
     * <p>Cherry</p>
     */
    @NameInMap("Voice")
    public String voice;

    public static PreviewVoiceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PreviewVoiceShrinkRequest self = new PreviewVoiceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PreviewVoiceShrinkRequest setBusinessUnitId(String businessUnitId) {
        this.businessUnitId = businessUnitId;
        return this;
    }
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    public PreviewVoiceShrinkRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public PreviewVoiceShrinkRequest setNlsAccessType(String nlsAccessType) {
        this.nlsAccessType = nlsAccessType;
        return this;
    }
    public String getNlsAccessType() {
        return this.nlsAccessType;
    }

    public PreviewVoiceShrinkRequest setNlsEngine(String nlsEngine) {
        this.nlsEngine = nlsEngine;
        return this;
    }
    public String getNlsEngine() {
        return this.nlsEngine;
    }

    public PreviewVoiceShrinkRequest setParamsShrink(String paramsShrink) {
        this.paramsShrink = paramsShrink;
        return this;
    }
    public String getParamsShrink() {
        return this.paramsShrink;
    }

    public PreviewVoiceShrinkRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public PreviewVoiceShrinkRequest setVoice(String voice) {
        this.voice = voice;
        return this;
    }
    public String getVoice() {
        return this.voice;
    }

}
