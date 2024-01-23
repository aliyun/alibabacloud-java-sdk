// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class EntityAdditionalInfoValue extends TeaModel {
    @NameInMap("Type")
    public String type;

    @NameInMap("Promql")
    public String promql;

    public static EntityAdditionalInfoValue build(java.util.Map<String, ?> map) throws Exception {
        EntityAdditionalInfoValue self = new EntityAdditionalInfoValue();
        return TeaModel.build(map, self);
    }

    public EntityAdditionalInfoValue setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public EntityAdditionalInfoValue setPromql(String promql) {
        this.promql = promql;
        return this;
    }
    public String getPromql() {
        return this.promql;
    }

}
