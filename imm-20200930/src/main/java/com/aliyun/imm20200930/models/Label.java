// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Label extends TeaModel {
    /**
     * <p>The central value of the label. This value indicates the confidence that the label is the majority component of the image. Valid values: 0 to 1. A higher value indicates greater confidence.</p>
     * 
     * <strong>example:</strong>
     * <p>0.7319999933242798</p>
     */
    @NameInMap("CentricScore")
    public Float centricScore;

    @NameInMap("Clips")
    public java.util.List<Clip> clips;

    @NameInMap("LabelAlias")
    public String labelAlias;

    /**
     * <p>The confidence level of the label. Valid values: 0 to 1. A higher value indicates greater confidence.</p>
     * 
     * <strong>example:</strong>
     * <p>0.9891784601980591</p>
     */
    @NameInMap("LabelConfidence")
    public Float labelConfidence;

    /**
     * <p>The label level. Valid values: 1, 2, and 3.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LabelLevel")
    public Long labelLevel;

    /**
     * <p>The label name.</p>
     */
    @NameInMap("LabelName")
    public String labelName;

    /**
     * <p>The label language, which is represented as a BCP 47 language tag.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-Hans</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The name of the parent label.</p>
     */
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

    public Label setClips(java.util.List<Clip> clips) {
        this.clips = clips;
        return this;
    }
    public java.util.List<Clip> getClips() {
        return this.clips;
    }

    public Label setLabelAlias(String labelAlias) {
        this.labelAlias = labelAlias;
        return this;
    }
    public String getLabelAlias() {
        return this.labelAlias;
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
