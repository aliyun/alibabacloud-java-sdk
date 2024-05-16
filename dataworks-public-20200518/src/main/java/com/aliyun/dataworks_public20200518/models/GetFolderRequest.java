// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetFolderRequest extends TeaModel {
    /**
     * <p>The ID of the folder. You can call the [ListFolders](https://help.aliyun.com/document_detail/173955.html) operation to query the ID.</p>
     * <br>
     * <p>You must specify either this parameter or the FolderPath parameter.</p>
     */
    @NameInMap("FolderId")
    public String folderId;

    /**
     * <p>The path of the folder. You can call the [ListFolders](https://help.aliyun.com/document_detail/173955.html) operation to query the path.</p>
     * <br>
     * <p>You must specify either this parameter or the FolderId parameter.</p>
     */
    @NameInMap("FolderPath")
    public String folderPath;

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

    public static GetFolderRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFolderRequest self = new GetFolderRequest();
        return TeaModel.build(map, self);
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

}
