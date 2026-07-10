// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyResultResponseBody extends TeaModel {
    /**
     * <p>The comparison score between the face photo submitted during verification and the authoritative data. Value range: <strong>0</strong> to <strong>100</strong>.</p>
     * <p>Confidence threshold reference:</p>
     * <ul>
     * <li>When the false acceptance rate is 0.001%, the corresponding threshold is 95.</li>
     * <li>When the false acceptance rate is 0.01%, the corresponding threshold is 90.</li>
     * <li>When the false acceptance rate is 0.1%, the corresponding threshold is 80.</li>
     * <li>When the false acceptance rate is 1%, the corresponding threshold is 60.</li>
     * </ul>
     * <blockquote>
     * <p>This field only indicates the comparison result between the face and the authoritative data and is for reference only. Do not use this value alone as the criterion for determining whether the verification is passed. For the comprehensive verification result, refer to the <strong>VerifyStatus</strong> field. The <strong>VerifyStatus</strong> result combines the face-to-authoritative-data comparison with multiple other strategies to improve security.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>97</p>
     */
    @NameInMap("AuthorityComparisionScore")
    public Float authorityComparisionScore;

    /**
     * <p>The comparison score between the face photo submitted during verification and the face in the retained face image. Value range: <strong>0</strong> to <strong>100</strong>.</p>
     * <p>Confidence threshold reference:</p>
     * <ul>
     * <li>When the false acceptance rate is 0.001%, the corresponding threshold is 95.</li>
     * <li>When the false acceptance rate is 0.01%, the corresponding threshold is 90.</li>
     * <li>When the false acceptance rate is 0.1%, the corresponding threshold is 80.</li>
     * <li>When the false acceptance rate is 1%, the corresponding threshold is 60.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>97</p>
     */
    @NameInMap("FaceComparisonScore")
    public Float faceComparisonScore;

    /**
     * <p>The comparison score between the face photo submitted during verification and the face on the ID card photo. Value range: <strong>0</strong> to <strong>100</strong>.</p>
     * <p>Confidence threshold reference:</p>
     * <ul>
     * <li>When the false acceptance rate is 0.001%, the corresponding threshold is 95.</li>
     * <li>When the false acceptance rate is 0.01%, the corresponding threshold is 90.</li>
     * <li>When the false acceptance rate is 0.1%, the corresponding threshold is 80.</li>
     * <li>When the false acceptance rate is 1%, the corresponding threshold is 60.</li>
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
    public DescribeVerifyResultResponseBodyMaterial material;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The verification status. Valid values:</p>
     * <ul>
     * <li><strong>-1</strong>: not verified.</li>
     * <li><strong>1</strong>: verification passed.</li>
     * <li><strong>2</strong> to <strong>n</strong>: verification failed due to various reasons. For more information, see the verification status description.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("VerifyStatus")
    public Integer verifyStatus;

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

    public DescribeVerifyResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVerifyResultResponseBody setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
        return this;
    }
    public Integer getVerifyStatus() {
        return this.verifyStatus;
    }

    public static class DescribeVerifyResultResponseBodyMaterialIdCardInfo extends TeaModel {
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
         * <p>The HTTP or HTTPS URL of the national emblem side of the ID card. The URL is valid for 5 minutes. Save the image to avoid access issues.</p>
         * <blockquote>
         * <p>If the HTTP or HTTPS URL has expired, call DescribeVerifyResult again to obtain a new URL.</p>
         * </blockquote>
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
         * <p>The HTTP or HTTPS URL of the portrait side of the ID card. The URL is valid for 5 minutes. Save the image to avoid access issues.</p>
         * <blockquote>
         * <p>If the HTTP or HTTPS URL has expired, call DescribeVerifyResult again to obtain a new URL.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://image-demo.img-cn-hangzhou.aliyuncs.com/example2.jpg">http://image-demo.img-cn-hangzhou.aliyuncs.com/example2.jpg</a></p>
         */
        @NameInMap("FrontImageUrl")
        public String frontImageUrl;

        /**
         * <p>The name on the ID card.</p>
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

        public static DescribeVerifyResultResponseBodyMaterialIdCardInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyResultResponseBodyMaterialIdCardInfo self = new DescribeVerifyResultResponseBodyMaterialIdCardInfo();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyResultResponseBodyMaterialIdCardInfo setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeVerifyResultResponseBodyMaterialIdCardInfo setAuthority(String authority) {
            this.authority = authority;
            return this;
        }
        public String getAuthority() {
            return this.authority;
        }

        public DescribeVerifyResultResponseBodyMaterialIdCardInfo setBackImageUrl(String backImageUrl) {
            this.backImageUrl = backImageUrl;
            return this;
        }
        public String getBackImageUrl() {
            return this.backImageUrl;
        }

        public DescribeVerifyResultResponseBodyMaterialIdCardInfo setBirth(String birth) {
            this.birth = birth;
            return this;
        }
        public String getBirth() {
            return this.birth;
        }

        public DescribeVerifyResultResponseBodyMaterialIdCardInfo setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public DescribeVerifyResultResponseBodyMaterialIdCardInfo setFrontImageUrl(String frontImageUrl) {
            this.frontImageUrl = frontImageUrl;
            return this;
        }
        public String getFrontImageUrl() {
            return this.frontImageUrl;
        }

        public DescribeVerifyResultResponseBodyMaterialIdCardInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeVerifyResultResponseBodyMaterialIdCardInfo setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }
        public String getNationality() {
            return this.nationality;
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

    }

    public static class DescribeVerifyResultResponseBodyMaterial extends TeaModel {
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
         * <p>The HTTP or HTTPS URL of the face photo. The URL is valid for 5 minutes. Save the image to avoid access issues.</p>
         * <blockquote>
         * <p>If the HTTP or HTTPS URL of the face photo has expired, call <a href="https://help.aliyun.com/document_detail/154606.html">DescribeVerifyResult</a> again to obtain a new URL.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://image-demo.img-cn-hangzhou.aliyuncs.com/face-image-example.jpg">http://image-demo.img-cn-hangzhou.aliyuncs.com/face-image-example.jpg</a></p>
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
        public Boolean faceMask;

        /**
         * <p>The quality of the face photo. Valid values:</p>
         * <ul>
         * <li><strong>UNQUALIFIED</strong>: poor quality.</li>
         * <li><strong>LOW</strong>: low quality.</li>
         * <li><strong>NORMAL</strong>: moderate quality.</li>
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
         * <p>If no front or back image of the ID card is provided during verification, the ID Verification service does not return the OCR result. Even if front and back images are provided, the service does not guarantee that all information on the ID card will be returned. OCR information may be incomplete when the ID card photo is blurry or has lighting issues that prevent character recognition. Do not create a strong dependency on the ID card OCR information in your business logic.</p>
         * </blockquote>
         */
        @NameInMap("IdCardInfo")
        public DescribeVerifyResultResponseBodyMaterialIdCardInfo idCardInfo;

        /**
         * <p>The name on the ID card.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("IdCardName")
        public String idCardName;

        /**
         * <p>The ID card number.</p>
         * 
         * <strong>example:</strong>
         * <p>02343218901123****</p>
         */
        @NameInMap("IdCardNumber")
        public String idCardNumber;

        /**
         * <p>The URL of the recorded video returned by the legacy RPH5BioOnly solution.</p>
         */
        @NameInMap("VideoUrls")
        public java.util.List<String> videoUrls;

        public static DescribeVerifyResultResponseBodyMaterial build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyResultResponseBodyMaterial self = new DescribeVerifyResultResponseBodyMaterial();
            return TeaModel.build(map, self);
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

        public DescribeVerifyResultResponseBodyMaterial setFaceQuality(String faceQuality) {
            this.faceQuality = faceQuality;
            return this;
        }
        public String getFaceQuality() {
            return this.faceQuality;
        }

        public DescribeVerifyResultResponseBodyMaterial setIdCardInfo(DescribeVerifyResultResponseBodyMaterialIdCardInfo idCardInfo) {
            this.idCardInfo = idCardInfo;
            return this;
        }
        public DescribeVerifyResultResponseBodyMaterialIdCardInfo getIdCardInfo() {
            return this.idCardInfo;
        }

        public DescribeVerifyResultResponseBodyMaterial setIdCardName(String idCardName) {
            this.idCardName = idCardName;
            return this;
        }
        public String getIdCardName() {
            return this.idCardName;
        }

        public DescribeVerifyResultResponseBodyMaterial setIdCardNumber(String idCardNumber) {
            this.idCardNumber = idCardNumber;
            return this;
        }
        public String getIdCardNumber() {
            return this.idCardNumber;
        }

        public DescribeVerifyResultResponseBodyMaterial setVideoUrls(java.util.List<String> videoUrls) {
            this.videoUrls = videoUrls;
            return this;
        }
        public java.util.List<String> getVideoUrls() {
            return this.videoUrls;
        }

    }

}
