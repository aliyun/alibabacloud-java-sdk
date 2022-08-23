// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetStaDetailedStatusByMacRequest extends TeaModel {
    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("StaMac")
    public String staMac;

    public static GetStaDetailedStatusByMacRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStaDetailedStatusByMacRequest self = new GetStaDetailedStatusByMacRequest();
        return TeaModel.build(map, self);
    }

    public GetStaDetailedStatusByMacRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public GetStaDetailedStatusByMacRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetStaDetailedStatusByMacRequest setStaMac(String staMac) {
        this.staMac = staMac;
        return this;
    }
    public String getStaMac() {
        return this.staMac;
    }

}
