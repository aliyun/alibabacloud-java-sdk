// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmInstanceConfigRemarkRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ConfigId")
    public String configId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Remark")
    public String remark;

    public static UpdateCloudGtmInstanceConfigRemarkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmInstanceConfigRemarkRequest self = new UpdateCloudGtmInstanceConfigRemarkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmInstanceConfigRemarkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateCloudGtmInstanceConfigRemarkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateCloudGtmInstanceConfigRemarkRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public UpdateCloudGtmInstanceConfigRemarkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateCloudGtmInstanceConfigRemarkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
