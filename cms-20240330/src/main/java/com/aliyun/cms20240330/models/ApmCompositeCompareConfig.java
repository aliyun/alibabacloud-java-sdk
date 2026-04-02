// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ApmCompositeCompareConfig extends TeaModel {
    /**
     * <p>聚合函数</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("aggregate")
    public String aggregate;

    /**
     * <p>比较操作符</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("operator")
    public String operator;

    /**
     * <p>单阈值</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("threshold")
    public Float threshold;

    public static ApmCompositeCompareConfig build(java.util.Map<String, ?> map) throws Exception {
        ApmCompositeCompareConfig self = new ApmCompositeCompareConfig();
        return TeaModel.build(map, self);
    }

    public ApmCompositeCompareConfig setAggregate(String aggregate) {
        this.aggregate = aggregate;
        return this;
    }
    public String getAggregate() {
        return this.aggregate;
    }

    public ApmCompositeCompareConfig setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public ApmCompositeCompareConfig setThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }
    public Float getThreshold() {
        return this.threshold;
    }

}
