// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CancelComponentUpgradeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CancelComponentUpgradeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelComponentUpgradeResponseBody self = new CancelComponentUpgradeResponseBody();
        return TeaModel.build(map, self);
    }

}
