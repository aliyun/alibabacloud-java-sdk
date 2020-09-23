// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetFolderRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    @NameInMap("FolderId")
    public String folderId;

    @NameInMap("FolderPath")
    public String folderPath;

    public static GetFolderRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFolderRequest self = new GetFolderRequest();
        return TeaModel.build(map, self);
    }

    public GetFolderRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetFolderRequest setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
        return this;
    }
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

    public GetFolderRequest setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

    public GetFolderRequest setFolderPath(String folderPath) {
        this.folderPath = folderPath;
        return this;
    }
    public String getFolderPath() {
        return this.folderPath;
    }

}
