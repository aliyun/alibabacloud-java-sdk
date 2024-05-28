// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ReplaceCloudGtmAddressPoolAddressRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("AddressPoolId")
    public String addressPoolId;

    @NameInMap("Addresses")
    public java.util.List<ReplaceCloudGtmAddressPoolAddressRequestAddresses> addresses;

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
        @NameInMap("AddressId")
        public String addressId;

        @NameInMap("RequestSource")
        public java.util.List<String> requestSource;

        @NameInMap("SerialNumber")
        public Integer serialNumber;

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
