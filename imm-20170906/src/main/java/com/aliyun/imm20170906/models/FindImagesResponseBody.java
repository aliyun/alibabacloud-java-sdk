// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class FindImagesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Images")
    public java.util.List<FindImagesResponseBodyImages> images;

    @NameInMap("NextMarker")
    public String nextMarker;

    @NameInMap("SetId")
    public String setId;

    public static FindImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindImagesResponseBody self = new FindImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public FindImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FindImagesResponseBody setImages(java.util.List<FindImagesResponseBodyImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<FindImagesResponseBodyImages> getImages() {
        return this.images;
    }

    public FindImagesResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

    public FindImagesResponseBody setSetId(String setId) {
        this.setId = setId;
        return this;
    }
    public String getSetId() {
        return this.setId;
    }

    public static class FindImagesResponseBodyImagesTags extends TeaModel {
        @NameInMap("TagConfidence")
        public Float tagConfidence;

        @NameInMap("TagName")
        public String tagName;

        @NameInMap("TagLevel")
        public Integer tagLevel;

        @NameInMap("ParentTagName")
        public String parentTagName;

        public static FindImagesResponseBodyImagesTags build(java.util.Map<String, ?> map) throws Exception {
            FindImagesResponseBodyImagesTags self = new FindImagesResponseBodyImagesTags();
            return TeaModel.build(map, self);
        }

        public FindImagesResponseBodyImagesTags setTagConfidence(Float tagConfidence) {
            this.tagConfidence = tagConfidence;
            return this;
        }
        public Float getTagConfidence() {
            return this.tagConfidence;
        }

        public FindImagesResponseBodyImagesTags setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public FindImagesResponseBodyImagesTags setTagLevel(Integer tagLevel) {
            this.tagLevel = tagLevel;
            return this;
        }
        public Integer getTagLevel() {
            return this.tagLevel;
        }

        public FindImagesResponseBodyImagesTags setParentTagName(String parentTagName) {
            this.parentTagName = parentTagName;
            return this;
        }
        public String getParentTagName() {
            return this.parentTagName;
        }

    }

    public static class FindImagesResponseBodyImagesOCROCRBoundary extends TeaModel {
        @NameInMap("Top")
        public Integer top;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Left")
        public Integer left;

        public static FindImagesResponseBodyImagesOCROCRBoundary build(java.util.Map<String, ?> map) throws Exception {
            FindImagesResponseBodyImagesOCROCRBoundary self = new FindImagesResponseBodyImagesOCROCRBoundary();
            return TeaModel.build(map, self);
        }

        public FindImagesResponseBodyImagesOCROCRBoundary setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public FindImagesResponseBodyImagesOCROCRBoundary setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public FindImagesResponseBodyImagesOCROCRBoundary setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public FindImagesResponseBodyImagesOCROCRBoundary setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

    }

    public static class FindImagesResponseBodyImagesOCR extends TeaModel {
        @NameInMap("OCRConfidence")
        public Float OCRConfidence;

        @NameInMap("OCRContents")
        public String OCRContents;

        @NameInMap("OCRBoundary")
        public FindImagesResponseBodyImagesOCROCRBoundary OCRBoundary;

        public static FindImagesResponseBodyImagesOCR build(java.util.Map<String, ?> map) throws Exception {
            FindImagesResponseBodyImagesOCR self = new FindImagesResponseBodyImagesOCR();
            return TeaModel.build(map, self);
        }

        public FindImagesResponseBodyImagesOCR setOCRConfidence(Float OCRConfidence) {
            this.OCRConfidence = OCRConfidence;
            return this;
        }
        public Float getOCRConfidence() {
            return this.OCRConfidence;
        }

        public FindImagesResponseBodyImagesOCR setOCRContents(String OCRContents) {
            this.OCRContents = OCRContents;
            return this;
        }
        public String getOCRContents() {
            return this.OCRContents;
        }

        public FindImagesResponseBodyImagesOCR setOCRBoundary(FindImagesResponseBodyImagesOCROCRBoundary OCRBoundary) {
            this.OCRBoundary = OCRBoundary;
            return this;
        }
        public FindImagesResponseBodyImagesOCROCRBoundary getOCRBoundary() {
            return this.OCRBoundary;
        }

    }

    public static class FindImagesResponseBodyImagesAddress extends TeaModel {
        @NameInMap("Township")
        public String township;

        @NameInMap("District")
        public String district;

        @NameInMap("AddressLine")
        public String addressLine;

        @NameInMap("Country")
        public String country;

        @NameInMap("City")
        public String city;

        @NameInMap("Province")
        public String province;

        public static FindImagesResponseBodyImagesAddress build(java.util.Map<String, ?> map) throws Exception {
            FindImagesResponseBodyImagesAddress self = new FindImagesResponseBodyImagesAddress();
            return TeaModel.build(map, self);
        }

        public FindImagesResponseBodyImagesAddress setTownship(String township) {
            this.township = township;
            return this;
        }
        public String getTownship() {
            return this.township;
        }

        public FindImagesResponseBodyImagesAddress setDistrict(String district) {
            this.district = district;
            return this;
        }
        public String getDistrict() {
            return this.district;
        }

        public FindImagesResponseBodyImagesAddress setAddressLine(String addressLine) {
            this.addressLine = addressLine;
            return this;
        }
        public String getAddressLine() {
            return this.addressLine;
        }

        public FindImagesResponseBodyImagesAddress setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public FindImagesResponseBodyImagesAddress setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public FindImagesResponseBodyImagesAddress setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

    public static class FindImagesResponseBodyImagesFacesFaceAttributesFaceBoundary extends TeaModel {
        @NameInMap("Top")
        public Integer top;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Left")
        public Integer left;

        public static FindImagesResponseBodyImagesFacesFaceAttributesFaceBoundary build(java.util.Map<String, ?> map) throws Exception {
            FindImagesResponseBodyImagesFacesFaceAttributesFaceBoundary self = new FindImagesResponseBodyImagesFacesFaceAttributesFaceBoundary();
            return TeaModel.build(map, self);
        }

        public FindImagesResponseBodyImagesFacesFaceAttributesFaceBoundary setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public FindImagesResponseBodyImagesFacesFaceAttributesFaceBoundary setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public FindImagesResponseBodyImagesFacesFaceAttributesFaceBoundary setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public FindImagesResponseBodyImagesFacesFaceAttributesFaceBoundary setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

    }

    public static class FindImagesResponseBodyImagesFacesFaceAttributesHeadPose extends TeaModel {
        @NameInMap("Pitch")
        public Float pitch;

        @NameInMap("Roll")
        public Float roll;

        @NameInMap("Yaw")
        public Float yaw;

        public static FindImagesResponseBodyImagesFacesFaceAttributesHeadPose build(java.util.Map<String, ?> map) throws Exception {
            FindImagesResponseBodyImagesFacesFaceAttributesHeadPose self = new FindImagesResponseBodyImagesFacesFaceAttributesHeadPose();
            return TeaModel.build(map, self);
        }

        public FindImagesResponseBodyImagesFacesFaceAttributesHeadPose setPitch(Float pitch) {
            this.pitch = pitch;
            return this;
        }
        public Float getPitch() {
            return this.pitch;
        }

        public FindImagesResponseBodyImagesFacesFaceAttributesHeadPose setRoll(Float roll) {
            this.roll = roll;
            return this;
        }
        public Float getRoll() {
            return this.roll;
        }

        public FindImagesResponseBodyImagesFacesFaceAttributesHeadPose setYaw(Float yaw) {
            this.yaw = yaw;
            return this;
        }
        public Float getYaw() {
            return this.yaw;
        }

    }

    public static class FindImagesResponseBodyImagesFacesFaceAttributes extends TeaModel {
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

        @NameInMap("FaceBoundary")
        public FindImagesResponseBodyImagesFacesFaceAttributesFaceBoundary faceBoundary;

        @NameInMap("HeadPose")
        public FindImagesResponseBodyImagesFacesFaceAttributesHeadPose headPose;

        @NameInMap("Beard")
        public String beard;

        public static FindImagesResponseBodyImagesFacesFaceAttributes build(java.util.Map<String, ?> map) throws Exception {
            FindImagesResponseBodyImagesFacesFaceAttributes self = new FindImagesResponseBodyImagesFacesFaceAttributes();
            return TeaModel.build(map, self);
        }

        public FindImagesResponseBodyImagesFacesFaceAttributes setGlassesConfidence(Float glassesConfidence) {
            this.glassesConfidence = glassesConfidence;
            return this;
        }
        public Float getGlassesConfidence() {
            return this.glassesConfidence;
        }

        public FindImagesResponseBodyImagesFacesFaceAttributes setGlasses(String glasses) {
            this.glasses = glasses;
            return this;
        }
        public String getGlasses() {
            return this.glasses;
        }

        public FindImagesResponseBodyImagesFacesFaceAttributes setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public FindImagesResponseBodyImagesFacesFaceAttributes setBeardConfidence(Float beardConfidence) {
            this.beardConfidence = beardConfidence;
            return this;
        }
        public Float getBeardConfidence() {
            return this.beardConfidence;
        }

        public FindImagesResponseBodyImagesFacesFaceAttributes setMaskConfidence(Float maskConfidence) {
            this.maskConfidence = maskConfidence;
            return this;
        }
        public Float getMaskConfidence() {
            return this.maskConfidence;
        }

        public FindImagesResponseBodyImagesFacesFaceAttributes setFaceBoundary(FindImagesResponseBodyImagesFacesFaceAttributesFaceBoundary faceBoundary) {
            this.faceBoundary = faceBoundary;
            return this;
        }
        public FindImagesResponseBodyImagesFacesFaceAttributesFaceBoundary getFaceBoundary() {
            return this.faceBoundary;
        }

        public FindImagesResponseBodyImagesFacesFaceAttributes setHeadPose(FindImagesResponseBodyImagesFacesFaceAttributesHeadPose headPose) {
            this.headPose = headPose;
            return this;
        }
        public FindImagesResponseBodyImagesFacesFaceAttributesHeadPose getHeadPose() {
            return this.headPose;
        }

        public FindImagesResponseBodyImagesFacesFaceAttributes setBeard(String beard) {
            this.beard = beard;
            return this;
        }
        public String getBeard() {
            return this.beard;
        }

    }

    public static class FindImagesResponseBodyImagesFacesEmotionDetails extends TeaModel {
        @NameInMap("HAPPY")
        public Float HAPPY;

        @NameInMap("SURPRISED")
        public Float SURPRISED;

        @NameInMap("CALM")
        public Float CALM;

        @NameInMap("DISGUSTED")
        public Float DISGUSTED;

        @NameInMap("ANGRY")
        public Float ANGRY;

        @NameInMap("SAD")
        public Float SAD;

        @NameInMap("SCARED")
        public Float SCARED;

        public static FindImagesResponseBodyImagesFacesEmotionDetails build(java.util.Map<String, ?> map) throws Exception {
            FindImagesResponseBodyImagesFacesEmotionDetails self = new FindImagesResponseBodyImagesFacesEmotionDetails();
            return TeaModel.build(map, self);
        }

        public FindImagesResponseBodyImagesFacesEmotionDetails setHAPPY(Float HAPPY) {
            this.HAPPY = HAPPY;
            return this;
        }
        public Float getHAPPY() {
            return this.HAPPY;
        }

        public FindImagesResponseBodyImagesFacesEmotionDetails setSURPRISED(Float SURPRISED) {
            this.SURPRISED = SURPRISED;
            return this;
        }
        public Float getSURPRISED() {
            return this.SURPRISED;
        }

        public FindImagesResponseBodyImagesFacesEmotionDetails setCALM(Float CALM) {
            this.CALM = CALM;
            return this;
        }
        public Float getCALM() {
            return this.CALM;
        }

        public FindImagesResponseBodyImagesFacesEmotionDetails setDISGUSTED(Float DISGUSTED) {
            this.DISGUSTED = DISGUSTED;
            return this;
        }
        public Float getDISGUSTED() {
            return this.DISGUSTED;
        }

        public FindImagesResponseBodyImagesFacesEmotionDetails setANGRY(Float ANGRY) {
            this.ANGRY = ANGRY;
            return this;
        }
        public Float getANGRY() {
            return this.ANGRY;
        }

        public FindImagesResponseBodyImagesFacesEmotionDetails setSAD(Float SAD) {
            this.SAD = SAD;
            return this;
        }
        public Float getSAD() {
            return this.SAD;
        }

        public FindImagesResponseBodyImagesFacesEmotionDetails setSCARED(Float SCARED) {
            this.SCARED = SCARED;
            return this;
        }
        public Float getSCARED() {
            return this.SCARED;
        }

    }

    public static class FindImagesResponseBodyImagesFaces extends TeaModel {
        @NameInMap("Gender")
        public String gender;

        @NameInMap("FaceId")
        public String faceId;

        @NameInMap("GenderConfidence")
        public Float genderConfidence;

        @NameInMap("FaceAttributes")
        public FindImagesResponseBodyImagesFacesFaceAttributes faceAttributes;

        @NameInMap("FaceQuality")
        public Float faceQuality;

        @NameInMap("Emotion")
        public String emotion;

        @NameInMap("Age")
        public Integer age;

        @NameInMap("FaceConfidence")
        public Float faceConfidence;

        @NameInMap("EmotionConfidence")
        public Float emotionConfidence;

        @NameInMap("Attractive")
        public Float attractive;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("EmotionDetails")
        public FindImagesResponseBodyImagesFacesEmotionDetails emotionDetails;

        public static FindImagesResponseBodyImagesFaces build(java.util.Map<String, ?> map) throws Exception {
            FindImagesResponseBodyImagesFaces self = new FindImagesResponseBodyImagesFaces();
            return TeaModel.build(map, self);
        }

        public FindImagesResponseBodyImagesFaces setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public FindImagesResponseBodyImagesFaces setFaceId(String faceId) {
            this.faceId = faceId;
            return this;
        }
        public String getFaceId() {
            return this.faceId;
        }

        public FindImagesResponseBodyImagesFaces setGenderConfidence(Float genderConfidence) {
            this.genderConfidence = genderConfidence;
            return this;
        }
        public Float getGenderConfidence() {
            return this.genderConfidence;
        }

        public FindImagesResponseBodyImagesFaces setFaceAttributes(FindImagesResponseBodyImagesFacesFaceAttributes faceAttributes) {
            this.faceAttributes = faceAttributes;
            return this;
        }
        public FindImagesResponseBodyImagesFacesFaceAttributes getFaceAttributes() {
            return this.faceAttributes;
        }

        public FindImagesResponseBodyImagesFaces setFaceQuality(Float faceQuality) {
            this.faceQuality = faceQuality;
            return this;
        }
        public Float getFaceQuality() {
            return this.faceQuality;
        }

        public FindImagesResponseBodyImagesFaces setEmotion(String emotion) {
            this.emotion = emotion;
            return this;
        }
        public String getEmotion() {
            return this.emotion;
        }

        public FindImagesResponseBodyImagesFaces setAge(Integer age) {
            this.age = age;
            return this;
        }
        public Integer getAge() {
            return this.age;
        }

        public FindImagesResponseBodyImagesFaces setFaceConfidence(Float faceConfidence) {
            this.faceConfidence = faceConfidence;
            return this;
        }
        public Float getFaceConfidence() {
            return this.faceConfidence;
        }

        public FindImagesResponseBodyImagesFaces setEmotionConfidence(Float emotionConfidence) {
            this.emotionConfidence = emotionConfidence;
            return this;
        }
        public Float getEmotionConfidence() {
            return this.emotionConfidence;
        }

        public FindImagesResponseBodyImagesFaces setAttractive(Float attractive) {
            this.attractive = attractive;
            return this;
        }
        public Float getAttractive() {
            return this.attractive;
        }

        public FindImagesResponseBodyImagesFaces setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public FindImagesResponseBodyImagesFaces setEmotionDetails(FindImagesResponseBodyImagesFacesEmotionDetails emotionDetails) {
            this.emotionDetails = emotionDetails;
            return this;
        }
        public FindImagesResponseBodyImagesFacesEmotionDetails getEmotionDetails() {
            return this.emotionDetails;
        }

    }

    public static class FindImagesResponseBodyImagesImageQuality extends TeaModel {
        @NameInMap("OverallScore")
        public Float overallScore;

        @NameInMap("Color")
        public Float color;

        @NameInMap("ColorScore")
        public Float colorScore;

        @NameInMap("ContrastScore")
        public Float contrastScore;

        @NameInMap("Contrast")
        public Float contrast;

        @NameInMap("ExposureScore")
        public Float exposureScore;

        @NameInMap("ClarityScore")
        public Float clarityScore;

        @NameInMap("Clarity")
        public Float clarity;

        @NameInMap("Exposure")
        public Float exposure;

        @NameInMap("CompositionScore")
        public Float compositionScore;

        public static FindImagesResponseBodyImagesImageQuality build(java.util.Map<String, ?> map) throws Exception {
            FindImagesResponseBodyImagesImageQuality self = new FindImagesResponseBodyImagesImageQuality();
            return TeaModel.build(map, self);
        }

        public FindImagesResponseBodyImagesImageQuality setOverallScore(Float overallScore) {
            this.overallScore = overallScore;
            return this;
        }
        public Float getOverallScore() {
            return this.overallScore;
        }

        public FindImagesResponseBodyImagesImageQuality setColor(Float color) {
            this.color = color;
            return this;
        }
        public Float getColor() {
            return this.color;
        }

        public FindImagesResponseBodyImagesImageQuality setColorScore(Float colorScore) {
            this.colorScore = colorScore;
            return this;
        }
        public Float getColorScore() {
            return this.colorScore;
        }

        public FindImagesResponseBodyImagesImageQuality setContrastScore(Float contrastScore) {
            this.contrastScore = contrastScore;
            return this;
        }
        public Float getContrastScore() {
            return this.contrastScore;
        }

        public FindImagesResponseBodyImagesImageQuality setContrast(Float contrast) {
            this.contrast = contrast;
            return this;
        }
        public Float getContrast() {
            return this.contrast;
        }

        public FindImagesResponseBodyImagesImageQuality setExposureScore(Float exposureScore) {
            this.exposureScore = exposureScore;
            return this;
        }
        public Float getExposureScore() {
            return this.exposureScore;
        }

        public FindImagesResponseBodyImagesImageQuality setClarityScore(Float clarityScore) {
            this.clarityScore = clarityScore;
            return this;
        }
        public Float getClarityScore() {
            return this.clarityScore;
        }

        public FindImagesResponseBodyImagesImageQuality setClarity(Float clarity) {
            this.clarity = clarity;
            return this;
        }
        public Float getClarity() {
            return this.clarity;
        }

        public FindImagesResponseBodyImagesImageQuality setExposure(Float exposure) {
            this.exposure = exposure;
            return this;
        }
        public Float getExposure() {
            return this.exposure;
        }

        public FindImagesResponseBodyImagesImageQuality setCompositionScore(Float compositionScore) {
            this.compositionScore = compositionScore;
            return this;
        }
        public Float getCompositionScore() {
            return this.compositionScore;
        }

    }

    public static class FindImagesResponseBodyImagesCroppingSuggestionCroppingBoundary extends TeaModel {
        @NameInMap("Top")
        public Integer top;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Left")
        public Integer left;

        public static FindImagesResponseBodyImagesCroppingSuggestionCroppingBoundary build(java.util.Map<String, ?> map) throws Exception {
            FindImagesResponseBodyImagesCroppingSuggestionCroppingBoundary self = new FindImagesResponseBodyImagesCroppingSuggestionCroppingBoundary();
            return TeaModel.build(map, self);
        }

        public FindImagesResponseBodyImagesCroppingSuggestionCroppingBoundary setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public FindImagesResponseBodyImagesCroppingSuggestionCroppingBoundary setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public FindImagesResponseBodyImagesCroppingSuggestionCroppingBoundary setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public FindImagesResponseBodyImagesCroppingSuggestionCroppingBoundary setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

    }

    public static class FindImagesResponseBodyImagesCroppingSuggestion extends TeaModel {
        @NameInMap("Score")
        public Float score;

        @NameInMap("CroppingBoundary")
        public FindImagesResponseBodyImagesCroppingSuggestionCroppingBoundary croppingBoundary;

        @NameInMap("AspectRatio")
        public String aspectRatio;

        public static FindImagesResponseBodyImagesCroppingSuggestion build(java.util.Map<String, ?> map) throws Exception {
            FindImagesResponseBodyImagesCroppingSuggestion self = new FindImagesResponseBodyImagesCroppingSuggestion();
            return TeaModel.build(map, self);
        }

        public FindImagesResponseBodyImagesCroppingSuggestion setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public FindImagesResponseBodyImagesCroppingSuggestion setCroppingBoundary(FindImagesResponseBodyImagesCroppingSuggestionCroppingBoundary croppingBoundary) {
            this.croppingBoundary = croppingBoundary;
            return this;
        }
        public FindImagesResponseBodyImagesCroppingSuggestionCroppingBoundary getCroppingBoundary() {
            return this.croppingBoundary;
        }

        public FindImagesResponseBodyImagesCroppingSuggestion setAspectRatio(String aspectRatio) {
            this.aspectRatio = aspectRatio;
            return this;
        }
        public String getAspectRatio() {
            return this.aspectRatio;
        }

    }

    public static class FindImagesResponseBodyImages extends TeaModel {
        @NameInMap("CroppingSuggestionStatus")
        public String croppingSuggestionStatus;

        @NameInMap("ImageQualityModifyTime")
        public String imageQualityModifyTime;

        @NameInMap("TagsFailReason")
        public String tagsFailReason;

        @NameInMap("RemarksC")
        public String remarksC;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("FacesFailReason")
        public String facesFailReason;

        @NameInMap("Tags")
        public java.util.List<FindImagesResponseBodyImagesTags> tags;

        @NameInMap("FacesModifyTime")
        public String facesModifyTime;

        @NameInMap("ImageTime")
        public String imageTime;

        @NameInMap("OCRModifyTime")
        public String OCRModifyTime;

        @NameInMap("AddressModifyTime")
        public String addressModifyTime;

        @NameInMap("OCR")
        public java.util.List<FindImagesResponseBodyImagesOCR> OCR;

        @NameInMap("ImageQualityFailReason")
        public String imageQualityFailReason;

        @NameInMap("FacesStatus")
        public String facesStatus;

        @NameInMap("ImageHeight")
        public Integer imageHeight;

        @NameInMap("RemarksArrayA")
        public String remarksArrayA;

        @NameInMap("Address")
        public FindImagesResponseBodyImagesAddress address;

        @NameInMap("ExternalId")
        public String externalId;

        @NameInMap("SourceUri")
        public String sourceUri;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("FileSize")
        public Integer fileSize;

        @NameInMap("SourcePosition")
        public String sourcePosition;

        @NameInMap("Faces")
        public java.util.List<FindImagesResponseBodyImagesFaces> faces;

        @NameInMap("ImageQualityStatus")
        public String imageQualityStatus;

        @NameInMap("OCRFailReason")
        public String OCRFailReason;

        @NameInMap("AddressFailReason")
        public String addressFailReason;

        @NameInMap("ImageQuality")
        public FindImagesResponseBodyImagesImageQuality imageQuality;

        @NameInMap("CroppingSuggestionModifyTime")
        public String croppingSuggestionModifyTime;

        @NameInMap("ImageFormat")
        public String imageFormat;

        @NameInMap("ImageWidth")
        public Integer imageWidth;

        @NameInMap("RemarksArrayB")
        public String remarksArrayB;

        @NameInMap("CroppingSuggestion")
        public java.util.List<FindImagesResponseBodyImagesCroppingSuggestion> croppingSuggestion;

        @NameInMap("Orientation")
        public String orientation;

        @NameInMap("RemarksD")
        public String remarksD;

        @NameInMap("TagsStatus")
        public String tagsStatus;

        @NameInMap("CroppingSuggestionFailReason")
        public String croppingSuggestionFailReason;

        @NameInMap("RemarksA")
        public String remarksA;

        @NameInMap("ImageUri")
        public String imageUri;

        @NameInMap("TagsModifyTime")
        public String tagsModifyTime;

        @NameInMap("OCRStatus")
        public String OCRStatus;

        @NameInMap("AddressStatus")
        public String addressStatus;

        @NameInMap("Exif")
        public String exif;

        @NameInMap("Location")
        public String location;

        @NameInMap("RemarksB")
        public String remarksB;

        public static FindImagesResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            FindImagesResponseBodyImages self = new FindImagesResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public FindImagesResponseBodyImages setCroppingSuggestionStatus(String croppingSuggestionStatus) {
            this.croppingSuggestionStatus = croppingSuggestionStatus;
            return this;
        }
        public String getCroppingSuggestionStatus() {
            return this.croppingSuggestionStatus;
        }

        public FindImagesResponseBodyImages setImageQualityModifyTime(String imageQualityModifyTime) {
            this.imageQualityModifyTime = imageQualityModifyTime;
            return this;
        }
        public String getImageQualityModifyTime() {
            return this.imageQualityModifyTime;
        }

        public FindImagesResponseBodyImages setTagsFailReason(String tagsFailReason) {
            this.tagsFailReason = tagsFailReason;
            return this;
        }
        public String getTagsFailReason() {
            return this.tagsFailReason;
        }

        public FindImagesResponseBodyImages setRemarksC(String remarksC) {
            this.remarksC = remarksC;
            return this;
        }
        public String getRemarksC() {
            return this.remarksC;
        }

        public FindImagesResponseBodyImages setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public FindImagesResponseBodyImages setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public FindImagesResponseBodyImages setFacesFailReason(String facesFailReason) {
            this.facesFailReason = facesFailReason;
            return this;
        }
        public String getFacesFailReason() {
            return this.facesFailReason;
        }

        public FindImagesResponseBodyImages setTags(java.util.List<FindImagesResponseBodyImagesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<FindImagesResponseBodyImagesTags> getTags() {
            return this.tags;
        }

        public FindImagesResponseBodyImages setFacesModifyTime(String facesModifyTime) {
            this.facesModifyTime = facesModifyTime;
            return this;
        }
        public String getFacesModifyTime() {
            return this.facesModifyTime;
        }

        public FindImagesResponseBodyImages setImageTime(String imageTime) {
            this.imageTime = imageTime;
            return this;
        }
        public String getImageTime() {
            return this.imageTime;
        }

        public FindImagesResponseBodyImages setOCRModifyTime(String OCRModifyTime) {
            this.OCRModifyTime = OCRModifyTime;
            return this;
        }
        public String getOCRModifyTime() {
            return this.OCRModifyTime;
        }

        public FindImagesResponseBodyImages setAddressModifyTime(String addressModifyTime) {
            this.addressModifyTime = addressModifyTime;
            return this;
        }
        public String getAddressModifyTime() {
            return this.addressModifyTime;
        }

        public FindImagesResponseBodyImages setOCR(java.util.List<FindImagesResponseBodyImagesOCR> OCR) {
            this.OCR = OCR;
            return this;
        }
        public java.util.List<FindImagesResponseBodyImagesOCR> getOCR() {
            return this.OCR;
        }

        public FindImagesResponseBodyImages setImageQualityFailReason(String imageQualityFailReason) {
            this.imageQualityFailReason = imageQualityFailReason;
            return this;
        }
        public String getImageQualityFailReason() {
            return this.imageQualityFailReason;
        }

        public FindImagesResponseBodyImages setFacesStatus(String facesStatus) {
            this.facesStatus = facesStatus;
            return this;
        }
        public String getFacesStatus() {
            return this.facesStatus;
        }

        public FindImagesResponseBodyImages setImageHeight(Integer imageHeight) {
            this.imageHeight = imageHeight;
            return this;
        }
        public Integer getImageHeight() {
            return this.imageHeight;
        }

        public FindImagesResponseBodyImages setRemarksArrayA(String remarksArrayA) {
            this.remarksArrayA = remarksArrayA;
            return this;
        }
        public String getRemarksArrayA() {
            return this.remarksArrayA;
        }

        public FindImagesResponseBodyImages setAddress(FindImagesResponseBodyImagesAddress address) {
            this.address = address;
            return this;
        }
        public FindImagesResponseBodyImagesAddress getAddress() {
            return this.address;
        }

        public FindImagesResponseBodyImages setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public FindImagesResponseBodyImages setSourceUri(String sourceUri) {
            this.sourceUri = sourceUri;
            return this;
        }
        public String getSourceUri() {
            return this.sourceUri;
        }

        public FindImagesResponseBodyImages setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public FindImagesResponseBodyImages setFileSize(Integer fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Integer getFileSize() {
            return this.fileSize;
        }

        public FindImagesResponseBodyImages setSourcePosition(String sourcePosition) {
            this.sourcePosition = sourcePosition;
            return this;
        }
        public String getSourcePosition() {
            return this.sourcePosition;
        }

        public FindImagesResponseBodyImages setFaces(java.util.List<FindImagesResponseBodyImagesFaces> faces) {
            this.faces = faces;
            return this;
        }
        public java.util.List<FindImagesResponseBodyImagesFaces> getFaces() {
            return this.faces;
        }

        public FindImagesResponseBodyImages setImageQualityStatus(String imageQualityStatus) {
            this.imageQualityStatus = imageQualityStatus;
            return this;
        }
        public String getImageQualityStatus() {
            return this.imageQualityStatus;
        }

        public FindImagesResponseBodyImages setOCRFailReason(String OCRFailReason) {
            this.OCRFailReason = OCRFailReason;
            return this;
        }
        public String getOCRFailReason() {
            return this.OCRFailReason;
        }

        public FindImagesResponseBodyImages setAddressFailReason(String addressFailReason) {
            this.addressFailReason = addressFailReason;
            return this;
        }
        public String getAddressFailReason() {
            return this.addressFailReason;
        }

        public FindImagesResponseBodyImages setImageQuality(FindImagesResponseBodyImagesImageQuality imageQuality) {
            this.imageQuality = imageQuality;
            return this;
        }
        public FindImagesResponseBodyImagesImageQuality getImageQuality() {
            return this.imageQuality;
        }

        public FindImagesResponseBodyImages setCroppingSuggestionModifyTime(String croppingSuggestionModifyTime) {
            this.croppingSuggestionModifyTime = croppingSuggestionModifyTime;
            return this;
        }
        public String getCroppingSuggestionModifyTime() {
            return this.croppingSuggestionModifyTime;
        }

        public FindImagesResponseBodyImages setImageFormat(String imageFormat) {
            this.imageFormat = imageFormat;
            return this;
        }
        public String getImageFormat() {
            return this.imageFormat;
        }

        public FindImagesResponseBodyImages setImageWidth(Integer imageWidth) {
            this.imageWidth = imageWidth;
            return this;
        }
        public Integer getImageWidth() {
            return this.imageWidth;
        }

        public FindImagesResponseBodyImages setRemarksArrayB(String remarksArrayB) {
            this.remarksArrayB = remarksArrayB;
            return this;
        }
        public String getRemarksArrayB() {
            return this.remarksArrayB;
        }

        public FindImagesResponseBodyImages setCroppingSuggestion(java.util.List<FindImagesResponseBodyImagesCroppingSuggestion> croppingSuggestion) {
            this.croppingSuggestion = croppingSuggestion;
            return this;
        }
        public java.util.List<FindImagesResponseBodyImagesCroppingSuggestion> getCroppingSuggestion() {
            return this.croppingSuggestion;
        }

        public FindImagesResponseBodyImages setOrientation(String orientation) {
            this.orientation = orientation;
            return this;
        }
        public String getOrientation() {
            return this.orientation;
        }

        public FindImagesResponseBodyImages setRemarksD(String remarksD) {
            this.remarksD = remarksD;
            return this;
        }
        public String getRemarksD() {
            return this.remarksD;
        }

        public FindImagesResponseBodyImages setTagsStatus(String tagsStatus) {
            this.tagsStatus = tagsStatus;
            return this;
        }
        public String getTagsStatus() {
            return this.tagsStatus;
        }

        public FindImagesResponseBodyImages setCroppingSuggestionFailReason(String croppingSuggestionFailReason) {
            this.croppingSuggestionFailReason = croppingSuggestionFailReason;
            return this;
        }
        public String getCroppingSuggestionFailReason() {
            return this.croppingSuggestionFailReason;
        }

        public FindImagesResponseBodyImages setRemarksA(String remarksA) {
            this.remarksA = remarksA;
            return this;
        }
        public String getRemarksA() {
            return this.remarksA;
        }

        public FindImagesResponseBodyImages setImageUri(String imageUri) {
            this.imageUri = imageUri;
            return this;
        }
        public String getImageUri() {
            return this.imageUri;
        }

        public FindImagesResponseBodyImages setTagsModifyTime(String tagsModifyTime) {
            this.tagsModifyTime = tagsModifyTime;
            return this;
        }
        public String getTagsModifyTime() {
            return this.tagsModifyTime;
        }

        public FindImagesResponseBodyImages setOCRStatus(String OCRStatus) {
            this.OCRStatus = OCRStatus;
            return this;
        }
        public String getOCRStatus() {
            return this.OCRStatus;
        }

        public FindImagesResponseBodyImages setAddressStatus(String addressStatus) {
            this.addressStatus = addressStatus;
            return this;
        }
        public String getAddressStatus() {
            return this.addressStatus;
        }

        public FindImagesResponseBodyImages setExif(String exif) {
            this.exif = exif;
            return this;
        }
        public String getExif() {
            return this.exif;
        }

        public FindImagesResponseBodyImages setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public FindImagesResponseBodyImages setRemarksB(String remarksB) {
            this.remarksB = remarksB;
            return this;
        }
        public String getRemarksB() {
            return this.remarksB;
        }

    }

}
