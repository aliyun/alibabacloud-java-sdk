// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class DescribeFlowResponseBody extends TeaModel {
    @NameInMap("Type")
    public String type;

    @NameInMap("Description")
    public String description;

    @NameInMap("CreatedTime")
    public String createdTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Definition")
    public String definition;

    @NameInMap("LastModifiedTime")
    public String lastModifiedTime;

    @NameInMap("Id")
    public String id;

    @NameInMap("ExternalStorageLocation")
    public String externalStorageLocation;

    @NameInMap("RoleArn")
    public String roleArn;

    @NameInMap("Name")
    public String name;

    public static DescribeFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowResponseBody self = new DescribeFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFlowResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeFlowResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeFlowResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribeFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFlowResponseBody setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public DescribeFlowResponseBody setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public DescribeFlowResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeFlowResponseBody setExternalStorageLocation(String externalStorageLocation) {
        this.externalStorageLocation = externalStorageLocation;
        return this;
    }
    public String getExternalStorageLocation() {
        return this.externalStorageLocation;
    }

    public DescribeFlowResponseBody setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public DescribeFlowResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
