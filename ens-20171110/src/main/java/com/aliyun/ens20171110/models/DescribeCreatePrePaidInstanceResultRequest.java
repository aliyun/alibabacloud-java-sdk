// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeCreatePrePaidInstanceResultRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Version")
    public String version;

    public static DescribeCreatePrePaidInstanceResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCreatePrePaidInstanceResultRequest self = new DescribeCreatePrePaidInstanceResultRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCreatePrePaidInstanceResultRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeCreatePrePaidInstanceResultRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
