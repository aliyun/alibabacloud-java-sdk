// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ResumeComponentUpgradeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResumeComponentUpgradeResponseBody body;

    public static ResumeComponentUpgradeResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeComponentUpgradeResponse self = new ResumeComponentUpgradeResponse();
        return TeaModel.build(map, self);
    }

}
