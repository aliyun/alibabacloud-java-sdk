// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateProjectResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>p-433aead7560572f8d95b25775c</p>
     */
    @NameInMap("projectId")
    public String projectId;

    /**
     * <strong>example:</strong>
     * <p>3E49127A-BB65-5CCD-AB93-0EC0A43E5446</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectResponseBody self = new CreateProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProjectResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
