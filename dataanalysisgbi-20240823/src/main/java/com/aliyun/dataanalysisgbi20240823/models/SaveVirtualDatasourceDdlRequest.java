// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class SaveVirtualDatasourceDdlRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ddl")
    public String ddl;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vdb-E0F693C8-9F72-5830-B81A-696C9D8EBBD1</p>
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

    public static SaveVirtualDatasourceDdlRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveVirtualDatasourceDdlRequest self = new SaveVirtualDatasourceDdlRequest();
        return TeaModel.build(map, self);
    }

    public SaveVirtualDatasourceDdlRequest setDdl(String ddl) {
        this.ddl = ddl;
        return this;
    }
    public String getDdl() {
        return this.ddl;
    }

    public SaveVirtualDatasourceDdlRequest setVdbId(String vdbId) {
        this.vdbId = vdbId;
        return this;
    }
    public String getVdbId() {
        return this.vdbId;
    }

    public SaveVirtualDatasourceDdlRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
