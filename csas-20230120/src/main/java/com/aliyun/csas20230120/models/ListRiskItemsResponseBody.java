// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListRiskItemsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D6707286-A50E-57B1-B2CF-EFAC59E850D8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of risk events.</p>
     */
    @NameInMap("RiskItems")
    public java.util.List<ListRiskItemsResponseBodyRiskItems> riskItems;

    /**
     * <p>The total number of risk events that match the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalNum")
    public Integer totalNum;

    public static ListRiskItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRiskItemsResponseBody self = new ListRiskItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRiskItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRiskItemsResponseBody setRiskItems(java.util.List<ListRiskItemsResponseBodyRiskItems> riskItems) {
        this.riskItems = riskItems;
        return this;
    }
    public java.util.List<ListRiskItemsResponseBodyRiskItems> getRiskItems() {
        return this.riskItems;
    }

    public ListRiskItemsResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class ListRiskItemsResponseBodyRiskItems extends TeaModel {
        /**
         * <p>The name of the Agent that generated the risk event. An empty string is returned for non-Agent risk scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>qoder****</p>
         */
        @NameInMap("AgentName")
        public String agentName;

        /**
         * <p>The AI risk analysis conclusion.</p>
         * 
         * <strong>example:</strong>
         * <p>The account logged on from an unusual device, and the behavior is inconsistent with the historical baseline</p>
         */
        @NameInMap("AiConclusion")
        public String aiConclusion;

        /**
         * <p>The risk judgment provided by AI. An empty string is returned if no AI analysis result exists. Valid values:</p>
         * <ul>
         * <li><code>Risk</code>: determined as risky.</li>
         * <li><code>Ignore</code>: determined as not risky.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Risk</p>
         */
        @NameInMap("AiRiskConfirm")
        public String aiRiskConfirm;

        /**
         * <p>The name of the risk detection item.</p>
         * 
         * <strong>example:</strong>
         * <p>Unusual device logon check</p>
         */
        @NameInMap("CheckName")
        public String checkName;

        /**
         * <p>The department to which the user associated with the risk event belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>Department****</p>
         */
        @NameInMap("Department")
        public String department;

        /**
         * <p>The original organizational structure information of the user associated with the risk event.</p>
         * 
         * <strong>example:</strong>
         * <p>CN=zhang***,OU=Department****</p>
         */
        @NameInMap("GroupInfo")
        public String groupInfo;

        /**
         * <p>The name of the endpoint device associated with the risk event.</p>
         * 
         * <strong>example:</strong>
         * <p>U-2GW2L4M7-****</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <p>The internal IP address of the endpoint associated with the risk event.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("InnerIp")
        public String innerIp;

        /**
         * <p>The risk detection report or risk evidence.</p>
         * 
         * <strong>example:</strong>
         * <p>The account logged on from a new device, and the logon location is inconsistent with the usual location</p>
         */
        @NameInMap("Report")
        public String report;

        /**
         * <p>The list of risk analysis policy names that were hit.</p>
         */
        @NameInMap("RiskAnalysisPolicyNames")
        public java.util.List<String> riskAnalysisPolicyNames;

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
         * <p>The manually confirmed risk conclusion. An empty string is returned if the event has not been confirmed. Valid values:</p>
         * <ul>
         * <li><code>Risk</code>: confirmed as risky.</li>
         * <li><code>Ignore</code>: confirmed as not risky.</li>
         * <li><code>Invalid</code>: confirmed as a false positive.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Risk</p>
         */
        @NameInMap("RiskConfirm")
        public String riskConfirm;

        /**
         * <p>The description of the risk event disposition.</p>
         * 
         * <strong>example:</strong>
         * <p>Upon investigation, the logon was not authorized by the user</p>
         */
        @NameInMap("RiskConfirmDesc")
        public String riskConfirmDesc;

        /**
         * <p>The risk description.</p>
         * 
         * <strong>example:</strong>
         * <p>The account logged on from an unusual device</p>
         */
        @NameInMap("RiskDesc")
        public String riskDesc;

        /**
         * <p>The end time of the risky behavior, in the format of <code>yyyy-MM-dd HH:mm:ss</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-21 05:21:00</p>
         */
        @NameInMap("RiskEndTime")
        public String riskEndTime;

        /**
         * <p>The list of detection feature or detection item identifiers that triggered the risk event. A risk event may hit multiple identifiers. The specific values vary based on the risk scenario and detection rules.</p>
         */
        @NameInMap("RiskFeatureIds")
        public java.util.List<String> riskFeatureIds;

        /**
         * <p>The time when the risk was detected, in the format of <code>yyyy-MM-dd HH:mm:ss</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-20 10:30:00</p>
         */
        @NameInMap("RiskFoundTime")
        public String riskFoundTime;

        /**
         * <p>The risk event ID.</p>
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
         * <p>The start time of the risky behavior, in the format of <code>yyyy-MM-dd HH:mm:ss</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-20 05:20:00</p>
         */
        @NameInMap("RiskStartTime")
        public String riskStartTime;

        /**
         * <p>The SASE user ID associated with the risk event.</p>
         * 
         * <strong>example:</strong>
         * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
         */
        @NameInMap("SaseUserId")
        public String saseUserId;

        /**
         * <p>The name of the Agent Skill that generated the risk event. An empty string is returned for non-Agent risk scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>frontend-design</p>
         */
        @NameInMap("SkillName")
        public String skillName;

        /**
         * <p>The recommended remediation action for the risk event.</p>
         * 
         * <strong>example:</strong>
         * <p>Verify the account user and freeze the account or reset credentials based on the investigation results</p>
         */
        @NameInMap("Solution")
        public String solution;

        /**
         * <p>The disposition status of the risk event. Valid values:</p>
         * <ul>
         * <li><code>Unprocess</code>: unprocessed.</li>
         * <li><code>Processing</code>: being processed.</li>
         * <li><code>Processed</code>: processed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Unprocess</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Indicates whether AI risk analysis results exist. Valid values:</p>
         * <ul>
         * <li><code>true</code>: AI risk analysis results exist.</li>
         * <li><code>false</code>: AI risk analysis results do not exist.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportAnalysis")
        public Boolean supportAnalysis;

        /**
         * <p>The username associated with the risk event.</p>
         * 
         * <strong>example:</strong>
         * <p>zhang***</p>
         */
        @NameInMap("Username")
        public String username;

        public static ListRiskItemsResponseBodyRiskItems build(java.util.Map<String, ?> map) throws Exception {
            ListRiskItemsResponseBodyRiskItems self = new ListRiskItemsResponseBodyRiskItems();
            return TeaModel.build(map, self);
        }

        public ListRiskItemsResponseBodyRiskItems setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public ListRiskItemsResponseBodyRiskItems setAiConclusion(String aiConclusion) {
            this.aiConclusion = aiConclusion;
            return this;
        }
        public String getAiConclusion() {
            return this.aiConclusion;
        }

        public ListRiskItemsResponseBodyRiskItems setAiRiskConfirm(String aiRiskConfirm) {
            this.aiRiskConfirm = aiRiskConfirm;
            return this;
        }
        public String getAiRiskConfirm() {
            return this.aiRiskConfirm;
        }

        public ListRiskItemsResponseBodyRiskItems setCheckName(String checkName) {
            this.checkName = checkName;
            return this;
        }
        public String getCheckName() {
            return this.checkName;
        }

        public ListRiskItemsResponseBodyRiskItems setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public ListRiskItemsResponseBodyRiskItems setGroupInfo(String groupInfo) {
            this.groupInfo = groupInfo;
            return this;
        }
        public String getGroupInfo() {
            return this.groupInfo;
        }

        public ListRiskItemsResponseBodyRiskItems setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public ListRiskItemsResponseBodyRiskItems setInnerIp(String innerIp) {
            this.innerIp = innerIp;
            return this;
        }
        public String getInnerIp() {
            return this.innerIp;
        }

        public ListRiskItemsResponseBodyRiskItems setReport(String report) {
            this.report = report;
            return this;
        }
        public String getReport() {
            return this.report;
        }

        public ListRiskItemsResponseBodyRiskItems setRiskAnalysisPolicyNames(java.util.List<String> riskAnalysisPolicyNames) {
            this.riskAnalysisPolicyNames = riskAnalysisPolicyNames;
            return this;
        }
        public java.util.List<String> getRiskAnalysisPolicyNames() {
            return this.riskAnalysisPolicyNames;
        }

        public ListRiskItemsResponseBodyRiskItems setRiskCategory(String riskCategory) {
            this.riskCategory = riskCategory;
            return this;
        }
        public String getRiskCategory() {
            return this.riskCategory;
        }

        public ListRiskItemsResponseBodyRiskItems setRiskConfirm(String riskConfirm) {
            this.riskConfirm = riskConfirm;
            return this;
        }
        public String getRiskConfirm() {
            return this.riskConfirm;
        }

        public ListRiskItemsResponseBodyRiskItems setRiskConfirmDesc(String riskConfirmDesc) {
            this.riskConfirmDesc = riskConfirmDesc;
            return this;
        }
        public String getRiskConfirmDesc() {
            return this.riskConfirmDesc;
        }

        public ListRiskItemsResponseBodyRiskItems setRiskDesc(String riskDesc) {
            this.riskDesc = riskDesc;
            return this;
        }
        public String getRiskDesc() {
            return this.riskDesc;
        }

        public ListRiskItemsResponseBodyRiskItems setRiskEndTime(String riskEndTime) {
            this.riskEndTime = riskEndTime;
            return this;
        }
        public String getRiskEndTime() {
            return this.riskEndTime;
        }

        public ListRiskItemsResponseBodyRiskItems setRiskFeatureIds(java.util.List<String> riskFeatureIds) {
            this.riskFeatureIds = riskFeatureIds;
            return this;
        }
        public java.util.List<String> getRiskFeatureIds() {
            return this.riskFeatureIds;
        }

        public ListRiskItemsResponseBodyRiskItems setRiskFoundTime(String riskFoundTime) {
            this.riskFoundTime = riskFoundTime;
            return this;
        }
        public String getRiskFoundTime() {
            return this.riskFoundTime;
        }

        public ListRiskItemsResponseBodyRiskItems setRiskId(String riskId) {
            this.riskId = riskId;
            return this;
        }
        public String getRiskId() {
            return this.riskId;
        }

        public ListRiskItemsResponseBodyRiskItems setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public ListRiskItemsResponseBodyRiskItems setRiskScene(String riskScene) {
            this.riskScene = riskScene;
            return this;
        }
        public String getRiskScene() {
            return this.riskScene;
        }

        public ListRiskItemsResponseBodyRiskItems setRiskStartTime(String riskStartTime) {
            this.riskStartTime = riskStartTime;
            return this;
        }
        public String getRiskStartTime() {
            return this.riskStartTime;
        }

        public ListRiskItemsResponseBodyRiskItems setSaseUserId(String saseUserId) {
            this.saseUserId = saseUserId;
            return this;
        }
        public String getSaseUserId() {
            return this.saseUserId;
        }

        public ListRiskItemsResponseBodyRiskItems setSkillName(String skillName) {
            this.skillName = skillName;
            return this;
        }
        public String getSkillName() {
            return this.skillName;
        }

        public ListRiskItemsResponseBodyRiskItems setSolution(String solution) {
            this.solution = solution;
            return this;
        }
        public String getSolution() {
            return this.solution;
        }

        public ListRiskItemsResponseBodyRiskItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListRiskItemsResponseBodyRiskItems setSupportAnalysis(Boolean supportAnalysis) {
            this.supportAnalysis = supportAnalysis;
            return this;
        }
        public Boolean getSupportAnalysis() {
            return this.supportAnalysis;
        }

        public ListRiskItemsResponseBodyRiskItems setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
