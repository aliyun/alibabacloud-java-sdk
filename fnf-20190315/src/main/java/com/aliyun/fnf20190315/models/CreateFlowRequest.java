// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class CreateFlowRequest extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Definition")
    public String definition;

    @NameInMap("Description")
    public String description;

    @NameInMap("Type")
    public String type;

    @NameInMap("RoleArn")
    public String roleArn;

    @NameInMap("ExternalStorageLocation")
    public String externalStorageLocation;

    public static CreateFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowRequest self = new CreateFlowRequest();
        return TeaModel.build(map, self);
    }

    public CreateFlowRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFlowRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateFlowRequest setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public CreateFlowRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateFlowRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateFlowRequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public CreateFlowRequest setExternalStorageLocation(String externalStorageLocation) {
        this.externalStorageLocation = externalStorageLocation;
        return this;
    }
    public String getExternalStorageLocation() {
        return this.externalStorageLocation;
    }

}
