// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class ListFlowsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Flows")
    public java.util.List<ListFlowsResponseBodyFlows> flows;

    public static ListFlowsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowsResponseBody self = new ListFlowsResponseBody();
        return TeaModel.build(map, self);
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

    public ListFlowsResponseBody setFlows(java.util.List<ListFlowsResponseBodyFlows> flows) {
        this.flows = flows;
        return this;
    }
    public java.util.List<ListFlowsResponseBodyFlows> getFlows() {
        return this.flows;
    }

    public static class ListFlowsResponseBodyFlows extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Definition")
        public String definition;

        @NameInMap("RoleArn")
        public String roleArn;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExternalStorageLocation")
        public String externalStorageLocation;

        @NameInMap("Name")
        public String name;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("LastModifiedTime")
        public String lastModifiedTime;

        @NameInMap("Id")
        public String id;

        public static ListFlowsResponseBodyFlows build(java.util.Map<String, ?> map) throws Exception {
            ListFlowsResponseBodyFlows self = new ListFlowsResponseBodyFlows();
            return TeaModel.build(map, self);
        }

        public ListFlowsResponseBodyFlows setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListFlowsResponseBodyFlows setDefinition(String definition) {
            this.definition = definition;
            return this;
        }
        public String getDefinition() {
            return this.definition;
        }

        public ListFlowsResponseBodyFlows setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public ListFlowsResponseBodyFlows setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListFlowsResponseBodyFlows setExternalStorageLocation(String externalStorageLocation) {
            this.externalStorageLocation = externalStorageLocation;
            return this;
        }
        public String getExternalStorageLocation() {
            return this.externalStorageLocation;
        }

        public ListFlowsResponseBodyFlows setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFlowsResponseBodyFlows setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListFlowsResponseBodyFlows setLastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public String getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        public ListFlowsResponseBodyFlows setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
