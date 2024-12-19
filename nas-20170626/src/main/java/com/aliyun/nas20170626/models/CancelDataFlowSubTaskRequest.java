// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CancelDataFlowSubTaskRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
     * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How do I ensure the idempotence?</a></p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the data flow.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>df-194433a5be31****</p>
     */
    @NameInMap("DataFlowId")
    public String dataFlowId;

    /**
     * <p>The ID of the data streaming task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>subTaskId-370kyfmyknxcyzw****</p>
     */
    @NameInMap("DataFlowSubTaskId")
    public String dataFlowSubTaskId;

    /**
     * <p>The ID of the data flow task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>task-38aa8e890f45****</p>
     */
    @NameInMap("DataFlowTaskId")
    public String dataFlowTaskId;

    /**
     * <p>Specifies whether to perform a dry run.</p>
     * <p>During the dry run, the system checks whether the request parameters are valid and whether the requested resources are available. During the dry run, no data streaming task is created and no fee is incurred.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: performs a dry run. The system checks the required parameters, request syntax, service limits, and available File Storage NAS (NAS) resources. If the request fails the dry run, an error message is returned. If the request passes the dry run, the HTTP status code 200 is returned.</li>
     * <li>false (default): performs a dry run and sends the request. If the request passes the dry run, a data streaming task is created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the file system.</p>
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
