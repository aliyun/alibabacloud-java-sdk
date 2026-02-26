// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Figure extends TeaModel {
    /**
     * <p>The age.</p>
     * 
     * <strong>example:</strong>
     * <p>29</p>
     */
    @NameInMap("Age")
    public Long age;

    /**
     * <p>The standard deviation of the age.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("AgeSD")
    public Float ageSD;

    /**
     * <p>The face attractiveness. A high score indicates strong attractiveness. Valid values: 0 to 1.</p>
     * 
     * <strong>example:</strong>
     * <p>0.96</p>
     */
    @NameInMap("Attractive")
    public Float attractive;

    /**
     * <p>Specifies whether the figure has a beard. Valid values:</p>
     * <ul>
     * <li>beard</li>
     * <li>none</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("Beard")
    public String beard;

    /**
     * <p>The confidence level of detecting whether the figure has a beard. Valid values: 0 to 1. The value 0 indicates the lowest confidence level. The value 1 indicates the highest confidence level.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BeardConfidence")
    public Float beardConfidence;

    /**
     * <p>The face boundary information.</p>
     */
    @NameInMap("Boundary")
    public Boundary boundary;

    /**
     * <p>The emotion. Valid values:</p>
     * <ul>
     * <li>happiness</li>
     * <li>none</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>happiness</p>
     */
    @NameInMap("Emotion")
    public String emotion;

    /**
     * <p>The confidence level of the emotion. Valid values: 0 to 1. The value 0 indicates the lowest confidence level. The value 1 indicates the highest confidence level.</p>
     * 
     * <strong>example:</strong>
     * <p>0.707845687866210</p>
     */
    @NameInMap("EmotionConfidence")
    public Float emotionConfidence;

    /**
     * <p>The face quality.</p>
     * 
     * <strong>example:</strong>
     * <p>0.960875928401947</p>
     */
    @NameInMap("FaceQuality")
    public Float faceQuality;

    /**
     * <p>The confidence level of the face clustering task. Valid values: 0 to 1. The value 0 indicates the lowest confidence level. The value 1 indicates the highest confidence level.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FigureClusterConfidence")
    public Float figureClusterConfidence;

    /**
     * <p>The ID of the face clustering task. The following IDs of special face clustering tasks are reserved:</p>
     * <ul>
     * <li>figure-cluster-id-independent: the ID of a face clustering task in which faces do not belong to any face group. After images are added to a dataset, the faces may be categorized into different face groups when you perform face clustering.</li>
     * <li>figure-cluster-id-unavailable: the ID of a face clustering task in which face clustering is not performed after images are added to a dataset.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Cluster-dbe72fec-b84c-4ab6-885b-3678e64****</p>
     */
    @NameInMap("FigureClusterId")
    public String figureClusterId;

    /**
     * <p>The confidence level of the figure. Valid values: 0 to 1. The value 0 indicates the lowest confidence level. The value 1 indicates the highest confidence level.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FigureConfidence")
    public Float figureConfidence;

    /**
     * <p>The figure ID.</p>
     * 
     * <strong>example:</strong>
     * <p>868a9e74-cde5-4c7a-9013-28bb984****</p>
     */
    @NameInMap("FigureId")
    public String figureId;

    /**
     * <p>The figure type.</p>
     * <p>Set this parameter to face.</p>
     * 
     * <strong>example:</strong>
     * <p>face</p>
     */
    @NameInMap("FigureType")
    public String figureType;

    /**
     * <p>The gender. Valid values:</p>
     * <ul>
     * <li>female</li>
     * <li>male</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>female</p>
     */
    @NameInMap("Gender")
    public String gender;

    /**
     * <p>The confidence level of the gender. Valid values: 0 to 1. The value 0 indicates the lowest confidence level. The value 1 indicates the highest confidence level.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("GenderConfidence")
    public Float genderConfidence;

    /**
     * <p>Specifies whether the figure wears glasses. Valid values:</p>
     * <ul>
     * <li>glasses</li>
     * <li>sunglasses</li>
     * <li>none</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("Glasses")
    public String glasses;

    /**
     * <p>The confidence level of detecting whether the figure wears glasses. Valid values: 0 to 1. The value 0 indicates the lowest confidence level. The value 1 indicates the highest confidence level.</p>
     * 
     * <strong>example:</strong>
     * <p>0.8</p>
     */
    @NameInMap("GlassesConfidence")
    public Float glassesConfidence;

    /**
     * <p>Specifies whether the figure wears a hat. Valid values:</p>
     * <ul>
     * <li>hat</li>
     * <li>none</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("Hat")
    public String hat;

    /**
     * <p>The confidence level of detecting whether the figure wears a hat.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HatConfidence")
    public Float hatConfidence;

    /**
     * <p>The head orientation.</p>
     */
    @NameInMap("HeadPose")
    public HeadPose headPose;

    /**
     * <p>Specifies whether the figure wears a mask. Valid values:</p>
     * <ul>
     * <li>mask</li>
     * <li>none</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("Mask")
    public String mask;

    /**
     * <p>The confidence level of detecting whether the figure wears a mask. Valid values: 0 to 1. The value 0 indicates the lowest confidence level. The value 1 indicates the highest confidence level.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaskConfidence")
    public Float maskConfidence;

    /**
     * <p>Specifies whether the mouth is open. Valid values:</p>
     * <ul>
     * <li>open</li>
     * <li>close</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>close</p>
     */
    @NameInMap("Mouth")
    public String mouth;

    /**
     * <p>The confidence level of detecting whether the mouth is open. Valid values: 0 to 1. The value 0 indicates the lowest confidence level. The value 1 indicates the highest confidence level.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MouthConfidence")
    public Float mouthConfidence;

    /**
     * <p>The clarity.</p>
     * 
     * <strong>example:</strong>
     * <p>0.7</p>
     */
    @NameInMap("Sharpness")
    public Float sharpness;

    public static Figure build(java.util.Map<String, ?> map) throws Exception {
        Figure self = new Figure();
        return TeaModel.build(map, self);
    }

    public Figure setAge(Long age) {
        this.age = age;
        return this;
    }
    public Long getAge() {
        return this.age;
    }

    public Figure setAgeSD(Float ageSD) {
        this.ageSD = ageSD;
        return this;
    }
    public Float getAgeSD() {
        return this.ageSD;
    }

    public Figure setAttractive(Float attractive) {
        this.attractive = attractive;
        return this;
    }
    public Float getAttractive() {
        return this.attractive;
    }

    public Figure setBeard(String beard) {
        this.beard = beard;
        return this;
    }
    public String getBeard() {
        return this.beard;
    }

    public Figure setBeardConfidence(Float beardConfidence) {
        this.beardConfidence = beardConfidence;
        return this;
    }
    public Float getBeardConfidence() {
        return this.beardConfidence;
    }

    public Figure setBoundary(Boundary boundary) {
        this.boundary = boundary;
        return this;
    }
    public Boundary getBoundary() {
        return this.boundary;
    }

    public Figure setEmotion(String emotion) {
        this.emotion = emotion;
        return this;
    }
    public String getEmotion() {
        return this.emotion;
    }

    public Figure setEmotionConfidence(Float emotionConfidence) {
        this.emotionConfidence = emotionConfidence;
        return this;
    }
    public Float getEmotionConfidence() {
        return this.emotionConfidence;
    }

    public Figure setFaceQuality(Float faceQuality) {
        this.faceQuality = faceQuality;
        return this;
    }
    public Float getFaceQuality() {
        return this.faceQuality;
    }

    public Figure setFigureClusterConfidence(Float figureClusterConfidence) {
        this.figureClusterConfidence = figureClusterConfidence;
        return this;
    }
    public Float getFigureClusterConfidence() {
        return this.figureClusterConfidence;
    }

    public Figure setFigureClusterId(String figureClusterId) {
        this.figureClusterId = figureClusterId;
        return this;
    }
    public String getFigureClusterId() {
        return this.figureClusterId;
    }

    public Figure setFigureConfidence(Float figureConfidence) {
        this.figureConfidence = figureConfidence;
        return this;
    }
    public Float getFigureConfidence() {
        return this.figureConfidence;
    }

    public Figure setFigureId(String figureId) {
        this.figureId = figureId;
        return this;
    }
    public String getFigureId() {
        return this.figureId;
    }

    public Figure setFigureType(String figureType) {
        this.figureType = figureType;
        return this;
    }
    public String getFigureType() {
        return this.figureType;
    }

    public Figure setGender(String gender) {
        this.gender = gender;
        return this;
    }
    public String getGender() {
        return this.gender;
    }

    public Figure setGenderConfidence(Float genderConfidence) {
        this.genderConfidence = genderConfidence;
        return this;
    }
    public Float getGenderConfidence() {
        return this.genderConfidence;
    }

    public Figure setGlasses(String glasses) {
        this.glasses = glasses;
        return this;
    }
    public String getGlasses() {
        return this.glasses;
    }

    public Figure setGlassesConfidence(Float glassesConfidence) {
        this.glassesConfidence = glassesConfidence;
        return this;
    }
    public Float getGlassesConfidence() {
        return this.glassesConfidence;
    }

    public Figure setHat(String hat) {
        this.hat = hat;
        return this;
    }
    public String getHat() {
        return this.hat;
    }

    public Figure setHatConfidence(Float hatConfidence) {
        this.hatConfidence = hatConfidence;
        return this;
    }
    public Float getHatConfidence() {
        return this.hatConfidence;
    }

    public Figure setHeadPose(HeadPose headPose) {
        this.headPose = headPose;
        return this;
    }
    public HeadPose getHeadPose() {
        return this.headPose;
    }

    public Figure setMask(String mask) {
        this.mask = mask;
        return this;
    }
    public String getMask() {
        return this.mask;
    }

    public Figure setMaskConfidence(Float maskConfidence) {
        this.maskConfidence = maskConfidence;
        return this;
    }
    public Float getMaskConfidence() {
        return this.maskConfidence;
    }

    public Figure setMouth(String mouth) {
        this.mouth = mouth;
        return this;
    }
    public String getMouth() {
        return this.mouth;
    }

    public Figure setMouthConfidence(Float mouthConfidence) {
        this.mouthConfidence = mouthConfidence;
        return this;
    }
    public Float getMouthConfidence() {
        return this.mouthConfidence;
    }

    public Figure setSharpness(Float sharpness) {
        this.sharpness = sharpness;
        return this;
    }
    public Float getSharpness() {
        return this.sharpness;
    }

}
