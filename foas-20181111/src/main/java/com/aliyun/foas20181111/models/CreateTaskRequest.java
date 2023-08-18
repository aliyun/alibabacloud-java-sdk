// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class CreateTaskRequest extends TeaModel {
    @NameInMap("name")
    public String name;

    @NameInMap("targetNamespace")
    public String targetNamespace;

    @NameInMap("targetUserId")
    public String targetUserId;

    @NameInMap("targetWorkspace")
    public String targetWorkspace;

    @NameInMap("transferType")
    public Integer transferType;

    public static CreateTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskRequest self = new CreateTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTaskRequest setTargetNamespace(String targetNamespace) {
        this.targetNamespace = targetNamespace;
        return this;
    }
    public String getTargetNamespace() {
        return this.targetNamespace;
    }

    public CreateTaskRequest setTargetUserId(String targetUserId) {
        this.targetUserId = targetUserId;
        return this;
    }
    public String getTargetUserId() {
        return this.targetUserId;
    }

    public CreateTaskRequest setTargetWorkspace(String targetWorkspace) {
        this.targetWorkspace = targetWorkspace;
        return this;
    }
    public String getTargetWorkspace() {
        return this.targetWorkspace;
    }

    public CreateTaskRequest setTransferType(Integer transferType) {
        this.transferType = transferType;
        return this;
    }
    public Integer getTransferType() {
        return this.transferType;
    }

}
