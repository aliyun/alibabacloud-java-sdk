// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20210324.models;

import com.aliyun.tea.*;

public class QueryApplyOrderAllDetailRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("Type")
    public String type;

    public static QueryApplyOrderAllDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApplyOrderAllDetailRequest self = new QueryApplyOrderAllDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryApplyOrderAllDetailRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryApplyOrderAllDetailRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
