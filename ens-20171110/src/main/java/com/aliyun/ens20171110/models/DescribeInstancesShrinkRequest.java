// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeInstancesShrinkRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The IDs of the regions. The value is a JSON array that consists of up to 100 IDs. Separate multiple IDs with commas (,).</p>
     */
    @NameInMap("EnsRegionIds")
    public String ensRegionIds;

    /**
     * <p>The ID of the edge service. You can use the ID to query information about the instances that are created in the edge service.</p>
     */
    @NameInMap("EnsServiceId")
    public String ensServiceId;

    /**
     * <p>The ID of the image.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The IDs of the instances. The value is a JSON array that consists of up to 100 IDs. Separate IDs with commas (,).</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The name of the instance.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The condition that you want to use to filter instances by category. Valid values:</p>
     * <br>
     * <p>*   EnsInstance: ENS instances that you purchase.</p>
     * <p>*   EnsService: ENS instances that belong to edge services.</p>
     * <p>*   BuildMachine: ENS instances that are configured with image builders.</p>
     * <p>*   EnsPostPaidInstance: Pay-as-you-go ENS instances that you purchase.</p>
     */
    @NameInMap("InstanceResourceType")
    public String instanceResourceType;

    /**
     * <p>The internal IP address of the instance.</p>
     */
    @NameInMap("IntranetIp")
    public String intranetIp;

    /**
     * <p>The ID of the network.</p>
     */
    @NameInMap("NetworkId")
    public String networkId;

    /**
     * <p>The method that you want to use to sort instances. The value of this parameter is in the JSON format.</p>
     * <br>
     * <p>You can sort instances by name, expiration time, node ID, or creation time. You can specify one or more methods.</p>
     */
    @NameInMap("OrderByParams")
    public String orderByParams;

    /**
     * <p>The number of the page to return. Pages start from page **1**.</p>
     * <br>
     * <p>Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. The maximum value is **100**.</p>
     * <br>
     * <p>Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The keyword that you use to query the logs of the service. You can specify the values of parameters such as **ip**, **InstanceName**, and **InstanceId** as the keyword.</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The ID of the security group.</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The status of the instance. Valid values:</p>
     * <br>
     * <p>*   Running</p>
     * <p>*   Stopped</p>
     * <p>*   Expired</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("Tags")
    public String tagsShrink;

    /**
     * <p>The ID of the vSwitch.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static DescribeInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesShrinkRequest self = new DescribeInstancesShrinkRequest();
        return TeaModel.build(map, self);
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

}
