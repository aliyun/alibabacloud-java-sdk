// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListCustomAgentResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListCustomAgentResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>Specified parameter Tid is not valid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListCustomAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCustomAgentResponseBody self = new ListCustomAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCustomAgentResponseBody setData(ListCustomAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCustomAgentResponseBodyData getData() {
        return this.data;
    }

    public ListCustomAgentResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListCustomAgentResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListCustomAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCustomAgentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCustomAgentResponseBodyDataContentExecutionConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SkipPlan")
        public Boolean skipPlan;

        public static ListCustomAgentResponseBodyDataContentExecutionConfig build(java.util.Map<String, ?> map) throws Exception {
            ListCustomAgentResponseBodyDataContentExecutionConfig self = new ListCustomAgentResponseBodyDataContentExecutionConfig();
            return TeaModel.build(map, self);
        }

        public ListCustomAgentResponseBodyDataContentExecutionConfig setSkipPlan(Boolean skipPlan) {
            this.skipPlan = skipPlan;
            return this;
        }
        public Boolean getSkipPlan() {
            return this.skipPlan;
        }

    }

    public static class ListCustomAgentResponseBodyDataContent extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>16738266********</p>
         */
        @NameInMap("AliyunParentId")
        public String aliyunParentId;

        /**
         * <strong>example:</strong>
         * <p>20372822********</p>
         */
        @NameInMap("AliyunUid")
        public String aliyunUid;

        /**
         * <strong>example:</strong>
         * <p>HaoY*****</p>
         */
        @NameInMap("CreatorUserName")
        public String creatorUserName;

        /**
         * <strong>example:</strong>
         * <p>ca-4y3ca4khkcu**********ysf</p>
         */
        @NameInMap("CustomAgentId")
        public String customAgentId;

        @NameInMap("DataJson")
        public String dataJson;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("DmsUnit")
        public String dmsUnit;

        @NameInMap("ExecutionConfig")
        public ListCustomAgentResponseBodyDataContentExecutionConfig executionConfig;

        /**
         * <strong>example:</strong>
         * <p>2025-12-11T14:04:32.000+00:00</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <strong>example:</strong>
         * <p>2025-12-11T14:04:32.000+00:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Instruction")
        public String instruction;

        @NameInMap("Knowledge")
        public String knowledge;

        /**
         * <strong>example:</strong>
         * <p>20372822********</p>
         */
        @NameInMap("Modifier")
        public String modifier;

        /**
         * <strong>example:</strong>
         * <p>HaoY*****</p>
         */
        @NameInMap("ModifierUserName")
        public String modifierUserName;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>2025-12-11T14:04:32.000+00:00</p>
         */
        @NameInMap("OfflineTime")
        public String offlineTime;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>2025-12-11T14:04:32.000+00:00</p>
         */
        @NameInMap("ReleaseTime")
        public String releaseTime;

        /**
         * <strong>example:</strong>
         * <p>RELEASED</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("TextReportConfig")
        public String textReportConfig;

        @NameInMap("WebReportConfig")
        public String webReportConfig;

        /**
         * <strong>example:</strong>
         * <p>56kv1pvl9uvt9**********bb</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ListCustomAgentResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListCustomAgentResponseBodyDataContent self = new ListCustomAgentResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListCustomAgentResponseBodyDataContent setAliyunParentId(String aliyunParentId) {
            this.aliyunParentId = aliyunParentId;
            return this;
        }
        public String getAliyunParentId() {
            return this.aliyunParentId;
        }

        public ListCustomAgentResponseBodyDataContent setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        public ListCustomAgentResponseBodyDataContent setCreatorUserName(String creatorUserName) {
            this.creatorUserName = creatorUserName;
            return this;
        }
        public String getCreatorUserName() {
            return this.creatorUserName;
        }

        public ListCustomAgentResponseBodyDataContent setCustomAgentId(String customAgentId) {
            this.customAgentId = customAgentId;
            return this;
        }
        public String getCustomAgentId() {
            return this.customAgentId;
        }

        public ListCustomAgentResponseBodyDataContent setDataJson(String dataJson) {
            this.dataJson = dataJson;
            return this;
        }
        public String getDataJson() {
            return this.dataJson;
        }

        public ListCustomAgentResponseBodyDataContent setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCustomAgentResponseBodyDataContent setDmsUnit(String dmsUnit) {
            this.dmsUnit = dmsUnit;
            return this;
        }
        public String getDmsUnit() {
            return this.dmsUnit;
        }

        public ListCustomAgentResponseBodyDataContent setExecutionConfig(ListCustomAgentResponseBodyDataContentExecutionConfig executionConfig) {
            this.executionConfig = executionConfig;
            return this;
        }
        public ListCustomAgentResponseBodyDataContentExecutionConfig getExecutionConfig() {
            return this.executionConfig;
        }

        public ListCustomAgentResponseBodyDataContent setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public ListCustomAgentResponseBodyDataContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListCustomAgentResponseBodyDataContent setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public ListCustomAgentResponseBodyDataContent setKnowledge(String knowledge) {
            this.knowledge = knowledge;
            return this;
        }
        public String getKnowledge() {
            return this.knowledge;
        }

        public ListCustomAgentResponseBodyDataContent setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ListCustomAgentResponseBodyDataContent setModifierUserName(String modifierUserName) {
            this.modifierUserName = modifierUserName;
            return this;
        }
        public String getModifierUserName() {
            return this.modifierUserName;
        }

        public ListCustomAgentResponseBodyDataContent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCustomAgentResponseBodyDataContent setOfflineTime(String offlineTime) {
            this.offlineTime = offlineTime;
            return this;
        }
        public String getOfflineTime() {
            return this.offlineTime;
        }

        public ListCustomAgentResponseBodyDataContent setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListCustomAgentResponseBodyDataContent setReleaseTime(String releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public String getReleaseTime() {
            return this.releaseTime;
        }

        public ListCustomAgentResponseBodyDataContent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCustomAgentResponseBodyDataContent setTextReportConfig(String textReportConfig) {
            this.textReportConfig = textReportConfig;
            return this;
        }
        public String getTextReportConfig() {
            return this.textReportConfig;
        }

        public ListCustomAgentResponseBodyDataContent setWebReportConfig(String webReportConfig) {
            this.webReportConfig = webReportConfig;
            return this;
        }
        public String getWebReportConfig() {
            return this.webReportConfig;
        }

        public ListCustomAgentResponseBodyDataContent setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class ListCustomAgentResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public java.util.List<ListCustomAgentResponseBodyDataContent> content;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TotalElements")
        public Long totalElements;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalPages")
        public Long totalPages;

        public static ListCustomAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCustomAgentResponseBodyData self = new ListCustomAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCustomAgentResponseBodyData setContent(java.util.List<ListCustomAgentResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListCustomAgentResponseBodyDataContent> getContent() {
            return this.content;
        }

        public ListCustomAgentResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListCustomAgentResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListCustomAgentResponseBodyData setTotalElements(Long totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Long getTotalElements() {
            return this.totalElements;
        }

        public ListCustomAgentResponseBodyData setTotalPages(Long totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Long getTotalPages() {
            return this.totalPages;
        }

    }

}
