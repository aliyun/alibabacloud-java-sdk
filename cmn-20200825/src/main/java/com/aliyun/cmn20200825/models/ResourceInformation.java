// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ResourceInformation extends TeaModel {
    // 创建时间
    @NameInMap("CreateTime")
    public String createTime;

    // 资源一级ID
    @NameInMap("ResourceInformationId")
    public String resourceInformationId;

    // 更新时间
    @NameInMap("UpdateTime")
    public String updateTime;

    // 资源类型
    @NameInMap("ResourceType")
    public String resourceType;

    // 资源属性
    @NameInMap("ResourceAttribute")
    public String resourceAttribute;

    // 建设项目资源id
    @NameInMap("SetupProjectId")
    public String setupProjectId;

    // 信息
    @NameInMap("Information")
    public java.util.List<ResourceInformationInformation> information;

    // 架构id
    @NameInMap("ArchitectureId")
    public String architectureId;

    public static ResourceInformation build(java.util.Map<String, ?> map) throws Exception {
        ResourceInformation self = new ResourceInformation();
        return TeaModel.build(map, self);
    }

    public ResourceInformation setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public ResourceInformation setResourceInformationId(String resourceInformationId) {
        this.resourceInformationId = resourceInformationId;
        return this;
    }
    public String getResourceInformationId() {
        return this.resourceInformationId;
    }

    public ResourceInformation setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public ResourceInformation setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ResourceInformation setResourceAttribute(String resourceAttribute) {
        this.resourceAttribute = resourceAttribute;
        return this;
    }
    public String getResourceAttribute() {
        return this.resourceAttribute;
    }

    public ResourceInformation setSetupProjectId(String setupProjectId) {
        this.setupProjectId = setupProjectId;
        return this;
    }
    public String getSetupProjectId() {
        return this.setupProjectId;
    }

    public ResourceInformation setInformation(java.util.List<ResourceInformationInformation> information) {
        this.information = information;
        return this;
    }
    public java.util.List<ResourceInformationInformation> getInformation() {
        return this.information;
    }

    public ResourceInformation setArchitectureId(String architectureId) {
        this.architectureId = architectureId;
        return this;
    }
    public String getArchitectureId() {
        return this.architectureId;
    }

    public static class ResourceInformationInformation extends TeaModel {
        // 键
        @NameInMap("Key")
        public String key;

        // 键属性
        @NameInMap("KeyAttribute")
        public String keyAttribute;

        // 键动作
        @NameInMap("KeyAction")
        public String keyAction;

        // 键描述
        @NameInMap("KeyDescription")
        public String keyDescription;

        public static ResourceInformationInformation build(java.util.Map<String, ?> map) throws Exception {
            ResourceInformationInformation self = new ResourceInformationInformation();
            return TeaModel.build(map, self);
        }

        public ResourceInformationInformation setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ResourceInformationInformation setKeyAttribute(String keyAttribute) {
            this.keyAttribute = keyAttribute;
            return this;
        }
        public String getKeyAttribute() {
            return this.keyAttribute;
        }

        public ResourceInformationInformation setKeyAction(String keyAction) {
            this.keyAction = keyAction;
            return this;
        }
        public String getKeyAction() {
            return this.keyAction;
        }

        public ResourceInformationInformation setKeyDescription(String keyDescription) {
            this.keyDescription = keyDescription;
            return this;
        }
        public String getKeyDescription() {
            return this.keyDescription;
        }

    }

}
