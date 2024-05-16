// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateFolderRequest extends TeaModel {
    /**
     * <p>The ID of the folder. You can call the [ListFolders](https://help.aliyun.com/document_detail/173955.html) operation to query the ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FolderId")
    public String folderId;

    /**
     * <p>The name of the folder.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FolderName")
    public String folderName;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the DataWorks console and go to the Workspace Management page to obtain the ID. You must specify either this parameter or ProjectIdentifier to determine the DataWorks workspace to which the operation is applied.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the DataWorks workspace. You can log on to the DataWorks console and go to the Workspace Settings panel to obtain the name. You must specify either this parameter or ProjectId to determine the DataWorks workspace to which the operation is applied.</p>
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
