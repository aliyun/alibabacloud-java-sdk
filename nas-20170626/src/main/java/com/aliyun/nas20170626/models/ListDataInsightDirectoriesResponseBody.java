// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ListDataInsightDirectoriesResponseBody extends TeaModel {
    @NameInMap("Directory")
    public ListDataInsightDirectoriesResponseBodyDirectory directory;

    /**
     * <strong>example:</strong>
     * <p>bmcpfs-370lx1ev9ss27o0****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>/subDir</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
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
         * <strong>example:</strong>
         * <p>2026-07-23T12:47:14Z</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <strong>example:</strong>
         * <p>345518080</p>
         */
        @NameInMap("DirCapacity")
        public Long dirCapacity;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DirCapacityOffline")
        public Long dirCapacityOffline;

        /**
         * <strong>example:</strong>
         * <p>345518080</p>
         */
        @NameInMap("DirCapacityOnline")
        public Long dirCapacityOnline;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DirLevel")
        public Integer dirLevel;

        /**
         * <strong>example:</strong>
         * <p>/dir_l1_n000</p>
         */
        @NameInMap("DirName")
        public String dirName;

        /**
         * <strong>example:</strong>
         * <p>84846</p>
         */
        @NameInMap("FileCount")
        public Long fileCount;

        /**
         * <strong>example:</strong>
         * <p>2343</p>
         */
        @NameInMap("FileCountOffline")
        public Long fileCountOffline;

        /**
         * <strong>example:</strong>
         * <p>84355</p>
         */
        @NameInMap("FileCountOnline")
        public Long fileCountOnline;

        /**
         * <strong>example:</strong>
         * <p>2026-07-29T03:41:12Z</p>
         */
        @NameInMap("LastAccessTime")
        public String lastAccessTime;

        /**
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
         * <strong>example:</strong>
         * <p>10240</p>
         */
        @NameInMap("DirCapacity")
        public Long dirCapacity;

        /**
         * <strong>example:</strong>
         * <p>10240</p>
         */
        @NameInMap("DirCapacityOffline")
        public Long dirCapacityOffline;

        /**
         * <strong>example:</strong>
         * <p>10240</p>
         */
        @NameInMap("DirCapacityOnline")
        public Long dirCapacityOnline;

        /**
         * <strong>example:</strong>
         * <p>2343232</p>
         */
        @NameInMap("FileCount")
        public Long fileCount;

        /**
         * <strong>example:</strong>
         * <p>204800</p>
         */
        @NameInMap("FileCountOffline")
        public Long fileCountOffline;

        /**
         * <strong>example:</strong>
         * <p>204800</p>
         */
        @NameInMap("FileCountOnline")
        public Long fileCountOnline;

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

        public ListDataInsightDirectoriesResponseBodyDirectory setSubDirectories(java.util.List<ListDataInsightDirectoriesResponseBodyDirectorySubDirectories> subDirectories) {
            this.subDirectories = subDirectories;
            return this;
        }
        public java.util.List<ListDataInsightDirectoriesResponseBodyDirectorySubDirectories> getSubDirectories() {
            return this.subDirectories;
        }

    }

}
