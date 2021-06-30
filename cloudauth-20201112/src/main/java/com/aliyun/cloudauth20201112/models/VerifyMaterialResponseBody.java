// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20201112.models;

import com.aliyun.tea.*;

public class VerifyMaterialResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObject")
    public VerifyMaterialResponseBodyResultObject resultObject;

    public static VerifyMaterialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyMaterialResponseBody self = new VerifyMaterialResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyMaterialResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VerifyMaterialResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VerifyMaterialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyMaterialResponseBody setResultObject(VerifyMaterialResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public VerifyMaterialResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class VerifyMaterialResponseBodyResultObjectMaterialIdCardInfo extends TeaModel {
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

        public static VerifyMaterialResponseBodyResultObjectMaterialIdCardInfo build(java.util.Map<String, ?> map) throws Exception {
            VerifyMaterialResponseBodyResultObjectMaterialIdCardInfo self = new VerifyMaterialResponseBodyResultObjectMaterialIdCardInfo();
            return TeaModel.build(map, self);
        }

        public VerifyMaterialResponseBodyResultObjectMaterialIdCardInfo setSex(String sex) {
            this.sex = sex;
            return this;
        }
        public String getSex() {
            return this.sex;
        }

        public VerifyMaterialResponseBodyResultObjectMaterialIdCardInfo setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public VerifyMaterialResponseBodyResultObjectMaterialIdCardInfo setAuthority(String authority) {
            this.authority = authority;
            return this;
        }
        public String getAuthority() {
            return this.authority;
        }

        public VerifyMaterialResponseBodyResultObjectMaterialIdCardInfo setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public VerifyMaterialResponseBodyResultObjectMaterialIdCardInfo setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public VerifyMaterialResponseBodyResultObjectMaterialIdCardInfo setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public VerifyMaterialResponseBodyResultObjectMaterialIdCardInfo setBackImageUrl(String backImageUrl) {
            this.backImageUrl = backImageUrl;
            return this;
        }
        public String getBackImageUrl() {
            return this.backImageUrl;
        }

        public VerifyMaterialResponseBodyResultObjectMaterialIdCardInfo setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }
        public String getNationality() {
            return this.nationality;
        }

        public VerifyMaterialResponseBodyResultObjectMaterialIdCardInfo setBirth(String birth) {
            this.birth = birth;
            return this;
        }
        public String getBirth() {
            return this.birth;
        }

        public VerifyMaterialResponseBodyResultObjectMaterialIdCardInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public VerifyMaterialResponseBodyResultObjectMaterialIdCardInfo setFrontImageUrl(String frontImageUrl) {
            this.frontImageUrl = frontImageUrl;
            return this;
        }
        public String getFrontImageUrl() {
            return this.frontImageUrl;
        }

    }

    public static class VerifyMaterialResponseBodyResultObjectMaterial extends TeaModel {
        @NameInMap("IdCardNumber")
        public String idCardNumber;

        @NameInMap("FaceGlobalUrl")
        public String faceGlobalUrl;

        @NameInMap("FaceImageUrl")
        public String faceImageUrl;

        @NameInMap("FaceMask")
        public String faceMask;

        @NameInMap("IdCardName")
        public String idCardName;

        @NameInMap("FaceQuality")
        public String faceQuality;

        @NameInMap("IdCardInfo")
        public VerifyMaterialResponseBodyResultObjectMaterialIdCardInfo idCardInfo;

        public static VerifyMaterialResponseBodyResultObjectMaterial build(java.util.Map<String, ?> map) throws Exception {
            VerifyMaterialResponseBodyResultObjectMaterial self = new VerifyMaterialResponseBodyResultObjectMaterial();
            return TeaModel.build(map, self);
        }

        public VerifyMaterialResponseBodyResultObjectMaterial setIdCardNumber(String idCardNumber) {
            this.idCardNumber = idCardNumber;
            return this;
        }
        public String getIdCardNumber() {
            return this.idCardNumber;
        }

        public VerifyMaterialResponseBodyResultObjectMaterial setFaceGlobalUrl(String faceGlobalUrl) {
            this.faceGlobalUrl = faceGlobalUrl;
            return this;
        }
        public String getFaceGlobalUrl() {
            return this.faceGlobalUrl;
        }

        public VerifyMaterialResponseBodyResultObjectMaterial setFaceImageUrl(String faceImageUrl) {
            this.faceImageUrl = faceImageUrl;
            return this;
        }
        public String getFaceImageUrl() {
            return this.faceImageUrl;
        }

        public VerifyMaterialResponseBodyResultObjectMaterial setFaceMask(String faceMask) {
            this.faceMask = faceMask;
            return this;
        }
        public String getFaceMask() {
            return this.faceMask;
        }

        public VerifyMaterialResponseBodyResultObjectMaterial setIdCardName(String idCardName) {
            this.idCardName = idCardName;
            return this;
        }
        public String getIdCardName() {
            return this.idCardName;
        }

        public VerifyMaterialResponseBodyResultObjectMaterial setFaceQuality(String faceQuality) {
            this.faceQuality = faceQuality;
            return this;
        }
        public String getFaceQuality() {
            return this.faceQuality;
        }

        public VerifyMaterialResponseBodyResultObjectMaterial setIdCardInfo(VerifyMaterialResponseBodyResultObjectMaterialIdCardInfo idCardInfo) {
            this.idCardInfo = idCardInfo;
            return this;
        }
        public VerifyMaterialResponseBodyResultObjectMaterialIdCardInfo getIdCardInfo() {
            return this.idCardInfo;
        }

    }

    public static class VerifyMaterialResponseBodyResultObject extends TeaModel {
        @NameInMap("AuthorityComparisionScore")
        public Float authorityComparisionScore;

        @NameInMap("VerifyStatus")
        public Integer verifyStatus;

        @NameInMap("VerifyToken")
        public String verifyToken;

        @NameInMap("IdCardFaceComparisonScore")
        public Float idCardFaceComparisonScore;

        @NameInMap("Material")
        public VerifyMaterialResponseBodyResultObjectMaterial material;

        public static VerifyMaterialResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            VerifyMaterialResponseBodyResultObject self = new VerifyMaterialResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public VerifyMaterialResponseBodyResultObject setAuthorityComparisionScore(Float authorityComparisionScore) {
            this.authorityComparisionScore = authorityComparisionScore;
            return this;
        }
        public Float getAuthorityComparisionScore() {
            return this.authorityComparisionScore;
        }

        public VerifyMaterialResponseBodyResultObject setVerifyStatus(Integer verifyStatus) {
            this.verifyStatus = verifyStatus;
            return this;
        }
        public Integer getVerifyStatus() {
            return this.verifyStatus;
        }

        public VerifyMaterialResponseBodyResultObject setVerifyToken(String verifyToken) {
            this.verifyToken = verifyToken;
            return this;
        }
        public String getVerifyToken() {
            return this.verifyToken;
        }

        public VerifyMaterialResponseBodyResultObject setIdCardFaceComparisonScore(Float idCardFaceComparisonScore) {
            this.idCardFaceComparisonScore = idCardFaceComparisonScore;
            return this;
        }
        public Float getIdCardFaceComparisonScore() {
            return this.idCardFaceComparisonScore;
        }

        public VerifyMaterialResponseBodyResultObject setMaterial(VerifyMaterialResponseBodyResultObjectMaterial material) {
            this.material = material;
            return this;
        }
        public VerifyMaterialResponseBodyResultObjectMaterial getMaterial() {
            return this.material;
        }

    }

}
