// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DLResourceUri extends TeaModel {
    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Uri")
    public String uri;

    public static DLResourceUri build(java.util.Map<String, ?> map) throws Exception {
        DLResourceUri self = new DLResourceUri();
        return TeaModel.build(map, self);
    }

    public DLResourceUri setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DLResourceUri setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

}
