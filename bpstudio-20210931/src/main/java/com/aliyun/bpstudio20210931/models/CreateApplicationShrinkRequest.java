// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class CreateApplicationShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("AreaId")
    public String areaId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1600765710019</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The parameters that are used to configure the application you want to create. For example, enableMonitor specifies whether to automatically create a CloudMonitor task for the application, and enableReport specifies whether to generate reports.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;enableMonitor&quot;:&quot;0&quot;, &quot;enableReport&quot;:&quot;1&quot;}</p>
     */
    @NameInMap("Configuration")
    public String configurationShrink;

    /**
     * <p>The instances in which you want to create the application. You can create applications in an existing virtual private cloud (VPC).</p>
     */
    @NameInMap("Instances")
    public String instancesShrink;

    /**
     * <p>The name of the application.</p>
     * <ul>
     * <li>The application name must be unique. You can call the <a href="https://www.alibabacloud.com/help/en/bp-studio/latest/api-bpstudio-2021-09-31-listapplication">ListApplication</a> operation to query the existing applications.</li>
     * <li>The application name must be 2 to 128 characters in length. The name must start with a letter and cannot start with <code>http:// or https://</code>. The name can contain letters, digits, underscores (_), and hyphens (-).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cadt-application</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the resource group to which the application you want to create belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmyjt3c5om3hi</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0KSHPM6SJU03TNZP</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The parameter values that are contained in the template. If the template contains no parameter values, the default values are used.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;variable1&quot;:&quot;1&quot;}</p>
     */
    @NameInMap("Variables")
    public String variablesShrink;

    public static CreateApplicationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationShrinkRequest self = new CreateApplicationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationShrinkRequest setAreaId(String areaId) {
        this.areaId = areaId;
        return this;
    }
    public String getAreaId() {
        return this.areaId;
    }

    public CreateApplicationShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateApplicationShrinkRequest setConfigurationShrink(String configurationShrink) {
        this.configurationShrink = configurationShrink;
        return this;
    }
    public String getConfigurationShrink() {
        return this.configurationShrink;
    }

    public CreateApplicationShrinkRequest setInstancesShrink(String instancesShrink) {
        this.instancesShrink = instancesShrink;
        return this;
    }
    public String getInstancesShrink() {
        return this.instancesShrink;
    }

    public CreateApplicationShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateApplicationShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateApplicationShrinkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CreateApplicationShrinkRequest setVariablesShrink(String variablesShrink) {
        this.variablesShrink = variablesShrink;
        return this;
    }
    public String getVariablesShrink() {
        return this.variablesShrink;
    }

}
