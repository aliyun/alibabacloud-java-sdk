// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class DescribeFlowResponseBody extends TeaModel {
    /**
     * <p>The time when the flow was created.</p>
     */
    @NameInMap("CreatedTime")
    public String createdTime;

    /**
     * <p>The definition of the flow. The definition must comply with the Flow Definition Language (FDL) syntax.</p>
     */
    @NameInMap("Definition")
    public String definition;

    /**
     * <p>The description of the flow.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The execution mode or the enumeration type. Valid values: Express and Standard. The value Standard indicates an empty string.</p>
     */
    @NameInMap("ExecutionMode")
    public String executionMode;

    /**
     * <p>The unique ID of the flow.</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The time when the flow was last modified.</p>
     */
    @NameInMap("LastModifiedTime")
    public String lastModifiedTime;

    /**
     * <p>The name of the flow.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role.</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    /**
     * <p>The type of the flow. Valid value: **FDL**.</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowResponseBody self = new DescribeFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFlowResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribeFlowResponseBody setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public DescribeFlowResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeFlowResponseBody setExecutionMode(String executionMode) {
        this.executionMode = executionMode;
        return this;
    }
    public String getExecutionMode() {
        return this.executionMode;
    }

    public DescribeFlowResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeFlowResponseBody setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public DescribeFlowResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFlowResponseBody setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public DescribeFlowResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
