// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateEdgeInstanceRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("Spec")
    public Integer spec;

    @NameInMap("BizEnable")
    public Boolean bizEnable;

    public static UpdateEdgeInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEdgeInstanceRequest self = new UpdateEdgeInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEdgeInstanceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateEdgeInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateEdgeInstanceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateEdgeInstanceRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public UpdateEdgeInstanceRequest setSpec(Integer spec) {
        this.spec = spec;
        return this;
    }
    public Integer getSpec() {
        return this.spec;
    }

    public UpdateEdgeInstanceRequest setBizEnable(Boolean bizEnable) {
        this.bizEnable = bizEnable;
        return this;
    }
    public Boolean getBizEnable() {
        return this.bizEnable;
    }

}
