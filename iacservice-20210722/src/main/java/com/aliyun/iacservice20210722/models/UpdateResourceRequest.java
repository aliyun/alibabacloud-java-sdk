// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210722.models;

import com.aliyun.tea.*;

public class UpdateResourceRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    @NameInMap("resourceTypeVersion")
    public String resourceTypeVersion;

    public static UpdateResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceRequest self = new UpdateResourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateResourceRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public UpdateResourceRequest setResourceTypeVersion(String resourceTypeVersion) {
        this.resourceTypeVersion = resourceTypeVersion;
        return this;
    }
    public String getResourceTypeVersion() {
        return this.resourceTypeVersion;
    }

}
