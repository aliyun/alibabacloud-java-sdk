// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSnapshotsRequest extends TeaModel {
    /**
     * <p>The ID of the disk.</p>
     * 
     * <strong>example:</strong>
     * <p>d-bp67acfmxazb4p****</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>The ID of the ENS node. You can query the node ID by calling the <a href="https://help.aliyun.com/document_detail/2637662.html">DescribeEnsRegions</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp67acfmxazb4p****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the snapshot. The value can be a JSON array that consists of up to 100 snapshot IDs. Separate the snapshot IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>sp-bp67acfmxazb4p****</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    /**
     * <p>The name of the snapshot. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>testSnapshotName</p>
     */
    @NameInMap("SnapshotName")
    public String snapshotName;

    public static DescribeSnapshotsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotsRequest self = new DescribeSnapshotsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSnapshotsRequest setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public DescribeSnapshotsRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public DescribeSnapshotsRequest setEnsRegionIds(String ensRegionIds) {
        this.ensRegionIds = ensRegionIds;
        return this;
    }
    public String getEnsRegionIds() {
        return this.ensRegionIds;
    }

    public DescribeSnapshotsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeSnapshotsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSnapshotsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSnapshotsRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public DescribeSnapshotsRequest setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
        return this;
    }
    public String getSnapshotName() {
        return this.snapshotName;
    }

}
