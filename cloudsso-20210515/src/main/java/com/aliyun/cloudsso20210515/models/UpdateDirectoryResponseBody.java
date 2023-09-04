// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateDirectoryResponseBody extends TeaModel {
    /**
     * <p>The information about the directory.</p>
     */
    @NameInMap("Directory")
    public UpdateDirectoryResponseBodyDirectory directory;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDirectoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDirectoryResponseBody self = new UpdateDirectoryResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDirectoryResponseBody setDirectory(UpdateDirectoryResponseBodyDirectory directory) {
        this.directory = directory;
        return this;
    }
    public UpdateDirectoryResponseBodyDirectory getDirectory() {
        return this.directory;
    }

    public UpdateDirectoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateDirectoryResponseBodyDirectory extends TeaModel {
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

        public static UpdateDirectoryResponseBodyDirectory build(java.util.Map<String, ?> map) throws Exception {
            UpdateDirectoryResponseBodyDirectory self = new UpdateDirectoryResponseBodyDirectory();
            return TeaModel.build(map, self);
        }

        public UpdateDirectoryResponseBodyDirectory setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateDirectoryResponseBodyDirectory setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public UpdateDirectoryResponseBodyDirectory setDirectoryName(String directoryName) {
            this.directoryName = directoryName;
            return this;
        }
        public String getDirectoryName() {
            return this.directoryName;
        }

        public UpdateDirectoryResponseBodyDirectory setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public UpdateDirectoryResponseBodyDirectory setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
