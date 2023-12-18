// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    @NameInMap("DataDisk")
    public java.util.List<CreateInstanceRequestDataDisk> dataDisk;

    @NameInMap("SystemDisk")
    public CreateInstanceRequestSystemDisk systemDisk;

    /**
     * <p>Specifies whether to enable the auto-renewal feature. Valid values: **True** and **False**. Default value: False.</p>
     */
    @NameInMap("AutoRenew")
    public String autoRenew;

    /**
     * <p>The auto-renewal period for the instance. This parameter is required when the **AutoRenew** parameter is set to **True**. Valid values: **1** to **12**. Unit: months.</p>
     */
    @NameInMap("AutoRenewPeriod")
    public String autoRenewPeriod;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The hostname of the Elastic Compute Service (ECS) instance. General naming rules: The hostname cannot start or end with a period (.) or hyphen (-). It cannot contain consecutive periods (.) or hyphens (-).</p>
     * <br>
     * <p>Naming rules for specific instances:</p>
     * <br>
     * <p>*   For Windows instances, the hostname must be **2** to **15** characters in length and cannot contain periods (.) or contain only digits. The hostname cannot contain periods (.) or contain only digits.</p>
     * <p>*   For instances that run one of other operating systems such as Linux, the hostname must be **2** to **64** characters in length. You can use periods (.) to separate the hostname into multiple segments. Each segment can contain letters, digits, and hyphens (-).</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The ID of the image file that you select when creating the instance.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The name of the instance. The name must conform to the following naming conventions:</p>
     * <br>
     * <p>*   The name must be **2** to **128** characters in length.</p>
     * <p>*   It must start with a letter but cannot start with http:// or https://.</p>
     * <p>*   The name can contain letters, digits, colons (:), underscores (\_), periods (.), and hyphens (-).</p>
     * <br>
     * <p>If you do not specify this parameter, the instance ID is used as the instance name by default.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The type of the instance.</p>
     * <br>
     * <p>For more information, see [](~~66124~~).</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>This parameter is required if you create the instance for the first time. The existing billing method is used by default if you have created an instance. Valid values:</p>
     * <br>
     * <p>*   **BandwidthByDay**: Pay by daily peak bandwidth.</p>
     * <p>*   **95BandwidthByMonth**: Pay by monthly 95th percentile bandwidth.</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The type of IP address. Valid values:</p>
     * <br>
     * <p>*   **ipv4**: IPv4. This is the default value.</p>
     * <p>*   **ipv6**: IPv6.</p>
     * <p>*   **ipv4Andipv6**: IPv4 and IPv6.</p>
     */
    @NameInMap("IpType")
    public String ipType;

    /**
     * <p>The name of the key pair. You can specify only one name.</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The password of the instance.</p>
     * <br>
     * <p>The password must be 8 to 30 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include: ``()`~!@#$%^&*-_+=|{}[]:;\"<>,.?/``</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>Specifies whether to use the preset password of the image. Valid values:</p>
     * <br>
     * <p>*   **true**: The password preset in the image is used, and the **Password** parameter must be null. For secure access, make sure that the selected image has a password configured.</p>
     * <p>*   **false: does not use the password preset in the image.</p>
     */
    @NameInMap("PasswordInherit")
    public Boolean passwordInherit;

    /**
     * <p>The billing method of the instance. The value is set to Subscription.</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>The subscription period of the instance. Valid values: **1** to **9** and **12**. Unit: months.</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The internal IP address. If this parameter is specified, you must specify the vSwitch ID. The vSwitch must be created first. Otherwise, an error is returned.</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>Specifies whether a public IP address can be assigned to the specified instance. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("PublicIpIdentification")
    public Boolean publicIpIdentification;

    /**
     * <p>The number of instances.</p>
     */
    @NameInMap("Quantity")
    public String quantity;

    /**
     * <p>Specifies whether to automatically append sequential suffixes to the hostnames specified by the **HostName** parameter and instance names specified by the **InstanceName** parameter. The sequential numbers in the suffix range from **001** to **999**.</p>
     * <br>
     * <p>Examples: **LocalHost001** and **LocalHost002**, and **MyInstance001** and **MyInstance002**.</p>
     * <br>
     * <p>Default value: **false**.</p>
     */
    @NameInMap("UniqueSuffix")
    public Boolean uniqueSuffix;

    /**
     * <p>Custom data. The data starts with `#!`. The data can be at most 256 characters in length and 16 KB in size. Only custom scripts are supported and cannot be rendered by InstanceMetaData.</p>
     * <br>
     * <p>You can specify custom data. The data is encoded in Base64. The system does not encrypt your custom data when API requests are initiated. We recommend that you do not pass in confidential information such as passwords and private keys in plaintext. If you want to provide sensitive data such as passwords and private keys, encrypt the data and then encode it in Base64. The data is decrypted on the instance in the way it is encrypted.</p>
     * <br>
     * <p>For more information, see [User data formats](https://cloudinit.readthedocs.io/en/latest/topics/format.html).</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The ID of the vSwitch.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static CreateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceRequest self = new CreateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceRequest setDataDisk(java.util.List<CreateInstanceRequestDataDisk> dataDisk) {
        this.dataDisk = dataDisk;
        return this;
    }
    public java.util.List<CreateInstanceRequestDataDisk> getDataDisk() {
        return this.dataDisk;
    }

    public CreateInstanceRequest setSystemDisk(CreateInstanceRequestSystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public CreateInstanceRequestSystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public CreateInstanceRequest setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public CreateInstanceRequest setAutoRenewPeriod(String autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public String getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public CreateInstanceRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public CreateInstanceRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public CreateInstanceRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateInstanceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateInstanceRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
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

    public CreateInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateInstanceRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateInstanceRequest setPasswordInherit(Boolean passwordInherit) {
        this.passwordInherit = passwordInherit;
        return this;
    }
    public Boolean getPasswordInherit() {
        return this.passwordInherit;
    }

    public CreateInstanceRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public CreateInstanceRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateInstanceRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public CreateInstanceRequest setPublicIpIdentification(Boolean publicIpIdentification) {
        this.publicIpIdentification = publicIpIdentification;
        return this;
    }
    public Boolean getPublicIpIdentification() {
        return this.publicIpIdentification;
    }

    public CreateInstanceRequest setQuantity(String quantity) {
        this.quantity = quantity;
        return this;
    }
    public String getQuantity() {
        return this.quantity;
    }

    public CreateInstanceRequest setUniqueSuffix(Boolean uniqueSuffix) {
        this.uniqueSuffix = uniqueSuffix;
        return this;
    }
    public Boolean getUniqueSuffix() {
        return this.uniqueSuffix;
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

    public static class CreateInstanceRequestDataDisk extends TeaModel {
        /**
         * <p>The capacity of the first data disk. Unit: GiB. The capacity is at least 20 GiB and is a multiple of 10 GiB.</p>
         */
        @NameInMap("Size")
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

    public static class CreateInstanceRequestSystemDisk extends TeaModel {
        /**
         * <p>The size of the system disk. Unit: GiB. Valid values: **20** and **40**. The value cannot be smaller than the size of the image and must be a multiple of 10 GiB.</p>
         */
        @NameInMap("Size")
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

}
