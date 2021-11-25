// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class DetectImageFacesResponseBody extends TeaModel {
    @NameInMap("Faces")
    public java.util.List<DetectImageFacesResponseBodyFaces> faces;

    @NameInMap("ImageUri")
    public String imageUri;

    @NameInMap("RequestId")
    public String requestId;

    public static DetectImageFacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectImageFacesResponseBody self = new DetectImageFacesResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectImageFacesResponseBody setFaces(java.util.List<DetectImageFacesResponseBodyFaces> faces) {
        this.faces = faces;
        return this;
    }
    public java.util.List<DetectImageFacesResponseBodyFaces> getFaces() {
        return this.faces;
    }

    public DetectImageFacesResponseBody setImageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }
    public String getImageUri() {
        return this.imageUri;
    }

    public DetectImageFacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetectImageFacesResponseBodyFacesEmotionDetails extends TeaModel {
        @NameInMap("ANGRY")
        public Float ANGRY;

        @NameInMap("CALM")
        public Float CALM;

        @NameInMap("DISGUSTED")
        public Float DISGUSTED;

        @NameInMap("HAPPY")
        public Float HAPPY;

        @NameInMap("SAD")
        public Float SAD;

        @NameInMap("SCARED")
        public Float SCARED;

        @NameInMap("SURPRISED")
        public Float SURPRISED;

        public static DetectImageFacesResponseBodyFacesEmotionDetails build(java.util.Map<String, ?> map) throws Exception {
            DetectImageFacesResponseBodyFacesEmotionDetails self = new DetectImageFacesResponseBodyFacesEmotionDetails();
            return TeaModel.build(map, self);
        }

        public DetectImageFacesResponseBodyFacesEmotionDetails setANGRY(Float ANGRY) {
            this.ANGRY = ANGRY;
            return this;
        }
        public Float getANGRY() {
            return this.ANGRY;
        }

        public DetectImageFacesResponseBodyFacesEmotionDetails setCALM(Float CALM) {
            this.CALM = CALM;
            return this;
        }
        public Float getCALM() {
            return this.CALM;
        }

        public DetectImageFacesResponseBodyFacesEmotionDetails setDISGUSTED(Float DISGUSTED) {
            this.DISGUSTED = DISGUSTED;
            return this;
        }
        public Float getDISGUSTED() {
            return this.DISGUSTED;
        }

        public DetectImageFacesResponseBodyFacesEmotionDetails setHAPPY(Float HAPPY) {
            this.HAPPY = HAPPY;
            return this;
        }
        public Float getHAPPY() {
            return this.HAPPY;
        }

        public DetectImageFacesResponseBodyFacesEmotionDetails setSAD(Float SAD) {
            this.SAD = SAD;
            return this;
        }
        public Float getSAD() {
            return this.SAD;
        }

        public DetectImageFacesResponseBodyFacesEmotionDetails setSCARED(Float SCARED) {
            this.SCARED = SCARED;
            return this;
        }
        public Float getSCARED() {
            return this.SCARED;
        }

        public DetectImageFacesResponseBodyFacesEmotionDetails setSURPRISED(Float SURPRISED) {
            this.SURPRISED = SURPRISED;
            return this;
        }
        public Float getSURPRISED() {
            return this.SURPRISED;
        }

    }

    public static class DetectImageFacesResponseBodyFacesFaceAttributesFaceBoundary extends TeaModel {
        @NameInMap("Height")
        public Integer height;

        @NameInMap("Left")
        public Integer left;

        @NameInMap("Top")
        public Integer top;

        @NameInMap("Width")
        public Integer width;

        public static DetectImageFacesResponseBodyFacesFaceAttributesFaceBoundary build(java.util.Map<String, ?> map) throws Exception {
            DetectImageFacesResponseBodyFacesFaceAttributesFaceBoundary self = new DetectImageFacesResponseBodyFacesFaceAttributesFaceBoundary();
            return TeaModel.build(map, self);
        }

        public DetectImageFacesResponseBodyFacesFaceAttributesFaceBoundary setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public DetectImageFacesResponseBodyFacesFaceAttributesFaceBoundary setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

        public DetectImageFacesResponseBodyFacesFaceAttributesFaceBoundary setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public DetectImageFacesResponseBodyFacesFaceAttributesFaceBoundary setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class DetectImageFacesResponseBodyFacesFaceAttributesHeadPose extends TeaModel {
        @NameInMap("Pitch")
        public Float pitch;

        @NameInMap("Roll")
        public Float roll;

        @NameInMap("Yaw")
        public Float yaw;

        public static DetectImageFacesResponseBodyFacesFaceAttributesHeadPose build(java.util.Map<String, ?> map) throws Exception {
            DetectImageFacesResponseBodyFacesFaceAttributesHeadPose self = new DetectImageFacesResponseBodyFacesFaceAttributesHeadPose();
            return TeaModel.build(map, self);
        }

        public DetectImageFacesResponseBodyFacesFaceAttributesHeadPose setPitch(Float pitch) {
            this.pitch = pitch;
            return this;
        }
        public Float getPitch() {
            return this.pitch;
        }

        public DetectImageFacesResponseBodyFacesFaceAttributesHeadPose setRoll(Float roll) {
            this.roll = roll;
            return this;
        }
        public Float getRoll() {
            return this.roll;
        }

        public DetectImageFacesResponseBodyFacesFaceAttributesHeadPose setYaw(Float yaw) {
            this.yaw = yaw;
            return this;
        }
        public Float getYaw() {
            return this.yaw;
        }

    }

    public static class DetectImageFacesResponseBodyFacesFaceAttributes extends TeaModel {
        @NameInMap("Beard")
        public String beard;

        @NameInMap("BeardConfidence")
        public Float beardConfidence;

        @NameInMap("FaceBoundary")
        public DetectImageFacesResponseBodyFacesFaceAttributesFaceBoundary faceBoundary;

        @NameInMap("Glasses")
        public String glasses;

        @NameInMap("GlassesConfidence")
        public Float glassesConfidence;

        @NameInMap("HeadPose")
        public DetectImageFacesResponseBodyFacesFaceAttributesHeadPose headPose;

        @NameInMap("Mask")
        public String mask;

        @NameInMap("MaskConfidence")
        public Float maskConfidence;

        public static DetectImageFacesResponseBodyFacesFaceAttributes build(java.util.Map<String, ?> map) throws Exception {
            DetectImageFacesResponseBodyFacesFaceAttributes self = new DetectImageFacesResponseBodyFacesFaceAttributes();
            return TeaModel.build(map, self);
        }

        public DetectImageFacesResponseBodyFacesFaceAttributes setBeard(String beard) {
            this.beard = beard;
            return this;
        }
        public String getBeard() {
            return this.beard;
        }

        public DetectImageFacesResponseBodyFacesFaceAttributes setBeardConfidence(Float beardConfidence) {
            this.beardConfidence = beardConfidence;
            return this;
        }
        public Float getBeardConfidence() {
            return this.beardConfidence;
        }

        public DetectImageFacesResponseBodyFacesFaceAttributes setFaceBoundary(DetectImageFacesResponseBodyFacesFaceAttributesFaceBoundary faceBoundary) {
            this.faceBoundary = faceBoundary;
            return this;
        }
        public DetectImageFacesResponseBodyFacesFaceAttributesFaceBoundary getFaceBoundary() {
            return this.faceBoundary;
        }

        public DetectImageFacesResponseBodyFacesFaceAttributes setGlasses(String glasses) {
            this.glasses = glasses;
            return this;
        }
        public String getGlasses() {
            return this.glasses;
        }

        public DetectImageFacesResponseBodyFacesFaceAttributes setGlassesConfidence(Float glassesConfidence) {
            this.glassesConfidence = glassesConfidence;
            return this;
        }
        public Float getGlassesConfidence() {
            return this.glassesConfidence;
        }

        public DetectImageFacesResponseBodyFacesFaceAttributes setHeadPose(DetectImageFacesResponseBodyFacesFaceAttributesHeadPose headPose) {
            this.headPose = headPose;
            return this;
        }
        public DetectImageFacesResponseBodyFacesFaceAttributesHeadPose getHeadPose() {
            return this.headPose;
        }

        public DetectImageFacesResponseBodyFacesFaceAttributes setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public DetectImageFacesResponseBodyFacesFaceAttributes setMaskConfidence(Float maskConfidence) {
            this.maskConfidence = maskConfidence;
            return this;
        }
        public Float getMaskConfidence() {
            return this.maskConfidence;
        }

    }

    public static class DetectImageFacesResponseBodyFaces extends TeaModel {
        @NameInMap("Age")
        public Integer age;

        @NameInMap("AgeConfidence")
        public Float ageConfidence;

        @NameInMap("Attractive")
        public Float attractive;

        @NameInMap("AttractiveConfidence")
        public Float attractiveConfidence;

        @NameInMap("Emotion")
        public String emotion;

        @NameInMap("EmotionConfidence")
        public Float emotionConfidence;

        @NameInMap("EmotionDetails")
        public DetectImageFacesResponseBodyFacesEmotionDetails emotionDetails;

        @NameInMap("FaceAttributes")
        public DetectImageFacesResponseBodyFacesFaceAttributes faceAttributes;

        @NameInMap("FaceConfidence")
        public Float faceConfidence;

        @NameInMap("FaceId")
        public String faceId;

        @NameInMap("FaceQuality")
        public Float faceQuality;

        @NameInMap("Gender")
        public String gender;

        @NameInMap("GenderConfidence")
        public Float genderConfidence;

        public static DetectImageFacesResponseBodyFaces build(java.util.Map<String, ?> map) throws Exception {
            DetectImageFacesResponseBodyFaces self = new DetectImageFacesResponseBodyFaces();
            return TeaModel.build(map, self);
        }

        public DetectImageFacesResponseBodyFaces setAge(Integer age) {
            this.age = age;
            return this;
        }
        public Integer getAge() {
            return this.age;
        }

        public DetectImageFacesResponseBodyFaces setAgeConfidence(Float ageConfidence) {
            this.ageConfidence = ageConfidence;
            return this;
        }
        public Float getAgeConfidence() {
            return this.ageConfidence;
        }

        public DetectImageFacesResponseBodyFaces setAttractive(Float attractive) {
            this.attractive = attractive;
            return this;
        }
        public Float getAttractive() {
            return this.attractive;
        }

        public DetectImageFacesResponseBodyFaces setAttractiveConfidence(Float attractiveConfidence) {
            this.attractiveConfidence = attractiveConfidence;
            return this;
        }
        public Float getAttractiveConfidence() {
            return this.attractiveConfidence;
        }

        public DetectImageFacesResponseBodyFaces setEmotion(String emotion) {
            this.emotion = emotion;
            return this;
        }
        public String getEmotion() {
            return this.emotion;
        }

        public DetectImageFacesResponseBodyFaces setEmotionConfidence(Float emotionConfidence) {
            this.emotionConfidence = emotionConfidence;
            return this;
        }
        public Float getEmotionConfidence() {
            return this.emotionConfidence;
        }

        public DetectImageFacesResponseBodyFaces setEmotionDetails(DetectImageFacesResponseBodyFacesEmotionDetails emotionDetails) {
            this.emotionDetails = emotionDetails;
            return this;
        }
        public DetectImageFacesResponseBodyFacesEmotionDetails getEmotionDetails() {
            return this.emotionDetails;
        }

        public DetectImageFacesResponseBodyFaces setFaceAttributes(DetectImageFacesResponseBodyFacesFaceAttributes faceAttributes) {
            this.faceAttributes = faceAttributes;
            return this;
        }
        public DetectImageFacesResponseBodyFacesFaceAttributes getFaceAttributes() {
            return this.faceAttributes;
        }

        public DetectImageFacesResponseBodyFaces setFaceConfidence(Float faceConfidence) {
            this.faceConfidence = faceConfidence;
            return this;
        }
        public Float getFaceConfidence() {
            return this.faceConfidence;
        }

        public DetectImageFacesResponseBodyFaces setFaceId(String faceId) {
            this.faceId = faceId;
            return this;
        }
        public String getFaceId() {
            return this.faceId;
        }

        public DetectImageFacesResponseBodyFaces setFaceQuality(Float faceQuality) {
            this.faceQuality = faceQuality;
            return this;
        }
        public Float getFaceQuality() {
            return this.faceQuality;
        }

        public DetectImageFacesResponseBodyFaces setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public DetectImageFacesResponseBodyFaces setGenderConfidence(Float genderConfidence) {
            this.genderConfidence = genderConfidence;
            return this;
        }
        public Float getGenderConfidence() {
            return this.genderConfidence;
        }

    }

}
