// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ApplyDataFlowAutoRefreshRequest extends TeaModel {
    /**
     * <p>The automatic update interval. CPFS checks whether data is updated in the directory at the interval specified by this parameter. If data is updated, CPFS starts an automatic update task. Unit: minutes.</p>
     * <br>
     * <p>Valid values: 5 to 526600. Default value: 10.</p>
     */
    @NameInMap("AutoRefreshInterval")
    public Long autoRefreshInterval;

    /**
     * <p>The automatic update policy. The updated data in the source storage is imported into the CPFS file system based on the policy. Valid values:</p>
     * <br>
     * <p>*   None (default): Updated data in the source storage is not automatically imported into the CPFS file system. You can run a dataflow task to import the updated data from the source storage.</p>
     * <p>*   ImportChanged: Updated data in the source storage is automatically imported into the CPFS file system.</p>
     */
    @NameInMap("AutoRefreshPolicy")
    public String autoRefreshPolicy;

    /**
     * <p>The automatic update configurations.</p>
     */
    @NameInMap("AutoRefreshs")
    public java.util.List<ApplyDataFlowAutoRefreshRequestAutoRefreshs> autoRefreshs;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
     * <br>
     * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How do I ensure the idempotence?](~~25693~~)</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses the request ID as the client token. The value of RequestId may be different for each API request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The dataflow ID.</p>
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
     * <p>*   true: performs a dry run. The system checks the required parameters, request syntax, limits, and available NAS resources. If the request fails the dry run, an error message is returned. If the request passes the dry run, the HTTP status code 200 is returned. No value is returned for the FileSystemId parameter.</p>
     * <p>*   false (default): performs a dry run and sends the request. If the request passes the dry run, a file system is created.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the file system.</p>
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
         * <p>The automatic update directory. CPFS automatically checks whether the source data only in the directory is updated and imports the updated data.</p>
         * <br>
         * <p>Limits:</p>
         * <br>
         * <p>*   The directory must be 2 to 1,024 characters in length.</p>
         * <p>*   The directory must be encoded in UTF-8.</p>
         * <p>*   The directory must start and end with a forward slash (/).</p>
         * <br>
         * <p>>  The directory must be an existing directory in the CPFS file system and must be in a fileset where the dataflow is enabled.</p>
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
