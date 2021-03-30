// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class DeleteApSsidConfigRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("ApMac")
    public String apMac;

    @NameInMap("Ssid")
    public String ssid;

    @NameInMap("RadioIndex")
    public String radioIndex;

    public static DeleteApSsidConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApSsidConfigRequest self = new DeleteApSsidConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApSsidConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DeleteApSsidConfigRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public DeleteApSsidConfigRequest setApMac(String apMac) {
        this.apMac = apMac;
        return this;
    }
    public String getApMac() {
        return this.apMac;
    }

    public DeleteApSsidConfigRequest setSsid(String ssid) {
        this.ssid = ssid;
        return this;
    }
    public String getSsid() {
        return this.ssid;
    }

    public DeleteApSsidConfigRequest setRadioIndex(String radioIndex) {
        this.radioIndex = radioIndex;
        return this;
    }
    public String getRadioIndex() {
        return this.radioIndex;
    }

}
