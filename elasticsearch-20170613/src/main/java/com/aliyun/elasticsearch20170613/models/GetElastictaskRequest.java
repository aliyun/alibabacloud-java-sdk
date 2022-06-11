// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetElastictaskRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static GetElastictaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetElastictaskRequest self = new GetElastictaskRequest();
        return TeaModel.build(map, self);
    }

    public GetElastictaskRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
