// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeDisksRequest extends TeaModel {
    /**
     * <p>The category of the disk.</p>
     * <br>
     * <p>*   cloud_efficiency: ultra disk.</p>
     * <p>*   cloud_ssd: all-flash disk.</p>
     * <p>*   local_hdd: local HDD.</p>
     * <p>*   local_ssd: local SSD.</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The billing method.</p>
     * <br>
     * <p>*   prePay: subscription.</p>
     * <p>*   postpay: pay-as-you-go.</p>
     */
    @NameInMap("DiskChargeType")
    public String diskChargeType;

    /**
     * <p>The ID of the disk.</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>The ID of the disk.</p>
     */
    @NameInMap("DiskIds")
    public String diskIds;

    /**
     * <p>The name of the disk.</p>
     */
    @NameInMap("DiskName")
    public String diskName;

    /**
     * <p>The purchase method of the disk. Valid values:</p>
     * <br>
     * <p>*   ServiceDisk: The disk is purchased when ENS is activated.</p>
     * <p>*   ResoureDisk: The disk is purchased when the instance is created.</p>
     * <p>*   PostPayDisk: The disk is separately purchased.</p>
     */
    @NameInMap("DiskType")
    public String diskType;

    /**
     * <p>The ID of the edge node.</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The node information.</p>
     */
    @NameInMap("EnsRegionIds")
    public String ensRegionIds;

    /**
     * <p>The instance to which the disk is attached.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The order in which you want to sort the returned data. Example: {"EnsRegionId":"desc"}. By default, the nodes are sorted by IDs in descending order.</p>
     */
    @NameInMap("OrderByParams")
    public String orderByParams;

    /**
     * <p>The number of the page to return. Pages start from page **1**.</p>
     * <br>
     * <p>Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: **50**.</p>
     * <br>
     * <p>Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The ID of the snapshot.</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    /**
     * <p>The status of the disk. Valid values:</p>
     * <br>
     * <p>*   In-use: The disk is in use.</p>
     * <p>*   Available: The disk can be attached.</p>
     * <p>*   Attaching: The disk is being attached.</p>
     * <p>*   Detaching: The disk is being detached.</p>
     * <p>*   Creating: The image is being created.</p>
     * <p>*   ReIniting: The disk is being reset.</p>
     * <p>*   Deleting: The disk is being released.</p>
     * <p>*   Deleted: The disk is released.</p>
     * <p>*   Expiring: The disk is about to expire.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The type of the disk. Valid values:</p>
     * <br>
     * <p>*   system: system disk.</p>
     * <p>*   data: data disk.</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeDisksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDisksRequest self = new DescribeDisksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDisksRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DescribeDisksRequest setDiskChargeType(String diskChargeType) {
        this.diskChargeType = diskChargeType;
        return this;
    }
    public String getDiskChargeType() {
        return this.diskChargeType;
    }

    public DescribeDisksRequest setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public DescribeDisksRequest setDiskIds(String diskIds) {
        this.diskIds = diskIds;
        return this;
    }
    public String getDiskIds() {
        return this.diskIds;
    }

    public DescribeDisksRequest setDiskName(String diskName) {
        this.diskName = diskName;
        return this;
    }
    public String getDiskName() {
        return this.diskName;
    }

    public DescribeDisksRequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public DescribeDisksRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public DescribeDisksRequest setEnsRegionIds(String ensRegionIds) {
        this.ensRegionIds = ensRegionIds;
        return this;
    }
    public String getEnsRegionIds() {
        return this.ensRegionIds;
    }

    public DescribeDisksRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDisksRequest setOrderByParams(String orderByParams) {
        this.orderByParams = orderByParams;
        return this;
    }
    public String getOrderByParams() {
        return this.orderByParams;
    }

    public DescribeDisksRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDisksRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeDisksRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public DescribeDisksRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeDisksRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
