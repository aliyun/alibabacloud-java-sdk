// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class ListSubTasksResponseBody extends TeaModel {
    /**
     * <p>The list of task results.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListSubTasksResponseBodyData> data;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListSubTasksResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9FDE3D6F-26BD-5937-B0E5-8F47962B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListSubTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSubTasksResponseBody self = new ListSubTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSubTasksResponseBody setData(java.util.List<ListSubTasksResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSubTasksResponseBodyData> getData() {
        return this.data;
    }

    public ListSubTasksResponseBody setPageInfo(ListSubTasksResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListSubTasksResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListSubTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultAssetScan extends TeaModel {
        /**
         * <p>The result description of the check item, such as the cause of failure, the cause of skipping, or the ID of the delivered policy.</p>
         * 
         * <strong>example:</strong>
         * <p>dispatched</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The progress percentage of the check item. Valid values: 0 to 100. This field is not used in the current version.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percent")
        public Integer percent;

        /**
         * <p>The status of the check item. Valid values: init, running, success, failed, timeout, and skipped.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the policy corresponding to the check item. This field is used only by health check items.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("StrategyId")
        public Long strategyId;

        public static ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultAssetScan build(java.util.Map<String, ?> map) throws Exception {
            ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultAssetScan self = new ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultAssetScan();
            return TeaModel.build(map, self);
        }

        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultAssetScan setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultAssetScan setPercent(Integer percent) {
            this.percent = percent;
            return this;
        }
        public Integer getPercent() {
            return this.percent;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultAssetScan setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultAssetScan setStrategyId(Long strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public Long getStrategyId() {
            return this.strategyId;
        }

    }

    public static class ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultHealthCheck extends TeaModel {
        /**
         * <p>The result description of the check item, such as the cause of failure, the cause of skipping, or the ID of the delivered policy.</p>
         * 
         * <strong>example:</strong>
         * <p>strategyId=1001</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The progress percentage of the check item. Valid values: 0 to 100. This field is not used in the current version.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percent")
        public Integer percent;

        /**
         * <p>The status of the check item. Valid values: init, running, success, failed, timeout, and skipped.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the policy corresponding to the check item. This field is used only by health check items.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("StrategyId")
        public Long strategyId;

        public static ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultHealthCheck build(java.util.Map<String, ?> map) throws Exception {
            ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultHealthCheck self = new ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultHealthCheck();
            return TeaModel.build(map, self);
        }

        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultHealthCheck setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultHealthCheck setPercent(Integer percent) {
            this.percent = percent;
            return this;
        }
        public Integer getPercent() {
            return this.percent;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultHealthCheck setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultHealthCheck setStrategyId(Long strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public Long getStrategyId() {
            return this.strategyId;
        }

    }

    public static class ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultMcpCheck extends TeaModel {
        /**
         * <p>The result description of the check item, such as the cause of failure, the cause of skipping, or the ID of the delivered policy.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp check task created, detector not implemented yet</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The progress percentage of the check item. Valid values: 0 to 100. This field is not used in the current version.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percent")
        public Integer percent;

        /**
         * <p>The status of the check item. Valid values: init, running, success, failed, timeout, and skipped.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the policy corresponding to the check item. This field is used only by health check items.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("StrategyId")
        public Long strategyId;

        public static ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultMcpCheck build(java.util.Map<String, ?> map) throws Exception {
            ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultMcpCheck self = new ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultMcpCheck();
            return TeaModel.build(map, self);
        }

        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultMcpCheck setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultMcpCheck setPercent(Integer percent) {
            this.percent = percent;
            return this;
        }
        public Integer getPercent() {
            return this.percent;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultMcpCheck setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultMcpCheck setStrategyId(Long strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public Long getStrategyId() {
            return this.strategyId;
        }

    }

    public static class ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultMemoryCheck extends TeaModel {
        /**
         * <p>The result description of the check item, such as the cause of failure, the cause of skipping, or the ID of the delivered policy.</p>
         * 
         * <strong>example:</strong>
         * <p>memory check task created, detector not implemented yet</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The progress percentage of the check item. Valid values: 0 to 100. This field is not used in the current version.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percent")
        public Integer percent;

        /**
         * <p>The status of the check item. Valid values: init, running, success, failed, timeout, and skipped.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the policy corresponding to the check item. This field is used only by health check items.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("StrategyId")
        public Long strategyId;

        public static ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultMemoryCheck build(java.util.Map<String, ?> map) throws Exception {
            ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultMemoryCheck self = new ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultMemoryCheck();
            return TeaModel.build(map, self);
        }

        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultMemoryCheck setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultMemoryCheck setPercent(Integer percent) {
            this.percent = percent;
            return this;
        }
        public Integer getPercent() {
            return this.percent;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultMemoryCheck setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultMemoryCheck setStrategyId(Long strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public Long getStrategyId() {
            return this.strategyId;
        }

    }

    public static class ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultSessionCheck extends TeaModel {
        /**
         * <p>The result description of the check item, such as the cause of failure, the cause of skipping, or the ID of the delivered policy.</p>
         * 
         * <strong>example:</strong>
         * <p>session check task created, detector not implemented yet</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The progress percentage of the check item. Valid values: 0 to 100. This field is not used in the current version.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percent")
        public Integer percent;

        /**
         * <p>The status of the check item. Valid values: init, running, success, failed, timeout, and skipped.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the policy corresponding to the check item. This field is used only by health check items.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("StrategyId")
        public Long strategyId;

        public static ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultSessionCheck build(java.util.Map<String, ?> map) throws Exception {
            ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultSessionCheck self = new ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultSessionCheck();
            return TeaModel.build(map, self);
        }

        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultSessionCheck setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultSessionCheck setPercent(Integer percent) {
            this.percent = percent;
            return this;
        }
        public Integer getPercent() {
            return this.percent;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultSessionCheck setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultSessionCheck setStrategyId(Long strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public Long getStrategyId() {
            return this.strategyId;
        }

    }

    public static class ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultSkillCheck extends TeaModel {
        /**
         * <p>The result description of the check item, such as the cause of failure, the cause of skipping, or the ID of the delivered policy.</p>
         * 
         * <strong>example:</strong>
         * <p>dispatched</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The progress percentage of the check item. Valid values: 0 to 100. This field is not used in the current version.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percent")
        public Integer percent;

        /**
         * <p>The status of the check item. Valid values: init, running, success, failed, timeout, and skipped.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the policy corresponding to the check item. This field is used only by health check items.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("StrategyId")
        public Long strategyId;

        public static ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultSkillCheck build(java.util.Map<String, ?> map) throws Exception {
            ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultSkillCheck self = new ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultSkillCheck();
            return TeaModel.build(map, self);
        }

        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultSkillCheck setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultSkillCheck setPercent(Integer percent) {
            this.percent = percent;
            return this;
        }
        public Integer getPercent() {
            return this.percent;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultSkillCheck setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultSkillCheck setStrategyId(Long strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public Long getStrategyId() {
            return this.strategyId;
        }

    }

    public static class ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultVulScan extends TeaModel {
        /**
         * <p>The result description of the check item, such as the cause of failure, the cause of skipping, or the ID of the delivered policy.</p>
         * 
         * <strong>example:</strong>
         * <p>submitted</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The progress percentage of the check item. Valid values: 0 to 100. This field is not used in the current version.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percent")
        public Integer percent;

        /**
         * <p>The status of the check item. Valid values: init, running, success, failed, timeout, and skipped.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the policy corresponding to the check item. This field is used only by health check items.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("StrategyId")
        public Long strategyId;

        public static ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultVulScan build(java.util.Map<String, ?> map) throws Exception {
            ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultVulScan self = new ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultVulScan();
            return TeaModel.build(map, self);
        }

        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultVulScan setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultVulScan setPercent(Integer percent) {
            this.percent = percent;
            return this;
        }
        public Integer getPercent() {
            return this.percent;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultVulScan setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultVulScan setStrategyId(Long strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public Long getStrategyId() {
            return this.strategyId;
        }

    }

    public static class ListSubTasksResponseBodyDataTaskResultMessageFullCheckResult extends TeaModel {
        /**
         * <p>The result of the asset scanning check item.</p>
         */
        @NameInMap("AssetScan")
        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultAssetScan assetScan;

        /**
         * <p>The result of the health check item.</p>
         */
        @NameInMap("HealthCheck")
        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultHealthCheck healthCheck;

        /**
         * <p>The result of the MCP check item. If the detector is not connected, the result defaults to success.</p>
         */
        @NameInMap("McpCheck")
        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultMcpCheck mcpCheck;

        /**
         * <p>The result of the memory check item. If the detector is not connected, the result defaults to success.</p>
         */
        @NameInMap("MemoryCheck")
        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultMemoryCheck memoryCheck;

        /**
         * <p>The result of the session check item. If the detector is not connected, the result defaults to success.</p>
         */
        @NameInMap("SessionCheck")
        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultSessionCheck sessionCheck;

        /**
         * <p>The result of the Skill file check item.</p>
         */
        @NameInMap("SkillCheck")
        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultSkillCheck skillCheck;

        /**
         * <p>The result of the vulnerability scanning check item.</p>
         */
        @NameInMap("VulScan")
        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultVulScan vulScan;

        public static ListSubTasksResponseBodyDataTaskResultMessageFullCheckResult build(java.util.Map<String, ?> map) throws Exception {
            ListSubTasksResponseBodyDataTaskResultMessageFullCheckResult self = new ListSubTasksResponseBodyDataTaskResultMessageFullCheckResult();
            return TeaModel.build(map, self);
        }

        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResult setAssetScan(ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultAssetScan assetScan) {
            this.assetScan = assetScan;
            return this;
        }
        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultAssetScan getAssetScan() {
            return this.assetScan;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResult setHealthCheck(ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultHealthCheck healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultHealthCheck getHealthCheck() {
            return this.healthCheck;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResult setMcpCheck(ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultMcpCheck mcpCheck) {
            this.mcpCheck = mcpCheck;
            return this;
        }
        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultMcpCheck getMcpCheck() {
            return this.mcpCheck;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResult setMemoryCheck(ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultMemoryCheck memoryCheck) {
            this.memoryCheck = memoryCheck;
            return this;
        }
        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultMemoryCheck getMemoryCheck() {
            return this.memoryCheck;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResult setSessionCheck(ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultSessionCheck sessionCheck) {
            this.sessionCheck = sessionCheck;
            return this;
        }
        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultSessionCheck getSessionCheck() {
            return this.sessionCheck;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResult setSkillCheck(ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultSkillCheck skillCheck) {
            this.skillCheck = skillCheck;
            return this;
        }
        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultSkillCheck getSkillCheck() {
            return this.skillCheck;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResult setVulScan(ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultVulScan vulScan) {
            this.vulScan = vulScan;
            return this;
        }
        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResultVulScan getVulScan() {
            return this.vulScan;
        }

    }

    public static class ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtConfigDetail extends TeaModel {
        /**
         * <p>The matched content.</p>
         * 
         * <strong>example:</strong>
         * <p>allowed-tools: Bash(agent-browser:*)</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>The skill configuration allows Bash execution via agent-browser:* pattern without requiring user confirmation. This enables potentially dangerous command execution through the browser automation CLI.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>Dangerous Tools Without Confirmation</p>
         */
        @NameInMap("ItemName")
        public String itemName;

        /**
         * <p>The line number of the matched content.</p>
         * 
         * <strong>example:</strong>
         * <p>2555</p>
         */
        @NameInMap("Line")
        public String line;

        public static ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtConfigDetail build(java.util.Map<String, ?> map) throws Exception {
            ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtConfigDetail self = new ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtConfigDetail();
            return TeaModel.build(map, self);
        }

        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtConfigDetail setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtConfigDetail setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtConfigDetail setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtConfigDetail setLine(String line) {
            this.line = line;
            return this;
        }
        public String getLine() {
            return this.line;
        }

    }

    public static class ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtConfig extends TeaModel {
        /**
         * <p>The list of risk details.</p>
         */
        @NameInMap("Detail")
        public java.util.List<ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtConfigDetail> detail;

        public static ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtConfig build(java.util.Map<String, ?> map) throws Exception {
            ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtConfig self = new ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtConfig();
            return TeaModel.build(map, self);
        }

        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtConfig setDetail(java.util.List<ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtConfigDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtConfigDetail> getDetail() {
            return this.detail;
        }

    }

    public static class ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtGuardrailDetailResult extends TeaModel {
        /**
         * <p>The confidence level. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <p>The result description.</p>
         * 
         * <strong>example:</strong>
         * <p>Suspicious attacks.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The label information.</p>
         * 
         * <strong>example:</strong>
         * <p>attack</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The risk level. Valid values:</p>
         * <ul>
         * <li><strong>high</strong>: High risk.</li>
         * <li><strong>medium</strong>: Medium risk.</li>
         * <li><strong>low</strong>: Low risk.</li>
         * <li><strong>none</strong>: No risk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("Level")
        public String level;

        public static ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtGuardrailDetailResult build(java.util.Map<String, ?> map) throws Exception {
            ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtGuardrailDetailResult self = new ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtGuardrailDetailResult();
            return TeaModel.build(map, self);
        }

        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtGuardrailDetailResult setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtGuardrailDetailResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtGuardrailDetailResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtGuardrailDetailResult setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtGuardrailDetail extends TeaModel {
        /**
         * <p>The risk level. Valid values:</p>
         * <ul>
         * <li><strong>high</strong>: High risk.</li>
         * <li><strong>medium</strong>: Medium risk.</li>
         * <li><strong>low</strong>: Low risk.</li>
         * <li><strong>none</strong>: No risk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The list of result details.</p>
         */
        @NameInMap("Result")
        public java.util.List<ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtGuardrailDetailResult> result;

        /**
         * <p>The handling suggestion.</p>
         * 
         * <strong>example:</strong>
         * <p>block</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <p>The risk type.</p>
         * 
         * <strong>example:</strong>
         * <p>promptAttack</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtGuardrailDetail build(java.util.Map<String, ?> map) throws Exception {
            ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtGuardrailDetail self = new ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtGuardrailDetail();
            return TeaModel.build(map, self);
        }

        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtGuardrailDetail setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtGuardrailDetail setResult(java.util.List<ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtGuardrailDetailResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtGuardrailDetailResult> getResult() {
            return this.result;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtGuardrailDetail setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtGuardrailDetail setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtGuardrail extends TeaModel {
        /**
         * <p>The list of risk details.</p>
         */
        @NameInMap("Detail")
        public java.util.List<ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtGuardrailDetail> detail;

        /**
         * <p>The handling suggestion.</p>
         * 
         * <strong>example:</strong>
         * <p>block</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        public static ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtGuardrail build(java.util.Map<String, ?> map) throws Exception {
            ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtGuardrail self = new ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtGuardrail();
            return TeaModel.build(map, self);
        }

        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtGuardrail setDetail(java.util.List<ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtGuardrailDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtGuardrailDetail> getDetail() {
            return this.detail;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtGuardrail setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtSensitiveDetail extends TeaModel {
        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_ak_24</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>The list of sensitive information.</p>
         */
        @NameInMap("Result")
        public java.util.List<String> result;

        public static ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtSensitiveDetail build(java.util.Map<String, ?> map) throws Exception {
            ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtSensitiveDetail self = new ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtSensitiveDetail();
            return TeaModel.build(map, self);
        }

        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtSensitiveDetail setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtSensitiveDetail setResult(java.util.List<String> result) {
            this.result = result;
            return this;
        }
        public java.util.List<String> getResult() {
            return this.result;
        }

    }

    public static class ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtSensitive extends TeaModel {
        /**
         * <p>The list of risk details.</p>
         */
        @NameInMap("Detail")
        public java.util.List<ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtSensitiveDetail> detail;

        public static ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtSensitive build(java.util.Map<String, ?> map) throws Exception {
            ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtSensitive self = new ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtSensitive();
            return TeaModel.build(map, self);
        }

        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtSensitive setDetail(java.util.List<ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtSensitiveDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtSensitiveDetail> getDetail() {
            return this.detail;
        }

    }

    public static class ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtVirus extends TeaModel {
        /**
         * <p>The extended information field, which is a reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Ext")
        public String ext;

        /**
         * <p>The risk score. The maximum score is 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Score")
        public Integer score;

        /**
         * <p>The virus type.</p>
         * 
         * <strong>example:</strong>
         * <p>Backdoor</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtVirus build(java.util.Map<String, ?> map) throws Exception {
            ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtVirus self = new ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtVirus();
            return TeaModel.build(map, self);
        }

        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtVirus setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtVirus setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtVirus setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExt extends TeaModel {
        /**
         * <p>The configuration check risk.</p>
         */
        @NameInMap("Config")
        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtConfig config;

        /**
         * <p>The security guardrail detection risk.</p>
         */
        @NameInMap("Guardrail")
        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtGuardrail guardrail;

        /**
         * <p>The sensitive information risk.</p>
         */
        @NameInMap("Sensitive")
        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtSensitive sensitive;

        /**
         * <p>The virus detection risk.</p>
         */
        @NameInMap("Virus")
        public java.util.List<ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtVirus> virus;

        public static ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExt build(java.util.Map<String, ?> map) throws Exception {
            ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExt self = new ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExt();
            return TeaModel.build(map, self);
        }

        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExt setConfig(ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtConfig config) {
            this.config = config;
            return this;
        }
        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtConfig getConfig() {
            return this.config;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExt setGuardrail(ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtGuardrail guardrail) {
            this.guardrail = guardrail;
            return this;
        }
        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtGuardrail getGuardrail() {
            return this.guardrail;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExt setSensitive(ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtSensitive sensitive) {
            this.sensitive = sensitive;
            return this;
        }
        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtSensitive getSensitive() {
            return this.sensitive;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExt setVirus(java.util.List<ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtVirus> virus) {
            this.virus = virus;
            return this;
        }
        public java.util.List<ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtVirus> getVirus() {
            return this.virus;
        }

    }

    public static class ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfo extends TeaModel {
        /**
         * <p>The list of file check risks.</p>
         */
        @NameInMap("Ext")
        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExt ext;

        /**
         * <p>The file path.</p>
         * 
         * <strong>example:</strong>
         * <p>/home/97e55e6af371836f/</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The type of the check result. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: No risk.</li>
         * <li><strong>1</strong>: Risk detected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ResultType")
        public String resultType;

        public static ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfo build(java.util.Map<String, ?> map) throws Exception {
            ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfo self = new ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfo();
            return TeaModel.build(map, self);
        }

        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfo setExt(ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExt ext) {
            this.ext = ext;
            return this;
        }
        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExt getExt() {
            return this.ext;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfo setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfo setResultType(String resultType) {
            this.resultType = resultType;
            return this;
        }
        public String getResultType() {
            return this.resultType;
        }

    }

    public static class ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResult extends TeaModel {
        /**
         * <p>The file check risk information.</p>
         */
        @NameInMap("RiskInfo")
        public java.util.List<ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfo> riskInfo;

        public static ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResult build(java.util.Map<String, ?> map) throws Exception {
            ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResult self = new ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResult();
            return TeaModel.build(map, self);
        }

        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResult setRiskInfo(java.util.List<ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfo> riskInfo) {
            this.riskInfo = riskInfo;
            return this;
        }
        public java.util.List<ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfo> getRiskInfo() {
            return this.riskInfo;
        }

    }

    public static class ListSubTasksResponseBodyDataTaskResultMessage extends TeaModel {
        /**
         * <p>The check results of the comprehensive health check task, which provides the status and description for each check item.</p>
         */
        @NameInMap("FullCheckResult")
        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResult fullCheckResult;

        /**
         * <p>The Skill check task result.</p>
         */
        @NameInMap("SkillCheckResult")
        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResult skillCheckResult;

        public static ListSubTasksResponseBodyDataTaskResultMessage build(java.util.Map<String, ?> map) throws Exception {
            ListSubTasksResponseBodyDataTaskResultMessage self = new ListSubTasksResponseBodyDataTaskResultMessage();
            return TeaModel.build(map, self);
        }

        public ListSubTasksResponseBodyDataTaskResultMessage setFullCheckResult(ListSubTasksResponseBodyDataTaskResultMessageFullCheckResult fullCheckResult) {
            this.fullCheckResult = fullCheckResult;
            return this;
        }
        public ListSubTasksResponseBodyDataTaskResultMessageFullCheckResult getFullCheckResult() {
            return this.fullCheckResult;
        }

        public ListSubTasksResponseBodyDataTaskResultMessage setSkillCheckResult(ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResult skillCheckResult) {
            this.skillCheckResult = skillCheckResult;
            return this;
        }
        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResult getSkillCheckResult() {
            return this.skillCheckResult;
        }

    }

    public static class ListSubTasksResponseBodyData extends TeaModel {
        /**
         * <p>The display name of the agent. It is parsed from the application information based on the target of the subtask. This field is empty if the application record is missing.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-01</p>
         */
        @NameInMap("AgentName")
        public String agentName;

        /**
         * <p>The hash value of the uploaded file.</p>
         * 
         * <strong>example:</strong>
         * <p>03d1f08455e965cac0351eaa59256fd9</p>
         */
        @NameInMap("FileHash")
        public String fileHash;

        /**
         * <p>The millisecond-level timestamp when the subtask finishes execution. This field is empty if the subtask has not finished.</p>
         * 
         * <strong>example:</strong>
         * <p>1764036120000</p>
         */
        @NameInMap("GmtTaskFinished")
        public Long gmtTaskFinished;

        /**
         * <p>The millisecond-level timestamp when the subtask starts execution. This field is empty if the subtask has not started.</p>
         * 
         * <strong>example:</strong>
         * <p>1764036000000</p>
         */
        @NameInMap("GmtTaskStart")
        public Long gmtTaskStart;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4190063324899520</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The detection target.</p>
         * 
         * <strong>example:</strong>
         * <p>c7acb2f1264e4467887ef8f4c36c44ca1</p>
         */
        @NameInMap("Target")
        public String target;

        /**
         * <p>The task result message.</p>
         */
        @NameInMap("TaskResultMessage")
        public ListSubTasksResponseBodyDataTaskResultMessage taskResultMessage;

        /**
         * <p>The task status.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        public static ListSubTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSubTasksResponseBodyData self = new ListSubTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSubTasksResponseBodyData setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public ListSubTasksResponseBodyData setFileHash(String fileHash) {
            this.fileHash = fileHash;
            return this;
        }
        public String getFileHash() {
            return this.fileHash;
        }

        public ListSubTasksResponseBodyData setGmtTaskFinished(Long gmtTaskFinished) {
            this.gmtTaskFinished = gmtTaskFinished;
            return this;
        }
        public Long getGmtTaskFinished() {
            return this.gmtTaskFinished;
        }

        public ListSubTasksResponseBodyData setGmtTaskStart(Long gmtTaskStart) {
            this.gmtTaskStart = gmtTaskStart;
            return this;
        }
        public Long getGmtTaskStart() {
            return this.gmtTaskStart;
        }

        public ListSubTasksResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListSubTasksResponseBodyData setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public ListSubTasksResponseBodyData setTaskResultMessage(ListSubTasksResponseBodyDataTaskResultMessage taskResultMessage) {
            this.taskResultMessage = taskResultMessage;
            return this;
        }
        public ListSubTasksResponseBodyDataTaskResultMessage getTaskResultMessage() {
            return this.taskResultMessage;
        }

        public ListSubTasksResponseBodyData setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

    public static class ListSubTasksResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public String count;

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The page size.</p>
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

        public static ListSubTasksResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListSubTasksResponseBodyPageInfo self = new ListSubTasksResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListSubTasksResponseBodyPageInfo setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public ListSubTasksResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListSubTasksResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListSubTasksResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
