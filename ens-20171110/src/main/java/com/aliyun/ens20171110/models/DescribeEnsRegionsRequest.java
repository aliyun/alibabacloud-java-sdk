// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsRegionsRequest extends TeaModel {
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    public static DescribeEnsRegionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsRegionsRequest self = new DescribeEnsRegionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEnsRegionsRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

}
