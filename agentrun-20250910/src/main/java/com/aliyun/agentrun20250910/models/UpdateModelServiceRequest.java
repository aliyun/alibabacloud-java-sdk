// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateModelServiceRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public UpdateModelServiceInput body;

    public static UpdateModelServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelServiceRequest self = new UpdateModelServiceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateModelServiceRequest setBody(UpdateModelServiceInput body) {
        this.body = body;
        return this;
    }
    public UpdateModelServiceInput getBody() {
        return this.body;
    }

}
