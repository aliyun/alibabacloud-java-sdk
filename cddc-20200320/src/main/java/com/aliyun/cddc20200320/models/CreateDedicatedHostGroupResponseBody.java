// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class CreateDedicatedHostGroupResponseBody extends TeaModel {
    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateDedicatedHostGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDedicatedHostGroupResponseBody self = new CreateDedicatedHostGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDedicatedHostGroupResponseBody setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    public CreateDedicatedHostGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
