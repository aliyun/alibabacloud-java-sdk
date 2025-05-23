// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.metastore20241012.models;

import com.aliyun.tea.*;

public class ResourceUri extends TeaModel {
    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Uri")
    public String uri;

    public static ResourceUri build(java.util.Map<String, ?> map) throws Exception {
        ResourceUri self = new ResourceUri();
        return TeaModel.build(map, self);
    }

    public ResourceUri setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ResourceUri setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

}
