// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class BrowseFilesRequest extends TeaModel {
    /**
     * <p>The absolute path of the directory. Specify <code>/</code> to browse the root directory of the backup.</p>
     * 
     * <strong>example:</strong>
     * <p>/data/</p>
     */
    @NameInMap("AbsolutePath")
    public String absolutePath;

    /**
     * <p>The backup client ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c-000***o48</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The Cloud Backup edition. Valid values:</p>
     * <ul>
     * <li><p><strong>STANDARD</strong>: Standard Edition. This is the default value.</p>
     * </li>
     * <li><p><strong>BASIC</strong>: Basic Edition. Only ECS file backup is supported in Basic Edition.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>STANDARD</p>
     */
    @NameInMap("Edition")
    public String edition;

    /**
     * <p>The maximum number of results to return per request.</p>
     * <p>Valid values: 10 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is required to retrieve the next page of results. If this parameter is not specified, the first page of results is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJ***Q==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Deprecated. Use MaxResults and NextToken for pagination instead.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Deprecated. Use MaxResults and NextToken for pagination instead.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The hash value of the directory. If this parameter is not specified, the root directory of the backup is browsed.</p>
     * 
     * <strong>example:</strong>
     * <p>ef6***46a</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>Deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>r-000***oy9</p>
     */
    @NameInMap("RestoreId")
    public String restoreId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The hash value of the backup snapshot.</p>
     * 
     * <strong>example:</strong>
     * <p>971***e9d</p>
     */
    @NameInMap("SnapshotHash")
    public String snapshotHash;

    /**
     * <p>The storage class of the backup data. Valid values:</p>
     * <ul>
     * <li><p><strong>STANDARD</strong>: Standard.</p>
     * </li>
     * <li><p><strong>ARCHIVE</strong>: Archive.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>STANDARD</p>
     */
    @NameInMap("StorageClass")
    public String storageClass;

    /**
     * <p>Deprecated. Do not use.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <p>The backup vault ID.</p>
     * 
     * <strong>example:</strong>
     * <p>v-000***jtz</p>
     */
    @NameInMap("VaultId")
    public String vaultId;

    public static BrowseFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        BrowseFilesRequest self = new BrowseFilesRequest();
        return TeaModel.build(map, self);
    }

    public BrowseFilesRequest setAbsolutePath(String absolutePath) {
        this.absolutePath = absolutePath;
        return this;
    }
    public String getAbsolutePath() {
        return this.absolutePath;
    }

    public BrowseFilesRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public BrowseFilesRequest setEdition(String edition) {
        this.edition = edition;
        return this;
    }
    public String getEdition() {
        return this.edition;
    }

    public BrowseFilesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public BrowseFilesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public BrowseFilesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public BrowseFilesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public BrowseFilesRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public BrowseFilesRequest setRestoreId(String restoreId) {
        this.restoreId = restoreId;
        return this;
    }
    public String getRestoreId() {
        return this.restoreId;
    }

    public BrowseFilesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public BrowseFilesRequest setSnapshotHash(String snapshotHash) {
        this.snapshotHash = snapshotHash;
        return this;
    }
    public String getSnapshotHash() {
        return this.snapshotHash;
    }

    public BrowseFilesRequest setStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }
    public String getStorageClass() {
        return this.storageClass;
    }

    public BrowseFilesRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public BrowseFilesRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

}
