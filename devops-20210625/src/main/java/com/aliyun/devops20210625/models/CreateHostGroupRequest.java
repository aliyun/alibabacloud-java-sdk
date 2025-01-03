// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateHostGroupRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("aliyunRegion")
    public String aliyunRegion;

    /**
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("ecsLabelKey")
    public String ecsLabelKey;

    /**
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("ecsLabelValue")
    public String ecsLabelValue;

    /**
     * <strong>example:</strong>
     * <p>ECS_ALIYUN</p>
     */
    @NameInMap("ecsType")
    public String ecsType;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("envId")
    public String envId;

    /**
     * <strong>example:</strong>
     * <p>[{&quot;aliyunRegionId&quot;:&quot;cn-beijing&quot;,&quot;machineSn&quot;:&quot;i-sssssss&quot;,&quot;instanceName&quot;:&quot;ceshi&quot;,&quot;ip&quot;:&quot;120.0.0.0&quot;}]</p>
     */
    @NameInMap("machineInfos")
    public String machineInfos;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("serviceConnectionId")
    public Long serviceConnectionId;

    /**
     * <strong>example:</strong>
     * <p>12,234</p>
     */
    @NameInMap("tagIds")
    public String tagIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("type")
    public String type;

    public static CreateHostGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHostGroupRequest self = new CreateHostGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateHostGroupRequest setAliyunRegion(String aliyunRegion) {
        this.aliyunRegion = aliyunRegion;
        return this;
    }
    public String getAliyunRegion() {
        return this.aliyunRegion;
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

    public CreateHostGroupRequest setEcsType(String ecsType) {
        this.ecsType = ecsType;
        return this;
    }
    public String getEcsType() {
        return this.ecsType;
    }

    public CreateHostGroupRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public CreateHostGroupRequest setMachineInfos(String machineInfos) {
        this.machineInfos = machineInfos;
        return this;
    }
    public String getMachineInfos() {
        return this.machineInfos;
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

    public CreateHostGroupRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
