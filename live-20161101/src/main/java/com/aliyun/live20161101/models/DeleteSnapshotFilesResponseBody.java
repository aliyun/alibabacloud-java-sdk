// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteSnapshotFilesResponseBody extends TeaModel {
    /**
     * <p>The number of snapshots that failed to be deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FailureCount")
    public Integer failureCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>90F60327-ABEC-5A93-BF1F-****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SnapshotDeleteInfoList")
    public DeleteSnapshotFilesResponseBodySnapshotDeleteInfoList snapshotDeleteInfoList;

    /**
     * <p>The number of successful screenshot deletions.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SuccessCount")
    public Integer successCount;

    public static DeleteSnapshotFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSnapshotFilesResponseBody self = new DeleteSnapshotFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSnapshotFilesResponseBody setFailureCount(Integer failureCount) {
        this.failureCount = failureCount;
        return this;
    }
    public Integer getFailureCount() {
        return this.failureCount;
    }

    public DeleteSnapshotFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSnapshotFilesResponseBody setSnapshotDeleteInfoList(DeleteSnapshotFilesResponseBodySnapshotDeleteInfoList snapshotDeleteInfoList) {
        this.snapshotDeleteInfoList = snapshotDeleteInfoList;
        return this;
    }
    public DeleteSnapshotFilesResponseBodySnapshotDeleteInfoList getSnapshotDeleteInfoList() {
        return this.snapshotDeleteInfoList;
    }

    public DeleteSnapshotFilesResponseBody setSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }
    public Integer getSuccessCount() {
        return this.successCount;
    }

    public static class DeleteSnapshotFilesResponseBodySnapshotDeleteInfoListSnapshotDeleteInfo extends TeaModel {
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        @NameInMap("Message")
        public String message;

        public static DeleteSnapshotFilesResponseBodySnapshotDeleteInfoListSnapshotDeleteInfo build(java.util.Map<String, ?> map) throws Exception {
            DeleteSnapshotFilesResponseBodySnapshotDeleteInfoListSnapshotDeleteInfo self = new DeleteSnapshotFilesResponseBodySnapshotDeleteInfoListSnapshotDeleteInfo();
            return TeaModel.build(map, self);
        }

        public DeleteSnapshotFilesResponseBodySnapshotDeleteInfoListSnapshotDeleteInfo setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DeleteSnapshotFilesResponseBodySnapshotDeleteInfoListSnapshotDeleteInfo setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class DeleteSnapshotFilesResponseBodySnapshotDeleteInfoList extends TeaModel {
        @NameInMap("SnapshotDeleteInfo")
        public java.util.List<DeleteSnapshotFilesResponseBodySnapshotDeleteInfoListSnapshotDeleteInfo> snapshotDeleteInfo;

        public static DeleteSnapshotFilesResponseBodySnapshotDeleteInfoList build(java.util.Map<String, ?> map) throws Exception {
            DeleteSnapshotFilesResponseBodySnapshotDeleteInfoList self = new DeleteSnapshotFilesResponseBodySnapshotDeleteInfoList();
            return TeaModel.build(map, self);
        }

        public DeleteSnapshotFilesResponseBodySnapshotDeleteInfoList setSnapshotDeleteInfo(java.util.List<DeleteSnapshotFilesResponseBodySnapshotDeleteInfoListSnapshotDeleteInfo> snapshotDeleteInfo) {
            this.snapshotDeleteInfo = snapshotDeleteInfo;
            return this;
        }
        public java.util.List<DeleteSnapshotFilesResponseBodySnapshotDeleteInfoListSnapshotDeleteInfo> getSnapshotDeleteInfo() {
            return this.snapshotDeleteInfo;
        }

    }

}
