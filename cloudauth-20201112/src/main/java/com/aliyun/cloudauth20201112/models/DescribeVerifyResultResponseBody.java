// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20201112.models;

import com.aliyun.tea.*;

public class DescribeVerifyResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObject")
    public DescribeVerifyResultResponseBodyResultObject resultObject;

    public static DescribeVerifyResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyResultResponseBody self = new DescribeVerifyResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeVerifyResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeVerifyResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVerifyResultResponseBody setResultObject(DescribeVerifyResultResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeVerifyResultResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeVerifyResultResponseBodyResultObjectMaterialIdCardInfo extends TeaModel {
        @NameInMap("Sex")
        public String sex;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("Authority")
        public String authority;

        @NameInMap("Address")
        public String address;

        @NameInMap("Number")
        public String number;

        @NameInMap("StartDate")
        public String startDate;

        @NameInMap("BackImageUrl")
        public String backImageUrl;

        @NameInMap("Nationality")
        public String nationality;

        @NameInMap("Birth")
        public String birth;

        @NameInMap("Name")
        public String name;

        @NameInMap("FrontImageUrl")
        public String frontImageUrl;

        public static DescribeVerifyResultResponseBodyResultObjectMaterialIdCardInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyResultResponseBodyResultObjectMaterialIdCardInfo self = new DescribeVerifyResultResponseBodyResultObjectMaterialIdCardInfo();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyResultResponseBodyResultObjectMaterialIdCardInfo setSex(String sex) {
            this.sex = sex;
            return this;
        }
        public String getSex() {
            return this.sex;
        }

        public DescribeVerifyResultResponseBodyResultObjectMaterialIdCardInfo setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public DescribeVerifyResultResponseBodyResultObjectMaterialIdCardInfo setAuthority(String authority) {
            this.authority = authority;
            return this;
        }
        public String getAuthority() {
            return this.authority;
        }

        public DescribeVerifyResultResponseBodyResultObjectMaterialIdCardInfo setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeVerifyResultResponseBodyResultObjectMaterialIdCardInfo setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public DescribeVerifyResultResponseBodyResultObjectMaterialIdCardInfo setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public DescribeVerifyResultResponseBodyResultObjectMaterialIdCardInfo setBackImageUrl(String backImageUrl) {
            this.backImageUrl = backImageUrl;
            return this;
        }
        public String getBackImageUrl() {
            return this.backImageUrl;
        }

        public DescribeVerifyResultResponseBodyResultObjectMaterialIdCardInfo setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }
        public String getNationality() {
            return this.nationality;
        }

        public DescribeVerifyResultResponseBodyResultObjectMaterialIdCardInfo setBirth(String birth) {
            this.birth = birth;
            return this;
        }
        public String getBirth() {
            return this.birth;
        }

        public DescribeVerifyResultResponseBodyResultObjectMaterialIdCardInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeVerifyResultResponseBodyResultObjectMaterialIdCardInfo setFrontImageUrl(String frontImageUrl) {
            this.frontImageUrl = frontImageUrl;
            return this;
        }
        public String getFrontImageUrl() {
            return this.frontImageUrl;
        }

    }

    public static class DescribeVerifyResultResponseBodyResultObjectMaterial extends TeaModel {
        @NameInMap("IdCardNumber")
        public String idCardNumber;

        @NameInMap("FaceGlobalUrl")
        public String faceGlobalUrl;

        @NameInMap("FaceImageUrl")
        public String faceImageUrl;

        @NameInMap("FaceMask")
        public Boolean faceMask;

        @NameInMap("IdCardName")
        public String idCardName;

        @NameInMap("FaceQuality")
        public String faceQuality;

        @NameInMap("VideoUrls")
        public java.util.List<String> videoUrls;

        @NameInMap("IdCardInfo")
        public DescribeVerifyResultResponseBodyResultObjectMaterialIdCardInfo idCardInfo;

        public static DescribeVerifyResultResponseBodyResultObjectMaterial build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyResultResponseBodyResultObjectMaterial self = new DescribeVerifyResultResponseBodyResultObjectMaterial();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyResultResponseBodyResultObjectMaterial setIdCardNumber(String idCardNumber) {
            this.idCardNumber = idCardNumber;
            return this;
        }
        public String getIdCardNumber() {
            return this.idCardNumber;
        }

        public DescribeVerifyResultResponseBodyResultObjectMaterial setFaceGlobalUrl(String faceGlobalUrl) {
            this.faceGlobalUrl = faceGlobalUrl;
            return this;
        }
        public String getFaceGlobalUrl() {
            return this.faceGlobalUrl;
        }

        public DescribeVerifyResultResponseBodyResultObjectMaterial setFaceImageUrl(String faceImageUrl) {
            this.faceImageUrl = faceImageUrl;
            return this;
        }
        public String getFaceImageUrl() {
            return this.faceImageUrl;
        }

        public DescribeVerifyResultResponseBodyResultObjectMaterial setFaceMask(Boolean faceMask) {
            this.faceMask = faceMask;
            return this;
        }
        public Boolean getFaceMask() {
            return this.faceMask;
        }

        public DescribeVerifyResultResponseBodyResultObjectMaterial setIdCardName(String idCardName) {
            this.idCardName = idCardName;
            return this;
        }
        public String getIdCardName() {
            return this.idCardName;
        }

        public DescribeVerifyResultResponseBodyResultObjectMaterial setFaceQuality(String faceQuality) {
            this.faceQuality = faceQuality;
            return this;
        }
        public String getFaceQuality() {
            return this.faceQuality;
        }

        public DescribeVerifyResultResponseBodyResultObjectMaterial setVideoUrls(java.util.List<String> videoUrls) {
            this.videoUrls = videoUrls;
            return this;
        }
        public java.util.List<String> getVideoUrls() {
            return this.videoUrls;
        }

        public DescribeVerifyResultResponseBodyResultObjectMaterial setIdCardInfo(DescribeVerifyResultResponseBodyResultObjectMaterialIdCardInfo idCardInfo) {
            this.idCardInfo = idCardInfo;
            return this;
        }
        public DescribeVerifyResultResponseBodyResultObjectMaterialIdCardInfo getIdCardInfo() {
            return this.idCardInfo;
        }

    }

    public static class DescribeVerifyResultResponseBodyResultObject extends TeaModel {
        @NameInMap("AuthorityComparisionScore")
        public Float authorityComparisionScore;

        @NameInMap("VerifyStatus")
        public Integer verifyStatus;

        @NameInMap("FaceComparisonScore")
        public Float faceComparisonScore;

        @NameInMap("IdCardFaceComparisonScore")
        public Float idCardFaceComparisonScore;

        @NameInMap("Material")
        public DescribeVerifyResultResponseBodyResultObjectMaterial material;

        public static DescribeVerifyResultResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyResultResponseBodyResultObject self = new DescribeVerifyResultResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyResultResponseBodyResultObject setAuthorityComparisionScore(Float authorityComparisionScore) {
            this.authorityComparisionScore = authorityComparisionScore;
            return this;
        }
        public Float getAuthorityComparisionScore() {
            return this.authorityComparisionScore;
        }

        public DescribeVerifyResultResponseBodyResultObject setVerifyStatus(Integer verifyStatus) {
            this.verifyStatus = verifyStatus;
            return this;
        }
        public Integer getVerifyStatus() {
            return this.verifyStatus;
        }

        public DescribeVerifyResultResponseBodyResultObject setFaceComparisonScore(Float faceComparisonScore) {
            this.faceComparisonScore = faceComparisonScore;
            return this;
        }
        public Float getFaceComparisonScore() {
            return this.faceComparisonScore;
        }

        public DescribeVerifyResultResponseBodyResultObject setIdCardFaceComparisonScore(Float idCardFaceComparisonScore) {
            this.idCardFaceComparisonScore = idCardFaceComparisonScore;
            return this;
        }
        public Float getIdCardFaceComparisonScore() {
            return this.idCardFaceComparisonScore;
        }

        public DescribeVerifyResultResponseBodyResultObject setMaterial(DescribeVerifyResultResponseBodyResultObjectMaterial material) {
            this.material = material;
            return this;
        }
        public DescribeVerifyResultResponseBodyResultObjectMaterial getMaterial() {
            return this.material;
        }

    }

}
