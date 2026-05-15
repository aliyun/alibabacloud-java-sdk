// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateIMBotRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public CreateIMBotInput body;

    public static CreateIMBotRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIMBotRequest self = new CreateIMBotRequest();
        return TeaModel.build(map, self);
    }

    public CreateIMBotRequest setBody(CreateIMBotInput body) {
        this.body = body;
        return this;
    }
    public CreateIMBotInput getBody() {
        return this.body;
    }

}
