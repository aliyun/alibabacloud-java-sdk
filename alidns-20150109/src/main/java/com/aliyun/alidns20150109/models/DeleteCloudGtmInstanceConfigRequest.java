// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteCloudGtmInstanceConfigRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p>zh-CN: Chinese.</p>
     * </li>
     * <li><p>en-US: English. This is the default value.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. Generate a unique token for each request. The token can contain a maximum of 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>1ae05db4-10e7-11ef-b126-00163e24****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the instance configuration. A GTM instance can have two configurations, an A record and an AAAA record, for the same access domain name. The ConfigId uniquely identifies one of the configurations. To obtain the ConfigId, call the <a href="https://help.aliyun.com/document_detail/2797349.html">ListCloudGtmInstanceConfigs</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>config-00****</p>
     */
    @NameInMap("ConfigId")
    public String configId;

    /**
     * <p>The ID of the Global Traffic Manager (GTM) 3.0 instance.</p>
     * 
     * <strong>example:</strong>
     * <p>gtm-cn-jmp3qnw****</p>
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
