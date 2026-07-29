// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class AddIpRequest extends TeaModel {
    /**
     * <p>The ID of the Anti-DDoS Origin instance to manage.</p>
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
     * <p>The list of IP addresses to add to the Anti-DDoS Origin instance for protection. The value is a string that is converted from a JSON array. Each element in the JSON array is a struct that contains the following fields:</p>
     * <ul>
     * <li><p><strong>ip</strong>: The IP address to add. This parameter is of the String type and is required.</p>
     * </li>
     * <li><p><strong>member_uid</strong>: The ID of the member account that owns the asset. This parameter is of the String type and is optional. Specify this parameter only when you add an asset that belongs to a member account. For example: [{&quot;ip&quot;:&quot;121.41.XX.XX&quot;,&quot;member_uid&quot;:&quot;120100811162\<em>\</em>\<em>\</em>&quot;}]</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;ip&quot;:&quot;121.41.XX.XX&quot;},{&quot;ip&quot;:&quot;121.42.XX.XX&quot;}]</p>
     */
    @NameInMap("IpList")
    public String ipList;

    /**
     * <p>The region ID of the Anti-DDoS Origin instance.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/118703.html">DescribeRegions</a> to query information about all regions that Anti-DDoS Origin supports.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group in Resource Management to which the Anti-DDoS Origin instance belongs. If you leave this parameter empty, the instance is added to the default resource group.</p>
     * <p>For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/94485.html">Create a resource group</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm2pz25js****</p>
     */
    @NameInMap("ResourceGroupId")
    @Deprecated
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

    @Deprecated
    public AddIpRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
