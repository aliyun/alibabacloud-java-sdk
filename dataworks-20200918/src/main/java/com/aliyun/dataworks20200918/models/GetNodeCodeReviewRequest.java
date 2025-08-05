// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetNodeCodeReviewRequest extends TeaModel {
    @NameInMap("FileId")
    public Long fileId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileVersion")
    public Integer fileVersion;

    @NameInMap("NodeId")
    public Long nodeId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    public static GetNodeCodeReviewRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNodeCodeReviewRequest self = new GetNodeCodeReviewRequest();
        return TeaModel.build(map, self);
    }

    public GetNodeCodeReviewRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public GetNodeCodeReviewRequest setFileVersion(Integer fileVersion) {
        this.fileVersion = fileVersion;
        return this;
    }
    public Integer getFileVersion() {
        return this.fileVersion;
    }

    public GetNodeCodeReviewRequest setNodeId(Long nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public Long getNodeId() {
        return this.nodeId;
    }

    public GetNodeCodeReviewRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetNodeCodeReviewRequest setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
        return this;
    }
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

}
