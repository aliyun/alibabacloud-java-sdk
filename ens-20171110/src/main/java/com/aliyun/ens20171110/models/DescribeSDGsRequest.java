// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSDGsRequest extends TeaModel {
    /**
     * <p>The list of AIC instance IDs to query.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The list of SDG IDs to query.</p>
     */
    @NameInMap("SDGIds")
    public java.util.List<String> SDGIds;

    public static DescribeSDGsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSDGsRequest self = new DescribeSDGsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSDGsRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeSDGsRequest setSDGIds(java.util.List<String> SDGIds) {
        this.SDGIds = SDGIds;
        return this;
    }
    public java.util.List<String> getSDGIds() {
        return this.SDGIds;
    }

}
