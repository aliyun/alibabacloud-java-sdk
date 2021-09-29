// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class CreateApplicationRequest extends TeaModel {
    // 模板ID
    @NameInMap("TemplateId")
    public String templateId;

    // 幂等标记
    @NameInMap("ClientToken")
    public String clientToken;

    // 新建应用名
    @NameInMap("Name")
    public String name;

    // 区域ID
    @NameInMap("AreaId")
    public String areaId;

    // 待替换实例列表
    @NameInMap("Instances")
    public java.util.List<CreateApplicationRequestInstances> instances;

    // 应用所属资源组ID
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static CreateApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationRequest self = new CreateApplicationRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CreateApplicationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateApplicationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateApplicationRequest setAreaId(String areaId) {
        this.areaId = areaId;
        return this;
    }
    public String getAreaId() {
        return this.areaId;
    }

    public CreateApplicationRequest setInstances(java.util.List<CreateApplicationRequestInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<CreateApplicationRequestInstances> getInstances() {
        return this.instances;
    }

    public CreateApplicationRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static class CreateApplicationRequestInstances extends TeaModel {
        // 实例类型
        @NameInMap("NodeType")
        public String nodeType;

        // 图上实例名
        @NameInMap("NodeName")
        public String nodeName;

        // 实例ID
        @NameInMap("Id")
        public String id;

        public static CreateApplicationRequestInstances build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationRequestInstances self = new CreateApplicationRequestInstances();
            return TeaModel.build(map, self);
        }

        public CreateApplicationRequestInstances setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public CreateApplicationRequestInstances setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public CreateApplicationRequestInstances setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
