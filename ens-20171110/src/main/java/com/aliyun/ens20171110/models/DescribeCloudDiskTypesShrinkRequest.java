// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeCloudDiskTypesShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the edge node.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-chongqing-cmcc</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    @NameInMap("EnsRegionIds")
    public String ensRegionIdsShrink;

    public static DescribeCloudDiskTypesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudDiskTypesShrinkRequest self = new DescribeCloudDiskTypesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudDiskTypesShrinkRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public DescribeCloudDiskTypesShrinkRequest setEnsRegionIdsShrink(String ensRegionIdsShrink) {
        this.ensRegionIdsShrink = ensRegionIdsShrink;
        return this;
    }
    public String getEnsRegionIdsShrink() {
        return this.ensRegionIdsShrink;
    }

}
