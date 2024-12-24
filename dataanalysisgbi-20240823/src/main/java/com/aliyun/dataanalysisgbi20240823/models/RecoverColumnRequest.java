// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class RecoverColumnRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>column-AAAAAAAAh6cWOUPagYstkg</p>
     */
    @NameInMap("columnIdKey")
    public String columnIdKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>table-AAAAAAAAFQBwSLJkUj4CYg</p>
     */
    @NameInMap("tableIdKey")
    public String tableIdKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-2v3934xtp49esw64</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static RecoverColumnRequest build(java.util.Map<String, ?> map) throws Exception {
        RecoverColumnRequest self = new RecoverColumnRequest();
        return TeaModel.build(map, self);
    }

    public RecoverColumnRequest setColumnIdKey(String columnIdKey) {
        this.columnIdKey = columnIdKey;
        return this;
    }
    public String getColumnIdKey() {
        return this.columnIdKey;
    }

    public RecoverColumnRequest setTableIdKey(String tableIdKey) {
        this.tableIdKey = tableIdKey;
        return this;
    }
    public String getTableIdKey() {
        return this.tableIdKey;
    }

    public RecoverColumnRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
