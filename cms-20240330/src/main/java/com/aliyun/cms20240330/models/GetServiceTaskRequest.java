// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetServiceTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>live_debug_log_probe</p>
     */
    @NameInMap("type")
    public String type;

    public static GetServiceTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceTaskRequest self = new GetServiceTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceTaskRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
