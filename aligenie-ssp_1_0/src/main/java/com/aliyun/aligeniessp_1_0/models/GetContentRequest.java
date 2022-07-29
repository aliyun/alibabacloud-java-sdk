// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetContentRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("Type")
    public String type;

    public static GetContentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetContentRequest self = new GetContentRequest();
        return TeaModel.build(map, self);
    }

    public GetContentRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetContentRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
