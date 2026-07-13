// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetCloudGtmInstanceConfigLogSwitchRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. Generate a unique value for this parameter. The client token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>F4D7C841-A1C9-50B4-88B7-F5****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the instance configuration. A and AAAA records can be configured for the same connected domain name and GTM instance. In this case, the GTM instance has two instance configurations. ConfigId uniquely identifies an instance configuration. To find the ConfigId for a domain name instance, call the <a href="https://help.aliyun.com/document_detail/2797349.html">ListCloudGtmInstanceConfigs</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Config-000****</p>
     */
    @NameInMap("ConfigId")
    public String configId;

    /**
     * <p>The ID of the Global Traffic Manager (GTM) 3.0 instance.</p>
     * 
     * <strong>example:</strong>
     * <p>gtm-cn-wwo3a3h****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The status of the network traffic analysis feature:</p>
     * <ul>
     * <li><p>enable</p>
     * </li>
     * <li><p>disable</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>enable
     * disable</p>
     */
    @NameInMap("Status")
    public String status;

    public static SetCloudGtmInstanceConfigLogSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        SetCloudGtmInstanceConfigLogSwitchRequest self = new SetCloudGtmInstanceConfigLogSwitchRequest();
        return TeaModel.build(map, self);
    }

    public SetCloudGtmInstanceConfigLogSwitchRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SetCloudGtmInstanceConfigLogSwitchRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public SetCloudGtmInstanceConfigLogSwitchRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetCloudGtmInstanceConfigLogSwitchRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
