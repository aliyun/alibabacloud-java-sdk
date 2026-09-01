// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class CreateTemplateRequest extends TeaModel {
    /**
     * <p>The request struct.</p>
     */
    @NameInMap("body")
    public CreateTemplateInput body;

    public static CreateTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateRequest self = new CreateTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateTemplateRequest setBody(CreateTemplateInput body) {
        this.body = body;
        return this;
    }
    public CreateTemplateInput getBody() {
        return this.body;
    }

}
