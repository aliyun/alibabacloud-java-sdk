// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateVSwitchResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("VSwitchId")
    @Validation(required = true)
    public String vSwitchId;

    public static CreateVSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVSwitchResponse self = new CreateVSwitchResponse();
        return TeaModel.build(map, self);
    }

}
