// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class ListVideoFramesResponseBody extends TeaModel {
    @NameInMap("Frames")
    public java.util.List<ListVideoFramesResponseBodyFrames> frames;

    @NameInMap("NextMarker")
    public String nextMarker;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SetId")
    public String setId;

    @NameInMap("VideoUri")
    public String videoUri;

    public static ListVideoFramesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVideoFramesResponseBody self = new ListVideoFramesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVideoFramesResponseBody setFrames(java.util.List<ListVideoFramesResponseBodyFrames> frames) {
        this.frames = frames;
        return this;
    }
    public java.util.List<ListVideoFramesResponseBodyFrames> getFrames() {
        return this.frames;
    }

    public ListVideoFramesResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

    public ListVideoFramesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVideoFramesResponseBody setSetId(String setId) {
        this.setId = setId;
        return this;
    }
    public String getSetId() {
        return this.setId;
    }

    public ListVideoFramesResponseBody setVideoUri(String videoUri) {
        this.videoUri = videoUri;
        return this;
    }
    public String getVideoUri() {
        return this.videoUri;
    }

    public static class ListVideoFramesResponseBodyFramesFacesEmotionDetails extends TeaModel {
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

        public static ListVideoFramesResponseBodyFramesFacesEmotionDetails build(java.util.Map<String, ?> map) throws Exception {
            ListVideoFramesResponseBodyFramesFacesEmotionDetails self = new ListVideoFramesResponseBodyFramesFacesEmotionDetails();
            return TeaModel.build(map, self);
        }

        public ListVideoFramesResponseBodyFramesFacesEmotionDetails setANGRY(Float ANGRY) {
            this.ANGRY = ANGRY;
            return this;
        }
        public Float getANGRY() {
            return this.ANGRY;
        }

        public ListVideoFramesResponseBodyFramesFacesEmotionDetails setCALM(Float CALM) {
            this.CALM = CALM;
            return this;
        }
        public Float getCALM() {
            return this.CALM;
        }

        public ListVideoFramesResponseBodyFramesFacesEmotionDetails setDISGUSTED(Float DISGUSTED) {
            this.DISGUSTED = DISGUSTED;
            return this;
        }
        public Float getDISGUSTED() {
            return this.DISGUSTED;
        }

        public ListVideoFramesResponseBodyFramesFacesEmotionDetails setHAPPY(Float HAPPY) {
            this.HAPPY = HAPPY;
            return this;
        }
        public Float getHAPPY() {
            return this.HAPPY;
        }

        public ListVideoFramesResponseBodyFramesFacesEmotionDetails setSAD(Float SAD) {
            this.SAD = SAD;
            return this;
        }
        public Float getSAD() {
            return this.SAD;
        }

        public ListVideoFramesResponseBodyFramesFacesEmotionDetails setSCARED(Float SCARED) {
            this.SCARED = SCARED;
            return this;
        }
        public Float getSCARED() {
            return this.SCARED;
        }

        public ListVideoFramesResponseBodyFramesFacesEmotionDetails setSURPRISED(Float SURPRISED) {
            this.SURPRISED = SURPRISED;
            return this;
        }
        public Float getSURPRISED() {
            return this.SURPRISED;
        }

    }

    public static class ListVideoFramesResponseBodyFramesFacesFaceAttributesFaceBoundary extends TeaModel {
        @NameInMap("Height")
        public Integer height;

        @NameInMap("Left")
        public Integer left;

        @NameInMap("Top")
        public Integer top;

        @NameInMap("Width")
        public Integer width;

        public static ListVideoFramesResponseBodyFramesFacesFaceAttributesFaceBoundary build(java.util.Map<String, ?> map) throws Exception {
            ListVideoFramesResponseBodyFramesFacesFaceAttributesFaceBoundary self = new ListVideoFramesResponseBodyFramesFacesFaceAttributesFaceBoundary();
            return TeaModel.build(map, self);
        }

        public ListVideoFramesResponseBodyFramesFacesFaceAttributesFaceBoundary setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public ListVideoFramesResponseBodyFramesFacesFaceAttributesFaceBoundary setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

        public ListVideoFramesResponseBodyFramesFacesFaceAttributesFaceBoundary setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public ListVideoFramesResponseBodyFramesFacesFaceAttributesFaceBoundary setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class ListVideoFramesResponseBodyFramesFacesFaceAttributesHeadPose extends TeaModel {
        @NameInMap("Pitch")
        public Float pitch;

        @NameInMap("Roll")
        public Float roll;

        @NameInMap("Yaw")
        public Float yaw;

        public static ListVideoFramesResponseBodyFramesFacesFaceAttributesHeadPose build(java.util.Map<String, ?> map) throws Exception {
            ListVideoFramesResponseBodyFramesFacesFaceAttributesHeadPose self = new ListVideoFramesResponseBodyFramesFacesFaceAttributesHeadPose();
            return TeaModel.build(map, self);
        }

        public ListVideoFramesResponseBodyFramesFacesFaceAttributesHeadPose setPitch(Float pitch) {
            this.pitch = pitch;
            return this;
        }
        public Float getPitch() {
            return this.pitch;
        }

        public ListVideoFramesResponseBodyFramesFacesFaceAttributesHeadPose setRoll(Float roll) {
            this.roll = roll;
            return this;
        }
        public Float getRoll() {
            return this.roll;
        }

        public ListVideoFramesResponseBodyFramesFacesFaceAttributesHeadPose setYaw(Float yaw) {
            this.yaw = yaw;
            return this;
        }
        public Float getYaw() {
            return this.yaw;
        }

    }

    public static class ListVideoFramesResponseBodyFramesFacesFaceAttributes extends TeaModel {
        @NameInMap("Beard")
        public String beard;

        @NameInMap("BeardConfidence")
        public Float beardConfidence;

        @NameInMap("FaceBoundary")
        public ListVideoFramesResponseBodyFramesFacesFaceAttributesFaceBoundary faceBoundary;

        @NameInMap("Glasses")
        public String glasses;

        @NameInMap("GlassesConfidence")
        public Float glassesConfidence;

        @NameInMap("HeadPose")
        public ListVideoFramesResponseBodyFramesFacesFaceAttributesHeadPose headPose;

        @NameInMap("Mask")
        public String mask;

        @NameInMap("MaskConfidence")
        public Float maskConfidence;

        public static ListVideoFramesResponseBodyFramesFacesFaceAttributes build(java.util.Map<String, ?> map) throws Exception {
            ListVideoFramesResponseBodyFramesFacesFaceAttributes self = new ListVideoFramesResponseBodyFramesFacesFaceAttributes();
            return TeaModel.build(map, self);
        }

        public ListVideoFramesResponseBodyFramesFacesFaceAttributes setBeard(String beard) {
            this.beard = beard;
            return this;
        }
        public String getBeard() {
            return this.beard;
        }

        public ListVideoFramesResponseBodyFramesFacesFaceAttributes setBeardConfidence(Float beardConfidence) {
            this.beardConfidence = beardConfidence;
            return this;
        }
        public Float getBeardConfidence() {
            return this.beardConfidence;
        }

        public ListVideoFramesResponseBodyFramesFacesFaceAttributes setFaceBoundary(ListVideoFramesResponseBodyFramesFacesFaceAttributesFaceBoundary faceBoundary) {
            this.faceBoundary = faceBoundary;
            return this;
        }
        public ListVideoFramesResponseBodyFramesFacesFaceAttributesFaceBoundary getFaceBoundary() {
            return this.faceBoundary;
        }

        public ListVideoFramesResponseBodyFramesFacesFaceAttributes setGlasses(String glasses) {
            this.glasses = glasses;
            return this;
        }
        public String getGlasses() {
            return this.glasses;
        }

        public ListVideoFramesResponseBodyFramesFacesFaceAttributes setGlassesConfidence(Float glassesConfidence) {
            this.glassesConfidence = glassesConfidence;
            return this;
        }
        public Float getGlassesConfidence() {
            return this.glassesConfidence;
        }

        public ListVideoFramesResponseBodyFramesFacesFaceAttributes setHeadPose(ListVideoFramesResponseBodyFramesFacesFaceAttributesHeadPose headPose) {
            this.headPose = headPose;
            return this;
        }
        public ListVideoFramesResponseBodyFramesFacesFaceAttributesHeadPose getHeadPose() {
            return this.headPose;
        }

        public ListVideoFramesResponseBodyFramesFacesFaceAttributes setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public ListVideoFramesResponseBodyFramesFacesFaceAttributes setMaskConfidence(Float maskConfidence) {
            this.maskConfidence = maskConfidence;
            return this;
        }
        public Float getMaskConfidence() {
            return this.maskConfidence;
        }

    }

    public static class ListVideoFramesResponseBodyFramesFaces extends TeaModel {
        @NameInMap("Age")
        public Integer age;

        @NameInMap("Attractive")
        public Float attractive;

        @NameInMap("Emotion")
        public String emotion;

        @NameInMap("EmotionConfidence")
        public Float emotionConfidence;

        @NameInMap("EmotionDetails")
        public ListVideoFramesResponseBodyFramesFacesEmotionDetails emotionDetails;

        @NameInMap("FaceAttributes")
        public ListVideoFramesResponseBodyFramesFacesFaceAttributes faceAttributes;

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

        @NameInMap("GroupId")
        public String groupId;

        public static ListVideoFramesResponseBodyFramesFaces build(java.util.Map<String, ?> map) throws Exception {
            ListVideoFramesResponseBodyFramesFaces self = new ListVideoFramesResponseBodyFramesFaces();
            return TeaModel.build(map, self);
        }

        public ListVideoFramesResponseBodyFramesFaces setAge(Integer age) {
            this.age = age;
            return this;
        }
        public Integer getAge() {
            return this.age;
        }

        public ListVideoFramesResponseBodyFramesFaces setAttractive(Float attractive) {
            this.attractive = attractive;
            return this;
        }
        public Float getAttractive() {
            return this.attractive;
        }

        public ListVideoFramesResponseBodyFramesFaces setEmotion(String emotion) {
            this.emotion = emotion;
            return this;
        }
        public String getEmotion() {
            return this.emotion;
        }

        public ListVideoFramesResponseBodyFramesFaces setEmotionConfidence(Float emotionConfidence) {
            this.emotionConfidence = emotionConfidence;
            return this;
        }
        public Float getEmotionConfidence() {
            return this.emotionConfidence;
        }

        public ListVideoFramesResponseBodyFramesFaces setEmotionDetails(ListVideoFramesResponseBodyFramesFacesEmotionDetails emotionDetails) {
            this.emotionDetails = emotionDetails;
            return this;
        }
        public ListVideoFramesResponseBodyFramesFacesEmotionDetails getEmotionDetails() {
            return this.emotionDetails;
        }

        public ListVideoFramesResponseBodyFramesFaces setFaceAttributes(ListVideoFramesResponseBodyFramesFacesFaceAttributes faceAttributes) {
            this.faceAttributes = faceAttributes;
            return this;
        }
        public ListVideoFramesResponseBodyFramesFacesFaceAttributes getFaceAttributes() {
            return this.faceAttributes;
        }

        public ListVideoFramesResponseBodyFramesFaces setFaceConfidence(Float faceConfidence) {
            this.faceConfidence = faceConfidence;
            return this;
        }
        public Float getFaceConfidence() {
            return this.faceConfidence;
        }

        public ListVideoFramesResponseBodyFramesFaces setFaceId(String faceId) {
            this.faceId = faceId;
            return this;
        }
        public String getFaceId() {
            return this.faceId;
        }

        public ListVideoFramesResponseBodyFramesFaces setFaceQuality(Float faceQuality) {
            this.faceQuality = faceQuality;
            return this;
        }
        public Float getFaceQuality() {
            return this.faceQuality;
        }

        public ListVideoFramesResponseBodyFramesFaces setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public ListVideoFramesResponseBodyFramesFaces setGenderConfidence(Float genderConfidence) {
            this.genderConfidence = genderConfidence;
            return this;
        }
        public Float getGenderConfidence() {
            return this.genderConfidence;
        }

        public ListVideoFramesResponseBodyFramesFaces setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

    }

    public static class ListVideoFramesResponseBodyFramesOCROCRBoundary extends TeaModel {
        @NameInMap("Height")
        public Integer height;

        @NameInMap("Left")
        public Integer left;

        @NameInMap("Top")
        public Integer top;

        @NameInMap("Width")
        public Integer width;

        public static ListVideoFramesResponseBodyFramesOCROCRBoundary build(java.util.Map<String, ?> map) throws Exception {
            ListVideoFramesResponseBodyFramesOCROCRBoundary self = new ListVideoFramesResponseBodyFramesOCROCRBoundary();
            return TeaModel.build(map, self);
        }

        public ListVideoFramesResponseBodyFramesOCROCRBoundary setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public ListVideoFramesResponseBodyFramesOCROCRBoundary setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

        public ListVideoFramesResponseBodyFramesOCROCRBoundary setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public ListVideoFramesResponseBodyFramesOCROCRBoundary setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class ListVideoFramesResponseBodyFramesOCR extends TeaModel {
        @NameInMap("OCRBoundary")
        public ListVideoFramesResponseBodyFramesOCROCRBoundary OCRBoundary;

        @NameInMap("OCRConfidence")
        public Float OCRConfidence;

        @NameInMap("OCRContents")
        public String OCRContents;

        public static ListVideoFramesResponseBodyFramesOCR build(java.util.Map<String, ?> map) throws Exception {
            ListVideoFramesResponseBodyFramesOCR self = new ListVideoFramesResponseBodyFramesOCR();
            return TeaModel.build(map, self);
        }

        public ListVideoFramesResponseBodyFramesOCR setOCRBoundary(ListVideoFramesResponseBodyFramesOCROCRBoundary OCRBoundary) {
            this.OCRBoundary = OCRBoundary;
            return this;
        }
        public ListVideoFramesResponseBodyFramesOCROCRBoundary getOCRBoundary() {
            return this.OCRBoundary;
        }

        public ListVideoFramesResponseBodyFramesOCR setOCRConfidence(Float OCRConfidence) {
            this.OCRConfidence = OCRConfidence;
            return this;
        }
        public Float getOCRConfidence() {
            return this.OCRConfidence;
        }

        public ListVideoFramesResponseBodyFramesOCR setOCRContents(String OCRContents) {
            this.OCRContents = OCRContents;
            return this;
        }
        public String getOCRContents() {
            return this.OCRContents;
        }

    }

    public static class ListVideoFramesResponseBodyFramesTags extends TeaModel {
        @NameInMap("ParentTagName")
        public String parentTagName;

        @NameInMap("TagConfidence")
        public Float tagConfidence;

        @NameInMap("TagLevel")
        public Integer tagLevel;

        @NameInMap("TagName")
        public String tagName;

        public static ListVideoFramesResponseBodyFramesTags build(java.util.Map<String, ?> map) throws Exception {
            ListVideoFramesResponseBodyFramesTags self = new ListVideoFramesResponseBodyFramesTags();
            return TeaModel.build(map, self);
        }

        public ListVideoFramesResponseBodyFramesTags setParentTagName(String parentTagName) {
            this.parentTagName = parentTagName;
            return this;
        }
        public String getParentTagName() {
            return this.parentTagName;
        }

        public ListVideoFramesResponseBodyFramesTags setTagConfidence(Float tagConfidence) {
            this.tagConfidence = tagConfidence;
            return this;
        }
        public Float getTagConfidence() {
            return this.tagConfidence;
        }

        public ListVideoFramesResponseBodyFramesTags setTagLevel(Integer tagLevel) {
            this.tagLevel = tagLevel;
            return this;
        }
        public Integer getTagLevel() {
            return this.tagLevel;
        }

        public ListVideoFramesResponseBodyFramesTags setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

    public static class ListVideoFramesResponseBodyFrames extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Exif")
        public String exif;

        @NameInMap("ExternalId")
        public String externalId;

        @NameInMap("Faces")
        public java.util.List<ListVideoFramesResponseBodyFramesFaces> faces;

        @NameInMap("FacesFailReason")
        public String facesFailReason;

        @NameInMap("FacesModifyTime")
        public String facesModifyTime;

        @NameInMap("FacesStatus")
        public String facesStatus;

        @NameInMap("FileSize")
        public Integer fileSize;

        @NameInMap("ImageFormat")
        public String imageFormat;

        @NameInMap("ImageHeight")
        public Integer imageHeight;

        @NameInMap("ImageTime")
        public String imageTime;

        @NameInMap("ImageUri")
        public String imageUri;

        @NameInMap("ImageWidth")
        public Integer imageWidth;

        @NameInMap("Location")
        public String location;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("OCR")
        public java.util.List<ListVideoFramesResponseBodyFramesOCR> OCR;

        @NameInMap("OCRFailReason")
        public String OCRFailReason;

        @NameInMap("OCRModifyTime")
        public String OCRModifyTime;

        @NameInMap("OCRStatus")
        public String OCRStatus;

        @NameInMap("Orientation")
        public String orientation;

        @NameInMap("RemarksA")
        public String remarksA;

        @NameInMap("RemarksB")
        public String remarksB;

        @NameInMap("RemarksC")
        public String remarksC;

        @NameInMap("RemarksD")
        public String remarksD;

        @NameInMap("SourcePosition")
        public String sourcePosition;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("SourceUri")
        public String sourceUri;

        @NameInMap("Tags")
        public java.util.List<ListVideoFramesResponseBodyFramesTags> tags;

        @NameInMap("TagsFailReason")
        public String tagsFailReason;

        @NameInMap("TagsModifyTime")
        public String tagsModifyTime;

        @NameInMap("TagsStatus")
        public String tagsStatus;

        public static ListVideoFramesResponseBodyFrames build(java.util.Map<String, ?> map) throws Exception {
            ListVideoFramesResponseBodyFrames self = new ListVideoFramesResponseBodyFrames();
            return TeaModel.build(map, self);
        }

        public ListVideoFramesResponseBodyFrames setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListVideoFramesResponseBodyFrames setExif(String exif) {
            this.exif = exif;
            return this;
        }
        public String getExif() {
            return this.exif;
        }

        public ListVideoFramesResponseBodyFrames setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public ListVideoFramesResponseBodyFrames setFaces(java.util.List<ListVideoFramesResponseBodyFramesFaces> faces) {
            this.faces = faces;
            return this;
        }
        public java.util.List<ListVideoFramesResponseBodyFramesFaces> getFaces() {
            return this.faces;
        }

        public ListVideoFramesResponseBodyFrames setFacesFailReason(String facesFailReason) {
            this.facesFailReason = facesFailReason;
            return this;
        }
        public String getFacesFailReason() {
            return this.facesFailReason;
        }

        public ListVideoFramesResponseBodyFrames setFacesModifyTime(String facesModifyTime) {
            this.facesModifyTime = facesModifyTime;
            return this;
        }
        public String getFacesModifyTime() {
            return this.facesModifyTime;
        }

        public ListVideoFramesResponseBodyFrames setFacesStatus(String facesStatus) {
            this.facesStatus = facesStatus;
            return this;
        }
        public String getFacesStatus() {
            return this.facesStatus;
        }

        public ListVideoFramesResponseBodyFrames setFileSize(Integer fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Integer getFileSize() {
            return this.fileSize;
        }

        public ListVideoFramesResponseBodyFrames setImageFormat(String imageFormat) {
            this.imageFormat = imageFormat;
            return this;
        }
        public String getImageFormat() {
            return this.imageFormat;
        }

        public ListVideoFramesResponseBodyFrames setImageHeight(Integer imageHeight) {
            this.imageHeight = imageHeight;
            return this;
        }
        public Integer getImageHeight() {
            return this.imageHeight;
        }

        public ListVideoFramesResponseBodyFrames setImageTime(String imageTime) {
            this.imageTime = imageTime;
            return this;
        }
        public String getImageTime() {
            return this.imageTime;
        }

        public ListVideoFramesResponseBodyFrames setImageUri(String imageUri) {
            this.imageUri = imageUri;
            return this;
        }
        public String getImageUri() {
            return this.imageUri;
        }

        public ListVideoFramesResponseBodyFrames setImageWidth(Integer imageWidth) {
            this.imageWidth = imageWidth;
            return this;
        }
        public Integer getImageWidth() {
            return this.imageWidth;
        }

        public ListVideoFramesResponseBodyFrames setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListVideoFramesResponseBodyFrames setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListVideoFramesResponseBodyFrames setOCR(java.util.List<ListVideoFramesResponseBodyFramesOCR> OCR) {
            this.OCR = OCR;
            return this;
        }
        public java.util.List<ListVideoFramesResponseBodyFramesOCR> getOCR() {
            return this.OCR;
        }

        public ListVideoFramesResponseBodyFrames setOCRFailReason(String OCRFailReason) {
            this.OCRFailReason = OCRFailReason;
            return this;
        }
        public String getOCRFailReason() {
            return this.OCRFailReason;
        }

        public ListVideoFramesResponseBodyFrames setOCRModifyTime(String OCRModifyTime) {
            this.OCRModifyTime = OCRModifyTime;
            return this;
        }
        public String getOCRModifyTime() {
            return this.OCRModifyTime;
        }

        public ListVideoFramesResponseBodyFrames setOCRStatus(String OCRStatus) {
            this.OCRStatus = OCRStatus;
            return this;
        }
        public String getOCRStatus() {
            return this.OCRStatus;
        }

        public ListVideoFramesResponseBodyFrames setOrientation(String orientation) {
            this.orientation = orientation;
            return this;
        }
        public String getOrientation() {
            return this.orientation;
        }

        public ListVideoFramesResponseBodyFrames setRemarksA(String remarksA) {
            this.remarksA = remarksA;
            return this;
        }
        public String getRemarksA() {
            return this.remarksA;
        }

        public ListVideoFramesResponseBodyFrames setRemarksB(String remarksB) {
            this.remarksB = remarksB;
            return this;
        }
        public String getRemarksB() {
            return this.remarksB;
        }

        public ListVideoFramesResponseBodyFrames setRemarksC(String remarksC) {
            this.remarksC = remarksC;
            return this;
        }
        public String getRemarksC() {
            return this.remarksC;
        }

        public ListVideoFramesResponseBodyFrames setRemarksD(String remarksD) {
            this.remarksD = remarksD;
            return this;
        }
        public String getRemarksD() {
            return this.remarksD;
        }

        public ListVideoFramesResponseBodyFrames setSourcePosition(String sourcePosition) {
            this.sourcePosition = sourcePosition;
            return this;
        }
        public String getSourcePosition() {
            return this.sourcePosition;
        }

        public ListVideoFramesResponseBodyFrames setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListVideoFramesResponseBodyFrames setSourceUri(String sourceUri) {
            this.sourceUri = sourceUri;
            return this;
        }
        public String getSourceUri() {
            return this.sourceUri;
        }

        public ListVideoFramesResponseBodyFrames setTags(java.util.List<ListVideoFramesResponseBodyFramesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListVideoFramesResponseBodyFramesTags> getTags() {
            return this.tags;
        }

        public ListVideoFramesResponseBodyFrames setTagsFailReason(String tagsFailReason) {
            this.tagsFailReason = tagsFailReason;
            return this;
        }
        public String getTagsFailReason() {
            return this.tagsFailReason;
        }

        public ListVideoFramesResponseBodyFrames setTagsModifyTime(String tagsModifyTime) {
            this.tagsModifyTime = tagsModifyTime;
            return this;
        }
        public String getTagsModifyTime() {
            return this.tagsModifyTime;
        }

        public ListVideoFramesResponseBodyFrames setTagsStatus(String tagsStatus) {
            this.tagsStatus = tagsStatus;
            return this;
        }
        public String getTagsStatus() {
            return this.tagsStatus;
        }

    }

}
