// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifySearchPageListRequest extends TeaModel {
    /**
     * <p>The ID card number.</p>
     * 
     * <strong>example:</strong>
     * <p>3203212000XXXX701X</p>
     */
    @NameInMap("CertNo")
    public String certNo;

    /**
     * <p>The authentication ID.</p>
     * 
     * <strong>example:</strong>
     * <p>shadbdd3dbacd001cfa892a5e2b98dxx</p>
     */
    @NameInMap("CertifyId")
    public String certifyId;

    /**
     * <p>The current page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The end time of the query. Format: YYYY-MM-DD HH:mm:ss, such as 2025-10-16 23:59:59.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-10-16 23:59:59</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>Specifies whether device risk exists. Set this parameter to true to indicate root = 1, simulator = 1, or virtual_video = 1.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasDeviceRisk")
    public Boolean hasDeviceRisk;

    /**
     * <p>The liveness detection model.</p>
     * 
     * <strong>example:</strong>
     * <p>LIVENESS</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>The unique identifier of the customer request.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c353888</p>
     */
    @NameInMap("OuterOrderNo")
    public String outerOrderNo;

    /**
     * <p>The number of entries per page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>Indicates whether the authentication is passed. Valid values:</p>
     * <ul>
     * <li><strong>T</strong>: Passed.</li>
     * <li><strong>F</strong>: Not passed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>F</p>
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
     * <p>The business scenario risk. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: No risk.</li>
     * <li><strong>1</strong>: Risk exists.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RiskBizScenario")
    public Integer riskBizScenario;

    /**
     * <p>The device risk. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: No risk.</li>
     * <li><strong>1</strong>: Risk exists.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RiskDevice")
    public Integer riskDevice;

    /**
     * <p>The DeviceToken risk. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: No risk.</li>
     * <li><strong>1</strong>: Risk exists.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RiskDeviceToken")
    public Integer riskDeviceToken;

    /**
     * <p>The generic risk. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: No risk.</li>
     * <li><strong>1</strong>: Risk exists.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RiskGeneric")
    public Integer riskGeneric;

    /**
     * <p>The large model mining risk. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: No risk.</li>
     * <li><strong>1</strong>: Risk exists.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RiskModelMining")
    public Integer riskModelMining;

    /**
     * <p>Specifies whether the device is rooted. Set this parameter to 1 if selected. Otherwise, do not pass this parameter. This corresponds to the identity tag risk type.</p>
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
     * <p>10000072xx</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    /**
     * <p>Specifies whether the device is a simulator. Set this parameter to 1 if selected. Otherwise, do not pass this parameter. This corresponds to the device tag risk type.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Simulator")
    public Integer simulator;

    /**
     * <p>The start time of the query. Format: YYYY-MM-DD HH:mm:ss, such as 2025-10-10 00:00:00.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-10-10 00:00:00</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The result code. For more information about valid values, see <a href="https://www.alibabacloud.com/help/en/id-verification/financial-grade-id-verification/error-code-person-verify#d88910e172fgg">SubCode description</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>201</p>
     */
    @NameInMap("SubCode")
    public String subCode;

    /**
     * <p>Comma-separated result codes. For more information about valid values, see <a href="https://www.alibabacloud.com/help/en/id-verification/financial-grade-id-verification/error-code-person-verify#d88910e172fgg">SubCode description</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>201,202</p>
     */
    @NameInMap("SubCodes")
    public String subCodes;

    /**
     * <p>Specifies whether virtual video adaptation is used. Set this parameter to 1 if selected. Otherwise, do not pass this parameter. This corresponds to the behavior tag risk type.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("VirtualVideo")
    public Integer virtualVideo;

    public static DescribeVerifySearchPageListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifySearchPageListRequest self = new DescribeVerifySearchPageListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVerifySearchPageListRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public DescribeVerifySearchPageListRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public DescribeVerifySearchPageListRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeVerifySearchPageListRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribeVerifySearchPageListRequest setHasDeviceRisk(Boolean hasDeviceRisk) {
        this.hasDeviceRisk = hasDeviceRisk;
        return this;
    }
    public Boolean getHasDeviceRisk() {
        return this.hasDeviceRisk;
    }

    public DescribeVerifySearchPageListRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public DescribeVerifySearchPageListRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public DescribeVerifySearchPageListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeVerifySearchPageListRequest setPassed(String passed) {
        this.passed = passed;
        return this;
    }
    public String getPassed() {
        return this.passed;
    }

    public DescribeVerifySearchPageListRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribeVerifySearchPageListRequest setRiskBizScenario(Integer riskBizScenario) {
        this.riskBizScenario = riskBizScenario;
        return this;
    }
    public Integer getRiskBizScenario() {
        return this.riskBizScenario;
    }

    public DescribeVerifySearchPageListRequest setRiskDevice(Integer riskDevice) {
        this.riskDevice = riskDevice;
        return this;
    }
    public Integer getRiskDevice() {
        return this.riskDevice;
    }

    public DescribeVerifySearchPageListRequest setRiskDeviceToken(Integer riskDeviceToken) {
        this.riskDeviceToken = riskDeviceToken;
        return this;
    }
    public Integer getRiskDeviceToken() {
        return this.riskDeviceToken;
    }

    public DescribeVerifySearchPageListRequest setRiskGeneric(Integer riskGeneric) {
        this.riskGeneric = riskGeneric;
        return this;
    }
    public Integer getRiskGeneric() {
        return this.riskGeneric;
    }

    public DescribeVerifySearchPageListRequest setRiskModelMining(Integer riskModelMining) {
        this.riskModelMining = riskModelMining;
        return this;
    }
    public Integer getRiskModelMining() {
        return this.riskModelMining;
    }

    public DescribeVerifySearchPageListRequest setRoot(Integer root) {
        this.root = root;
        return this;
    }
    public Integer getRoot() {
        return this.root;
    }

    public DescribeVerifySearchPageListRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public DescribeVerifySearchPageListRequest setSimulator(Integer simulator) {
        this.simulator = simulator;
        return this;
    }
    public Integer getSimulator() {
        return this.simulator;
    }

    public DescribeVerifySearchPageListRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public DescribeVerifySearchPageListRequest setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public DescribeVerifySearchPageListRequest setSubCodes(String subCodes) {
        this.subCodes = subCodes;
        return this;
    }
    public String getSubCodes() {
        return this.subCodes;
    }

    public DescribeVerifySearchPageListRequest setVirtualVideo(Integer virtualVideo) {
        this.virtualVideo = virtualVideo;
        return this;
    }
    public Integer getVirtualVideo() {
        return this.virtualVideo;
    }

}
