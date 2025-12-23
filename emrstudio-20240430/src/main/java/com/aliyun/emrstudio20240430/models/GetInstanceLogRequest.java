// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class GetInstanceLogRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("limit")
    public Long limit;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("skipLineNum")
    public Long skipLineNum;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>w-111</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static GetInstanceLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceLogRequest self = new GetInstanceLogRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceLogRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public GetInstanceLogRequest setSkipLineNum(Long skipLineNum) {
        this.skipLineNum = skipLineNum;
        return this;
    }
    public Long getSkipLineNum() {
        return this.skipLineNum;
    }

    public GetInstanceLogRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
