// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ValuateTemplateRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     */
    @NameInMap("AreaId")
    public String areaId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The instances to be replaced.</p>
     */
    @NameInMap("Instances")
    public java.util.List<ValuateTemplateRequestInstances> instances;

    /**
     * <p>The ID of the resource group to which the application belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The template ID.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The parameter values that are contained in the template. If the template contains no parameter values, the default values are used.</p>
     */
    @NameInMap("Variables")
    public java.util.Map<String, String> variables;

    public static ValuateTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ValuateTemplateRequest self = new ValuateTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ValuateTemplateRequest setAreaId(String areaId) {
        this.areaId = areaId;
        return this;
    }
    public String getAreaId() {
        return this.areaId;
    }

    public ValuateTemplateRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ValuateTemplateRequest setInstances(java.util.List<ValuateTemplateRequestInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<ValuateTemplateRequestInstances> getInstances() {
        return this.instances;
    }

    public ValuateTemplateRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ValuateTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public ValuateTemplateRequest setVariables(java.util.Map<String, String> variables) {
        this.variables = variables;
        return this;
    }
    public java.util.Map<String, String> getVariables() {
        return this.variables;
    }

    public static class ValuateTemplateRequestInstances extends TeaModel {
        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the application instance that is displayed on the diagram.</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The instance type.</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        public static ValuateTemplateRequestInstances build(java.util.Map<String, ?> map) throws Exception {
            ValuateTemplateRequestInstances self = new ValuateTemplateRequestInstances();
            return TeaModel.build(map, self);
        }

        public ValuateTemplateRequestInstances setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ValuateTemplateRequestInstances setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ValuateTemplateRequestInstances setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

    }

}
