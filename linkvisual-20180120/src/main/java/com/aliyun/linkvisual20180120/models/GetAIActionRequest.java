// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetAIActionRequest extends TeaModel {
    @NameInMap("ActionId")
    @Validation(required = true)
    public String actionId;

    public static GetAIActionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAIActionRequest self = new GetAIActionRequest();
        return TeaModel.build(map, self);
    }

    public GetAIActionRequest setActionId(String actionId) {
        this.actionId = actionId;
        return this;
    }
    public String getActionId() {
        return this.actionId;
    }

}
