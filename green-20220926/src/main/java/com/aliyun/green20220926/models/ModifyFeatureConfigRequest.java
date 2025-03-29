// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ModifyFeatureConfigRequest extends TeaModel {
    /**
     * <p>Configuration, in JSON format</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>Label meaning</p>
     * 
     * <strong>example:</strong>
     * <p>标签2</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Label value, customer-defined</p>
     * 
     * <strong>example:</strong>
     * <p><strong>config</strong></p>
     */
    @NameInMap("Field")
    public String field;

    /**
     * <p>Region</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>Service code.</p>
     * 
     * <strong>example:</strong>
     * <p>llm_query_moderation</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    /**
     * <p>Type</p>
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
