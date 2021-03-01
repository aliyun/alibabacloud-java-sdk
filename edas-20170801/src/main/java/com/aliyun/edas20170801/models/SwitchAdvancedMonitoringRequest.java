// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class SwitchAdvancedMonitoringRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("EnableAdvancedMonitoring")
    public Boolean enableAdvancedMonitoring;

    public static SwitchAdvancedMonitoringRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchAdvancedMonitoringRequest self = new SwitchAdvancedMonitoringRequest();
        return TeaModel.build(map, self);
    }

    public SwitchAdvancedMonitoringRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SwitchAdvancedMonitoringRequest setEnableAdvancedMonitoring(Boolean enableAdvancedMonitoring) {
        this.enableAdvancedMonitoring = enableAdvancedMonitoring;
        return this;
    }
    public Boolean getEnableAdvancedMonitoring() {
        return this.enableAdvancedMonitoring;
    }

}
