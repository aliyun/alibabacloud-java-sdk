// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class CreateFlowCategoryResponseBody extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateFlowCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowCategoryResponseBody self = new CreateFlowCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFlowCategoryResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateFlowCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
