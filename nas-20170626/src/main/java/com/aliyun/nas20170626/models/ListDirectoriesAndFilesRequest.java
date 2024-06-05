// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ListDirectoriesAndFilesRequest extends TeaModel {
    /**
     * <p>Specifies whether to query only directories.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   false (default): queries both directories and files</p>
     * <p>*   true: queries only directories</p>
     */
    @NameInMap("DirectoryOnly")
    public Boolean directoryOnly;

    /**
     * <p>The ID of the file system.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The maximum number of directories or files to include in the results of each query.</p>
     * <br>
     * <p>Valid values: 10 to 128.</p>
     * <br>
     * <p>Default value: 100.</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The absolute path of the directory.</p>
     * <br>
     * <p>The path must start with a forward slash (/) and must be a path that exists in the mount target.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The storage type of the files.</p>
     * <br>
     * <p>Default value: InfrequentAccess (IA).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    public static ListDirectoriesAndFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDirectoriesAndFilesRequest self = new ListDirectoriesAndFilesRequest();
        return TeaModel.build(map, self);
    }

    public ListDirectoriesAndFilesRequest setDirectoryOnly(Boolean directoryOnly) {
        this.directoryOnly = directoryOnly;
        return this;
    }
    public Boolean getDirectoryOnly() {
        return this.directoryOnly;
    }

    public ListDirectoriesAndFilesRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public ListDirectoriesAndFilesRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListDirectoriesAndFilesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDirectoriesAndFilesRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public ListDirectoriesAndFilesRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

}
