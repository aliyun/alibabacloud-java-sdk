// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class PutConcurrencyConfigRequest extends TeaModel {
    @NameInMap("body")
    public PutConcurrencyInput body;

    public static PutConcurrencyConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        PutConcurrencyConfigRequest self = new PutConcurrencyConfigRequest();
        return TeaModel.build(map, self);
    }

    public PutConcurrencyConfigRequest setBody(PutConcurrencyInput body) {
        this.body = body;
        return this;
    }
    public PutConcurrencyInput getBody() {
        return this.body;
    }

}
