// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeDisksRequest extends TeaModel {
    /**
     * <p>The category of the disk.</p>
     * <ul>
     * <li>cloud_efficiency: ultra disk.</li>
     * <li>cloud_ssd: all-flash disk.</li>
     * <li>local_hdd: local HDD.</li>
     * <li>local_ssd: local SSD.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>local_ssd</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The billing method.</p>
     * <ul>
     * <li>prePay: subscription.</li>
     * <li>postpay: pay-as-you-go.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>prepay</p>
     */
    @NameInMap("DiskChargeType")
    public String diskChargeType;

    /**
     * <p>The ID of the disk.</p>
     * 
     * <strong>example:</strong>
     * <p>d-5soak1gqa507lyfzvz0xo****</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>The ID of the disk.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;d-wz99njena32z90ki****\&quot;]</p>
     */
    @NameInMap("DiskIds")
    public String diskIds;

    /**
     * <p>The name of the disk.</p>
     * 
     * <strong>example:</strong>
     * <p>DiskName</p>
     */
    @NameInMap("DiskName")
    public String diskName;

    /**
     * <p>The purchase method of the disk. Valid values:</p>
     * <ul>
     * <li>ServiceDisk: The disk is purchased when ENS is activated.</li>
     * <li>ResoureDisk: The disk is purchased when the instance is created.</li>
     * <li>PostPayDisk: The disk is separately purchased.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PostPayDisk</p>
     */
    @NameInMap("DiskType")
    public String diskType;

    /**
     * <p>The ID of the edge node.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-kunming-telecom</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The node information.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;cn-suzhou-telecom&quot;,&quot;cn-chengdu-telecom&quot;]</p>
     */
    @NameInMap("EnsRegionIds")
    public String ensRegionIds;

    /**
     * <p>The ID of the instance to which the disk is attached.</p>
     * 
     * <strong>example:</strong>
     * <p>i-5t77rb0yoz79m28ku60sx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The order in which you want to sort the returned data. Example: {&quot;EnsRegionId&quot;:&quot;desc&quot;}. By default, the nodes are sorted by IDs in descending order.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;DiskNameSort&quot;:&quot;desc&quot;,&quot;EnsRegionIdSort&quot;:&quot;asc&quot; }</p>
     */
    @NameInMap("OrderByParams")
    public String orderByParams;

    /**
     * <p>The number of the page to return. Pages start from page <strong>1</strong>.</p>
     * <p>Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: <strong>50</strong>.</p>
     * <p>Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The ID of the snapshot.</p>
     * 
     * <strong>example:</strong>
     * <p>s-897654321****</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    /**
     * <p>The status of the disk. Valid values:</p>
     * <ul>
     * <li>In-use: The disk is in use.</li>
     * <li>Available: The disk can be attached.</li>
     * <li>Attaching: The disk is being attached.</li>
     * <li>Detaching: The disk is being detached.</li>
     * <li>Creating: The disk is being created.</li>
     * <li>ReIniting: The disk is being reset.</li>
     * <li>Deleting: The disk is being released.</li>
     * <li>Deleted: The disk is released.</li>
     * <li>Expiring: The disk is about to expire.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The type of the disk. Valid values:</p>
     * <ul>
     * <li>system: system disk.</li>
     * <li>data: data disk.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>system</p>
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
