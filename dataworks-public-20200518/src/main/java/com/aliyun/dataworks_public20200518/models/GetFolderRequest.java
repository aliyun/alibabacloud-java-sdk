// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetFolderRequest extends TeaModel {
    /**
     * <p>The ID of the folder. You must set either this parameter or FolderPath. You can call the <a href="https://help.aliyun.com/document_detail/173955.html">ListFolders</a> operation to obtain the folder ID.</p>
     * 
     * <strong>example:</strong>
     * <p>273****</p>
     */
    @NameInMap("FolderId")
    public String folderId;

    /**
     * <p>The path of the folder. You must set either this parameter or FolderId. You can call the <a href="https://help.aliyun.com/document_detail/173955.html">ListFolders</a> operation to obtain the folder path.</p>
     * 
     * <strong>example:</strong>
     * <p>Business_process/my_first_business_process/MaxCompute/ods_layer</p>
     */
    @NameInMap("FolderPath")
    public String folderPath;

    /**
     * <p>The ID of the DataWorks workspace. Log on to the DataWorks console and go to the Workspace Management page to obtain the workspace ID. You must set either this parameter or ProjectIdentifier to specify the DataWorks workspace for the API call.</p>
     * 
     * <strong>example:</strong>
     * <p>1000011</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the DataWorks workspace. Log on to the DataWorks console and go to the Workspace Management page to obtain the workspace name. You must set either this parameter or ProjectId to specify the DataWorks workspace for the API call.</p>
     * 
     * <strong>example:</strong>
     * <p>dw_project</p>
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
