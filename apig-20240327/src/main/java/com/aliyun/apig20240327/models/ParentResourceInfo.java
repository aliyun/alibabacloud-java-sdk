// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ParentResourceInfo extends TeaModel {
    @NameInMap("apiInfo")
    public HttpApiApiInfo apiInfo;

    @NameInMap("resourceType")
    public String resourceType;

    public static ParentResourceInfo build(java.util.Map<String, ?> map) throws Exception {
        ParentResourceInfo self = new ParentResourceInfo();
        return TeaModel.build(map, self);
    }

    public ParentResourceInfo setApiInfo(HttpApiApiInfo apiInfo) {
        this.apiInfo = apiInfo;
        return this;
    }
    public HttpApiApiInfo getApiInfo() {
        return this.apiInfo;
    }

    public ParentResourceInfo setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
