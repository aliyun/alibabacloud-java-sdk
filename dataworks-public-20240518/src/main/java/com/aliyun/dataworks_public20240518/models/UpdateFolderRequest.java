// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateFolderRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2735c2c19d58</p>
     */
    @NameInMap("FolderId")
    public String folderId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySecondFolder</p>
     */
    @NameInMap("FolderName")
    public String folderName;

    /**
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <strong>example:</strong>
     * <p>dw_project</p>
     */
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
