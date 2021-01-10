// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterVideoResourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceId")
    public String resourceId;

    public static AddCasterVideoResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddCasterVideoResourceResponseBody self = new AddCasterVideoResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public AddCasterVideoResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddCasterVideoResourceResponseBody setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
