// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateTriggerRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Source")
    public String source;

    @NameInMap("FileIds")
    public String fileIds;

    @NameInMap("FunctionIds")
    public String functionIds;

    @NameInMap("InvocationMode")
    public Integer invocationMode;

    @NameInMap("Sandbox")
    public Integer sandbox;

    @NameInMap("Production")
    public Integer production;

    public static CreateTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTriggerRequest self = new CreateTriggerRequest();
        return TeaModel.build(map, self);
    }

    public CreateTriggerRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateTriggerRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateTriggerRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateTriggerRequest setFileIds(String fileIds) {
        this.fileIds = fileIds;
        return this;
    }
    public String getFileIds() {
        return this.fileIds;
    }

    public CreateTriggerRequest setFunctionIds(String functionIds) {
        this.functionIds = functionIds;
        return this;
    }
    public String getFunctionIds() {
        return this.functionIds;
    }

    public CreateTriggerRequest setInvocationMode(Integer invocationMode) {
        this.invocationMode = invocationMode;
        return this;
    }
    public Integer getInvocationMode() {
        return this.invocationMode;
    }

    public CreateTriggerRequest setSandbox(Integer sandbox) {
        this.sandbox = sandbox;
        return this;
    }
    public Integer getSandbox() {
        return this.sandbox;
    }

    public CreateTriggerRequest setProduction(Integer production) {
        this.production = production;
        return this;
    }
    public Integer getProduction() {
        return this.production;
    }

}
