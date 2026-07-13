// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmAddressPoolLbStrategyRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p>zh-CN: Chinese</p>
     * </li>
     * <li><p>en-US (default): English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The load balancing policy for the addresses in the address pool.</p>
     * <ul>
     * <li><p>round_robin: Round robin. For each DNS query, all addresses are returned in a rotating order.</p>
     * </li>
     * <li><p>sequence: Sequence. The address with the highest priority is returned. Priority is determined by the ordinal number of an address. A smaller ordinal number indicates a higher priority. If an address is unavailable, the address with the next highest priority is returned.</p>
     * </li>
     * <li><p>weight: Weight. DNS queries are resolved based on the weight that you set for each address.</p>
     * </li>
     * <li><p>source_nearest: Source nearest. This is an intelligent DNS resolution feature. GTM returns an address based on the source of the DNS query. This directs users to the nearest resource.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sequence</p>
     */
    @NameInMap("AddressLbStrategy")
    public String addressLbStrategy;

    /**
     * <p>The unique ID of the address pool.</p>
     * 
     * <strong>example:</strong>
     * <p>pool-89528023225442****</p>
     */
    @NameInMap("AddressPoolId")
    public String addressPoolId;

    /**
     * <p>A client-generated token that is used to ensure the idempotence of the request. The token must be unique for each request and can contain up to 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>1ae05db4-10e7-11ef-b126-00163e24****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The recovery mode when the load balancing policy is \<code>sequence\\</code>.</p>
     * <ul>
     * <li><p>preemptive: Preemptive mode. If a higher-priority address recovers, it is used preferentially.</p>
     * </li>
     * <li><p>non_preemptive: Non-preemptive mode. If a higher-priority address recovers, the current address continues to be used.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>preemptive</p>
     */
    @NameInMap("SequenceLbStrategyMode")
    public String sequenceLbStrategyMode;

    public static UpdateCloudGtmAddressPoolLbStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmAddressPoolLbStrategyRequest self = new UpdateCloudGtmAddressPoolLbStrategyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmAddressPoolLbStrategyRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateCloudGtmAddressPoolLbStrategyRequest setAddressLbStrategy(String addressLbStrategy) {
        this.addressLbStrategy = addressLbStrategy;
        return this;
    }
    public String getAddressLbStrategy() {
        return this.addressLbStrategy;
    }

    public UpdateCloudGtmAddressPoolLbStrategyRequest setAddressPoolId(String addressPoolId) {
        this.addressPoolId = addressPoolId;
        return this;
    }
    public String getAddressPoolId() {
        return this.addressPoolId;
    }

    public UpdateCloudGtmAddressPoolLbStrategyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateCloudGtmAddressPoolLbStrategyRequest setSequenceLbStrategyMode(String sequenceLbStrategyMode) {
        this.sequenceLbStrategyMode = sequenceLbStrategyMode;
        return this;
    }
    public String getSequenceLbStrategyMode() {
        return this.sequenceLbStrategyMode;
    }

}
