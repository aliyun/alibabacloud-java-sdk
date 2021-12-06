// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetDirectoryResponseBody extends TeaModel {
    @NameInMap("Directory")
    public GetDirectoryResponseBodyDirectory directory;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDirectoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDirectoryResponseBody self = new GetDirectoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDirectoryResponseBody setDirectory(GetDirectoryResponseBodyDirectory directory) {
        this.directory = directory;
        return this;
    }
    public GetDirectoryResponseBodyDirectory getDirectory() {
        return this.directory;
    }

    public GetDirectoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDirectoryResponseBodyDirectory extends TeaModel {
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

        public static GetDirectoryResponseBodyDirectory build(java.util.Map<String, ?> map) throws Exception {
            GetDirectoryResponseBodyDirectory self = new GetDirectoryResponseBodyDirectory();
            return TeaModel.build(map, self);
        }

        public GetDirectoryResponseBodyDirectory setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetDirectoryResponseBodyDirectory setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public GetDirectoryResponseBodyDirectory setDirectoryName(String directoryName) {
            this.directoryName = directoryName;
            return this;
        }
        public String getDirectoryName() {
            return this.directoryName;
        }

        public GetDirectoryResponseBodyDirectory setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetDirectoryResponseBodyDirectory setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
