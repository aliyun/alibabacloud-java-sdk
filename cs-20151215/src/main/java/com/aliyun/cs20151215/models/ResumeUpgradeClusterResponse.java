// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ResumeUpgradeClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static ResumeUpgradeClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeUpgradeClusterResponse self = new ResumeUpgradeClusterResponse();
        return TeaModel.build(map, self);
    }

}
