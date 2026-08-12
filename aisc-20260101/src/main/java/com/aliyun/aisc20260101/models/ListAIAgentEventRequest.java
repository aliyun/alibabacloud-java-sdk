// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class ListAIAgentEventRequest extends TeaModel {
    /**
     * <p>The ID of the agent application.</p>
     * 
     * <strong>example:</strong>
     * <p>99f30e6b-8374-4a45-8830-439f178c5463</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>Filters the agent list by application name.</p>
     * 
     * <strong>example:</strong>
     * <p>erH</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The asset name.</p>
     * 
     * <strong>example:</strong>
     * <p>13.115.192.70</p>
     */
    @NameInMap("AssetName")
    public String assetName;

    /**
     * <p>The type of the agent asset. Valid values:</p>
     * <ol>
     * <li>rag</li>
     * <li>internet</li>
     * <li>datasets</li>
     * <li>tool</li>
     * <li>model</li>
     * <li>skill</li>
     * <li>app</li>
     * <li>identity</li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>identity</p>
     */
    @NameInMap("AssetType")
    public String assetType;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The infrastructure instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i-test</p>
     */
    @NameInMap("InfraInstanceId")
    public String infraInstanceId;

    /**
     * <p>The infrastructure name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("InfraName")
    public String infraName;

    /**
     * <p>The infrastructure region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("InfraRegionId")
    public String infraRegionId;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The risk level of the check item to query. Valid values:</p>
     * <ul>
     * <li><strong>high</strong>: High.</li>
     * <li><strong>medium</strong>: Medium.</li>
     * <li><strong>low</strong>: Low.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>high</p>
     */
    @NameInMap("RiskLevel")
    public String riskLevel;

    /**
     * <p>The risk name. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>defense</p>
     */
    @NameInMap("RiskName")
    public String riskName;

    /**
     * <p>The event source. Valid values:</p>
     * <ol>
     * <li>cspm</li>
     * <li>aiguard</li>
     * <li>SASE</li>
     * <li>SAS </li>
     * <li>Agent-Runtime-Guard</li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>CSPM</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The event status. Valid values:</p>
     * <ol>
     * <li>unhandled: Pending.</li>
     * <li>handling: Being processed.</li>
     * <li>fixed: Fixed.</li>
     * <li>ignored: Ignored.</li>
     * <li>rescanned: Rescanned.</li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>fixed</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The list of statuses.</p>
     */
    @NameInMap("StatusList")
    public java.util.List<String> statusList;

    /**
     * <p>The cloud asset vendor. Valid values:</p>
     * <ul>
     * <li><strong>DIFY</strong>: DIFY.</li>
     * <li><strong>BAILIAN</strong>: BAILIAN.</li>
     * <li><strong>VOLCAI</strong>: VOLCAI.</li>
     * <li><strong>AGENTRUN</strong>: AGENTRUN.</li>
     * <li><strong>PAI</strong>: PAI.</li>
     * <li><strong>OpenClaw</strong>: OpenClaw.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DIFY</p>
     */
    @NameInMap("Vendor")
    public String vendor;

    public static ListAIAgentEventRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAIAgentEventRequest self = new ListAIAgentEventRequest();
        return TeaModel.build(map, self);
    }

    public ListAIAgentEventRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListAIAgentEventRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListAIAgentEventRequest setAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }
    public String getAssetName() {
        return this.assetName;
    }

    public ListAIAgentEventRequest setAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }
    public String getAssetType() {
        return this.assetType;
    }

    public ListAIAgentEventRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListAIAgentEventRequest setInfraInstanceId(String infraInstanceId) {
        this.infraInstanceId = infraInstanceId;
        return this;
    }
    public String getInfraInstanceId() {
        return this.infraInstanceId;
    }

    public ListAIAgentEventRequest setInfraName(String infraName) {
        this.infraName = infraName;
        return this;
    }
    public String getInfraName() {
        return this.infraName;
    }

    public ListAIAgentEventRequest setInfraRegionId(String infraRegionId) {
        this.infraRegionId = infraRegionId;
        return this;
    }
    public String getInfraRegionId() {
        return this.infraRegionId;
    }

    public ListAIAgentEventRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListAIAgentEventRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAIAgentEventRequest setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public ListAIAgentEventRequest setRiskName(String riskName) {
        this.riskName = riskName;
        return this;
    }
    public String getRiskName() {
        return this.riskName;
    }

    public ListAIAgentEventRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ListAIAgentEventRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListAIAgentEventRequest setStatusList(java.util.List<String> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

    public ListAIAgentEventRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
