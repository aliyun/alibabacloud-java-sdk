// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class StartInstanceRequest extends TeaModel {
    /**
     * <p>The initial configurations of the ApsaraMQ for Kafka instance. The values must be valid JSON strings. If you do not specify this parameter, it is left empty.</p>
     * <blockquote>
     * <ul>
     * <li>You cannot configure this parameter when you deploy an ApsaraMQ for Confluent instance.</li>
     * <li>You cannot configure enable.acl for instances whose versions are earlier than 2.2.0.</li>
     * </ul>
     * </blockquote>
     * <p>The <strong>Config</strong> parameter supports the following parameters:</p>
     * <ul>
     * <li><p><strong>enable.vpc_sasl_ssl</strong>: specifies whether to enable VPC transmission encryption. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables VPC transmission encryption. If you enable VPC transmission encryption, you must also enable access control list (ACL).</li>
     * <li><strong>false</strong>: disables VPC transmission encryption. This is the default value.</li>
     * </ul>
     * </li>
     * <li><p><strong>enable.acl</strong>: specifies whether to enable ACL. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables ACL.</li>
     * <li><strong>false</strong>: disables the ACL feature. This is the default value.</li>
     * </ul>
     * </li>
     * <li><p><strong>kafka.log.retention.hours</strong>: the maximum message retention period when the disk capacity is sufficient. Unit: hours. Valid values: 24 to 480. Default value: <strong>72</strong>. When the disk usage reaches 85%, the disk capacity is insufficient. In this case, the system deletes the earliest stored messages to ensure service availability.</p>
     * </li>
     * <li><p><strong>kafka.message.max.bytes</strong>: the maximum size of a message that can be sent and received by ApsaraMQ for Kafka. Unit: bytes. Valid values: 1048576 to 10485760. Default value: <strong>1048576</strong>. Before you change the maximum message size to a new value, make sure that the new value matches the configurations of the producers and consumers.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;kafka.log.retention.hours&quot;:&quot;33&quot;}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>Specifies whether cross-zone deployment is required. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CrossZone")
    public Boolean crossZone;

    /**
     * <p>The deployment mode. If the instance is an ApsaraMQ for Kafka V2 instance, this parameter is required. If the instance is an ApsaraMQ for Kafka V3 instance or an ApsaraMQ for Confluent instance, this parameter is optional. Valid values:</p>
     * <ul>
     * <li><strong>vpc</strong>: deploys the instance in a virtual private cloud (VPC).</li>
     * <li><strong>eip</strong>: deploys the instance over the Internet and in the VPC.</li>
     * </ul>
     * <p>The deployment mode of the ApsaraMQ for Kafka instance must be consistent with the instance type. If the instance is a VPC-connected instance, set this parameter to <strong>vpc</strong>. If the instance is an Internet- and VPC-connected instance, set this parameter to <strong>eip</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("DeployModule")
    public String deployModule;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alikafka_post-cn-v0h1fgs2****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether the instance supports elastic IP addresses (EIPs). Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: supports EIPs and allows access from the Internet and a VPC.</li>
     * <li><strong>false</strong>: does not support EIPs and allows access only from a VPC.</li>
     * </ul>
     * <p>The value of this parameter must match the type of the instance. For example, if the instance allows access only from a VPC, set this parameter to <strong>false</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsEipInner")
    public Boolean isEipInner;

    /**
     * <p>Specifies whether to forcibly deploy the instance in the selected zones.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsForceSelectedZones")
    public Boolean isForceSelectedZones;

    /**
     * <p>Specifies whether to set a new username and password. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: sets a new username and password.</li>
     * <li><strong>false</strong>: does not set a new username or password.</li>
     * </ul>
     * <p>This parameter is available only if you deploy an instance that allows access from the Internet and a VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsSetUserAndPassword")
    public Boolean isSetUserAndPassword;

    /**
     * <p>The ID of the key that is used for disk encryption in the region where the instance is deployed. You can obtain the ID of the key in the <a href="https://kms.console.aliyun.com/?spm=a2c4g.11186623.2.5.336745b8hfiU21">Key Management Service (KMS) console</a> or create a key. For more information, see <a href="https://help.aliyun.com/document_detail/181610.html">Manage CMKs</a>.</p>
     * <p>If this parameter is configured, disk encryption is enabled for the instance. You cannot disable disk encryption after disk encryption is enabled. When you call this operation, the system checks whether the AliyunServiceRoleForAlikafkaInstanceEncryption service-linked role is created. If the role is not created, the system automatically creates the role. For more information, see <a href="https://help.aliyun.com/document_detail/190460.html">Service-linked roles</a>.</p>
     * <blockquote>
     * <p>When you deploy a serverless ApsaraMQ for Kafka V3 instance, you cannot configure this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0d24xxxx-da7b-4786-b981-9a164dxxxxxx</p>
     */
    @NameInMap("KMSKeyId")
    public String KMSKeyId;

    /**
     * <p>The name of the instance.</p>
     * <blockquote>
     * <p> If you specify a value for this parameter, make sure that the specified value is unique in the region of the instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>newInstanceName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The alert contact.</p>
     * 
     * <strong>example:</strong>
     * <p>Mr. Wang</p>
     */
    @NameInMap("Notifier")
    public String notifier;

    /**
     * <p>The instance password.</p>
     * <ul>
     * <li>This parameter is available only for Internet- and VPC- connected ApsaraMQ for Kafka V2 and V3 instances.</li>
     * <li>If the instance is an ApsaraMQ for Confluent instance, this parameter is required. The value of this parameter must be 8 to 32 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. The following special characters are supported: ! @ # $ % ^ &amp; \* () _ + - =</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>password</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The security group of the instance.</p>
     * <p>If you do not specify this parameter, ApsaraMQ for Kafka automatically configures a security group for your instance. If you specify this parameter, you must create a security group in advance. For more information, see <a href="https://help.aliyun.com/document_detail/25468.html">Create a security group</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp13wfx7kz9pko****</p>
     */
    @NameInMap("SecurityGroup")
    public String securityGroup;

    /**
     * <p>The two-dimensional arrays that consist of the candidate set for primary zones and the candidate set for secondary zones. Custom code in the <code>zone {zone}</code> format and standard code in the <code>cn-RegionID-{zone}</code> format are supported.</p>
     * <ul>
     * <li>If you set CrossZone to true and specify Zone H and Zone F as the candidate set for primary zones and Zone K as the candidate set for secondary zones, set this parameter to <code>[[&quot;zoneh&quot;,&quot;zonef&quot;],[&quot;zonek&quot;]]</code>.</li>
     * </ul>
     * <blockquote>
     * <p>If you specify multiple zones as the primary or secondary zones, the system deploys the instance in one of the zones without prioritizing them. For example, if you set this parameter to <code>[[&quot;zoneh&quot;,&quot;zonef&quot;],[&quot;zonek&quot;]]</code>, the primary zone in which the instance is deployed can be Zone H or Zone F, and the secondary zone is Zone K.</p>
     * </blockquote>
     * <ul>
     * <li>If you set CrossZone to false and want to deploy the instance in Zone K, set this parameter to <code>[[&quot;zonek&quot;],[]]</code>. In this case, the value of this parameter must still be two-dimensional arrays, but the array that specifies the candidate for secondary zones is left empty.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[[\&quot;zonel\&quot;],[\&quot;zonek\&quot;]]</p>
     */
    @NameInMap("SelectedZones")
    public String selectedZones;

    /**
     * <p>The version of the ApsaraMQ for Kafka instance. Valid values:</p>
     * <ul>
     * <li>ApsaraMQ for Kafka V2 instances: 2.2.0 and 2.6.2.</li>
     * <li>ApsaraMQ for Kafka V3 instances: 3.3.1.</li>
     * <li>ApsaraMQ for Confluent instances: 7.4.0.</li>
     * </ul>
     * <p>Default value:</p>
     * <ul>
     * <li>ApsaraMQ for Kafka V2 instances: 2.2.0.</li>
     * <li>ApsaraMQ for Kafka V3 instances: 3.3.1.</li>
     * <li>ApsaraMQ for Confluent instances: 7.4.0.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ApsaraMQ for Kafka V2 instances: 2.2.0
     * ApsaraMQ for Kafka V3 instances: 3.3.1
     * ApsaraMQ for Confluent instances: 7.4.0</p>
     */
    @NameInMap("ServiceVersion")
    public String serviceVersion;

    /**
     * <p>The mobile phone number of the alert contact.</p>
     * 
     * <strong>example:</strong>
     * <p>1581234****</p>
     */
    @NameInMap("UserPhoneNum")
    public String userPhoneNum;

    /**
     * <p>The instance username.</p>
     * <ul>
     * <li>This parameter is available only for Internet- and VPC- connected ApsaraMQ for Kafka V2 and V3 instances.</li>
     * <li>If the instance is an ApsaraMQ for Confluent instance, set this parameter to root or leave this parameter empty.</li>
     * </ul>
     * <p>Default value for ApsaraMQ for Kafka V2 and V3 instances: username. Default value for ApsaraMQ for Confluent instances: root.</p>
     * 
     * <strong>example:</strong>
     * <p>username</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>The ID of the vSwitch to which you want to connect the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1j3sg5979fstnpl****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The IDs of the vSwitches with which the instance is associated. If the instance is an ApsaraMQ for Kafka V2 or V3 instance, this parameter is required. If the instance is an ApsaraMQ for Confluent instance, you must configure one of VSwitchIds and VSwitchId. If you configure both of the parameters, the value of VSwitchIds takes effect.</p>
     */
    @NameInMap("VSwitchIds")
    public java.util.List<String> vSwitchIds;

    /**
     * <p>The ID of the virtual private cloud (VPC) in which you want to deploy the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1r4eg3yrxmygv****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The ID of the zone where you want to deploy the ApsaraMQ for Kafka instance.</p>
     * <ul>
     * <li>The zone ID of the ApsaraMQ for Kafka instance must be the same as that of the vSwitch.</li>
     * <li>The value must be in the zoneX or Region ID-X format. Examples: zonea and cn-hangzhou-k.</li>
     * </ul>
     * <blockquote>
     * <p> If resources in the specified zone is insufficient, the instance may be deployed in another zone.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-k</p>
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
