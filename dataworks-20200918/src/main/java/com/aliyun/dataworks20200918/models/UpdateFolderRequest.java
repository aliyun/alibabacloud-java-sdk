// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class UpdateFolderRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FolderId")
    public String folderId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FolderName")
    public String folderName;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    public static UpdateFolderRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFolderRequest self = new UpdateFolderRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFolderRequest setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

    public UpdateFolderRequest setFolderName(String folderName) {
        this.folderName = folderName;
        return this;
    }
    public String getFolderName() {
        return this.folderName;
    }

    public UpdateFolderRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateFolderRequest setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
        return this;
    }
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

}
