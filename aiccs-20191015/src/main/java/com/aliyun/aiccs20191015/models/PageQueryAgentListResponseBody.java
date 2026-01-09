// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class PageQueryAgentListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Access Denied</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public PageQueryAgentListResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>742C9243-2870-B8D6-0C68-C60BEB2DF09A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static PageQueryAgentListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PageQueryAgentListResponseBody self = new PageQueryAgentListResponseBody();
        return TeaModel.build(map, self);
    }

    public PageQueryAgentListResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public PageQueryAgentListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PageQueryAgentListResponseBody setData(PageQueryAgentListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PageQueryAgentListResponseBodyData getData() {
        return this.data;
    }

    public PageQueryAgentListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PageQueryAgentListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PageQueryAgentListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PageQueryAgentListResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>121312*******</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("AgentName")
        public String agentName;

        /**
         * <strong>example:</strong>
         * <p>DFAS*****</p>
         */
        @NameInMap("ApplicationCode")
        public String applicationCode;

        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("AuditReason")
        public String auditReason;

        /**
         * <strong>example:</strong>
         * <p>构建失败原因</p>
         */
        @NameInMap("BuildFailReason")
        public String buildFailReason;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("BusinessTypeName")
        public String businessTypeName;

        /**
         * <strong>example:</strong>
         * <p>2025-10-28 17:10:17</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>2025-10-28 14:38:15</p>
         */
        @NameInMap("LastOnlineTime")
        public String lastOnlineTime;

        /**
         * <strong>example:</strong>
         * <p>2025-10-28 17:10:17</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("Status")
        public Long status;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("WithActivePrompt")
        public Boolean withActivePrompt;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("WithConfig")
        public Boolean withConfig;

        public static PageQueryAgentListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            PageQueryAgentListResponseBodyDataList self = new PageQueryAgentListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public PageQueryAgentListResponseBodyDataList setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public PageQueryAgentListResponseBodyDataList setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public PageQueryAgentListResponseBodyDataList setApplicationCode(String applicationCode) {
            this.applicationCode = applicationCode;
            return this;
        }
        public String getApplicationCode() {
            return this.applicationCode;
        }

        public PageQueryAgentListResponseBodyDataList setAuditReason(String auditReason) {
            this.auditReason = auditReason;
            return this;
        }
        public String getAuditReason() {
            return this.auditReason;
        }

        public PageQueryAgentListResponseBodyDataList setBuildFailReason(String buildFailReason) {
            this.buildFailReason = buildFailReason;
            return this;
        }
        public String getBuildFailReason() {
            return this.buildFailReason;
        }

        public PageQueryAgentListResponseBodyDataList setBusinessTypeName(String businessTypeName) {
            this.businessTypeName = businessTypeName;
            return this;
        }
        public String getBusinessTypeName() {
            return this.businessTypeName;
        }

        public PageQueryAgentListResponseBodyDataList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PageQueryAgentListResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public PageQueryAgentListResponseBodyDataList setLastOnlineTime(String lastOnlineTime) {
            this.lastOnlineTime = lastOnlineTime;
            return this;
        }
        public String getLastOnlineTime() {
            return this.lastOnlineTime;
        }

        public PageQueryAgentListResponseBodyDataList setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public PageQueryAgentListResponseBodyDataList setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public PageQueryAgentListResponseBodyDataList setWithActivePrompt(Boolean withActivePrompt) {
            this.withActivePrompt = withActivePrompt;
            return this;
        }
        public Boolean getWithActivePrompt() {
            return this.withActivePrompt;
        }

        public PageQueryAgentListResponseBodyDataList setWithConfig(Boolean withConfig) {
            this.withConfig = withConfig;
            return this;
        }
        public Boolean getWithConfig() {
            return this.withConfig;
        }

    }

    public static class PageQueryAgentListResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<PageQueryAgentListResponseBodyDataList> list;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Long pageNo;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <strong>example:</strong>
         * <p>14</p>
         */
        @NameInMap("Total")
        public Long total;

        public static PageQueryAgentListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PageQueryAgentListResponseBodyData self = new PageQueryAgentListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PageQueryAgentListResponseBodyData setList(java.util.List<PageQueryAgentListResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<PageQueryAgentListResponseBodyDataList> getList() {
            return this.list;
        }

        public PageQueryAgentListResponseBodyData setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public PageQueryAgentListResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public PageQueryAgentListResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
