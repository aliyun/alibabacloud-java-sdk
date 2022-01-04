// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UpdateWorkflowExecuteInfoRequest extends TeaModel {
    @NameInMap("BlueprintInstanceId")
    public String blueprintInstanceId;

    @NameInMap("ExecuteCapacity")
    public String executeCapacity;

    @NameInMap("ExecuteParameters")
    public String executeParameters;

    @NameInMap("ExecuteType")
    public String executeType;

    public static UpdateWorkflowExecuteInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkflowExecuteInfoRequest self = new UpdateWorkflowExecuteInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkflowExecuteInfoRequest setBlueprintInstanceId(String blueprintInstanceId) {
        this.blueprintInstanceId = blueprintInstanceId;
        return this;
    }
    public String getBlueprintInstanceId() {
        return this.blueprintInstanceId;
    }

    public UpdateWorkflowExecuteInfoRequest setExecuteCapacity(String executeCapacity) {
        this.executeCapacity = executeCapacity;
        return this;
    }
    public String getExecuteCapacity() {
        return this.executeCapacity;
    }

    public UpdateWorkflowExecuteInfoRequest setExecuteParameters(String executeParameters) {
        this.executeParameters = executeParameters;
        return this;
    }
    public String getExecuteParameters() {
        return this.executeParameters;
    }

    public UpdateWorkflowExecuteInfoRequest setExecuteType(String executeType) {
        this.executeType = executeType;
        return this;
    }
    public String getExecuteType() {
        return this.executeType;
    }

}
