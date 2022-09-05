// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class GetRelatedByCreativeIdRequest extends TeaModel {
    @NameInMap("Id")
    public Integer id;

    public static GetRelatedByCreativeIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRelatedByCreativeIdRequest self = new GetRelatedByCreativeIdRequest();
        return TeaModel.build(map, self);
    }

    public GetRelatedByCreativeIdRequest setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

}
