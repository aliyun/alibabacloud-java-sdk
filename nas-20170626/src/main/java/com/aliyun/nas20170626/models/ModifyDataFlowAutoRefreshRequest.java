// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyDataFlowAutoRefreshRequest extends TeaModel {
    /**
     * <p>The automatic update interval. CPFS checks whether data is updated in the directory at the interval. If data is updated, CPFS runs an AutoRefresh task. Unit: minutes.</p>
     * <p>Valid values: 5 to 526600. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("AutoRefreshInterval")
    public Long autoRefreshInterval;

    /**
     * <p>The automatic update policy. CPFS imports data updates in the Object Storage Service (OSS) bucket to the CPFS file system based on this policy. Valid values:</p>
     * <ul>
     * <li>None: CPFS does not automatically import data updates in the OSS bucket to the CPFS file system. You can import the data updates by using a dataflow task.</li>
     * <li>ImportChanged: CPFS automatically imports data updates in the OSS bucket to the CPFS file system.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AutoRefreshPolicy")
    public String autoRefreshPolicy;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
     * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How do I ensure the idempotence?</a></p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the request ID as the client token. The value of RequestId may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The dataflow ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>df-194433a5be31****</p>
     */
    @NameInMap("DataFlowId")
    public String dataFlowId;

    /**
     * <p>Specifies whether to perform a dry run.</p>
     * <p>During the dry run, the system checks whether the request parameters are valid and whether the requested resources are available. During the dry run, no file system is created and no fee is incurred.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: performs a dry run. The system checks the required parameters, request syntax, limits, and available NAS resources. If the request fails the dry run, an error message is returned. If the request passes the dry run, the HTTP status code 200 is returned. No value is returned for the FileSystemId parameter.</li>
     * <li>false (default): performs a dry run and sends the request. If the request passes the dry run, a file system is created.</li>
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

    public static ModifyDataFlowAutoRefreshRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDataFlowAutoRefreshRequest self = new ModifyDataFlowAutoRefreshRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDataFlowAutoRefreshRequest setAutoRefreshInterval(Long autoRefreshInterval) {
        this.autoRefreshInterval = autoRefreshInterval;
        return this;
    }
    public Long getAutoRefreshInterval() {
        return this.autoRefreshInterval;
    }

    public ModifyDataFlowAutoRefreshRequest setAutoRefreshPolicy(String autoRefreshPolicy) {
        this.autoRefreshPolicy = autoRefreshPolicy;
        return this;
    }
    public String getAutoRefreshPolicy() {
        return this.autoRefreshPolicy;
    }

    public ModifyDataFlowAutoRefreshRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyDataFlowAutoRefreshRequest setDataFlowId(String dataFlowId) {
        this.dataFlowId = dataFlowId;
        return this;
    }
    public String getDataFlowId() {
        return this.dataFlowId;
    }

    public ModifyDataFlowAutoRefreshRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyDataFlowAutoRefreshRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

}
