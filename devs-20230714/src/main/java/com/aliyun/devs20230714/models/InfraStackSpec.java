// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class InfraStackSpec extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("regionID")
    public String regionID;

    @NameInMap("roleArn")
    public String roleArn;

    @NameInMap("templateName")
    public String templateName;

    @NameInMap("templateSpec")
    public InfraStackSpecTemplateSpec templateSpec;

    @NameInMap("templateVariables")
    public java.util.Map<String, ?> templateVariables;

    public static InfraStackSpec build(java.util.Map<String, ?> map) throws Exception {
        InfraStackSpec self = new InfraStackSpec();
        return TeaModel.build(map, self);
    }

    public InfraStackSpec setRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }
    public String getRegionID() {
        return this.regionID;
    }

    public InfraStackSpec setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public InfraStackSpec setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public InfraStackSpec setTemplateSpec(InfraStackSpecTemplateSpec templateSpec) {
        this.templateSpec = templateSpec;
        return this;
    }
    public InfraStackSpecTemplateSpec getTemplateSpec() {
        return this.templateSpec;
    }

    public InfraStackSpec setTemplateVariables(java.util.Map<String, ?> templateVariables) {
        this.templateVariables = templateVariables;
        return this;
    }
    public java.util.Map<String, ?> getTemplateVariables() {
        return this.templateVariables;
    }

    public static class InfraStackSpecTemplateSpec extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("engine")
        public String engine;

        public static InfraStackSpecTemplateSpec build(java.util.Map<String, ?> map) throws Exception {
            InfraStackSpecTemplateSpec self = new InfraStackSpecTemplateSpec();
            return TeaModel.build(map, self);
        }

        public InfraStackSpecTemplateSpec setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public InfraStackSpecTemplateSpec setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

    }

}
