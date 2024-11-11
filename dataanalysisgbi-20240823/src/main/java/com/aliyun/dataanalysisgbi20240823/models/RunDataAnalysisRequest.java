// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class RunDataAnalysisRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("generateSqlOnly")
    public Boolean generateSqlOnly;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <strong>example:</strong>
     * <p>sessionID</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>STANDARD_MIX</p>
     */
    @NameInMap("specificationType")
    public String specificationType;

    public static RunDataAnalysisRequest build(java.util.Map<String, ?> map) throws Exception {
        RunDataAnalysisRequest self = new RunDataAnalysisRequest();
        return TeaModel.build(map, self);
    }

    public RunDataAnalysisRequest setGenerateSqlOnly(Boolean generateSqlOnly) {
        this.generateSqlOnly = generateSqlOnly;
        return this;
    }
    public Boolean getGenerateSqlOnly() {
        return this.generateSqlOnly;
    }

    public RunDataAnalysisRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public RunDataAnalysisRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public RunDataAnalysisRequest setSpecificationType(String specificationType) {
        this.specificationType = specificationType;
        return this;
    }
    public String getSpecificationType() {
        return this.specificationType;
    }

}
