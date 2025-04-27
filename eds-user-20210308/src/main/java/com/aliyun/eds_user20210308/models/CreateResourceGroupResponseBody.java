// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class CreateResourceGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>868B8926-2E7A-5BE7-9897-E811E994****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>rg-ckf3cx7isinhk***</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static CreateResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceGroupResponseBody self = new CreateResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateResourceGroupResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
