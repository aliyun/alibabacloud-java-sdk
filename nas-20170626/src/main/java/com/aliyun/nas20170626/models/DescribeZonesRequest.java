// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeZonesRequest extends TeaModel {
    /**
     * <p>The type of the file system.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   standard (default): General-purpose NAS file system</p>
     * <p>*   extreme: Extreme NAS file system</p>
     * <p>*   cpfs: Cloud Parallel File Storage (CPFS) file system</p>
     * <br>
     * <p>> CPFS file systems are available only on the China site (aliyun.com).</p>
     */
    @NameInMap("FileSystemType")
    public String fileSystemType;

    /**
     * <p>The ID of the region where you want to query zones.</p>
     * <br>
     * <p>You can call the DescribeRegions operation to query the latest region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeZonesRequest self = new DescribeZonesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeZonesRequest setFileSystemType(String fileSystemType) {
        this.fileSystemType = fileSystemType;
        return this;
    }
    public String getFileSystemType() {
        return this.fileSystemType;
    }

    public DescribeZonesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
