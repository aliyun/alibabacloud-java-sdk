// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmInstanceConfigLbStrategyRequest extends TeaModel {
    /**
     * <p>The language in which the returned results are displayed. Valid values:</p>
     * <ul>
     * <li><strong>zh-CN</strong>: Chinese</li>
     * <li><strong>en-US</strong> (default): English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The new policy for load balancing between address pools. Valid values:</p>
     * <ul>
     * <li>round_robin: All address pools are returned for Domain Name System (DNS) requests from any source. All address pools are sorted in round-robin mode each time they are returned.</li>
     * <li>sequence: The address pool with the smallest sequence number is preferentially returned for DNS requests from any source. The sequence number indicates the priority for returning the address pool. A smaller sequence number indicates a higher priority. If the address pool with the smallest sequence number is unavailable, the address pool with the second smallest sequence number is returned.</li>
     * <li>weight: You can set a different weight value for each address pool. This way, address pools are returned based on the weight values.</li>
     * <li>source_nearest: GTM returns different address pools based on the sources of DNS requests. This way, users can access nearby address pools.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sequence</p>
     */
    @NameInMap("AddressPoolLbStrategy")
    public String addressPoolLbStrategy;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>1ae05db4-10e7-11ef-b126-00163e24**22</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The configuration ID of the access domain name. Two configuration IDs exist when the access domain name is bound to the same GTM instance but an A record and an AAAA record are configured for the access domain name. The configuration ID uniquely identifies a configuration.</p>
     * <p>You can call the <a href="~~ListCloudGtmInstanceConfigs~~">ListCloudGtmInstanceConfigs</a> operation to query the configuration ID of the desired access domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>Config-000**11</p>
     */
    @NameInMap("ConfigId")
    public String configId;

    /**
     * <p>The ID of the GTM 3.0 instance for which you want to modify the load balancing policy.</p>
     * 
     * <strong>example:</strong>
     * <p>gtm-cn-wwo3a3hbz**</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The mode used if the address pool with the smallest sequence number is recovered. This parameter is required when AddressPoolLbStrategy is set to sequence. Valid values:</p>
     * <ul>
     * <li>preemptive: The address pool with the smallest sequence number is preferentially used if this address pool is recovered.</li>
     * <li>non_preemptive: The current address pool is still used even if the address pool with the smallest sequence number is recovered.</li>
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
