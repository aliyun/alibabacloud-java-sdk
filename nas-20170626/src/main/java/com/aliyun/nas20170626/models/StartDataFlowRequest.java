// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class StartDataFlowRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can generate a parameter value from your client to ensure that this parameter value is unique across different requests.</p>
     * <p>The ClientToken parameter supports only ASCII characters and cannot exceed 64 characters. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId of each API request may be different.</p>
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
     * <p>Specifies whether to perform a dry run on this creation request.</p>
     * <p>The dry run checks the validity of parameters and the resource inventory. It does not actually create an instance or incur fees.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: Sends a check request and does not create an instance. The check items include whether the required parameters are specified, the request format, service limits, and NAS resource inventory. If the check fails, the corresponding error is returned. If the check succeeds, HTTP status code 200 is returned, but the FileSystemId is empty.</li>
     * <li>false (default): Sends a normal request. After the check succeeds, the instance is directly created.</li>
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
     * <p>cpfs-099394bd928c****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    public static StartDataFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDataFlowRequest self = new StartDataFlowRequest();
        return TeaModel.build(map, self);
    }

    public StartDataFlowRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public StartDataFlowRequest setDataFlowId(String dataFlowId) {
        this.dataFlowId = dataFlowId;
        return this;
    }
    public String getDataFlowId() {
        return this.dataFlowId;
    }

    public StartDataFlowRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public StartDataFlowRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

}
