// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ListInstancesResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CCBB1225-C392-480E-8C7F-D09AB2CD2***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesResponseBody self = new ListInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancesResponseBody setData(ListInstancesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListInstancesResponseBodyData getData() {
        return this.data;
    }

    public ListInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListInstancesResponseBodyDataInstancesTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>region</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>hangzhou</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListInstancesResponseBodyDataInstancesTags build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyDataInstancesTags self = new ListInstancesResponseBodyDataInstancesTags();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyDataInstancesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListInstancesResponseBodyDataInstancesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListInstancesResponseBodyDataInstances extends TeaModel {
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
         * <p>The deployment architecture, which is applicable only to Serverless Edition instances. Valid values:</p>
         * <ul>
         * <li><p>shared: A shared architecture, used for reserved, elastic (shared), and pay-as-you-go instances.</p>
         * </li>
         * <li><p>dedicated: A dedicated architecture, used for reserved and elastic (dedicated) instances.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>shared</p>
         */
        @NameInMap("Edition")
        public String edition;

        /**
         * <p>Indicates whether storage encryption is enabled for the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EncryptedInstance")
        public Boolean encryptedInstance;

        /**
         * <p>The expiration timestamp of the instance, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1651507200000</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>amqp-cn-st21x7kv****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>amqp-cn-st21x7kv****</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The instance type. Valid values:</p>
         * <ul>
         * <li><p>professional: Professional Edition</p>
         * </li>
         * <li><p>enterprise: Enterprise Edition</p>
         * </li>
         * <li><p>vip: Platinum Edition</p>
         * </li>
         * </ul>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li>serverless: Serverless Edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>professional</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The ID of the KMS key used for data disk encryption.</p>
         * 
         * <strong>example:</strong>
         * <p>key-bjj66c2a893vmhawtq5fd</p>
         */
        @NameInMap("KmsKeyId")
        public String kmsKeyId;

        /**
         * <p>The port listener mode of the instance. <code>tcp_and_ssl</code> enables both port <code>5672</code> and port <code>5671</code>, while <code>ssl_only</code> enables only port <code>5671</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>tcp_and_ssl</p>
         */
        @NameInMap("ListenerMode")
        public String listenerMode;

        /**
         * <p>The peak transactions per second (TPS) of the instance over the public network.</p>
         * 
         * <strong>example:</strong>
         * <p>24832</p>
         */
        @NameInMap("MaxEipTps")
        public Integer maxEipTps;

        /**
         * <p>The maximum number of queues for the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("MaxQueue")
        public Integer maxQueue;

        /**
         * <p>The peak transactions per second (TPS) of the instance over the private network.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
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
         * <p>The creation timestamp of the order, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1572441939000</p>
         */
        @NameInMap("OrderCreateTime")
        public Long orderCreateTime;

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li><p>PRE_PAID: The instance uses the subscription billing method.</p>
         * </li>
         * <li><p>POST_PAID: The instance uses the pay-as-you-go billing method.</p>
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
         * <p>amqp-cn-st21x7kv****.mq-amqp.cn-hangzhou-a.aliyuncs.com</p>
         */
        @NameInMap("PublicEndpoint")
        public String publicEndpoint;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek3axfj2w4czrq</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the security group to which the instance belongs. This security group is used for PrivateLink endpoint creation.</p>
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
         * <li><p>SERVING: The instance is running.</p>
         * </li>
         * <li><p>RELEASED: The instance is released.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SERVING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The storage capacity of the disk. Unit: GB.</p>
         * <blockquote>
         * <p>This parameter returns a value of <strong>-1</strong> for Professional Edition and Enterprise Edition instances, to which it does not apply.</p>
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
         * <p>The tags attached to the instance.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListInstancesResponseBodyDataInstancesTags> tags;

        /**
         * <p>The ID of the VPC in which the instance resides. This VPC is used for PrivateLink endpoint creation.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-xxx</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The IDs of the VSwitches to which the instance is connected. These VSwitches are used for PrivateLink endpoint creation.</p>
         */
        @NameInMap("VswitchIds")
        public java.util.List<String> vswitchIds;

        public static ListInstancesResponseBodyDataInstances build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyDataInstances self = new ListInstancesResponseBodyDataInstances();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyDataInstances setAutoRenewInstance(Boolean autoRenewInstance) {
            this.autoRenewInstance = autoRenewInstance;
            return this;
        }
        public Boolean getAutoRenewInstance() {
            return this.autoRenewInstance;
        }

        public ListInstancesResponseBodyDataInstances setClassicEndpoint(String classicEndpoint) {
            this.classicEndpoint = classicEndpoint;
            return this;
        }
        public String getClassicEndpoint() {
            return this.classicEndpoint;
        }

        public ListInstancesResponseBodyDataInstances setEdition(String edition) {
            this.edition = edition;
            return this;
        }
        public String getEdition() {
            return this.edition;
        }

        public ListInstancesResponseBodyDataInstances setEncryptedInstance(Boolean encryptedInstance) {
            this.encryptedInstance = encryptedInstance;
            return this;
        }
        public Boolean getEncryptedInstance() {
            return this.encryptedInstance;
        }

        public ListInstancesResponseBodyDataInstances setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public ListInstancesResponseBodyDataInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesResponseBodyDataInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListInstancesResponseBodyDataInstances setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListInstancesResponseBodyDataInstances setKmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public String getKmsKeyId() {
            return this.kmsKeyId;
        }

        public ListInstancesResponseBodyDataInstances setListenerMode(String listenerMode) {
            this.listenerMode = listenerMode;
            return this;
        }
        public String getListenerMode() {
            return this.listenerMode;
        }

        public ListInstancesResponseBodyDataInstances setMaxEipTps(Integer maxEipTps) {
            this.maxEipTps = maxEipTps;
            return this;
        }
        public Integer getMaxEipTps() {
            return this.maxEipTps;
        }

        public ListInstancesResponseBodyDataInstances setMaxQueue(Integer maxQueue) {
            this.maxQueue = maxQueue;
            return this;
        }
        public Integer getMaxQueue() {
            return this.maxQueue;
        }

        public ListInstancesResponseBodyDataInstances setMaxTps(Integer maxTps) {
            this.maxTps = maxTps;
            return this;
        }
        public Integer getMaxTps() {
            return this.maxTps;
        }

        public ListInstancesResponseBodyDataInstances setMaxVhost(Integer maxVhost) {
            this.maxVhost = maxVhost;
            return this;
        }
        public Integer getMaxVhost() {
            return this.maxVhost;
        }

        public ListInstancesResponseBodyDataInstances setOrderCreateTime(Long orderCreateTime) {
            this.orderCreateTime = orderCreateTime;
            return this;
        }
        public Long getOrderCreateTime() {
            return this.orderCreateTime;
        }

        public ListInstancesResponseBodyDataInstances setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public ListInstancesResponseBodyDataInstances setPrivateEndpoint(String privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }
        public String getPrivateEndpoint() {
            return this.privateEndpoint;
        }

        public ListInstancesResponseBodyDataInstances setProvisionedCapacity(Integer provisionedCapacity) {
            this.provisionedCapacity = provisionedCapacity;
            return this;
        }
        public Integer getProvisionedCapacity() {
            return this.provisionedCapacity;
        }

        public ListInstancesResponseBodyDataInstances setPublicEndpoint(String publicEndpoint) {
            this.publicEndpoint = publicEndpoint;
            return this;
        }
        public String getPublicEndpoint() {
            return this.publicEndpoint;
        }

        public ListInstancesResponseBodyDataInstances setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListInstancesResponseBodyDataInstances setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListInstancesResponseBodyDataInstances setServerlessSwitch(Boolean serverlessSwitch) {
            this.serverlessSwitch = serverlessSwitch;
            return this;
        }
        public Boolean getServerlessSwitch() {
            return this.serverlessSwitch;
        }

        public ListInstancesResponseBodyDataInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListInstancesResponseBodyDataInstances setStorageSize(Integer storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public Integer getStorageSize() {
            return this.storageSize;
        }

        public ListInstancesResponseBodyDataInstances setSupportEIP(Boolean supportEIP) {
            this.supportEIP = supportEIP;
            return this;
        }
        public Boolean getSupportEIP() {
            return this.supportEIP;
        }

        public ListInstancesResponseBodyDataInstances setTags(java.util.List<ListInstancesResponseBodyDataInstancesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListInstancesResponseBodyDataInstancesTags> getTags() {
            return this.tags;
        }

        public ListInstancesResponseBodyDataInstances setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListInstancesResponseBodyDataInstances setVswitchIds(java.util.List<String> vswitchIds) {
            this.vswitchIds = vswitchIds;
            return this;
        }
        public java.util.List<String> getVswitchIds() {
            return this.vswitchIds;
        }

    }

    public static class ListInstancesResponseBodyData extends TeaModel {
        /**
         * <p>A list of instances.</p>
         */
        @NameInMap("Instances")
        public java.util.List<ListInstancesResponseBodyDataInstances> instances;

        /**
         * <p>The maximum number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The token for the next page of results. If this field is empty, it means all results have been returned.</p>
         * 
         * <strong>example:</strong>
         * <p>caebacccb2be03f84eb48b699f0a****</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        public static ListInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyData self = new ListInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyData setInstances(java.util.List<ListInstancesResponseBodyDataInstances> instances) {
            this.instances = instances;
            return this;
        }
        public java.util.List<ListInstancesResponseBodyDataInstances> getInstances() {
            return this.instances;
        }

        public ListInstancesResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListInstancesResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

}
