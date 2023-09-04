// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class CreateDirectoryResponseBody extends TeaModel {
    /**
     * <p>The information about the directory.</p>
     */
    @NameInMap("Directory")
    public CreateDirectoryResponseBodyDirectory directory;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDirectoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDirectoryResponseBody self = new CreateDirectoryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDirectoryResponseBody setDirectory(CreateDirectoryResponseBodyDirectory directory) {
        this.directory = directory;
        return this;
    }
    public CreateDirectoryResponseBodyDirectory getDirectory() {
        return this.directory;
    }

    public CreateDirectoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateDirectoryResponseBodyDirectory extends TeaModel {
        /**
         * <p>The time when the directory was created. The time is displayed in UTC.</p>
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
         * <p>The time when the directory was modified. The time is displayed in UTC.</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static CreateDirectoryResponseBodyDirectory build(java.util.Map<String, ?> map) throws Exception {
            CreateDirectoryResponseBodyDirectory self = new CreateDirectoryResponseBodyDirectory();
            return TeaModel.build(map, self);
        }

        public CreateDirectoryResponseBodyDirectory setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateDirectoryResponseBodyDirectory setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public CreateDirectoryResponseBodyDirectory setDirectoryName(String directoryName) {
            this.directoryName = directoryName;
            return this;
        }
        public String getDirectoryName() {
            return this.directoryName;
        }

        public CreateDirectoryResponseBodyDirectory setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public CreateDirectoryResponseBodyDirectory setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
