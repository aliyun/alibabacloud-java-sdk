// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateVSwitchResponseBody extends TeaModel {
    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateVSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVSwitchResponseBody self = new CreateVSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVSwitchResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateVSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
