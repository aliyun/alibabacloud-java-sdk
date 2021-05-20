// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class FtGatedLaunchPolicy4ResponseBody extends TeaModel {
    @NameInMap("IsGatedLaunch")
    public String isGatedLaunch;

    @NameInMap("RequestId")
    public String requestId;

    public static FtGatedLaunchPolicy4ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FtGatedLaunchPolicy4ResponseBody self = new FtGatedLaunchPolicy4ResponseBody();
        return TeaModel.build(map, self);
    }

    public FtGatedLaunchPolicy4ResponseBody setIsGatedLaunch(String isGatedLaunch) {
        this.isGatedLaunch = isGatedLaunch;
        return this;
    }
    public String getIsGatedLaunch() {
        return this.isGatedLaunch;
    }

    public FtGatedLaunchPolicy4ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
