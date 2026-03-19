// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class BrowseFilesRequest extends TeaModel {
    @NameInMap("AbsolutePath")
    public String absolutePath;

    /**
     * <strong>example:</strong>
     * <p>c-000***o48</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <strong>example:</strong>
     * <p>STANDARD</p>
     */
    @NameInMap("Edition")
    public String edition;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>eyJ***Q==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>ef6***46a</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <strong>example:</strong>
     * <p>r-000***oy9</p>
     */
    @NameInMap("RestoreId")
    public String restoreId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <strong>example:</strong>
     * <p>971***e9d</p>
     */
    @NameInMap("SnapshotHash")
    public String snapshotHash;

    /**
     * <strong>example:</strong>
     * <p>STANDARD</p>
     */
    @NameInMap("StorageClass")
    public String storageClass;

    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Token")
    public String token;

    /**
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
