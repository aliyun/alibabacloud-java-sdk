// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class RepairApRadioRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("ApMac")
    public String apMac;

    @NameInMap("RadioIndex")
    public String radioIndex;

    public static RepairApRadioRequest build(java.util.Map<String, ?> map) throws Exception {
        RepairApRadioRequest self = new RepairApRadioRequest();
        return TeaModel.build(map, self);
    }

    public RepairApRadioRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public RepairApRadioRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public RepairApRadioRequest setApMac(String apMac) {
        this.apMac = apMac;
        return this;
    }
    public String getApMac() {
        return this.apMac;
    }

    public RepairApRadioRequest setRadioIndex(String radioIndex) {
        this.radioIndex = radioIndex;
        return this;
    }
    public String getRadioIndex() {
        return this.radioIndex;
    }

}
