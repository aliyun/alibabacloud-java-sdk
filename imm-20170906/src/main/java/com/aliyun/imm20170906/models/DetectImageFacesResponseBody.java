// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class DetectImageFacesResponseBody extends TeaModel {
    @NameInMap("ImageUri")
    public String imageUri;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Faces")
    public java.util.List<DetectImageFacesResponseBodyFaces> faces;

    public static DetectImageFacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectImageFacesResponseBody self = new DetectImageFacesResponseBody();
        return TeaModel.build(map, self);
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

    public DetectImageFacesResponseBody setFaces(java.util.List<DetectImageFacesResponseBodyFaces> faces) {
        this.faces = faces;
        return this;
    }
    public java.util.List<DetectImageFacesResponseBodyFaces> getFaces() {
        return this.faces;
    }

    public static class DetectImageFacesResponseBodyFacesFaceAttributesFaceBoundary extends TeaModel {
        @NameInMap("Left")
        public Integer left;

        @NameInMap("Top")
        public Integer top;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("Height")
        public Integer height;

        public static DetectImageFacesResponseBodyFacesFaceAttributesFaceBoundary build(java.util.Map<String, ?> map) throws Exception {
            DetectImageFacesResponseBodyFacesFaceAttributesFaceBoundary self = new DetectImageFacesResponseBodyFacesFaceAttributesFaceBoundary();
            return TeaModel.build(map, self);
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

        public DetectImageFacesResponseBodyFacesFaceAttributesFaceBoundary setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
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
        @NameInMap("GlassesConfidence")
        public Float glassesConfidence;

        @NameInMap("Glasses")
        public String glasses;

        @NameInMap("Mask")
        public String mask;

        @NameInMap("BeardConfidence")
        public Float beardConfidence;

        @NameInMap("MaskConfidence")
        public Float maskConfidence;

        @NameInMap("Beard")
        public String beard;

        @NameInMap("FaceBoundary")
        public DetectImageFacesResponseBodyFacesFaceAttributesFaceBoundary faceBoundary;

        @NameInMap("HeadPose")
        public DetectImageFacesResponseBodyFacesFaceAttributesHeadPose headPose;

        public static DetectImageFacesResponseBodyFacesFaceAttributes build(java.util.Map<String, ?> map) throws Exception {
            DetectImageFacesResponseBodyFacesFaceAttributes self = new DetectImageFacesResponseBodyFacesFaceAttributes();
            return TeaModel.build(map, self);
        }

        public DetectImageFacesResponseBodyFacesFaceAttributes setGlassesConfidence(Float glassesConfidence) {
            this.glassesConfidence = glassesConfidence;
            return this;
        }
        public Float getGlassesConfidence() {
            return this.glassesConfidence;
        }

        public DetectImageFacesResponseBodyFacesFaceAttributes setGlasses(String glasses) {
            this.glasses = glasses;
            return this;
        }
        public String getGlasses() {
            return this.glasses;
        }

        public DetectImageFacesResponseBodyFacesFaceAttributes setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public DetectImageFacesResponseBodyFacesFaceAttributes setBeardConfidence(Float beardConfidence) {
            this.beardConfidence = beardConfidence;
            return this;
        }
        public Float getBeardConfidence() {
            return this.beardConfidence;
        }

        public DetectImageFacesResponseBodyFacesFaceAttributes setMaskConfidence(Float maskConfidence) {
            this.maskConfidence = maskConfidence;
            return this;
        }
        public Float getMaskConfidence() {
            return this.maskConfidence;
        }

        public DetectImageFacesResponseBodyFacesFaceAttributes setBeard(String beard) {
            this.beard = beard;
            return this;
        }
        public String getBeard() {
            return this.beard;
        }

        public DetectImageFacesResponseBodyFacesFaceAttributes setFaceBoundary(DetectImageFacesResponseBodyFacesFaceAttributesFaceBoundary faceBoundary) {
            this.faceBoundary = faceBoundary;
            return this;
        }
        public DetectImageFacesResponseBodyFacesFaceAttributesFaceBoundary getFaceBoundary() {
            return this.faceBoundary;
        }

        public DetectImageFacesResponseBodyFacesFaceAttributes setHeadPose(DetectImageFacesResponseBodyFacesFaceAttributesHeadPose headPose) {
            this.headPose = headPose;
            return this;
        }
        public DetectImageFacesResponseBodyFacesFaceAttributesHeadPose getHeadPose() {
            return this.headPose;
        }

    }

    public static class DetectImageFacesResponseBodyFacesEmotionDetails extends TeaModel {
        @NameInMap("HAPPY")
        public Float HAPPY;

        @NameInMap("CALM")
        public Float CALM;

        @NameInMap("SURPRISED")
        public Float SURPRISED;

        @NameInMap("DISGUSTED")
        public Float DISGUSTED;

        @NameInMap("ANGRY")
        public Float ANGRY;

        @NameInMap("SAD")
        public Float SAD;

        @NameInMap("SCARED")
        public Float SCARED;

        public static DetectImageFacesResponseBodyFacesEmotionDetails build(java.util.Map<String, ?> map) throws Exception {
            DetectImageFacesResponseBodyFacesEmotionDetails self = new DetectImageFacesResponseBodyFacesEmotionDetails();
            return TeaModel.build(map, self);
        }

        public DetectImageFacesResponseBodyFacesEmotionDetails setHAPPY(Float HAPPY) {
            this.HAPPY = HAPPY;
            return this;
        }
        public Float getHAPPY() {
            return this.HAPPY;
        }

        public DetectImageFacesResponseBodyFacesEmotionDetails setCALM(Float CALM) {
            this.CALM = CALM;
            return this;
        }
        public Float getCALM() {
            return this.CALM;
        }

        public DetectImageFacesResponseBodyFacesEmotionDetails setSURPRISED(Float SURPRISED) {
            this.SURPRISED = SURPRISED;
            return this;
        }
        public Float getSURPRISED() {
            return this.SURPRISED;
        }

        public DetectImageFacesResponseBodyFacesEmotionDetails setDISGUSTED(Float DISGUSTED) {
            this.DISGUSTED = DISGUSTED;
            return this;
        }
        public Float getDISGUSTED() {
            return this.DISGUSTED;
        }

        public DetectImageFacesResponseBodyFacesEmotionDetails setANGRY(Float ANGRY) {
            this.ANGRY = ANGRY;
            return this;
        }
        public Float getANGRY() {
            return this.ANGRY;
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

    }

    public static class DetectImageFacesResponseBodyFaces extends TeaModel {
        @NameInMap("EmotionConfidence")
        public Float emotionConfidence;

        @NameInMap("Attractive")
        public Float attractive;

        @NameInMap("AttractiveConfidence")
        public Float attractiveConfidence;

        @NameInMap("Gender")
        public String gender;

        @NameInMap("AgeConfidence")
        public Float ageConfidence;

        @NameInMap("GenderConfidence")
        public Float genderConfidence;

        @NameInMap("FaceId")
        public String faceId;

        @NameInMap("FaceQuality")
        public Float faceQuality;

        @NameInMap("Emotion")
        public String emotion;

        @NameInMap("Age")
        public Integer age;

        @NameInMap("FaceConfidence")
        public Float faceConfidence;

        @NameInMap("FaceAttributes")
        public DetectImageFacesResponseBodyFacesFaceAttributes faceAttributes;

        @NameInMap("EmotionDetails")
        public DetectImageFacesResponseBodyFacesEmotionDetails emotionDetails;

        public static DetectImageFacesResponseBodyFaces build(java.util.Map<String, ?> map) throws Exception {
            DetectImageFacesResponseBodyFaces self = new DetectImageFacesResponseBodyFaces();
            return TeaModel.build(map, self);
        }

        public DetectImageFacesResponseBodyFaces setEmotionConfidence(Float emotionConfidence) {
            this.emotionConfidence = emotionConfidence;
            return this;
        }
        public Float getEmotionConfidence() {
            return this.emotionConfidence;
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

        public DetectImageFacesResponseBodyFaces setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public DetectImageFacesResponseBodyFaces setAgeConfidence(Float ageConfidence) {
            this.ageConfidence = ageConfidence;
            return this;
        }
        public Float getAgeConfidence() {
            return this.ageConfidence;
        }

        public DetectImageFacesResponseBodyFaces setGenderConfidence(Float genderConfidence) {
            this.genderConfidence = genderConfidence;
            return this;
        }
        public Float getGenderConfidence() {
            return this.genderConfidence;
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

        public DetectImageFacesResponseBodyFaces setEmotion(String emotion) {
            this.emotion = emotion;
            return this;
        }
        public String getEmotion() {
            return this.emotion;
        }

        public DetectImageFacesResponseBodyFaces setAge(Integer age) {
            this.age = age;
            return this;
        }
        public Integer getAge() {
            return this.age;
        }

        public DetectImageFacesResponseBodyFaces setFaceConfidence(Float faceConfidence) {
            this.faceConfidence = faceConfidence;
            return this;
        }
        public Float getFaceConfidence() {
            return this.faceConfidence;
        }

        public DetectImageFacesResponseBodyFaces setFaceAttributes(DetectImageFacesResponseBodyFacesFaceAttributes faceAttributes) {
            this.faceAttributes = faceAttributes;
            return this;
        }
        public DetectImageFacesResponseBodyFacesFaceAttributes getFaceAttributes() {
            return this.faceAttributes;
        }

        public DetectImageFacesResponseBodyFaces setEmotionDetails(DetectImageFacesResponseBodyFacesEmotionDetails emotionDetails) {
            this.emotionDetails = emotionDetails;
            return this;
        }
        public DetectImageFacesResponseBodyFacesEmotionDetails getEmotionDetails() {
            return this.emotionDetails;
        }

    }

}
