// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetApDetailStatusRequest extends TeaModel {
    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Mac")
    public String mac;

    @NameInMap("NeedApgroupInfo")
    public Boolean needApgroupInfo;

    @NameInMap("NeedRadioStatus")
    public Boolean needRadioStatus;

    public static GetApDetailStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApDetailStatusRequest self = new GetApDetailStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetApDetailStatusRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public GetApDetailStatusRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetApDetailStatusRequest setMac(String mac) {
        this.mac = mac;
        return this;
    }
    public String getMac() {
        return this.mac;
    }

    public GetApDetailStatusRequest setNeedApgroupInfo(Boolean needApgroupInfo) {
        this.needApgroupInfo = needApgroupInfo;
        return this;
    }
    public Boolean getNeedApgroupInfo() {
        return this.needApgroupInfo;
    }

    public GetApDetailStatusRequest setNeedRadioStatus(Boolean needRadioStatus) {
        this.needRadioStatus = needRadioStatus;
        return this;
    }
    public Boolean getNeedRadioStatus() {
        return this.needRadioStatus;
    }

}
