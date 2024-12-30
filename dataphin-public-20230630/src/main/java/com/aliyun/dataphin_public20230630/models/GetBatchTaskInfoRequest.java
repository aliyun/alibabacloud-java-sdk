// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetBatchTaskInfoRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dev</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12113111</p>
     */
    @NameInMap("FileId")
    public Long fileId;

    @NameInMap("IncludeAllUpStreams")
    public Boolean includeAllUpStreams;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>131211211</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static GetBatchTaskInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBatchTaskInfoRequest self = new GetBatchTaskInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetBatchTaskInfoRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public GetBatchTaskInfoRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public GetBatchTaskInfoRequest setIncludeAllUpStreams(Boolean includeAllUpStreams) {
        this.includeAllUpStreams = includeAllUpStreams;
        return this;
    }
    public Boolean getIncludeAllUpStreams() {
        return this.includeAllUpStreams;
    }

    public GetBatchTaskInfoRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetBatchTaskInfoRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
