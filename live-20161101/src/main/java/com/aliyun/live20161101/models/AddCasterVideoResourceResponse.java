// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterVideoResourceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResourceId")
    @Validation(required = true)
    public String resourceId;

    public static AddCasterVideoResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCasterVideoResourceResponse self = new AddCasterVideoResourceResponse();
        return TeaModel.build(map, self);
    }

    public AddCasterVideoResourceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddCasterVideoResourceResponse setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
