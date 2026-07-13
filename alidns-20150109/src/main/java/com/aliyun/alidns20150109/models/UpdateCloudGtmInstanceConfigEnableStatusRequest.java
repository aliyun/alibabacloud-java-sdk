// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmInstanceConfigEnableStatusRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh-CN</strong>: Chinese.</p>
     * </li>
     * <li><p><strong>en-US</strong> (default): English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>A client-generated token that is used to ensure the idempotence of the request. The token must be unique among different requests and can contain a maximum of 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>1ae05db4-10e7-11ef-b126-00163e24****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the domain name instance configuration. For the same access domain name and GTM instance, you can configure both A and AAAA records. This results in two domain name instance configurations for the GTM instance. The ConfigId uniquely identifies a specific configuration.</p>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/2797349.html">ListCloudGtmInstanceConfigs</a> operation to query the ConfigId of a domain name instance.</p>
     * 
     * <strong>example:</strong>
     * <p>Config-000****</p>
     */
    @NameInMap("ConfigId")
    public String configId;

    /**
     * <p>The enablement status of the domain name instance. Valid values:</p>
     * <ul>
     * <li><p>enable: Enables the domain name instance.</p>
     * </li>
     * <li><p>disable: Disables the domain name instance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("EnableStatus")
    public String enableStatus;

    /**
     * <p>The ID of the GTM 3.0 instance that you want to modify.</p>
     * 
     * <strong>example:</strong>
     * <p>gtm-cn-wwo3a3h****</p>
     */
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
