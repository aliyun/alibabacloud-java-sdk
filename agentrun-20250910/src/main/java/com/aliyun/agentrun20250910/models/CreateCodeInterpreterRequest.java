// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateCodeInterpreterRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public CreateCodeInterpreterInput body;

    public static CreateCodeInterpreterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCodeInterpreterRequest self = new CreateCodeInterpreterRequest();
        return TeaModel.build(map, self);
    }

    public CreateCodeInterpreterRequest setBody(CreateCodeInterpreterInput body) {
        this.body = body;
        return this;
    }
    public CreateCodeInterpreterInput getBody() {
        return this.body;
    }

}
