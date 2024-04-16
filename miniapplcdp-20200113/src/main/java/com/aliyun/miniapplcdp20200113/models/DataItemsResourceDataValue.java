// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class DataItemsResourceDataValue extends TeaModel {
    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceName")
    public String resourceName;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Description")
    public String description;

    @NameInMap("SchemaVersion")
    public String schemaVersion;

    @NameInMap("ModuleId")
    public String moduleId;

    @NameInMap("Content")
    public java.util.Map<String, ?> content;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("Visibility")
    public String visibility;

    public static DataItemsResourceDataValue build(java.util.Map<String, ?> map) throws Exception {
        DataItemsResourceDataValue self = new DataItemsResourceDataValue();
        return TeaModel.build(map, self);
    }

    public DataItemsResourceDataValue setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DataItemsResourceDataValue setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public DataItemsResourceDataValue setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DataItemsResourceDataValue setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DataItemsResourceDataValue setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    public DataItemsResourceDataValue setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public DataItemsResourceDataValue setContent(java.util.Map<String, ?> content) {
        this.content = content;
        return this;
    }
    public java.util.Map<String, ?> getContent() {
        return this.content;
    }

    public DataItemsResourceDataValue setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DataItemsResourceDataValue setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

}
