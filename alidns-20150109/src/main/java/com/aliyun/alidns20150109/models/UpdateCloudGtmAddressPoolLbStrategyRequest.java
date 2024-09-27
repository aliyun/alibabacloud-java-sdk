// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmAddressPoolLbStrategyRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh-CN: Chinese</li>
     * <li>en-US (default): English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>Load balancing policy among addresses in the address pool:</p>
     * <ul>
     * <li>round_robin: Round-robin, for any source of DNS resolution requests, all addresses are returned. The order of all addresses is rotated each time.</li>
     * <li>sequence: Sequential, for any source of DNS resolution requests, the address with the smaller sequence number (the sequence number indicates the priority of address returns, with smaller numbers having higher priority) is returned. If the address with the smaller sequence number is unavailable, the next address with a smaller sequence number is returned.</li>
     * <li>weight: Weighted, supports setting different weight values for each address, realizing the return of addresses according to the weight ratio for resolution queries.</li>
     * <li>source_nearest: Source-nearest, i.e., intelligent resolution function, where GTM can return different addresses based on the source of different DNS resolution requests, achieving the effect of users accessing nearby.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sequence</p>
     */
    @NameInMap("AddressLbStrategy")
    public String addressLbStrategy;

    /**
     * <p>The ID of the address pool. This ID uniquely identifies the address pool.</p>
     * 
     * <strong>example:</strong>
     * <p>pool-89528023225442**16</p>
     */
    @NameInMap("AddressPoolId")
    public String addressPoolId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>1ae05db4-10e7-11ef-b126-00163e24**22</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The mode used if the address with the smallest sequence number is recovered. This parameter is required only when AddressLbStrategy is set to sequence. Valid values:</p>
     * <ul>
     * <li>preemptive: The address with the smallest sequence number is preferentially used if this address is recovered.</li>
     * <li>non_preemptive: The current address is still used even if the address with the smallest sequence number is recovered.</li>
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
