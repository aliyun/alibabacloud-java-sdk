// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyDataFlowAutoRefreshRequest extends TeaModel {
    /**
     * <p>The automatic update interval. CPFS checks whether data is updated in the directory at the interval specified by this parameter. If data is updated, CPFS starts an automatic update task. Unit: minute.</p>
     * <p>Valid values: 5 to 526600. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("AutoRefreshInterval")
    public Long autoRefreshInterval;

    /**
     * <p>The automatic update policy. The updated data in the source storage is imported into the CPFS file system based on the policy. The following information is displayed:</p>
     * <ul>
     * <li>None: Updated data in the source storage is not automatically imported into the CPFS file system. You can run a dataflow task to import the updated data from the source storage.</li>
     * <li>ImportChanged: Updated data in the source storage is automatically imported into the CPFS file system.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AutoRefreshPolicy")
    public String autoRefreshPolicy;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
     * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
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
     * <p>The ID of the dataflow.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>df-194433a5be31****</p>
     */
    @NameInMap("DataFlowId")
    public String dataFlowId;

    /**
     * <p>Specifies whether to perform a dry run.</p>
     * <p>During the dry run, the system checks whether the request parameters are valid and whether the requested resources are available. During the dry run, no fileset quota is canceled and no fee is incurred.</p>
     * <p>Valid value:</p>
     * <ul>
     * <li>true: performs a dry run. The system checks the required parameters, request syntax, service limits, and available Apsara File Storage NAS (NAS) resources. Otherwise, an error message is returned. If the request passes the dry run, the HTTP status code 200 is returned. No value is returned for the FileSystemId parameter.</li>
     * <li>false (default): performs a dry run and sends the request. If the request passes the dry run, a fileset is created.</li>
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
