// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class CreateTemplateCacheRequest extends TeaModel {
    @NameInMap("body")
    public CreateTemplateCacheInput body;

    public static CreateTemplateCacheRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateCacheRequest self = new CreateTemplateCacheRequest();
        return TeaModel.build(map, self);
    }

    public CreateTemplateCacheRequest setBody(CreateTemplateCacheInput body) {
        this.body = body;
        return this;
    }
    public CreateTemplateCacheInput getBody() {
        return this.body;
    }

}
