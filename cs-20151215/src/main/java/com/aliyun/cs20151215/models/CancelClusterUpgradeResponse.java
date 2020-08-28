// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CancelClusterUpgradeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelClusterUpgradeResponseBody body;

    public static CancelClusterUpgradeResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelClusterUpgradeResponse self = new CancelClusterUpgradeResponse();
        return TeaModel.build(map, self);
    }

}
