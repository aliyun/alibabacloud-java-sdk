// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class FtGatedLaunchPolicy4Request extends TeaModel {
    @NameInMap("IsGatedLaunch")
    public String isGatedLaunch;

    public static FtGatedLaunchPolicy4Request build(java.util.Map<String, ?> map) throws Exception {
        FtGatedLaunchPolicy4Request self = new FtGatedLaunchPolicy4Request();
        return TeaModel.build(map, self);
    }

    public FtGatedLaunchPolicy4Request setIsGatedLaunch(String isGatedLaunch) {
        this.isGatedLaunch = isGatedLaunch;
        return this;
    }
    public String getIsGatedLaunch() {
        return this.isGatedLaunch;
    }

}
