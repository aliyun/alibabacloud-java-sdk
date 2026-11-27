// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CancelDataFlowAutoRefreshRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can generate the value on your client and ensure that the value is unique across different requests.</p>
     * <p>The client token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the client token. The RequestId of each API request may be different.</p>
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
     * <p>Specifies whether to perform a dry run on this request.</p>
     * <p>A dry run checks parameter validity and resource availability. It does not actually perform the operation or incur fees.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: performs a dry run without performing the operation. The system checks whether required parameters are specified, whether the request format is valid, and whether business limits are met. If the request fails the dry run, an error is returned. If the request passes the dry run, HTTP status code 200 is returned, but DataFlowId is empty.</li>
     * <li>false (default): sends a regular request. If the request passes the check, the operation is performed.</li>
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
     * <p>cpfs-099394bd928c****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The directory for which you want to cancel the auto-update configuration.</p>
     * <p>Limits:</p>
     * <ul>
     * <li>The value must be 2 to 1,024 characters in length.</li>
     * <li>The value must be encoded in UTF-8.</li>
     * <li>The value must start and end with a forward slash (/).</li>
     * </ul>
     * <blockquote>
     * <p>The directory must already exist in the CPFS file system and must be located in a Fileset for which the data flow feature is enabled.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/prefix1/prefix2/</p>
     */
    @NameInMap("RefreshPath")
    public String refreshPath;

    public static CancelDataFlowAutoRefreshRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelDataFlowAutoRefreshRequest self = new CancelDataFlowAutoRefreshRequest();
        return TeaModel.build(map, self);
    }

    public CancelDataFlowAutoRefreshRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CancelDataFlowAutoRefreshRequest setDataFlowId(String dataFlowId) {
        this.dataFlowId = dataFlowId;
        return this;
    }
    public String getDataFlowId() {
        return this.dataFlowId;
    }

    public CancelDataFlowAutoRefreshRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CancelDataFlowAutoRefreshRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public CancelDataFlowAutoRefreshRequest setRefreshPath(String refreshPath) {
        this.refreshPath = refreshPath;
        return this;
    }
    public String getRefreshPath() {
        return this.refreshPath;
    }

}
