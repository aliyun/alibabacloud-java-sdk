// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Label extends TeaModel {
    // LabelConfidence
    @NameInMap("LabelConfidence")
    public Float labelConfidence;

    // LabelLevel
    @NameInMap("LabelLevel")
    public Long labelLevel;

    // LabelName
    @NameInMap("LabelName")
    public String labelName;

    // Language
    @NameInMap("Language")
    public String language;

    public static Label build(java.util.Map<String, ?> map) throws Exception {
        Label self = new Label();
        return TeaModel.build(map, self);
    }

    public Label setLabelConfidence(Float labelConfidence) {
        this.labelConfidence = labelConfidence;
        return this;
    }
    public Float getLabelConfidence() {
        return this.labelConfidence;
    }

    public Label setLabelLevel(Long labelLevel) {
        this.labelLevel = labelLevel;
        return this;
    }
    public Long getLabelLevel() {
        return this.labelLevel;
    }

    public Label setLabelName(String labelName) {
        this.labelName = labelName;
        return this;
    }
    public String getLabelName() {
        return this.labelName;
    }

    public Label setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

}
