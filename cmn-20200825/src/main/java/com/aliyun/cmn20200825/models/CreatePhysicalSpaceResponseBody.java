// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreatePhysicalSpaceResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 物理空间ID
    @NameInMap("PhysicalSpaceId")
    public String physicalSpaceId;

    public static CreatePhysicalSpaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePhysicalSpaceResponseBody self = new CreatePhysicalSpaceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePhysicalSpaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePhysicalSpaceResponseBody setPhysicalSpaceId(String physicalSpaceId) {
        this.physicalSpaceId = physicalSpaceId;
        return this;
    }
    public String getPhysicalSpaceId() {
        return this.physicalSpaceId;
    }

}
