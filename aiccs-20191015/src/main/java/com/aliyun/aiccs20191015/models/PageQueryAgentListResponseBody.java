// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class PageQueryAgentListResponseBody extends TeaModel {
    /**
     * <p>The detailed reason for the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>Access Denied</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public PageQueryAgentListResponseBodyData data;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>成功</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>742C9243-2870-B8D6-0C68-C60BEB2DF09A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
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
         * <p>The agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>121312*******</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        /**
         * <p>The agent name.</p>
         * 
         * <strong>example:</strong>
         * <p>测试智能体</p>
         */
        @NameInMap("AgentName")
        public String agentName;

        /**
         * <p>The application code.</p>
         * 
         * <strong>example:</strong>
         * <p>DFAS*****</p>
         */
        @NameInMap("ApplicationCode")
        public String applicationCode;

        /**
         * <p>The reason for the review failure.</p>
         * 
         * <strong>example:</strong>
         * <p>请补充流程说明</p>
         */
        @NameInMap("AuditReason")
        public String auditReason;

        /**
         * <p>The reason for the build failure.</p>
         * 
         * <strong>example:</strong>
         * <p>系统错误</p>
         */
        @NameInMap("BuildFailReason")
        public String buildFailReason;

        /**
         * <p>The business scenario name.</p>
         * 
         * <strong>example:</strong>
         * <p>个人客户线索转化</p>
         */
        @NameInMap("BusinessTypeName")
        public String businessTypeName;

        /**
         * <p>The time the agent was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-28 17:10:17</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The agent description.</p>
         * 
         * <strong>example:</strong>
         * <p>用于日常测试</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time the agent was last online.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-28 14:38:15</p>
         */
        @NameInMap("LastOnlineTime")
        public String lastOnlineTime;

        /**
         * <p>The time the agent was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-28 17:10:17</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The agent status.</p>
         * 
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
         * <p>Indicates whether the agent has been configured.</p>
         * 
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
        /**
         * <p>A list of agents.</p>
         */
        @NameInMap("List")
        public java.util.List<PageQueryAgentListResponseBodyDataList> list;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Long pageNo;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total count of entries.</p>
         * 
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
