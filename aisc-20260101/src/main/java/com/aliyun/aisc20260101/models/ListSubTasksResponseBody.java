// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class ListSubTasksResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListSubTasksResponseBodyData> data;

    @NameInMap("PageInfo")
    public ListSubTasksResponseBodyPageInfo pageInfo;

    /**
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

    public static class ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtConfigDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>allowed-tools: Bash(agent-browser:*)</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>The skill configuration allows Bash execution via agent-browser:* pattern without requiring user confirmation. This enables potentially dangerous command execution through the browser automation CLI.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>Dangerous Tools Without Confirmation</p>
         */
        @NameInMap("ItemName")
        public String itemName;

        /**
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
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <strong>example:</strong>
         * <p>Suspicious attacks.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>attack</p>
         */
        @NameInMap("Label")
        public String label;

        /**
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
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("Level")
        public String level;

        @NameInMap("Result")
        public java.util.List<ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtGuardrailDetailResult> result;

        /**
         * <strong>example:</strong>
         * <p>block</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
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
        @NameInMap("Detail")
        public java.util.List<ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtGuardrailDetail> detail;

        /**
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
         * <strong>example:</strong>
         * <p>aliyun_ak_24</p>
         */
        @NameInMap("Desc")
        public String desc;

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
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Ext")
        public String ext;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Score")
        public Integer score;

        /**
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
        @NameInMap("Config")
        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtConfig config;

        @NameInMap("Guardrail")
        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtGuardrail guardrail;

        @NameInMap("Sensitive")
        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExtSensitive sensitive;

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
        @NameInMap("Ext")
        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResultRiskInfoExt ext;

        /**
         * <strong>example:</strong>
         * <p>/home/97e55e6af371836f/</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <strong>example:</strong>
         * <p>file</p>
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
        @NameInMap("SkillCheckResult")
        public ListSubTasksResponseBodyDataTaskResultMessageSkillCheckResult skillCheckResult;

        public static ListSubTasksResponseBodyDataTaskResultMessage build(java.util.Map<String, ?> map) throws Exception {
            ListSubTasksResponseBodyDataTaskResultMessage self = new ListSubTasksResponseBodyDataTaskResultMessage();
            return TeaModel.build(map, self);
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
         * <strong>example:</strong>
         * <p>03d1f08455e965cac0351eaa59256fd9</p>
         */
        @NameInMap("FileHash")
        public String fileHash;

        /**
         * <strong>example:</strong>
         * <p>4190063324899520</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>c7acb2f1264e4467887ef8f4c36c44ca1</p>
         */
        @NameInMap("Target")
        public String target;

        @NameInMap("TaskResultMessage")
        public ListSubTasksResponseBodyDataTaskResultMessage taskResultMessage;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        public static ListSubTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSubTasksResponseBodyData self = new ListSubTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSubTasksResponseBodyData setFileHash(String fileHash) {
            this.fileHash = fileHash;
            return this;
        }
        public String getFileHash() {
            return this.fileHash;
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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public String count;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
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
