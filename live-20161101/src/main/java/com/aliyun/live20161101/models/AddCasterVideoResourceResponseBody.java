// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterVideoResourceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CF60DB6A-7FD6-426E-9288-122CC1A52FA7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource. This parameter can be used as a request parameter in the API operation that you can call to delete the video source in the production studio or modify the video source in the production studio.</p>
     * 
     * <strong>example:</strong>
     * <p>e5542d98-b08c-46bf-83e9-5b09d08c****</p>
     */
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
