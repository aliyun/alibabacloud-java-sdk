// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class CreateApplicationRequest extends TeaModel {
    // 区域ID
    @NameInMap("AreaId")
    public String areaId;

    // 幂等标记
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Configuration")
    public java.util.Map<String, ?> configuration;

    // 待替换实例列表
    @NameInMap("Instances")
    public java.util.List<CreateApplicationRequestInstances> instances;

    // 新建应用名
    @NameInMap("Name")
    public String name;

    // 应用所属资源组ID
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    // 模板ID
    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("Variables")
    public java.util.Map<String, ?> variables;

    public static CreateApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationRequest self = new CreateApplicationRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationRequest setAreaId(String areaId) {
        this.areaId = areaId;
        return this;
    }
    public String getAreaId() {
        return this.areaId;
    }

    public CreateApplicationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateApplicationRequest setConfiguration(java.util.Map<String, ?> configuration) {
        this.configuration = configuration;
        return this;
    }
    public java.util.Map<String, ?> getConfiguration() {
        return this.configuration;
    }

    public CreateApplicationRequest setInstances(java.util.List<CreateApplicationRequestInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<CreateApplicationRequestInstances> getInstances() {
        return this.instances;
    }

    public CreateApplicationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateApplicationRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateApplicationRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CreateApplicationRequest setVariables(java.util.Map<String, ?> variables) {
        this.variables = variables;
        return this;
    }
    public java.util.Map<String, ?> getVariables() {
        return this.variables;
    }

    public static class CreateApplicationRequestInstances extends TeaModel {
        // 实例ID
        @NameInMap("Id")
        public String id;

        // 图上实例名
        @NameInMap("NodeName")
        public String nodeName;

        // 实例类型
        @NameInMap("NodeType")
        public String nodeType;

        public static CreateApplicationRequestInstances build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationRequestInstances self = new CreateApplicationRequestInstances();
            return TeaModel.build(map, self);
        }

        public CreateApplicationRequestInstances setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateApplicationRequestInstances setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public CreateApplicationRequestInstances setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

    }

}
