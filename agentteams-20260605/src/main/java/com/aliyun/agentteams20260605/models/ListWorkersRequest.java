// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class ListWorkersRequest extends TeaModel {
    /**
     * <p>The Agent runtime type filter.</p>
     * 
     * <strong>example:</strong>
     * <p>Qwenpaw</p>
     */
    @NameInMap("AgentType")
    public String agentType;

    /**
     * <p>The credential name filter.</p>
     * 
     * <strong>example:</strong>
     * <p>cred-demo</p>
     */
    @NameInMap("Credential")
    public String credential;

    /**
     * <p>The team group filter.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Group")
    public ListWorkersRequestGroup group;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>inst-demo</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The maximum number of entries to return per page. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The MCP server name filter.</p>
     * 
     * <strong>example:</strong>
     * <p>mcp-demo</p>
     */
    @NameInMap("Mcp")
    public String mcp;

    /**
     * <p>The model name filter.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-max</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>The model provider filter.</p>
     * 
     * <strong>example:</strong>
     * <p>dashscope</p>
     */
    @NameInMap("ModelProvider")
    public String modelProvider;

    /**
     * <p>The fuzzy match filter for the Worker name.</p>
     * 
     * <strong>example:</strong>
     * <p>worker</p>
     */
    @NameInMap("NameLike")
    public String nameLike;

    /**
     * <p>The pagination token used to query the next page of data.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The template filter.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Template")
    public ListWorkersRequestTemplate template;

    /**
     * <p>The Worker version number filter.</p>
     * 
     * <strong>example:</strong>
     * <p>v1.0.0</p>
     */
    @NameInMap("VersionCode")
    public String versionCode;

    public static ListWorkersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkersRequest self = new ListWorkersRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkersRequest setAgentType(String agentType) {
        this.agentType = agentType;
        return this;
    }
    public String getAgentType() {
        return this.agentType;
    }

    public ListWorkersRequest setCredential(String credential) {
        this.credential = credential;
        return this;
    }
    public String getCredential() {
        return this.credential;
    }

    public ListWorkersRequest setGroup(ListWorkersRequestGroup group) {
        this.group = group;
        return this;
    }
    public ListWorkersRequestGroup getGroup() {
        return this.group;
    }

    public ListWorkersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListWorkersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListWorkersRequest setMcp(String mcp) {
        this.mcp = mcp;
        return this;
    }
    public String getMcp() {
        return this.mcp;
    }

    public ListWorkersRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public ListWorkersRequest setModelProvider(String modelProvider) {
        this.modelProvider = modelProvider;
        return this;
    }
    public String getModelProvider() {
        return this.modelProvider;
    }

    public ListWorkersRequest setNameLike(String nameLike) {
        this.nameLike = nameLike;
        return this;
    }
    public String getNameLike() {
        return this.nameLike;
    }

    public ListWorkersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWorkersRequest setTemplate(ListWorkersRequestTemplate template) {
        this.template = template;
        return this;
    }
    public ListWorkersRequestTemplate getTemplate() {
        return this.template;
    }

    public ListWorkersRequest setVersionCode(String versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public String getVersionCode() {
        return this.versionCode;
    }

    public static class ListWorkersRequestGroup extends TeaModel {
        /**
         * <p>The returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>worker-demo</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>member</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>team</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListWorkersRequestGroup build(java.util.Map<String, ?> map) throws Exception {
            ListWorkersRequestGroup self = new ListWorkersRequestGroup();
            return TeaModel.build(map, self);
        }

        public ListWorkersRequestGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWorkersRequestGroup setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListWorkersRequestGroup setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListWorkersRequestTemplate extends TeaModel {
        /**
         * <p>The returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>标签</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>worker-demo</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListWorkersRequestTemplate build(java.util.Map<String, ?> map) throws Exception {
            ListWorkersRequestTemplate self = new ListWorkersRequestTemplate();
            return TeaModel.build(map, self);
        }

        public ListWorkersRequestTemplate setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ListWorkersRequestTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWorkersRequestTemplate setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
