// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetFileRequest extends TeaModel {
    @NameInMap("FileId")
    public Long fileId;

    @NameInMap("NodeId")
    public Long nodeId;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    public static GetFileRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFileRequest self = new GetFileRequest();
        return TeaModel.build(map, self);
    }

    public GetFileRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public GetFileRequest setNodeId(Long nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public Long getNodeId() {
        return this.nodeId;
    }

    public GetFileRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetFileRequest setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
        return this;
    }
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

}
