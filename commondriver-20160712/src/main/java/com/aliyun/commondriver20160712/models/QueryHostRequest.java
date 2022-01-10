// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.commondriver20160712.models;

import com.aliyun.tea.*;

public class QueryHostRequest extends TeaModel {
    @NameInMap("Param")
    public String param;

    public static QueryHostRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHostRequest self = new QueryHostRequest();
        return TeaModel.build(map, self);
    }

    public QueryHostRequest setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

}
