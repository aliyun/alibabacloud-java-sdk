// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetDetectionRequest extends TeaModel {
    @NameInMap("Id")
    @Validation(required = true)
    public String id;

    public static GetDetectionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDetectionRequest self = new GetDetectionRequest();
        return TeaModel.build(map, self);
    }

    public GetDetectionRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
