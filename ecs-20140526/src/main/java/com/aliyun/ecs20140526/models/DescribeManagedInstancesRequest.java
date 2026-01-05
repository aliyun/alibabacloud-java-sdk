// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeManagedInstancesRequest extends TeaModel {
    /**
     * <p>The ID of the activation code.</p>
     * 
     * <strong>example:</strong>
     * <p>4ECEEE12-56F1-4FBC-9AB1-890F7494****</p>
     */
    @NameInMap("ActivationId")
    public String activationId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Connected")
    public String connected;

    /**
     * <p>The ID of managed instance N. Valid values of N: 1 to 50.</p>
     * 
     * <strong>example:</strong>
     * <p>mi-hz018jrc1o0****</p>
     */
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    /**
     * <p>The internal or public IP address of the managed instance.</p>
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
     * <p>The value of the MachineId parameter that you specify when you register a managed instance. A maximum of 36 characters are allowed. Sample registration script:</p>
     * <pre><code>aliyun-service --register \\
     *   --RegionId=cn-hangznou \\
     *   --ActivationId=xxxxxxxxxxx \\
     *   --ActivationCode=xxxxxxxxx \\
     * --MachineId=xxxxxx \\ # Optional. The unique identifier of the machine.
     *   --ForceResue                 
     * </code></pre>
     * <ul>
     * <li>If the MachineId and ForceResult parameters are specified during registration, the Cloud Assistant generates a fixed managed instance ID for this MachineId.</li>
     * <li>If the MachineId parameter is not explicitly specified, the Cloud Assistant will automatically generate a MachineId value based on the hardware information of the machine.</li>
     * <li>We recommend that you explicitly specify the MachineId and ForceResult parameters to mark the mapping between a managed instance and an on-premises machine.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GOG4X8312A0188</p>
     */
    @NameInMap("MachineId")
    public String machineId;

    /**
     * <p>The maximum number of entries per page.</p>
     * <p>Valid values: 1 to 50.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
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
     * <p> This parameter will be removed in the future. We recommend that you use NextToken and MaxResults for a paged query.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <blockquote>
     * <p> This parameter will be removed in the future. We recommend that you use NextToken and MaxResults for a paged query.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The region ID. Supported regions: China (Qingdao), China (Beijing), China (Zhangjiakou), China (Hohhot), China (Ulanqab), China (Hangzhou), China (Shanghai), China (Shenzhen), China (Heyuan), China (Guangzhou), China (Chengdu), China (Hong Kong), Singapore, Japan (Tokyo), US (Silicon Valley), and US (Virginia).</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
     * <p>The tags of the managed instance.</p>
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
         * <p>The key of tag N of the managed instance. Valid values of N: 1 to 20. The tag key cannot be an empty string.</p>
         * <p>If a single tag is specified to query resources, up to 1,000 resources that have this tag added can be displayed in the response. If multiple tags are specified to query resources, up to 1,000 resources that have all these tags added can be displayed in the response. To query more than 1,000 resources that have specified tags added, call the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation.</p>
         * <p>The tag key can be up to 64 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N of the managed instance. Valid values of N: 1 to 20. The tag value can be an empty string.</p>
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
