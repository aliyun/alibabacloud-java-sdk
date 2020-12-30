// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeInstanceDetailsRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("InstanceIds")
    public String instanceIds;

    public static DescribeInstanceDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceDetailsRequest self = new DescribeInstanceDetailsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceDetailsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeInstanceDetailsRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

}
