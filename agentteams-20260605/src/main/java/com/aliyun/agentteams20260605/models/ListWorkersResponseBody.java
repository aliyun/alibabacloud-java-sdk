// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class ListWorkersResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The list of Workers.</p>
     * 
     * <strong>example:</strong>
     * <p>[...]</p>
     */
    @NameInMap("Items")
    public java.util.List<ListWorkersResponseBodyItems> items;

    /**
     * <p>The maximum number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The pagination token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-XX-XX-XX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListWorkersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkersResponseBody self = new ListWorkersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListWorkersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListWorkersResponseBody setItems(java.util.List<ListWorkersResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListWorkersResponseBodyItems> getItems() {
        return this.items;
    }

    public ListWorkersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListWorkersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListWorkersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWorkersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListWorkersResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListWorkersResponseBodyItemsGroups extends TeaModel {
        /**
         * <p>The Worker name.</p>
         * 
         * <strong>example:</strong>
         * <p>worker-demo</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The group role.</p>
         * 
         * <strong>example:</strong>
         * <p>member</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The group type.</p>
         * 
         * <strong>example:</strong>
         * <p>team</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListWorkersResponseBodyItemsGroups build(java.util.Map<String, ?> map) throws Exception {
            ListWorkersResponseBodyItemsGroups self = new ListWorkersResponseBodyItemsGroups();
            return TeaModel.build(map, self);
        }

        public ListWorkersResponseBodyItemsGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWorkersResponseBodyItemsGroups setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListWorkersResponseBodyItemsGroups setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListWorkersResponseBodyItemsTemplate extends TeaModel {
        /**
         * <p>The template label.</p>
         * 
         * <strong>example:</strong>
         * <p>默认模板</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>default-template</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The template version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListWorkersResponseBodyItemsTemplate build(java.util.Map<String, ?> map) throws Exception {
            ListWorkersResponseBodyItemsTemplate self = new ListWorkersResponseBodyItemsTemplate();
            return TeaModel.build(map, self);
        }

        public ListWorkersResponseBodyItemsTemplate setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ListWorkersResponseBodyItemsTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWorkersResponseBodyItemsTemplate setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListWorkersResponseBodyItems extends TeaModel {
        /**
         * <p>The Agent runtime type.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwenpaw</p>
         */
        @NameInMap("AgentType")
        public String agentType;

        /**
         * <p>The deployment type.</p>
         * 
         * <strong>example:</strong>
         * <p>Managed</p>
         */
        @NameInMap("DeployType")
        public String deployType;

        /**
         * <p>The list of team groups.</p>
         * 
         * <strong>example:</strong>
         * <p>[...]</p>
         */
        @NameInMap("Groups")
        public java.util.List<ListWorkersResponseBodyItemsGroups> groups;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>inst-demo</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The Worker name.</p>
         * 
         * <strong>example:</strong>
         * <p>worker-demo</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The Worker status.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The template configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Template")
        public ListWorkersResponseBodyItemsTemplate template;

        /**
         * <p>The Worker version number.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.0.0</p>
         */
        @NameInMap("VersionCode")
        public String versionCode;

        public static ListWorkersResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListWorkersResponseBodyItems self = new ListWorkersResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListWorkersResponseBodyItems setAgentType(String agentType) {
            this.agentType = agentType;
            return this;
        }
        public String getAgentType() {
            return this.agentType;
        }

        public ListWorkersResponseBodyItems setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public ListWorkersResponseBodyItems setGroups(java.util.List<ListWorkersResponseBodyItemsGroups> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<ListWorkersResponseBodyItemsGroups> getGroups() {
            return this.groups;
        }

        public ListWorkersResponseBodyItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListWorkersResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWorkersResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListWorkersResponseBodyItems setTemplate(ListWorkersResponseBodyItemsTemplate template) {
            this.template = template;
            return this;
        }
        public ListWorkersResponseBodyItemsTemplate getTemplate() {
            return this.template;
        }

        public ListWorkersResponseBodyItems setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

    }

}
