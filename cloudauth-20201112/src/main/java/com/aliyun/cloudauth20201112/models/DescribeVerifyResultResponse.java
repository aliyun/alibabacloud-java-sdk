// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20201112.models;

import com.aliyun.tea.*;

public class DescribeVerifyResultResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("ResultObject")
    @Validation(required = true)
    public DescribeVerifyResultResponseResultObject resultObject;

    public static DescribeVerifyResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyResultResponse self = new DescribeVerifyResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyResultResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVerifyResultResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeVerifyResultResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeVerifyResultResponse setResultObject(DescribeVerifyResultResponseResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeVerifyResultResponseResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeVerifyResultResponseResultObjectMaterialIdCardInfo extends TeaModel {
        @NameInMap("Number")
        @Validation(required = true)
        public String number;

        @NameInMap("Address")
        @Validation(required = true)
        public String address;

        @NameInMap("Nationality")
        @Validation(required = true)
        public String nationality;

        @NameInMap("EndDate")
        @Validation(required = true)
        public String endDate;

        @NameInMap("FrontImageUrl")
        @Validation(required = true)
        public String frontImageUrl;

        @NameInMap("Authority")
        @Validation(required = true)
        public String authority;

        @NameInMap("Sex")
        @Validation(required = true)
        public String sex;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Birth")
        @Validation(required = true)
        public String birth;

        @NameInMap("BackImageUrl")
        @Validation(required = true)
        public String backImageUrl;

        @NameInMap("StartDate")
        @Validation(required = true)
        public String startDate;

        public static DescribeVerifyResultResponseResultObjectMaterialIdCardInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyResultResponseResultObjectMaterialIdCardInfo self = new DescribeVerifyResultResponseResultObjectMaterialIdCardInfo();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyResultResponseResultObjectMaterialIdCardInfo setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public DescribeVerifyResultResponseResultObjectMaterialIdCardInfo setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeVerifyResultResponseResultObjectMaterialIdCardInfo setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }
        public String getNationality() {
            return this.nationality;
        }

        public DescribeVerifyResultResponseResultObjectMaterialIdCardInfo setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public DescribeVerifyResultResponseResultObjectMaterialIdCardInfo setFrontImageUrl(String frontImageUrl) {
            this.frontImageUrl = frontImageUrl;
            return this;
        }
        public String getFrontImageUrl() {
            return this.frontImageUrl;
        }

        public DescribeVerifyResultResponseResultObjectMaterialIdCardInfo setAuthority(String authority) {
            this.authority = authority;
            return this;
        }
        public String getAuthority() {
            return this.authority;
        }

        public DescribeVerifyResultResponseResultObjectMaterialIdCardInfo setSex(String sex) {
            this.sex = sex;
            return this;
        }
        public String getSex() {
            return this.sex;
        }

        public DescribeVerifyResultResponseResultObjectMaterialIdCardInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeVerifyResultResponseResultObjectMaterialIdCardInfo setBirth(String birth) {
            this.birth = birth;
            return this;
        }
        public String getBirth() {
            return this.birth;
        }

        public DescribeVerifyResultResponseResultObjectMaterialIdCardInfo setBackImageUrl(String backImageUrl) {
            this.backImageUrl = backImageUrl;
            return this;
        }
        public String getBackImageUrl() {
            return this.backImageUrl;
        }

        public DescribeVerifyResultResponseResultObjectMaterialIdCardInfo setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

    }

    public static class DescribeVerifyResultResponseResultObjectMaterial extends TeaModel {
        @NameInMap("FaceImageUrl")
        @Validation(required = true)
        public String faceImageUrl;

        @NameInMap("IdCardName")
        @Validation(required = true)
        public String idCardName;

        @NameInMap("IdCardNumber")
        @Validation(required = true)
        public String idCardNumber;

        @NameInMap("FaceQuality")
        @Validation(required = true)
        public String faceQuality;

        @NameInMap("FaceGlobalUrl")
        @Validation(required = true)
        public String faceGlobalUrl;

        @NameInMap("FaceMask")
        @Validation(required = true)
        public Boolean faceMask;

        @NameInMap("IdCardInfo")
        @Validation(required = true)
        public DescribeVerifyResultResponseResultObjectMaterialIdCardInfo idCardInfo;

        @NameInMap("VideoUrls")
        @Validation(required = true)
        public java.util.List<String> videoUrls;

        public static DescribeVerifyResultResponseResultObjectMaterial build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyResultResponseResultObjectMaterial self = new DescribeVerifyResultResponseResultObjectMaterial();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyResultResponseResultObjectMaterial setFaceImageUrl(String faceImageUrl) {
            this.faceImageUrl = faceImageUrl;
            return this;
        }
        public String getFaceImageUrl() {
            return this.faceImageUrl;
        }

        public DescribeVerifyResultResponseResultObjectMaterial setIdCardName(String idCardName) {
            this.idCardName = idCardName;
            return this;
        }
        public String getIdCardName() {
            return this.idCardName;
        }

        public DescribeVerifyResultResponseResultObjectMaterial setIdCardNumber(String idCardNumber) {
            this.idCardNumber = idCardNumber;
            return this;
        }
        public String getIdCardNumber() {
            return this.idCardNumber;
        }

        public DescribeVerifyResultResponseResultObjectMaterial setFaceQuality(String faceQuality) {
            this.faceQuality = faceQuality;
            return this;
        }
        public String getFaceQuality() {
            return this.faceQuality;
        }

        public DescribeVerifyResultResponseResultObjectMaterial setFaceGlobalUrl(String faceGlobalUrl) {
            this.faceGlobalUrl = faceGlobalUrl;
            return this;
        }
        public String getFaceGlobalUrl() {
            return this.faceGlobalUrl;
        }

        public DescribeVerifyResultResponseResultObjectMaterial setFaceMask(Boolean faceMask) {
            this.faceMask = faceMask;
            return this;
        }
        public Boolean getFaceMask() {
            return this.faceMask;
        }

        public DescribeVerifyResultResponseResultObjectMaterial setIdCardInfo(DescribeVerifyResultResponseResultObjectMaterialIdCardInfo idCardInfo) {
            this.idCardInfo = idCardInfo;
            return this;
        }
        public DescribeVerifyResultResponseResultObjectMaterialIdCardInfo getIdCardInfo() {
            return this.idCardInfo;
        }

        public DescribeVerifyResultResponseResultObjectMaterial setVideoUrls(java.util.List<String> videoUrls) {
            this.videoUrls = videoUrls;
            return this;
        }
        public java.util.List<String> getVideoUrls() {
            return this.videoUrls;
        }

    }

    public static class DescribeVerifyResultResponseResultObject extends TeaModel {
        @NameInMap("VerifyStatus")
        @Validation(required = true)
        public Integer verifyStatus;

        @NameInMap("AuthorityComparisionScore")
        @Validation(required = true)
        public Float authorityComparisionScore;

        @NameInMap("FaceComparisonScore")
        @Validation(required = true)
        public Float faceComparisonScore;

        @NameInMap("IdCardFaceComparisonScore")
        @Validation(required = true)
        public Float idCardFaceComparisonScore;

        @NameInMap("Material")
        @Validation(required = true)
        public DescribeVerifyResultResponseResultObjectMaterial material;

        public static DescribeVerifyResultResponseResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyResultResponseResultObject self = new DescribeVerifyResultResponseResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyResultResponseResultObject setVerifyStatus(Integer verifyStatus) {
            this.verifyStatus = verifyStatus;
            return this;
        }
        public Integer getVerifyStatus() {
            return this.verifyStatus;
        }

        public DescribeVerifyResultResponseResultObject setAuthorityComparisionScore(Float authorityComparisionScore) {
            this.authorityComparisionScore = authorityComparisionScore;
            return this;
        }
        public Float getAuthorityComparisionScore() {
            return this.authorityComparisionScore;
        }

        public DescribeVerifyResultResponseResultObject setFaceComparisonScore(Float faceComparisonScore) {
            this.faceComparisonScore = faceComparisonScore;
            return this;
        }
        public Float getFaceComparisonScore() {
            return this.faceComparisonScore;
        }

        public DescribeVerifyResultResponseResultObject setIdCardFaceComparisonScore(Float idCardFaceComparisonScore) {
            this.idCardFaceComparisonScore = idCardFaceComparisonScore;
            return this;
        }
        public Float getIdCardFaceComparisonScore() {
            return this.idCardFaceComparisonScore;
        }

        public DescribeVerifyResultResponseResultObject setMaterial(DescribeVerifyResultResponseResultObjectMaterial material) {
            this.material = material;
            return this;
        }
        public DescribeVerifyResultResponseResultObjectMaterial getMaterial() {
            return this.material;
        }

    }

}
