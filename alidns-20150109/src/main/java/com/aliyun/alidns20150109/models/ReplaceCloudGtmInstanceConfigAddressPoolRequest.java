// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ReplaceCloudGtmInstanceConfigAddressPoolRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("AddressPools")
    public java.util.List<ReplaceCloudGtmInstanceConfigAddressPoolRequestAddressPools> addressPools;

    /**
     * <strong>example:</strong>
     * <p>1ae05db4-10e7-11ef-b126-00163e24**22</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>Config-000**11</p>
     */
    @NameInMap("ConfigId")
    public String configId;

    /**
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
         * <strong>example:</strong>
         * <p>pool-89564542105737**12</p>
         */
        @NameInMap("AddressPoolId")
        public String addressPoolId;

        @NameInMap("RequestSource")
        public java.util.List<String> requestSource;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SerialNumber")
        public Integer serialNumber;

        /**
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
