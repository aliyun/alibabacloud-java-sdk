// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class TransferInstanceClassRequest extends TeaModel {
    /**
     * <p>The ID of the data migration or data synchronization task. You can call the [DescribeDtsJobs](https://help.aliyun.com/document_detail/209702.html) operation to query the task ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The new instance class of the DTS instance. You can call the [DescribeDtsJobDetail](https://help.aliyun.com/document_detail/208925.html) operation to query the original instance class of the DTS instance.</p>
     * <br>
     * <p>*   DTS supports the following instance classes for a data migration instance: **xxlarge**, **xlarge**, **large**, **medium**, and **small**.</p>
     * <p>*   DTS supports the following instance classes for a data synchronization instance: **large**, **medium**, **small**, and **micro**.</p>
     * <br>
     * <p>>  For more information about the test performance of each instance class, see [Specifications of data migration instances](https://help.aliyun.com/document_detail/26606.html) and [Specifications of data synchronization instances](https://help.aliyun.com/document_detail/26605.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    /**
     * <p>Specifies whether to upgrade or downgrade the DTS instance. Valid values:</p>
     * <br>
     * <p>*   **UPGRADE**</p>
     * <p>*   **DOWNGRADE**</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The ID of the region where the DTS instance resides. For more information, see [List of supported regions](https://help.aliyun.com/document_detail/141033.html).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static TransferInstanceClassRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferInstanceClassRequest self = new TransferInstanceClassRequest();
        return TeaModel.build(map, self);
    }

    public TransferInstanceClassRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public TransferInstanceClassRequest setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }
    public String getInstanceClass() {
        return this.instanceClass;
    }

    public TransferInstanceClassRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public TransferInstanceClassRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public TransferInstanceClassRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
