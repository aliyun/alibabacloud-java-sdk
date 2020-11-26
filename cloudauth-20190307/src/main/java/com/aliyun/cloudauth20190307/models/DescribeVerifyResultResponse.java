// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyResultResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

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
    public DescribeVerifyResultResponseMaterial material;

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

    public DescribeVerifyResultResponse setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
        return this;
    }
    public Integer getVerifyStatus() {
        return this.verifyStatus;
    }

    public DescribeVerifyResultResponse setAuthorityComparisionScore(Float authorityComparisionScore) {
        this.authorityComparisionScore = authorityComparisionScore;
        return this;
    }
    public Float getAuthorityComparisionScore() {
        return this.authorityComparisionScore;
    }

    public DescribeVerifyResultResponse setFaceComparisonScore(Float faceComparisonScore) {
        this.faceComparisonScore = faceComparisonScore;
        return this;
    }
    public Float getFaceComparisonScore() {
        return this.faceComparisonScore;
    }

    public DescribeVerifyResultResponse setIdCardFaceComparisonScore(Float idCardFaceComparisonScore) {
        this.idCardFaceComparisonScore = idCardFaceComparisonScore;
        return this;
    }
    public Float getIdCardFaceComparisonScore() {
        return this.idCardFaceComparisonScore;
    }

    public DescribeVerifyResultResponse setMaterial(DescribeVerifyResultResponseMaterial material) {
        this.material = material;
        return this;
    }
    public DescribeVerifyResultResponseMaterial getMaterial() {
        return this.material;
    }

    public static class DescribeVerifyResultResponseMaterialIdCardInfo extends TeaModel {
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

        public static DescribeVerifyResultResponseMaterialIdCardInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyResultResponseMaterialIdCardInfo self = new DescribeVerifyResultResponseMaterialIdCardInfo();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyResultResponseMaterialIdCardInfo setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public DescribeVerifyResultResponseMaterialIdCardInfo setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeVerifyResultResponseMaterialIdCardInfo setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }
        public String getNationality() {
            return this.nationality;
        }

        public DescribeVerifyResultResponseMaterialIdCardInfo setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public DescribeVerifyResultResponseMaterialIdCardInfo setFrontImageUrl(String frontImageUrl) {
            this.frontImageUrl = frontImageUrl;
            return this;
        }
        public String getFrontImageUrl() {
            return this.frontImageUrl;
        }

        public DescribeVerifyResultResponseMaterialIdCardInfo setAuthority(String authority) {
            this.authority = authority;
            return this;
        }
        public String getAuthority() {
            return this.authority;
        }

        public DescribeVerifyResultResponseMaterialIdCardInfo setSex(String sex) {
            this.sex = sex;
            return this;
        }
        public String getSex() {
            return this.sex;
        }

        public DescribeVerifyResultResponseMaterialIdCardInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeVerifyResultResponseMaterialIdCardInfo setBirth(String birth) {
            this.birth = birth;
            return this;
        }
        public String getBirth() {
            return this.birth;
        }

        public DescribeVerifyResultResponseMaterialIdCardInfo setBackImageUrl(String backImageUrl) {
            this.backImageUrl = backImageUrl;
            return this;
        }
        public String getBackImageUrl() {
            return this.backImageUrl;
        }

        public DescribeVerifyResultResponseMaterialIdCardInfo setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

    }

    public static class DescribeVerifyResultResponseMaterial extends TeaModel {
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
        public DescribeVerifyResultResponseMaterialIdCardInfo idCardInfo;

        @NameInMap("VideoUrls")
        @Validation(required = true)
        public java.util.List<String> videoUrls;

        public static DescribeVerifyResultResponseMaterial build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyResultResponseMaterial self = new DescribeVerifyResultResponseMaterial();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyResultResponseMaterial setFaceImageUrl(String faceImageUrl) {
            this.faceImageUrl = faceImageUrl;
            return this;
        }
        public String getFaceImageUrl() {
            return this.faceImageUrl;
        }

        public DescribeVerifyResultResponseMaterial setIdCardName(String idCardName) {
            this.idCardName = idCardName;
            return this;
        }
        public String getIdCardName() {
            return this.idCardName;
        }

        public DescribeVerifyResultResponseMaterial setIdCardNumber(String idCardNumber) {
            this.idCardNumber = idCardNumber;
            return this;
        }
        public String getIdCardNumber() {
            return this.idCardNumber;
        }

        public DescribeVerifyResultResponseMaterial setFaceQuality(String faceQuality) {
            this.faceQuality = faceQuality;
            return this;
        }
        public String getFaceQuality() {
            return this.faceQuality;
        }

        public DescribeVerifyResultResponseMaterial setFaceGlobalUrl(String faceGlobalUrl) {
            this.faceGlobalUrl = faceGlobalUrl;
            return this;
        }
        public String getFaceGlobalUrl() {
            return this.faceGlobalUrl;
        }

        public DescribeVerifyResultResponseMaterial setFaceMask(Boolean faceMask) {
            this.faceMask = faceMask;
            return this;
        }
        public Boolean getFaceMask() {
            return this.faceMask;
        }

        public DescribeVerifyResultResponseMaterial setIdCardInfo(DescribeVerifyResultResponseMaterialIdCardInfo idCardInfo) {
            this.idCardInfo = idCardInfo;
            return this;
        }
        public DescribeVerifyResultResponseMaterialIdCardInfo getIdCardInfo() {
            return this.idCardInfo;
        }

        public DescribeVerifyResultResponseMaterial setVideoUrls(java.util.List<String> videoUrls) {
            this.videoUrls = videoUrls;
            return this;
        }
        public java.util.List<String> getVideoUrls() {
            return this.videoUrls;
        }

    }

}
