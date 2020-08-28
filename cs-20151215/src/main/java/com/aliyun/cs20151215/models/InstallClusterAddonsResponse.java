// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class InstallClusterAddonsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static InstallClusterAddonsResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallClusterAddonsResponse self = new InstallClusterAddonsResponse();
        return TeaModel.build(map, self);
    }

}
