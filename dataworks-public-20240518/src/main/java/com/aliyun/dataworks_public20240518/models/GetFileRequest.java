// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetFileRequest extends TeaModel {
    /**
     * <p>The ID of the file. You can invoke the <a href="https://help.aliyun.com/document_detail/173942.html">ListFiles</a> API to query the ID of the corresponding file.</p>
     * 
     * <strong>example:</strong>
     * <p>100000001</p>
     */
    @NameInMap("FileId")
    public Long fileId;

    /**
     * <p>The ID of the scheduling node. You can invoke the <a href="https://help.aliyun.com/document_detail/173942.html">ListFiles</a> API to obtain the node ID.</p>
     * 
     * <strong>example:</strong>
     * <p>200000001</p>
     */
    @NameInMap("NodeId")
    public Long nodeId;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>, and go to the workspace configuration page to obtain the workspace ID.</p>
     * <p>You must specify either this parameter or the ProjectIdentifier parameter to identify the DataWorks workspace for this API call.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>, and go to the workspace configuration page to obtain the workspace name.</p>
     * <p>You must specify either this parameter or the ProjectId parameter to identify the DataWorks workspace for this API call.</p>
     * 
     * <strong>example:</strong>
     * <p>dw_project</p>
     */
    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    public static GetFileRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFileRequest self = new GetFileRequest();
        return TeaModel.build(map, self);
    }

    public GetFileRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public GetFileRequest setNodeId(Long nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public Long getNodeId() {
        return this.nodeId;
    }

    public GetFileRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetFileRequest setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
        return this;
    }
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

}
