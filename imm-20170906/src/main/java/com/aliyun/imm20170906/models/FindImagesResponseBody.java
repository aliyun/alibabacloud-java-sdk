// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class FindImagesResponseBody extends TeaModel {
    @NameInMap("Images")
    public java.util.List<FindImagesResponseBodyImages> images;

    @NameInMap("NextMarker")
    public String nextMarker;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SetId")
    public String setId;

    public static FindImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindImagesResponseBody self = new FindImagesResponseBody();
        return TeaModel.build(map, self);
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

    public FindImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FindImagesResponseBody setSetId(String setId) {
        this.setId = setId;
        return this;
    }
    public String getSetId() {
        return this.setId;
    }

    public static class FindImagesResponseBodyImagesAddress extends TeaModel {
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

        public static FindImagesResponseBodyImagesAddress build(java.util.Map<String, ?> map) throws Exception {
            FindImagesResponseBodyImagesAddress self = new FindImagesResponseBodyImagesAddress();
            return TeaModel.build(map, self);
        }

        public FindImagesResponseBodyImagesAddress setAddressLine(String addressLine) {
            this.addressLine = addressLine;
            return this;
        }
        public String getAddressLine() {
            return this.addressLine;
        }

        public FindImagesResponseBodyImagesAddress setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public FindImagesResponseBodyImagesAddress setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public FindImagesResponseBodyImagesAddress setDistrict(String district) {
            this.district = district;
            return this;
        }
        public String getDistrict() {
            return this.district;
        }

        public FindImagesResponseBodyImagesAddress setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public FindImagesResponseBodyImagesAddress setTownship(String township) {
            this.township = township;
            return this;
        }
        public String getTownship() {
            return this.township;
        }

    }

    public static class FindImagesResponseBodyImagesCroppingSuggestionCroppingBoundary extends TeaModel {
        @NameInMap("Height")
        public Integer height;

        @NameInMap("Left")
        public Integer left;

        @NameInMap("Top")
        public Integer top;

        @NameInMap("Width")
        public Integer width;

        public static FindImagesResponseBodyImagesCroppingSuggestionCroppingBoundary build(java.util.Map<String, ?> map) throws Exception {
            FindImagesResponseBodyImagesCroppingSuggestionCroppingBoundary self = new FindImagesResponseBodyImagesCroppingSuggestionCroppingBoundary();
            return TeaModel.build(map, self);
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

    }

    public static class FindImagesResponseBodyImagesCroppingSuggestion extends TeaModel {
        @NameInMap("AspectRatio")
        public String aspectRatio;

        @NameInMap("CroppingBoundary")
        public FindImagesResponseBodyImagesCroppingSuggestionCroppingBoundary croppingBoundary;

        @NameInMap("Score")
        public Float score;

        public static FindImagesResponseBodyImagesCroppingSuggestion build(java.util.Map<String, ?> map) throws Exception {
            FindImagesResponseBodyImagesCroppingSuggestion self = new FindImagesResponseBodyImagesCroppingSuggestion();
            return TeaModel.build(map, self);
        }

        public FindImagesResponseBodyImagesCroppingSuggestion setAspectRatio(String aspectRatio) {
            this.aspectRatio = aspectRatio;
            return this;
        }
        public String getAspectRatio() {
            return this.aspectRatio;
        }

        public FindImagesResponseBodyImagesCroppingSuggestion setCroppingBoundary(FindImagesResponseBodyImagesCroppingSuggestionCroppingBoundary croppingBoundary) {
            this.croppingBoundary = croppingBoundary;
            return this;
        }
        public FindImagesResponseBodyImagesCroppingSuggestionCroppingBoundary getCroppingBoundary() {
            return this.croppingBoundary;
        }

        public FindImagesResponseBodyImagesCroppingSuggestion setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class FindImagesResponseBodyImagesFacesEmotionDetails extends TeaModel {
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

        public static FindImagesResponseBodyImagesFacesEmotionDetails build(java.util.Map<String, ?> map) throws Exception {
            FindImagesResponseBodyImagesFacesEmotionDetails self = new FindImagesResponseBodyImagesFacesEmotionDetails();
            return TeaModel.build(map, self);
        }

        public FindImagesResponseBodyImagesFacesEmotionDetails setANGRY(Float ANGRY) {
            this.ANGRY = ANGRY;
            return this;
        }
        public Float getANGRY() {
            return this.ANGRY;
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

        public FindImagesResponseBodyImagesFacesEmotionDetails setHAPPY(Float HAPPY) {
            this.HAPPY = HAPPY;
            return this;
        }
        public Float getHAPPY() {
            return this.HAPPY;
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

        public FindImagesResponseBodyImagesFacesEmotionDetails setSURPRISED(Float SURPRISED) {
            this.SURPRISED = SURPRISED;
            return this;
        }
        public Float getSURPRISED() {
            return this.SURPRISED;
        }

    }

    public static class FindImagesResponseBodyImagesFacesFaceAttributesFaceBoundary extends TeaModel {
        @NameInMap("Height")
        public Integer height;

        @NameInMap("Left")
        public Integer left;

        @NameInMap("Top")
        public Integer top;

        @NameInMap("Width")
        public Integer width;

        public static FindImagesResponseBodyImagesFacesFaceAttributesFaceBoundary build(java.util.Map<String, ?> map) throws Exception {
            FindImagesResponseBodyImagesFacesFaceAttributesFaceBoundary self = new FindImagesResponseBodyImagesFacesFaceAttributesFaceBoundary();
            return TeaModel.build(map, self);
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
        @NameInMap("Beard")
        public String beard;

        @NameInMap("BeardConfidence")
        public Float beardConfidence;

        @NameInMap("FaceBoundary")
        public FindImagesResponseBodyImagesFacesFaceAttributesFaceBoundary faceBoundary;

        @NameInMap("Glasses")
        public String glasses;

        @NameInMap("GlassesConfidence")
        public Float glassesConfidence;

        @NameInMap("HeadPose")
        public FindImagesResponseBodyImagesFacesFaceAttributesHeadPose headPose;

        @NameInMap("Mask")
        public String mask;

        @NameInMap("MaskConfidence")
        public Float maskConfidence;

        public static FindImagesResponseBodyImagesFacesFaceAttributes build(java.util.Map<String, ?> map) throws Exception {
            FindImagesResponseBodyImagesFacesFaceAttributes self = new FindImagesResponseBodyImagesFacesFaceAttributes();
            return TeaModel.build(map, self);
        }

        public FindImagesResponseBodyImagesFacesFaceAttributes setBeard(String beard) {
            this.beard = beard;
            return this;
        }
        public String getBeard() {
            return this.beard;
        }

        public FindImagesResponseBodyImagesFacesFaceAttributes setBeardConfidence(Float beardConfidence) {
            this.beardConfidence = beardConfidence;
            return this;
        }
        public Float getBeardConfidence() {
            return this.beardConfidence;
        }

        public FindImagesResponseBodyImagesFacesFaceAttributes setFaceBoundary(FindImagesResponseBodyImagesFacesFaceAttributesFaceBoundary faceBoundary) {
            this.faceBoundary = faceBoundary;
            return this;
        }
        public FindImagesResponseBodyImagesFacesFaceAttributesFaceBoundary getFaceBoundary() {
            return this.faceBoundary;
        }

        public FindImagesResponseBodyImagesFacesFaceAttributes setGlasses(String glasses) {
            this.glasses = glasses;
            return this;
        }
        public String getGlasses() {
            return this.glasses;
        }

        public FindImagesResponseBodyImagesFacesFaceAttributes setGlassesConfidence(Float glassesConfidence) {
            this.glassesConfidence = glassesConfidence;
            return this;
        }
        public Float getGlassesConfidence() {
            return this.glassesConfidence;
        }

        public FindImagesResponseBodyImagesFacesFaceAttributes setHeadPose(FindImagesResponseBodyImagesFacesFaceAttributesHeadPose headPose) {
            this.headPose = headPose;
            return this;
        }
        public FindImagesResponseBodyImagesFacesFaceAttributesHeadPose getHeadPose() {
            return this.headPose;
        }

        public FindImagesResponseBodyImagesFacesFaceAttributes setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public FindImagesResponseBodyImagesFacesFaceAttributes setMaskConfidence(Float maskConfidence) {
            this.maskConfidence = maskConfidence;
            return this;
        }
        public Float getMaskConfidence() {
            return this.maskConfidence;
        }

    }

    public static class FindImagesResponseBodyImagesFaces extends TeaModel {
        @NameInMap("Age")
        public Integer age;

        @NameInMap("Attractive")
        public Float attractive;

        @NameInMap("Emotion")
        public String emotion;

        @NameInMap("EmotionConfidence")
        public Float emotionConfidence;

        @NameInMap("EmotionDetails")
        public FindImagesResponseBodyImagesFacesEmotionDetails emotionDetails;

        @NameInMap("FaceAttributes")
        public FindImagesResponseBodyImagesFacesFaceAttributes faceAttributes;

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

        public static FindImagesResponseBodyImagesFaces build(java.util.Map<String, ?> map) throws Exception {
            FindImagesResponseBodyImagesFaces self = new FindImagesResponseBodyImagesFaces();
            return TeaModel.build(map, self);
        }

        public FindImagesResponseBodyImagesFaces setAge(Integer age) {
            this.age = age;
            return this;
        }
        public Integer getAge() {
            return this.age;
        }

        public FindImagesResponseBodyImagesFaces setAttractive(Float attractive) {
            this.attractive = attractive;
            return this;
        }
        public Float getAttractive() {
            return this.attractive;
        }

        public FindImagesResponseBodyImagesFaces setEmotion(String emotion) {
            this.emotion = emotion;
            return this;
        }
        public String getEmotion() {
            return this.emotion;
        }

        public FindImagesResponseBodyImagesFaces setEmotionConfidence(Float emotionConfidence) {
            this.emotionConfidence = emotionConfidence;
            return this;
        }
        public Float getEmotionConfidence() {
            return this.emotionConfidence;
        }

        public FindImagesResponseBodyImagesFaces setEmotionDetails(FindImagesResponseBodyImagesFacesEmotionDetails emotionDetails) {
            this.emotionDetails = emotionDetails;
            return this;
        }
        public FindImagesResponseBodyImagesFacesEmotionDetails getEmotionDetails() {
            return this.emotionDetails;
        }

        public FindImagesResponseBodyImagesFaces setFaceAttributes(FindImagesResponseBodyImagesFacesFaceAttributes faceAttributes) {
            this.faceAttributes = faceAttributes;
            return this;
        }
        public FindImagesResponseBodyImagesFacesFaceAttributes getFaceAttributes() {
            return this.faceAttributes;
        }

        public FindImagesResponseBodyImagesFaces setFaceConfidence(Float faceConfidence) {
            this.faceConfidence = faceConfidence;
            return this;
        }
        public Float getFaceConfidence() {
            return this.faceConfidence;
        }

        public FindImagesResponseBodyImagesFaces setFaceId(String faceId) {
            this.faceId = faceId;
            return this;
        }
        public String getFaceId() {
            return this.faceId;
        }

        public FindImagesResponseBodyImagesFaces setFaceQuality(Float faceQuality) {
            this.faceQuality = faceQuality;
            return this;
        }
        public Float getFaceQuality() {
            return this.faceQuality;
        }

        public FindImagesResponseBodyImagesFaces setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public FindImagesResponseBodyImagesFaces setGenderConfidence(Float genderConfidence) {
            this.genderConfidence = genderConfidence;
            return this;
        }
        public Float getGenderConfidence() {
            return this.genderConfidence;
        }

        public FindImagesResponseBodyImagesFaces setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

    }

    public static class FindImagesResponseBodyImagesImageQuality extends TeaModel {
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

        public static FindImagesResponseBodyImagesImageQuality build(java.util.Map<String, ?> map) throws Exception {
            FindImagesResponseBodyImagesImageQuality self = new FindImagesResponseBodyImagesImageQuality();
            return TeaModel.build(map, self);
        }

        public FindImagesResponseBodyImagesImageQuality setClarity(Float clarity) {
            this.clarity = clarity;
            return this;
        }
        public Float getClarity() {
            return this.clarity;
        }

        public FindImagesResponseBodyImagesImageQuality setClarityScore(Float clarityScore) {
            this.clarityScore = clarityScore;
            return this;
        }
        public Float getClarityScore() {
            return this.clarityScore;
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

        public FindImagesResponseBodyImagesImageQuality setCompositionScore(Float compositionScore) {
            this.compositionScore = compositionScore;
            return this;
        }
        public Float getCompositionScore() {
            return this.compositionScore;
        }

        public FindImagesResponseBodyImagesImageQuality setContrast(Float contrast) {
            this.contrast = contrast;
            return this;
        }
        public Float getContrast() {
            return this.contrast;
        }

        public FindImagesResponseBodyImagesImageQuality setContrastScore(Float contrastScore) {
            this.contrastScore = contrastScore;
            return this;
        }
        public Float getContrastScore() {
            return this.contrastScore;
        }

        public FindImagesResponseBodyImagesImageQuality setExposure(Float exposure) {
            this.exposure = exposure;
            return this;
        }
        public Float getExposure() {
            return this.exposure;
        }

        public FindImagesResponseBodyImagesImageQuality setExposureScore(Float exposureScore) {
            this.exposureScore = exposureScore;
            return this;
        }
        public Float getExposureScore() {
            return this.exposureScore;
        }

        public FindImagesResponseBodyImagesImageQuality setOverallScore(Float overallScore) {
            this.overallScore = overallScore;
            return this;
        }
        public Float getOverallScore() {
            return this.overallScore;
        }

    }

    public static class FindImagesResponseBodyImagesOCROCRBoundary extends TeaModel {
        @NameInMap("Height")
        public Integer height;

        @NameInMap("Left")
        public Integer left;

        @NameInMap("Top")
        public Integer top;

        @NameInMap("Width")
        public Integer width;

        public static FindImagesResponseBodyImagesOCROCRBoundary build(java.util.Map<String, ?> map) throws Exception {
            FindImagesResponseBodyImagesOCROCRBoundary self = new FindImagesResponseBodyImagesOCROCRBoundary();
            return TeaModel.build(map, self);
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

    }

    public static class FindImagesResponseBodyImagesOCR extends TeaModel {
        @NameInMap("OCRBoundary")
        public FindImagesResponseBodyImagesOCROCRBoundary OCRBoundary;

        @NameInMap("OCRConfidence")
        public Float OCRConfidence;

        @NameInMap("OCRContents")
        public String OCRContents;

        public static FindImagesResponseBodyImagesOCR build(java.util.Map<String, ?> map) throws Exception {
            FindImagesResponseBodyImagesOCR self = new FindImagesResponseBodyImagesOCR();
            return TeaModel.build(map, self);
        }

        public FindImagesResponseBodyImagesOCR setOCRBoundary(FindImagesResponseBodyImagesOCROCRBoundary OCRBoundary) {
            this.OCRBoundary = OCRBoundary;
            return this;
        }
        public FindImagesResponseBodyImagesOCROCRBoundary getOCRBoundary() {
            return this.OCRBoundary;
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

    }

    public static class FindImagesResponseBodyImagesTags extends TeaModel {
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

        public static FindImagesResponseBodyImagesTags build(java.util.Map<String, ?> map) throws Exception {
            FindImagesResponseBodyImagesTags self = new FindImagesResponseBodyImagesTags();
            return TeaModel.build(map, self);
        }

        public FindImagesResponseBodyImagesTags setCentricScore(Float centricScore) {
            this.centricScore = centricScore;
            return this;
        }
        public Float getCentricScore() {
            return this.centricScore;
        }

        public FindImagesResponseBodyImagesTags setParentTagName(String parentTagName) {
            this.parentTagName = parentTagName;
            return this;
        }
        public String getParentTagName() {
            return this.parentTagName;
        }

        public FindImagesResponseBodyImagesTags setTagConfidence(Float tagConfidence) {
            this.tagConfidence = tagConfidence;
            return this;
        }
        public Float getTagConfidence() {
            return this.tagConfidence;
        }

        public FindImagesResponseBodyImagesTags setTagLevel(Integer tagLevel) {
            this.tagLevel = tagLevel;
            return this;
        }
        public Integer getTagLevel() {
            return this.tagLevel;
        }

        public FindImagesResponseBodyImagesTags setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

    public static class FindImagesResponseBodyImages extends TeaModel {
        @NameInMap("Address")
        public FindImagesResponseBodyImagesAddress address;

        @NameInMap("AddressFailReason")
        public String addressFailReason;

        @NameInMap("AddressModifyTime")
        public String addressModifyTime;

        @NameInMap("AddressStatus")
        public String addressStatus;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CroppingSuggestion")
        public java.util.List<FindImagesResponseBodyImagesCroppingSuggestion> croppingSuggestion;

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
        public java.util.List<FindImagesResponseBodyImagesFaces> faces;

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
        public FindImagesResponseBodyImagesImageQuality imageQuality;

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
        public java.util.List<FindImagesResponseBodyImagesOCR> OCR;

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

        @NameInMap("SourcePosition")
        public String sourcePosition;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("SourceUri")
        public String sourceUri;

        @NameInMap("Tags")
        public java.util.List<FindImagesResponseBodyImagesTags> tags;

        @NameInMap("TagsFailReason")
        public String tagsFailReason;

        @NameInMap("TagsModifyTime")
        public String tagsModifyTime;

        @NameInMap("TagsStatus")
        public String tagsStatus;

        public static FindImagesResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            FindImagesResponseBodyImages self = new FindImagesResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public FindImagesResponseBodyImages setAddress(FindImagesResponseBodyImagesAddress address) {
            this.address = address;
            return this;
        }
        public FindImagesResponseBodyImagesAddress getAddress() {
            return this.address;
        }

        public FindImagesResponseBodyImages setAddressFailReason(String addressFailReason) {
            this.addressFailReason = addressFailReason;
            return this;
        }
        public String getAddressFailReason() {
            return this.addressFailReason;
        }

        public FindImagesResponseBodyImages setAddressModifyTime(String addressModifyTime) {
            this.addressModifyTime = addressModifyTime;
            return this;
        }
        public String getAddressModifyTime() {
            return this.addressModifyTime;
        }

        public FindImagesResponseBodyImages setAddressStatus(String addressStatus) {
            this.addressStatus = addressStatus;
            return this;
        }
        public String getAddressStatus() {
            return this.addressStatus;
        }

        public FindImagesResponseBodyImages setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public FindImagesResponseBodyImages setCroppingSuggestion(java.util.List<FindImagesResponseBodyImagesCroppingSuggestion> croppingSuggestion) {
            this.croppingSuggestion = croppingSuggestion;
            return this;
        }
        public java.util.List<FindImagesResponseBodyImagesCroppingSuggestion> getCroppingSuggestion() {
            return this.croppingSuggestion;
        }

        public FindImagesResponseBodyImages setCroppingSuggestionFailReason(String croppingSuggestionFailReason) {
            this.croppingSuggestionFailReason = croppingSuggestionFailReason;
            return this;
        }
        public String getCroppingSuggestionFailReason() {
            return this.croppingSuggestionFailReason;
        }

        public FindImagesResponseBodyImages setCroppingSuggestionModifyTime(String croppingSuggestionModifyTime) {
            this.croppingSuggestionModifyTime = croppingSuggestionModifyTime;
            return this;
        }
        public String getCroppingSuggestionModifyTime() {
            return this.croppingSuggestionModifyTime;
        }

        public FindImagesResponseBodyImages setCroppingSuggestionStatus(String croppingSuggestionStatus) {
            this.croppingSuggestionStatus = croppingSuggestionStatus;
            return this;
        }
        public String getCroppingSuggestionStatus() {
            return this.croppingSuggestionStatus;
        }

        public FindImagesResponseBodyImages setExif(String exif) {
            this.exif = exif;
            return this;
        }
        public String getExif() {
            return this.exif;
        }

        public FindImagesResponseBodyImages setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public FindImagesResponseBodyImages setFaces(java.util.List<FindImagesResponseBodyImagesFaces> faces) {
            this.faces = faces;
            return this;
        }
        public java.util.List<FindImagesResponseBodyImagesFaces> getFaces() {
            return this.faces;
        }

        public FindImagesResponseBodyImages setFacesFailReason(String facesFailReason) {
            this.facesFailReason = facesFailReason;
            return this;
        }
        public String getFacesFailReason() {
            return this.facesFailReason;
        }

        public FindImagesResponseBodyImages setFacesModifyTime(String facesModifyTime) {
            this.facesModifyTime = facesModifyTime;
            return this;
        }
        public String getFacesModifyTime() {
            return this.facesModifyTime;
        }

        public FindImagesResponseBodyImages setFacesStatus(String facesStatus) {
            this.facesStatus = facesStatus;
            return this;
        }
        public String getFacesStatus() {
            return this.facesStatus;
        }

        public FindImagesResponseBodyImages setFileSize(Integer fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Integer getFileSize() {
            return this.fileSize;
        }

        public FindImagesResponseBodyImages setImageFormat(String imageFormat) {
            this.imageFormat = imageFormat;
            return this;
        }
        public String getImageFormat() {
            return this.imageFormat;
        }

        public FindImagesResponseBodyImages setImageHeight(Integer imageHeight) {
            this.imageHeight = imageHeight;
            return this;
        }
        public Integer getImageHeight() {
            return this.imageHeight;
        }

        public FindImagesResponseBodyImages setImageQuality(FindImagesResponseBodyImagesImageQuality imageQuality) {
            this.imageQuality = imageQuality;
            return this;
        }
        public FindImagesResponseBodyImagesImageQuality getImageQuality() {
            return this.imageQuality;
        }

        public FindImagesResponseBodyImages setImageQualityFailReason(String imageQualityFailReason) {
            this.imageQualityFailReason = imageQualityFailReason;
            return this;
        }
        public String getImageQualityFailReason() {
            return this.imageQualityFailReason;
        }

        public FindImagesResponseBodyImages setImageQualityModifyTime(String imageQualityModifyTime) {
            this.imageQualityModifyTime = imageQualityModifyTime;
            return this;
        }
        public String getImageQualityModifyTime() {
            return this.imageQualityModifyTime;
        }

        public FindImagesResponseBodyImages setImageQualityStatus(String imageQualityStatus) {
            this.imageQualityStatus = imageQualityStatus;
            return this;
        }
        public String getImageQualityStatus() {
            return this.imageQualityStatus;
        }

        public FindImagesResponseBodyImages setImageTime(String imageTime) {
            this.imageTime = imageTime;
            return this;
        }
        public String getImageTime() {
            return this.imageTime;
        }

        public FindImagesResponseBodyImages setImageUri(String imageUri) {
            this.imageUri = imageUri;
            return this;
        }
        public String getImageUri() {
            return this.imageUri;
        }

        public FindImagesResponseBodyImages setImageWidth(Integer imageWidth) {
            this.imageWidth = imageWidth;
            return this;
        }
        public Integer getImageWidth() {
            return this.imageWidth;
        }

        public FindImagesResponseBodyImages setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public FindImagesResponseBodyImages setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public FindImagesResponseBodyImages setOCR(java.util.List<FindImagesResponseBodyImagesOCR> OCR) {
            this.OCR = OCR;
            return this;
        }
        public java.util.List<FindImagesResponseBodyImagesOCR> getOCR() {
            return this.OCR;
        }

        public FindImagesResponseBodyImages setOCRFailReason(String OCRFailReason) {
            this.OCRFailReason = OCRFailReason;
            return this;
        }
        public String getOCRFailReason() {
            return this.OCRFailReason;
        }

        public FindImagesResponseBodyImages setOCRModifyTime(String OCRModifyTime) {
            this.OCRModifyTime = OCRModifyTime;
            return this;
        }
        public String getOCRModifyTime() {
            return this.OCRModifyTime;
        }

        public FindImagesResponseBodyImages setOCRStatus(String OCRStatus) {
            this.OCRStatus = OCRStatus;
            return this;
        }
        public String getOCRStatus() {
            return this.OCRStatus;
        }

        public FindImagesResponseBodyImages setOrientation(String orientation) {
            this.orientation = orientation;
            return this;
        }
        public String getOrientation() {
            return this.orientation;
        }

        public FindImagesResponseBodyImages setRemarksA(String remarksA) {
            this.remarksA = remarksA;
            return this;
        }
        public String getRemarksA() {
            return this.remarksA;
        }

        public FindImagesResponseBodyImages setRemarksArrayA(String remarksArrayA) {
            this.remarksArrayA = remarksArrayA;
            return this;
        }
        public String getRemarksArrayA() {
            return this.remarksArrayA;
        }

        public FindImagesResponseBodyImages setRemarksArrayB(String remarksArrayB) {
            this.remarksArrayB = remarksArrayB;
            return this;
        }
        public String getRemarksArrayB() {
            return this.remarksArrayB;
        }

        public FindImagesResponseBodyImages setRemarksB(String remarksB) {
            this.remarksB = remarksB;
            return this;
        }
        public String getRemarksB() {
            return this.remarksB;
        }

        public FindImagesResponseBodyImages setRemarksC(String remarksC) {
            this.remarksC = remarksC;
            return this;
        }
        public String getRemarksC() {
            return this.remarksC;
        }

        public FindImagesResponseBodyImages setRemarksD(String remarksD) {
            this.remarksD = remarksD;
            return this;
        }
        public String getRemarksD() {
            return this.remarksD;
        }

        public FindImagesResponseBodyImages setSourcePosition(String sourcePosition) {
            this.sourcePosition = sourcePosition;
            return this;
        }
        public String getSourcePosition() {
            return this.sourcePosition;
        }

        public FindImagesResponseBodyImages setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public FindImagesResponseBodyImages setSourceUri(String sourceUri) {
            this.sourceUri = sourceUri;
            return this;
        }
        public String getSourceUri() {
            return this.sourceUri;
        }

        public FindImagesResponseBodyImages setTags(java.util.List<FindImagesResponseBodyImagesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<FindImagesResponseBodyImagesTags> getTags() {
            return this.tags;
        }

        public FindImagesResponseBodyImages setTagsFailReason(String tagsFailReason) {
            this.tagsFailReason = tagsFailReason;
            return this;
        }
        public String getTagsFailReason() {
            return this.tagsFailReason;
        }

        public FindImagesResponseBodyImages setTagsModifyTime(String tagsModifyTime) {
            this.tagsModifyTime = tagsModifyTime;
            return this;
        }
        public String getTagsModifyTime() {
            return this.tagsModifyTime;
        }

        public FindImagesResponseBodyImages setTagsStatus(String tagsStatus) {
            this.tagsStatus = tagsStatus;
            return this;
        }
        public String getTagsStatus() {
            return this.tagsStatus;
        }

    }

}
