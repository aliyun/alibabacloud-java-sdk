// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteCloudGtmInstanceConfigRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ConfigId")
    public String configId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteCloudGtmInstanceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloudGtmInstanceConfigRequest self = new DeleteCloudGtmInstanceConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCloudGtmInstanceConfigRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DeleteCloudGtmInstanceConfigRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteCloudGtmInstanceConfigRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public DeleteCloudGtmInstanceConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
