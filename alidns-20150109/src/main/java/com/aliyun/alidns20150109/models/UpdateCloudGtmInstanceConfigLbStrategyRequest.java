// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmInstanceConfigLbStrategyRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh-CN</strong>: Chinese.</p>
     * </li>
     * <li><p><strong>en-US</strong>: English. This is the default value.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The load balancing policy for the address pools. Valid values:</p>
     * <ul>
     * <li><p>round_robin: Returns all address pools for any DNS request. The address pools are rotated for each request.</p>
     * </li>
     * <li><p>sequence: Returns the address pool with the smallest ordinal number. The smaller the ordinal number, the higher the priority. If the primary address pool is unavailable, the next address pool in the sequence is used.</p>
     * </li>
     * <li><p>weight: Distributes DNS requests to address pools based on their configured weights.</p>
     * </li>
     * <li><p>source_nearest: Returns an address pool based on the proximity of the DNS request source. This implements intelligent DNS resolution and directs users to the nearest access point.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sequence</p>
     */
    @NameInMap("AddressPoolLbStrategy")
    public String addressPoolLbStrategy;

    /**
     * <p>A client-generated token that is used to ensure the idempotence of the request. The token must be unique among different requests. The token can contain a maximum of 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>1ae05db4-10e7-11ef-b126-00163e24****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the instance configuration. A GTM instance can have multiple configurations for the same domain name, such as one for A records and another for AAAA records. The ConfigId uniquely identifies the configuration that you want to modify.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/2797349.html">ListCloudGtmInstanceConfigs</a>.</p>
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
     * <p>gtm-cn-wwo3a3h***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The recovery mode for a primary address pool when the load balancing policy is set to sequence. Valid values:</p>
     * <ul>
     * <li><p>preemptive: The system switches back to the primary address pool as soon as it recovers.</p>
     * </li>
     * <li><p>non_preemptive: The system continues to use the current address pool even after the primary address pool recovers.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>preemptive</p>
     */
    @NameInMap("SequenceLbStrategyMode")
    public String sequenceLbStrategyMode;

    public static UpdateCloudGtmInstanceConfigLbStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmInstanceConfigLbStrategyRequest self = new UpdateCloudGtmInstanceConfigLbStrategyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmInstanceConfigLbStrategyRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateCloudGtmInstanceConfigLbStrategyRequest setAddressPoolLbStrategy(String addressPoolLbStrategy) {
        this.addressPoolLbStrategy = addressPoolLbStrategy;
        return this;
    }
    public String getAddressPoolLbStrategy() {
        return this.addressPoolLbStrategy;
    }

    public UpdateCloudGtmInstanceConfigLbStrategyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateCloudGtmInstanceConfigLbStrategyRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public UpdateCloudGtmInstanceConfigLbStrategyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateCloudGtmInstanceConfigLbStrategyRequest setSequenceLbStrategyMode(String sequenceLbStrategyMode) {
        this.sequenceLbStrategyMode = sequenceLbStrategyMode;
        return this;
    }
    public String getSequenceLbStrategyMode() {
        return this.sequenceLbStrategyMode;
    }

}
