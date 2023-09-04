// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListDirectoriesResponseBody extends TeaModel {
    /**
     * <p>The directories.</p>
     */
    @NameInMap("Directories")
    public java.util.List<ListDirectoriesResponseBodyDirectories> directories;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of directories.</p>
     */
    @NameInMap("TotalCounts")
    public Integer totalCounts;

    public static ListDirectoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDirectoriesResponseBody self = new ListDirectoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDirectoriesResponseBody setDirectories(java.util.List<ListDirectoriesResponseBodyDirectories> directories) {
        this.directories = directories;
        return this;
    }
    public java.util.List<ListDirectoriesResponseBodyDirectories> getDirectories() {
        return this.directories;
    }

    public ListDirectoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDirectoriesResponseBody setTotalCounts(Integer totalCounts) {
        this.totalCounts = totalCounts;
        return this;
    }
    public Integer getTotalCounts() {
        return this.totalCounts;
    }

    public static class ListDirectoriesResponseBodyDirectories extends TeaModel {
        /**
         * <p>The time when the directory was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the directory.</p>
         */
        @NameInMap("DirectoryId")
        public String directoryId;

        /**
         * <p>The name of the directory.</p>
         */
        @NameInMap("DirectoryName")
        public String directoryName;

        /**
         * <p>The region ID of the directory.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The time when the directory was modified.</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListDirectoriesResponseBodyDirectories build(java.util.Map<String, ?> map) throws Exception {
            ListDirectoriesResponseBodyDirectories self = new ListDirectoriesResponseBodyDirectories();
            return TeaModel.build(map, self);
        }

        public ListDirectoriesResponseBodyDirectories setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDirectoriesResponseBodyDirectories setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public ListDirectoriesResponseBodyDirectories setDirectoryName(String directoryName) {
            this.directoryName = directoryName;
            return this;
        }
        public String getDirectoryName() {
            return this.directoryName;
        }

        public ListDirectoriesResponseBodyDirectories setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListDirectoriesResponseBodyDirectories setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
