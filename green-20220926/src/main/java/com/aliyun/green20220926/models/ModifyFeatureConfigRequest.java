// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ModifyFeatureConfigRequest extends TeaModel {
    /**
     * <p>The configuration in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The tag description.</p>
     * 
     * <strong>example:</strong>
     * <p>Tag 2</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The custom tag value. Valid values for Field must be obtained by calling the GetFeatureConfig API, such as labels and <strong>option</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>labels</p>
     */
    @NameInMap("Field")
    public String field;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The service code.</p>
     * 
     * <strong>example:</strong>
     * <p>llm_query_moderation</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    /**
     * <p>The type. This parameter is actually required. If it is not provided, the API returns the error \&quot;type may not be empty\&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>custom_llm_template</p>
     */
    @NameInMap("Type")
    public String type;

    public static ModifyFeatureConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyFeatureConfigRequest self = new ModifyFeatureConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyFeatureConfigRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public ModifyFeatureConfigRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyFeatureConfigRequest setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public ModifyFeatureConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyFeatureConfigRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ModifyFeatureConfigRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public ModifyFeatureConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
