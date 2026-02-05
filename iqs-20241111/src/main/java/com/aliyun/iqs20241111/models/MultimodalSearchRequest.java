// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class MultimodalSearchRequest extends TeaModel {
    @NameInMap("body")
    public MultimodalSearchBody body;

    public static MultimodalSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        MultimodalSearchRequest self = new MultimodalSearchRequest();
        return TeaModel.build(map, self);
    }

    public MultimodalSearchRequest setBody(MultimodalSearchBody body) {
        this.body = body;
        return this;
    }
    public MultimodalSearchBody getBody() {
        return this.body;
    }

}
