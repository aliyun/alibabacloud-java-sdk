// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Label extends TeaModel {
    @NameInMap("CentricScore")
    public Float centricScore;

    @NameInMap("LabelConfidence")
    public Float labelConfidence;

    @NameInMap("LabelLevel")
    public Long labelLevel;

    @NameInMap("LabelName")
    public String labelName;

    @NameInMap("Language")
    public String language;

    @NameInMap("ParentLabelName")
    public String parentLabelName;

    public static Label build(java.util.Map<String, ?> map) throws Exception {
        Label self = new Label();
        return TeaModel.build(map, self);
    }

    public Label setCentricScore(Float centricScore) {
        this.centricScore = centricScore;
        return this;
    }
    public Float getCentricScore() {
        return this.centricScore;
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

    public Label setParentLabelName(String parentLabelName) {
        this.parentLabelName = parentLabelName;
        return this;
    }
    public String getParentLabelName() {
        return this.parentLabelName;
    }

}
