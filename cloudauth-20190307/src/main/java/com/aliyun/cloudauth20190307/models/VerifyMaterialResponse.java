// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class VerifyMaterialResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("VerifyToken")
    @Validation(required = true)
    public String verifyToken;

    @NameInMap("VerifyStatus")
    @Validation(required = true)
    public Integer verifyStatus;

    @NameInMap("AuthorityComparisionScore")
    @Validation(required = true)
    public Float authorityComparisionScore;

    @NameInMap("IdCardFaceComparisonScore")
    @Validation(required = true)
    public Float idCardFaceComparisonScore;

    @NameInMap("Material")
    @Validation(required = true)
    public VerifyMaterialResponseMaterial material;

    public static VerifyMaterialResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyMaterialResponse self = new VerifyMaterialResponse();
        return TeaModel.build(map, self);
    }

    public VerifyMaterialResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyMaterialResponse setVerifyToken(String verifyToken) {
        this.verifyToken = verifyToken;
        return this;
    }
    public String getVerifyToken() {
        return this.verifyToken;
    }

    public VerifyMaterialResponse setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
        return this;
    }
    public Integer getVerifyStatus() {
        return this.verifyStatus;
    }

    public VerifyMaterialResponse setAuthorityComparisionScore(Float authorityComparisionScore) {
        this.authorityComparisionScore = authorityComparisionScore;
        return this;
    }
    public Float getAuthorityComparisionScore() {
        return this.authorityComparisionScore;
    }

    public VerifyMaterialResponse setIdCardFaceComparisonScore(Float idCardFaceComparisonScore) {
        this.idCardFaceComparisonScore = idCardFaceComparisonScore;
        return this;
    }
    public Float getIdCardFaceComparisonScore() {
        return this.idCardFaceComparisonScore;
    }

    public VerifyMaterialResponse setMaterial(VerifyMaterialResponseMaterial material) {
        this.material = material;
        return this;
    }
    public VerifyMaterialResponseMaterial getMaterial() {
        return this.material;
    }

    public static class VerifyMaterialResponseMaterialIdCardInfo extends TeaModel {
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

        public static VerifyMaterialResponseMaterialIdCardInfo build(java.util.Map<String, ?> map) throws Exception {
            VerifyMaterialResponseMaterialIdCardInfo self = new VerifyMaterialResponseMaterialIdCardInfo();
            return TeaModel.build(map, self);
        }

        public VerifyMaterialResponseMaterialIdCardInfo setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public VerifyMaterialResponseMaterialIdCardInfo setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public VerifyMaterialResponseMaterialIdCardInfo setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }
        public String getNationality() {
            return this.nationality;
        }

        public VerifyMaterialResponseMaterialIdCardInfo setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public VerifyMaterialResponseMaterialIdCardInfo setFrontImageUrl(String frontImageUrl) {
            this.frontImageUrl = frontImageUrl;
            return this;
        }
        public String getFrontImageUrl() {
            return this.frontImageUrl;
        }

        public VerifyMaterialResponseMaterialIdCardInfo setAuthority(String authority) {
            this.authority = authority;
            return this;
        }
        public String getAuthority() {
            return this.authority;
        }

        public VerifyMaterialResponseMaterialIdCardInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public VerifyMaterialResponseMaterialIdCardInfo setBirth(String birth) {
            this.birth = birth;
            return this;
        }
        public String getBirth() {
            return this.birth;
        }

        public VerifyMaterialResponseMaterialIdCardInfo setBackImageUrl(String backImageUrl) {
            this.backImageUrl = backImageUrl;
            return this;
        }
        public String getBackImageUrl() {
            return this.backImageUrl;
        }

        public VerifyMaterialResponseMaterialIdCardInfo setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

    }

    public static class VerifyMaterialResponseMaterial extends TeaModel {
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
        public String faceMask;

        @NameInMap("IdCardInfo")
        @Validation(required = true)
        public VerifyMaterialResponseMaterialIdCardInfo idCardInfo;

        public static VerifyMaterialResponseMaterial build(java.util.Map<String, ?> map) throws Exception {
            VerifyMaterialResponseMaterial self = new VerifyMaterialResponseMaterial();
            return TeaModel.build(map, self);
        }

        public VerifyMaterialResponseMaterial setFaceImageUrl(String faceImageUrl) {
            this.faceImageUrl = faceImageUrl;
            return this;
        }
        public String getFaceImageUrl() {
            return this.faceImageUrl;
        }

        public VerifyMaterialResponseMaterial setIdCardName(String idCardName) {
            this.idCardName = idCardName;
            return this;
        }
        public String getIdCardName() {
            return this.idCardName;
        }

        public VerifyMaterialResponseMaterial setIdCardNumber(String idCardNumber) {
            this.idCardNumber = idCardNumber;
            return this;
        }
        public String getIdCardNumber() {
            return this.idCardNumber;
        }

        public VerifyMaterialResponseMaterial setFaceQuality(String faceQuality) {
            this.faceQuality = faceQuality;
            return this;
        }
        public String getFaceQuality() {
            return this.faceQuality;
        }

        public VerifyMaterialResponseMaterial setFaceGlobalUrl(String faceGlobalUrl) {
            this.faceGlobalUrl = faceGlobalUrl;
            return this;
        }
        public String getFaceGlobalUrl() {
            return this.faceGlobalUrl;
        }

        public VerifyMaterialResponseMaterial setFaceMask(String faceMask) {
            this.faceMask = faceMask;
            return this;
        }
        public String getFaceMask() {
            return this.faceMask;
        }

        public VerifyMaterialResponseMaterial setIdCardInfo(VerifyMaterialResponseMaterialIdCardInfo idCardInfo) {
            this.idCardInfo = idCardInfo;
            return this;
        }
        public VerifyMaterialResponseMaterialIdCardInfo getIdCardInfo() {
            return this.idCardInfo;
        }

    }

}
