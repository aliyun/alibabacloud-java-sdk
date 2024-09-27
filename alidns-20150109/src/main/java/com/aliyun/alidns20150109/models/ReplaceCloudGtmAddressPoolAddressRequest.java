// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ReplaceCloudGtmAddressPoolAddressRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><strong>zh-CN</strong>: Chinese</li>
     * <li><strong>en-US (default)</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the address pool for which you want to replace addresses. This ID uniquely identifies the address pool.</p>
     * 
     * <strong>example:</strong>
     * <p>pool-89618921167339**24</p>
     */
    @NameInMap("AddressPoolId")
    public String addressPoolId;

    /**
     * <p>The addresses.</p>
     */
    @NameInMap("Addresses")
    public java.util.List<ReplaceCloudGtmAddressPoolAddressRequestAddresses> addresses;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>1ae05db4-10e7-11ef-b126-00163e24**22</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    public static ReplaceCloudGtmAddressPoolAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceCloudGtmAddressPoolAddressRequest self = new ReplaceCloudGtmAddressPoolAddressRequest();
        return TeaModel.build(map, self);
    }

    public ReplaceCloudGtmAddressPoolAddressRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ReplaceCloudGtmAddressPoolAddressRequest setAddressPoolId(String addressPoolId) {
        this.addressPoolId = addressPoolId;
        return this;
    }
    public String getAddressPoolId() {
        return this.addressPoolId;
    }

    public ReplaceCloudGtmAddressPoolAddressRequest setAddresses(java.util.List<ReplaceCloudGtmAddressPoolAddressRequestAddresses> addresses) {
        this.addresses = addresses;
        return this;
    }
    public java.util.List<ReplaceCloudGtmAddressPoolAddressRequestAddresses> getAddresses() {
        return this.addresses;
    }

    public ReplaceCloudGtmAddressPoolAddressRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class ReplaceCloudGtmAddressPoolAddressRequestAddresses extends TeaModel {
        /**
         * <p>The ID of the new address. This ID uniquely identifies the address.</p>
         * <ul>
         * <li>If you specify this parameter, the original addresses in the address pool will be deleted and replaced with new addresses.</li>
         * <li>If you do not specify this parameter, all addresses in the address pool will be deleted and the address pool will be left empty.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>addr-89636516932803**44</p>
         */
        @NameInMap("AddressId")
        public String addressId;

        /**
         * <p>The DNS request sources.</p>
         */
        @NameInMap("RequestSource")
        public java.util.List<String> requestSource;

        /**
         * <p>The sequence number that specifies the priority for returning the new address. A smaller sequence number specifies a higher priority. This setting takes effect for new addresses.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SerialNumber")
        public Integer serialNumber;

        /**
         * <p>The weight value of the new address. You can set a different weight value for each address. This way, addresses are returned based on the weight values for Domain Name System (DNS) requests. A weight value must be an integer that ranges from 1 to 100. This setting takes effect for new addresses.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WeightValue")
        public Integer weightValue;

        public static ReplaceCloudGtmAddressPoolAddressRequestAddresses build(java.util.Map<String, ?> map) throws Exception {
            ReplaceCloudGtmAddressPoolAddressRequestAddresses self = new ReplaceCloudGtmAddressPoolAddressRequestAddresses();
            return TeaModel.build(map, self);
        }

        public ReplaceCloudGtmAddressPoolAddressRequestAddresses setAddressId(String addressId) {
            this.addressId = addressId;
            return this;
        }
        public String getAddressId() {
            return this.addressId;
        }

        public ReplaceCloudGtmAddressPoolAddressRequestAddresses setRequestSource(java.util.List<String> requestSource) {
            this.requestSource = requestSource;
            return this;
        }
        public java.util.List<String> getRequestSource() {
            return this.requestSource;
        }

        public ReplaceCloudGtmAddressPoolAddressRequestAddresses setSerialNumber(Integer serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public Integer getSerialNumber() {
            return this.serialNumber;
        }

        public ReplaceCloudGtmAddressPoolAddressRequestAddresses setWeightValue(Integer weightValue) {
            this.weightValue = weightValue;
            return this;
        }
        public Integer getWeightValue() {
            return this.weightValue;
        }

    }

}
