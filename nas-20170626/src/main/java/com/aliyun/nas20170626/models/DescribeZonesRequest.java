// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeZonesRequest extends TeaModel {
    /**
     * <p>The file system type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>standard (default): General-purpose NAS.</li>
     * <li>extreme: Extreme NAS file system.</li>
     * <li>cpfs: Cloud Parallel File Storage.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("FileSystemType")
    public String fileSystemType;

    /**
     * <p>The ID of the region where the zones reside.</p>
     * <p>You can call DescribeRegions to query the latest region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
