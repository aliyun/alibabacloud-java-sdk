// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class DeleteColumnRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>column-AAAAAAAAh6Q9ERazKYFvkA</p>
     */
    @NameInMap("columnIdKey")
    public String columnIdKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-2v3934xtp49esw64</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static DeleteColumnRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteColumnRequest self = new DeleteColumnRequest();
        return TeaModel.build(map, self);
    }

    public DeleteColumnRequest setColumnIdKey(String columnIdKey) {
        this.columnIdKey = columnIdKey;
        return this;
    }
    public String getColumnIdKey() {
        return this.columnIdKey;
    }

    public DeleteColumnRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
