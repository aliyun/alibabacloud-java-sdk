// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ReplaceCloudGtmInstanceConfigAddressPoolRequest extends TeaModel {
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
     * <p>The address pools.</p>
     */
    @NameInMap("AddressPools")
    public java.util.List<ReplaceCloudGtmInstanceConfigAddressPoolRequestAddressPools> addressPools;

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
     * <p>You can call the <a href="~~ListCloudGtmInstanceConfigs~~">ListCloudGtmInstanceConfigs</a> operation to query the configuration ID of the access domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>Config-000**11</p>
     */
    @NameInMap("ConfigId")
    public String configId;

    /**
     * <p>The ID of the GTM 3.0 instance for which you want to change address pools.</p>
     * 
     * <strong>example:</strong>
     * <p>gtm-cn-wwo3a3hbz**</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ReplaceCloudGtmInstanceConfigAddressPoolRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceCloudGtmInstanceConfigAddressPoolRequest self = new ReplaceCloudGtmInstanceConfigAddressPoolRequest();
        return TeaModel.build(map, self);
    }

    public ReplaceCloudGtmInstanceConfigAddressPoolRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ReplaceCloudGtmInstanceConfigAddressPoolRequest setAddressPools(java.util.List<ReplaceCloudGtmInstanceConfigAddressPoolRequestAddressPools> addressPools) {
        this.addressPools = addressPools;
        return this;
    }
    public java.util.List<ReplaceCloudGtmInstanceConfigAddressPoolRequestAddressPools> getAddressPools() {
        return this.addressPools;
    }

    public ReplaceCloudGtmInstanceConfigAddressPoolRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ReplaceCloudGtmInstanceConfigAddressPoolRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public ReplaceCloudGtmInstanceConfigAddressPoolRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public static class ReplaceCloudGtmInstanceConfigAddressPoolRequestAddressPools extends TeaModel {
        /**
         * <p>The ID of the address pool. This ID uniquely identifies the address pool.</p>
         * <ul>
         * <li>If you specify this parameter, the address pools that are associated with the desired instance are removed and the instance is associated with new address pools.</li>
         * <li>If this parameter is left empty, the address pools that are associated with the desired instance are removed and no address pool is associated with the instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pool-89564542105737**12</p>
         */
        @NameInMap("AddressPoolId")
        public String addressPoolId;

        /**
         * <p>The DNS request sources.</p>
         */
        @NameInMap("RequestSource")
        public java.util.List<String> requestSource;

        /**
         * <p>The sequence number of the new address pool. The address pool with the smallest sequence number is preferentially returned for DNS requests from any source. The sequence number specifies the priority for returning the address pool. A smaller sequence number specifies a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SerialNumber")
        public Integer serialNumber;

        /**
         * <p>The weight value of the new address pool. You can set a different weight value for each address pool. This way, address pools are returned based on the weight values for Domain Name System (DNS) requests. A weight value must be an integer that ranges from 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WeightValue")
        public Integer weightValue;

        public static ReplaceCloudGtmInstanceConfigAddressPoolRequestAddressPools build(java.util.Map<String, ?> map) throws Exception {
            ReplaceCloudGtmInstanceConfigAddressPoolRequestAddressPools self = new ReplaceCloudGtmInstanceConfigAddressPoolRequestAddressPools();
            return TeaModel.build(map, self);
        }

        public ReplaceCloudGtmInstanceConfigAddressPoolRequestAddressPools setAddressPoolId(String addressPoolId) {
            this.addressPoolId = addressPoolId;
            return this;
        }
        public String getAddressPoolId() {
            return this.addressPoolId;
        }

        public ReplaceCloudGtmInstanceConfigAddressPoolRequestAddressPools setRequestSource(java.util.List<String> requestSource) {
            this.requestSource = requestSource;
            return this;
        }
        public java.util.List<String> getRequestSource() {
            return this.requestSource;
        }

        public ReplaceCloudGtmInstanceConfigAddressPoolRequestAddressPools setSerialNumber(Integer serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public Integer getSerialNumber() {
            return this.serialNumber;
        }

        public ReplaceCloudGtmInstanceConfigAddressPoolRequestAddressPools setWeightValue(Integer weightValue) {
            this.weightValue = weightValue;
            return this;
        }
        public Integer getWeightValue() {
            return this.weightValue;
        }

    }

}
