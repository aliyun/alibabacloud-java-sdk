// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class SubmitFileRequest extends TeaModel {
    /**
     * <p>The comment for the submission.</p>
     * 
     * <strong>example:</strong>
     * <p>Submit a task for the first time</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The ID of the file. Obtain this ID by calling the <a href="https://help.aliyun.com/document_detail/173942.html">ListFiles</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000</p>
     */
    @NameInMap("FileId")
    public Long fileId;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the DataWorks Console and go to the Workspace Configurations page to obtain the workspace ID. Specify either this parameter or <code>ProjectIdentifier</code> to identify the DataWorks workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>100001</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the DataWorks workspace. You can log on to the DataWorks Console and go to the Workspace Configurations page to obtain the workspace name. Specify either this parameter or <code>ProjectId</code> to identify the DataWorks workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>dw_project</p>
     */
    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    /**
     * <p>Specifies whether to skip the pre-deployment check after the file is submitted.</p>
     * <ul>
     * <li><p>false: Do not skip. After the file is submitted, the pre-deployment check process is automatically triggered. The file becomes deployable only after it passes the check.</p>
     * </li>
     * <li><p>true: Skip. The pre-deployment check process is not triggered after the file is submitted. You can proceed directly with the deployment process.</p>
     * </li>
     * </ul>
     * 
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
