// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListDirectoriesResponseBody extends TeaModel {
    @NameInMap("Directories")
    public java.util.List<ListDirectoriesResponseBodyDirectories> directories;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DirectoryId")
        public String directoryId;

        @NameInMap("DirectoryName")
        public String directoryName;

        @NameInMap("Region")
        public String region;

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
