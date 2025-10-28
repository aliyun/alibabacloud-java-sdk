// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class SwitchAdvancedMonitoringRequest extends TeaModel {
    /**
     * <p>The ID of the application for which you want to query or configure the advanced application monitoring feature.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9e224bc6-a646-4484-<strong><strong>-e617b7e7</strong></strong></p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>Specifies whether to enable the advanced application monitoring feature. Valid values:</p>
     * <ul>
     * <li>true: enables the advanced application monitoring feature.</li>
     * <li>false: disables the advanced application monitoring feature.</li>
     * </ul>
     * <p>If you call this operation to query the status of the advanced application monitoring feature, you do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
