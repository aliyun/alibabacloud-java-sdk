// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Face extends TeaModel {
    // FaceId
    @NameInMap("FaceId")
    public String faceId;

    // FaceConfidence
    @NameInMap("FaceConfidence")
    public Float faceConfidence;

    // Age
    @NameInMap("Age")
    public Long age;

    // AgeConfidence
    @NameInMap("AgeConfidence")
    public Float ageConfidence;

    // Gender
    @NameInMap("Gender")
    public String gender;

    // GenderConfidence
    @NameInMap("GenderConfidence")
    public Float genderConfidence;

    // Emotion
    @NameInMap("Emotion")
    public String emotion;

    // EmotionConfidence
    @NameInMap("EmotionConfidence")
    public Float emotionConfidence;

    // FaceClusterId
    @NameInMap("FaceClusterId")
    public String faceClusterId;

    // Mouth
    @NameInMap("Mouth")
    public String mouth;

    // MouthConfidence
    @NameInMap("MouthConfidence")
    public Float mouthConfidence;

    // Beard
    @NameInMap("Beard")
    public String beard;

    // BeardConfidence
    @NameInMap("BeardConfidence")
    public Float beardConfidence;

    // Hat
    @NameInMap("Hat")
    public String hat;

    // HatConfidence
    @NameInMap("HatConfidence")
    public Float hatConfidence;

    // Race
    @NameInMap("Race")
    public String race;

    // RaceConfidence
    @NameInMap("RaceConfidence")
    public Float raceConfidence;

    // Mask
    @NameInMap("Mask")
    public String mask;

    // MaskConfidence
    @NameInMap("MaskConfidence")
    public Float maskConfidence;

    // Glasses
    @NameInMap("Glasses")
    public String glasses;

    // GlassesConfidence
    @NameInMap("GlassesConfidence")
    public Float glassesConfidence;

    // LeftEye
    @NameInMap("LeftEye")
    public String leftEye;

    // LeftEyeConfidence
    @NameInMap("LeftEyeConfidence")
    public Float leftEyeConfidence;

    // RightEye
    @NameInMap("RightEye")
    public String rightEye;

    // RightEyeConfidence
    @NameInMap("RightEyeConfidence")
    public Float rightEyeConfidence;

    @NameInMap("HeadPose")
    public HeadPose headPose;

    @NameInMap("Boundary")
    public Boundary boundary;

    // EmbeddingsFloat32
    @NameInMap("EmbeddingsFloat32")
    public java.util.List<Float> embeddingsFloat32;

    // EmbeddingsInt8
    @NameInMap("EmbeddingsInt8")
    public java.util.List<Integer> embeddingsInt8;

    public static Face build(java.util.Map<String, ?> map) throws Exception {
        Face self = new Face();
        return TeaModel.build(map, self);
    }

    public Face setFaceId(String faceId) {
        this.faceId = faceId;
        return this;
    }
    public String getFaceId() {
        return this.faceId;
    }

    public Face setFaceConfidence(Float faceConfidence) {
        this.faceConfidence = faceConfidence;
        return this;
    }
    public Float getFaceConfidence() {
        return this.faceConfidence;
    }

    public Face setAge(Long age) {
        this.age = age;
        return this;
    }
    public Long getAge() {
        return this.age;
    }

    public Face setAgeConfidence(Float ageConfidence) {
        this.ageConfidence = ageConfidence;
        return this;
    }
    public Float getAgeConfidence() {
        return this.ageConfidence;
    }

    public Face setGender(String gender) {
        this.gender = gender;
        return this;
    }
    public String getGender() {
        return this.gender;
    }

    public Face setGenderConfidence(Float genderConfidence) {
        this.genderConfidence = genderConfidence;
        return this;
    }
    public Float getGenderConfidence() {
        return this.genderConfidence;
    }

    public Face setEmotion(String emotion) {
        this.emotion = emotion;
        return this;
    }
    public String getEmotion() {
        return this.emotion;
    }

    public Face setEmotionConfidence(Float emotionConfidence) {
        this.emotionConfidence = emotionConfidence;
        return this;
    }
    public Float getEmotionConfidence() {
        return this.emotionConfidence;
    }

    public Face setFaceClusterId(String faceClusterId) {
        this.faceClusterId = faceClusterId;
        return this;
    }
    public String getFaceClusterId() {
        return this.faceClusterId;
    }

    public Face setMouth(String mouth) {
        this.mouth = mouth;
        return this;
    }
    public String getMouth() {
        return this.mouth;
    }

    public Face setMouthConfidence(Float mouthConfidence) {
        this.mouthConfidence = mouthConfidence;
        return this;
    }
    public Float getMouthConfidence() {
        return this.mouthConfidence;
    }

    public Face setBeard(String beard) {
        this.beard = beard;
        return this;
    }
    public String getBeard() {
        return this.beard;
    }

    public Face setBeardConfidence(Float beardConfidence) {
        this.beardConfidence = beardConfidence;
        return this;
    }
    public Float getBeardConfidence() {
        return this.beardConfidence;
    }

    public Face setHat(String hat) {
        this.hat = hat;
        return this;
    }
    public String getHat() {
        return this.hat;
    }

    public Face setHatConfidence(Float hatConfidence) {
        this.hatConfidence = hatConfidence;
        return this;
    }
    public Float getHatConfidence() {
        return this.hatConfidence;
    }

    public Face setRace(String race) {
        this.race = race;
        return this;
    }
    public String getRace() {
        return this.race;
    }

    public Face setRaceConfidence(Float raceConfidence) {
        this.raceConfidence = raceConfidence;
        return this;
    }
    public Float getRaceConfidence() {
        return this.raceConfidence;
    }

    public Face setMask(String mask) {
        this.mask = mask;
        return this;
    }
    public String getMask() {
        return this.mask;
    }

    public Face setMaskConfidence(Float maskConfidence) {
        this.maskConfidence = maskConfidence;
        return this;
    }
    public Float getMaskConfidence() {
        return this.maskConfidence;
    }

    public Face setGlasses(String glasses) {
        this.glasses = glasses;
        return this;
    }
    public String getGlasses() {
        return this.glasses;
    }

    public Face setGlassesConfidence(Float glassesConfidence) {
        this.glassesConfidence = glassesConfidence;
        return this;
    }
    public Float getGlassesConfidence() {
        return this.glassesConfidence;
    }

    public Face setLeftEye(String leftEye) {
        this.leftEye = leftEye;
        return this;
    }
    public String getLeftEye() {
        return this.leftEye;
    }

    public Face setLeftEyeConfidence(Float leftEyeConfidence) {
        this.leftEyeConfidence = leftEyeConfidence;
        return this;
    }
    public Float getLeftEyeConfidence() {
        return this.leftEyeConfidence;
    }

    public Face setRightEye(String rightEye) {
        this.rightEye = rightEye;
        return this;
    }
    public String getRightEye() {
        return this.rightEye;
    }

    public Face setRightEyeConfidence(Float rightEyeConfidence) {
        this.rightEyeConfidence = rightEyeConfidence;
        return this;
    }
    public Float getRightEyeConfidence() {
        return this.rightEyeConfidence;
    }

    public Face setHeadPose(HeadPose headPose) {
        this.headPose = headPose;
        return this;
    }
    public HeadPose getHeadPose() {
        return this.headPose;
    }

    public Face setBoundary(Boundary boundary) {
        this.boundary = boundary;
        return this;
    }
    public Boundary getBoundary() {
        return this.boundary;
    }

    public Face setEmbeddingsFloat32(java.util.List<Float> embeddingsFloat32) {
        this.embeddingsFloat32 = embeddingsFloat32;
        return this;
    }
    public java.util.List<Float> getEmbeddingsFloat32() {
        return this.embeddingsFloat32;
    }

    public Face setEmbeddingsInt8(java.util.List<Integer> embeddingsInt8) {
        this.embeddingsInt8 = embeddingsInt8;
        return this;
    }
    public java.util.List<Integer> getEmbeddingsInt8() {
        return this.embeddingsInt8;
    }

}
