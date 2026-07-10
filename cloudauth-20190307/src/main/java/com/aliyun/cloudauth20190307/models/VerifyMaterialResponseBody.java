// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class VerifyMaterialResponseBody extends TeaModel {
    /**
     * <p>The comparison score between the facial photo submitted during verification and the authoritative data. Value range: <strong>0</strong> to <strong>100</strong>.</p>
     * <p>Confidence thresholds for reference:</p>
     * <ul>
     * <li>At a false acceptance rate of 0.001%, the corresponding threshold is 95.</li>
     * <li>At a false acceptance rate of 0.01%, the corresponding threshold is 90.</li>
     * <li>At a false acceptance rate of 0.1%, the corresponding threshold is 80.</li>
     * <li>At a false acceptance rate of 1%, the corresponding threshold is 60.</li>
     * </ul>
     * <blockquote>
     * <p>This field only represents the comparison result between the face and the authoritative data and serves as a reference score. We do not recommend using this score alone as the pass/fail criterion. For the comprehensive verification result, refer to the <strong>VerifyStatus</strong> field. The <strong>VerifyStatus</strong> result combines the face-to-authoritative-data comparison with multiple other strategies to improve the security level.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>97</p>
     */
    @NameInMap("AuthorityComparisionScore")
    public Float authorityComparisionScore;

    /**
     * <p>The comparison score between the facial photo submitted during verification and the face on the portrait side of the ID card. Value range: <strong>0</strong> to <strong>100</strong>.</p>
     * <p>Confidence thresholds for reference:</p>
     * <ul>
     * <li>At a false acceptance rate of 0.001%, the corresponding threshold is 95.</li>
     * <li>At a false acceptance rate of 0.01%, the corresponding threshold is 90.</li>
     * <li>At a false acceptance rate of 0.1%, the corresponding threshold is 80.</li>
     * <li>At a false acceptance rate of 1%, the corresponding threshold is 60.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>97</p>
     */
    @NameInMap("IdCardFaceComparisonScore")
    public Float idCardFaceComparisonScore;

    /**
     * <p>The verification materials.</p>
     */
    @NameInMap("Material")
    public VerifyMaterialResponseBodyMaterial material;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The verification status. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Verification passed.</li>
     * <li><strong>2</strong> to <strong>n</strong>: Verification failed due to various reasons. For detailed descriptions, see <strong>Verification status description</strong> below.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("VerifyStatus")
    public Integer verifyStatus;

    /**
     * <p>The token for this verification, used to correlate the various operations within a verification request. The token is valid for 30 minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>c302c0797679457685410ee51a5ba375</p>
     */
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
        /**
         * <p>The address.</p>
         * 
         * <strong>example:</strong>
         * <p>浙江省杭州市余杭区文一西路969号</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The issuing authority.</p>
         * 
         * <strong>example:</strong>
         * <p>杭州市公安局</p>
         */
        @NameInMap("Authority")
        public String authority;

        /**
         * <p>The HTTP or HTTPS URL of the national emblem side of the ID card. The URL is valid for 5 minutes. Save the image to your own storage to avoid access issues.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://image-demo.img-cn-hangzhou.aliyuncs.com/example3.jpg">http://image-demo.img-cn-hangzhou.aliyuncs.com/example3.jpg</a></p>
         */
        @NameInMap("BackImageUrl")
        public String backImageUrl;

        /**
         * <p>The date of birth.</p>
         * 
         * <strong>example:</strong>
         * <p>19900101</p>
         */
        @NameInMap("Birth")
        public String birth;

        /**
         * <p>The expiration date of the ID card. Format: yyyymmdd.</p>
         * 
         * <strong>example:</strong>
         * <p>20201101</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        /**
         * <p>The HTTP or HTTPS URL of the portrait side of the ID card. The URL is valid for 5 minutes. Save the image to your own storage to avoid access issues.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://image-demo.img-cn-hangzhou.aliyuncs.com/example2.jpg">http://image-demo.img-cn-hangzhou.aliyuncs.com/example2.jpg</a></p>
         */
        @NameInMap("FrontImageUrl")
        public String frontImageUrl;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ethnicity.</p>
         * 
         * <strong>example:</strong>
         * <p>汉</p>
         */
        @NameInMap("Nationality")
        public String nationality;

        /**
         * <p>The ID card number.</p>
         * 
         * <strong>example:</strong>
         * <p>02343218901123****</p>
         */
        @NameInMap("Number")
        public String number;

        /**
         * <p>The start date of the ID card validity period. Format: yyyymmdd.</p>
         * 
         * <strong>example:</strong>
         * <p>20201101</p>
         */
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
        /**
         * <p>The global camera image captured by the ID Verification SDK.</p>
         * <blockquote>
         * <p>This parameter takes effect only after configuration. If you need to use this parameter, <a href="https://selfservice.console.aliyun.com/ticket/category/cloudauth/today">submit a ticket</a> to contact us.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://image-demo.img-cn-hangzhou.aliyuncs.com/face-global-example.jpg">http://image-demo.img-cn-hangzhou.aliyuncs.com/face-global-example.jpg</a></p>
         */
        @NameInMap("FaceGlobalUrl")
        public String faceGlobalUrl;

        /**
         * <p>The HTTP or HTTPS URL of the front-facing facial photo, corresponding to the request parameter <strong>FaceImageUrl</strong>. The URL is valid for 5 minutes. Save the image to your own storage to avoid access issues.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://image-demo.img-cn-hangzhou.aliyuncs.com/example.jpg">http://image-demo.img-cn-hangzhou.aliyuncs.com/example.jpg</a></p>
         */
        @NameInMap("FaceImageUrl")
        public String faceImageUrl;

        /**
         * <p>Indicates whether the face is wearing a mask. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: A mask is detected.</li>
         * <li><strong>false</strong>: No mask is detected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("FaceMask")
        public String faceMask;

        /**
         * <p>The quality of the front-facing facial photo. Valid values:</p>
         * <ul>
         * <li><strong>UNQUALIFIED</strong>: poor quality</li>
         * <li><strong>LOW</strong>: low quality</li>
         * <li><strong>NORMAL</strong>: moderate quality</li>
         * <li><strong>HIGH</strong>: high quality.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("FaceQuality")
        public String faceQuality;

        /**
         * <p>The OCR result of the ID card information.</p>
         * <blockquote>
         * <p>If the front and back photos of the ID card are not provided during verification, the OCR result of the ID card information is not returned. Even if both photos are provided, not all information on the ID card is guaranteed to be returned. OCR may fail to recognize certain information due to issues such as poor photo quality. We recommend that your business logic does not strictly depend on the ID card OCR information.</p>
         * </blockquote>
         */
        @NameInMap("IdCardInfo")
        public VerifyMaterialResponseBodyMaterialIdCardInfo idCardInfo;

        /**
         * <p>The name, corresponding to the request parameter <strong>Name</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("IdCardName")
        public String idCardName;

        /**
         * <p>The ID card number, corresponding to the request parameter <strong>IdCardNumber</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>02343218901123****</p>
         */
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
