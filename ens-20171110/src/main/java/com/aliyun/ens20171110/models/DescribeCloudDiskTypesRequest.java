// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeCloudDiskTypesRequest extends TeaModel {
    // A short description of struct
    @NameInMap("EnsRegionId")
    public String ensRegionId;

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

}
