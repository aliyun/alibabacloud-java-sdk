// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetTaobaoLoginUrlRequest extends TeaModel {
    @NameInMap("Type")
    public String type;

    public static GetTaobaoLoginUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTaobaoLoginUrlRequest self = new GetTaobaoLoginUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetTaobaoLoginUrlRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
