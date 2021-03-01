// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class StopApplicationRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("EccInfo")
    public String eccInfo;

    public static StopApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        StopApplicationRequest self = new StopApplicationRequest();
        return TeaModel.build(map, self);
    }

    public StopApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StopApplicationRequest setEccInfo(String eccInfo) {
        this.eccInfo = eccInfo;
        return this;
    }
    public String getEccInfo() {
        return this.eccInfo;
    }

}
