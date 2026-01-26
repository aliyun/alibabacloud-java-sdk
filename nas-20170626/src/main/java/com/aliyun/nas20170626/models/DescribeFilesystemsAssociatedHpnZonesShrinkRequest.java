// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeFilesystemsAssociatedHpnZonesShrinkRequest extends TeaModel {
    @NameInMap("Filesystems")
    public String filesystemsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeFilesystemsAssociatedHpnZonesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFilesystemsAssociatedHpnZonesShrinkRequest self = new DescribeFilesystemsAssociatedHpnZonesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFilesystemsAssociatedHpnZonesShrinkRequest setFilesystemsShrink(String filesystemsShrink) {
        this.filesystemsShrink = filesystemsShrink;
        return this;
    }
    public String getFilesystemsShrink() {
        return this.filesystemsShrink;
    }

    public DescribeFilesystemsAssociatedHpnZonesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
