// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RelationshipVO extends TeaModel {
    @NameInMap("Type")
    public String type;

    public static RelationshipVO build(java.util.Map<String, ?> map) throws Exception {
        RelationshipVO self = new RelationshipVO();
        return TeaModel.build(map, self);
    }

    public RelationshipVO setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
