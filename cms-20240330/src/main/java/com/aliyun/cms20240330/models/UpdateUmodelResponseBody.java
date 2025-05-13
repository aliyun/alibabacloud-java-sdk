// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateUmodelResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>234324-123-123-123-23423</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>workspace-test</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static UpdateUmodelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateUmodelResponseBody self = new UpdateUmodelResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateUmodelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateUmodelResponseBody setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
