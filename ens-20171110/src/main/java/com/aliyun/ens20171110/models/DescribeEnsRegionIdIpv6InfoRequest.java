// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsRegionIdIpv6InfoRequest extends TeaModel {
    /**
     * <p>The ID of the edge zone. Only a single ID is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-chengdu-****-4</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    public static DescribeEnsRegionIdIpv6InfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsRegionIdIpv6InfoRequest self = new DescribeEnsRegionIdIpv6InfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEnsRegionIdIpv6InfoRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

}
