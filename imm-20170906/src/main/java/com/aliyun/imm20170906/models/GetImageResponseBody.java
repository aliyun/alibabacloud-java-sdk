// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class GetImageResponseBody extends TeaModel {
    @NameInMap("Address")
    public GetImageResponseBodyAddress address;

    @NameInMap("AddressFailReason")
    public String addressFailReason;

    @NameInMap("AddressModifyTime")
    public String addressModifyTime;

    @NameInMap("AddressStatus")
    public String addressStatus;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("CroppingSuggestion")
    public java.util.List<GetImageResponseBodyCroppingSuggestion> croppingSuggestion;

    @NameInMap("CroppingSuggestionFailReason")
    public String croppingSuggestionFailReason;

    @NameInMap("CroppingSuggestionModifyTime")
    public String croppingSuggestionModifyTime;

    @NameInMap("CroppingSuggestionStatus")
    public String croppingSuggestionStatus;

    @NameInMap("Exif")
    public String exif;

    @NameInMap("ExternalId")
    public String externalId;

    @NameInMap("Faces")
    public java.util.List<GetImageResponseBodyFaces> faces;

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

    @NameInMap("ImageQuality")
    public GetImageResponseBodyImageQuality imageQuality;

    @NameInMap("ImageQualityFailReason")
    public String imageQualityFailReason;

    @NameInMap("ImageQualityModifyTime")
    public String imageQualityModifyTime;

    @NameInMap("ImageQualityStatus")
    public String imageQualityStatus;

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
    public java.util.List<GetImageResponseBodyOCR> OCR;

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

    @NameInMap("RemarksArrayA")
    public String remarksArrayA;

    @NameInMap("RemarksArrayB")
    public String remarksArrayB;

    @NameInMap("RemarksB")
    public String remarksB;

    @NameInMap("RemarksC")
    public String remarksC;

    @NameInMap("RemarksD")
    public String remarksD;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SetId")
    public String setId;

    @NameInMap("SourcePosition")
    public String sourcePosition;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("SourceUri")
    public String sourceUri;

    @NameInMap("Tags")
    public java.util.List<GetImageResponseBodyTags> tags;

    @NameInMap("TagsFailReason")
    public String tagsFailReason;

    @NameInMap("TagsModifyTime")
    public String tagsModifyTime;

    @NameInMap("TagsStatus")
    public String tagsStatus;

    public static GetImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetImageResponseBody self = new GetImageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetImageResponseBody setAddress(GetImageResponseBodyAddress address) {
        this.address = address;
        return this;
    }
    public GetImageResponseBodyAddress getAddress() {
        return this.address;
    }

    public GetImageResponseBody setAddressFailReason(String addressFailReason) {
        this.addressFailReason = addressFailReason;
        return this;
    }
    public String getAddressFailReason() {
        return this.addressFailReason;
    }

    public GetImageResponseBody setAddressModifyTime(String addressModifyTime) {
        this.addressModifyTime = addressModifyTime;
        return this;
    }
    public String getAddressModifyTime() {
        return this.addressModifyTime;
    }

    public GetImageResponseBody setAddressStatus(String addressStatus) {
        this.addressStatus = addressStatus;
        return this;
    }
    public String getAddressStatus() {
        return this.addressStatus;
    }

    public GetImageResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetImageResponseBody setCroppingSuggestion(java.util.List<GetImageResponseBodyCroppingSuggestion> croppingSuggestion) {
        this.croppingSuggestion = croppingSuggestion;
        return this;
    }
    public java.util.List<GetImageResponseBodyCroppingSuggestion> getCroppingSuggestion() {
        return this.croppingSuggestion;
    }

    public GetImageResponseBody setCroppingSuggestionFailReason(String croppingSuggestionFailReason) {
        this.croppingSuggestionFailReason = croppingSuggestionFailReason;
        return this;
    }
    public String getCroppingSuggestionFailReason() {
        return this.croppingSuggestionFailReason;
    }

    public GetImageResponseBody setCroppingSuggestionModifyTime(String croppingSuggestionModifyTime) {
        this.croppingSuggestionModifyTime = croppingSuggestionModifyTime;
        return this;
    }
    public String getCroppingSuggestionModifyTime() {
        return this.croppingSuggestionModifyTime;
    }

    public GetImageResponseBody setCroppingSuggestionStatus(String croppingSuggestionStatus) {
        this.croppingSuggestionStatus = croppingSuggestionStatus;
        return this;
    }
    public String getCroppingSuggestionStatus() {
        return this.croppingSuggestionStatus;
    }

    public GetImageResponseBody setExif(String exif) {
        this.exif = exif;
        return this;
    }
    public String getExif() {
        return this.exif;
    }

    public GetImageResponseBody setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

    public GetImageResponseBody setFaces(java.util.List<GetImageResponseBodyFaces> faces) {
        this.faces = faces;
        return this;
    }
    public java.util.List<GetImageResponseBodyFaces> getFaces() {
        return this.faces;
    }

    public GetImageResponseBody setFacesFailReason(String facesFailReason) {
        this.facesFailReason = facesFailReason;
        return this;
    }
    public String getFacesFailReason() {
        return this.facesFailReason;
    }

    public GetImageResponseBody setFacesModifyTime(String facesModifyTime) {
        this.facesModifyTime = facesModifyTime;
        return this;
    }
    public String getFacesModifyTime() {
        return this.facesModifyTime;
    }

    public GetImageResponseBody setFacesStatus(String facesStatus) {
        this.facesStatus = facesStatus;
        return this;
    }
    public String getFacesStatus() {
        return this.facesStatus;
    }

    public GetImageResponseBody setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Integer getFileSize() {
        return this.fileSize;
    }

    public GetImageResponseBody setImageFormat(String imageFormat) {
        this.imageFormat = imageFormat;
        return this;
    }
    public String getImageFormat() {
        return this.imageFormat;
    }

    public GetImageResponseBody setImageHeight(Integer imageHeight) {
        this.imageHeight = imageHeight;
        return this;
    }
    public Integer getImageHeight() {
        return this.imageHeight;
    }

    public GetImageResponseBody setImageQuality(GetImageResponseBodyImageQuality imageQuality) {
        this.imageQuality = imageQuality;
        return this;
    }
    public GetImageResponseBodyImageQuality getImageQuality() {
        return this.imageQuality;
    }

    public GetImageResponseBody setImageQualityFailReason(String imageQualityFailReason) {
        this.imageQualityFailReason = imageQualityFailReason;
        return this;
    }
    public String getImageQualityFailReason() {
        return this.imageQualityFailReason;
    }

    public GetImageResponseBody setImageQualityModifyTime(String imageQualityModifyTime) {
        this.imageQualityModifyTime = imageQualityModifyTime;
        return this;
    }
    public String getImageQualityModifyTime() {
        return this.imageQualityModifyTime;
    }

    public GetImageResponseBody setImageQualityStatus(String imageQualityStatus) {
        this.imageQualityStatus = imageQualityStatus;
        return this;
    }
    public String getImageQualityStatus() {
        return this.imageQualityStatus;
    }

    public GetImageResponseBody setImageTime(String imageTime) {
        this.imageTime = imageTime;
        return this;
    }
    public String getImageTime() {
        return this.imageTime;
    }

    public GetImageResponseBody setImageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }
    public String getImageUri() {
        return this.imageUri;
    }

    public GetImageResponseBody setImageWidth(Integer imageWidth) {
        this.imageWidth = imageWidth;
        return this;
    }
    public Integer getImageWidth() {
        return this.imageWidth;
    }

    public GetImageResponseBody setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public GetImageResponseBody setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public GetImageResponseBody setOCR(java.util.List<GetImageResponseBodyOCR> OCR) {
        this.OCR = OCR;
        return this;
    }
    public java.util.List<GetImageResponseBodyOCR> getOCR() {
        return this.OCR;
    }

    public GetImageResponseBody setOCRFailReason(String OCRFailReason) {
        this.OCRFailReason = OCRFailReason;
        return this;
    }
    public String getOCRFailReason() {
        return this.OCRFailReason;
    }

    public GetImageResponseBody setOCRModifyTime(String OCRModifyTime) {
        this.OCRModifyTime = OCRModifyTime;
        return this;
    }
    public String getOCRModifyTime() {
        return this.OCRModifyTime;
    }

    public GetImageResponseBody setOCRStatus(String OCRStatus) {
        this.OCRStatus = OCRStatus;
        return this;
    }
    public String getOCRStatus() {
        return this.OCRStatus;
    }

    public GetImageResponseBody setOrientation(String orientation) {
        this.orientation = orientation;
        return this;
    }
    public String getOrientation() {
        return this.orientation;
    }

    public GetImageResponseBody setRemarksA(String remarksA) {
        this.remarksA = remarksA;
        return this;
    }
    public String getRemarksA() {
        return this.remarksA;
    }

    public GetImageResponseBody setRemarksArrayA(String remarksArrayA) {
        this.remarksArrayA = remarksArrayA;
        return this;
    }
    public String getRemarksArrayA() {
        return this.remarksArrayA;
    }

    public GetImageResponseBody setRemarksArrayB(String remarksArrayB) {
        this.remarksArrayB = remarksArrayB;
        return this;
    }
    public String getRemarksArrayB() {
        return this.remarksArrayB;
    }

    public GetImageResponseBody setRemarksB(String remarksB) {
        this.remarksB = remarksB;
        return this;
    }
    public String getRemarksB() {
        return this.remarksB;
    }

    public GetImageResponseBody setRemarksC(String remarksC) {
        this.remarksC = remarksC;
        return this;
    }
    public String getRemarksC() {
        return this.remarksC;
    }

    public GetImageResponseBody setRemarksD(String remarksD) {
        this.remarksD = remarksD;
        return this;
    }
    public String getRemarksD() {
        return this.remarksD;
    }

    public GetImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetImageResponseBody setSetId(String setId) {
        this.setId = setId;
        return this;
    }
    public String getSetId() {
        return this.setId;
    }

    public GetImageResponseBody setSourcePosition(String sourcePosition) {
        this.sourcePosition = sourcePosition;
        return this;
    }
    public String getSourcePosition() {
        return this.sourcePosition;
    }

    public GetImageResponseBody setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public GetImageResponseBody setSourceUri(String sourceUri) {
        this.sourceUri = sourceUri;
        return this;
    }
    public String getSourceUri() {
        return this.sourceUri;
    }

    public GetImageResponseBody setTags(java.util.List<GetImageResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetImageResponseBodyTags> getTags() {
        return this.tags;
    }

    public GetImageResponseBody setTagsFailReason(String tagsFailReason) {
        this.tagsFailReason = tagsFailReason;
        return this;
    }
    public String getTagsFailReason() {
        return this.tagsFailReason;
    }

    public GetImageResponseBody setTagsModifyTime(String tagsModifyTime) {
        this.tagsModifyTime = tagsModifyTime;
        return this;
    }
    public String getTagsModifyTime() {
        return this.tagsModifyTime;
    }

    public GetImageResponseBody setTagsStatus(String tagsStatus) {
        this.tagsStatus = tagsStatus;
        return this;
    }
    public String getTagsStatus() {
        return this.tagsStatus;
    }

    public static class GetImageResponseBodyAddress extends TeaModel {
        @NameInMap("AddressLine")
        public String addressLine;

        @NameInMap("City")
        public String city;

        @NameInMap("Country")
        public String country;

        @NameInMap("District")
        public String district;

        @NameInMap("Province")
        public String province;

        @NameInMap("Township")
        public String township;

        public static GetImageResponseBodyAddress build(java.util.Map<String, ?> map) throws Exception {
            GetImageResponseBodyAddress self = new GetImageResponseBodyAddress();
            return TeaModel.build(map, self);
        }

        public GetImageResponseBodyAddress setAddressLine(String addressLine) {
            this.addressLine = addressLine;
            return this;
        }
        public String getAddressLine() {
            return this.addressLine;
        }

        public GetImageResponseBodyAddress setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public GetImageResponseBodyAddress setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public GetImageResponseBodyAddress setDistrict(String district) {
            this.district = district;
            return this;
        }
        public String getDistrict() {
            return this.district;
        }

        public GetImageResponseBodyAddress setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public GetImageResponseBodyAddress setTownship(String township) {
            this.township = township;
            return this;
        }
        public String getTownship() {
            return this.township;
        }

    }

    public static class GetImageResponseBodyCroppingSuggestionCroppingBoundary extends TeaModel {
        @NameInMap("Height")
        public Integer height;

        @NameInMap("Left")
        public Integer left;

        @NameInMap("Top")
        public Integer top;

        @NameInMap("Width")
        public Integer width;

        public static GetImageResponseBodyCroppingSuggestionCroppingBoundary build(java.util.Map<String, ?> map) throws Exception {
            GetImageResponseBodyCroppingSuggestionCroppingBoundary self = new GetImageResponseBodyCroppingSuggestionCroppingBoundary();
            return TeaModel.build(map, self);
        }

        public GetImageResponseBodyCroppingSuggestionCroppingBoundary setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public GetImageResponseBodyCroppingSuggestionCroppingBoundary setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

        public GetImageResponseBodyCroppingSuggestionCroppingBoundary setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public GetImageResponseBodyCroppingSuggestionCroppingBoundary setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class GetImageResponseBodyCroppingSuggestion extends TeaModel {
        @NameInMap("AspectRatio")
        public String aspectRatio;

        @NameInMap("CroppingBoundary")
        public GetImageResponseBodyCroppingSuggestionCroppingBoundary croppingBoundary;

        @NameInMap("Score")
        public Float score;

        public static GetImageResponseBodyCroppingSuggestion build(java.util.Map<String, ?> map) throws Exception {
            GetImageResponseBodyCroppingSuggestion self = new GetImageResponseBodyCroppingSuggestion();
            return TeaModel.build(map, self);
        }

        public GetImageResponseBodyCroppingSuggestion setAspectRatio(String aspectRatio) {
            this.aspectRatio = aspectRatio;
            return this;
        }
        public String getAspectRatio() {
            return this.aspectRatio;
        }

        public GetImageResponseBodyCroppingSuggestion setCroppingBoundary(GetImageResponseBodyCroppingSuggestionCroppingBoundary croppingBoundary) {
            this.croppingBoundary = croppingBoundary;
            return this;
        }
        public GetImageResponseBodyCroppingSuggestionCroppingBoundary getCroppingBoundary() {
            return this.croppingBoundary;
        }

        public GetImageResponseBodyCroppingSuggestion setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class GetImageResponseBodyFacesEmotionDetails extends TeaModel {
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

        public static GetImageResponseBodyFacesEmotionDetails build(java.util.Map<String, ?> map) throws Exception {
            GetImageResponseBodyFacesEmotionDetails self = new GetImageResponseBodyFacesEmotionDetails();
            return TeaModel.build(map, self);
        }

        public GetImageResponseBodyFacesEmotionDetails setANGRY(Float ANGRY) {
            this.ANGRY = ANGRY;
            return this;
        }
        public Float getANGRY() {
            return this.ANGRY;
        }

        public GetImageResponseBodyFacesEmotionDetails setCALM(Float CALM) {
            this.CALM = CALM;
            return this;
        }
        public Float getCALM() {
            return this.CALM;
        }

        public GetImageResponseBodyFacesEmotionDetails setDISGUSTED(Float DISGUSTED) {
            this.DISGUSTED = DISGUSTED;
            return this;
        }
        public Float getDISGUSTED() {
            return this.DISGUSTED;
        }

        public GetImageResponseBodyFacesEmotionDetails setHAPPY(Float HAPPY) {
            this.HAPPY = HAPPY;
            return this;
        }
        public Float getHAPPY() {
            return this.HAPPY;
        }

        public GetImageResponseBodyFacesEmotionDetails setSAD(Float SAD) {
            this.SAD = SAD;
            return this;
        }
        public Float getSAD() {
            return this.SAD;
        }

        public GetImageResponseBodyFacesEmotionDetails setSCARED(Float SCARED) {
            this.SCARED = SCARED;
            return this;
        }
        public Float getSCARED() {
            return this.SCARED;
        }

        public GetImageResponseBodyFacesEmotionDetails setSURPRISED(Float SURPRISED) {
            this.SURPRISED = SURPRISED;
            return this;
        }
        public Float getSURPRISED() {
            return this.SURPRISED;
        }

    }

    public static class GetImageResponseBodyFacesFaceAttributesFaceBoundary extends TeaModel {
        @NameInMap("Height")
        public Integer height;

        @NameInMap("Left")
        public Integer left;

        @NameInMap("Top")
        public Integer top;

        @NameInMap("Width")
        public Integer width;

        public static GetImageResponseBodyFacesFaceAttributesFaceBoundary build(java.util.Map<String, ?> map) throws Exception {
            GetImageResponseBodyFacesFaceAttributesFaceBoundary self = new GetImageResponseBodyFacesFaceAttributesFaceBoundary();
            return TeaModel.build(map, self);
        }

        public GetImageResponseBodyFacesFaceAttributesFaceBoundary setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public GetImageResponseBodyFacesFaceAttributesFaceBoundary setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

        public GetImageResponseBodyFacesFaceAttributesFaceBoundary setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public GetImageResponseBodyFacesFaceAttributesFaceBoundary setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class GetImageResponseBodyFacesFaceAttributesHeadPose extends TeaModel {
        @NameInMap("Pitch")
        public Float pitch;

        @NameInMap("Roll")
        public Float roll;

        @NameInMap("Yaw")
        public Float yaw;

        public static GetImageResponseBodyFacesFaceAttributesHeadPose build(java.util.Map<String, ?> map) throws Exception {
            GetImageResponseBodyFacesFaceAttributesHeadPose self = new GetImageResponseBodyFacesFaceAttributesHeadPose();
            return TeaModel.build(map, self);
        }

        public GetImageResponseBodyFacesFaceAttributesHeadPose setPitch(Float pitch) {
            this.pitch = pitch;
            return this;
        }
        public Float getPitch() {
            return this.pitch;
        }

        public GetImageResponseBodyFacesFaceAttributesHeadPose setRoll(Float roll) {
            this.roll = roll;
            return this;
        }
        public Float getRoll() {
            return this.roll;
        }

        public GetImageResponseBodyFacesFaceAttributesHeadPose setYaw(Float yaw) {
            this.yaw = yaw;
            return this;
        }
        public Float getYaw() {
            return this.yaw;
        }

    }

    public static class GetImageResponseBodyFacesFaceAttributes extends TeaModel {
        @NameInMap("Beard")
        public String beard;

        @NameInMap("BeardConfidence")
        public Float beardConfidence;

        @NameInMap("FaceBoundary")
        public GetImageResponseBodyFacesFaceAttributesFaceBoundary faceBoundary;

        @NameInMap("Glasses")
        public String glasses;

        @NameInMap("GlassesConfidence")
        public Float glassesConfidence;

        @NameInMap("HeadPose")
        public GetImageResponseBodyFacesFaceAttributesHeadPose headPose;

        @NameInMap("Mask")
        public String mask;

        @NameInMap("MaskConfidence")
        public Float maskConfidence;

        public static GetImageResponseBodyFacesFaceAttributes build(java.util.Map<String, ?> map) throws Exception {
            GetImageResponseBodyFacesFaceAttributes self = new GetImageResponseBodyFacesFaceAttributes();
            return TeaModel.build(map, self);
        }

        public GetImageResponseBodyFacesFaceAttributes setBeard(String beard) {
            this.beard = beard;
            return this;
        }
        public String getBeard() {
            return this.beard;
        }

        public GetImageResponseBodyFacesFaceAttributes setBeardConfidence(Float beardConfidence) {
            this.beardConfidence = beardConfidence;
            return this;
        }
        public Float getBeardConfidence() {
            return this.beardConfidence;
        }

        public GetImageResponseBodyFacesFaceAttributes setFaceBoundary(GetImageResponseBodyFacesFaceAttributesFaceBoundary faceBoundary) {
            this.faceBoundary = faceBoundary;
            return this;
        }
        public GetImageResponseBodyFacesFaceAttributesFaceBoundary getFaceBoundary() {
            return this.faceBoundary;
        }

        public GetImageResponseBodyFacesFaceAttributes setGlasses(String glasses) {
            this.glasses = glasses;
            return this;
        }
        public String getGlasses() {
            return this.glasses;
        }

        public GetImageResponseBodyFacesFaceAttributes setGlassesConfidence(Float glassesConfidence) {
            this.glassesConfidence = glassesConfidence;
            return this;
        }
        public Float getGlassesConfidence() {
            return this.glassesConfidence;
        }

        public GetImageResponseBodyFacesFaceAttributes setHeadPose(GetImageResponseBodyFacesFaceAttributesHeadPose headPose) {
            this.headPose = headPose;
            return this;
        }
        public GetImageResponseBodyFacesFaceAttributesHeadPose getHeadPose() {
            return this.headPose;
        }

        public GetImageResponseBodyFacesFaceAttributes setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public GetImageResponseBodyFacesFaceAttributes setMaskConfidence(Float maskConfidence) {
            this.maskConfidence = maskConfidence;
            return this;
        }
        public Float getMaskConfidence() {
            return this.maskConfidence;
        }

    }

    public static class GetImageResponseBodyFaces extends TeaModel {
        @NameInMap("Age")
        public String age;

        @NameInMap("Attractive")
        public Float attractive;

        @NameInMap("Emotion")
        public String emotion;

        @NameInMap("EmotionConfidence")
        public Float emotionConfidence;

        @NameInMap("EmotionDetails")
        public GetImageResponseBodyFacesEmotionDetails emotionDetails;

        @NameInMap("FaceAttributes")
        public GetImageResponseBodyFacesFaceAttributes faceAttributes;

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

        public static GetImageResponseBodyFaces build(java.util.Map<String, ?> map) throws Exception {
            GetImageResponseBodyFaces self = new GetImageResponseBodyFaces();
            return TeaModel.build(map, self);
        }

        public GetImageResponseBodyFaces setAge(String age) {
            this.age = age;
            return this;
        }
        public String getAge() {
            return this.age;
        }

        public GetImageResponseBodyFaces setAttractive(Float attractive) {
            this.attractive = attractive;
            return this;
        }
        public Float getAttractive() {
            return this.attractive;
        }

        public GetImageResponseBodyFaces setEmotion(String emotion) {
            this.emotion = emotion;
            return this;
        }
        public String getEmotion() {
            return this.emotion;
        }

        public GetImageResponseBodyFaces setEmotionConfidence(Float emotionConfidence) {
            this.emotionConfidence = emotionConfidence;
            return this;
        }
        public Float getEmotionConfidence() {
            return this.emotionConfidence;
        }

        public GetImageResponseBodyFaces setEmotionDetails(GetImageResponseBodyFacesEmotionDetails emotionDetails) {
            this.emotionDetails = emotionDetails;
            return this;
        }
        public GetImageResponseBodyFacesEmotionDetails getEmotionDetails() {
            return this.emotionDetails;
        }

        public GetImageResponseBodyFaces setFaceAttributes(GetImageResponseBodyFacesFaceAttributes faceAttributes) {
            this.faceAttributes = faceAttributes;
            return this;
        }
        public GetImageResponseBodyFacesFaceAttributes getFaceAttributes() {
            return this.faceAttributes;
        }

        public GetImageResponseBodyFaces setFaceConfidence(Float faceConfidence) {
            this.faceConfidence = faceConfidence;
            return this;
        }
        public Float getFaceConfidence() {
            return this.faceConfidence;
        }

        public GetImageResponseBodyFaces setFaceId(String faceId) {
            this.faceId = faceId;
            return this;
        }
        public String getFaceId() {
            return this.faceId;
        }

        public GetImageResponseBodyFaces setFaceQuality(Float faceQuality) {
            this.faceQuality = faceQuality;
            return this;
        }
        public Float getFaceQuality() {
            return this.faceQuality;
        }

        public GetImageResponseBodyFaces setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public GetImageResponseBodyFaces setGenderConfidence(Float genderConfidence) {
            this.genderConfidence = genderConfidence;
            return this;
        }
        public Float getGenderConfidence() {
            return this.genderConfidence;
        }

        public GetImageResponseBodyFaces setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

    }

    public static class GetImageResponseBodyImageQuality extends TeaModel {
        @NameInMap("Clarity")
        public Float clarity;

        @NameInMap("ClarityScore")
        public Float clarityScore;

        @NameInMap("Color")
        public Float color;

        @NameInMap("ColorScore")
        public Float colorScore;

        @NameInMap("CompositionScore")
        public Float compositionScore;

        @NameInMap("Contrast")
        public Float contrast;

        @NameInMap("ContrastScore")
        public Float contrastScore;

        @NameInMap("Exposure")
        public Float exposure;

        @NameInMap("ExposureScore")
        public Float exposureScore;

        @NameInMap("OverallScore")
        public Float overallScore;

        public static GetImageResponseBodyImageQuality build(java.util.Map<String, ?> map) throws Exception {
            GetImageResponseBodyImageQuality self = new GetImageResponseBodyImageQuality();
            return TeaModel.build(map, self);
        }

        public GetImageResponseBodyImageQuality setClarity(Float clarity) {
            this.clarity = clarity;
            return this;
        }
        public Float getClarity() {
            return this.clarity;
        }

        public GetImageResponseBodyImageQuality setClarityScore(Float clarityScore) {
            this.clarityScore = clarityScore;
            return this;
        }
        public Float getClarityScore() {
            return this.clarityScore;
        }

        public GetImageResponseBodyImageQuality setColor(Float color) {
            this.color = color;
            return this;
        }
        public Float getColor() {
            return this.color;
        }

        public GetImageResponseBodyImageQuality setColorScore(Float colorScore) {
            this.colorScore = colorScore;
            return this;
        }
        public Float getColorScore() {
            return this.colorScore;
        }

        public GetImageResponseBodyImageQuality setCompositionScore(Float compositionScore) {
            this.compositionScore = compositionScore;
            return this;
        }
        public Float getCompositionScore() {
            return this.compositionScore;
        }

        public GetImageResponseBodyImageQuality setContrast(Float contrast) {
            this.contrast = contrast;
            return this;
        }
        public Float getContrast() {
            return this.contrast;
        }

        public GetImageResponseBodyImageQuality setContrastScore(Float contrastScore) {
            this.contrastScore = contrastScore;
            return this;
        }
        public Float getContrastScore() {
            return this.contrastScore;
        }

        public GetImageResponseBodyImageQuality setExposure(Float exposure) {
            this.exposure = exposure;
            return this;
        }
        public Float getExposure() {
            return this.exposure;
        }

        public GetImageResponseBodyImageQuality setExposureScore(Float exposureScore) {
            this.exposureScore = exposureScore;
            return this;
        }
        public Float getExposureScore() {
            return this.exposureScore;
        }

        public GetImageResponseBodyImageQuality setOverallScore(Float overallScore) {
            this.overallScore = overallScore;
            return this;
        }
        public Float getOverallScore() {
            return this.overallScore;
        }

    }

    public static class GetImageResponseBodyOCROCRBoundary extends TeaModel {
        @NameInMap("Height")
        public Integer height;

        @NameInMap("Left")
        public Integer left;

        @NameInMap("Top")
        public Integer top;

        @NameInMap("Width")
        public Integer width;

        public static GetImageResponseBodyOCROCRBoundary build(java.util.Map<String, ?> map) throws Exception {
            GetImageResponseBodyOCROCRBoundary self = new GetImageResponseBodyOCROCRBoundary();
            return TeaModel.build(map, self);
        }

        public GetImageResponseBodyOCROCRBoundary setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public GetImageResponseBodyOCROCRBoundary setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

        public GetImageResponseBodyOCROCRBoundary setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public GetImageResponseBodyOCROCRBoundary setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class GetImageResponseBodyOCR extends TeaModel {
        @NameInMap("OCRBoundary")
        public GetImageResponseBodyOCROCRBoundary OCRBoundary;

        @NameInMap("OCRConfidence")
        public Float OCRConfidence;

        @NameInMap("OCRContents")
        public String OCRContents;

        public static GetImageResponseBodyOCR build(java.util.Map<String, ?> map) throws Exception {
            GetImageResponseBodyOCR self = new GetImageResponseBodyOCR();
            return TeaModel.build(map, self);
        }

        public GetImageResponseBodyOCR setOCRBoundary(GetImageResponseBodyOCROCRBoundary OCRBoundary) {
            this.OCRBoundary = OCRBoundary;
            return this;
        }
        public GetImageResponseBodyOCROCRBoundary getOCRBoundary() {
            return this.OCRBoundary;
        }

        public GetImageResponseBodyOCR setOCRConfidence(Float OCRConfidence) {
            this.OCRConfidence = OCRConfidence;
            return this;
        }
        public Float getOCRConfidence() {
            return this.OCRConfidence;
        }

        public GetImageResponseBodyOCR setOCRContents(String OCRContents) {
            this.OCRContents = OCRContents;
            return this;
        }
        public String getOCRContents() {
            return this.OCRContents;
        }

    }

    public static class GetImageResponseBodyTags extends TeaModel {
        @NameInMap("CentricScore")
        public Float centricScore;

        @NameInMap("ParentTagName")
        public String parentTagName;

        @NameInMap("TagConfidence")
        public Float tagConfidence;

        @NameInMap("TagLevel")
        public Integer tagLevel;

        @NameInMap("TagName")
        public String tagName;

        public static GetImageResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            GetImageResponseBodyTags self = new GetImageResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public GetImageResponseBodyTags setCentricScore(Float centricScore) {
            this.centricScore = centricScore;
            return this;
        }
        public Float getCentricScore() {
            return this.centricScore;
        }

        public GetImageResponseBodyTags setParentTagName(String parentTagName) {
            this.parentTagName = parentTagName;
            return this;
        }
        public String getParentTagName() {
            return this.parentTagName;
        }

        public GetImageResponseBodyTags setTagConfidence(Float tagConfidence) {
            this.tagConfidence = tagConfidence;
            return this;
        }
        public Float getTagConfidence() {
            return this.tagConfidence;
        }

        public GetImageResponseBodyTags setTagLevel(Integer tagLevel) {
            this.tagLevel = tagLevel;
            return this;
        }
        public Integer getTagLevel() {
            return this.tagLevel;
        }

        public GetImageResponseBodyTags setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

}
