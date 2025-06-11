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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9A504392-F06D-5029-AB64-6654CB9F1DC1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of directories.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * 
         * <strong>example:</strong>
         * <p>2021-06-30T08:35:26Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the directory.</p>
         * 
         * <strong>example:</strong>
         * <p>d-00fc2p61****</p>
         */
        @NameInMap("DirectoryId")
        public String directoryId;

        /**
         * <p>The name of the directory.</p>
         * 
         * <strong>example:</strong>
         * <p>new-example</p>
         */
        @NameInMap("DirectoryName")
        public String directoryName;

        /**
         * <p>The region ID of the directory.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The time when the directory was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-10-25T09:13:24Z</p>
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
