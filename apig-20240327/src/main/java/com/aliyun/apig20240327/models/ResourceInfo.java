// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ResourceInfo extends TeaModel {
    @NameInMap("resourceId")
    public String resourceId;

    @NameInMap("resourceName")
    public String resourceName;

    @NameInMap("resourceType")
    public String resourceType;

    @NameInMap("resourceVersion")
    public String resourceVersion;

    public static ResourceInfo build(java.util.Map<String, ?> map) throws Exception {
        ResourceInfo self = new ResourceInfo();
        return TeaModel.build(map, self);
    }

    public ResourceInfo setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ResourceInfo setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public ResourceInfo setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ResourceInfo setResourceVersion(String resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }
    public String getResourceVersion() {
        return this.resourceVersion;
    }

}
