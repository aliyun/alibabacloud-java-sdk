// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class UpdateTriggerRequest extends TeaModel {
    /**
     * <p>The trigger configurations.</p>
     */
    @NameInMap("body")
    public UpdateTriggerInput body;

    public static UpdateTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTriggerRequest self = new UpdateTriggerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTriggerRequest setBody(UpdateTriggerInput body) {
        this.body = body;
        return this;
    }
    public UpdateTriggerInput getBody() {
        return this.body;
    }

}
