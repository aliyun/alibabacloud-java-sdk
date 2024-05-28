// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmInstanceConfigAlertShrinkRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("AlertConfig")
    public String alertConfigShrink;

    @NameInMap("AlertGroup")
    public String alertGroupShrink;

    @NameInMap("AlertMode")
    public String alertMode;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ConfigId")
    public String configId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateCloudGtmInstanceConfigAlertShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmInstanceConfigAlertShrinkRequest self = new UpdateCloudGtmInstanceConfigAlertShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmInstanceConfigAlertShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateCloudGtmInstanceConfigAlertShrinkRequest setAlertConfigShrink(String alertConfigShrink) {
        this.alertConfigShrink = alertConfigShrink;
        return this;
    }
    public String getAlertConfigShrink() {
        return this.alertConfigShrink;
    }

    public UpdateCloudGtmInstanceConfigAlertShrinkRequest setAlertGroupShrink(String alertGroupShrink) {
        this.alertGroupShrink = alertGroupShrink;
        return this;
    }
    public String getAlertGroupShrink() {
        return this.alertGroupShrink;
    }

    public UpdateCloudGtmInstanceConfigAlertShrinkRequest setAlertMode(String alertMode) {
        this.alertMode = alertMode;
        return this;
    }
    public String getAlertMode() {
        return this.alertMode;
    }

    public UpdateCloudGtmInstanceConfigAlertShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateCloudGtmInstanceConfigAlertShrinkRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public UpdateCloudGtmInstanceConfigAlertShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
