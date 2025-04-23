// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetDatasetFileMetaResponseBody extends TeaModel {
    /**
     * <p>The queried metadata records of dataset files.</p>
     */
    @NameInMap("DatasetFileMeta")
    public DatasetFileMetaContentGet datasetFileMeta;

    /**
     * <p>The dataset ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d-rbvg5wz****c9ks92</p>
     */
    @NameInMap("DatasetId")
    public String datasetId;

    /**
     * <p>The dataset version.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("DatasetVersion")
    public String datasetVersion;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5A14FA81-DD4E-******-6343FE44B941</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetDatasetFileMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDatasetFileMetaResponseBody self = new GetDatasetFileMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDatasetFileMetaResponseBody setDatasetFileMeta(DatasetFileMetaContentGet datasetFileMeta) {
        this.datasetFileMeta = datasetFileMeta;
        return this;
    }
    public DatasetFileMetaContentGet getDatasetFileMeta() {
        return this.datasetFileMeta;
    }

    public GetDatasetFileMetaResponseBody setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public GetDatasetFileMetaResponseBody setDatasetVersion(String datasetVersion) {
        this.datasetVersion = datasetVersion;
        return this;
    }
    public String getDatasetVersion() {
        return this.datasetVersion;
    }

    public GetDatasetFileMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDatasetFileMetaResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
