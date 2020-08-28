// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GetUpgradeStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetUpgradeStatusResponseBody body;

    public static GetUpgradeStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUpgradeStatusResponse self = new GetUpgradeStatusResponse();
        return TeaModel.build(map, self);
    }

}
