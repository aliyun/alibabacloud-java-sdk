// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmInstanceConfigAlertShrinkRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p>zh-CN: Chinese</p>
     * </li>
     * <li><p>en-US: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>A list of alert configurations.</p>
     */
    @NameInMap("AlertConfig")
    public String alertConfigShrink;

    /**
     * <p>A list of alert notification groups.</p>
     */
    @NameInMap("AlertGroup")
    public String alertGroupShrink;

    /**
     * <p>The alert configuration mode for the instance. Valid values:</p>
     * <ul>
     * <li><p>global: The instance inherits the global alert configuration.</p>
     * </li>
     * <li><p>instance_config: The instance uses a custom alert configuration.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>global</p>
     */
    @NameInMap("AlertMode")
    public String alertMode;

    /**
     * <p>A client-generated token that ensures the idempotence of the request. The client must generate a unique value for this parameter. The token can contain a maximum of 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>1ae05db4-10e7-11ef-b126-00163e24**22</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the domain name instance configuration. A GTM instance can have two configurations for the same access domain name if you configure both A and AAAA records. The ConfigId uniquely identifies a configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>Config-000**11</p>
     */
    @NameInMap("ConfigId")
    public String configId;

    /**
     * <p>The ID of the Global Traffic Manager (GTM) 3.0 instance.</p>
     * 
     * <strong>example:</strong>
     * <p>gtm-cn-zz11t58**0s</p>
     */
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
