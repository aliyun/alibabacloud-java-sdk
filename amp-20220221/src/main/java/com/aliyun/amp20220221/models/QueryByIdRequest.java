// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amp20220221.models;

import com.aliyun.tea.*;

public class QueryByIdRequest extends TeaModel {
    // fsdfs
    @NameInMap("address")
    public String address;

    public static QueryByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryByIdRequest self = new QueryByIdRequest();
        return TeaModel.build(map, self);
    }

    public QueryByIdRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

}
