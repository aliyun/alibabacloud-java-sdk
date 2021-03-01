// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ResetApplicationRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("EccInfo")
    public String eccInfo;

    public static ResetApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetApplicationRequest self = new ResetApplicationRequest();
        return TeaModel.build(map, self);
    }

    public ResetApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ResetApplicationRequest setEccInfo(String eccInfo) {
        this.eccInfo = eccInfo;
        return this;
    }
    public String getEccInfo() {
        return this.eccInfo;
    }

}
