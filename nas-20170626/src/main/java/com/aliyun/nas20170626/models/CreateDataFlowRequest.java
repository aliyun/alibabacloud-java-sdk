// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateDataFlowRequest extends TeaModel {
    /**
     * <p>The automatic update interval. CPFS checks whether data is updated in the directory at the interval specified by this parameter. If data is updated, CPFS starts an automatic update task. Unit: minutes.</p>
     * <p>Valid values: 10 to 525600. Default value: 10.</p>
     * <blockquote>
     * <p> This parameter takes effect only for CPFS file systems.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("AutoRefreshInterval")
    public Long autoRefreshInterval;

    /**
     * <p>The automatic update policy. The updated data in the source storage is imported into the CPFS file system based on the policy.</p>
     * <ul>
     * <li>None (default): Updated data in the source storage is not automatically imported into the CPFS file system. You can run a data flow task to import the updated data from the source storage.</li>
     * <li>ImportChanged: Updated data in the source storage is automatically imported into the CPFS file system.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter takes effect only for CPFS file systems.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AutoRefreshPolicy")
    public String autoRefreshPolicy;

    /**
     * <p>The automatic update configurations.</p>
     * <blockquote>
     * <p> This parameter takes effect only for CPFS file systems.</p>
     * </blockquote>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRefreshs")
    public java.util.List<CreateDataFlowRequestAutoRefreshs> autoRefreshs;

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
     * <p>The description of the dataflow.</p>
     * <p>Limits:</p>
     * <ul>
     * <li>The description must be 2 to 128 characters in length.</li>
     * <li>The description must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</li>
     * <li>The description can contain letters, digits, colons (:), underscores (_), and hyphens (-).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Bucket01 DataFlow</p>
     */
    @NameInMap("Description")
    public String description;

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
     * <ul>
     * <li>The IDs of CPFS file systems must start with <code>cpfs-</code>. Example: cpfs-125487\<em>\</em>\<em>\</em>.</li>
     * <li>The IDs of CPFS for Lingjun file systems must start with <code>bmcpfs-</code>. Example: bmcpfs-0015\<em>\</em>\<em>\</em>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cpfs-099394bd928c****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The directory in the CPFS for LINGJUN file system. Limits:</p>
     * <ul>
     * <li>The directory must start and end with a forward slash (/).</li>
     * <li>The directory must be an existing directory in the CPFS for LINGJUN file system.</li>
     * <li>The directory must be 1 to 1023 characters in length.</li>
     * <li>The directory must be encoded in UTF-8.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is required for CPFS for LINGJUN file systems.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/path/</p>
     */
    @NameInMap("FileSystemPath")
    public String fileSystemPath;

    /**
     * <p>The fileset ID.</p>
     * <blockquote>
     * <p> This parameter is required for CPFS file systems.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>fset-1902718ea0ae****</p>
     */
    @NameInMap("FsetId")
    public String fsetId;

    /**
     * <p>The type of security mechanism for the source storage. This parameter must be specified if the source storage is accessed with a security mechanism. Valid values:</p>
     * <ul>
     * <li>None (default): The source storage can be accessed without a security mechanism.</li>
     * <li>SSL: The source storage must be accessed with an SSL certificate.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SSL</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("SourceSecurityType")
    public String sourceSecurityType;

    /**
     * <p>The access path of the source storage. Format: <code>&lt;storage type&gt;://[&lt;account id&gt;:]&lt;path&gt;</code>.</p>
     * <p>Parameters:</p>
     * <ul>
     * <li><p>storage type: Only OSS is supported.</p>
     * </li>
     * <li><p>account id (optional): the UID of the account of the source storage. This parameter is required when you use OSS buckets across accounts.</p>
     * </li>
     * <li><p>path: the name of the OSS bucket. Limits:</p>
     * <ul>
     * <li>The name can contain only lowercase letters, digits, and hyphens (-). The name must start and end with a lowercase letter or digit.</li>
     * <li>The name can be up to 128 characters in length.</li>
     * <li>The name must be encoded in UTF-8.</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>The OSS bucket must be an existing bucket in the region.</li>
     * <li>Only CPFS for LINGJUN V2.6.0 and later support the account id parameter.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://bucket1</p>
     */
    @NameInMap("SourceStorage")
    public String sourceStorage;

    /**
     * <p>The access path in the bucket of the source storage. Limits:</p>
     * <ul>
     * <li>The path must start and end with a forward slash (/).</li>
     * <li>The path is case-sensitive.</li>
     * <li>The path must be 1 to 1023 characters in length.</li>
     * <li>The path must be encoded in UTF-8.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is required for CPFS for LINGJUN file systems.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/prefix/</p>
     */
    @NameInMap("SourceStoragePath")
    public String sourceStoragePath;

    /**
     * <p>The maximum data flow throughput. Unit: MB/s. Valid values:</p>
     * <ul>
     * <li>600</li>
     * <li>1200</li>
     * <li>1500</li>
     * </ul>
     * <blockquote>
     * <p> The data flow throughput must be less than the I/O throughput of the file system. This parameter is required for CPFS file systems.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>600</p>
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
         * <p>This parameter is empty by default. Updated data in the source storage is not automatically imported into the CPFS file system. You must import the updated data by running a manual task.</p>
         * <p>Limits:</p>
         * <ul>
         * <li>The directory must be 2 to 1,024 characters in length.</li>
         * <li>The directory must be encoded in UTF-8.</li>
         * <li>The directory must start and end with a forward slash (/).</li>
         * <li>The directory must be an existing directory in the CPFS file system and must be in a fileset where the data flow is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>/prefix1/prefix2/</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
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
