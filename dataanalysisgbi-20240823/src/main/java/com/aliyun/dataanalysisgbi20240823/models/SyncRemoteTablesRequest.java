// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class SyncRemoteTablesRequest extends TeaModel {
    @NameInMap("keepTableNames")
    public java.util.List<String> keepTableNames;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("pullSamples")
    public Boolean pullSamples;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("tableNames")
    public java.util.List<String> tableNames;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-2v3934xtp49esw64</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static SyncRemoteTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncRemoteTablesRequest self = new SyncRemoteTablesRequest();
        return TeaModel.build(map, self);
    }

    public SyncRemoteTablesRequest setKeepTableNames(java.util.List<String> keepTableNames) {
        this.keepTableNames = keepTableNames;
        return this;
    }
    public java.util.List<String> getKeepTableNames() {
        return this.keepTableNames;
    }

    public SyncRemoteTablesRequest setPullSamples(Boolean pullSamples) {
        this.pullSamples = pullSamples;
        return this;
    }
    public Boolean getPullSamples() {
        return this.pullSamples;
    }

    public SyncRemoteTablesRequest setTableNames(java.util.List<String> tableNames) {
        this.tableNames = tableNames;
        return this;
    }
    public java.util.List<String> getTableNames() {
        return this.tableNames;
    }

    public SyncRemoteTablesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
