// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class UnifiedSearchRequest extends TeaModel {
    @NameInMap("body")
    public UnifiedSearchInput body;

    public static UnifiedSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        UnifiedSearchRequest self = new UnifiedSearchRequest();
        return TeaModel.build(map, self);
    }

    public UnifiedSearchRequest setBody(UnifiedSearchInput body) {
        this.body = body;
        return this;
    }
    public UnifiedSearchInput getBody() {
        return this.body;
    }

}
