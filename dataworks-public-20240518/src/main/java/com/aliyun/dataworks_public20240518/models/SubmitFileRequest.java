// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class SubmitFileRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Submit a task for the first time</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000</p>
     */
    @NameInMap("FileId")
    public Long fileId;

    /**
     * <strong>example:</strong>
     * <p>100001</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <strong>example:</strong>
     * <p>dw_project</p>
     */
    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SkipAllDeployFileExtensions")
    public Boolean skipAllDeployFileExtensions;

    public static SubmitFileRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitFileRequest self = new SubmitFileRequest();
        return TeaModel.build(map, self);
    }

    public SubmitFileRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public SubmitFileRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public SubmitFileRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public SubmitFileRequest setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
        return this;
    }
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

    public SubmitFileRequest setSkipAllDeployFileExtensions(Boolean skipAllDeployFileExtensions) {
        this.skipAllDeployFileExtensions = skipAllDeployFileExtensions;
        return this;
    }
    public Boolean getSkipAllDeployFileExtensions() {
        return this.skipAllDeployFileExtensions;
    }

}
