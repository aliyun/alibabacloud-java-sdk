// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class VerifyMaterialResponseBody extends TeaModel {
    /**
     * <p>Comparison score between the facial photo submitted during the authentication process and authoritative data, with a range of <strong>0</strong>~<strong>100</strong>.</p>
     * <p>Confidence threshold references:</p>
     * <ul>
     * <li>False recognition rate 0.001% corresponds to a threshold of 95.</li>
     * <li>False recognition rate 0.01% corresponds to a threshold of 90.</li>
     * <li>False recognition rate 0.1% corresponds to a threshold of 80.</li>
     * <li>False recognition rate 1% corresponds to a threshold of 60.</li>
     * </ul>
     * <blockquote>
     * <p>This field only indicates the comparison result between the face and authoritative data, serving as a reference score. It is generally not recommended to use this score alone as the pass/fail criterion. For the comprehensive authentication result, please refer to the <strong>VerifyStatus</strong> field. The <strong>VerifyStatus</strong> result integrates the face-to-authoritative data comparison and other various strategies, enhancing security levels.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>97</p>
     */
    @NameInMap("AuthorityComparisionScore")
    public Float authorityComparisionScore;

    /**
     * <p>Comparison score between the facial photo submitted during the authentication process and the face on the portrait side of the ID card image, with a range of <strong>0</strong>~<strong>100</strong>.</p>
     * <p>Confidence threshold references:</p>
     * <ul>
     * <li>False recognition rate 0.001% corresponds to a threshold of 95.</li>
     * <li>False recognition rate 0.01% corresponds to a threshold of 90.</li>
     * <li>False recognition rate 0.1% corresponds to a threshold of 80.</li>
     * <li>False recognition rate 1% corresponds to a threshold of 60.</li>
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
    public VerifyMaterialResponseBodyMaterial material;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Authentication status. Values:</p>
     * <ul>
     * <li><strong>1</strong>: Authentication passed.</li>
     * <li><strong>2</strong>~<strong>n</strong>: Authentication failed due to various reasons. For detailed descriptions, see the <strong>Authentication Status Explanation</strong> below.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("VerifyStatus")
    public Integer verifyStatus;

    /**
     * <p>Token for this authentication, used to link various interfaces in the authentication request, valid for 30 minutes.</p>
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
         * <p>HTTP or HTTPS link to the national emblem side of the ID card. The link is valid for 5 minutes. It is recommended to store it in your business system to avoid any impact on usage.</p>
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
         * <p>End date of the document\&quot;s validity period. Format: yyyymmdd.</p>
         * 
         * <strong>example:</strong>
         * <p>20201101</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        /**
         * <p>HTTP or HTTPS link to the portrait side of the ID card. The link is valid for 5 minutes. It is recommended to store it in your business system to avoid any impact on usage.</p>
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
         * <p>ID number.</p>
         * 
         * <strong>example:</strong>
         * <p>02343218901123****</p>
         */
        @NameInMap("Number")
        public String number;

        /**
         * <p>Start date of the document\&quot;s validity period. Format: yyyymmdd.</p>
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
         * <p>Global camera image captured by the real-person authentication SDK.</p>
         * <blockquote>
         * <p>This parameter will take effect after configuration. If you need to use this parameter, please submit a <a href="https://selfservice.console.aliyun.com/ticket/category/cloudauth/today">ticket</a> to contact us.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://image-demo.img-cn-hangzhou.aliyuncs.com/face-global-example.jpg">http://image-demo.img-cn-hangzhou.aliyuncs.com/face-global-example.jpg</a></p>
         */
        @NameInMap("FaceGlobalUrl")
        public String faceGlobalUrl;

        /**
         * <p>HTTP or HTTPS link to the frontal face image, corresponding to the request parameter <strong>FaceImageUrl</strong>. The link is valid for 5 minutes, and it is recommended to store it in your business to avoid affecting usage.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://image-demo.img-cn-hangzhou.aliyuncs.com/example.jpg">http://image-demo.img-cn-hangzhou.aliyuncs.com/example.jpg</a></p>
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
        public String faceMask;

        /**
         * <p>The quality of the frontal face image. Possible values:</p>
         * <ul>
         * <li><strong>UNQUALIFIED</strong>: Poor quality</li>
         * <li><strong>LOW</strong>: Low</li>
         * <li><strong>NORMAL</strong>: Average</li>
         * <li><strong>HIGH</strong>: High</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("FaceQuality")
        public String faceQuality;

        /**
         * <p>OCR result of the ID card information.</p>
         * <blockquote>
         * <p>If there is no front or back of the ID card during the verification process, the OCR result of the ID card information will not be returned. Even if the front and back of the ID card are present during the verification process, it does not guarantee that all the information on the ID card will be returned. Due to issues such as poor ID card photography, the OCR may fail to recognize some information, leading to incomplete OCR results. It is recommended that the business side does not heavily rely on the ID card OCR information.</p>
         * </blockquote>
         */
        @NameInMap("IdCardInfo")
        public VerifyMaterialResponseBodyMaterialIdCardInfo idCardInfo;

        /**
         * <p>Name, corresponding to the request parameter <strong>Name</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("IdCardName")
        public String idCardName;

        /**
         * <p>ID number, corresponding to the request parameter <strong>IdCardNumber</strong>.</p>
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
