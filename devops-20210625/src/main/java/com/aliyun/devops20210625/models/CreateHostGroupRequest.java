// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateHostGroupRequest extends TeaModel {
    @NameInMap("type")
    public String type;

    @NameInMap("envId")
    public String envId;

    @NameInMap("name")
    public String name;

    @NameInMap("serviceConnectionId")
    public Long serviceConnectionId;

    @NameInMap("tagIds")
    public String tagIds;

    @NameInMap("ecsType")
    public String ecsType;

    @NameInMap("ecsLabelKey")
    public String ecsLabelKey;

    @NameInMap("ecsLabelValue")
    public String ecsLabelValue;

    @NameInMap("aliyunRegion")
    public String aliyunRegion;

    @NameInMap("machineInfos")
    public String machineInfos;

    public static CreateHostGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHostGroupRequest self = new CreateHostGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateHostGroupRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateHostGroupRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public CreateHostGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateHostGroupRequest setServiceConnectionId(Long serviceConnectionId) {
        this.serviceConnectionId = serviceConnectionId;
        return this;
    }
    public Long getServiceConnectionId() {
        return this.serviceConnectionId;
    }

    public CreateHostGroupRequest setTagIds(String tagIds) {
        this.tagIds = tagIds;
        return this;
    }
    public String getTagIds() {
        return this.tagIds;
    }

    public CreateHostGroupRequest setEcsType(String ecsType) {
        this.ecsType = ecsType;
        return this;
    }
    public String getEcsType() {
        return this.ecsType;
    }

    public CreateHostGroupRequest setEcsLabelKey(String ecsLabelKey) {
        this.ecsLabelKey = ecsLabelKey;
        return this;
    }
    public String getEcsLabelKey() {
        return this.ecsLabelKey;
    }

    public CreateHostGroupRequest setEcsLabelValue(String ecsLabelValue) {
        this.ecsLabelValue = ecsLabelValue;
        return this;
    }
    public String getEcsLabelValue() {
        return this.ecsLabelValue;
    }

    public CreateHostGroupRequest setAliyunRegion(String aliyunRegion) {
        this.aliyunRegion = aliyunRegion;
        return this;
    }
    public String getAliyunRegion() {
        return this.aliyunRegion;
    }

    public CreateHostGroupRequest setMachineInfos(String machineInfos) {
        this.machineInfos = machineInfos;
        return this;
    }
    public String getMachineInfos() {
        return this.machineInfos;
    }

}
