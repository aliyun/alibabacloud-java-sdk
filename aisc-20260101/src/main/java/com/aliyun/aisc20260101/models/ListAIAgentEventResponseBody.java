// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class ListAIAgentEventResponseBody extends TeaModel {
    /**
     * <p>The list of event information returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListAIAgentEventResponseBodyData> data;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListAIAgentEventResponseBodyPageInfo pageInfo;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>9FDE3D6F-26BD-5937-B0E5-8F47962B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAIAgentEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAIAgentEventResponseBody self = new ListAIAgentEventResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAIAgentEventResponseBody setData(java.util.List<ListAIAgentEventResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAIAgentEventResponseBodyData> getData() {
        return this.data;
    }

    public ListAIAgentEventResponseBody setPageInfo(ListAIAgentEventResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListAIAgentEventResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListAIAgentEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAIAgentEventResponseBodyData extends TeaModel {
        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5zuzvcfe</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>prod-chagee-bc-activity-elespin</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The asset name.</p>
         * 
         * <strong>example:</strong>
         * <p>25.2.2.83</p>
         */
        @NameInMap("AssetName")
        public String assetName;

        /**
         * <p>The type of the risky asset. Valid values:</p>
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
         * <p>tool</p>
         */
        @NameInMap("AssetType")
        public String assetType;

        /**
         * <p>The check time.</p>
         * 
         * <strong>example:</strong>
         * <p>1763949968</p>
         */
        @NameInMap("CheckTime")
        public String checkTime;

        /**
         * <p>The event handling time.</p>
         * 
         * <strong>example:</strong>
         * <p>1763949968</p>
         */
        @NameInMap("HandleTime")
        public String handleTime;

        /**
         * <p>The primary key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>17616</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The infrastructure instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-test</p>
         */
        @NameInMap("InfraInstanceId")
        public String infraInstanceId;

        /**
         * <p>The public IP address of the infrastructure.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.3.4</p>
         */
        @NameInMap("InfraInternetIp")
        public String infraInternetIp;

        /**
         * <p>The private IP address of the infrastructure.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.3</p>
         */
        @NameInMap("InfraIntranetIp")
        public String infraIntranetIp;

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
         * <p>The infrastructure type.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("InfraType")
        public String infraType;

        /**
         * <p>The risk description.</p>
         * 
         * <strong>example:</strong>
         * <p>The workflow does not have AI security guardrails enabled, which may lead to compliance violations, prompt injection and bypass, sensitive data leaks, and other risks</p>
         */
        @NameInMap("RiskDesc")
        public String riskDesc;

        /**
         * <p>The risk level of the detected alert. Valid values:</p>
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
         * <p>The risk name.</p>
         * 
         * <strong>example:</strong>
         * <p>Weak password</p>
         */
        @NameInMap("RiskName")
        public String riskName;

        @NameInMap("SkillId")
        public Long skillId;

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
         * <p>SASE</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The status. Valid values:</p>
         * <ol>
         * <li>unhandled: Pending.</li>
         * <li>handling: Being processed.</li>
         * <li>fixed: Fixed.</li>
         * <li>ignored: Ignored.</li>
         * <li>rescanned: Rescanned.</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>unhandled</p>
         */
        @NameInMap("Status")
        public String status;

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

        public static ListAIAgentEventResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAIAgentEventResponseBodyData self = new ListAIAgentEventResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAIAgentEventResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListAIAgentEventResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListAIAgentEventResponseBodyData setAssetName(String assetName) {
            this.assetName = assetName;
            return this;
        }
        public String getAssetName() {
            return this.assetName;
        }

        public ListAIAgentEventResponseBodyData setAssetType(String assetType) {
            this.assetType = assetType;
            return this;
        }
        public String getAssetType() {
            return this.assetType;
        }

        public ListAIAgentEventResponseBodyData setCheckTime(String checkTime) {
            this.checkTime = checkTime;
            return this;
        }
        public String getCheckTime() {
            return this.checkTime;
        }

        public ListAIAgentEventResponseBodyData setHandleTime(String handleTime) {
            this.handleTime = handleTime;
            return this;
        }
        public String getHandleTime() {
            return this.handleTime;
        }

        public ListAIAgentEventResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListAIAgentEventResponseBodyData setInfraInstanceId(String infraInstanceId) {
            this.infraInstanceId = infraInstanceId;
            return this;
        }
        public String getInfraInstanceId() {
            return this.infraInstanceId;
        }

        public ListAIAgentEventResponseBodyData setInfraInternetIp(String infraInternetIp) {
            this.infraInternetIp = infraInternetIp;
            return this;
        }
        public String getInfraInternetIp() {
            return this.infraInternetIp;
        }

        public ListAIAgentEventResponseBodyData setInfraIntranetIp(String infraIntranetIp) {
            this.infraIntranetIp = infraIntranetIp;
            return this;
        }
        public String getInfraIntranetIp() {
            return this.infraIntranetIp;
        }

        public ListAIAgentEventResponseBodyData setInfraName(String infraName) {
            this.infraName = infraName;
            return this;
        }
        public String getInfraName() {
            return this.infraName;
        }

        public ListAIAgentEventResponseBodyData setInfraRegionId(String infraRegionId) {
            this.infraRegionId = infraRegionId;
            return this;
        }
        public String getInfraRegionId() {
            return this.infraRegionId;
        }

        public ListAIAgentEventResponseBodyData setInfraType(String infraType) {
            this.infraType = infraType;
            return this;
        }
        public String getInfraType() {
            return this.infraType;
        }

        public ListAIAgentEventResponseBodyData setRiskDesc(String riskDesc) {
            this.riskDesc = riskDesc;
            return this;
        }
        public String getRiskDesc() {
            return this.riskDesc;
        }

        public ListAIAgentEventResponseBodyData setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public ListAIAgentEventResponseBodyData setRiskName(String riskName) {
            this.riskName = riskName;
            return this;
        }
        public String getRiskName() {
            return this.riskName;
        }

        public ListAIAgentEventResponseBodyData setSkillId(Long skillId) {
            this.skillId = skillId;
            return this;
        }
        public Long getSkillId() {
            return this.skillId;
        }

        public ListAIAgentEventResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListAIAgentEventResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAIAgentEventResponseBodyData setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

    public static class ListAIAgentEventResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The NextToken value returned when the NextToken-based pagination method is used.</p>
         * 
         * <strong>example:</strong>
         * <p>d6yVpGGP9cH8f9AWtqEXqOawJdolFvFeqJJSIPnYLoGc7/XPd5nbDfZcn1mJCj66Ep3Gbr55tl4NuBtNwsc0A0qvqC2Onfm9h2QmtG8HhaulnPkGmBnhntKqJmpRptTU</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of records in the query result.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListAIAgentEventResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListAIAgentEventResponseBodyPageInfo self = new ListAIAgentEventResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListAIAgentEventResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListAIAgentEventResponseBodyPageInfo setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListAIAgentEventResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAIAgentEventResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
