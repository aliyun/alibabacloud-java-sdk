// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class RunDataResultAnalysisRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("analysisMode")
    public String analysisMode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FF76AD3F-8B32-567E-819B-0D3738917006</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("sqlData")
    public RunDataResultAnalysisRequestSqlData sqlData;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-2v3934xtp49esw64</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static RunDataResultAnalysisRequest build(java.util.Map<String, ?> map) throws Exception {
        RunDataResultAnalysisRequest self = new RunDataResultAnalysisRequest();
        return TeaModel.build(map, self);
    }

    public RunDataResultAnalysisRequest setAnalysisMode(String analysisMode) {
        this.analysisMode = analysisMode;
        return this;
    }
    public String getAnalysisMode() {
        return this.analysisMode;
    }

    public RunDataResultAnalysisRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunDataResultAnalysisRequest setSqlData(RunDataResultAnalysisRequestSqlData sqlData) {
        this.sqlData = sqlData;
        return this;
    }
    public RunDataResultAnalysisRequestSqlData getSqlData() {
        return this.sqlData;
    }

    public RunDataResultAnalysisRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class RunDataResultAnalysisRequestSqlData extends TeaModel {
        @NameInMap("column")
        public java.util.List<String> column;

        @NameInMap("data")
        public java.util.List<java.util.Map<String, String>> data;

        public static RunDataResultAnalysisRequestSqlData build(java.util.Map<String, ?> map) throws Exception {
            RunDataResultAnalysisRequestSqlData self = new RunDataResultAnalysisRequestSqlData();
            return TeaModel.build(map, self);
        }

        public RunDataResultAnalysisRequestSqlData setColumn(java.util.List<String> column) {
            this.column = column;
            return this;
        }
        public java.util.List<String> getColumn() {
            return this.column;
        }

        public RunDataResultAnalysisRequestSqlData setData(java.util.List<java.util.Map<String, String>> data) {
            this.data = data;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getData() {
            return this.data;
        }

    }

}
