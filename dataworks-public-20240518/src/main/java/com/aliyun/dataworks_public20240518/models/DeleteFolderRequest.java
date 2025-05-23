// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteFolderRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2eb6f9****</p>
     */
    @NameInMap("FolderId")
    public String folderId;

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

    public static DeleteFolderRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFolderRequest self = new DeleteFolderRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFolderRequest setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

    public DeleteFolderRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public DeleteFolderRequest setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
        return this;
    }
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

}
