// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeInstanceRequest extends TeaModel {
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
     * <p>*   **mitigating**: queries assets for which traffic scrubbing is triggered.</p>
     * <p>*   **blackholed**: queries assets for which blackhole filtering is triggered.</p>
     * <p>*   **normal**: queries assets that are not under DDoS attacks.</p>
     */
    @NameInMap("DdosStatus")
    public String ddosStatus;

    /**
     * <p>The ID of the asset. The formats of asset IDs vary based on the value of the **InstanceType**. parameter.</p>
     * <br>
     * <p>*   If you set **InstanceType** to **ecs**, specify the ID of the ECS instance. For example, you can specify i-bp1cb6x80tfgocid\\*\\*\\*\\*.</p>
     * <p>*   If you set **InstanceType** to **slb**, specify the ID of the SLB instance. For example, you can specify alb-vn2dqg3v31y2vd\\*\\*\\*\\*.</p>
     * <p>*   If you set **InstanceType** to **eip**, specify the ID of the EIP. For example, you can specify eip-j6ce6dcx9epi7rs46\\*\\*\\*\\*.</p>
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

    public static DescribeInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceRequest self = new DescribeInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeInstanceRequest setDdosRegionId(String ddosRegionId) {
        this.ddosRegionId = ddosRegionId;
        return this;
    }
    public String getDdosRegionId() {
        return this.ddosRegionId;
    }

    public DescribeInstanceRequest setDdosStatus(String ddosStatus) {
        this.ddosStatus = ddosStatus;
        return this;
    }
    public String getDdosStatus() {
        return this.ddosStatus;
    }

    public DescribeInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceRequest setInstanceIp(String instanceIp) {
        this.instanceIp = instanceIp;
        return this;
    }
    public String getInstanceIp() {
        return this.instanceIp;
    }

    public DescribeInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeInstanceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeInstanceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
