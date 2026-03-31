// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateYikeProductionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>title</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <strong>example:</strong>
     * <p>581236</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateYikeProductionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateYikeProductionRequest self = new CreateYikeProductionRequest();
        return TeaModel.build(map, self);
    }

    public CreateYikeProductionRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateYikeProductionRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
