// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class StartInstanceRequest extends TeaModel {
    /**
     * <p>The initial configurations of the ApsaraMQ for Kafka instance. The value must be a valid JSON string. If you do not specify this parameter, the default value is empty.</p>
     * <blockquote>
     * <ul>
     * <li><p>You cannot specify the Config parameter when you deploy a Confluent instance.</p>
     * </li>
     * <li><p>The enable.acl configuration is not supported for instances of versions earlier than 2.2.0. Only Professional Edition and Serverless instances support access control lists (ACLs).</p>
     * </li>
     * </ul>
     * </blockquote>
     * <p>The following parameters of <strong>Config</strong> are supported for reserved instances:</p>
     * <ul>
     * <li><p><strong>enable.vpc_sasl_ssl</strong></p>
     * </li>
     * <li><p><strong>enable.acl</strong></p>
     * </li>
     * <li><p><strong>kafka.log.retention.hours</strong></p>
     * </li>
     * <li><p><strong>kafka.message.max.bytes</strong></p>
     * </li>
     * </ul>
     * <p>The following parameters of <strong>Config</strong> are supported for Serverless instances:</p>
     * <ul>
     * <li><p><strong>enable.vpc_sasl_ssl</strong></p>
     * </li>
     * <li><p><strong>enable.acl</strong></p>
     * </li>
     * <li><p><strong>log.retention.hours</strong></p>
     * </li>
     * <li><p><strong>offsets.retention.minutes</strong></p>
     * </li>
     * <li><p><strong>message.max.bytes</strong></p>
     * </li>
     * <li><p><strong>auto.create.topics.enable</strong></p>
     * </li>
     * <li><p><strong>num.partitions</strong></p>
     * </li>
     * </ul>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>For more information, see <a href="https://help.aliyun.com/zh/apsaramq-for-kafka/cloud-message-queue-for-kafka/developer-reference/api-alikafka-2019-09-16-updateinstanceconfig?spm=a2c4g.11186623.0.0.3e9e2a04vLr5nF">UpdateInstanceConfig</a>.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <p>For more information, see <a href="https://www.alibabacloud.com/help/zh/apsaramq-for-kafka/cloud-message-queue-for-kafka/developer-reference/api-alikafka-2019-09-16-updateinstanceconfig?spm=a2c63.p38356.0.i1">UpdateInstanceConfig</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;kafka.log.retention.hours&quot;:&quot;33&quot;}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>Specifies whether to deploy the instance across zones.</p>
     * <ul>
     * <li><p>true: Deploy the instance across zones.</p>
     * </li>
     * <li><p>false: Do not deploy the instance across zones.</p>
     * </li>
     * </ul>
     * <p>Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CrossZone")
    public Boolean crossZone;

    /**
     * <p>The deployment mode of the instance. This parameter is required for provisioned instances. This parameter is not required for Serverless and Confluent instances. Valid values:</p>
     * <ul>
     * <li><p><strong>vpc</strong>: VPC instance</p>
     * </li>
     * <li><p><strong>eip</strong>: Internet/VPC instance</p>
     * </li>
     * </ul>
     * <p>The deployment mode of the instance must be consistent with the instance type. If the instance is a VPC instance, set this parameter to <strong>vpc</strong>. If the instance is an Internet/VPC instance, set this parameter to <strong>eip</strong>.</p>
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
     * <p>Specifies whether to enable elastic IP addresses (EIPs). Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The instance is an Internet/VPC instance.</p>
     * </li>
     * <li><p><strong>false</strong>: The instance is a VPC instance.</p>
     * </li>
     * </ul>
     * <p>The value of this parameter must be consistent with the instance type. For example, if the instance is a VPC instance, you must set this parameter to <strong>false</strong>.</p>
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
     * <li><p><strong>true</strong>: Set a new username and password.</p>
     * </li>
     * <li><p><strong>false</strong>: Do not set a new username and password.</p>
     * </li>
     * </ul>
     * <p>This parameter is supported only for Internet/VPC instances.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsSetUserAndPassword")
    public Boolean isSetUserAndPassword;

    /**
     * <p>The ID of the key that is used for disk encryption in the same region. You can view the key ID in the <a href="https://kms.console.aliyun.com/?spm=a2c4g.11186623.2.5.336745b8hfiU21">Key Management Service (KMS) console</a> or create a key. For more information, see <a href="https://help.aliyun.com/document_detail/181610.html">Manage keys</a>.</p>
     * <p>If you specify this parameter, disk encryption is enabled. You cannot disable disk encryption after it is enabled. When you call this operation, the system checks whether the AliyunServiceRoleForAlikafkaInstanceEncryption service-linked role is created. If the role is not created, the system automatically creates the role. For more information, see <a href="https://help.aliyun.com/document_detail/190460.html">Service-linked Role</a>.</p>
     * <blockquote>
     * <ul>
     * <li>You cannot specify the KMSKeyId parameter when you deploy a Serverless instance.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0d24xxxx-da7b-4786-b981-9a164dxxxxxx</p>
     */
    @NameInMap("KMSKeyId")
    public String KMSKeyId;

    /**
     * <p>The name of the instance.</p>
     * <p>This parameter is not supported for Serverless and Confluent instances.</p>
     * <blockquote>
     * <p>If you specify this parameter, make sure that the value is unique in the same region.</p>
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
     * <p>The password.</p>
     * <ul>
     * <li><p>For provisioned and Serverless instances, this parameter is supported only for Internet/VPC instances.</p>
     * </li>
     * <li><p>This parameter is required for Confluent instances. The password must be 8 to 32 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters are !@#$%^&amp;\*()_+-=.</p>
     * </li>
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
     * <p>If you do not specify this parameter, ApsaraMQ for Kafka automatically configures a security group for your instance. If you want to specify this parameter, you must create a security group for the instance in advance. For more information, see <a href="https://help.aliyun.com/document_detail/25468.html">Create a security group</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp13wfx7kz9pko****</p>
     */
    @NameInMap("SecurityGroup")
    public String securityGroup;

    /**
     * <p>A two-dimensional array that consists of the candidate set of the primary zone and the candidate set of the secondary zone. The values can be custom codes (<code>zone{zone}</code>) or standard codes (<code>cn-RegionID-{zone}</code>).</p>
     * <ul>
     * <li><p>If you want to deploy the instance across zones (isCrossZone=true), the candidate set of the primary zone is Zone H or Zone F, and the candidate set of the secondary zone is Zone K, set this parameter to <code>[[\\&quot;zoneh\\&quot;,\\&quot;zonef\\&quot;],[\\&quot;zonek\\&quot;]]</code>. This example uses custom codes.</p>
     * <blockquote>
     * <p>If you specify multiple zones for the primary or secondary zone, the system selects one of the zones for deployment without a priority. For example, if you set the parameter to <code>[[\\&quot;zoneh\\&quot;,\\&quot;zonef\\&quot;],[\\&quot;zonek\\&quot;]]</code>, the primary zone of the deployed instance is Zone H or Zone F, and the secondary zone is Zone K.</p>
     * </blockquote>
     * </li>
     * <li><p>If you do not want to deploy the instance across zones (isCrossZone=false) and want to deploy the instance in Zone K, set this parameter to <code>[[\\&quot;zonek\\&quot;],[]]</code>. This example uses a custom code. Note that you must still specify two arrays. The second array, which represents the candidate set of the secondary zone, can be empty [].</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Relationship between the SelectedZones and VSwitchIds parameters for provisioned instances</p>
     * <ul>
     * <li>If you specify only VSwitchIds and do not specify SelectedZones, the system preferentially selects the zones that correspond to the vSwitches in VSwitchIds.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[[\&quot;zonel\&quot;],[\&quot;zonek\&quot;]]</p>
     */
    @NameInMap("SelectedZones")
    public String selectedZones;

    /**
     * <p>The version of the ApsaraMQ for Kafka instance that you want to deploy.</p>
     * <ul>
     * <li><p>For provisioned instances, valid values are 2.2.0 and 2.6.2.</p>
     * </li>
     * <li><p>For Serverless instances, the valid value is 3.3.1.</p>
     * </li>
     * <li><p>For Confluent instances, the valid value is 7.4.0.</p>
     * </li>
     * </ul>
     * <p>Default value:</p>
     * <ul>
     * <li><p>Provisioned instances: 2.2.0</p>
     * </li>
     * <li><p>Serverless instances: 3.3.1</p>
     * </li>
     * <li><p>Confluent instances: 7.4.0</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Reserved Instance Series: 2.2.0
     * Serverless Instance Series: 3.3.1
     * Confluent Series: 7.4.0</p>
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
     * <p>The username.</p>
     * <ul>
     * <li><p>For provisioned and Serverless instances, this parameter is supported only for Internet/VPC instances.</p>
     * </li>
     * <li><p>For Confluent instances, you can set this parameter only to root or leave it empty.</p>
     * </li>
     * </ul>
     * <p>Default value: For provisioned and Serverless instances, the default value is username. For Confluent instances, the default value is root.</p>
     * 
     * <strong>example:</strong>
     * <p>username</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>The ID of the vSwitch to which the instance is deployed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1j3sg5979fstnpl****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The list of vSwitch IDs. This parameter is required for provisioned and Serverless instances. This parameter is supported for Confluent instances. You must specify at least one of VSwitchIds and VSwitchId. If you specify both, VSwitchIds takes precedence.</p>
     */
    @NameInMap("VSwitchIds")
    public java.util.List<String> vSwitchIds;

    /**
     * <p>The ID of the VPC in which the instance is deployed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1r4eg3yrxmygv****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The ID of the zone in which the instance is deployed.</p>
     * <ul>
     * <li><p>The value must be the zone ID of the vSwitch.</p>
     * </li>
     * <li><p>The value can be in the zoneX or RegionId-X format. For example, you can set the value to zonea or cn-hangzhou-k.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If resources in the specified zone are insufficient, the instance may be deployed in another zone.</p>
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
