// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetApInfoFromPoolRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApMac")
    public String apMac;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppCode")
    public String appCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppName")
    public String appName;

    public static GetApInfoFromPoolRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApInfoFromPoolRequest self = new GetApInfoFromPoolRequest();
        return TeaModel.build(map, self);
    }

    public GetApInfoFromPoolRequest setApMac(String apMac) {
        this.apMac = apMac;
        return this;
    }
    public String getApMac() {
        return this.apMac;
    }

    public GetApInfoFromPoolRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public GetApInfoFromPoolRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

}
