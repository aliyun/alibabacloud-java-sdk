// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CreateLayerVersionRequest extends TeaModel {
    /**
     * <p>The information about layer configurations.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public CreateLayerVersionInput body;

    public static CreateLayerVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLayerVersionRequest self = new CreateLayerVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateLayerVersionRequest setBody(CreateLayerVersionInput body) {
        this.body = body;
        return this;
    }
    public CreateLayerVersionInput getBody() {
        return this.body;
    }

}
