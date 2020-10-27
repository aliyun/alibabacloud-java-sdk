// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSnapshotLinksRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("DiskIds")
    public String diskIds;

    @NameInMap("SnapshotLinkIds")
    public String snapshotLinkIds;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeSnapshotLinksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotLinksRequest self = new DescribeSnapshotLinksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSnapshotLinksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSnapshotLinksRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeSnapshotLinksRequest setDiskIds(String diskIds) {
        this.diskIds = diskIds;
        return this;
    }
    public String getDiskIds() {
        return this.diskIds;
    }

    public DescribeSnapshotLinksRequest setSnapshotLinkIds(String snapshotLinkIds) {
        this.snapshotLinkIds = snapshotLinkIds;
        return this;
    }
    public String getSnapshotLinkIds() {
        return this.snapshotLinkIds;
    }

    public DescribeSnapshotLinksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSnapshotLinksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
