// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class ResyncTableRequest extends TeaModel {
    @NameInMap("keep")
    public Boolean keep;

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

    public static ResyncTableRequest build(java.util.Map<String, ?> map) throws Exception {
        ResyncTableRequest self = new ResyncTableRequest();
        return TeaModel.build(map, self);
    }

    public ResyncTableRequest setKeep(Boolean keep) {
        this.keep = keep;
        return this;
    }
    public Boolean getKeep() {
        return this.keep;
    }

    public ResyncTableRequest setTableIdKey(String tableIdKey) {
        this.tableIdKey = tableIdKey;
        return this;
    }
    public String getTableIdKey() {
        return this.tableIdKey;
    }

    public ResyncTableRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
