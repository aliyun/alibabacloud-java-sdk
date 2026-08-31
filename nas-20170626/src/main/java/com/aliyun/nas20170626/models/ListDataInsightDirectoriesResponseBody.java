// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ListDataInsightDirectoriesResponseBody extends TeaModel {
    /**
     * <p>The directory information.</p>
     */
    @NameInMap("Directory")
    public ListDataInsightDirectoriesResponseBodyDirectory directory;

    /**
     * <p>The file system ID.</p>
     * 
     * <strong>example:</strong>
     * <p>bmcpfs-370lx1ev9ss27o0****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The maximum number of directories returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token returned in this call.</p>
     * 
     * <strong>example:</strong>
     * <p>/subDir</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>98696EF0-1607-4E9D-B01D-F20930B6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDataInsightDirectoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataInsightDirectoriesResponseBody self = new ListDataInsightDirectoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataInsightDirectoriesResponseBody setDirectory(ListDataInsightDirectoriesResponseBodyDirectory directory) {
        this.directory = directory;
        return this;
    }
    public ListDataInsightDirectoriesResponseBodyDirectory getDirectory() {
        return this.directory;
    }

    public ListDataInsightDirectoriesResponseBody setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public ListDataInsightDirectoriesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDataInsightDirectoriesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDataInsightDirectoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDataInsightDirectoriesResponseBodyDirectorySubDirectories extends TeaModel {
        /**
         * <p>The time when the directory was created. The time follows the ISO 8601 standard in UTC. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-23T12:47:14Z</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>The capacity of the subdirectory.</p>
         * 
         * <strong>example:</strong>
         * <p>345518080</p>
         */
        @NameInMap("DirCapacity")
        public Long dirCapacity;

        /**
         * <p>The capacity of IA files in the subdirectory.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DirCapacityOffline")
        public Long dirCapacityOffline;

        /**
         * <p>The capacity of standard files in the subdirectory.</p>
         * 
         * <strong>example:</strong>
         * <p>345518080</p>
         */
        @NameInMap("DirCapacityOnline")
        public Long dirCapacityOnline;

        /**
         * <p>The subdirectory level.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DirLevel")
        public Integer dirLevel;

        /**
         * <p>The subdirectory name.</p>
         * 
         * <strong>example:</strong>
         * <p>/dir_l1_n000</p>
         */
        @NameInMap("DirName")
        public String dirName;

        /**
         * <p>The number of files in the subdirectory.</p>
         * 
         * <strong>example:</strong>
         * <p>84846</p>
         */
        @NameInMap("FileCount")
        public Long fileCount;

        /**
         * <p>The number of IA files in the subdirectory.</p>
         * 
         * <strong>example:</strong>
         * <p>2343</p>
         */
        @NameInMap("FileCountOffline")
        public Long fileCountOffline;

        /**
         * <p>The number of standard files in the subdirectory.</p>
         * 
         * <strong>example:</strong>
         * <p>84355</p>
         */
        @NameInMap("FileCountOnline")
        public Long fileCountOnline;

        /**
         * <p>The inode number of the subdirectory.</p>
         * 
         * <strong>example:</strong>
         * <p>140288</p>
         */
        @NameInMap("Inode")
        public Long inode;

        /**
         * <p>The time when the database directory data record was last updated. The time follows the ISO 8601 standard in UTC. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-29T03:41:12Z</p>
         */
        @NameInMap("LastAccessTime")
        public String lastAccessTime;

        /**
         * <p>The time when the directory was last accessed. The time follows the ISO 8601 standard in UTC. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-29T03:41:12Z</p>
         */
        @NameInMap("UpdatedAt")
        public String updatedAt;

        public static ListDataInsightDirectoriesResponseBodyDirectorySubDirectories build(java.util.Map<String, ?> map) throws Exception {
            ListDataInsightDirectoriesResponseBodyDirectorySubDirectories self = new ListDataInsightDirectoriesResponseBodyDirectorySubDirectories();
            return TeaModel.build(map, self);
        }

        public ListDataInsightDirectoriesResponseBodyDirectorySubDirectories setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListDataInsightDirectoriesResponseBodyDirectorySubDirectories setDirCapacity(Long dirCapacity) {
            this.dirCapacity = dirCapacity;
            return this;
        }
        public Long getDirCapacity() {
            return this.dirCapacity;
        }

        public ListDataInsightDirectoriesResponseBodyDirectorySubDirectories setDirCapacityOffline(Long dirCapacityOffline) {
            this.dirCapacityOffline = dirCapacityOffline;
            return this;
        }
        public Long getDirCapacityOffline() {
            return this.dirCapacityOffline;
        }

        public ListDataInsightDirectoriesResponseBodyDirectorySubDirectories setDirCapacityOnline(Long dirCapacityOnline) {
            this.dirCapacityOnline = dirCapacityOnline;
            return this;
        }
        public Long getDirCapacityOnline() {
            return this.dirCapacityOnline;
        }

        public ListDataInsightDirectoriesResponseBodyDirectorySubDirectories setDirLevel(Integer dirLevel) {
            this.dirLevel = dirLevel;
            return this;
        }
        public Integer getDirLevel() {
            return this.dirLevel;
        }

        public ListDataInsightDirectoriesResponseBodyDirectorySubDirectories setDirName(String dirName) {
            this.dirName = dirName;
            return this;
        }
        public String getDirName() {
            return this.dirName;
        }

        public ListDataInsightDirectoriesResponseBodyDirectorySubDirectories setFileCount(Long fileCount) {
            this.fileCount = fileCount;
            return this;
        }
        public Long getFileCount() {
            return this.fileCount;
        }

        public ListDataInsightDirectoriesResponseBodyDirectorySubDirectories setFileCountOffline(Long fileCountOffline) {
            this.fileCountOffline = fileCountOffline;
            return this;
        }
        public Long getFileCountOffline() {
            return this.fileCountOffline;
        }

        public ListDataInsightDirectoriesResponseBodyDirectorySubDirectories setFileCountOnline(Long fileCountOnline) {
            this.fileCountOnline = fileCountOnline;
            return this;
        }
        public Long getFileCountOnline() {
            return this.fileCountOnline;
        }

        public ListDataInsightDirectoriesResponseBodyDirectorySubDirectories setInode(Long inode) {
            this.inode = inode;
            return this;
        }
        public Long getInode() {
            return this.inode;
        }

        public ListDataInsightDirectoriesResponseBodyDirectorySubDirectories setLastAccessTime(String lastAccessTime) {
            this.lastAccessTime = lastAccessTime;
            return this;
        }
        public String getLastAccessTime() {
            return this.lastAccessTime;
        }

        public ListDataInsightDirectoriesResponseBodyDirectorySubDirectories setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

    public static class ListDataInsightDirectoriesResponseBodyDirectory extends TeaModel {
        /**
         * <p>The directory capacity.</p>
         * 
         * <strong>example:</strong>
         * <p>10240</p>
         */
        @NameInMap("DirCapacity")
        public Long dirCapacity;

        /**
         * <p>The capacity of IA files.</p>
         * 
         * <strong>example:</strong>
         * <p>10240</p>
         */
        @NameInMap("DirCapacityOffline")
        public Long dirCapacityOffline;

        /**
         * <p>The capacity of standard files.</p>
         * 
         * <strong>example:</strong>
         * <p>10240</p>
         */
        @NameInMap("DirCapacityOnline")
        public Long dirCapacityOnline;

        /**
         * <p>The number of files.</p>
         * 
         * <strong>example:</strong>
         * <p>2343232</p>
         */
        @NameInMap("FileCount")
        public Long fileCount;

        /**
         * <p>The number of Infrequent Access (IA) files.</p>
         * 
         * <strong>example:</strong>
         * <p>204800</p>
         */
        @NameInMap("FileCountOffline")
        public Long fileCountOffline;

        /**
         * <p>The number of standard files.</p>
         * 
         * <strong>example:</strong>
         * <p>204800</p>
         */
        @NameInMap("FileCountOnline")
        public Long fileCountOnline;

        /**
         * <p>The inode number of the directory.</p>
         * 
         * <strong>example:</strong>
         * <p>2343</p>
         */
        @NameInMap("Inode")
        public Long inode;

        /**
         * <p>The subdirectory information.</p>
         */
        @NameInMap("SubDirectories")
        public java.util.List<ListDataInsightDirectoriesResponseBodyDirectorySubDirectories> subDirectories;

        public static ListDataInsightDirectoriesResponseBodyDirectory build(java.util.Map<String, ?> map) throws Exception {
            ListDataInsightDirectoriesResponseBodyDirectory self = new ListDataInsightDirectoriesResponseBodyDirectory();
            return TeaModel.build(map, self);
        }

        public ListDataInsightDirectoriesResponseBodyDirectory setDirCapacity(Long dirCapacity) {
            this.dirCapacity = dirCapacity;
            return this;
        }
        public Long getDirCapacity() {
            return this.dirCapacity;
        }

        public ListDataInsightDirectoriesResponseBodyDirectory setDirCapacityOffline(Long dirCapacityOffline) {
            this.dirCapacityOffline = dirCapacityOffline;
            return this;
        }
        public Long getDirCapacityOffline() {
            return this.dirCapacityOffline;
        }

        public ListDataInsightDirectoriesResponseBodyDirectory setDirCapacityOnline(Long dirCapacityOnline) {
            this.dirCapacityOnline = dirCapacityOnline;
            return this;
        }
        public Long getDirCapacityOnline() {
            return this.dirCapacityOnline;
        }

        public ListDataInsightDirectoriesResponseBodyDirectory setFileCount(Long fileCount) {
            this.fileCount = fileCount;
            return this;
        }
        public Long getFileCount() {
            return this.fileCount;
        }

        public ListDataInsightDirectoriesResponseBodyDirectory setFileCountOffline(Long fileCountOffline) {
            this.fileCountOffline = fileCountOffline;
            return this;
        }
        public Long getFileCountOffline() {
            return this.fileCountOffline;
        }

        public ListDataInsightDirectoriesResponseBodyDirectory setFileCountOnline(Long fileCountOnline) {
            this.fileCountOnline = fileCountOnline;
            return this;
        }
        public Long getFileCountOnline() {
            return this.fileCountOnline;
        }

        public ListDataInsightDirectoriesResponseBodyDirectory setInode(Long inode) {
            this.inode = inode;
            return this;
        }
        public Long getInode() {
            return this.inode;
        }

        public ListDataInsightDirectoriesResponseBodyDirectory setSubDirectories(java.util.List<ListDataInsightDirectoriesResponseBodyDirectorySubDirectories> subDirectories) {
            this.subDirectories = subDirectories;
            return this;
        }
        public java.util.List<ListDataInsightDirectoriesResponseBodyDirectorySubDirectories> getSubDirectories() {
            return this.subDirectories;
        }

    }

}
