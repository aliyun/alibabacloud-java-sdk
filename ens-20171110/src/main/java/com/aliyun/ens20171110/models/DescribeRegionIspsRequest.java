// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeRegionIspsRequest extends TeaModel {
    /**
     * <p>The edge node ID. Only a single query is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-dalian-unicom</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    public static DescribeRegionIspsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionIspsRequest self = new DescribeRegionIspsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRegionIspsRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

}
