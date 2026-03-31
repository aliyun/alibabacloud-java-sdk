// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateYikeWorkspaceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ProductionId</p>
     */
    @NameInMap("ProductionId")
    public String productionId;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>llm-zna577pdximvztk5</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateYikeWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateYikeWorkspaceResponseBody self = new CreateYikeWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateYikeWorkspaceResponseBody setProductionId(String productionId) {
        this.productionId = productionId;
        return this;
    }
    public String getProductionId() {
        return this.productionId;
    }

    public CreateYikeWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateYikeWorkspaceResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
