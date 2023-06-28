// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class PutConcurrencyConfigRequest extends TeaModel {
    @NameInMap("request")
    public PutConcurrencyInput request;

    public static PutConcurrencyConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        PutConcurrencyConfigRequest self = new PutConcurrencyConfigRequest();
        return TeaModel.build(map, self);
    }

    public PutConcurrencyConfigRequest setRequest(PutConcurrencyInput request) {
        this.request = request;
        return this;
    }
    public PutConcurrencyInput getRequest() {
        return this.request;
    }

}
