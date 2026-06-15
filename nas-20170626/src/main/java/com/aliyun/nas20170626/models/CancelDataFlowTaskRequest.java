// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CancelDataFlowTaskRequest extends TeaModel {
    /**
     * <p>A client-generated token that you can use to ensure the idempotence of the request. The token must be unique across different requests.</p>
     * <p>The <code>ClientToken</code> value must be an ASCII string of 64 characters or less. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the request ID as the <code>ClientToken</code>. The request ID is unique for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The data flow ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>df-194433a5be31****</p>
     */
    @NameInMap("DataFlowId")
    public String dataFlowId;

    /**
     * <p>Specifies whether to perform a dry run for the request.</p>
     * <p>A dry run checks for parameter validity and resource availability without actually canceling the task or incurring charges.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Performs a dry run. The system checks the request for potential issues, including missing parameters, invalid formats, and service limits. If the check fails, the system returns an error message; otherwise, it returns a success code.</p>
     * </li>
     * <li><p><code>false</code> (default): Sends a normal request. After the request passes the check, the task is canceled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The file system ID.</p>
     * <ul>
     * <li><p>For a general-purpose CPFS instance, the ID must start with <code>cpfs-</code>, for example, <code>cpfs-125487****</code>.</p>
     * </li>
     * <li><p>For a CPFS for AI Computing instance, the ID must start with <code>bmcpfs-</code>, for example, <code>bmcpfs-0015****</code>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cpfs-099394bd928c****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The data flow task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>task-38aa8e890f45****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CancelDataFlowTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelDataFlowTaskRequest self = new CancelDataFlowTaskRequest();
        return TeaModel.build(map, self);
    }

    public CancelDataFlowTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CancelDataFlowTaskRequest setDataFlowId(String dataFlowId) {
        this.dataFlowId = dataFlowId;
        return this;
    }
    public String getDataFlowId() {
        return this.dataFlowId;
    }

    public CancelDataFlowTaskRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CancelDataFlowTaskRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public CancelDataFlowTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
