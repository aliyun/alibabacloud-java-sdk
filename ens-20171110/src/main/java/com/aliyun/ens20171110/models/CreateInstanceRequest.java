// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    @NameInMap("DataDisk")
    public java.util.List<CreateInstanceRequestDataDisk> dataDisk;

    @NameInMap("SystemDisk")
    public CreateInstanceRequestSystemDisk systemDisk;

    /**
     * <p>Specifies whether to enable auto-renewal. Valid values: <strong>True</strong> | <strong>False</strong> (default).</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("AutoRenew")
    public String autoRenew;

    /**
     * <p>The auto-renewal period. This parameter is required when <strong>AutoRenew</strong> is set to <strong>True</strong>. Valid values: <strong>1</strong> to <strong>12</strong>. Unit: months.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("AutoRenewPeriod")
    public String autoRenewPeriod;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The hostname of the instance.
     * General naming conventions: Periods (.) and hyphens (-) cannot be used as the first or last character and cannot be used consecutively.</p>
     * <p>Specific naming conventions:</p>
     * <ul>
     * <li>Windows instances: The hostname must be <strong>2</strong> to <strong>15</strong> characters in length. Periods (.) are not supported. The hostname cannot consist entirely of digits. Uppercase letters, lowercase letters, digits, and hyphens (-) are allowed.</li>
     * <li>Other instances (such as Linux): The hostname must be <strong>2</strong> to <strong>64</strong> characters in length. Multiple periods (.) are supported. Each segment separated by a period can contain uppercase letters, lowercase letters, digits, and hyphens (-).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test-HostName</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The ID of the image that is used to start the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>yourImage ID</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The name of the instance. Naming conventions:</p>
     * <ul>
     * <li>The name must be <strong>2</strong> to <strong>128</strong> characters in length and can contain letters and Chinese characters.</li>
     * <li>The name must start with an uppercase letter, a lowercase letter, or a Chinese character. It cannot start with http:// or https://.</li>
     * <li>The name can contain digits, colons (:), underscores (_), periods (.), or hyphens (-).</li>
     * </ul>
     * <p>If this parameter is not specified, the default value is the InstanceId of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>test：Instance_Name.1-2</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The instance type.</p>
     * <p>For details about instance types, see <a href="https://help.aliyun.com/document_detail/66124.html">Limits</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ens.se1.tiny</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>This parameter is required when you create an instance for the first time. If you already have instance resources, the existing billing method is used by default. Valid values:</p>
     * <ul>
     * <li><p><strong>BandwidthByDay</strong>: daily peak bandwidth.</p>
     * </li>
     * <li><p><strong>95BandwidthByMonth</strong>: monthly 95th percentile bandwidth.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>95BandwidthByMonth</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The IP type. Valid values:</p>
     * <ul>
     * <li><p><strong>ipv4</strong> (default): IPv4.</p>
     * </li>
     * <li><p><strong>ipv6</strong>: IPv6.</p>
     * </li>
     * <li><p><strong>ipv4Andipv6</strong>: IPv4 and IPv6.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ipv4</p>
     */
    @NameInMap("IpType")
    public String ipType;

    /**
     * <p>The name of the key pair. Only a single name is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>TestKeyPairName</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The password of the instance.</p>
     * <p>The password must be 8 to 30 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. The following special characters are supported: <code>()`~!@#$%^&amp;*-_+=|{}[]:;\\&quot;&lt;&gt;,.?/</code></p>
     * 
     * <strong>example:</strong>
     * <p>yourPassword:1</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>Specifies whether to use the preset password of the image. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The preset password of the image is used. The <strong>Password</strong> parameter must be empty, and you must make sure that the image has a preset password.</li>
     * <li><strong>false</strong>: The preset password of the image is not used.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PasswordInherit")
    public Boolean passwordInherit;

    /**
     * <p>The payment method. Currently, this is a fixed value of Subscription (subscription instance). Modification is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Subscription</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>The subscription duration. Valid values: <strong>1</strong> to <strong>9</strong> and <strong>12</strong>. Unit: months.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The private IP address. If you specify a private IP address, you must also specify the VSwitchId parameter. The vSwitch must be created in advance. Otherwise, an error is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10.10.10.10</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>Specifies whether a public IP address can be assigned to the specified instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong> (default): A public IP address can be assigned.</li>
     * <li><strong>false</strong>: A public IP address cannot be assigned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PublicIpIdentification")
    public Boolean publicIpIdentification;

    /**
     * <p>The number of instances.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Quantity")
    public String quantity;

    /**
     * <p>Specifies whether to add sequential suffixes to <strong>HostName</strong> and <strong>InstanceName</strong>. The sequential suffixes start from <strong>001</strong> and cannot exceed <strong>999</strong>.</p>
     * <p>Example: <strong>LocalHost001</strong>, <strong>LocalHost002</strong>, <strong>MyInstance001</strong>, and <strong>MyInstance002</strong>.</p>
     * <p>Default value: <strong>false</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UniqueSuffix")
    public Boolean uniqueSuffix;

    /**
     * <p>The custom data. The data must start with <code>#!</code>. The maximum length is 256 characters and the maximum size is 16 KB. Only custom data scripts are supported. InstanceMetaData rendering is not supported.</p>
     * <p>You can pass in custom data that is Base64-encoded. When you call the API to initiate a request, the custom data you specify is not encrypted. Do not pass in confidential information such as passwords and private keys in plaintext. If you need to pass in passwords or private keys, encrypt the content first and then Base64-encode it before passing it in. Decrypt the content in the same way inside the instance.</p>
     * <p>For more information, see <a href="https://cloudinit.readthedocs.io/en/latest/topics/format.html">Data format</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>#!/bin/sh  echo &quot;Hello World.  The time is now $(date -R)!&quot; | tee /home/output.txt</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The vSwitch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>YourVSwitchId</p>
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
         * <p>The size of the first data cloud disk. Unit: GiB. The size must be at least 20 GiB and a multiple of 10.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
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
         * <p>The size of the system cloud disk. Unit: GiB. The value must be a multiple of 10 and cannot be smaller than the image size. For the valid range, refer to the SystemDiskMinSize and SystemDiskMaxSize values returned by DescribeAvailableResourceInfo. 20 GiB and 40 GiB are common configurations and do not indicate that only these two values are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
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
