// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeRegionResourceRequest extends TeaModel {
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    @NameInMap("IspType")
    public String ispType;

    public static DescribeRegionResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionResourceRequest self = new DescribeRegionResourceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRegionResourceRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public DescribeRegionResourceRequest setIspType(String ispType) {
        this.ispType = ispType;
        return this;
    }
    public String getIspType() {
        return this.ispType;
    }

}
