// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetModelingRequest extends TeaModel {
    @NameInMap("ModelingId")
    public Long modelingId;

    public static GetModelingRequest build(java.util.Map<String, ?> map) throws Exception {
        GetModelingRequest self = new GetModelingRequest();
        return TeaModel.build(map, self);
    }

    public GetModelingRequest setModelingId(Long modelingId) {
        this.modelingId = modelingId;
        return this;
    }
    public Long getModelingId() {
        return this.modelingId;
    }

}
