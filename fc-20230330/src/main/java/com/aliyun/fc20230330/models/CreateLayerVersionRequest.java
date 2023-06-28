// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CreateLayerVersionRequest extends TeaModel {
    @NameInMap("request")
    public CreateLayerVersionInput request;

    public static CreateLayerVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLayerVersionRequest self = new CreateLayerVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateLayerVersionRequest setRequest(CreateLayerVersionInput request) {
        this.request = request;
        return this;
    }
    public CreateLayerVersionInput getRequest() {
        return this.request;
    }

}
