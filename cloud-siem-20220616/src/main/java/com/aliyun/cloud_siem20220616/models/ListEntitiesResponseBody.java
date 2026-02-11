// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListEntitiesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("Data")
    public ListEntitiesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListEntitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEntitiesResponseBody self = new ListEntitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEntitiesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListEntitiesResponseBody setData(ListEntitiesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListEntitiesResponseBodyData getData() {
        return this.data;
    }

    public ListEntitiesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListEntitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEntitiesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListEntitiesResponseBodyDataPageInfo extends TeaModel {
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
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListEntitiesResponseBodyDataPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListEntitiesResponseBodyDataPageInfo self = new ListEntitiesResponseBodyDataPageInfo();
            return TeaModel.build(map, self);
        }

        public ListEntitiesResponseBodyDataPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListEntitiesResponseBodyDataPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListEntitiesResponseBodyDataPageInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class ListEntitiesResponseBodyDataResponseData extends TeaModel {
        @NameInMap("AgentConfidence")
        public String agentConfidence;

        @NameInMap("AgentDisposalMethod")
        public String agentDisposalMethod;

        @NameInMap("AgentDisposalPlaybookUuid")
        public String agentDisposalPlaybookUuid;

        @NameInMap("AgentDisposalSuggestion")
        public String agentDisposalSuggestion;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AlertNum")
        public Integer alertNum;

        /**
         * <strong>example:</strong>
         * <p>sas_71e24437d2797ce8fc59692905a4****</p>
         */
        @NameInMap("AlertUuid")
        public String alertUuid;

        /**
         * <strong>example:</strong>
         * <p>123456789****</p>
         */
        @NameInMap("Aliuid")
        public Long aliuid;

        /**
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        @NameInMap("CloudCode")
        public String cloudCode;

        /**
         * <strong>example:</strong>
         * <p>12345****</p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <strong>example:</strong>
         * <p>{&quot;file_path&quot;: &quot;c:/www/leixi.jsp&quot;,&quot;file_hash&quot;: &quot;aa0ca926ad948cd820e0a3d9a18c****&quot;,&quot;host_uuid&quot;: &quot;efed2cf7-0b77-45d9-a97b-d2cf246b****&quot;,&quot;malware_type&quot;: &quot;${aliyun.siem.sas.alert_tag.webshell}&quot;,&quot;host_name&quot;: &quot;launch-advisor-2023****&quot;}</p>
         */
        @NameInMap("EntityInfo")
        public String entityInfo;

        /**
         * <strong>example:</strong>
         * <p>123.123.123.123</p>
         */
        @NameInMap("EntityName")
        public String entityName;

        /**
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        /**
         * <strong>example:</strong>
         * <p>8087b3e4aa6862852c100c8738cf****</p>
         */
        @NameInMap("EntityUuid")
        public String entityUuid;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EventNum")
        public Integer eventNum;

        /**
         * <strong>example:</strong>
         * <p>2021-01-06 16:37:29</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2021-01-06 16:37:29</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>123456789***</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>85ea4241-798f-4684-a876-65d4f0c3****</p>
         */
        @NameInMap("IncidentUuid")
        public String incidentUuid;

        @NameInMap("IsAsset")
        public String isAsset;

        @NameInMap("IsMalware")
        public String isMalware;

        /**
         * <strong>example:</strong>
         * <p>aliyun.siem.sas.alert_tag.webshell</p>
         */
        @NameInMap("MalwareType")
        public String malwareType;

        /**
         * <strong>example:</strong>
         * <p>113091674488****</p>
         */
        @NameInMap("SubUserId")
        public Long subUserId;

        @NameInMap("Tags")
        public String tags;

        public static ListEntitiesResponseBodyDataResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListEntitiesResponseBodyDataResponseData self = new ListEntitiesResponseBodyDataResponseData();
            return TeaModel.build(map, self);
        }

        public ListEntitiesResponseBodyDataResponseData setAgentConfidence(String agentConfidence) {
            this.agentConfidence = agentConfidence;
            return this;
        }
        public String getAgentConfidence() {
            return this.agentConfidence;
        }

        public ListEntitiesResponseBodyDataResponseData setAgentDisposalMethod(String agentDisposalMethod) {
            this.agentDisposalMethod = agentDisposalMethod;
            return this;
        }
        public String getAgentDisposalMethod() {
            return this.agentDisposalMethod;
        }

        public ListEntitiesResponseBodyDataResponseData setAgentDisposalPlaybookUuid(String agentDisposalPlaybookUuid) {
            this.agentDisposalPlaybookUuid = agentDisposalPlaybookUuid;
            return this;
        }
        public String getAgentDisposalPlaybookUuid() {
            return this.agentDisposalPlaybookUuid;
        }

        public ListEntitiesResponseBodyDataResponseData setAgentDisposalSuggestion(String agentDisposalSuggestion) {
            this.agentDisposalSuggestion = agentDisposalSuggestion;
            return this;
        }
        public String getAgentDisposalSuggestion() {
            return this.agentDisposalSuggestion;
        }

        public ListEntitiesResponseBodyDataResponseData setAlertNum(Integer alertNum) {
            this.alertNum = alertNum;
            return this;
        }
        public Integer getAlertNum() {
            return this.alertNum;
        }

        public ListEntitiesResponseBodyDataResponseData setAlertUuid(String alertUuid) {
            this.alertUuid = alertUuid;
            return this;
        }
        public String getAlertUuid() {
            return this.alertUuid;
        }

        public ListEntitiesResponseBodyDataResponseData setAliuid(Long aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public Long getAliuid() {
            return this.aliuid;
        }

        public ListEntitiesResponseBodyDataResponseData setCloudCode(String cloudCode) {
            this.cloudCode = cloudCode;
            return this;
        }
        public String getCloudCode() {
            return this.cloudCode;
        }

        public ListEntitiesResponseBodyDataResponseData setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public ListEntitiesResponseBodyDataResponseData setEntityInfo(String entityInfo) {
            this.entityInfo = entityInfo;
            return this;
        }
        public String getEntityInfo() {
            return this.entityInfo;
        }

        public ListEntitiesResponseBodyDataResponseData setEntityName(String entityName) {
            this.entityName = entityName;
            return this;
        }
        public String getEntityName() {
            return this.entityName;
        }

        public ListEntitiesResponseBodyDataResponseData setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public ListEntitiesResponseBodyDataResponseData setEntityUuid(String entityUuid) {
            this.entityUuid = entityUuid;
            return this;
        }
        public String getEntityUuid() {
            return this.entityUuid;
        }

        public ListEntitiesResponseBodyDataResponseData setEventNum(Integer eventNum) {
            this.eventNum = eventNum;
            return this;
        }
        public Integer getEventNum() {
            return this.eventNum;
        }

        public ListEntitiesResponseBodyDataResponseData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListEntitiesResponseBodyDataResponseData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListEntitiesResponseBodyDataResponseData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListEntitiesResponseBodyDataResponseData setIncidentUuid(String incidentUuid) {
            this.incidentUuid = incidentUuid;
            return this;
        }
        public String getIncidentUuid() {
            return this.incidentUuid;
        }

        public ListEntitiesResponseBodyDataResponseData setIsAsset(String isAsset) {
            this.isAsset = isAsset;
            return this;
        }
        public String getIsAsset() {
            return this.isAsset;
        }

        public ListEntitiesResponseBodyDataResponseData setIsMalware(String isMalware) {
            this.isMalware = isMalware;
            return this;
        }
        public String getIsMalware() {
            return this.isMalware;
        }

        public ListEntitiesResponseBodyDataResponseData setMalwareType(String malwareType) {
            this.malwareType = malwareType;
            return this;
        }
        public String getMalwareType() {
            return this.malwareType;
        }

        public ListEntitiesResponseBodyDataResponseData setSubUserId(Long subUserId) {
            this.subUserId = subUserId;
            return this;
        }
        public Long getSubUserId() {
            return this.subUserId;
        }

        public ListEntitiesResponseBodyDataResponseData setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

    }

    public static class ListEntitiesResponseBodyData extends TeaModel {
        @NameInMap("PageInfo")
        public ListEntitiesResponseBodyDataPageInfo pageInfo;

        @NameInMap("ResponseData")
        public java.util.List<ListEntitiesResponseBodyDataResponseData> responseData;

        public static ListEntitiesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEntitiesResponseBodyData self = new ListEntitiesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEntitiesResponseBodyData setPageInfo(ListEntitiesResponseBodyDataPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public ListEntitiesResponseBodyDataPageInfo getPageInfo() {
            return this.pageInfo;
        }

        public ListEntitiesResponseBodyData setResponseData(java.util.List<ListEntitiesResponseBodyDataResponseData> responseData) {
            this.responseData = responseData;
            return this;
        }
        public java.util.List<ListEntitiesResponseBodyDataResponseData> getResponseData() {
            return this.responseData;
        }

    }

}
