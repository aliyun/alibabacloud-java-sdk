// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class PreviewVoiceShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the Model Studio business unit.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-c11iig67g863rih8</p>
     */
    @NameInMap("BusinessUnitId")
    public String businessUnitId;

    /**
     * <p>The TTS model.</p>
     * 
     * <strong>example:</strong>
     * <p>Qwen</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>The TTS access type.</p>
     * 
     * <strong>example:</strong>
     * <p>MANAGED</p>
     */
    @NameInMap("NlsAccessType")
    public String nlsAccessType;

    /**
     * <p>The TTS engine.</p>
     * 
     * <strong>example:</strong>
     * <p>BAILIAN</p>
     */
    @NameInMap("NlsEngine")
    public String nlsEngine;

    /**
     * <p>The synthesis parameters.</p>
     */
    @NameInMap("Params")
    public String paramsShrink;

    /**
     * <p>The text to synthesize for the preview.</p>
     * 
     * <strong>example:</strong>
     * <p>你好，很高兴认识你</p>
     */
    @NameInMap("Text")
    public String text;

    /**
     * <p>The voice for synthesis.</p>
     * 
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
