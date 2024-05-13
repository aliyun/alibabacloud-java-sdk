// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeInstanceIpAddressRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The region ID of the asset.</p>
     * <br>
     * <p>> You can call the [DescribeRegions](https://help.aliyun.com/document_detail/353250.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DdosRegionId")
    public String ddosRegionId;

    /**
     * <p>The DDoS mitigation status of the asset. Valid values:</p>
     * <br>
     * <p>*   **defense**: queries assets for which traffic scrubbing is performed.</p>
     * <p>*   **blackhole**: queries assets for which blackhole filtering is triggered.</p>
     */
    @NameInMap("DdosStatus")
    public String ddosStatus;

    /**
     * <p>The ID of the instance to which the asset is added.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The IP address of the asset.</p>
     */
    @NameInMap("InstanceIp")
    public String instanceIp;

    /**
     * <p>The name of the asset.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The type of the asset. Valid values:</p>
     * <br>
     * <p>*   **ecs**: ECS instance</p>
     * <p>*   **slb**: SLB instance</p>
     * <p>*   **eip**: EIP</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The number of entries to return on each page. Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeInstanceIpAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceIpAddressRequest self = new DescribeInstanceIpAddressRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceIpAddressRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeInstanceIpAddressRequest setDdosRegionId(String ddosRegionId) {
        this.ddosRegionId = ddosRegionId;
        return this;
    }
    public String getDdosRegionId() {
        return this.ddosRegionId;
    }

    public DescribeInstanceIpAddressRequest setDdosStatus(String ddosStatus) {
        this.ddosStatus = ddosStatus;
        return this;
    }
    public String getDdosStatus() {
        return this.ddosStatus;
    }

    public DescribeInstanceIpAddressRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceIpAddressRequest setInstanceIp(String instanceIp) {
        this.instanceIp = instanceIp;
        return this;
    }
    public String getInstanceIp() {
        return this.instanceIp;
    }

    public DescribeInstanceIpAddressRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeInstanceIpAddressRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeInstanceIpAddressRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
