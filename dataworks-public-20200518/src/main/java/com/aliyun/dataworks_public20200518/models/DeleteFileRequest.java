// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteFileRequest extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileId")
    public Long fileId;

    /**
     * <p>The name of the DataWorks workspace. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Workspace Management page to view the workspace name.</p>
     * <br>
     * <p>You must specify one of the ProjectId and ProjectIdentifier parameters to determine the DataWorks workspace to which the operation is applied.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The ID of the file. You can call the [ListFiles](https://help.aliyun.com/document_detail/173942.html) operation to query the ID of the file.</p>
     */
    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    public static DeleteFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFileRequest self = new DeleteFileRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFileRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public DeleteFileRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public DeleteFileRequest setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
        return this;
    }
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

}
