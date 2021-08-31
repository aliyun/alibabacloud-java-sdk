// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateHostGroupRequest extends TeaModel {
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

    public static UpdateHostGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHostGroupRequest self = new UpdateHostGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHostGroupRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UpdateHostGroupRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public UpdateHostGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateHostGroupRequest setServiceConnectionId(Long serviceConnectionId) {
        this.serviceConnectionId = serviceConnectionId;
        return this;
    }
    public Long getServiceConnectionId() {
        return this.serviceConnectionId;
    }

    public UpdateHostGroupRequest setTagIds(String tagIds) {
        this.tagIds = tagIds;
        return this;
    }
    public String getTagIds() {
        return this.tagIds;
    }

    public UpdateHostGroupRequest setEcsType(String ecsType) {
        this.ecsType = ecsType;
        return this;
    }
    public String getEcsType() {
        return this.ecsType;
    }

    public UpdateHostGroupRequest setEcsLabelKey(String ecsLabelKey) {
        this.ecsLabelKey = ecsLabelKey;
        return this;
    }
    public String getEcsLabelKey() {
        return this.ecsLabelKey;
    }

    public UpdateHostGroupRequest setEcsLabelValue(String ecsLabelValue) {
        this.ecsLabelValue = ecsLabelValue;
        return this;
    }
    public String getEcsLabelValue() {
        return this.ecsLabelValue;
    }

    public UpdateHostGroupRequest setAliyunRegion(String aliyunRegion) {
        this.aliyunRegion = aliyunRegion;
        return this;
    }
    public String getAliyunRegion() {
        return this.aliyunRegion;
    }

    public UpdateHostGroupRequest setMachineInfos(String machineInfos) {
        this.machineInfos = machineInfos;
        return this;
    }
    public String getMachineInfos() {
        return this.machineInfos;
    }

}
