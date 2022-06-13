// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UpdateBlueprintInstanceRequest extends TeaModel {
    @NameInMap("ExecuteCapacity")
    public Integer executeCapacity;

    @NameInMap("ExecuteConcurrency")
    public Integer executeConcurrency;

    @NameInMap("ExecuteParameters")
    public String executeParameters;

    @NameInMap("ExecuteType")
    public String executeType;

    @NameInMap("Id")
    public String id;

    public static UpdateBlueprintInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBlueprintInstanceRequest self = new UpdateBlueprintInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBlueprintInstanceRequest setExecuteCapacity(Integer executeCapacity) {
        this.executeCapacity = executeCapacity;
        return this;
    }
    public Integer getExecuteCapacity() {
        return this.executeCapacity;
    }

    public UpdateBlueprintInstanceRequest setExecuteConcurrency(Integer executeConcurrency) {
        this.executeConcurrency = executeConcurrency;
        return this;
    }
    public Integer getExecuteConcurrency() {
        return this.executeConcurrency;
    }

    public UpdateBlueprintInstanceRequest setExecuteParameters(String executeParameters) {
        this.executeParameters = executeParameters;
        return this;
    }
    public String getExecuteParameters() {
        return this.executeParameters;
    }

    public UpdateBlueprintInstanceRequest setExecuteType(String executeType) {
        this.executeType = executeType;
        return this;
    }
    public String getExecuteType() {
        return this.executeType;
    }

    public UpdateBlueprintInstanceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
