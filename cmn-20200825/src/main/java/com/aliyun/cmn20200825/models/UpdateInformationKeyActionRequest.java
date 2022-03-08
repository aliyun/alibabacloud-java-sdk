// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateInformationKeyActionRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    // 键
    @NameInMap("Key")
    public String key;

    // 动作
    @NameInMap("KeyAction")
    public String keyAction;

    // 资源id
    @NameInMap("ResourceInformationId")
    public String resourceInformationId;

    // 建设项目id
    @NameInMap("SetupProjectId")
    public String setupProjectId;

    // 键值
    @NameInMap("Value")
    public String value;

    public static UpdateInformationKeyActionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInformationKeyActionRequest self = new UpdateInformationKeyActionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInformationKeyActionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateInformationKeyActionRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public UpdateInformationKeyActionRequest setKeyAction(String keyAction) {
        this.keyAction = keyAction;
        return this;
    }
    public String getKeyAction() {
        return this.keyAction;
    }

    public UpdateInformationKeyActionRequest setResourceInformationId(String resourceInformationId) {
        this.resourceInformationId = resourceInformationId;
        return this;
    }
    public String getResourceInformationId() {
        return this.resourceInformationId;
    }

    public UpdateInformationKeyActionRequest setSetupProjectId(String setupProjectId) {
        this.setupProjectId = setupProjectId;
        return this;
    }
    public String getSetupProjectId() {
        return this.setupProjectId;
    }

    public UpdateInformationKeyActionRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
