// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Figure extends TeaModel {
    @NameInMap("Age")
    public Long age;

    @NameInMap("AgeSD")
    public Float ageSD;

    @NameInMap("Attractive")
    public Float attractive;

    @NameInMap("Beard")
    public String beard;

    @NameInMap("BeardConfidence")
    public Float beardConfidence;

    @NameInMap("Boundary")
    public Boundary boundary;

    @NameInMap("Emotion")
    public String emotion;

    @NameInMap("EmotionConfidence")
    public Float emotionConfidence;

    @NameInMap("FaceQuality")
    public Float faceQuality;

    @NameInMap("FigureClusterConfidence")
    public Float figureClusterConfidence;

    @NameInMap("FigureClusterId")
    public String figureClusterId;

    @NameInMap("FigureConfidence")
    public Float figureConfidence;

    @NameInMap("FigureId")
    public String figureId;

    @NameInMap("FigureType")
    public String figureType;

    @NameInMap("Gender")
    public String gender;

    @NameInMap("GenderConfidence")
    public Float genderConfidence;

    @NameInMap("Glasses")
    public String glasses;

    @NameInMap("GlassesConfidence")
    public Float glassesConfidence;

    @NameInMap("Hat")
    public String hat;

    @NameInMap("HatConfidence")
    public Float hatConfidence;

    @NameInMap("HeadPose")
    public HeadPose headPose;

    @NameInMap("Mask")
    public String mask;

    @NameInMap("MaskConfidence")
    public Float maskConfidence;

    @NameInMap("Mouth")
    public String mouth;

    @NameInMap("MouthConfidence")
    public Float mouthConfidence;

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
