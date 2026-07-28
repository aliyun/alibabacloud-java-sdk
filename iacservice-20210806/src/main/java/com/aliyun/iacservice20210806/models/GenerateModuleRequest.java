// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GenerateModuleRequest extends TeaModel {
    /**
     * <p>The generation source. Valid values:</p>
     * <ul>
     * <li>Resource: Generates a Terraform HCL template based on resource properties.</li>
     * <li>VariableToCode: Generates a final Terraform HCL template by combining variables with an existing Terraform HCL template.</li>
     * <li>CodeToVariable: Extracts variable information from a Terraform HCL template.</li>
     * <li>Module: Generates Terraform Module code based on variables.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Resource</p>
     */
    @NameInMap("generateSource")
    public String generateSource;

    /**
     * <p>The collection of parameters, passed in key:value format, such as {&quot;vpc_name&quot;:&quot;vpc-test&quot;}.</p>
     */
    @NameInMap("parameters")
    public java.util.Map<String, ?> parameters;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The syntax. Valid values:</p>
     * <ul>
     * <li>hcl (default).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>hcl</p>
     */
    @NameInMap("syntax")
    public String syntax;

    /**
     * <p>The existing Terraform HCL template content.</p>
     * 
     * <strong>example:</strong>
     * <p>terraform {
     * }</p>
     */
    @NameInMap("template")
    public String template;

    /**
     * <p>The Terraform provider version.</p>
     * 
     * <strong>example:</strong>
     * <p>1.260.0</p>
     */
    @NameInMap("terraformProviderVersion")
    public String terraformProviderVersion;

    /**
     * <p>The Terraform resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>alicloud_vpc</p>
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
