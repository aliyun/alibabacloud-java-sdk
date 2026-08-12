// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListRiskItemsRequest extends TeaModel {
    /**
     * <p>The current page number in a paging query. Valid values: 1 to 10000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries per page in a paging query. Valid values: 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the risk analysis policy. Fuzzy matching is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Remote logon risk analysis policy</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>The risk category. Valid values:</p>
     * <ul>
     * <li><code>data_safe</code>: data security.</li>
     * <li><code>identify_safe</code>: identity security.</li>
     * <li><code>device_safe</code>: device security.</li>
     * <li><code>access_safe</code>: access security.</li>
     * <li><code>ai_agent_safe</code>: Agent security.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>identify_safe</p>
     */
    @NameInMap("RiskCategory")
    public String riskCategory;

    /**
     * <p>The risk event ID. If specified, the system performs an exact query for the specified risk event.</p>
     * 
     * <strong>example:</strong>
     * <p>69ef648034cf53d7bac7a9c9c912****</p>
     */
    @NameInMap("RiskId")
    public String riskId;

    /**
     * <p>The risk level. Valid values:</p>
     * <ul>
     * <li><code>High</code>: high risk.</li>
     * <li><code>Medium</code>: medium risk.</li>
     * <li><code>Low</code>: low risk.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>High</p>
     */
    @NameInMap("RiskLevel")
    public String riskLevel;

    /**
     * <p>The risk scenario. Valid values:</p>
     * <ul>
     * <li><code>account_share</code>: account sharing.</li>
     * <li><code>account_stolen</code>: account theft.</li>
     * <li><code>device_share</code>: device sharing.</li>
     * <li><code>remote_logon</code>: remote logon.</li>
     * <li><code>sensitive_data_leakage</code>: sensitive data exfiltration.</li>
     * <li><code>lateral_scanning</code>: lateral scanning.</li>
     * <li><code>ai_skill_malware</code>: malicious Skill.</li>
     * <li><code>ai_config_check</code>: AI configuration check.</li>
     * <li><code>openclaw_vulnerability</code>: OpenClaw vulnerability.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>account_stolen</p>
     */
    @NameInMap("RiskScene")
    public String riskScene;

    /**
     * <p>The disposition status of the risk event. This parameter cannot be used together with <code>StatusList</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Unprocess</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The list of disposition statuses of risk events, in Flat serialization format. This parameter cannot be used together with Status.</p>
     */
    @NameInMap("StatusList")
    public java.util.List<String> statusList;

    /**
     * <p>The username associated with the risk event. Fuzzy matching is supported. Maximum length: 128 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>zhang***</p>
     */
    @NameInMap("Username")
    public String username;

    public static ListRiskItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRiskItemsRequest self = new ListRiskItemsRequest();
        return TeaModel.build(map, self);
    }

    public ListRiskItemsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListRiskItemsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRiskItemsRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public ListRiskItemsRequest setRiskCategory(String riskCategory) {
        this.riskCategory = riskCategory;
        return this;
    }
    public String getRiskCategory() {
        return this.riskCategory;
    }

    public ListRiskItemsRequest setRiskId(String riskId) {
        this.riskId = riskId;
        return this;
    }
    public String getRiskId() {
        return this.riskId;
    }

    public ListRiskItemsRequest setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public ListRiskItemsRequest setRiskScene(String riskScene) {
        this.riskScene = riskScene;
        return this;
    }
    public String getRiskScene() {
        return this.riskScene;
    }

    public ListRiskItemsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListRiskItemsRequest setStatusList(java.util.List<String> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

    public ListRiskItemsRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
