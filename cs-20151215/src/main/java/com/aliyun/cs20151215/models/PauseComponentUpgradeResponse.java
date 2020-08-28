// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class PauseComponentUpgradeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PauseComponentUpgradeResponseBody body;

    public static PauseComponentUpgradeResponse build(java.util.Map<String, ?> map) throws Exception {
        PauseComponentUpgradeResponse self = new PauseComponentUpgradeResponse();
        return TeaModel.build(map, self);
    }

}
