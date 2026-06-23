// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class MetaEntityAttributeDef extends TeaModel {
    /**
     * <p>Enumeration values. Required when Type is ENUM.</p>
     */
    @NameInMap("AllowedValues")
    public java.util.List<String> allowedValues;

    /**
     * <p>Attribute description</p>
     * 
     * <strong>example:</strong>
     * <p>层级描述</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Indicates whether the attribute appears on the product page. Default is true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DisplayEnabled")
    public Boolean displayEnabled;

    /**
     * <p>Display name. It can be up to 32 characters long.</p>
     * 
     * <strong>example:</strong>
     * <p>API编码</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>Indicates whether the value is optional. Default is true.&gt;Notice:  Validation occurs when creating an entity. If this value is false and no value is provided during creation, validation fails and an error is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsOptional")
    public Boolean isOptional;

    /**
     * <p>Attribute identifier. It can contain letters, digits, and underscores. It must start with a letter or digit and be up to 64 characters long.</p>
     * 
     * <strong>example:</strong>
     * <p>apiCode</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Indicates whether the attribute can be used as a filter on the search page. Default is false.</p>
     * <p>Only attributes of type STRING, DATE, ENUM, ARRAY, INT, or BOOLEAN support this setting.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SearchFilterEnabled")
    public Boolean searchFilterEnabled;

    /**
     * <p>Attribute type. Supported types include STRING, TEXT, INT, FLOAT, BOOLEAN, DATE, ARRAY, ENUM, and JSON.</p>
     * 
     * <strong>example:</strong>
     * <p>STRING</p>
     */
    @NameInMap("Type")
    public String type;

    public static MetaEntityAttributeDef build(java.util.Map<String, ?> map) throws Exception {
        MetaEntityAttributeDef self = new MetaEntityAttributeDef();
        return TeaModel.build(map, self);
    }

    public MetaEntityAttributeDef setAllowedValues(java.util.List<String> allowedValues) {
        this.allowedValues = allowedValues;
        return this;
    }
    public java.util.List<String> getAllowedValues() {
        return this.allowedValues;
    }

    public MetaEntityAttributeDef setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public MetaEntityAttributeDef setDisplayEnabled(Boolean displayEnabled) {
        this.displayEnabled = displayEnabled;
        return this;
    }
    public Boolean getDisplayEnabled() {
        return this.displayEnabled;
    }

    public MetaEntityAttributeDef setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public MetaEntityAttributeDef setIsOptional(Boolean isOptional) {
        this.isOptional = isOptional;
        return this;
    }
    public Boolean getIsOptional() {
        return this.isOptional;
    }

    public MetaEntityAttributeDef setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MetaEntityAttributeDef setSearchFilterEnabled(Boolean searchFilterEnabled) {
        this.searchFilterEnabled = searchFilterEnabled;
        return this;
    }
    public Boolean getSearchFilterEnabled() {
        return this.searchFilterEnabled;
    }

    public MetaEntityAttributeDef setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
