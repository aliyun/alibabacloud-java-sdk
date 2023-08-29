// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class ListFlowsResponseBody extends TeaModel {
    @NameInMap("Flows")
    public java.util.List<ListFlowsResponseBodyFlows> flows;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static ListFlowsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowsResponseBody self = new ListFlowsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowsResponseBody setFlows(java.util.List<ListFlowsResponseBodyFlows> flows) {
        this.flows = flows;
        return this;
    }
    public java.util.List<ListFlowsResponseBodyFlows> getFlows() {
        return this.flows;
    }

    public ListFlowsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListFlowsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFlowsResponseBodyFlows extends TeaModel {
        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Definition")
        public String definition;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExecutionMode")
        public String executionMode;

        @NameInMap("Id")
        public String id;

        @NameInMap("LastModifiedTime")
        public String lastModifiedTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("RoleArn")
        public String roleArn;

        @NameInMap("Type")
        public String type;

        public static ListFlowsResponseBodyFlows build(java.util.Map<String, ?> map) throws Exception {
            ListFlowsResponseBodyFlows self = new ListFlowsResponseBodyFlows();
            return TeaModel.build(map, self);
        }

        public ListFlowsResponseBodyFlows setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListFlowsResponseBodyFlows setDefinition(String definition) {
            this.definition = definition;
            return this;
        }
        public String getDefinition() {
            return this.definition;
        }

        public ListFlowsResponseBodyFlows setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListFlowsResponseBodyFlows setExecutionMode(String executionMode) {
            this.executionMode = executionMode;
            return this;
        }
        public String getExecutionMode() {
            return this.executionMode;
        }

        public ListFlowsResponseBodyFlows setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListFlowsResponseBodyFlows setLastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public String getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        public ListFlowsResponseBodyFlows setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFlowsResponseBodyFlows setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public ListFlowsResponseBodyFlows setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
