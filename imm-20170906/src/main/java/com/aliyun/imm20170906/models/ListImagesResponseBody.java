// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class ListImagesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NextMarker")
    public String nextMarker;

    @NameInMap("SetId")
    public String setId;

    @NameInMap("Images")
    public java.util.List<ListImagesResponseBodyImages> images;

    public static ListImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListImagesResponseBody self = new ListImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListImagesResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

    public ListImagesResponseBody setSetId(String setId) {
        this.setId = setId;
        return this;
    }
    public String getSetId() {
        return this.setId;
    }

    public ListImagesResponseBody setImages(java.util.List<ListImagesResponseBodyImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<ListImagesResponseBodyImages> getImages() {
        return this.images;
    }

    public static class ListImagesResponseBodyImagesCroppingSuggestionCroppingBoundary extends TeaModel {
        @NameInMap("Left")
        public Integer left;

        @NameInMap("Top")
        public Integer top;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("Height")
        public Integer height;

        public static ListImagesResponseBodyImagesCroppingSuggestionCroppingBoundary build(java.util.Map<String, ?> map) throws Exception {
            ListImagesResponseBodyImagesCroppingSuggestionCroppingBoundary self = new ListImagesResponseBodyImagesCroppingSuggestionCroppingBoundary();
            return TeaModel.build(map, self);
        }

        public ListImagesResponseBodyImagesCroppingSuggestionCroppingBoundary setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

        public ListImagesResponseBodyImagesCroppingSuggestionCroppingBoundary setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public ListImagesResponseBodyImagesCroppingSuggestionCroppingBoundary setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public ListImagesResponseBodyImagesCroppingSuggestionCroppingBoundary setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

    }

    public static class ListImagesResponseBodyImagesCroppingSuggestion extends TeaModel {
        @NameInMap("Score")
        public Float score;

        @NameInMap("AspectRatio")
        public String aspectRatio;

        @NameInMap("CroppingBoundary")
        public ListImagesResponseBodyImagesCroppingSuggestionCroppingBoundary croppingBoundary;

        public static ListImagesResponseBodyImagesCroppingSuggestion build(java.util.Map<String, ?> map) throws Exception {
            ListImagesResponseBodyImagesCroppingSuggestion self = new ListImagesResponseBodyImagesCroppingSuggestion();
            return TeaModel.build(map, self);
        }

        public ListImagesResponseBodyImagesCroppingSuggestion setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public ListImagesResponseBodyImagesCroppingSuggestion setAspectRatio(String aspectRatio) {
            this.aspectRatio = aspectRatio;
            return this;
        }
        public String getAspectRatio() {
            return this.aspectRatio;
        }

        public ListImagesResponseBodyImagesCroppingSuggestion setCroppingBoundary(ListImagesResponseBodyImagesCroppingSuggestionCroppingBoundary croppingBoundary) {
            this.croppingBoundary = croppingBoundary;
            return this;
        }
        public ListImagesResponseBodyImagesCroppingSuggestionCroppingBoundary getCroppingBoundary() {
            return this.croppingBoundary;
        }

    }

    public static class ListImagesResponseBodyImagesFacesEmotionDetails extends TeaModel {
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

        public static ListImagesResponseBodyImagesFacesEmotionDetails build(java.util.Map<String, ?> map) throws Exception {
            ListImagesResponseBodyImagesFacesEmotionDetails self = new ListImagesResponseBodyImagesFacesEmotionDetails();
            return TeaModel.build(map, self);
        }

        public ListImagesResponseBodyImagesFacesEmotionDetails setHAPPY(Float HAPPY) {
            this.HAPPY = HAPPY;
            return this;
        }
        public Float getHAPPY() {
            return this.HAPPY;
        }

        public ListImagesResponseBodyImagesFacesEmotionDetails setSURPRISED(Float SURPRISED) {
            this.SURPRISED = SURPRISED;
            return this;
        }
        public Float getSURPRISED() {
            return this.SURPRISED;
        }

        public ListImagesResponseBodyImagesFacesEmotionDetails setCALM(Float CALM) {
            this.CALM = CALM;
            return this;
        }
        public Float getCALM() {
            return this.CALM;
        }

        public ListImagesResponseBodyImagesFacesEmotionDetails setDISGUSTED(Float DISGUSTED) {
            this.DISGUSTED = DISGUSTED;
            return this;
        }
        public Float getDISGUSTED() {
            return this.DISGUSTED;
        }

        public ListImagesResponseBodyImagesFacesEmotionDetails setANGRY(Float ANGRY) {
            this.ANGRY = ANGRY;
            return this;
        }
        public Float getANGRY() {
            return this.ANGRY;
        }

        public ListImagesResponseBodyImagesFacesEmotionDetails setSAD(Float SAD) {
            this.SAD = SAD;
            return this;
        }
        public Float getSAD() {
            return this.SAD;
        }

        public ListImagesResponseBodyImagesFacesEmotionDetails setSCARED(Float SCARED) {
            this.SCARED = SCARED;
            return this;
        }
        public Float getSCARED() {
            return this.SCARED;
        }

    }

    public static class ListImagesResponseBodyImagesFacesFaceAttributesFaceBoundary extends TeaModel {
        @NameInMap("Left")
        public Integer left;

        @NameInMap("Top")
        public Integer top;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("Height")
        public Integer height;

        public static ListImagesResponseBodyImagesFacesFaceAttributesFaceBoundary build(java.util.Map<String, ?> map) throws Exception {
            ListImagesResponseBodyImagesFacesFaceAttributesFaceBoundary self = new ListImagesResponseBodyImagesFacesFaceAttributesFaceBoundary();
            return TeaModel.build(map, self);
        }

        public ListImagesResponseBodyImagesFacesFaceAttributesFaceBoundary setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

        public ListImagesResponseBodyImagesFacesFaceAttributesFaceBoundary setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public ListImagesResponseBodyImagesFacesFaceAttributesFaceBoundary setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public ListImagesResponseBodyImagesFacesFaceAttributesFaceBoundary setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

    }

    public static class ListImagesResponseBodyImagesFacesFaceAttributesHeadPose extends TeaModel {
        @NameInMap("Pitch")
        public Float pitch;

        @NameInMap("Roll")
        public Float roll;

        @NameInMap("Yaw")
        public Float yaw;

        public static ListImagesResponseBodyImagesFacesFaceAttributesHeadPose build(java.util.Map<String, ?> map) throws Exception {
            ListImagesResponseBodyImagesFacesFaceAttributesHeadPose self = new ListImagesResponseBodyImagesFacesFaceAttributesHeadPose();
            return TeaModel.build(map, self);
        }

        public ListImagesResponseBodyImagesFacesFaceAttributesHeadPose setPitch(Float pitch) {
            this.pitch = pitch;
            return this;
        }
        public Float getPitch() {
            return this.pitch;
        }

        public ListImagesResponseBodyImagesFacesFaceAttributesHeadPose setRoll(Float roll) {
            this.roll = roll;
            return this;
        }
        public Float getRoll() {
            return this.roll;
        }

        public ListImagesResponseBodyImagesFacesFaceAttributesHeadPose setYaw(Float yaw) {
            this.yaw = yaw;
            return this;
        }
        public Float getYaw() {
            return this.yaw;
        }

    }

    public static class ListImagesResponseBodyImagesFacesFaceAttributes extends TeaModel {
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
        public ListImagesResponseBodyImagesFacesFaceAttributesFaceBoundary faceBoundary;

        @NameInMap("HeadPose")
        public ListImagesResponseBodyImagesFacesFaceAttributesHeadPose headPose;

        public static ListImagesResponseBodyImagesFacesFaceAttributes build(java.util.Map<String, ?> map) throws Exception {
            ListImagesResponseBodyImagesFacesFaceAttributes self = new ListImagesResponseBodyImagesFacesFaceAttributes();
            return TeaModel.build(map, self);
        }

        public ListImagesResponseBodyImagesFacesFaceAttributes setGlassesConfidence(Float glassesConfidence) {
            this.glassesConfidence = glassesConfidence;
            return this;
        }
        public Float getGlassesConfidence() {
            return this.glassesConfidence;
        }

        public ListImagesResponseBodyImagesFacesFaceAttributes setGlasses(String glasses) {
            this.glasses = glasses;
            return this;
        }
        public String getGlasses() {
            return this.glasses;
        }

        public ListImagesResponseBodyImagesFacesFaceAttributes setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public ListImagesResponseBodyImagesFacesFaceAttributes setBeardConfidence(Float beardConfidence) {
            this.beardConfidence = beardConfidence;
            return this;
        }
        public Float getBeardConfidence() {
            return this.beardConfidence;
        }

        public ListImagesResponseBodyImagesFacesFaceAttributes setMaskConfidence(Float maskConfidence) {
            this.maskConfidence = maskConfidence;
            return this;
        }
        public Float getMaskConfidence() {
            return this.maskConfidence;
        }

        public ListImagesResponseBodyImagesFacesFaceAttributes setBeard(String beard) {
            this.beard = beard;
            return this;
        }
        public String getBeard() {
            return this.beard;
        }

        public ListImagesResponseBodyImagesFacesFaceAttributes setFaceBoundary(ListImagesResponseBodyImagesFacesFaceAttributesFaceBoundary faceBoundary) {
            this.faceBoundary = faceBoundary;
            return this;
        }
        public ListImagesResponseBodyImagesFacesFaceAttributesFaceBoundary getFaceBoundary() {
            return this.faceBoundary;
        }

        public ListImagesResponseBodyImagesFacesFaceAttributes setHeadPose(ListImagesResponseBodyImagesFacesFaceAttributesHeadPose headPose) {
            this.headPose = headPose;
            return this;
        }
        public ListImagesResponseBodyImagesFacesFaceAttributesHeadPose getHeadPose() {
            return this.headPose;
        }

    }

    public static class ListImagesResponseBodyImagesFaces extends TeaModel {
        @NameInMap("EmotionConfidence")
        public Float emotionConfidence;

        @NameInMap("Attractive")
        public Float attractive;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Gender")
        public String gender;

        @NameInMap("FaceId")
        public String faceId;

        @NameInMap("GenderConfidence")
        public Float genderConfidence;

        @NameInMap("FaceQuality")
        public Float faceQuality;

        @NameInMap("Emotion")
        public String emotion;

        @NameInMap("Age")
        public Integer age;

        @NameInMap("FaceConfidence")
        public Float faceConfidence;

        @NameInMap("EmotionDetails")
        public ListImagesResponseBodyImagesFacesEmotionDetails emotionDetails;

        @NameInMap("FaceAttributes")
        public ListImagesResponseBodyImagesFacesFaceAttributes faceAttributes;

        public static ListImagesResponseBodyImagesFaces build(java.util.Map<String, ?> map) throws Exception {
            ListImagesResponseBodyImagesFaces self = new ListImagesResponseBodyImagesFaces();
            return TeaModel.build(map, self);
        }

        public ListImagesResponseBodyImagesFaces setEmotionConfidence(Float emotionConfidence) {
            this.emotionConfidence = emotionConfidence;
            return this;
        }
        public Float getEmotionConfidence() {
            return this.emotionConfidence;
        }

        public ListImagesResponseBodyImagesFaces setAttractive(Float attractive) {
            this.attractive = attractive;
            return this;
        }
        public Float getAttractive() {
            return this.attractive;
        }

        public ListImagesResponseBodyImagesFaces setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListImagesResponseBodyImagesFaces setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public ListImagesResponseBodyImagesFaces setFaceId(String faceId) {
            this.faceId = faceId;
            return this;
        }
        public String getFaceId() {
            return this.faceId;
        }

        public ListImagesResponseBodyImagesFaces setGenderConfidence(Float genderConfidence) {
            this.genderConfidence = genderConfidence;
            return this;
        }
        public Float getGenderConfidence() {
            return this.genderConfidence;
        }

        public ListImagesResponseBodyImagesFaces setFaceQuality(Float faceQuality) {
            this.faceQuality = faceQuality;
            return this;
        }
        public Float getFaceQuality() {
            return this.faceQuality;
        }

        public ListImagesResponseBodyImagesFaces setEmotion(String emotion) {
            this.emotion = emotion;
            return this;
        }
        public String getEmotion() {
            return this.emotion;
        }

        public ListImagesResponseBodyImagesFaces setAge(Integer age) {
            this.age = age;
            return this;
        }
        public Integer getAge() {
            return this.age;
        }

        public ListImagesResponseBodyImagesFaces setFaceConfidence(Float faceConfidence) {
            this.faceConfidence = faceConfidence;
            return this;
        }
        public Float getFaceConfidence() {
            return this.faceConfidence;
        }

        public ListImagesResponseBodyImagesFaces setEmotionDetails(ListImagesResponseBodyImagesFacesEmotionDetails emotionDetails) {
            this.emotionDetails = emotionDetails;
            return this;
        }
        public ListImagesResponseBodyImagesFacesEmotionDetails getEmotionDetails() {
            return this.emotionDetails;
        }

        public ListImagesResponseBodyImagesFaces setFaceAttributes(ListImagesResponseBodyImagesFacesFaceAttributes faceAttributes) {
            this.faceAttributes = faceAttributes;
            return this;
        }
        public ListImagesResponseBodyImagesFacesFaceAttributes getFaceAttributes() {
            return this.faceAttributes;
        }

    }

    public static class ListImagesResponseBodyImagesTags extends TeaModel {
        @NameInMap("TagLevel")
        public Integer tagLevel;

        @NameInMap("ParentTagName")
        public String parentTagName;

        @NameInMap("TagConfidence")
        public Float tagConfidence;

        @NameInMap("TagName")
        public String tagName;

        public static ListImagesResponseBodyImagesTags build(java.util.Map<String, ?> map) throws Exception {
            ListImagesResponseBodyImagesTags self = new ListImagesResponseBodyImagesTags();
            return TeaModel.build(map, self);
        }

        public ListImagesResponseBodyImagesTags setTagLevel(Integer tagLevel) {
            this.tagLevel = tagLevel;
            return this;
        }
        public Integer getTagLevel() {
            return this.tagLevel;
        }

        public ListImagesResponseBodyImagesTags setParentTagName(String parentTagName) {
            this.parentTagName = parentTagName;
            return this;
        }
        public String getParentTagName() {
            return this.parentTagName;
        }

        public ListImagesResponseBodyImagesTags setTagConfidence(Float tagConfidence) {
            this.tagConfidence = tagConfidence;
            return this;
        }
        public Float getTagConfidence() {
            return this.tagConfidence;
        }

        public ListImagesResponseBodyImagesTags setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

    public static class ListImagesResponseBodyImagesOCROCRBoundary extends TeaModel {
        @NameInMap("Left")
        public Integer left;

        @NameInMap("Top")
        public Integer top;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("Height")
        public Integer height;

        public static ListImagesResponseBodyImagesOCROCRBoundary build(java.util.Map<String, ?> map) throws Exception {
            ListImagesResponseBodyImagesOCROCRBoundary self = new ListImagesResponseBodyImagesOCROCRBoundary();
            return TeaModel.build(map, self);
        }

        public ListImagesResponseBodyImagesOCROCRBoundary setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

        public ListImagesResponseBodyImagesOCROCRBoundary setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public ListImagesResponseBodyImagesOCROCRBoundary setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public ListImagesResponseBodyImagesOCROCRBoundary setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

    }

    public static class ListImagesResponseBodyImagesOCR extends TeaModel {
        @NameInMap("OCRConfidence")
        public Float OCRConfidence;

        @NameInMap("OCRContents")
        public String OCRContents;

        @NameInMap("OCRBoundary")
        public ListImagesResponseBodyImagesOCROCRBoundary OCRBoundary;

        public static ListImagesResponseBodyImagesOCR build(java.util.Map<String, ?> map) throws Exception {
            ListImagesResponseBodyImagesOCR self = new ListImagesResponseBodyImagesOCR();
            return TeaModel.build(map, self);
        }

        public ListImagesResponseBodyImagesOCR setOCRConfidence(Float OCRConfidence) {
            this.OCRConfidence = OCRConfidence;
            return this;
        }
        public Float getOCRConfidence() {
            return this.OCRConfidence;
        }

        public ListImagesResponseBodyImagesOCR setOCRContents(String OCRContents) {
            this.OCRContents = OCRContents;
            return this;
        }
        public String getOCRContents() {
            return this.OCRContents;
        }

        public ListImagesResponseBodyImagesOCR setOCRBoundary(ListImagesResponseBodyImagesOCROCRBoundary OCRBoundary) {
            this.OCRBoundary = OCRBoundary;
            return this;
        }
        public ListImagesResponseBodyImagesOCROCRBoundary getOCRBoundary() {
            return this.OCRBoundary;
        }

    }

    public static class ListImagesResponseBodyImagesImageQuality extends TeaModel {
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

        public static ListImagesResponseBodyImagesImageQuality build(java.util.Map<String, ?> map) throws Exception {
            ListImagesResponseBodyImagesImageQuality self = new ListImagesResponseBodyImagesImageQuality();
            return TeaModel.build(map, self);
        }

        public ListImagesResponseBodyImagesImageQuality setOverallScore(Float overallScore) {
            this.overallScore = overallScore;
            return this;
        }
        public Float getOverallScore() {
            return this.overallScore;
        }

        public ListImagesResponseBodyImagesImageQuality setColor(Float color) {
            this.color = color;
            return this;
        }
        public Float getColor() {
            return this.color;
        }

        public ListImagesResponseBodyImagesImageQuality setColorScore(Float colorScore) {
            this.colorScore = colorScore;
            return this;
        }
        public Float getColorScore() {
            return this.colorScore;
        }

        public ListImagesResponseBodyImagesImageQuality setContrastScore(Float contrastScore) {
            this.contrastScore = contrastScore;
            return this;
        }
        public Float getContrastScore() {
            return this.contrastScore;
        }

        public ListImagesResponseBodyImagesImageQuality setContrast(Float contrast) {
            this.contrast = contrast;
            return this;
        }
        public Float getContrast() {
            return this.contrast;
        }

        public ListImagesResponseBodyImagesImageQuality setExposureScore(Float exposureScore) {
            this.exposureScore = exposureScore;
            return this;
        }
        public Float getExposureScore() {
            return this.exposureScore;
        }

        public ListImagesResponseBodyImagesImageQuality setClarityScore(Float clarityScore) {
            this.clarityScore = clarityScore;
            return this;
        }
        public Float getClarityScore() {
            return this.clarityScore;
        }

        public ListImagesResponseBodyImagesImageQuality setClarity(Float clarity) {
            this.clarity = clarity;
            return this;
        }
        public Float getClarity() {
            return this.clarity;
        }

        public ListImagesResponseBodyImagesImageQuality setExposure(Float exposure) {
            this.exposure = exposure;
            return this;
        }
        public Float getExposure() {
            return this.exposure;
        }

        public ListImagesResponseBodyImagesImageQuality setCompositionScore(Float compositionScore) {
            this.compositionScore = compositionScore;
            return this;
        }
        public Float getCompositionScore() {
            return this.compositionScore;
        }

    }

    public static class ListImagesResponseBodyImagesAddress extends TeaModel {
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

        public static ListImagesResponseBodyImagesAddress build(java.util.Map<String, ?> map) throws Exception {
            ListImagesResponseBodyImagesAddress self = new ListImagesResponseBodyImagesAddress();
            return TeaModel.build(map, self);
        }

        public ListImagesResponseBodyImagesAddress setTownship(String township) {
            this.township = township;
            return this;
        }
        public String getTownship() {
            return this.township;
        }

        public ListImagesResponseBodyImagesAddress setDistrict(String district) {
            this.district = district;
            return this;
        }
        public String getDistrict() {
            return this.district;
        }

        public ListImagesResponseBodyImagesAddress setAddressLine(String addressLine) {
            this.addressLine = addressLine;
            return this;
        }
        public String getAddressLine() {
            return this.addressLine;
        }

        public ListImagesResponseBodyImagesAddress setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public ListImagesResponseBodyImagesAddress setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public ListImagesResponseBodyImagesAddress setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

    public static class ListImagesResponseBodyImages extends TeaModel {
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

        @NameInMap("FacesModifyTime")
        public String facesModifyTime;

        @NameInMap("ImageTime")
        public String imageTime;

        @NameInMap("OCRModifyTime")
        public String OCRModifyTime;

        @NameInMap("AddressModifyTime")
        public String addressModifyTime;

        @NameInMap("ImageQualityFailReason")
        public String imageQualityFailReason;

        @NameInMap("FacesStatus")
        public String facesStatus;

        @NameInMap("RemarksArrayA")
        public String remarksArrayA;

        @NameInMap("ImageHeight")
        public Integer imageHeight;

        @NameInMap("ExternalId")
        public String externalId;

        @NameInMap("SourceUri")
        public String sourceUri;

        @NameInMap("FileSize")
        public Integer fileSize;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("SourcePosition")
        public String sourcePosition;

        @NameInMap("ImageQualityStatus")
        public String imageQualityStatus;

        @NameInMap("OCRFailReason")
        public String OCRFailReason;

        @NameInMap("AddressFailReason")
        public String addressFailReason;

        @NameInMap("CroppingSuggestionModifyTime")
        public String croppingSuggestionModifyTime;

        @NameInMap("ImageFormat")
        public String imageFormat;

        @NameInMap("ImageWidth")
        public Integer imageWidth;

        @NameInMap("RemarksArrayB")
        public String remarksArrayB;

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

        @NameInMap("CroppingSuggestion")
        public java.util.List<ListImagesResponseBodyImagesCroppingSuggestion> croppingSuggestion;

        @NameInMap("Faces")
        public java.util.List<ListImagesResponseBodyImagesFaces> faces;

        @NameInMap("Tags")
        public java.util.List<ListImagesResponseBodyImagesTags> tags;

        @NameInMap("OCR")
        public java.util.List<ListImagesResponseBodyImagesOCR> OCR;

        @NameInMap("ImageQuality")
        public ListImagesResponseBodyImagesImageQuality imageQuality;

        @NameInMap("Address")
        public ListImagesResponseBodyImagesAddress address;

        public static ListImagesResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            ListImagesResponseBodyImages self = new ListImagesResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public ListImagesResponseBodyImages setCroppingSuggestionStatus(String croppingSuggestionStatus) {
            this.croppingSuggestionStatus = croppingSuggestionStatus;
            return this;
        }
        public String getCroppingSuggestionStatus() {
            return this.croppingSuggestionStatus;
        }

        public ListImagesResponseBodyImages setImageQualityModifyTime(String imageQualityModifyTime) {
            this.imageQualityModifyTime = imageQualityModifyTime;
            return this;
        }
        public String getImageQualityModifyTime() {
            return this.imageQualityModifyTime;
        }

        public ListImagesResponseBodyImages setTagsFailReason(String tagsFailReason) {
            this.tagsFailReason = tagsFailReason;
            return this;
        }
        public String getTagsFailReason() {
            return this.tagsFailReason;
        }

        public ListImagesResponseBodyImages setRemarksC(String remarksC) {
            this.remarksC = remarksC;
            return this;
        }
        public String getRemarksC() {
            return this.remarksC;
        }

        public ListImagesResponseBodyImages setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListImagesResponseBodyImages setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListImagesResponseBodyImages setFacesFailReason(String facesFailReason) {
            this.facesFailReason = facesFailReason;
            return this;
        }
        public String getFacesFailReason() {
            return this.facesFailReason;
        }

        public ListImagesResponseBodyImages setFacesModifyTime(String facesModifyTime) {
            this.facesModifyTime = facesModifyTime;
            return this;
        }
        public String getFacesModifyTime() {
            return this.facesModifyTime;
        }

        public ListImagesResponseBodyImages setImageTime(String imageTime) {
            this.imageTime = imageTime;
            return this;
        }
        public String getImageTime() {
            return this.imageTime;
        }

        public ListImagesResponseBodyImages setOCRModifyTime(String OCRModifyTime) {
            this.OCRModifyTime = OCRModifyTime;
            return this;
        }
        public String getOCRModifyTime() {
            return this.OCRModifyTime;
        }

        public ListImagesResponseBodyImages setAddressModifyTime(String addressModifyTime) {
            this.addressModifyTime = addressModifyTime;
            return this;
        }
        public String getAddressModifyTime() {
            return this.addressModifyTime;
        }

        public ListImagesResponseBodyImages setImageQualityFailReason(String imageQualityFailReason) {
            this.imageQualityFailReason = imageQualityFailReason;
            return this;
        }
        public String getImageQualityFailReason() {
            return this.imageQualityFailReason;
        }

        public ListImagesResponseBodyImages setFacesStatus(String facesStatus) {
            this.facesStatus = facesStatus;
            return this;
        }
        public String getFacesStatus() {
            return this.facesStatus;
        }

        public ListImagesResponseBodyImages setRemarksArrayA(String remarksArrayA) {
            this.remarksArrayA = remarksArrayA;
            return this;
        }
        public String getRemarksArrayA() {
            return this.remarksArrayA;
        }

        public ListImagesResponseBodyImages setImageHeight(Integer imageHeight) {
            this.imageHeight = imageHeight;
            return this;
        }
        public Integer getImageHeight() {
            return this.imageHeight;
        }

        public ListImagesResponseBodyImages setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public ListImagesResponseBodyImages setSourceUri(String sourceUri) {
            this.sourceUri = sourceUri;
            return this;
        }
        public String getSourceUri() {
            return this.sourceUri;
        }

        public ListImagesResponseBodyImages setFileSize(Integer fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Integer getFileSize() {
            return this.fileSize;
        }

        public ListImagesResponseBodyImages setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListImagesResponseBodyImages setSourcePosition(String sourcePosition) {
            this.sourcePosition = sourcePosition;
            return this;
        }
        public String getSourcePosition() {
            return this.sourcePosition;
        }

        public ListImagesResponseBodyImages setImageQualityStatus(String imageQualityStatus) {
            this.imageQualityStatus = imageQualityStatus;
            return this;
        }
        public String getImageQualityStatus() {
            return this.imageQualityStatus;
        }

        public ListImagesResponseBodyImages setOCRFailReason(String OCRFailReason) {
            this.OCRFailReason = OCRFailReason;
            return this;
        }
        public String getOCRFailReason() {
            return this.OCRFailReason;
        }

        public ListImagesResponseBodyImages setAddressFailReason(String addressFailReason) {
            this.addressFailReason = addressFailReason;
            return this;
        }
        public String getAddressFailReason() {
            return this.addressFailReason;
        }

        public ListImagesResponseBodyImages setCroppingSuggestionModifyTime(String croppingSuggestionModifyTime) {
            this.croppingSuggestionModifyTime = croppingSuggestionModifyTime;
            return this;
        }
        public String getCroppingSuggestionModifyTime() {
            return this.croppingSuggestionModifyTime;
        }

        public ListImagesResponseBodyImages setImageFormat(String imageFormat) {
            this.imageFormat = imageFormat;
            return this;
        }
        public String getImageFormat() {
            return this.imageFormat;
        }

        public ListImagesResponseBodyImages setImageWidth(Integer imageWidth) {
            this.imageWidth = imageWidth;
            return this;
        }
        public Integer getImageWidth() {
            return this.imageWidth;
        }

        public ListImagesResponseBodyImages setRemarksArrayB(String remarksArrayB) {
            this.remarksArrayB = remarksArrayB;
            return this;
        }
        public String getRemarksArrayB() {
            return this.remarksArrayB;
        }

        public ListImagesResponseBodyImages setOrientation(String orientation) {
            this.orientation = orientation;
            return this;
        }
        public String getOrientation() {
            return this.orientation;
        }

        public ListImagesResponseBodyImages setRemarksD(String remarksD) {
            this.remarksD = remarksD;
            return this;
        }
        public String getRemarksD() {
            return this.remarksD;
        }

        public ListImagesResponseBodyImages setTagsStatus(String tagsStatus) {
            this.tagsStatus = tagsStatus;
            return this;
        }
        public String getTagsStatus() {
            return this.tagsStatus;
        }

        public ListImagesResponseBodyImages setCroppingSuggestionFailReason(String croppingSuggestionFailReason) {
            this.croppingSuggestionFailReason = croppingSuggestionFailReason;
            return this;
        }
        public String getCroppingSuggestionFailReason() {
            return this.croppingSuggestionFailReason;
        }

        public ListImagesResponseBodyImages setRemarksA(String remarksA) {
            this.remarksA = remarksA;
            return this;
        }
        public String getRemarksA() {
            return this.remarksA;
        }

        public ListImagesResponseBodyImages setImageUri(String imageUri) {
            this.imageUri = imageUri;
            return this;
        }
        public String getImageUri() {
            return this.imageUri;
        }

        public ListImagesResponseBodyImages setTagsModifyTime(String tagsModifyTime) {
            this.tagsModifyTime = tagsModifyTime;
            return this;
        }
        public String getTagsModifyTime() {
            return this.tagsModifyTime;
        }

        public ListImagesResponseBodyImages setOCRStatus(String OCRStatus) {
            this.OCRStatus = OCRStatus;
            return this;
        }
        public String getOCRStatus() {
            return this.OCRStatus;
        }

        public ListImagesResponseBodyImages setAddressStatus(String addressStatus) {
            this.addressStatus = addressStatus;
            return this;
        }
        public String getAddressStatus() {
            return this.addressStatus;
        }

        public ListImagesResponseBodyImages setExif(String exif) {
            this.exif = exif;
            return this;
        }
        public String getExif() {
            return this.exif;
        }

        public ListImagesResponseBodyImages setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListImagesResponseBodyImages setRemarksB(String remarksB) {
            this.remarksB = remarksB;
            return this;
        }
        public String getRemarksB() {
            return this.remarksB;
        }

        public ListImagesResponseBodyImages setCroppingSuggestion(java.util.List<ListImagesResponseBodyImagesCroppingSuggestion> croppingSuggestion) {
            this.croppingSuggestion = croppingSuggestion;
            return this;
        }
        public java.util.List<ListImagesResponseBodyImagesCroppingSuggestion> getCroppingSuggestion() {
            return this.croppingSuggestion;
        }

        public ListImagesResponseBodyImages setFaces(java.util.List<ListImagesResponseBodyImagesFaces> faces) {
            this.faces = faces;
            return this;
        }
        public java.util.List<ListImagesResponseBodyImagesFaces> getFaces() {
            return this.faces;
        }

        public ListImagesResponseBodyImages setTags(java.util.List<ListImagesResponseBodyImagesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListImagesResponseBodyImagesTags> getTags() {
            return this.tags;
        }

        public ListImagesResponseBodyImages setOCR(java.util.List<ListImagesResponseBodyImagesOCR> OCR) {
            this.OCR = OCR;
            return this;
        }
        public java.util.List<ListImagesResponseBodyImagesOCR> getOCR() {
            return this.OCR;
        }

        public ListImagesResponseBodyImages setImageQuality(ListImagesResponseBodyImagesImageQuality imageQuality) {
            this.imageQuality = imageQuality;
            return this;
        }
        public ListImagesResponseBodyImagesImageQuality getImageQuality() {
            return this.imageQuality;
        }

        public ListImagesResponseBodyImages setAddress(ListImagesResponseBodyImagesAddress address) {
            this.address = address;
            return this;
        }
        public ListImagesResponseBodyImagesAddress getAddress() {
            return this.address;
        }

    }

}
