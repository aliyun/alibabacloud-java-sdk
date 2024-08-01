// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteCloudGtmInstanceConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <strong>example:</strong>
     * <p>1ae05db4-10e7-11ef-b126-00163e24**22</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>config-000**1</p>
     */
    @NameInMap("ConfigId")
    public String configId;

    /**
     * <strong>example:</strong>
     * <p>gtm-cn-jmp3qnw**03</p>
     */
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
