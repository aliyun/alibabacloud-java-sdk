// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class RunSqlGenerationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <strong>example:</strong>
     * <p>d5eced84-fd25-43ee-a245-adb4e4a8c3be</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>STANDARD_MIX</p>
     */
    @NameInMap("specificationType")
    public String specificationType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-2v3934xtp49esw64</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static RunSqlGenerationRequest build(java.util.Map<String, ?> map) throws Exception {
        RunSqlGenerationRequest self = new RunSqlGenerationRequest();
        return TeaModel.build(map, self);
    }

    public RunSqlGenerationRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public RunSqlGenerationRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public RunSqlGenerationRequest setSpecificationType(String specificationType) {
        this.specificationType = specificationType;
        return this;
    }
    public String getSpecificationType() {
        return this.specificationType;
    }

    public RunSqlGenerationRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
