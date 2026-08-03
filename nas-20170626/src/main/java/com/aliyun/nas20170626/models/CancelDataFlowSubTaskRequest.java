// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CancelDataFlowSubTaskRequest extends TeaModel {
    /**
     * <p>Ensures the idempotency of the request. Generate a unique parameter value from your client to ensure that the value is unique across different requests.</p>
     * <p>ClientToken supports only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotency</a>.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId may differ for each API request.</p>
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
     * <p>The data flow streaming task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>subTaskId-370kyfmyknxcyzw****</p>
     */
    @NameInMap("DataFlowSubTaskId")
    public String dataFlowSubTaskId;

    /**
     * <p>The data flow task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>task-38aa8e890f45****</p>
     */
    @NameInMap("DataFlowTaskId")
    public String dataFlowTaskId;

    /**
     * <p>Specifies whether to perform a dry run for this request.</p>
     * <p>A dry run checks parameter validity and resource availability without actually creating an instance or incurring fees.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: Sends a check request without creating an instance. The check items include whether required parameters are specified, the request format, business limitations, and NAS inventory. If the check fails, the corresponding error is returned. If the check passes, HTTP status code 200 is returned.</li>
     * <li>false (default): Sends a normal request. After the check passes, the instance is directly created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The file system ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bmcpfs-370lx1ev9ss27o0****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    public static CancelDataFlowSubTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelDataFlowSubTaskRequest self = new CancelDataFlowSubTaskRequest();
        return TeaModel.build(map, self);
    }

    public CancelDataFlowSubTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CancelDataFlowSubTaskRequest setDataFlowId(String dataFlowId) {
        this.dataFlowId = dataFlowId;
        return this;
    }
    public String getDataFlowId() {
        return this.dataFlowId;
    }

    public CancelDataFlowSubTaskRequest setDataFlowSubTaskId(String dataFlowSubTaskId) {
        this.dataFlowSubTaskId = dataFlowSubTaskId;
        return this;
    }
    public String getDataFlowSubTaskId() {
        return this.dataFlowSubTaskId;
    }

    public CancelDataFlowSubTaskRequest setDataFlowTaskId(String dataFlowTaskId) {
        this.dataFlowTaskId = dataFlowTaskId;
        return this;
    }
    public String getDataFlowTaskId() {
        return this.dataFlowTaskId;
    }

    public CancelDataFlowSubTaskRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CancelDataFlowSubTaskRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

}
