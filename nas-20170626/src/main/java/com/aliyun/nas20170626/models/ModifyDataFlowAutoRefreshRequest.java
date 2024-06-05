// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyDataFlowAutoRefreshRequest extends TeaModel {
    @NameInMap("AutoRefreshInterval")
    public Long autoRefreshInterval;

    @NameInMap("AutoRefreshPolicy")
    public String autoRefreshPolicy;

    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DataFlowId")
    public String dataFlowId;

    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>This parameter is required.</p>
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
