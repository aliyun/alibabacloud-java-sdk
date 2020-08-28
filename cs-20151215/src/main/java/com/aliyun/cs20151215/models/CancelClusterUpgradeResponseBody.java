// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CancelClusterUpgradeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CancelClusterUpgradeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelClusterUpgradeResponseBody self = new CancelClusterUpgradeResponseBody();
        return TeaModel.build(map, self);
    }

}
