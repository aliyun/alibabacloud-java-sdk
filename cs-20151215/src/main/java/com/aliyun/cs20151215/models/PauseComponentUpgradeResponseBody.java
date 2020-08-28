// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class PauseComponentUpgradeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static PauseComponentUpgradeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PauseComponentUpgradeResponseBody self = new PauseComponentUpgradeResponseBody();
        return TeaModel.build(map, self);
    }

}
