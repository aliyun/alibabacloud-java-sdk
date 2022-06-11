// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetOpenStoreUsageRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static GetOpenStoreUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOpenStoreUsageRequest self = new GetOpenStoreUsageRequest();
        return TeaModel.build(map, self);
    }

    public GetOpenStoreUsageRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
