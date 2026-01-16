// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetCloudGtmInstanceConfigLogSwitchRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F4D7C841-A1C9-50B4-88B7-F5****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Config-000****</p>
     */
    @NameInMap("ConfigId")
    public String configId;

    /**
     * <strong>example:</strong>
     * <p>gtm-cn-wwo3a3h****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
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
