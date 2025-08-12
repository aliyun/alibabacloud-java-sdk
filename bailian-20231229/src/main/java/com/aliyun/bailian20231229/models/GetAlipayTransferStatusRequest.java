// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class GetAlipayTransferStatusRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxx-xxxx</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>llm-cxxxxxxb8d47ks</p>
     */
    @NameInMap("workspace_id")
    public String workspaceId;

    public static GetAlipayTransferStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlipayTransferStatusRequest self = new GetAlipayTransferStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetAlipayTransferStatusRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAlipayTransferStatusRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
