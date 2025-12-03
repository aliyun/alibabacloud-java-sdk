// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GenerateModuleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Resource</p>
     */
    @NameInMap("generateSource")
    public String generateSource;

    @NameInMap("parameters")
    public java.util.Map<String, ?> parameters;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>terraform</p>
     */
    @NameInMap("syntax")
    public String syntax;

    /**
     * <strong>example:</strong>
     * <p>generateSource ==</p>
     */
    @NameInMap("template")
    public String template;

    /**
     * <strong>example:</strong>
     * <p>1.189.0</p>
     */
    @NameInMap("terraformProviderVersion")
    public String terraformProviderVersion;

    /**
     * <strong>example:</strong>
     * <p>alicloud_db_instance</p>
     */
    @NameInMap("terraformResourceType")
    public String terraformResourceType;

    public static GenerateModuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateModuleRequest self = new GenerateModuleRequest();
        return TeaModel.build(map, self);
    }

    public GenerateModuleRequest setGenerateSource(String generateSource) {
        this.generateSource = generateSource;
        return this;
    }
    public String getGenerateSource() {
        return this.generateSource;
    }

    public GenerateModuleRequest setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    public GenerateModuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GenerateModuleRequest setSyntax(String syntax) {
        this.syntax = syntax;
        return this;
    }
    public String getSyntax() {
        return this.syntax;
    }

    public GenerateModuleRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

    public GenerateModuleRequest setTerraformProviderVersion(String terraformProviderVersion) {
        this.terraformProviderVersion = terraformProviderVersion;
        return this;
    }
    public String getTerraformProviderVersion() {
        return this.terraformProviderVersion;
    }

    public GenerateModuleRequest setTerraformResourceType(String terraformResourceType) {
        this.terraformResourceType = terraformResourceType;
        return this;
    }
    public String getTerraformResourceType() {
        return this.terraformResourceType;
    }

}
