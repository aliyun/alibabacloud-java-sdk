// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class UpgradeTwoWayRequest extends TeaModel {
    /**
     * <p>The instance class of the two-way synchronization task. Valid values: **large**, **medium**, **micro**, and **small**.</p>
     * <br>
     * <p>>  For more information, see [Specifications of data synchronization instances](https://help.aliyun.com/document_detail/26605.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    /**
     * <p>The ID of the data synchronization instance. You can call the [DescribeDtsJobs](https://help.aliyun.com/document_detail/209702.html) operation to query the instance ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the DTS instance. For more information, see [List of supported regions](https://help.aliyun.com/document_detail/141033.html).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static UpgradeTwoWayRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeTwoWayRequest self = new UpgradeTwoWayRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeTwoWayRequest setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }
    public String getInstanceClass() {
        return this.instanceClass;
    }

    public UpgradeTwoWayRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpgradeTwoWayRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpgradeTwoWayRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
