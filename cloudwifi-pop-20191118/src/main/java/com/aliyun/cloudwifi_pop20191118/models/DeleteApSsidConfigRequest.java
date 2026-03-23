// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class DeleteApSsidConfigRequest extends TeaModel {
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

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RadioIndex")
    public String radioIndex;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Ssid")
    public String ssid;

    public static DeleteApSsidConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApSsidConfigRequest self = new DeleteApSsidConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApSsidConfigRequest setApMac(String apMac) {
        this.apMac = apMac;
        return this;
    }
    public String getApMac() {
        return this.apMac;
    }

    public DeleteApSsidConfigRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public DeleteApSsidConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DeleteApSsidConfigRequest setRadioIndex(String radioIndex) {
        this.radioIndex = radioIndex;
        return this;
    }
    public String getRadioIndex() {
        return this.radioIndex;
    }

    public DeleteApSsidConfigRequest setSsid(String ssid) {
        this.ssid = ssid;
        return this;
    }
    public String getSsid() {
        return this.ssid;
    }

}
