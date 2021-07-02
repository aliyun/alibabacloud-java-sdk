// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ascp_sndop_compute_callback_service2021618.models;

import com.aliyun.tea.*;

public class GetNameRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    public static GetNameRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNameRequest self = new GetNameRequest();
        return TeaModel.build(map, self);
    }

    public GetNameRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
