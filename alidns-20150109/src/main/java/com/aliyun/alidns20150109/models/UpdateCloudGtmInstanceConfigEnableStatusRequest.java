// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmInstanceConfigEnableStatusRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ConfigId")
    public String configId;

    @NameInMap("EnableStatus")
    public String enableStatus;

    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateCloudGtmInstanceConfigEnableStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmInstanceConfigEnableStatusRequest self = new UpdateCloudGtmInstanceConfigEnableStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmInstanceConfigEnableStatusRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateCloudGtmInstanceConfigEnableStatusRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateCloudGtmInstanceConfigEnableStatusRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public UpdateCloudGtmInstanceConfigEnableStatusRequest setEnableStatus(String enableStatus) {
        this.enableStatus = enableStatus;
        return this;
    }
    public String getEnableStatus() {
        return this.enableStatus;
    }

    public UpdateCloudGtmInstanceConfigEnableStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
