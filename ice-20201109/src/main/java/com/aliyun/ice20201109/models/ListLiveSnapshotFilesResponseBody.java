// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListLiveSnapshotFilesResponseBody extends TeaModel {
    @NameInMap("FileList")
    public java.util.List<ListLiveSnapshotFilesResponseBodyFileList> fileList;

    /**
     * <strong>example:</strong>
     * <p>2022-02-02T22:22:22Z</p>
     */
    @NameInMap("NextStartTime")
    public String nextStartTime;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListLiveSnapshotFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLiveSnapshotFilesResponseBody self = new ListLiveSnapshotFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLiveSnapshotFilesResponseBody setFileList(java.util.List<ListLiveSnapshotFilesResponseBodyFileList> fileList) {
        this.fileList = fileList;
        return this;
    }
    public java.util.List<ListLiveSnapshotFilesResponseBodyFileList> getFileList() {
        return this.fileList;
    }

    public ListLiveSnapshotFilesResponseBody setNextStartTime(String nextStartTime) {
        this.nextStartTime = nextStartTime;
        return this;
    }
    public String getNextStartTime() {
        return this.nextStartTime;
    }

    public ListLiveSnapshotFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListLiveSnapshotFilesResponseBodyFileList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2022-02-02T22:22:22Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>1619503516000</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsOverlay")
        public Boolean isOverlay;

        /**
         * <p>OSS bucket。</p>
         * 
         * <strong>example:</strong>
         * <p>testbucket</p>
         */
        @NameInMap("OssBucket")
        public String ossBucket;

        /**
         * <strong>example:</strong>
         * <p>oss-cn-shanghai.aliyuncs.com</p>
         */
        @NameInMap("OssEndpoint")
        public String ossEndpoint;

        @NameInMap("OssObject")
        public String ossObject;

        public static ListLiveSnapshotFilesResponseBodyFileList build(java.util.Map<String, ?> map) throws Exception {
            ListLiveSnapshotFilesResponseBodyFileList self = new ListLiveSnapshotFilesResponseBodyFileList();
            return TeaModel.build(map, self);
        }

        public ListLiveSnapshotFilesResponseBodyFileList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListLiveSnapshotFilesResponseBodyFileList setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public ListLiveSnapshotFilesResponseBodyFileList setIsOverlay(Boolean isOverlay) {
            this.isOverlay = isOverlay;
            return this;
        }
        public Boolean getIsOverlay() {
            return this.isOverlay;
        }

        public ListLiveSnapshotFilesResponseBodyFileList setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public ListLiveSnapshotFilesResponseBodyFileList setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        public ListLiveSnapshotFilesResponseBodyFileList setOssObject(String ossObject) {
            this.ossObject = ossObject;
            return this;
        }
        public String getOssObject() {
            return this.ossObject;
        }

    }

}
