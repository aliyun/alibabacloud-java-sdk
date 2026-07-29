// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DeleteIpRequest extends TeaModel {
    /**
     * <p>The ID of the Anti-DDoS Origin instance.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/118698.html">DescribeInstanceList</a> to query the IDs of all Anti-DDoS Origin instances.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddosbgp-cn-npk1z7t9****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>A list of IP addresses to remove from the protected objects of the Anti-DDoS Origin instance. Specify the list as a string that is a JSON array. Each element in the array is a struct that contains the following field:</p>
     * <ul>
     * <li><p><strong>ip</strong>: The IP address to remove. This parameter is a string and is required.</p>
     * <blockquote>
     * <p>The IP address must be in the protection list of the Anti-DDoS Origin instance.</p>
     * </blockquote>
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
     * <p>The region ID of the Anti-DDoS Origin instance.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/118703.html">DescribeRegions</a> to query all regions that Anti-DDoS Origin supports.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the Anti-DDoS Origin instance belongs in Resource Management. If you leave this parameter empty, the instance belongs to the default resource group.</p>
     * <p>For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/94485.html">Create a resource group</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm2pz25js****</p>
     */
    @NameInMap("ResourceGroupId")
    @Deprecated
    public String resourceGroupId;

    public static DeleteIpRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpRequest self = new DeleteIpRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIpRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteIpRequest setIpList(String ipList) {
        this.ipList = ipList;
        return this;
    }
    public String getIpList() {
        return this.ipList;
    }

    public DeleteIpRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    @Deprecated
    public DeleteIpRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
