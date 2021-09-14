// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostPasswordResponseBody extends TeaModel {
    @NameInMap("DedicatedHostName")
    public String dedicatedHostName;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDedicatedHostPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostPasswordResponseBody self = new ModifyDedicatedHostPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedHostPasswordResponseBody setDedicatedHostName(String dedicatedHostName) {
        this.dedicatedHostName = dedicatedHostName;
        return this;
    }
    public String getDedicatedHostName() {
        return this.dedicatedHostName;
    }

    public ModifyDedicatedHostPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
