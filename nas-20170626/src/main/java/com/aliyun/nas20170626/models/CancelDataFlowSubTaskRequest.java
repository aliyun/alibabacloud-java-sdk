// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CancelDataFlowSubTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dfid-194433a5be31****</p>
     */
    @NameInMap("DataFlowId")
    public String dataFlowId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>subTaskId-370kyfmyknxcyzw****</p>
     */
    @NameInMap("DataFlowSubTaskId")
    public String dataFlowSubTaskId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>taskId-12345678</p>
     */
    @NameInMap("DataFlowTaskId")
    public String dataFlowTaskId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
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
