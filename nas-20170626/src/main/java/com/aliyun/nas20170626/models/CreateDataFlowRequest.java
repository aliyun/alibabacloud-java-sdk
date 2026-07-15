// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateDataFlowRequest extends TeaModel {
    /**
     * <p>The auto-refresh interval. CPFS General-purpose checks the directory for data updates at this interval. If data updates exist, an auto-refresh task is started. Unit: minutes.</p>
     * <p>Valid values: 10 to 525600. Default value: 10.</p>
     * <blockquote>
     * <p>This parameter takes effect only when the file system type is CPFS General-purpose.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("AutoRefreshInterval")
    public Long autoRefreshInterval;

    /**
     * <p>The auto-refresh policy. Specifies the policy for importing data updates from the source storage to CPFS General-purpose after the source data is updated. Valid values:</p>
     * <ul>
     * <li>None (default): Data updates in the source storage are not automatically imported to CPFS General-purpose. You can import data updates from the source storage by using a data flow task.</li>
     * <li>ImportChanged: Data updates in the source storage are automatically imported to CPFS General-purpose.<blockquote>
     * <p>This parameter takes effect only when the file system type is CPFS General-purpose.</p>
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
     * <p>The auto-refresh configuration collection.</p>
     * <blockquote>
     * <p>This parameter takes effect only when the file system type is CPFS General-purpose.</p>
     * </blockquote>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRefreshs")
    public java.util.List<CreateDataFlowRequestAutoRefreshs> autoRefreshs;

    /**
     * <p>Ensures the idempotence of the request. Generate a parameter value from your client to ensure that the value is unique across different requests.</p>
     * <p>ClientToken supports only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId may differ for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the data flow.</p>
     * <p>Limits:</p>
     * <ul>
     * <li>The description must be 2 to 128 characters in length.</li>
     * <li>The description must start with a letter.</li>
     * <li>The description cannot start with <code>http://</code> or <code>https://</code>.</li>
     * <li>The description can contain digits, colons (:), underscores (_), and hyphens (-).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Bucket01 DataFlow</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform a dry run for this create request.</p>
     * <p>A dry run checks parameter validity and resource availability without actually creating the instance or incurring charges.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: Sends a dry run request without creating the instance. The check items include required parameters, request format, business limits, and NAS inventory. If the check fails, the corresponding error is returned. If the check succeeds, HTTP status code 200 is returned, but FileSystemId is empty.</li>
     * <li>false (default): Sends a normal request and creates the instance after the check is passed.</li>
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
     * <li><p>CPFS General-purpose: must start with <code>cpfs-</code>, such as cpfs-125487\<em>\</em>\<em>\</em>.</p>
     * </li>
     * <li><p>CPFS for Lingjun: must start with <code>bmcpfs-</code>, such as bmcpfs-0015\<em>\</em>\<em>\</em>.</p>
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
     * <li><p>The path must start and end with a forward slash (/).</p>
     * </li>
     * <li><p>The directory must be an existing directory in the CPFS for Lingjun file system.</p>
     * </li>
     * <li><p>The path must be 1 to 1023 characters in length.</p>
     * </li>
     * <li><p>UTF-8 encoding is used.</p>
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
     * <p>The Fileset ID.</p>
     * <blockquote>
     * <p>This parameter is required when the file system type is CPFS General-purpose.</p>
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
     * <li>None (default): The source storage does not require security protection for access.</li>
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
     * <li><p>storage type: only oss is supported.</p>
     * </li>
     * <li><p>account id: optional. The UID of the account that owns the source storage. This parameter is required when you use cross-account OSS.</p>
     * </li>
     * <li><p>path: the name of the OSS bucket. Limits:</p>
     * <ul>
     * <li><p>Only lowercase letters, digits, and hyphens (-) are supported. The name must start and end with a lowercase letter or digit.</p>
     * </li>
     * <li><p>The maximum length is 128 characters.</p>
     * </li>
     * <li><p>UTF-8 encoding is used.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>The OSS bucket must be an existing bucket in the region.</li>
     * <li>The account id parameter is supported only by CPFS for Lingjun 2.6.0 and later.</li>
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
     * <p>The access path within the source storage bucket. Limits:</p>
     * <ul>
     * <li><p>The path must start and end with a forward slash (/).</p>
     * </li>
     * <li><p>The path is case-sensitive.</p>
     * </li>
     * <li><p>The path must be 1 to 1023 characters in length.</p>
     * </li>
     * <li><p>UTF-8 encoding is used.</p>
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
     * <p>The maximum transfer bandwidth of the data flow. Unit: MB/s. Valid values: </p>
     * <ul>
     * <li>600</li>
     * <li>1200</li>
     * <li>1500</li>
     * </ul>
     * <blockquote>
     * <p>The transfer bandwidth of the data flow must be less than the I/O bandwidth of the file system.
     * This parameter is required when the file system type is CPFS General-purpose.</p>
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
         * <p>The auto-refresh directory. CPFS General-purpose registers data modification events from the source storage and checks whether the source data in this directory has been updated, then automatically imports the updated data.</p>
         * <p>The default value is empty, which means that data updates in the source storage are not automatically imported to CPFS General-purpose. You must manually create a task to import updates.</p>
         * <p>Limits:</p>
         * <ul>
         * <li>The path must be 2 to 1024 characters in length.</li>
         * <li>UTF-8 encoding is used.</li>
         * <li>The path must start and end with a forward slash (/).</li>
         * <li>The directory must be an existing directory in the CPFS General-purpose file system and must be located within the Fileset directory of the data flow.</li>
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
