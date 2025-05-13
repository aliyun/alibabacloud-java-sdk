// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateUmodelResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123-0F43-23423-AC43-34234</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>workspace-test</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static CreateUmodelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUmodelResponseBody self = new CreateUmodelResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUmodelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateUmodelResponseBody setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
