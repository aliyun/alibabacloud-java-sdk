// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class Joinings extends TeaModel {
    /**
     * <p>The list of join conditions for query result sets, which defines the matching rules between multiple query result sets to merge query results from different data sources based on specified conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;lhsField&quot;:&quot;$0.hostIp&quot;,&quot;operator&quot;:&quot;==&quot;,&quot;rhsField&quot;:&quot;$1.hostIp&quot;}]</p>
     */
    @NameInMap("conditions")
    public java.util.List<JoinConditions> conditions;

    /**
     * <p>The set operation type: InnerJoin / LeftJoin / RightJoin / FullJoin / LeftExclude / RightExclude / CrossJoin / NoJoin / Concat.</p>
     * 
     * <strong>example:</strong>
     * <p>INNER</p>
     */
    @NameInMap("type")
    public String type;

    public static Joinings build(java.util.Map<String, ?> map) throws Exception {
        Joinings self = new Joinings();
        return TeaModel.build(map, self);
    }

    public Joinings setConditions(java.util.List<JoinConditions> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<JoinConditions> getConditions() {
        return this.conditions;
    }

    public Joinings setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
