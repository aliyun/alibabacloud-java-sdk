// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateIMBotRequest extends TeaModel {
    /**
     * <p>Contains the configuration details to update for the IM bot.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public UpdateIMBotInput body;

    public static UpdateIMBotRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIMBotRequest self = new UpdateIMBotRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIMBotRequest setBody(UpdateIMBotInput body) {
        this.body = body;
        return this;
    }
    public UpdateIMBotInput getBody() {
        return this.body;
    }

}
