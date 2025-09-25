// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyResultResponseBody extends TeaModel {
    /**
     * <p>The comparison score between the face photo submitted during the authentication process and the authoritative data, with a value range of <strong>0</strong> to <strong>100</strong>.
     * Confidence threshold references:</p>
     * <ul>
     * <li>When the false acceptance rate is 0.001%, the corresponding threshold is 95. - When the false acceptance rate is 0.01%, the corresponding threshold is 90. - When the false acceptance rate is 0.1%, the corresponding threshold is 80. - When the false acceptance rate is 1%, the corresponding threshold is 60.<blockquote>
     * <p>This field only indicates the comparison result between the face and the authoritative data, for your reference only. It is generally not recommended to use this value alone as the standard for whether the authentication passes. For a comprehensive authentication result, please refer to the <strong>VerifyStatus</strong> field. The <strong>VerifyStatus</strong> result integrates the comparison of the face with the authoritative data and various other strategies, which can enhance security levels.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>97</p>
     */
    @NameInMap("AuthorityComparisionScore")
    public Float authorityComparisionScore;

    /**
     * <p>The comparison score between the face photo submitted during the authentication process and the face in the retained face image. The value range is <strong>0</strong>~<strong>100</strong>.</p>
     * <p>Confidence threshold reference:</p>
     * <ul>
     * <li>When the false recognition rate is 0.001%, the corresponding threshold is 95.</li>
     * <li>When the false recognition rate is 0.01%, the corresponding threshold is 90.</li>
     * <li>When the false recognition rate is 0.1%, the corresponding threshold is 80.</li>
     * <li>When the false recognition rate is 1%, the corresponding threshold is 60.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>97</p>
     */
    @NameInMap("FaceComparisonScore")
    public Float faceComparisonScore;

    /**
     * <p>The comparison score between the face photo submitted during the authentication process and the face on the ID card\&quot;s face side. The value range is <strong>0</strong>~<strong>100</strong>.</p>
     * <p>Confidence threshold reference:</p>
     * <ul>
     * <li>When the false recognition rate is 0.001%, the corresponding threshold is 95.</li>
     * <li>When the false recognition rate is 0.01%, the corresponding threshold is 90.</li>
     * <li>When the false recognition rate is 0.1%, the corresponding threshold is 80.</li>
     * <li>When the false recognition rate is 1%, the corresponding threshold is 60.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>97</p>
     */
    @NameInMap("IdCardFaceComparisonScore")
    public Float idCardFaceComparisonScore;

    /**
     * <p>Authentication materials.</p>
     */
    @NameInMap("Material")
    public DescribeVerifyResultResponseBodyMaterial material;

    /**
     * <p>The ID of this request.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Authentication status, values:</p>
     * <ul>
     * <li><strong>-1</strong>: Not authenticated - <strong>1</strong>: Authentication passed - <strong>2</strong> to <strong>n</strong>: Authentication failed for various reasons. For detailed descriptions, see the authentication status explanation.</li>
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
         * <p>Address.</p>
         * 
         * <strong>example:</strong>
         * <p>浙江省杭州市余杭区文一西路969号</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>Issuing authority.</p>
         * 
         * <strong>example:</strong>
         * <p>杭州市公安局</p>
         */
        @NameInMap("Authority")
        public String authority;

        /**
         * <p>HTTP/HTTPS link to the image of the back side (national emblem side) of the ID card. The link is valid for 5 minutes, and it is recommended to store it for business use to avoid any impact.</p>
         * <blockquote>
         * <p>If the HTTP/HTTPS link to the front-facing portrait image expires, you can call DescribeVerifyResult again to get the link.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://image-demo.img-cn-hangzhou.aliyuncs.com/example3.jpg">http://image-demo.img-cn-hangzhou.aliyuncs.com/example3.jpg</a></p>
         */
        @NameInMap("BackImageUrl")
        public String backImageUrl;

        /**
         * <p>Date of birth.</p>
         * 
         * <strong>example:</strong>
         * <p>19900101</p>
         */
        @NameInMap("Birth")
        public String birth;

        /**
         * <p>The end date of the document\&quot;s validity period. Format: yyyymmdd.</p>
         * 
         * <strong>example:</strong>
         * <p>20201101</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        /**
         * <p>HTTP/HTTPS link to the image of the front side (portrait side) of the ID card. The link is valid for 5 minutes, and it is recommended to store it for business use to avoid any impact.</p>
         * <blockquote>
         * <p>If the HTTP/HTTPS link to the front-facing portrait image expires, you can call DescribeVerifyResult again to get the link.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://image-demo.img-cn-hangzhou.aliyuncs.com/example2.jpg">http://image-demo.img-cn-hangzhou.aliyuncs.com/example2.jpg</a></p>
         */
        @NameInMap("FrontImageUrl")
        public String frontImageUrl;

        /**
         * <p>Name.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Nationality.</p>
         * 
         * <strong>example:</strong>
         * <p>汉</p>
         */
        @NameInMap("Nationality")
        public String nationality;

        /**
         * <p>ID card number.</p>
         * 
         * <strong>example:</strong>
         * <p>02343218901123****</p>
         */
        @NameInMap("Number")
        public String number;

        /**
         * <p>Start date of the document\&quot;s validity. Format: yyyymmdd.</p>
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
         * <p>The global camera image captured by the real-person authentication SDK.</p>
         * <blockquote>
         * <p>This parameter will only take effect after configuration. If you need to use this parameter, please submit a <a href="https://selfservice.console.aliyun.com/ticket/category/cloudauth/today">ticket</a> to contact us.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://image-demo.img-cn-hangzhou.aliyuncs.com/face-global-example.jpg">http://image-demo.img-cn-hangzhou.aliyuncs.com/face-global-example.jpg</a></p>
         */
        @NameInMap("FaceGlobalUrl")
        public String faceGlobalUrl;

        /**
         * <p>The HTTP or HTTPS link to the frontal face image. The link is valid for 5 minutes, and it is recommended to store it elsewhere to avoid any impact on usage.</p>
         * <blockquote>
         * <p>If the HTTP or HTTPS link to the frontal face image expires, you can call <a href="https://help.aliyun.com/document_detail/154606.html">DescribeVerifyResult</a> again to get the link.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://image-demo.img-cn-hangzhou.aliyuncs.com/face-image-example.jpg">http://image-demo.img-cn-hangzhou.aliyuncs.com/face-image-example.jpg</a></p>
         */
        @NameInMap("FaceImageUrl")
        public String faceImageUrl;

        /**
         * <p>Whether the face is wearing a mask. Values:</p>
         * <ul>
         * <li><strong>true</strong>: Wearing a mask</li>
         * <li><strong>false</strong>: Not wearing a mask</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("FaceMask")
        public Boolean faceMask;

        /**
         * <p>The quality of the frontal face image. Values:</p>
         * <ul>
         * <li><strong>UNQUALIFIED</strong>: Poor quality</li>
         * <li><strong>LOW</strong>: Low</li>
         * <li><strong>NORMAL</strong>: Normal</li>
         * <li><strong>HIGH</strong>: High</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("FaceQuality")
        public String faceQuality;

        /**
         * <p>OCR results of the ID card information.</p>
         * <blockquote>
         * <p>If there is no front and back information of the ID card during the authentication process, the real-person authentication service will not return the OCR results of the ID card. Even if there is front and back information of the ID card during the authentication process, the real-person authentication service does not guarantee to return all the information on the ID card. Due to issues with ID card photography, the OCR may fail to recognize some information, resulting in incomplete OCR information. It is recommended that your business does not strongly rely on the ID card OCR information.</p>
         * </blockquote>
         */
        @NameInMap("IdCardInfo")
        public DescribeVerifyResultResponseBodyMaterialIdCardInfo idCardInfo;

        /**
         * <p>Name.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("IdCardName")
        public String idCardName;

        /**
         * <p>ID number.</p>
         * 
         * <strong>example:</strong>
         * <p>02343218901123****</p>
         */
        @NameInMap("IdCardNumber")
        public String idCardNumber;

        /**
         * <p>The URL addresses of the recorded videos returned by the historical RPH5BioOnly solution.</p>
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
