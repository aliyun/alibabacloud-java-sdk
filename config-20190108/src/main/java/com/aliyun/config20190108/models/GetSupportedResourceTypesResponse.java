// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class GetSupportedResourceTypesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResourceTypes")
    @Validation(required = true)
    public java.util.List<String> resourceTypes;

    public static GetSupportedResourceTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSupportedResourceTypesResponse self = new GetSupportedResourceTypesResponse();
        return TeaModel.build(map, self);
    }

    public GetSupportedResourceTypesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSupportedResourceTypesResponse setResourceTypes(java.util.List<String> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public java.util.List<String> getResourceTypes() {
        return this.resourceTypes;
    }

}
