// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class RunDataAnalysisRequest extends TeaModel {
    @NameInMap("dataRole")
    public java.util.List<String> dataRole;

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

    @NameInMap("userParams")
    public Object userParams;

    public static RunDataAnalysisRequest build(java.util.Map<String, ?> map) throws Exception {
        RunDataAnalysisRequest self = new RunDataAnalysisRequest();
        return TeaModel.build(map, self);
    }

    public RunDataAnalysisRequest setDataRole(java.util.List<String> dataRole) {
        this.dataRole = dataRole;
        return this;
    }
    public java.util.List<String> getDataRole() {
        return this.dataRole;
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

    public RunDataAnalysisRequest setUserParams(Object userParams) {
        this.userParams = userParams;
        return this;
    }
    public Object getUserParams() {
        return this.userParams;
    }

}
