// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CreateIndividuationProjectResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>812907463682949120</p>
     */
    @NameInMap("projectId")
    public String projectId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>4D902811-B75C-5D1B-8882-D515F8E2F977</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateIndividuationProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIndividuationProjectResponseBody self = new CreateIndividuationProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIndividuationProjectResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateIndividuationProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
