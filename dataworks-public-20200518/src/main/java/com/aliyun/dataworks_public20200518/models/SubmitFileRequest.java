// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class SubmitFileRequest extends TeaModel {
    /**
     * <p>The description of the commit operation.</p>
     * 
     * <strong>example:</strong>
     * <p>Submit a task for the first time</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The file ID. You can call the <a href="https://help.aliyun.com/document_detail/173942.html">ListFiles</a> operation to query the file ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000</p>
     */
    @NameInMap("FileId")
    public Long fileId;

    /**
     * <p>The DataWorks workspace ID. You can log on to the DataWorks console and go to the Workspace page to query the ID. You must configure either this parameter or the ProjectIdentifier parameter to determine the DataWorks workspace to which the operation is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the DataWorks workspace. You can log on to the DataWorks console and go to the Workspace page to obtain the workspace name. You must configure either this parameter or the ProjectId parameter to determine the DataWorks workspace to which the operation is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>dw_project</p>
     */
    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    /**
     * <p>Specifies whether to skip the pre-publish check after the file is committed. Valid values:</p>
     * <ul>
     * <li>false: indicates that the pre-publish check is not skipped. After the file is committed, the pre-publish check is automatically triggered. The file can be deployed only after the file passes the check.</li>
     * <li>true: indicates that the pre-publish check is skipped. After the file is submitted, the pre-publish check process is not triggered. You can directly deploy the file.</li>
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
