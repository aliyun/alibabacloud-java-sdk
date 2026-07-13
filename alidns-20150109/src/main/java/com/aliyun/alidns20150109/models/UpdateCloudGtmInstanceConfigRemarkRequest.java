// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmInstanceConfigRemarkRequest extends TeaModel {
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
     * <p>The ID of the instance configuration. A GTM instance can have multiple configurations if you add both an A record and an AAAA record for the same domain name. The ConfigId uniquely identifies the configuration that you want to update.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/2797349.html">ListCloudGtmInstanceConfigs</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Config-000****</p>
     */
    @NameInMap("ConfigId")
    public String configId;

    /**
     * <p>The ID of the Global Traffic Manager (GTM) instance for which you want to update the remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>gtm-cn-wwo3a3h****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The new remarks for the configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>API</p>
     */
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
