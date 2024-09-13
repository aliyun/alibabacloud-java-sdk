// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSDGsRequest extends TeaModel {
    /**
     * <p>The AIC instance ID to be queried.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The IDs of SDGs that you want to query. By default, all SDGs are queried.</p>
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
