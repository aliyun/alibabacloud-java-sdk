// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class SlsQueryJoin extends TeaModel {
    /**
     * <p>The list of join conditions.</p>
     */
    @NameInMap("conditions")
    public java.util.List<SlsJoinCondition> conditions;

    /**
     * <p>The set operation type. Valid values: InnerJoin, LeftJoin, RightJoin, FullJoin, LeftExclude, RightExclude, CrossJoin, NoJoin, and Concat.</p>
     */
    @NameInMap("type")
    public String type;

    public static SlsQueryJoin build(java.util.Map<String, ?> map) throws Exception {
        SlsQueryJoin self = new SlsQueryJoin();
        return TeaModel.build(map, self);
    }

    public SlsQueryJoin setConditions(java.util.List<SlsJoinCondition> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<SlsJoinCondition> getConditions() {
        return this.conditions;
    }

    public SlsQueryJoin setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
