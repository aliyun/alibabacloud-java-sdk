// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CancelDataFlowAutoRefreshRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
     * <br>
     * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How do I ensure the idempotence?](https://help.aliyun.com/document_detail/25693.html)</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses the request ID as the client token. The value of RequestId may be different for each API request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The dataflow ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DataFlowId")
    public String dataFlowId;

    /**
     * <p>Specifies whether to perform a dry run.</p>
     * <br>
     * <p>During the dry run, the system checks whether the request parameters are valid and whether the requested resources are available. During the dry run, no file system is created and no fee is incurred.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   true: performs a dry run. The system checks the request format, service limits, prerequisites, and whether the required parameters are specified. If the request fails the dry run, an error message is returned. If the request passes the dry run, the HTTP status code 200 is returned. No value is returned for the DataFlowld parameter.</p>
     * <p>*   false (default): performs a dry run and sends the request. If the request passes the dry run, a file system is created.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the file system.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The directory for which you want to cancel AutoRefresh configurations.</p>
     * <br>
     * <p>Limits:</p>
     * <br>
     * <p>*   The directory must be 2 to 1,024 characters in length.</p>
     * <p>*   The directory must be encoded in UTF-8.</p>
     * <p>*   The directory must start and end with a forward slash (/).</p>
     * <br>
     * <p>>  The directory must be an existing directory in the CPFS file system and must be in a fileset where the dataflow is enabled.</p>
     * <br>
     * <p>This parameter is required.</p>
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
