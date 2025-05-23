// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetFolderRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>273****</p>
     */
    @NameInMap("FolderId")
    public String folderId;

    /**
     * <strong>example:</strong>
     * <p>Business_process/my_first_business_process/MaxCompute/ods_layer</p>
     */
    @NameInMap("FolderPath")
    public String folderPath;

    /**
     * <strong>example:</strong>
     * <p>1000011</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
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
