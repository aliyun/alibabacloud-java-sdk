// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UpdateModelRequest extends TeaModel {
    @NameInMap("ModelId")
    @Validation(required = true)
    public Long modelId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Hardware")
    public String hardware;

    @NameInMap("Description")
    public String description;

    public static UpdateModelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelRequest self = new UpdateModelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateModelRequest setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }
    public Long getModelId() {
        return this.modelId;
    }

    public UpdateModelRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateModelRequest setHardware(String hardware) {
        this.hardware = hardware;
        return this;
    }
    public String getHardware() {
        return this.hardware;
    }

    public UpdateModelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
