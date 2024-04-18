// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeSpotDiscountHistoryRequest extends TeaModel {
    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("IsProtect")
    public Boolean isProtect;

    public static DescribeSpotDiscountHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSpotDiscountHistoryRequest self = new DescribeSpotDiscountHistoryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSpotDiscountHistoryRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeSpotDiscountHistoryRequest setIsProtect(Boolean isProtect) {
        this.isProtect = isProtect;
        return this;
    }
    public Boolean getIsProtect() {
        return this.isProtect;
    }

}
