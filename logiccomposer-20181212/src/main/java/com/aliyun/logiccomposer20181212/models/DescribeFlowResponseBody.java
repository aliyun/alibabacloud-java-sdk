// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class DescribeFlowResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("FlowId")
    public String flowId;

    @NameInMap("Description")
    public String description;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Version")
    public Integer version;

    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("Definition")
    public String definition;

    @NameInMap("EditMode")
    public String editMode;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("UpdatedAt")
    public String updatedAt;

    @NameInMap("Source")
    public String source;

    @NameInMap("Name")
    public String name;

    public static DescribeFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowResponseBody self = new DescribeFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFlowResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeFlowResponseBody setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public DescribeFlowResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFlowResponseBody setVersion(Integer version) {
        this.version = version;
        return this;
    }
    public Integer getVersion() {
        return this.version;
    }

    public DescribeFlowResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public DescribeFlowResponseBody setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public DescribeFlowResponseBody setEditMode(String editMode) {
        this.editMode = editMode;
        return this;
    }
    public String getEditMode() {
        return this.editMode;
    }

    public DescribeFlowResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeFlowResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public DescribeFlowResponseBody setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DescribeFlowResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
