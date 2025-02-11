// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeImageInstanceForIsvRequest extends TeaModel {
    @NameInMap("CustomerPk")
    public Long customerPk;

    @NameInMap("EcsInstanceId")
    public String ecsInstanceId;

    public static DescribeImageInstanceForIsvRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageInstanceForIsvRequest self = new DescribeImageInstanceForIsvRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageInstanceForIsvRequest setCustomerPk(Long customerPk) {
        this.customerPk = customerPk;
        return this;
    }
    public Long getCustomerPk() {
        return this.customerPk;
    }

    public DescribeImageInstanceForIsvRequest setEcsInstanceId(String ecsInstanceId) {
        this.ecsInstanceId = ecsInstanceId;
        return this;
    }
    public String getEcsInstanceId() {
        return this.ecsInstanceId;
    }

}
