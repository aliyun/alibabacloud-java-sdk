// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsRegionIdIpv6InfoRequest extends TeaModel {
    @NameInMap("Version")
    @Validation(required = true)
    public String version;

    @NameInMap("EnsRegionId")
    @Validation(required = true)
    public String ensRegionId;

    public static DescribeEnsRegionIdIpv6InfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsRegionIdIpv6InfoRequest self = new DescribeEnsRegionIdIpv6InfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEnsRegionIdIpv6InfoRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public DescribeEnsRegionIdIpv6InfoRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

}
