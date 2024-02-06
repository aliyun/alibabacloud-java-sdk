// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeCreatePrePaidInstanceResultRequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can call the CreateIntance operation to create an instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

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

}
