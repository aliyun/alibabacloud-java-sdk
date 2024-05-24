// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class EnvironmentSpec extends TeaModel {
    @NameInMap("alias")
    public String alias;

    @NameInMap("infraStackConfig")
    public InfraStackSpec infraStackConfig;

    @NameInMap("isAutoDeploy")
    public Boolean isAutoDeploy;

    @NameInMap("repositoryConfig")
    public RepositoryConfig repositoryConfig;

    @NameInMap("roleArn")
    public String roleArn;

    @NameInMap("serviceOverlay")
    public EnvironmentSpecServiceOverlay serviceOverlay;

    @NameInMap("templateConfig")
    public TemplateConfig templateConfig;

    @NameInMap("type")
    public String type;

    public static EnvironmentSpec build(java.util.Map<String, ?> map) throws Exception {
        EnvironmentSpec self = new EnvironmentSpec();
        return TeaModel.build(map, self);
    }

    public EnvironmentSpec setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public EnvironmentSpec setInfraStackConfig(InfraStackSpec infraStackConfig) {
        this.infraStackConfig = infraStackConfig;
        return this;
    }
    public InfraStackSpec getInfraStackConfig() {
        return this.infraStackConfig;
    }

    public EnvironmentSpec setIsAutoDeploy(Boolean isAutoDeploy) {
        this.isAutoDeploy = isAutoDeploy;
        return this;
    }
    public Boolean getIsAutoDeploy() {
        return this.isAutoDeploy;
    }

    public EnvironmentSpec setRepositoryConfig(RepositoryConfig repositoryConfig) {
        this.repositoryConfig = repositoryConfig;
        return this;
    }
    public RepositoryConfig getRepositoryConfig() {
        return this.repositoryConfig;
    }

    public EnvironmentSpec setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public EnvironmentSpec setServiceOverlay(EnvironmentSpecServiceOverlay serviceOverlay) {
        this.serviceOverlay = serviceOverlay;
        return this;
    }
    public EnvironmentSpecServiceOverlay getServiceOverlay() {
        return this.serviceOverlay;
    }

    public EnvironmentSpec setTemplateConfig(TemplateConfig templateConfig) {
        this.templateConfig = templateConfig;
        return this;
    }
    public TemplateConfig getTemplateConfig() {
        return this.templateConfig;
    }

    public EnvironmentSpec setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class EnvironmentSpecServiceOverlay extends TeaModel {
        @NameInMap("components")
        public java.util.Map<String, ?> components;

        @NameInMap("resources")
        public java.util.Map<String, ?> resources;

        public static EnvironmentSpecServiceOverlay build(java.util.Map<String, ?> map) throws Exception {
            EnvironmentSpecServiceOverlay self = new EnvironmentSpecServiceOverlay();
            return TeaModel.build(map, self);
        }

        public EnvironmentSpecServiceOverlay setComponents(java.util.Map<String, ?> components) {
            this.components = components;
            return this;
        }
        public java.util.Map<String, ?> getComponents() {
            return this.components;
        }

        public EnvironmentSpecServiceOverlay setResources(java.util.Map<String, ?> resources) {
            this.resources = resources;
            return this;
        }
        public java.util.Map<String, ?> getResources() {
            return this.resources;
        }

    }

}
