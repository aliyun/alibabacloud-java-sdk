// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeployFileRequest extends TeaModel {
    /**
     * <p>The description of the deployment operation.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The ID of the file. You can call the [ListFiles](https://help.aliyun.com/document_detail/173942.html) operation to query the ID.</p>
     * <br>
     * <p>You must configure either the FileId parameter or the NodeId parameter.</p>
     */
    @NameInMap("FileId")
    public Long fileId;

    /**
     * <p>The ID of the node in the scheduling system that corresponds to the file that you want to deploy. You must configure either the NodeId parameter or the FileId parameter.</p>
     */
    @NameInMap("NodeId")
    public Long nodeId;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the DataWorks console and go to the Workspace Management page to obtain the workspace ID. You must configure either this parameter or the ProjectIdentifier parameter to determine the DataWorks workspace to which the operation is applied.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the DataWorks workspace. You can log on to the DataWorks console and go to the Workspace Management page to obtain the workspace name. You must configure either this parameter or the ProjectId parameter to determine the DataWorks workspace to which the operation is applied.</p>
     */
    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    public static DeployFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployFileRequest self = new DeployFileRequest();
        return TeaModel.build(map, self);
    }

    public DeployFileRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public DeployFileRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public DeployFileRequest setNodeId(Long nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public Long getNodeId() {
        return this.nodeId;
    }

    public DeployFileRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public DeployFileRequest setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
        return this;
    }
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

}
