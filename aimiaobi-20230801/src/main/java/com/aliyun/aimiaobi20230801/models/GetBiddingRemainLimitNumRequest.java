// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetBiddingRemainLimitNumRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>asyncUploadTenderDoc</p>
     */
    @NameInMap("ApiName")
    public String apiName;

    /**
     * <strong>example:</strong>
     * <p>llm-xx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetBiddingRemainLimitNumRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBiddingRemainLimitNumRequest self = new GetBiddingRemainLimitNumRequest();
        return TeaModel.build(map, self);
    }

    public GetBiddingRemainLimitNumRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public GetBiddingRemainLimitNumRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
