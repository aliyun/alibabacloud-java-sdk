// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeInstancesShrinkRequest extends TeaModel {
    /**
     * <p>The list of EIP addresses used to filter instances.</p>
     */
    @NameInMap("EipAddresses")
    public String eipAddressesShrink;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-cmcc</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The list of edge zone IDs. This parameter is a formatted JSON array that contains up to 100 IDs separated by commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;cn-suzhou-telecom&quot;,&quot;cn-chengdu-telecom&quot;]</p>
     */
    @NameInMap("EnsRegionIds")
    public String ensRegionIds;

    /**
     * <p>The Edge Node Service ID. You can use this ID to query the instances created under the edge service.</p>
     * 
     * <strong>example:</strong>
     * <p>ens-20190730202316s****</p>
     */
    @NameInMap("EnsServiceId")
    public String ensServiceId;

    /**
     * <p>The image ID.</p>
     * 
     * <strong>example:</strong>
     * <p>centos_6_08_64_20G_alibase_****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i-5iqczfxps7csjrxeca****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The list of instance IDs. This parameter is a formatted JSON array that contains up to 100 IDs separated by commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;i-5iqczfxps7csjrxeca07****&quot;, &quot;i-5iqczfxps7csjrxeca07****&quot;]</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>TestName</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The filter type. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>EnsService</p>
     */
    @NameInMap("InstanceResourceType")
    public String instanceResourceType;

    /**
     * <p>The instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>ens.se1.tiny</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The internal IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>47.100.XX.XX</p>
     */
    @NameInMap("IntranetIp")
    public String intranetIp;

    /**
     * <p>The network ID.</p>
     * 
     * <strong>example:</strong>
     * <p>n-2zeuphj08tt7q3brd****</p>
     */
    @NameInMap("NetworkId")
    public String networkId;

    /**
     * <p>The sorting parameter in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;InstanceNameSort&quot;: &quot;asc&quot;,
     *     &quot;ExpireTimeSort&quot;: &quot;asc&quot;,
     *     &quot;CreationTimeSort&quot;: &quot;desc&quot;,
     *     &quot;EnsRegionId&quot;: &quot;desc&quot;
     * }</p>
     */
    @NameInMap("OrderByParams")
    public String orderByParams;

    /**
     * <p>The page number of the instance status list. The value starts from <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page for a paged query. Maximum value: <strong>100</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The search keyword. Supports parameters such as <strong>ip</strong>, <strong>InstanceName</strong>, and <strong>InstanceId</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>Joshua</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The security group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-5kyicq2kfcapxrdds6tar7jqb</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The business status of the instance, which does not represent the actual running status of the instance.</p>
     */
    @NameInMap("ServiceStatus")
    public String serviceStatusShrink;

    /**
     * <p>The instance status. Valid values:</p>
     * <ul>
     * <li>Running: Running.</li>
     * <li>Stopped: Stopped.</li>
     * <li>Expired: Expired.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The resource tags. This operation does not return tag information. Use this parameter in combination with the APIs in the tag category.</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    /**
     * <p>The vSwitch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-2zeh0r1pabwtg6wcs****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The VPD network ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vpd-5s7xxxxxxx</p>
     */
    @NameInMap("VpdId")
    public String vpdId;

    /**
     * <p>The VPD vSwitch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-5s7xxxxxxx</p>
     */
    @NameInMap("VpdVSwitchId")
    public String vpdVSwitchId;

    public static DescribeInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesShrinkRequest self = new DescribeInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesShrinkRequest setEipAddressesShrink(String eipAddressesShrink) {
        this.eipAddressesShrink = eipAddressesShrink;
        return this;
    }
    public String getEipAddressesShrink() {
        return this.eipAddressesShrink;
    }

    public DescribeInstancesShrinkRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public DescribeInstancesShrinkRequest setEnsRegionIds(String ensRegionIds) {
        this.ensRegionIds = ensRegionIds;
        return this;
    }
    public String getEnsRegionIds() {
        return this.ensRegionIds;
    }

    public DescribeInstancesShrinkRequest setEnsServiceId(String ensServiceId) {
        this.ensServiceId = ensServiceId;
        return this;
    }
    public String getEnsServiceId() {
        return this.ensServiceId;
    }

    public DescribeInstancesShrinkRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribeInstancesShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstancesShrinkRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeInstancesShrinkRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeInstancesShrinkRequest setInstanceResourceType(String instanceResourceType) {
        this.instanceResourceType = instanceResourceType;
        return this;
    }
    public String getInstanceResourceType() {
        return this.instanceResourceType;
    }

    public DescribeInstancesShrinkRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeInstancesShrinkRequest setIntranetIp(String intranetIp) {
        this.intranetIp = intranetIp;
        return this;
    }
    public String getIntranetIp() {
        return this.intranetIp;
    }

    public DescribeInstancesShrinkRequest setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }
    public String getNetworkId() {
        return this.networkId;
    }

    public DescribeInstancesShrinkRequest setOrderByParams(String orderByParams) {
        this.orderByParams = orderByParams;
        return this;
    }
    public String getOrderByParams() {
        return this.orderByParams;
    }

    public DescribeInstancesShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstancesShrinkRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeInstancesShrinkRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public DescribeInstancesShrinkRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public DescribeInstancesShrinkRequest setServiceStatusShrink(String serviceStatusShrink) {
        this.serviceStatusShrink = serviceStatusShrink;
        return this;
    }
    public String getServiceStatusShrink() {
        return this.serviceStatusShrink;
    }

    public DescribeInstancesShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeInstancesShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public DescribeInstancesShrinkRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeInstancesShrinkRequest setVpdId(String vpdId) {
        this.vpdId = vpdId;
        return this;
    }
    public String getVpdId() {
        return this.vpdId;
    }

    public DescribeInstancesShrinkRequest setVpdVSwitchId(String vpdVSwitchId) {
        this.vpdVSwitchId = vpdVSwitchId;
        return this;
    }
    public String getVpdVSwitchId() {
        return this.vpdVSwitchId;
    }

}
