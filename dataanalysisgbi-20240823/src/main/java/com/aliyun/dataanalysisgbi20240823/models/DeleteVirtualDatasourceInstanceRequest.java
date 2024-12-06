// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class DeleteVirtualDatasourceInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vdb-7D63529B-5D42-5BF0-84E4-F742FFE02E7F</p>
     */
    @NameInMap("vdbId")
    public String vdbId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-2v3934xtp49esw64</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static DeleteVirtualDatasourceInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVirtualDatasourceInstanceRequest self = new DeleteVirtualDatasourceInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVirtualDatasourceInstanceRequest setVdbId(String vdbId) {
        this.vdbId = vdbId;
        return this;
    }
    public String getVdbId() {
        return this.vdbId;
    }

    public DeleteVirtualDatasourceInstanceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
