// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class PageQueryAgentListNewResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Access denied due to insufficient permissions</p>
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
    public PageQueryAgentListNewResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>12345678-1234-1234-1234-123456789012</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static PageQueryAgentListNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PageQueryAgentListNewResponseBody self = new PageQueryAgentListNewResponseBody();
        return TeaModel.build(map, self);
    }

    public PageQueryAgentListNewResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public PageQueryAgentListNewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PageQueryAgentListNewResponseBody setData(PageQueryAgentListNewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PageQueryAgentListNewResponseBodyData getData() {
        return this.data;
    }

    public PageQueryAgentListNewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PageQueryAgentListNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PageQueryAgentListNewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PageQueryAgentListNewResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>51</p>
         */
        @NameInMap("AgentId")
        public Long agentId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AgentMode")
        public Long agentMode;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("AgentName")
        public String agentName;

        /**
         * <strong>example:</strong>
         * <p>aicc_demo_app</p>
         */
        @NameInMap("ApplicationCode")
        public String applicationCode;

        /**
         * <strong>example:</strong>
         * <p>2024-01-20 12:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("DeployBranchId")
        public Long deployBranchId;

        /**
         * <strong>example:</strong>
         * <p>master</p>
         */
        @NameInMap("DeployBranchName")
        public String deployBranchName;

        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>71</p>
         */
        @NameInMap("EffectiveVersionId")
        public Long effectiveVersionId;

        /**
         * <strong>example:</strong>
         * <p>v1.0.0</p>
         */
        @NameInMap("EffectiveVersionName")
        public String effectiveVersionName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsAvailable")
        public Boolean isAvailable;

        /**
         * <strong>example:</strong>
         * <p>2024-01-20 12:00:00</p>
         */
        @NameInMap("LatestPublishTime")
        public String latestPublishTime;

        /**
         * <strong>example:</strong>
         * <p>2024-01-15 10:30:00</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Scene")
        public String scene;

        public static PageQueryAgentListNewResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            PageQueryAgentListNewResponseBodyDataList self = new PageQueryAgentListNewResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public PageQueryAgentListNewResponseBodyDataList setAgentId(Long agentId) {
            this.agentId = agentId;
            return this;
        }
        public Long getAgentId() {
            return this.agentId;
        }

        public PageQueryAgentListNewResponseBodyDataList setAgentMode(Long agentMode) {
            this.agentMode = agentMode;
            return this;
        }
        public Long getAgentMode() {
            return this.agentMode;
        }

        public PageQueryAgentListNewResponseBodyDataList setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public PageQueryAgentListNewResponseBodyDataList setApplicationCode(String applicationCode) {
            this.applicationCode = applicationCode;
            return this;
        }
        public String getApplicationCode() {
            return this.applicationCode;
        }

        public PageQueryAgentListNewResponseBodyDataList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PageQueryAgentListNewResponseBodyDataList setDeployBranchId(Long deployBranchId) {
            this.deployBranchId = deployBranchId;
            return this;
        }
        public Long getDeployBranchId() {
            return this.deployBranchId;
        }

        public PageQueryAgentListNewResponseBodyDataList setDeployBranchName(String deployBranchName) {
            this.deployBranchName = deployBranchName;
            return this;
        }
        public String getDeployBranchName() {
            return this.deployBranchName;
        }

        public PageQueryAgentListNewResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public PageQueryAgentListNewResponseBodyDataList setEffectiveVersionId(Long effectiveVersionId) {
            this.effectiveVersionId = effectiveVersionId;
            return this;
        }
        public Long getEffectiveVersionId() {
            return this.effectiveVersionId;
        }

        public PageQueryAgentListNewResponseBodyDataList setEffectiveVersionName(String effectiveVersionName) {
            this.effectiveVersionName = effectiveVersionName;
            return this;
        }
        public String getEffectiveVersionName() {
            return this.effectiveVersionName;
        }

        public PageQueryAgentListNewResponseBodyDataList setIsAvailable(Boolean isAvailable) {
            this.isAvailable = isAvailable;
            return this;
        }
        public Boolean getIsAvailable() {
            return this.isAvailable;
        }

        public PageQueryAgentListNewResponseBodyDataList setLatestPublishTime(String latestPublishTime) {
            this.latestPublishTime = latestPublishTime;
            return this;
        }
        public String getLatestPublishTime() {
            return this.latestPublishTime;
        }

        public PageQueryAgentListNewResponseBodyDataList setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public PageQueryAgentListNewResponseBodyDataList setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class PageQueryAgentListNewResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<PageQueryAgentListNewResponseBodyDataList> list;

        /**
         * <strong>example:</strong>
         * <p>28</p>
         */
        @NameInMap("PageNo")
        public Long pageNo;

        /**
         * <strong>example:</strong>
         * <p>41</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("Total")
        public Long total;

        public static PageQueryAgentListNewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PageQueryAgentListNewResponseBodyData self = new PageQueryAgentListNewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PageQueryAgentListNewResponseBodyData setList(java.util.List<PageQueryAgentListNewResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<PageQueryAgentListNewResponseBodyDataList> getList() {
            return this.list;
        }

        public PageQueryAgentListNewResponseBodyData setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public PageQueryAgentListNewResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public PageQueryAgentListNewResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
