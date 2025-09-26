// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateBrowserRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public CreateBrowserInput body;

    public static CreateBrowserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBrowserRequest self = new CreateBrowserRequest();
        return TeaModel.build(map, self);
    }

    public CreateBrowserRequest setBody(CreateBrowserInput body) {
        this.body = body;
        return this;
    }
    public CreateBrowserInput getBody() {
        return this.body;
    }

}
