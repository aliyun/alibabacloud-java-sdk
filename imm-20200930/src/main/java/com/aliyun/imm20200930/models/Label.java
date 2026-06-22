// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Label extends TeaModel {
    /**
     * <p>The centric score of the tag. This indicates whether the tag is the main subject in the image. The value ranges from 0 to 1. A higher value indicates higher confidence that the tag is the main subject of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>0.877</p>
     */
    @NameInMap("CentricScore")
    public Float centricScore;

    /**
     * <p>Event clips.</p>
     */
    @NameInMap("Clips")
    public java.util.List<Clip> clips;

    /**
     * <p>The tag alias.</p>
     * 
     * <strong>example:</strong>
     * <p>座椅</p>
     */
    @NameInMap("LabelAlias")
    public String labelAlias;

    /**
     * <p>The tag confidence level. The value ranges from 0 (lowest confidence) to 1 (highest confidence).</p>
     * 
     * <strong>example:</strong>
     * <p>0.95</p>
     */
    @NameInMap("LabelConfidence")
    public Float labelConfidence;

    /**
     * <p>The tag level. Valid values are 1, 2, and 3, representing first-level, second-level, and third-level tags, respectively.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("LabelLevel")
    public Long labelLevel;

    /**
     * <p>The tag name.</p>
     * 
     * <strong>example:</strong>
     * <p>椅子</p>
     */
    @NameInMap("LabelName")
    public String labelName;

    /**
     * <p>The tag language, in BCP 47 format.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-Hans</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The parent tag name.</p>
     * 
     * <strong>example:</strong>
     * <p>家具</p>
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
