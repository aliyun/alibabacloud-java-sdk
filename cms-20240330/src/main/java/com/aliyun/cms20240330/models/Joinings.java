// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class Joinings extends TeaModel {
    @NameInMap("conditions")
    public java.util.List<JoinConditions> conditions;

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
