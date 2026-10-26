// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class SlsQueryJoin extends TeaModel {
    /**
     * <p>The list of join conditions for SLS query result sets, which defines the matching rules between multiple SLS query results for cross-logstore data association analysis.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;lhsField&quot;:&quot;$0.hostIp&quot;,&quot;operator&quot;:&quot;==&quot;,&quot;rhsField&quot;:&quot;$1.hostIp&quot;}]</p>
     */
    @NameInMap("conditions")
    public java.util.List<SlsJoinCondition> conditions;

    /**
     * <p>The set operation type: InnerJoin / LeftJoin / RightJoin / FullJoin / LeftExclude / RightExclude / CrossJoin / NoJoin / Concat.</p>
     * 
     * <strong>example:</strong>
     * <p>LEFT</p>
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
