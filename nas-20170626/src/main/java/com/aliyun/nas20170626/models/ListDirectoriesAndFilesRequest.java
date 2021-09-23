// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ListDirectoriesAndFilesRequest extends TeaModel {
    @NameInMap("FileSystemId")
    public String fileSystemId;

    @NameInMap("Path")
    public String path;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("StorageType")
    public String storageType;

    @NameInMap("DirectoryOnly")
    public Boolean directoryOnly;

    @NameInMap("MaxResults")
    public Long maxResults;

    public static ListDirectoriesAndFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDirectoriesAndFilesRequest self = new ListDirectoriesAndFilesRequest();
        return TeaModel.build(map, self);
    }

    public ListDirectoriesAndFilesRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public ListDirectoriesAndFilesRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public ListDirectoriesAndFilesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDirectoriesAndFilesRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public ListDirectoriesAndFilesRequest setDirectoryOnly(Boolean directoryOnly) {
        this.directoryOnly = directoryOnly;
        return this;
    }
    public Boolean getDirectoryOnly() {
        return this.directoryOnly;
    }

    public ListDirectoriesAndFilesRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

}
