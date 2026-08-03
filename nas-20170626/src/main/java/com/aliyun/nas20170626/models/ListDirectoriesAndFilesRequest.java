// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ListDirectoriesAndFilesRequest extends TeaModel {
    /**
     * <p>Specifies whether to query only directories.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>false (default): No. Both directories and files can be queried.</li>
     * <li>true: Yes. Only directories are queried.<blockquote>
     * <p>When StorageType is set to All, DirectoryOnly must be set to true and cannot be set to false.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DirectoryOnly")
    public Boolean directoryOnly;

    /**
     * <p>The file system ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>31a8e4****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The number of directories or files included in each query result.</p>
     * <p>Valid values: 10 to 128.</p>
     * <p>Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. If the return results are truncated, you can use NextToken to initiate a new request to retrieve the content after the current truncation position.</p>
     * 
     * <strong>example:</strong>
     * <p>TGlzdFJlc291cmNlU****mVzJjE1MTI2NjY4NzY5MTAzOTEmMiZORnI4NDhVeEtrUT0=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The absolute path of the specified directory.</p>
     * <p>The path must start with a forward slash (/) and must be an existing path in the mount target.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/pathway/to/folder</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The storage class type.</p>
     * <ul>
     * <li>InfrequentAccess: IA storage class.</li>
     * <li>Archive: Archive storage class.</li>
     * <li>All: queries data of all storage classes.<blockquote>
     * <p>When StorageType is set to All, you must set DirectoryOnly to true.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>InfrequentAccess</p>
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
