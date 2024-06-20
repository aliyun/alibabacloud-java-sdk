// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeInstanceDetailsRequest extends TeaModel {
    /**
     * <p>An array that consists of the IDs of instances to query.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    public static DescribeInstanceDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceDetailsRequest self = new DescribeInstanceDetailsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceDetailsRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

}
