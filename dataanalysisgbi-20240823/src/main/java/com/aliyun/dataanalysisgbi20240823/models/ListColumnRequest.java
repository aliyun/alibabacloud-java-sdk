// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class ListColumnRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>e8Z0nRyY51ZQmYljqGNK</p>
     */
    @NameInMap("nextToken")
    public Integer nextToken;

    /**
     * <p>This parameter is required.</p>
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

    public static ListColumnRequest build(java.util.Map<String, ?> map) throws Exception {
        ListColumnRequest self = new ListColumnRequest();
        return TeaModel.build(map, self);
    }

    public ListColumnRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListColumnRequest setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListColumnRequest setTableIdKey(String tableIdKey) {
        this.tableIdKey = tableIdKey;
        return this;
    }
    public String getTableIdKey() {
        return this.tableIdKey;
    }

    public ListColumnRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
