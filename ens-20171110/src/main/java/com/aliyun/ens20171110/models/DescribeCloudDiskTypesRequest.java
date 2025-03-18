// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeCloudDiskTypesRequest extends TeaModel {
    /**
     * <p>The ID of the edge node.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-chongqing-cmcc</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The edge nodes.</p>
     */
    @NameInMap("EnsRegionIds")
    public java.util.List<String> ensRegionIds;

    public static DescribeCloudDiskTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudDiskTypesRequest self = new DescribeCloudDiskTypesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudDiskTypesRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public DescribeCloudDiskTypesRequest setEnsRegionIds(java.util.List<String> ensRegionIds) {
        this.ensRegionIds = ensRegionIds;
        return this;
    }
    public java.util.List<String> getEnsRegionIds() {
        return this.ensRegionIds;
    }

}
