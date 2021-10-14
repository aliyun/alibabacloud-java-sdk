// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class PutAppConfigAndSaveRequest extends TeaModel {
    @NameInMap("ApMac")
    public String apMac;

    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("ConfigureType")
    public String configureType;

    @NameInMap("CurrentTime")
    public Long currentTime;

    @NameInMap("Data")
    public String data;

    public static PutAppConfigAndSaveRequest build(java.util.Map<String, ?> map) throws Exception {
        PutAppConfigAndSaveRequest self = new PutAppConfigAndSaveRequest();
        return TeaModel.build(map, self);
    }

    public PutAppConfigAndSaveRequest setApMac(String apMac) {
        this.apMac = apMac;
        return this;
    }
    public String getApMac() {
        return this.apMac;
    }

    public PutAppConfigAndSaveRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public PutAppConfigAndSaveRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public PutAppConfigAndSaveRequest setConfigureType(String configureType) {
        this.configureType = configureType;
        return this;
    }
    public String getConfigureType() {
        return this.configureType;
    }

    public PutAppConfigAndSaveRequest setCurrentTime(Long currentTime) {
        this.currentTime = currentTime;
        return this;
    }
    public Long getCurrentTime() {
        return this.currentTime;
    }

    public PutAppConfigAndSaveRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
