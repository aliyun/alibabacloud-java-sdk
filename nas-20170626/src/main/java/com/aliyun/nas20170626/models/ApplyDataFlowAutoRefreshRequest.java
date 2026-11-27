// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ApplyDataFlowAutoRefreshRequest extends TeaModel {
    /**
     * <p>The auto-refresh interval. At each interval, CPFS checks whether data in the directory is updated. If data updates exist, CPFS starts an auto-refresh task. Unit: minutes.</p>
     * <p>Valid values: 10 to 525600. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("AutoRefreshInterval")
    public Long autoRefreshInterval;

    /**
     * <p>The auto-refresh policy. This policy specifies how data updates in the source are imported into CPFS after the source data is updated. Valid values:</p>
     * <ul>
     * <li>None: Data updates in the source are not automatically imported into CPFS. You can use a data flow task to import data updates from the source.</li>
     * <li>ImportChanged: Data updates in the source are automatically imported into CPFS.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AutoRefreshPolicy")
    public String autoRefreshPolicy;

    /**
     * <p>The auto-refresh configurations.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AutoRefreshs")
    public java.util.List<ApplyDataFlowAutoRefreshRequestAutoRefreshs> autoRefreshs;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can generate a value from your client to ensure that the value is unique among different requests.</p>
     * <p>The ClientToken parameter supports only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId may be different for each API request.</p>
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
     * <p>A dry run checks parameter validity and inventory. It does not actually create an instance or incur fees.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: Sends a check request and does not create an instance. Check items include whether required parameters are specified, the request format, service limits, and NAS inventory. If the check fails, the system returns the corresponding error. If the check succeeds, the system returns HTTP status code 200, but FileSystemId is empty.</li>
     * <li>false (default): Sends a normal request. After the check succeeds, the system creates the instance.</li>
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

    public static ApplyDataFlowAutoRefreshRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyDataFlowAutoRefreshRequest self = new ApplyDataFlowAutoRefreshRequest();
        return TeaModel.build(map, self);
    }

    public ApplyDataFlowAutoRefreshRequest setAutoRefreshInterval(Long autoRefreshInterval) {
        this.autoRefreshInterval = autoRefreshInterval;
        return this;
    }
    public Long getAutoRefreshInterval() {
        return this.autoRefreshInterval;
    }

    public ApplyDataFlowAutoRefreshRequest setAutoRefreshPolicy(String autoRefreshPolicy) {
        this.autoRefreshPolicy = autoRefreshPolicy;
        return this;
    }
    public String getAutoRefreshPolicy() {
        return this.autoRefreshPolicy;
    }

    public ApplyDataFlowAutoRefreshRequest setAutoRefreshs(java.util.List<ApplyDataFlowAutoRefreshRequestAutoRefreshs> autoRefreshs) {
        this.autoRefreshs = autoRefreshs;
        return this;
    }
    public java.util.List<ApplyDataFlowAutoRefreshRequestAutoRefreshs> getAutoRefreshs() {
        return this.autoRefreshs;
    }

    public ApplyDataFlowAutoRefreshRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ApplyDataFlowAutoRefreshRequest setDataFlowId(String dataFlowId) {
        this.dataFlowId = dataFlowId;
        return this;
    }
    public String getDataFlowId() {
        return this.dataFlowId;
    }

    public ApplyDataFlowAutoRefreshRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ApplyDataFlowAutoRefreshRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public static class ApplyDataFlowAutoRefreshRequestAutoRefreshs extends TeaModel {
        /**
         * <p>The auto-refresh directory. CPFS automatically checks only whether source data in this directory is updated and automatically imports the updated data.</p>
         * <p>Limits:</p>
         * <ul>
         * <li>The value must be 2 to 1024 characters in length.</li>
         * <li>The value must be encoded in UTF-8.</li>
         * <li>The value must start and end with a forward slash (/).</li>
         * </ul>
         * <blockquote>
         * <p>The directory must be an existing directory on CPFS and must be located in a Fileset for which data flow is enabled.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/prefix1/prefix2/</p>
         */
        @NameInMap("RefreshPath")
        public String refreshPath;

        public static ApplyDataFlowAutoRefreshRequestAutoRefreshs build(java.util.Map<String, ?> map) throws Exception {
            ApplyDataFlowAutoRefreshRequestAutoRefreshs self = new ApplyDataFlowAutoRefreshRequestAutoRefreshs();
            return TeaModel.build(map, self);
        }

        public ApplyDataFlowAutoRefreshRequestAutoRefreshs setRefreshPath(String refreshPath) {
            this.refreshPath = refreshPath;
            return this;
        }
        public String getRefreshPath() {
            return this.refreshPath;
        }

    }

}
