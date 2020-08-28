// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class FtGatedLaunchPolicy4Response extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("IsGatedLaunch")
    @Validation(required = true)
    public String isGatedLaunch;

    public static FtGatedLaunchPolicy4Response build(java.util.Map<String, ?> map) throws Exception {
        FtGatedLaunchPolicy4Response self = new FtGatedLaunchPolicy4Response();
        return TeaModel.build(map, self);
    }

}
