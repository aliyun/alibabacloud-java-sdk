// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeBlackholeStatusRequest extends TeaModel {
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    public static DescribeBlackholeStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlackholeStatusRequest self = new DescribeBlackholeStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBlackholeStatusRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

}
