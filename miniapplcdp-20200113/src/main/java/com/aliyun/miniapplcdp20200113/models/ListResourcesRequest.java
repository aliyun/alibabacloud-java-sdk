// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListResourcesRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Description")
    public String description;

    @NameInMap("ImageProcessParameter")
    public String imageProcessParameter;

    @NameInMap("ModuleId")
    public String moduleId;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceName")
    public String resourceName;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Source")
    public String source;

    @NameInMap("WithContent")
    public Boolean withContent;

    public static ListResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourcesRequest self = new ListResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListResourcesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListResourcesRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ListResourcesRequest setImageProcessParameter(String imageProcessParameter) {
        this.imageProcessParameter = imageProcessParameter;
        return this;
    }
    public String getImageProcessParameter() {
        return this.imageProcessParameter;
    }

    public ListResourcesRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public ListResourcesRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ListResourcesRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public ListResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListResourcesRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ListResourcesRequest setWithContent(Boolean withContent) {
        this.withContent = withContent;
        return this;
    }
    public Boolean getWithContent() {
        return this.withContent;
    }

}
