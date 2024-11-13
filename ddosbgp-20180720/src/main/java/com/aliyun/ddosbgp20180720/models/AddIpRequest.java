// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class AddIpRequest extends TeaModel {
    /**
     * <p>The ID of the Anti-DDoS Origin instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/118698.html">DescribeInstanceList</a> operation to query the IDs of all Anti-DDoS Origin instances.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddosbgp-cn-npk1z7t9****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The IP addresses that you want to add to the Anti-DDoS Origin instance. This parameter is a string that consists of JSON arrays. Each element in a JSON array is a JSON struct that includes the following field:</p>
     * <ul>
     * <li><p><strong>ip</strong>: required. The IP address that you want to add. Data type: string.</p>
     * <p>**</p>
     * <p><strong>Note</strong> The IP address must be the IP address of an asset that belongs to the current Alibaba Cloud account.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;ip&quot;:&quot;1.XX.XX.1&quot;},{&quot;ip&quot;:&quot;2.XX.XX.2&quot;}]</p>
     */
    @NameInMap("IpList")
    public String ipList;

    /**
     * <p>The ID of the region where the Anti-DDoS Origin instance resides.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/118703.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the Anti-DDoS Origin instance belongs in Resource Management. This parameter is empty by default, which indicates that the Anti-DDoS Origin instance belongs to the default resource group.</p>
     * <p>For information about resource groups, see <a href="https://help.aliyun.com/document_detail/94485.html">Create a resource group</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm2pz25js****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static AddIpRequest build(java.util.Map<String, ?> map) throws Exception {
        AddIpRequest self = new AddIpRequest();
        return TeaModel.build(map, self);
    }

    public AddIpRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddIpRequest setIpList(String ipList) {
        this.ipList = ipList;
        return this;
    }
    public String getIpList() {
        return this.ipList;
    }

    public AddIpRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddIpRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
