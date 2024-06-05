// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateDataFlowRequest extends TeaModel {
    /**
     * <p>The automatic update interval. CPFS checks whether data is updated in the directory at the interval specified by this parameter. If data is updated, CPFS starts an automatic update task. Unit: minutes.</p>
     * <br>
     * <p>Valid values: 5 to 525600. Default value: 10.</p>
     */
    @NameInMap("AutoRefreshInterval")
    public Long autoRefreshInterval;

    /**
     * <p>The automatic update policy. The updated data in the source storage is imported into the CPFS file system based on the policy.</p>
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
    public java.util.List<CreateDataFlowRequestAutoRefreshs> autoRefreshs;

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
     * <p>The description of the dataflow.</p>
     * <br>
     * <p>Limits:</p>
     * <br>
     * <p>*   The description must be 2 to 128 characters in length.</p>
     * <p>*   The description must start with a letter but cannot start with `http://` or `https://`.</p>
     * <p>*   The description can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
     */
    @NameInMap("Description")
    public String description;

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
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    @NameInMap("FileSystemPath")
    public String fileSystemPath;

    /**
     * <p>The fileset ID.</p>
     */
    @NameInMap("FsetId")
    public String fsetId;

    /**
     * <p>The type of security mechanism for the source storage. This parameter must be specified if the source storage is accessed with a security mechanism. Valid values:</p>
     * <br>
     * <p>*   None (default): The source storage can be accessed without a security mechanism.</p>
     * <p>*   SSL: The source storage must be accessed with an SSL certificate.</p>
     */
    @NameInMap("SourceSecurityType")
    public String sourceSecurityType;

    /**
     * <p>The access path of the source storage. Format: `<storage type>://<path>`.</p>
     * <br>
     * <p>Parameters:</p>
     * <br>
     * <p>*   storage type: Only OSS is supported.</p>
     * <br>
     * <p>*   path: the name of the OSS bucket. Limits:</p>
     * <br>
     * <p>    *   The name can contain only lowercase letters, digits, and hyphens (-). The name must start and end with a lowercase letter or digit.</p>
     * <p>    *   The name must be 8 to 128 characters in length.</p>
     * <p>    *   The name must be encoded in UTF-8.</p>
     * <p>    *   The name cannot start with `http://` or `https://`.</p>
     * <br>
     * <p>>  The OSS bucket must be an existing bucket in the region.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceStorage")
    public String sourceStorage;

    @NameInMap("SourceStoragePath")
    public String sourceStoragePath;

    /**
     * <p>The maximum dataflow throughput. Unit: MB/s. Valid values:</p>
     * <br>
     * <p>*   600</p>
     * <p>*   1,200</p>
     * <p>*   1,500</p>
     * <br>
     * <p>>  The dataflow throughput must be less than the I/O throughput of the file system</p>
     */
    @NameInMap("Throughput")
    public Long throughput;

    public static CreateDataFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataFlowRequest self = new CreateDataFlowRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataFlowRequest setAutoRefreshInterval(Long autoRefreshInterval) {
        this.autoRefreshInterval = autoRefreshInterval;
        return this;
    }
    public Long getAutoRefreshInterval() {
        return this.autoRefreshInterval;
    }

    public CreateDataFlowRequest setAutoRefreshPolicy(String autoRefreshPolicy) {
        this.autoRefreshPolicy = autoRefreshPolicy;
        return this;
    }
    public String getAutoRefreshPolicy() {
        return this.autoRefreshPolicy;
    }

    public CreateDataFlowRequest setAutoRefreshs(java.util.List<CreateDataFlowRequestAutoRefreshs> autoRefreshs) {
        this.autoRefreshs = autoRefreshs;
        return this;
    }
    public java.util.List<CreateDataFlowRequestAutoRefreshs> getAutoRefreshs() {
        return this.autoRefreshs;
    }

    public CreateDataFlowRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDataFlowRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDataFlowRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateDataFlowRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public CreateDataFlowRequest setFileSystemPath(String fileSystemPath) {
        this.fileSystemPath = fileSystemPath;
        return this;
    }
    public String getFileSystemPath() {
        return this.fileSystemPath;
    }

    public CreateDataFlowRequest setFsetId(String fsetId) {
        this.fsetId = fsetId;
        return this;
    }
    public String getFsetId() {
        return this.fsetId;
    }

    public CreateDataFlowRequest setSourceSecurityType(String sourceSecurityType) {
        this.sourceSecurityType = sourceSecurityType;
        return this;
    }
    public String getSourceSecurityType() {
        return this.sourceSecurityType;
    }

    public CreateDataFlowRequest setSourceStorage(String sourceStorage) {
        this.sourceStorage = sourceStorage;
        return this;
    }
    public String getSourceStorage() {
        return this.sourceStorage;
    }

    public CreateDataFlowRequest setSourceStoragePath(String sourceStoragePath) {
        this.sourceStoragePath = sourceStoragePath;
        return this;
    }
    public String getSourceStoragePath() {
        return this.sourceStoragePath;
    }

    public CreateDataFlowRequest setThroughput(Long throughput) {
        this.throughput = throughput;
        return this;
    }
    public Long getThroughput() {
        return this.throughput;
    }

    public static class CreateDataFlowRequestAutoRefreshs extends TeaModel {
        /**
         * <p>The automatic update directory. CPFS registers the data update event in the source storage, and automatically checks whether the source data in the directory is updated and imports the updated data.</p>
         * <br>
         * <p>This parameter is empty by default. Updated data in the source storage is not automatically imported into the CPFS file system. You must import the updated data by running a manual task.</p>
         * <br>
         * <p>Limits:</p>
         * <br>
         * <p>*   The directory must be 2 to 1,024 characters in length.</p>
         * <p>*   The directory must be encoded in UTF-8.</p>
         * <p>*   The directory must start and end with a forward slash (/).</p>
         * <p>*   The directory must be an existing directory in the CPFS file system and must be in a fileset where the dataflow is enabled.</p>
         */
        @NameInMap("RefreshPath")
        public String refreshPath;

        public static CreateDataFlowRequestAutoRefreshs build(java.util.Map<String, ?> map) throws Exception {
            CreateDataFlowRequestAutoRefreshs self = new CreateDataFlowRequestAutoRefreshs();
            return TeaModel.build(map, self);
        }

        public CreateDataFlowRequestAutoRefreshs setRefreshPath(String refreshPath) {
            this.refreshPath = refreshPath;
            return this;
        }
        public String getRefreshPath() {
            return this.refreshPath;
        }

    }

}
