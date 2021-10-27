// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class VerifyMaterialResponseBody extends TeaModel {
    @NameInMap("AuthorityComparisionScore")
    public Float authorityComparisionScore;

    @NameInMap("IdCardFaceComparisonScore")
    public Float idCardFaceComparisonScore;

    @NameInMap("Material")
    public VerifyMaterialResponseBodyMaterial material;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VerifyStatus")
    public Integer verifyStatus;

    @NameInMap("VerifyToken")
    public String verifyToken;

    public static VerifyMaterialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyMaterialResponseBody self = new VerifyMaterialResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyMaterialResponseBody setAuthorityComparisionScore(Float authorityComparisionScore) {
        this.authorityComparisionScore = authorityComparisionScore;
        return this;
    }
    public Float getAuthorityComparisionScore() {
        return this.authorityComparisionScore;
    }

    public VerifyMaterialResponseBody setIdCardFaceComparisonScore(Float idCardFaceComparisonScore) {
        this.idCardFaceComparisonScore = idCardFaceComparisonScore;
        return this;
    }
    public Float getIdCardFaceComparisonScore() {
        return this.idCardFaceComparisonScore;
    }

    public VerifyMaterialResponseBody setMaterial(VerifyMaterialResponseBodyMaterial material) {
        this.material = material;
        return this;
    }
    public VerifyMaterialResponseBodyMaterial getMaterial() {
        return this.material;
    }

    public VerifyMaterialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyMaterialResponseBody setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
        return this;
    }
    public Integer getVerifyStatus() {
        return this.verifyStatus;
    }

    public VerifyMaterialResponseBody setVerifyToken(String verifyToken) {
        this.verifyToken = verifyToken;
        return this;
    }
    public String getVerifyToken() {
        return this.verifyToken;
    }

    public static class VerifyMaterialResponseBodyMaterialIdCardInfo extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("Authority")
        public String authority;

        @NameInMap("BackImageUrl")
        public String backImageUrl;

        @NameInMap("Birth")
        public String birth;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("FrontImageUrl")
        public String frontImageUrl;

        @NameInMap("Name")
        public String name;

        @NameInMap("Nationality")
        public String nationality;

        @NameInMap("Number")
        public String number;

        @NameInMap("StartDate")
        public String startDate;

        public static VerifyMaterialResponseBodyMaterialIdCardInfo build(java.util.Map<String, ?> map) throws Exception {
            VerifyMaterialResponseBodyMaterialIdCardInfo self = new VerifyMaterialResponseBodyMaterialIdCardInfo();
            return TeaModel.build(map, self);
        }

        public VerifyMaterialResponseBodyMaterialIdCardInfo setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public VerifyMaterialResponseBodyMaterialIdCardInfo setAuthority(String authority) {
            this.authority = authority;
            return this;
        }
        public String getAuthority() {
            return this.authority;
        }

        public VerifyMaterialResponseBodyMaterialIdCardInfo setBackImageUrl(String backImageUrl) {
            this.backImageUrl = backImageUrl;
            return this;
        }
        public String getBackImageUrl() {
            return this.backImageUrl;
        }

        public VerifyMaterialResponseBodyMaterialIdCardInfo setBirth(String birth) {
            this.birth = birth;
            return this;
        }
        public String getBirth() {
            return this.birth;
        }

        public VerifyMaterialResponseBodyMaterialIdCardInfo setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public VerifyMaterialResponseBodyMaterialIdCardInfo setFrontImageUrl(String frontImageUrl) {
            this.frontImageUrl = frontImageUrl;
            return this;
        }
        public String getFrontImageUrl() {
            return this.frontImageUrl;
        }

        public VerifyMaterialResponseBodyMaterialIdCardInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public VerifyMaterialResponseBodyMaterialIdCardInfo setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }
        public String getNationality() {
            return this.nationality;
        }

        public VerifyMaterialResponseBodyMaterialIdCardInfo setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public VerifyMaterialResponseBodyMaterialIdCardInfo setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

    }

    public static class VerifyMaterialResponseBodyMaterial extends TeaModel {
        @NameInMap("FaceGlobalUrl")
        public String faceGlobalUrl;

        @NameInMap("FaceImageUrl")
        public String faceImageUrl;

        @NameInMap("FaceMask")
        public String faceMask;

        @NameInMap("FaceQuality")
        public String faceQuality;

        @NameInMap("IdCardInfo")
        public VerifyMaterialResponseBodyMaterialIdCardInfo idCardInfo;

        @NameInMap("IdCardName")
        public String idCardName;

        @NameInMap("IdCardNumber")
        public String idCardNumber;

        public static VerifyMaterialResponseBodyMaterial build(java.util.Map<String, ?> map) throws Exception {
            VerifyMaterialResponseBodyMaterial self = new VerifyMaterialResponseBodyMaterial();
            return TeaModel.build(map, self);
        }

        public VerifyMaterialResponseBodyMaterial setFaceGlobalUrl(String faceGlobalUrl) {
            this.faceGlobalUrl = faceGlobalUrl;
            return this;
        }
        public String getFaceGlobalUrl() {
            return this.faceGlobalUrl;
        }

        public VerifyMaterialResponseBodyMaterial setFaceImageUrl(String faceImageUrl) {
            this.faceImageUrl = faceImageUrl;
            return this;
        }
        public String getFaceImageUrl() {
            return this.faceImageUrl;
        }

        public VerifyMaterialResponseBodyMaterial setFaceMask(String faceMask) {
            this.faceMask = faceMask;
            return this;
        }
        public String getFaceMask() {
            return this.faceMask;
        }

        public VerifyMaterialResponseBodyMaterial setFaceQuality(String faceQuality) {
            this.faceQuality = faceQuality;
            return this;
        }
        public String getFaceQuality() {
            return this.faceQuality;
        }

        public VerifyMaterialResponseBodyMaterial setIdCardInfo(VerifyMaterialResponseBodyMaterialIdCardInfo idCardInfo) {
            this.idCardInfo = idCardInfo;
            return this;
        }
        public VerifyMaterialResponseBodyMaterialIdCardInfo getIdCardInfo() {
            return this.idCardInfo;
        }

        public VerifyMaterialResponseBodyMaterial setIdCardName(String idCardName) {
            this.idCardName = idCardName;
            return this;
        }
        public String getIdCardName() {
            return this.idCardName;
        }

        public VerifyMaterialResponseBodyMaterial setIdCardNumber(String idCardNumber) {
            this.idCardNumber = idCardNumber;
            return this;
        }
        public String getIdCardNumber() {
            return this.idCardNumber;
        }

    }

}
