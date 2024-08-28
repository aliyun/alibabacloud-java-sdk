// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeSpotDiscountHistoryRequest extends TeaModel {
    /**
     * <p>The type of the Elastic Algorithm Service (EAS) instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.c6.4xlarge</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>Specifies whether the preemptible instance has a protection period. During the 1-hour protection period of the preemptible instance, the preemptible instance will not be released.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
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
