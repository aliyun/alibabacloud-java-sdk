// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateProjectBuildResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pb-433aead756057193ba8bb410945</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>EE295EEC-EA85-5899-B2D5-5FCA788AC3C6</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateProjectBuildResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectBuildResponseBody self = new CreateProjectBuildResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProjectBuildResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateProjectBuildResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
