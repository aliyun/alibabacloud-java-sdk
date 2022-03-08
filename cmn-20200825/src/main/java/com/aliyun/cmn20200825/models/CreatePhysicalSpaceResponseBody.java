// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreatePhysicalSpaceResponseBody extends TeaModel {
    // 物理空间ID
    @NameInMap("PhysicalSpaceId")
    public String physicalSpaceId;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static CreatePhysicalSpaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePhysicalSpaceResponseBody self = new CreatePhysicalSpaceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePhysicalSpaceResponseBody setPhysicalSpaceId(String physicalSpaceId) {
        this.physicalSpaceId = physicalSpaceId;
        return this;
    }
    public String getPhysicalSpaceId() {
        return this.physicalSpaceId;
    }

    public CreatePhysicalSpaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
