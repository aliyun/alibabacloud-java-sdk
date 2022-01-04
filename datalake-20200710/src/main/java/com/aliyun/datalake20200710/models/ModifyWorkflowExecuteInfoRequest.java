// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ModifyWorkflowExecuteInfoRequest extends TeaModel {
    @NameInMap("BlueprintInstanceId")
    public String blueprintInstanceId;

    @NameInMap("ExecuteCapacity")
    public String executeCapacity;

    @NameInMap("ExecuteParameters")
    public String executeParameters;

    @NameInMap("ExecuteType")
    public String executeType;

    public static ModifyWorkflowExecuteInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWorkflowExecuteInfoRequest self = new ModifyWorkflowExecuteInfoRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWorkflowExecuteInfoRequest setBlueprintInstanceId(String blueprintInstanceId) {
        this.blueprintInstanceId = blueprintInstanceId;
        return this;
    }
    public String getBlueprintInstanceId() {
        return this.blueprintInstanceId;
    }

    public ModifyWorkflowExecuteInfoRequest setExecuteCapacity(String executeCapacity) {
        this.executeCapacity = executeCapacity;
        return this;
    }
    public String getExecuteCapacity() {
        return this.executeCapacity;
    }

    public ModifyWorkflowExecuteInfoRequest setExecuteParameters(String executeParameters) {
        this.executeParameters = executeParameters;
        return this;
    }
    public String getExecuteParameters() {
        return this.executeParameters;
    }

    public ModifyWorkflowExecuteInfoRequest setExecuteType(String executeType) {
        this.executeType = executeType;
        return this;
    }
    public String getExecuteType() {
        return this.executeType;
    }

}
