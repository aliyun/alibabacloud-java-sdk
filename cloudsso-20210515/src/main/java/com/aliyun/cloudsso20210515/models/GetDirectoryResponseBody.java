// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetDirectoryResponseBody extends TeaModel {
    /**
     * <p>The information about the directory.</p>
     */
    @NameInMap("Directory")
    public GetDirectoryResponseBodyDirectory directory;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AA6A9E4B-8A61-59E1-AA87-F61CA18258A3</p>
     */
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
         * <p>example</p>
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
         * <p>2021-10-25T07:18:46Z</p>
         */
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
