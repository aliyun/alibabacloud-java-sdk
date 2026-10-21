// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateDataFlowRequest extends TeaModel {
    /**
     * <p>The auto-refresh interval. General-purpose CPFS checks whether data updates exist in the directory at this interval. If data updates exist, an auto-refresh task is started. Unit: minutes.</p>
     * <p>Valid values: 10 to 525600. Default value: 10.</p>
     * <blockquote>
     * <p>This parameter takes effect only when the file system type is General-purpose CPFS.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("AutoRefreshInterval")
    public Long autoRefreshInterval;

    /**
     * <p>The auto-refresh policy. This policy determines how data updates from the source storage are imported to General-purpose CPFS.</p>
     * <ul>
     * <li>None: Data updates from the source storage are not automatically imported to General-purpose CPFS. You can use a data flow task to import the updates. This is the default value.</li>
     * <li>ImportChanged: Data updates from the source storage are automatically imported to General-purpose CPFS.<blockquote>
     * <p>This parameter takes effect only when the file system type is General-purpose CPFS.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AutoRefreshPolicy")
    public String autoRefreshPolicy;

    /**
     * <p>The auto-refresh configurations.</p>
     * <blockquote>
     * <p>This parameter takes effect only when the file system type is General-purpose CPFS.</p>
     * </blockquote>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRefreshs")
    public java.util.List<CreateDataFlowRequestAutoRefreshs> autoRefreshs;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can generate the token on your client to ensure that the token is unique across different requests.</p>
     * <p>The client token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">Ensure idempotence</a>.</p>
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
     * <p>The description of the data flow. </p>
     * <p>Limits:</p>
     * <ul>
     * <li>The description must be 2 to 128 characters in length.</li>
     * <li>The description must start with a letter and cannot start with <code>http://</code> or <code>https://</code>.</li>
     * <li>The description can contain digits, colons (:), underscores (_), and hyphens (-).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Bucket01 DataFlow</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform a dry run on the creation request.</p>
     * <p>A dry run helps you check parameter validity and resource availability without actually creating the instance or incurring fees.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: A dry run is performed and no instance is created. The system checks whether required parameters are specified, the request format, business limits, and NAS resource availability. If the request fails the dry run, an error is returned. If the request passes the dry run, the HTTP status code 200 is returned, but the FileSystemId parameter is empty.</li>
     * <li>false: A regular request is sent. If the request passes the dry run, the instance is created. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The file system ID.</p>
     * <ul>
     * <li><p>General-purpose CPFS: The ID must start with <code>cpfs-</code>, such as cpfs-125487\<em>\</em>\<em>\</em>.</p>
     * </li>
     * <li><p>CPFS for Lingjun: The ID must start with <code>bmcpfs-</code>, such as bmcpfs-0015\<em>\</em>\<em>\</em>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cpfs-099394bd928c****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The directory in the CPFS for Lingjun file system. Limits:</p>
     * <ul>
     * <li><p>The directory must start and end with a forward slash (/).</p>
     * </li>
     * <li><p>The directory must already exist in the CPFS for Lingjun file system.</p>
     * </li>
     * <li><p>The directory must be 1 to 1,023 characters in length.</p>
     * </li>
     * <li><p>The directory must be encoded in UTF-8.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when the file system type is CPFS for Lingjun.</p>
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
     * <p>This parameter is required when the file system type is General-purpose CPFS.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>fset-1902718ea0ae****</p>
     */
    @NameInMap("FsetId")
    public String fsetId;

    /**
     * <p>The security protection type of the source storage. If the source storage must be accessed through security protection, specify the security protection type. Valid values:</p>
     * <ul>
     * <li>None: The source storage does not require security protection for access. This is the default value.</li>
     * <li>SSL: Access is protected by an SSL certificate.</li>
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
     * <p>The access address of the source storage. Format: <code>&lt;storage type&gt;://[&lt;account id&gt;:]&lt;path&gt;</code>.</p>
     * <p>Where:</p>
     * <ul>
     * <li><p>storage type: Only oss is supported.</p>
     * </li>
     * <li><p>account id: Optional. The UID of the account to which the source storage belongs. This parameter is required when you use a cross-account OSS bucket.</p>
     * </li>
     * <li><p>path: The name of the OSS bucket. Limits:</p>
     * <ul>
     * <li><p>The name can contain only lowercase letters, digits, and hyphens (-), and must start and end with a lowercase letter or a digit.</p>
     * </li>
     * <li><p>The name can be up to 128 characters in length.</p>
     * </li>
     * <li><p>The name must be encoded in UTF-8.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>The OSS bucket must already exist in the region.</li>
     * <li>The account id parameter is supported only in CPFS for Lingjun 2.6.0 and later.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://178321033379****:bucket-01</p>
     */
    @NameInMap("SourceStorage")
    public String sourceStorage;

    /**
     * <p>The access path in the source storage bucket. Limits:</p>
     * <ul>
     * <li><p>The path must start and end with a forward slash (/).</p>
     * </li>
     * <li><p>The path is case-sensitive.</p>
     * </li>
     * <li><p>The path must be 1 to 1,023 characters in length.</p>
     * </li>
     * <li><p>The path must be encoded in UTF-8.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when the file system type is CPFS for Lingjun.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/prefix/</p>
     */
    @NameInMap("SourceStoragePath")
    public String sourceStoragePath;

    /**
     * <p>The maximum transmission bandwidth of the data flow. Unit: MB/s. Valid values: </p>
     * <ul>
     * <li>600</li>
     * <li>1200</li>
     * <li>1500</li>
     * </ul>
     * <blockquote>
     * <p>The transmission bandwidth of the data flow must be less than the I/O bandwidth of the file system.
     * This parameter is required when the file system type is General-purpose CPFS.</p>
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
         * <p>The auto-refresh directory. General-purpose CPFS registers data modification events of the source storage, checks whether the source data in this directory is updated, and automatically imports the updated data.</p>
         * <p>By default, this parameter is empty. Data updates in the source storage are not automatically imported to General-purpose CPFS. You must create a manual task to import the updates.</p>
         * <p>Limits:</p>
         * <ul>
         * <li>The directory must be 2 to 1,024 characters in length.</li>
         * <li>The directory must be encoded in UTF-8.</li>
         * <li>The directory must start and end with a forward slash (/).</li>
         * <li>The directory must already exist in General-purpose CPFS and must be located in the fileset directory of the data flow.</li>
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
