// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifySearchPageListResponseBody extends TeaModel {
    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The paginated list data.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeVerifySearchPageListResponseBodyItems> items;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>47D87BC1-D956-573A-8A15-A9007A76F56C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>53</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static DescribeVerifySearchPageListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifySearchPageListResponseBody self = new DescribeVerifySearchPageListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVerifySearchPageListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeVerifySearchPageListResponseBody setItems(java.util.List<DescribeVerifySearchPageListResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeVerifySearchPageListResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeVerifySearchPageListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVerifySearchPageListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVerifySearchPageListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVerifySearchPageListResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeVerifySearchPageListResponseBodyItemsExtInfo extends TeaModel {
        /**
         * <p>The desensitized name.</p>
         * 
         * <strong>example:</strong>
         * <p>何*</p>
         */
        @NameInMap("CertName")
        public String certName;

        /**
         * <p>The Face Guard tags.</p>
         * 
         * <strong>example:</strong>
         * <p>HOOK,ROOT</p>
         */
        @NameInMap("DeviceRisk")
        public String deviceRisk;

        /**
         * <p>Specifies whether a face attack is detected:</p>
         * <ul>
         * <li><strong>T</strong>: Yes.</li>
         * <li><strong>F</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>T</p>
         */
        @NameInMap("FaceAttack")
        public String faceAttack;

        /**
         * <p>The face attack score. The value ranges from 0 to 1. A value closer to 1 indicates a higher likelihood of an attack.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0000445161</p>
         */
        @NameInMap("FaceAttackScore")
        public Float faceAttackScore;

        /**
         * <p>Specifies whether the face is occluded. T indicates occlusion detected. F indicates no occlusion.</p>
         * 
         * <strong>example:</strong>
         * <p>T</p>
         */
        @NameInMap("FaceOcclusion")
        public String faceOcclusion;

        /**
         * <p>The face-to-ID card comparison score.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("IdCardVerifyScore")
        public Float idCardVerifyScore;

        /**
         * <p>The OSS bucket for photos.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-aliyun-cloudauth-XXX</p>
         */
        @NameInMap("OssBucketName")
        public String ossBucketName;

        /**
         * <p>The file name of the OCR ID card face image.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("OssIdFaceObjectName")
        public String ossIdFaceObjectName;

        /**
         * <p>The file name of the OCR ID card national emblem image.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("OssIdNationalEmblemObjectName")
        public String ossIdNationalEmblemObjectName;

        /**
         * <p>The storage object name.</p>
         * 
         * <strong>example:</strong>
         * <p>verify/XXXXX1251634779/sha6a0a0cab01288c7aa8ac3f45220eb_0_normal.jpeg</p>
         */
        @NameInMap("OssObjectName")
        public String ossObjectName;

        /**
         * <p>The liveness face quality score.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("QualityScore")
        public Float qualityScore;

        /**
         * <p>The face comparison score.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("VerifyScore")
        public Float verifyScore;

        /**
         * <p>The list of ASR texts.</p>
         */
        @NameInMap("asrTexts")
        public java.util.List<String> asrTexts;

        /**
         * <p>The list of screen recording file OSS object names.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("screenVideoObjectNames")
        public java.util.List<String> screenVideoObjectNames;

        /**
         * <p>The list of audio file OSS object names.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("voiceObjectNames")
        public java.util.List<String> voiceObjectNames;

        public static DescribeVerifySearchPageListResponseBodyItemsExtInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifySearchPageListResponseBodyItemsExtInfo self = new DescribeVerifySearchPageListResponseBodyItemsExtInfo();
            return TeaModel.build(map, self);
        }

        public DescribeVerifySearchPageListResponseBodyItemsExtInfo setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeVerifySearchPageListResponseBodyItemsExtInfo setDeviceRisk(String deviceRisk) {
            this.deviceRisk = deviceRisk;
            return this;
        }
        public String getDeviceRisk() {
            return this.deviceRisk;
        }

        public DescribeVerifySearchPageListResponseBodyItemsExtInfo setFaceAttack(String faceAttack) {
            this.faceAttack = faceAttack;
            return this;
        }
        public String getFaceAttack() {
            return this.faceAttack;
        }

        public DescribeVerifySearchPageListResponseBodyItemsExtInfo setFaceAttackScore(Float faceAttackScore) {
            this.faceAttackScore = faceAttackScore;
            return this;
        }
        public Float getFaceAttackScore() {
            return this.faceAttackScore;
        }

        public DescribeVerifySearchPageListResponseBodyItemsExtInfo setFaceOcclusion(String faceOcclusion) {
            this.faceOcclusion = faceOcclusion;
            return this;
        }
        public String getFaceOcclusion() {
            return this.faceOcclusion;
        }

        public DescribeVerifySearchPageListResponseBodyItemsExtInfo setIdCardVerifyScore(Float idCardVerifyScore) {
            this.idCardVerifyScore = idCardVerifyScore;
            return this;
        }
        public Float getIdCardVerifyScore() {
            return this.idCardVerifyScore;
        }

        public DescribeVerifySearchPageListResponseBodyItemsExtInfo setOssBucketName(String ossBucketName) {
            this.ossBucketName = ossBucketName;
            return this;
        }
        public String getOssBucketName() {
            return this.ossBucketName;
        }

        public DescribeVerifySearchPageListResponseBodyItemsExtInfo setOssIdFaceObjectName(String ossIdFaceObjectName) {
            this.ossIdFaceObjectName = ossIdFaceObjectName;
            return this;
        }
        public String getOssIdFaceObjectName() {
            return this.ossIdFaceObjectName;
        }

        public DescribeVerifySearchPageListResponseBodyItemsExtInfo setOssIdNationalEmblemObjectName(String ossIdNationalEmblemObjectName) {
            this.ossIdNationalEmblemObjectName = ossIdNationalEmblemObjectName;
            return this;
        }
        public String getOssIdNationalEmblemObjectName() {
            return this.ossIdNationalEmblemObjectName;
        }

        public DescribeVerifySearchPageListResponseBodyItemsExtInfo setOssObjectName(String ossObjectName) {
            this.ossObjectName = ossObjectName;
            return this;
        }
        public String getOssObjectName() {
            return this.ossObjectName;
        }

        public DescribeVerifySearchPageListResponseBodyItemsExtInfo setQualityScore(Float qualityScore) {
            this.qualityScore = qualityScore;
            return this;
        }
        public Float getQualityScore() {
            return this.qualityScore;
        }

        public DescribeVerifySearchPageListResponseBodyItemsExtInfo setVerifyScore(Float verifyScore) {
            this.verifyScore = verifyScore;
            return this;
        }
        public Float getVerifyScore() {
            return this.verifyScore;
        }

        public DescribeVerifySearchPageListResponseBodyItemsExtInfo setAsrTexts(java.util.List<String> asrTexts) {
            this.asrTexts = asrTexts;
            return this;
        }
        public java.util.List<String> getAsrTexts() {
            return this.asrTexts;
        }

        public DescribeVerifySearchPageListResponseBodyItemsExtInfo setScreenVideoObjectNames(java.util.List<String> screenVideoObjectNames) {
            this.screenVideoObjectNames = screenVideoObjectNames;
            return this;
        }
        public java.util.List<String> getScreenVideoObjectNames() {
            return this.screenVideoObjectNames;
        }

        public DescribeVerifySearchPageListResponseBodyItemsExtInfo setVoiceObjectNames(java.util.List<String> voiceObjectNames) {
            this.voiceObjectNames = voiceObjectNames;
            return this;
        }
        public java.util.List<String> getVoiceObjectNames() {
            return this.voiceObjectNames;
        }

    }

    public static class DescribeVerifySearchPageListResponseBodyItems extends TeaModel {
        /**
         * <p>The desensitized ID card number.</p>
         * 
         * <strong>example:</strong>
         * <p>3****************2</p>
         */
        @NameInMap("CertNo")
        public String certNo;

        /**
         * <p>The certification ID.</p>
         * 
         * <strong>example:</strong>
         * <p>shad861465f2aaeeb805b519e1a93ab2</p>
         */
        @NameInMap("CertifyId")
        public String certifyId;

        /**
         * <p>The extended information.</p>
         */
        @NameInMap("ExtInfo")
        public DescribeVerifySearchPageListResponseBodyItemsExtInfo extInfo;

        /**
         * <p>The verification time of this authentication record.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-14 15:40:13</p>
         */
        @NameInMap("GmtVerify")
        public String gmtVerify;

        /**
         * <p>The liveness detection scheme.</p>
         * 
         * <strong>example:</strong>
         * <p>MULTI_ACTION</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>The unique identifier for the customer request.</p>
         * 
         * <strong>example:</strong>
         * <p>e0c34a77f5ac40a5aa5e6ed20c353888</p>
         */
        @NameInMap("OuterOrderNo")
        public String outerOrderNo;

        /**
         * <p>Specifies whether the authentication passed. Valid values:</p>
         * <ul>
         * <li><strong>T</strong>: Passed.</li>
         * <li><strong>F</strong>: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>T</p>
         */
        @NameInMap("Passed")
        public String passed;

        /**
         * <p>The product code.</p>
         * 
         * <strong>example:</strong>
         * <p>ID_PRO</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The business scenario risk:</p>
         * <ul>
         * <li><strong>0</strong>: No risk.</li>
         * <li><strong>1</strong>: Risk detected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskBizScenario")
        public Integer riskBizScenario;

        /**
         * <p>The device risk:</p>
         * <ul>
         * <li><strong>0</strong>: No risk.</li>
         * <li><strong>1</strong>: Risk detected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskDevice")
        public Integer riskDevice;

        /**
         * <p>The DeviceToken risk:</p>
         * <ul>
         * <li><strong>0</strong>: No risk.</li>
         * <li><strong>1</strong>: Risk detected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RiskDeviceToken")
        public Integer riskDeviceToken;

        /**
         * <p>The generic risk:</p>
         * <ul>
         * <li><strong>0</strong>: No risk.</li>
         * <li><strong>1</strong>: Risk detected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskGeneric")
        public Integer riskGeneric;

        /**
         * <p>The large model mining risk:</p>
         * <ul>
         * <li><strong>0</strong>: No risk.</li>
         * <li><strong>1</strong>: Risk detected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskModelMining")
        public Integer riskModelMining;

        /**
         * <p>Specifies whether the device is rooted. Set to 1 if selected; otherwise, do not pass this parameter. This parameter corresponds to the identity tag risk type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Root")
        public Integer root;

        /**
         * <p>The scene ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1000015352</p>
         */
        @NameInMap("SceneId")
        public Long sceneId;

        /**
         * <p>Specifies whether the device is a simulator. Set to 1 if selected; otherwise, do not pass this parameter. This parameter corresponds to the device tag risk type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Simulator")
        public Integer simulator;

        /**
         * <p>The error code returned by the system.</p>
         * 
         * <strong>example:</strong>
         * <p>207</p>
         */
        @NameInMap("SubCode")
        public String subCode;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>198123xxxxxx</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>Specifies whether virtual video is used. Set to 1 if selected; otherwise, do not pass this parameter. This parameter corresponds to the behavior tag risk type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("VirtualVideo")
        public Integer virtualVideo;

        public static DescribeVerifySearchPageListResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifySearchPageListResponseBodyItems self = new DescribeVerifySearchPageListResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeVerifySearchPageListResponseBodyItems setCertNo(String certNo) {
            this.certNo = certNo;
            return this;
        }
        public String getCertNo() {
            return this.certNo;
        }

        public DescribeVerifySearchPageListResponseBodyItems setCertifyId(String certifyId) {
            this.certifyId = certifyId;
            return this;
        }
        public String getCertifyId() {
            return this.certifyId;
        }

        public DescribeVerifySearchPageListResponseBodyItems setExtInfo(DescribeVerifySearchPageListResponseBodyItemsExtInfo extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public DescribeVerifySearchPageListResponseBodyItemsExtInfo getExtInfo() {
            return this.extInfo;
        }

        public DescribeVerifySearchPageListResponseBodyItems setGmtVerify(String gmtVerify) {
            this.gmtVerify = gmtVerify;
            return this;
        }
        public String getGmtVerify() {
            return this.gmtVerify;
        }

        public DescribeVerifySearchPageListResponseBodyItems setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public DescribeVerifySearchPageListResponseBodyItems setOuterOrderNo(String outerOrderNo) {
            this.outerOrderNo = outerOrderNo;
            return this;
        }
        public String getOuterOrderNo() {
            return this.outerOrderNo;
        }

        public DescribeVerifySearchPageListResponseBodyItems setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

        public DescribeVerifySearchPageListResponseBodyItems setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeVerifySearchPageListResponseBodyItems setRiskBizScenario(Integer riskBizScenario) {
            this.riskBizScenario = riskBizScenario;
            return this;
        }
        public Integer getRiskBizScenario() {
            return this.riskBizScenario;
        }

        public DescribeVerifySearchPageListResponseBodyItems setRiskDevice(Integer riskDevice) {
            this.riskDevice = riskDevice;
            return this;
        }
        public Integer getRiskDevice() {
            return this.riskDevice;
        }

        public DescribeVerifySearchPageListResponseBodyItems setRiskDeviceToken(Integer riskDeviceToken) {
            this.riskDeviceToken = riskDeviceToken;
            return this;
        }
        public Integer getRiskDeviceToken() {
            return this.riskDeviceToken;
        }

        public DescribeVerifySearchPageListResponseBodyItems setRiskGeneric(Integer riskGeneric) {
            this.riskGeneric = riskGeneric;
            return this;
        }
        public Integer getRiskGeneric() {
            return this.riskGeneric;
        }

        public DescribeVerifySearchPageListResponseBodyItems setRiskModelMining(Integer riskModelMining) {
            this.riskModelMining = riskModelMining;
            return this;
        }
        public Integer getRiskModelMining() {
            return this.riskModelMining;
        }

        public DescribeVerifySearchPageListResponseBodyItems setRoot(Integer root) {
            this.root = root;
            return this;
        }
        public Integer getRoot() {
            return this.root;
        }

        public DescribeVerifySearchPageListResponseBodyItems setSceneId(Long sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public Long getSceneId() {
            return this.sceneId;
        }

        public DescribeVerifySearchPageListResponseBodyItems setSimulator(Integer simulator) {
            this.simulator = simulator;
            return this;
        }
        public Integer getSimulator() {
            return this.simulator;
        }

        public DescribeVerifySearchPageListResponseBodyItems setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

        public DescribeVerifySearchPageListResponseBodyItems setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeVerifySearchPageListResponseBodyItems setVirtualVideo(Integer virtualVideo) {
            this.virtualVideo = virtualVideo;
            return this;
        }
        public Integer getVirtualVideo() {
            return this.virtualVideo;
        }

    }

}
