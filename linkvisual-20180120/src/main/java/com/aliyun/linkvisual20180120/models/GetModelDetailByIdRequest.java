// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetModelDetailByIdRequest extends TeaModel {
    @NameInMap("ModelId")
    @Validation(required = true)
    public Long modelId;

    public static GetModelDetailByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetModelDetailByIdRequest self = new GetModelDetailByIdRequest();
        return TeaModel.build(map, self);
    }

    public GetModelDetailByIdRequest setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }
    public Long getModelId() {
        return this.modelId;
    }

}
