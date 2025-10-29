// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class FunctionFileResource extends TeaModel {
    @NameInMap("resourceType")
    public String resourceType;

    @NameInMap("uri")
    public String uri;

    public static FunctionFileResource build(java.util.Map<String, ?> map) throws Exception {
        FunctionFileResource self = new FunctionFileResource();
        return TeaModel.build(map, self);
    }

    public FunctionFileResource setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public FunctionFileResource setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

}
