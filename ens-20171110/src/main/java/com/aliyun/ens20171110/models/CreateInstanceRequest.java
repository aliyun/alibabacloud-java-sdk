// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    @NameInMap("InstanceType")
    @Validation(required = true)
    public String instanceType;

    @NameInMap("EnsRegionId")
    @Validation(required = true)
    public String ensRegionId;

    @NameInMap("Password")
    public String password;

    @NameInMap("Period")
    @Validation(required = true)
    public String period;

    @NameInMap("ImageId")
    @Validation(required = true)
    public String imageId;

    @NameInMap("SystemDisk")
    public CreateInstanceRequestSystemDisk systemDisk;

    @NameInMap("Quantity")
    @Validation(required = true)
    public String quantity;

    @NameInMap("DataDisk")
    public java.util.List<CreateInstanceRequestDataDisk> dataDisk;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("AutoRenewPeriod")
    public String autoRenewPeriod;

    @NameInMap("AutoRenew")
    public String autoRenew;

    @NameInMap("IpType")
    public String ipType;

    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    @NameInMap("PaymentType")
    public String paymentType;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("UniqueSuffix")
    public Boolean uniqueSuffix;

    public static CreateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceRequest self = new CreateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateInstanceRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public CreateInstanceRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateInstanceRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateInstanceRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateInstanceRequest setSystemDisk(CreateInstanceRequestSystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public CreateInstanceRequestSystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public CreateInstanceRequest setQuantity(String quantity) {
        this.quantity = quantity;
        return this;
    }
    public String getQuantity() {
        return this.quantity;
    }

    public CreateInstanceRequest setDataDisk(java.util.List<CreateInstanceRequestDataDisk> dataDisk) {
        this.dataDisk = dataDisk;
        return this;
    }
    public java.util.List<CreateInstanceRequestDataDisk> getDataDisk() {
        return this.dataDisk;
    }

    public CreateInstanceRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public CreateInstanceRequest setAutoRenewPeriod(String autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public String getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public CreateInstanceRequest setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public CreateInstanceRequest setIpType(String ipType) {
        this.ipType = ipType;
        return this;
    }
    public String getIpType() {
        return this.ipType;
    }

    public CreateInstanceRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public CreateInstanceRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public CreateInstanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateInstanceRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public CreateInstanceRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public CreateInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateInstanceRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public CreateInstanceRequest setUniqueSuffix(Boolean uniqueSuffix) {
        this.uniqueSuffix = uniqueSuffix;
        return this;
    }
    public Boolean getUniqueSuffix() {
        return this.uniqueSuffix;
    }

    public static class CreateInstanceRequestSystemDisk extends TeaModel {
        @NameInMap("Size")
        @Validation(required = true)
        public String size;

        public static CreateInstanceRequestSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestSystemDisk self = new CreateInstanceRequestSystemDisk();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestSystemDisk setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

    }

    public static class CreateInstanceRequestDataDisk extends TeaModel {
        @NameInMap("Size")
        @Validation(required = true)
        public String size;

        public static CreateInstanceRequestDataDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestDataDisk self = new CreateInstanceRequestDataDisk();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestDataDisk setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

    }

}
