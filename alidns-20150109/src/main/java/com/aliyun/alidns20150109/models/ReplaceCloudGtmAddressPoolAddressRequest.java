// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ReplaceCloudGtmAddressPoolAddressRequest extends TeaModel {
    /**
     * <p>The response language. Valid values:</p>
     * <ul>
     * <li><p><strong>zh-CN</strong>: Chinese</p>
     * </li>
     * <li><p><strong>en-US</strong> (Default): English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The unique ID of the address pool to update.</p>
     * 
     * <strong>example:</strong>
     * <p>pool-89618921167339****</p>
     */
    @NameInMap("AddressPoolId")
    public String addressPoolId;

    /**
     * <p>The list of addresses.</p>
     */
    @NameInMap("Addresses")
    public java.util.List<ReplaceCloudGtmAddressPoolAddressRequestAddresses> addresses;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. Ensure the client token is unique for each request. The token can contain a maximum of 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>1ae05db4-10e7-11ef-b126-00163e24****</p>
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
         * <p>The unique ID of the address.</p>
         * <ul>
         * <li><p>If you specify this parameter, all existing addresses in the address pool are deleted and replaced with the specified addresses.</p>
         * </li>
         * <li><p>If you leave this parameter empty, all existing addresses in the address pool are deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>addr-89636516932803****</p>
         */
        @NameInMap("AddressId")
        public String addressId;

        /**
         * <p>The list of DNS request sources.</p>
         */
        @NameInMap("RequestSource")
        public java.util.List<String> requestSource;

        /**
         * <p>The serial number, which determines the priority of the address. A smaller number indicates a higher priority. This setting applies to the updated addresses.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SerialNumber")
        public Integer serialNumber;

        /**
         * <p>The weight of the address. Valid values: 1 to 100. You can set a different weight for each address. DNS queries are then resolved based on the weight ratio. This setting applies to the updated addresses.</p>
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
