// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateHaVipResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("HaVipId")
    @Validation(required = true)
    public String haVipId;

    public static CreateHaVipResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHaVipResponse self = new CreateHaVipResponse();
        return TeaModel.build(map, self);
    }

}
