// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifySearchPageListResponseBody extends TeaModel {
    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Paged list data.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeVerifySearchPageListResponseBodyItems> items;

    /**
     * <p>Number of items per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>ID of this request.</p>
     * 
     * <strong>example:</strong>
     * <p>47D87BC1-D956-573A-8A15-A9007A76F56C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>53</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>Total number of pages.</p>
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
         * <p>Desensitized name.</p>
         * 
         * <strong>example:</strong>
         * <p>何*</p>
         */
        @NameInMap("CertName")
        public String certName;

        /**
         * <p>Face guard label.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("DeviceRisk")
        public String deviceRisk;

        /**
         * <p>Whether it is a face attack:</p>
         * <ul>
         * <li><strong>T</strong>: Yes</li>
         * <li><strong>F</strong>: No</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>T</p>
         */
        @NameInMap("FaceAttack")
        public String faceAttack;

        /**
         * <p>Face attack score, with a range of 0~1. A value closer to 1 indicates a higher likelihood of an attack.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0000445161</p>
         */
        @NameInMap("FaceAttackScore")
        public Float faceAttackScore;

        /**
         * <p>Whether the face is occluded, T if yes, F otherwise.</p>
         * 
         * <strong>example:</strong>
         * <p>T</p>
         */
        @NameInMap("FaceOcclusion")
        public String faceOcclusion;

        /**
         * <p>Face-to-ID card comparison score.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("IdCardVerifyScore")
        public Float idCardVerifyScore;

        /**
         * <p>The OSS bucket for the photo.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-aliyun-cloudauth-XXX</p>
         */
        @NameInMap("OssBucketName")
        public String ossBucketName;

        /**
         * <p>OCR ID card face file name.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("OssIdFaceObjectName")
        public String ossIdFaceObjectName;

        /**
         * <p>OCR ID card national emblem file name.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("OssIdNationalEmblemObjectName")
        public String ossIdNationalEmblemObjectName;

        /**
         * <p>The name of the stored object.</p>
         * 
         * <strong>example:</strong>
         * <p>verify/XXXXX1251634779/sha6a0a0cab01288c7aa8ac3f45220eb_0_normal.jpeg</p>
         */
        @NameInMap("OssObjectName")
        public String ossObjectName;

        /**
         * <p>Liveness face quality score.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("QualityScore")
        public Float qualityScore;

        /**
         * <p>Face comparison score.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("VerifyScore")
        public Float verifyScore;

        /**
         * <p>List of ASR texts.</p>
         */
        @NameInMap("asrTexts")
        public java.util.List<String> asrTexts;

        /**
         * <p>List of OSS file names for screen recording files.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("screenVideoObjectNames")
        public java.util.List<String> screenVideoObjectNames;

        /**
         * <p>List of OSS file names for audio files.</p>
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
         * <p>Desensitized ID number.</p>
         * 
         * <strong>example:</strong>
         * <p>3****************2</p>
         */
        @NameInMap("CertNo")
        public String certNo;

        /**
         * <p>Certification ID.</p>
         * 
         * <strong>example:</strong>
         * <p>shad861465f2aaeeb805b519e1a93ab2</p>
         */
        @NameInMap("CertifyId")
        public String certifyId;

        /**
         * <p>Extended information.</p>
         */
        @NameInMap("ExtInfo")
        public DescribeVerifySearchPageListResponseBodyItemsExtInfo extInfo;

        /**
         * <p>Verification time of this authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-14 15:40:13</p>
         */
        @NameInMap("GmtVerify")
        public String gmtVerify;

        /**
         * <p>Liveness detection scheme.</p>
         * 
         * <strong>example:</strong>
         * <p>MULTI_ACTION</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>Unique identifier for the customer request.</p>
         * 
         * <strong>example:</strong>
         * <p>e0c34a77f5ac40a5aa5e6ed20c353888</p>
         */
        @NameInMap("OuterOrderNo")
        public String outerOrderNo;

        /**
         * <p>Whether the certification passed. Values:</p>
         * <ul>
         * <li><strong>T</strong>: Passed.</li>
         * <li><strong>F</strong>: Not passed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>T</p>
         */
        @NameInMap("Passed")
        public String passed;

        /**
         * <p>Product code.</p>
         * 
         * <strong>example:</strong>
         * <p>ID_PRO</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("RiskBizScenario")
        public Integer riskBizScenario;

        @NameInMap("RiskDevice")
        public Integer riskDevice;

        @NameInMap("RiskDeviceToken")
        public Integer riskDeviceToken;

        @NameInMap("RiskGeneric")
        public Integer riskGeneric;

        @NameInMap("RiskModelMining")
        public Integer riskModelMining;

        /**
         * <p>Whether it is root (pass 1 if selected, otherwise do not pass; corresponds to identity label risk type).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Root")
        public Integer root;

        /**
         * <p>Scene ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1000015352</p>
         */
        @NameInMap("SceneId")
        public Long sceneId;

        /**
         * <p>Whether it is a simulator (pass 1 if selected, otherwise do not pass; corresponds to device label risk type).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Simulator")
        public Integer simulator;

        /**
         * <p>System returned error code.</p>
         * 
         * <strong>example:</strong>
         * <p>207</p>
         */
        @NameInMap("SubCode")
        public String subCode;

        /**
         * <p>User ID.</p>
         * 
         * <strong>example:</strong>
         * <p>198123xxxxxx</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>Whether it is a virtual adaptation (pass 1 if selected, otherwise do not pass; corresponds to behavior label risk type).</p>
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
