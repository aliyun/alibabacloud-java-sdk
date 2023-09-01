// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class GetSupportedResourceTypesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The types of resources that are supported by Cloud Config.</p>
     */
    @NameInMap("ResourceTypes")
    public java.util.List<String> resourceTypes;

    public static GetSupportedResourceTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSupportedResourceTypesResponseBody self = new GetSupportedResourceTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSupportedResourceTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSupportedResourceTypesResponseBody setResourceTypes(java.util.List<String> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public java.util.List<String> getResourceTypes() {
        return this.resourceTypes;
    }

}
