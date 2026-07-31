// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeManagedInstancesRequest extends TeaModel {
    /**
     * <p>The activation code ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4ECEEE12-56F1-4FBC-9AB1-890F7494****</p>
     */
    @NameInMap("ActivationId")
    public String activationId;

    /**
     * <p>Specifies whether the managed instance is connected.</p>
     * <p>true: The managed instance is connected. You can manage the managed instance by using Cloud Assistant.</p>
     * <p>false: The managed instance is not connected. The server may be shut down or Cloud Assistant Agent may not be properly installed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Connected")
    public String connected;

    /**
     * <p>The ID of the managed instance. Valid values of N: 1 to 50.</p>
     * 
     * <strong>example:</strong>
     * <p>mi-hz018jrc1o0****</p>
     */
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    /**
     * <p>The internal IP address or public IP address of the managed instance.</p>
     * 
     * <strong>example:</strong>
     * <p><code>192.168.**.**</code></p>
     */
    @NameInMap("InstanceIp")
    public String instanceIp;

    /**
     * <p>The name of the managed instance.</p>
     * 
     * <strong>example:</strong>
     * <p>my-webapp-server</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The value of the MachineId parameter specified when registering the managed instance. A maximum of 36 characters are allowed.
     * Example registration script:</p>
     * <pre><code>aliyun-service --register \\
     *   --RegionId=ap-southeast-1 \\
     *   --ActivationId=xxxxxxxxxxx \\
     *   --ActivationCode=xxxxxxxxx \\
     *   --MachineId=xxxxxx \\ # Optional parameter that specifies the unique identifier of the machine
     *   --ForceResue                 
     * </code></pre>
     * <ul>
     * <li>If MachineId and ForceResult are specified during registration, Cloud Assistant generates a fixed managed instance ID for this MachineId.</li>
     * <li>If MachineId is not explicitly specified, Cloud Assistant automatically generates a MachineId value based on the hardware information of the machine.</li>
     * <li>Recommendation: Explicitly specify MachineId and ForceResult to mark the mapping between managed instances and on-premises machines.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GOG4X8312A0188</p>
     */
    @NameInMap("MachineId")
    public String machineId;

    /**
     * <p>The maximum number of entries per page for a paging query.</p>
     * <p>Maximum value: 50.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Set this parameter to the NextToken value returned in the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The operating system type of the managed instance. Valid values:</p>
     * <ul>
     * <li>windows</li>
     * <li>linux</li>
     * <li>FreeBSD</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>windows</p>
     */
    @NameInMap("OsType")
    public String osType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <blockquote>
     * <p>This parameter is about to be deprecated. Use NextToken and MaxResults to complete paging query operations.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <blockquote>
     * <p>This parameter is about to be deprecated. Use NextToken and MaxResults to complete paging query operations.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The region ID. Currently supported regions: China (Qingdao), China (Beijing), China (Zhangjiakou), China (Hohhot), China (Ulanqab), China (Hangzhou), China (Shanghai), China (Shenzhen), China (Heyuan), China (Guangzhou), China (Chengdu), Hong Kong (China), Singapore, Japan (Tokyo), US (Silicon Valley), and US (Virginia).</p>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query region IDs and other information.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the managed instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-123******</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeManagedInstancesRequestTag> tag;

    public static DescribeManagedInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeManagedInstancesRequest self = new DescribeManagedInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeManagedInstancesRequest setActivationId(String activationId) {
        this.activationId = activationId;
        return this;
    }
    public String getActivationId() {
        return this.activationId;
    }

    public DescribeManagedInstancesRequest setConnected(String connected) {
        this.connected = connected;
        return this;
    }
    public String getConnected() {
        return this.connected;
    }

    public DescribeManagedInstancesRequest setInstanceId(java.util.List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public java.util.List<String> getInstanceId() {
        return this.instanceId;
    }

    public DescribeManagedInstancesRequest setInstanceIp(String instanceIp) {
        this.instanceIp = instanceIp;
        return this;
    }
    public String getInstanceIp() {
        return this.instanceIp;
    }

    public DescribeManagedInstancesRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeManagedInstancesRequest setMachineId(String machineId) {
        this.machineId = machineId;
        return this;
    }
    public String getMachineId() {
        return this.machineId;
    }

    public DescribeManagedInstancesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeManagedInstancesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeManagedInstancesRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public DescribeManagedInstancesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeManagedInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeManagedInstancesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeManagedInstancesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeManagedInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeManagedInstancesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeManagedInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeManagedInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeManagedInstancesRequest setTag(java.util.List<DescribeManagedInstancesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeManagedInstancesRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeManagedInstancesRequestTag extends TeaModel {
        /**
         * <p>The tag key of the managed instance. Valid values of N: 1 to 20. The tag key cannot be an empty string.</p>
         * <p>If you use a single tag to filter resources, the resource count with this tag cannot exceed 1,000. If you use multiple tags to filter resources, the resource count of resources that have all specified tags attached cannot exceed 1,000. If the resource count exceeds 1,000, call the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation to query resources.</p>
         * <p>The tag key can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the managed instance. Valid values of N: 1 to 20. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeManagedInstancesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeManagedInstancesRequestTag self = new DescribeManagedInstancesRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeManagedInstancesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeManagedInstancesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
