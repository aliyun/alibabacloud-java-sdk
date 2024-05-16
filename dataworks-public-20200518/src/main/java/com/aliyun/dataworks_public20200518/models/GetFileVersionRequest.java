// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetFileVersionRequest extends TeaModel {
    /**
     * <p>The ID of the file. You can call the [ListFiles](https://help.aliyun.com/document_detail/173942.html) operation to query the ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileId")
    public Long fileId;

    /**
     * <p>The file version whose details you want to query.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileVersion")
    public Integer fileVersion;

    /**
     * <p>The ID of the DataWorks workspace. You can click the Workspace Manage icon in the upper-right corner of the DataStudio page to go to the Workspace Management page and view the workspace ID.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The unique identifier of the DataWorks workspace. You can click the identifier in the upper-left corner of the DataStudio page to switch to another workspace.</p>
     * <br>
     * <p>You must specify either this parameter or ProjectId to determine the DataWorks workspace to which the operation is applied.</p>
     */
    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    public static GetFileVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFileVersionRequest self = new GetFileVersionRequest();
        return TeaModel.build(map, self);
    }

    public GetFileVersionRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public GetFileVersionRequest setFileVersion(Integer fileVersion) {
        this.fileVersion = fileVersion;
        return this;
    }
    public Integer getFileVersion() {
        return this.fileVersion;
    }

    public GetFileVersionRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetFileVersionRequest setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
        return this;
    }
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

}
