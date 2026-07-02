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
     * <p>The age standard deviation.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("AgeSD")
    public Float ageSD;

    /**
     * <p>The face attractiveness score. A higher score indicates greater attractiveness. Valid values: 0 to 1.</p>
     * 
     * <strong>example:</strong>
     * <p>0.96</p>
     */
    @NameInMap("Attractive")
    public Float attractive;

    /**
     * <p>Indicates whether the person has a beard.</p>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("Beard")
    public String beard;

    /**
     * <p>The confidence score for whether the person has a beard. Valid values: 0 (lowest confidence) to 1 (highest confidence).</p>
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
     * <p>The emotion.</p>
     * 
     * <strong>example:</strong>
     * <p>happiness</p>
     */
    @NameInMap("Emotion")
    public String emotion;

    /**
     * <p>The emotion confidence score. Valid values: 0 (lowest confidence) to 1 (highest confidence).</p>
     * 
     * <strong>example:</strong>
     * <p>0.707845687866210</p>
     */
    @NameInMap("EmotionConfidence")
    public Float emotionConfidence;

    /**
     * <p>The face quality score, which evaluates whether the image quality is suitable for face recognition. A higher score indicates better quality. Valid values: 0 to 1.</p>
     * 
     * <strong>example:</strong>
     * <p>0.960875928401947</p>
     */
    @NameInMap("FaceQuality")
    public Float faceQuality;

    /**
     * <p>The clustering confidence score. Valid values: 0 (lowest confidence) to 1 (highest confidence).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FigureClusterConfidence")
    public Float figureClusterConfidence;

    /**
     * <p>The figure cluster ID. The following reserved special cluster ID names are included:</p>
     * <ul>
     * <li><p>figure-cluster-id-independent: The face does not currently belong to any suitable group. After new images are added to the dataset and face clustering is performed, the face may be assigned to a group.</p>
     * </li>
     * <li><p>figure-cluster-id-unavailable: The face has not been clustered yet. This means that after new images were added to the dataset, face clustering has not been performed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Cluster-dbe72fec-b84c-4ab6-885b-3678e64****</p>
     */
    @NameInMap("FigureClusterId")
    public String figureClusterId;

    /**
     * <p>The confidence score of the figure object. Valid values: 0 (lowest confidence) to 1 (highest confidence).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FigureConfidence")
    public Float figureConfidence;

    /**
     * <p>The ID of the figure object.</p>
     * 
     * <strong>example:</strong>
     * <p>868a9e74-cde5-4c7a-9013-28bb984****</p>
     */
    @NameInMap("FigureId")
    public String figureId;

    /**
     * <p>The figure type.</p>
     * 
     * <strong>example:</strong>
     * <p>face</p>
     */
    @NameInMap("FigureType")
    public String figureType;

    /**
     * <p>The gender.</p>
     * 
     * <strong>example:</strong>
     * <p>female</p>
     */
    @NameInMap("Gender")
    public String gender;

    /**
     * <p>The gender confidence score. Valid values: 0 (lowest confidence) to 1 (highest confidence).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("GenderConfidence")
    public Float genderConfidence;

    /**
     * <p>Indicates whether the person is wearing glasses.</p>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("Glasses")
    public String glasses;

    /**
     * <p>The confidence score for whether the person is wearing glasses. Valid values: 0 (lowest confidence) to 1 (highest confidence).</p>
     * 
     * <strong>example:</strong>
     * <p>0.8</p>
     */
    @NameInMap("GlassesConfidence")
    public Float glassesConfidence;

    /**
     * <p>Indicates whether the person is wearing a hat.</p>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("Hat")
    public String hat;

    /**
     * <p>The confidence score for whether the person is wearing a hat. Valid values: 0 (lowest confidence) to 1 (highest confidence).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HatConfidence")
    public Float hatConfidence;

    /**
     * <p>The head pose information.</p>
     */
    @NameInMap("HeadPose")
    public HeadPose headPose;

    /**
     * <p>Indicates whether the person is wearing a mask.</p>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("Mask")
    public String mask;

    /**
     * <p>The confidence score for whether the person is wearing a mask. Valid values: 0 (lowest confidence) to 1 (highest confidence).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaskConfidence")
    public Float maskConfidence;

    /**
     * <p>Indicates whether the mouth is open.</p>
     * 
     * <strong>example:</strong>
     * <p>close</p>
     */
    @NameInMap("Mouth")
    public String mouth;

    /**
     * <p>The confidence score for whether the mouth is open. Valid values: 0 (lowest confidence) to 1 (highest confidence).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MouthConfidence")
    public Float mouthConfidence;

    /**
     * <p>The sharpness score. A higher score indicates a clearer face. Valid values: 0 to 1.</p>
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
