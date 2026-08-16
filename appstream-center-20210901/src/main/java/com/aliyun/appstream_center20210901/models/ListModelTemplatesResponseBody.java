// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListModelTemplatesResponseBody extends TeaModel {
    /**
     * <p>The list of returned data objects.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListModelTemplatesResponseBodyData> data;

    /**
     * <p>The current page number of the query results.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of query results per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of query results.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListModelTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListModelTemplatesResponseBody self = new ListModelTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListModelTemplatesResponseBody setData(java.util.List<ListModelTemplatesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListModelTemplatesResponseBodyData> getData() {
        return this.data;
    }

    public ListModelTemplatesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListModelTemplatesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListModelTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListModelTemplatesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListModelTemplatesResponseBodyData extends TeaModel {
        /**
         * <p>The Agent platform (such as ENTERPRISE or ENTERPRISE_JVS).</p>
         */
        @NameInMap("AgentPlatform")
        public String agentPlatform;

        /**
         * <p>The Agent provider name.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenClaw</p>
         */
        @NameInMap("AgentProvider")
        public String agentProvider;

        /**
         * <p>The model group configuration JSON object.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;defaults&quot;: {
         *         &quot;model&quot;: {
         *             &quot;primary&quot;: &quot;bailian/qwen3.5-plus&quot;
         *         }
         *     }
         * }</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The template group description.</p>
         * 
         * <strong>example:</strong>
         * <p>Test model group</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Specifies whether models are configured in the group.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasModel")
        public Boolean hasModel;

        /**
         * <p>The number of models in the model group, including referenced system provider models.</p>
         */
        @NameInMap("ModelCount")
        public Integer modelCount;

        /**
         * <p>The model group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mt-xxxx</p>
         */
        @NameInMap("ModelTemplateId")
        public String modelTemplateId;

        /**
         * <p>The template group name.</p>
         * 
         * <strong>example:</strong>
         * <p>model-template-001</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The group authorization scope. Valid values:</p>
         * <ul>
         * <li>ALL_USER: all users.</li>
         * <li>USER_MIXED: user mixed (a mix of user groups and users, only for Common groups).</li>
         * </ul>
         */
        @NameInMap("RefScope")
        public String refScope;

        /**
         * <p>The number of authorized users in the group. Returned only when ListModelTemplates is called with refScope=USER_MIXED. Otherwise null.</p>
         */
        @NameInMap("UserCount")
        public Integer userCount;

        /**
         * <p>The number of authorized user groups in the group. Returned only when ListModelTemplates is called with refScope=USER_MIXED. Otherwise null.</p>
         */
        @NameInMap("UserGroupCount")
        public Integer userGroupCount;

        public static ListModelTemplatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListModelTemplatesResponseBodyData self = new ListModelTemplatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListModelTemplatesResponseBodyData setAgentPlatform(String agentPlatform) {
            this.agentPlatform = agentPlatform;
            return this;
        }
        public String getAgentPlatform() {
            return this.agentPlatform;
        }

        public ListModelTemplatesResponseBodyData setAgentProvider(String agentProvider) {
            this.agentProvider = agentProvider;
            return this;
        }
        public String getAgentProvider() {
            return this.agentProvider;
        }

        public ListModelTemplatesResponseBodyData setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public ListModelTemplatesResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListModelTemplatesResponseBodyData setHasModel(Boolean hasModel) {
            this.hasModel = hasModel;
            return this;
        }
        public Boolean getHasModel() {
            return this.hasModel;
        }

        public ListModelTemplatesResponseBodyData setModelCount(Integer modelCount) {
            this.modelCount = modelCount;
            return this;
        }
        public Integer getModelCount() {
            return this.modelCount;
        }

        public ListModelTemplatesResponseBodyData setModelTemplateId(String modelTemplateId) {
            this.modelTemplateId = modelTemplateId;
            return this;
        }
        public String getModelTemplateId() {
            return this.modelTemplateId;
        }

        public ListModelTemplatesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListModelTemplatesResponseBodyData setRefScope(String refScope) {
            this.refScope = refScope;
            return this;
        }
        public String getRefScope() {
            return this.refScope;
        }

        public ListModelTemplatesResponseBodyData setUserCount(Integer userCount) {
            this.userCount = userCount;
            return this;
        }
        public Integer getUserCount() {
            return this.userCount;
        }

        public ListModelTemplatesResponseBodyData setUserGroupCount(Integer userGroupCount) {
            this.userGroupCount = userGroupCount;
            return this;
        }
        public Integer getUserGroupCount() {
            return this.userGroupCount;
        }

    }

}
