// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class GetInstanceResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetInstanceResponseBodyData data;

    /**
     * <p>The unique ID generated for the request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>92385FD2-624A-48C9-8FB5-753F2AFA***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceResponseBody self = new GetInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceResponseBody setData(GetInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetInstanceResponseBodyData getData() {
        return this.data;
    }

    public GetInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetInstanceResponseBodyDataTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>Tag key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>Tag value</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetInstanceResponseBodyDataTags build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyDataTags self = new GetInstanceResponseBodyDataTags();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyDataTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetInstanceResponseBodyDataTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetInstanceResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether auto-renewal is enabled for the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoRenewInstance")
        public Boolean autoRenewInstance;

        /**
         * <p>The classic network endpoint. This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>amqp-cn-st21x7kv****.not-support</p>
         */
        @NameInMap("ClassicEndpoint")
        public String classicEndpoint;

        /**
         * <p>The deployment architecture. Valid values:</p>
         * <ul>
         * <li><p>shared: shared architecture, which is suitable for reserved and elastic (shared) instances and pay-as-you-go instances.</p>
         * </li>
         * <li><p>dedicated: dedicated architecture, which is suitable for reserved and elastic (dedicated) instances.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>shared</p>
         */
        @NameInMap("Edition")
        public String edition;

        /**
         * <p>Indicates whether storage encryption is enabled for the instance data.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EncryptedInstance")
        public Boolean encryptedInstance;

        /**
         * <p>The timestamp that indicates when the instance expires, in milliseconds.</p>
         * <blockquote>
         * <p>The value is a long integer. Handle it with care in certain programming languages to prevent precision loss.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1651507200000</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>amqp-cn-*********</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the instance. A length of 64 characters or less is recommended.</p>
         * 
         * <strong>example:</strong>
         * <p>yunQi-instance</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The instance type.</p>
         * <ul>
         * <li><p>PROFESSIONAL: Professional Edition</p>
         * </li>
         * <li><p>ENTERPRISE: Enterprise Edition</p>
         * </li>
         * <li><p>VIP: Platinum Edition</p>
         * </li>
         * <li><p>SERVERLESS: Serverless Edition</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enterprise</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The KMS key ID of the cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>key-hzz6566e86byam3lg5rw4</p>
         */
        @NameInMap("KmsKeyId")
        public String kmsKeyId;

        /**
         * <p>The listener mode. A value of tcp_and_ssl enables both port 5672 and 5671, while ssl_only enables only port 5671.</p>
         * 
         * <strong>example:</strong>
         * <p>tcp_and_ssl</p>
         */
        @NameInMap("ListenerMode")
        public String listenerMode;

        /**
         * <p>The maximum number of connections.</p>
         * <p>For valid values, see the <a href="https://common-buy.aliyun.com/?commodityCode=ons_onsproxy_pre">ApsaraMQ for RabbitMQ purchase page</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1500</p>
         */
        @NameInMap("MaxConnections")
        public Integer maxConnections;

        /**
         * <p>The peak public TPS.</p>
         * <p>For valid values, see the <a href="https://common-buy.aliyun.com/?commodityCode=ons_onsproxy_pre">ApsaraMQ for RabbitMQ purchase page</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MaxEipTps")
        public Integer maxEipTps;

        /**
         * <p>The maximum number of queues for the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MaxQueue")
        public Integer maxQueue;

        /**
         * <p>The peak private TPS.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MaxTps")
        public Integer maxTps;

        /**
         * <p>The maximum number of vhosts for the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("MaxVhost")
        public Integer maxVhost;

        /**
         * <p>The timestamp that indicates when the order was created, in milliseconds.</p>
         * <blockquote>
         * <p>The value is a long integer. Handle it with care in certain programming languages to prevent precision loss.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1651507200000</p>
         */
        @NameInMap("OrderCreateTime")
        public Long orderCreateTime;

        /**
         * <p>The billing method.</p>
         * <ul>
         * <li><p>PRE_PAID: subscription</p>
         * </li>
         * <li><p>POST_PAID: pay-as-you-go</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRE_PAID</p>
         */
        @NameInMap("OrderType")
        public String orderType;

        /**
         * <p>The VPC endpoint of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>amqp-cn-st21x7kv****.mq-amqp.cn-hangzhou-a.aliyuncs.com</p>
         */
        @NameInMap("PrivateEndpoint")
        public String privateEndpoint;

        /**
         * <p>The reserved TPS capacity for reserved and elastic instances.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("ProvisionedCapacity")
        public Integer provisionedCapacity;

        /**
         * <p>The public endpoint of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx.cn-hangzhou.xxx.net.mq.amqp.aliyuncs.com</p>
         */
        @NameInMap("PublicEndpoint")
        public String publicEndpoint;

        /**
         * <p>The ID of the resource group for the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm2vn6jkayvfy</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The security group ID used to create a PrivateLink endpoint for the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-xxx</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("ServerlessSwitch")
        public Boolean serverlessSwitch;

        /**
         * <p>The instance status. Valid values:</p>
         * <ul>
         * <li><p>DEPLOYING: The instance is being deployed.</p>
         * </li>
         * <li><p>EXPIRED: The instance has expired.</p>
         * </li>
         * <li><p>SERVING: The instance is in service.</p>
         * </li>
         * <li><p>RELEASED: The instance has been released.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SERVING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The disk capacity. Unit: GB.</p>
         * <blockquote>
         * <p>For Professional and Enterprise Edition instances, this parameter returns <strong>-1</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("StorageSize")
        public Integer storageSize;

        /**
         * <p>Indicates whether the instance supports EIPs.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportEIP")
        public Boolean supportEIP;

        /**
         * <p>Indicates whether the message trace feature is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("SupportTracing")
        public Boolean supportTracing;

        /**
         * <p>The list of tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<GetInstanceResponseBodyDataTags> tags;

        /**
         * <p>The retention period of message traces. Unit: days. Valid values:</p>
         * <ul>
         * <li><p>3: 3 days</p>
         * </li>
         * <li><p>7: 7 days</p>
         * </li>
         * <li><p>15: 15 days</p>
         * </li>
         * </ul>
         * <p>This parameter applies only when <code>SupportTracing</code> is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("TracingStorageTime")
        public Integer tracingStorageTime;

        /**
         * <p>The VPC ID used to create a PrivateLink endpoint for the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-xxx</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The VSwitch IDs used to create a PrivateLink endpoint for the instance.</p>
         */
        @NameInMap("VswitchIds")
        public java.util.List<String> vswitchIds;

        public static GetInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyData self = new GetInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyData setAutoRenewInstance(Boolean autoRenewInstance) {
            this.autoRenewInstance = autoRenewInstance;
            return this;
        }
        public Boolean getAutoRenewInstance() {
            return this.autoRenewInstance;
        }

        public GetInstanceResponseBodyData setClassicEndpoint(String classicEndpoint) {
            this.classicEndpoint = classicEndpoint;
            return this;
        }
        public String getClassicEndpoint() {
            return this.classicEndpoint;
        }

        public GetInstanceResponseBodyData setEdition(String edition) {
            this.edition = edition;
            return this;
        }
        public String getEdition() {
            return this.edition;
        }

        public GetInstanceResponseBodyData setEncryptedInstance(Boolean encryptedInstance) {
            this.encryptedInstance = encryptedInstance;
            return this;
        }
        public Boolean getEncryptedInstance() {
            return this.encryptedInstance;
        }

        public GetInstanceResponseBodyData setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public GetInstanceResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetInstanceResponseBodyData setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public GetInstanceResponseBodyData setKmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public String getKmsKeyId() {
            return this.kmsKeyId;
        }

        public GetInstanceResponseBodyData setListenerMode(String listenerMode) {
            this.listenerMode = listenerMode;
            return this;
        }
        public String getListenerMode() {
            return this.listenerMode;
        }

        public GetInstanceResponseBodyData setMaxConnections(Integer maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        public GetInstanceResponseBodyData setMaxEipTps(Integer maxEipTps) {
            this.maxEipTps = maxEipTps;
            return this;
        }
        public Integer getMaxEipTps() {
            return this.maxEipTps;
        }

        public GetInstanceResponseBodyData setMaxQueue(Integer maxQueue) {
            this.maxQueue = maxQueue;
            return this;
        }
        public Integer getMaxQueue() {
            return this.maxQueue;
        }

        public GetInstanceResponseBodyData setMaxTps(Integer maxTps) {
            this.maxTps = maxTps;
            return this;
        }
        public Integer getMaxTps() {
            return this.maxTps;
        }

        public GetInstanceResponseBodyData setMaxVhost(Integer maxVhost) {
            this.maxVhost = maxVhost;
            return this;
        }
        public Integer getMaxVhost() {
            return this.maxVhost;
        }

        public GetInstanceResponseBodyData setOrderCreateTime(Long orderCreateTime) {
            this.orderCreateTime = orderCreateTime;
            return this;
        }
        public Long getOrderCreateTime() {
            return this.orderCreateTime;
        }

        public GetInstanceResponseBodyData setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public GetInstanceResponseBodyData setPrivateEndpoint(String privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }
        public String getPrivateEndpoint() {
            return this.privateEndpoint;
        }

        public GetInstanceResponseBodyData setProvisionedCapacity(Integer provisionedCapacity) {
            this.provisionedCapacity = provisionedCapacity;
            return this;
        }
        public Integer getProvisionedCapacity() {
            return this.provisionedCapacity;
        }

        public GetInstanceResponseBodyData setPublicEndpoint(String publicEndpoint) {
            this.publicEndpoint = publicEndpoint;
            return this;
        }
        public String getPublicEndpoint() {
            return this.publicEndpoint;
        }

        public GetInstanceResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetInstanceResponseBodyData setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public GetInstanceResponseBodyData setServerlessSwitch(Boolean serverlessSwitch) {
            this.serverlessSwitch = serverlessSwitch;
            return this;
        }
        public Boolean getServerlessSwitch() {
            return this.serverlessSwitch;
        }

        public GetInstanceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetInstanceResponseBodyData setStorageSize(Integer storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public Integer getStorageSize() {
            return this.storageSize;
        }

        public GetInstanceResponseBodyData setSupportEIP(Boolean supportEIP) {
            this.supportEIP = supportEIP;
            return this;
        }
        public Boolean getSupportEIP() {
            return this.supportEIP;
        }

        public GetInstanceResponseBodyData setSupportTracing(Boolean supportTracing) {
            this.supportTracing = supportTracing;
            return this;
        }
        public Boolean getSupportTracing() {
            return this.supportTracing;
        }

        public GetInstanceResponseBodyData setTags(java.util.List<GetInstanceResponseBodyDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetInstanceResponseBodyDataTags> getTags() {
            return this.tags;
        }

        public GetInstanceResponseBodyData setTracingStorageTime(Integer tracingStorageTime) {
            this.tracingStorageTime = tracingStorageTime;
            return this;
        }
        public Integer getTracingStorageTime() {
            return this.tracingStorageTime;
        }

        public GetInstanceResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public GetInstanceResponseBodyData setVswitchIds(java.util.List<String> vswitchIds) {
            this.vswitchIds = vswitchIds;
            return this;
        }
        public java.util.List<String> getVswitchIds() {
            return this.vswitchIds;
        }

    }

}
