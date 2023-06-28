// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class UpdateTriggerRequest extends TeaModel {
    @NameInMap("request")
    public UpdateTriggerInput request;

    public static UpdateTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTriggerRequest self = new UpdateTriggerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTriggerRequest setRequest(UpdateTriggerInput request) {
        this.request = request;
        return this;
    }
    public UpdateTriggerInput getRequest() {
        return this.request;
    }

}
