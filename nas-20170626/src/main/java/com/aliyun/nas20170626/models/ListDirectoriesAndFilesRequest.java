// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ListDirectoriesAndFilesRequest extends TeaModel {
    /**
     * <p>Whether to list only directories.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><code>false</code> (default): Lists both directories and files.</p>
     * </li>
     * <li><p><code>true</code>: Lists only directories.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you set <code>StorageType</code> to <code>All</code>, you must set <code>DirectoryOnly</code> to <code>true</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DirectoryOnly")
    public Boolean directoryOnly;

    /**
     * <p>The ID of the file system.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>31a8e4****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The maximum number of directories or files to return per page.</p>
     * <p>Value range: 10–128</p>
     * <p>Default value: 100</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>A continuation token used to retrieve the next page of results when the response is truncated.</p>
     * 
     * <strong>example:</strong>
     * <p>TGlzdFJlc291cmNlU****mVzJjE1MTI2NjY4NzY5MTAzOTEmMiZORnI4NDhVeEtrUT0=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The absolute path of the directory.</p>
     * <p>The path must start with a forward slash (/) and exist on the mount target.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/pathway/to/folder</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The storage type.</p>
     * <ul>
     * <li><p><code>InfrequentAccess</code>: infrequent access.</p>
     * </li>
     * <li><p><code>Archive</code>: archive storage.</p>
     * </li>
     * <li><p><code>All</code>: all storage types.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you set <code>StorageType</code> to <code>All</code>, you must set <code>DirectoryOnly</code> to <code>true</code>.</p>
     * </blockquote>
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
