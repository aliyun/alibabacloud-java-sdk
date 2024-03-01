// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class StartInstanceRequest extends TeaModel {
    /**
     * <p>The initial configurations of ApsaraMQ for Kafka. The value must be a valid JSON string.</p>
     * <br>
     * <p>If you do not specify this parameter, it is left empty.</p>
     * <br>
     * <p>The following parameters can be configured for **Config**:</p>
     * <br>
     * <p>*   **enable.vpc_sasl_ssl**: specifies whether to enable VPC transmission encryption. Valid values:</p>
     * <br>
     * <p>    *   **true**: enables VPC transmission encryption. If you enable VPC transmission encryption, you must also enable access control list (ACL).</p>
     * <p>    *   **false**: disables VPC transmission encryption. By default, VPC transmission encryption is disabled.</p>
     * <br>
     * <p>*   **enable.acl**: specifies whether to enable ACL. Valid values:</p>
     * <br>
     * <p>    *   **true**: enables ACL.</p>
     * <p>    *   **false**: disables ACL. By default, ACL is disabled.</p>
     * <br>
     * <p>*   **kafka.log.retention.hours**: the maximum message retention period when the disk capacity is sufficient. Unit: hours. Valid values: 24 to 480. Default value: **72**. When the disk usage reaches 85%, the disk capacity is considered insufficient and the system deletes messages in the order in which they are stored to ensure service availability.</p>
     * <br>
     * <p>*   **kafka.message.max.bytes**: the maximum size of messages that ApsaraMQ for Kafka can send and receive. Unit: bytes. Valid values: 1048576 to 10485760. Default value: **1048576**. Before you change the value of this parameter, make sure that the new value matches the corresponding configurations on the producers and consumers.</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>Specifies whether cross-zone deployment is required. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     * <br>
     * <p>Default value: true.</p>
     */
    @NameInMap("CrossZone")
    public Boolean crossZone;

    /**
     * <p>The deployment mode of the instance. Valid values:</p>
     * <br>
     * <p>*   **vpc**: deploys the instance that allows access only from a VPC.</p>
     * <p>*   **eip**: deploys the instance that allows access from the Internet and a VPC.</p>
     * <br>
     * <p>The deployment mode of the instance must match the type of the instance. If the instance allows access only from a VPC, set the value to **vpc**. If the instance allows access from the Internet and a VPC, set the value to **eip**.</p>
     */
    @NameInMap("DeployModule")
    public String deployModule;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether the instance supports elastic IP addresses (EIPs). Valid values:</p>
     * <br>
     * <p>*   **true**: supports EIPs and allows access from the Internet and a VPC.</p>
     * <p>*   **false**: does not support EIPs and allows access only from a VPC.</p>
     * <br>
     * <p>The value of this parameter must match the type of the instance. For example, if the instance allows access only from a VPC, set this parameter to **false**.</p>
     */
    @NameInMap("IsEipInner")
    public Boolean isEipInner;

    /**
     * <p>Specifies whether to forcibly deploy the instance in the selected zones.</p>
     */
    @NameInMap("IsForceSelectedZones")
    public Boolean isForceSelectedZones;

    /**
     * <p>Specifies whether to set a new username and password. Valid values:</p>
     * <br>
     * <p>*   **true**: sets a new username and password.</p>
     * <p>*   **false**: does not set a new username or password.</p>
     * <br>
     * <p>This parameter is available only if you deploy an instance that allows access from the Internet and a VPC.</p>
     */
    @NameInMap("IsSetUserAndPassword")
    public Boolean isSetUserAndPassword;

    /**
     * <p>The ID of the key that is used for disk encryption in the region where the instance is deployed. You can obtain the ID of the key in the [Key Management Service (KMS) console](https://kms.console.aliyun.com/?spm=a2c4g.11186623.2.5.336745b8hfiU21) or create a key. For more information, see [Manage CMKs](~~181610~~).</p>
     * <br>
     * <p>If this parameter is configured, disk encryption is enabled for the instance. You cannot disable disk encryption after disk encryption is enabled. When you call this operation, the system checks whether the AliyunServiceRoleForAlikafkaInstanceEncryption service-linked role is created. If the role is not created, the system automatically creates the role. For more information, see [Service-linked roles](~~190460~~).</p>
     */
    @NameInMap("KMSKeyId")
    public String KMSKeyId;

    /**
     * <p>The name of the instance.</p>
     * <br>
     * <p>>  If you specify a value for this parameter, make sure that the specified value is unique in the region of the instance.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The alert contact.</p>
     */
    @NameInMap("Notifier")
    public String notifier;

    /**
     * <p>The password that corresponds to the username.</p>
     * <br>
     * <p>This parameter is available only if you deploy an instance that allows access from the Internet and a VPC.</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The region ID of the instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The security group of the instance.</p>
     * <br>
     * <p>If you do not specify this parameter, ApsaraMQ for Kafka automatically configures a security group for your instance. If you specify this parameter, you must create a security group in advance. For more information, see [Create a security group](~~25468~~).</p>
     */
    @NameInMap("SecurityGroup")
    public String securityGroup;

    /**
     * <p>The two-dimensional arrays that consist of the candidate set for primary zones and the candidate set for secondary zones.</p>
     * <br>
     * <p>*   If you set CrossZone to true and specify Zone H and Zone F as the candidate set for primary zones and Zone K as the candidate set for secondary zones, set this parameter to `[[\"zoneh\",\"zonef\"],[\"zonek\"]]`.</p>
     * <br>
     * <p>    **</p>
     * <br>
     * <p>    **Note** If you specify multiple zones as the primary or secondary zones, the system deploys the instance in one of the zones without prioritizing them. For example, if you set this parameter to `[[\"zoneh\",\"zonef\"],[\"zonek\"]]`, the primary zone in which the instance is deployed can be Zone H or Zone F, and the secondary zone is Zone K.</p>
     * <br>
     * <p>*   If you set CrossZone to false and want to deploy the instance in Zone K, set this parameter to `[[\"zonek\"],[]]`. In this case, the value of this parameter must still be two-dimensional arrays, but the array that specifies the candidate for secondary zones is left empty.</p>
     */
    @NameInMap("SelectedZones")
    public String selectedZones;

    /**
     * <p>The version of ApsaraMQ for Kafka. Valid values: 0.10.2 and 2.2.0.</p>
     */
    @NameInMap("ServiceVersion")
    public String serviceVersion;

    /**
     * <p>The mobile phone number of the alert contact.</p>
     */
    @NameInMap("UserPhoneNum")
    public String userPhoneNum;

    /**
     * <p>The username that is used to access the instance.</p>
     * <br>
     * <p>This parameter is available only if you deploy an instance that allows access from the Internet and a VPC.</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>The ID of the vSwitch to which you want to connect the instance.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("VSwitchIds")
    public java.util.List<String> vSwitchIds;

    /**
     * <p>The ID of the virtual private cloud (VPC) in which you want to deploy the instance.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The ID of the zone in which you want to deploy the instance.</p>
     * <br>
     * <p>*   The zone ID of the instance must be the same as that of the vSwitch.</p>
     * <p>*   The value must be in the format of zoneX or Region ID-X. For example, you can set this parameter to zonea or cn-hangzhou-k.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static StartInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StartInstanceRequest self = new StartInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StartInstanceRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public StartInstanceRequest setCrossZone(Boolean crossZone) {
        this.crossZone = crossZone;
        return this;
    }
    public Boolean getCrossZone() {
        return this.crossZone;
    }

    public StartInstanceRequest setDeployModule(String deployModule) {
        this.deployModule = deployModule;
        return this;
    }
    public String getDeployModule() {
        return this.deployModule;
    }

    public StartInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StartInstanceRequest setIsEipInner(Boolean isEipInner) {
        this.isEipInner = isEipInner;
        return this;
    }
    public Boolean getIsEipInner() {
        return this.isEipInner;
    }

    public StartInstanceRequest setIsForceSelectedZones(Boolean isForceSelectedZones) {
        this.isForceSelectedZones = isForceSelectedZones;
        return this;
    }
    public Boolean getIsForceSelectedZones() {
        return this.isForceSelectedZones;
    }

    public StartInstanceRequest setIsSetUserAndPassword(Boolean isSetUserAndPassword) {
        this.isSetUserAndPassword = isSetUserAndPassword;
        return this;
    }
    public Boolean getIsSetUserAndPassword() {
        return this.isSetUserAndPassword;
    }

    public StartInstanceRequest setKMSKeyId(String KMSKeyId) {
        this.KMSKeyId = KMSKeyId;
        return this;
    }
    public String getKMSKeyId() {
        return this.KMSKeyId;
    }

    public StartInstanceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public StartInstanceRequest setNotifier(String notifier) {
        this.notifier = notifier;
        return this;
    }
    public String getNotifier() {
        return this.notifier;
    }

    public StartInstanceRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public StartInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StartInstanceRequest setSecurityGroup(String securityGroup) {
        this.securityGroup = securityGroup;
        return this;
    }
    public String getSecurityGroup() {
        return this.securityGroup;
    }

    public StartInstanceRequest setSelectedZones(String selectedZones) {
        this.selectedZones = selectedZones;
        return this;
    }
    public String getSelectedZones() {
        return this.selectedZones;
    }

    public StartInstanceRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public StartInstanceRequest setUserPhoneNum(String userPhoneNum) {
        this.userPhoneNum = userPhoneNum;
        return this;
    }
    public String getUserPhoneNum() {
        return this.userPhoneNum;
    }

    public StartInstanceRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public StartInstanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public StartInstanceRequest setVSwitchIds(java.util.List<String> vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

    public StartInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public StartInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
