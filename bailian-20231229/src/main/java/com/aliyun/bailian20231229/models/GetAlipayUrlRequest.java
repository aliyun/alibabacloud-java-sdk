// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class GetAlipayUrlRequest extends TeaModel {
    /**
     * <p>The ID of the Bailian application.</p>
     * 
     * <strong>example:</strong>
     * <p>asfasdfxxasdf</p>
     */
    @NameInMap("app_id")
    public String appId;

    /**
     * <p>The ID of the Bailian workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxllm-czb8d47ks</p>
     */
    @NameInMap("workspace_id")
    public String workspaceId;

    public static GetAlipayUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlipayUrlRequest self = new GetAlipayUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetAlipayUrlRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetAlipayUrlRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
