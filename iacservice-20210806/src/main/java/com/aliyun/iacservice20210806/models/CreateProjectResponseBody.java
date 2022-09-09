// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateProjectResponseBody extends TeaModel {
    @NameInMap("id")
    public String id;

    @NameInMap("requestId")
    public String requestId;

    public static CreateProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectResponseBody self = new CreateProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProjectResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
