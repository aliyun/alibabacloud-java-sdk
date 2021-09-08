// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyResultResponseBody extends TeaModel {
    @NameInMap("AuthorityComparisionScore")
    public Float authorityComparisionScore;

    @NameInMap("VerifyStatus")
    public Integer verifyStatus;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FaceComparisonScore")
    public Float faceComparisonScore;

    @NameInMap("IdCardFaceComparisonScore")
    public Float idCardFaceComparisonScore;

    @NameInMap("Material")
    public DescribeVerifyResultResponseBodyMaterial material;

    public static DescribeVerifyResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyResultResponseBody self = new DescribeVerifyResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyResultResponseBody setAuthorityComparisionScore(Float authorityComparisionScore) {
        this.authorityComparisionScore = authorityComparisionScore;
        return this;
    }
    public Float getAuthorityComparisionScore() {
        return this.authorityComparisionScore;
    }

    public DescribeVerifyResultResponseBody setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
        return this;
    }
    public Integer getVerifyStatus() {
        return this.verifyStatus;
    }

    public DescribeVerifyResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVerifyResultResponseBody setFaceComparisonScore(Float faceComparisonScore) {
        this.faceComparisonScore = faceComparisonScore;
        return this;
    }
    public Float getFaceComparisonScore() {
        return this.faceComparisonScore;
    }

    public DescribeVerifyResultResponseBody setIdCardFaceComparisonScore(Float idCardFaceComparisonScore) {
        this.idCardFaceComparisonScore = idCardFaceComparisonScore;
        return this;
    }
    public Float getIdCardFaceComparisonScore() {
        return this.idCardFaceComparisonScore;
    }

    public DescribeVerifyResultResponseBody setMaterial(DescribeVerifyResultResponseBodyMaterial material) {
        this.material = material;
        return this;
    }
    public DescribeVerifyResultResponseBodyMaterial getMaterial() {
        return this.material;
    }

    public static class DescribeVerifyResultResponseBodyMaterialIdCardInfo extends TeaModel {
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

        public static DescribeVerifyResultResponseBodyMaterialIdCardInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyResultResponseBodyMaterialIdCardInfo self = new DescribeVerifyResultResponseBodyMaterialIdCardInfo();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyResultResponseBodyMaterialIdCardInfo setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public DescribeVerifyResultResponseBodyMaterialIdCardInfo setAuthority(String authority) {
            this.authority = authority;
            return this;
        }
        public String getAuthority() {
            return this.authority;
        }

        public DescribeVerifyResultResponseBodyMaterialIdCardInfo setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeVerifyResultResponseBodyMaterialIdCardInfo setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public DescribeVerifyResultResponseBodyMaterialIdCardInfo setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public DescribeVerifyResultResponseBodyMaterialIdCardInfo setBackImageUrl(String backImageUrl) {
            this.backImageUrl = backImageUrl;
            return this;
        }
        public String getBackImageUrl() {
            return this.backImageUrl;
        }

        public DescribeVerifyResultResponseBodyMaterialIdCardInfo setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }
        public String getNationality() {
            return this.nationality;
        }

        public DescribeVerifyResultResponseBodyMaterialIdCardInfo setBirth(String birth) {
            this.birth = birth;
            return this;
        }
        public String getBirth() {
            return this.birth;
        }

        public DescribeVerifyResultResponseBodyMaterialIdCardInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeVerifyResultResponseBodyMaterialIdCardInfo setFrontImageUrl(String frontImageUrl) {
            this.frontImageUrl = frontImageUrl;
            return this;
        }
        public String getFrontImageUrl() {
            return this.frontImageUrl;
        }

    }

    public static class DescribeVerifyResultResponseBodyMaterial extends TeaModel {
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
        public DescribeVerifyResultResponseBodyMaterialIdCardInfo idCardInfo;

        public static DescribeVerifyResultResponseBodyMaterial build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyResultResponseBodyMaterial self = new DescribeVerifyResultResponseBodyMaterial();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyResultResponseBodyMaterial setIdCardNumber(String idCardNumber) {
            this.idCardNumber = idCardNumber;
            return this;
        }
        public String getIdCardNumber() {
            return this.idCardNumber;
        }

        public DescribeVerifyResultResponseBodyMaterial setFaceGlobalUrl(String faceGlobalUrl) {
            this.faceGlobalUrl = faceGlobalUrl;
            return this;
        }
        public String getFaceGlobalUrl() {
            return this.faceGlobalUrl;
        }

        public DescribeVerifyResultResponseBodyMaterial setFaceImageUrl(String faceImageUrl) {
            this.faceImageUrl = faceImageUrl;
            return this;
        }
        public String getFaceImageUrl() {
            return this.faceImageUrl;
        }

        public DescribeVerifyResultResponseBodyMaterial setFaceMask(Boolean faceMask) {
            this.faceMask = faceMask;
            return this;
        }
        public Boolean getFaceMask() {
            return this.faceMask;
        }

        public DescribeVerifyResultResponseBodyMaterial setIdCardName(String idCardName) {
            this.idCardName = idCardName;
            return this;
        }
        public String getIdCardName() {
            return this.idCardName;
        }

        public DescribeVerifyResultResponseBodyMaterial setFaceQuality(String faceQuality) {
            this.faceQuality = faceQuality;
            return this;
        }
        public String getFaceQuality() {
            return this.faceQuality;
        }

        public DescribeVerifyResultResponseBodyMaterial setVideoUrls(java.util.List<String> videoUrls) {
            this.videoUrls = videoUrls;
            return this;
        }
        public java.util.List<String> getVideoUrls() {
            return this.videoUrls;
        }

        public DescribeVerifyResultResponseBodyMaterial setIdCardInfo(DescribeVerifyResultResponseBodyMaterialIdCardInfo idCardInfo) {
            this.idCardInfo = idCardInfo;
            return this;
        }
        public DescribeVerifyResultResponseBodyMaterialIdCardInfo getIdCardInfo() {
            return this.idCardInfo;
        }

    }

}
