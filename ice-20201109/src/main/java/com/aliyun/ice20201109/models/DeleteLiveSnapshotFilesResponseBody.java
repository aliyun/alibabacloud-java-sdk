// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteLiveSnapshotFilesResponseBody extends TeaModel {
    @NameInMap("DeleteFileResultList")
    public java.util.List<DeleteLiveSnapshotFilesResponseBodyDeleteFileResultList> deleteFileResultList;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLiveSnapshotFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveSnapshotFilesResponseBody self = new DeleteLiveSnapshotFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLiveSnapshotFilesResponseBody setDeleteFileResultList(java.util.List<DeleteLiveSnapshotFilesResponseBodyDeleteFileResultList> deleteFileResultList) {
        this.deleteFileResultList = deleteFileResultList;
        return this;
    }
    public java.util.List<DeleteLiveSnapshotFilesResponseBodyDeleteFileResultList> getDeleteFileResultList() {
        return this.deleteFileResultList;
    }

    public DeleteLiveSnapshotFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteLiveSnapshotFilesResponseBodyDeleteFileResultList extends TeaModel {
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        @NameInMap("Result")
        public String result;

        public static DeleteLiveSnapshotFilesResponseBodyDeleteFileResultList build(java.util.Map<String, ?> map) throws Exception {
            DeleteLiveSnapshotFilesResponseBodyDeleteFileResultList self = new DeleteLiveSnapshotFilesResponseBodyDeleteFileResultList();
            return TeaModel.build(map, self);
        }

        public DeleteLiveSnapshotFilesResponseBodyDeleteFileResultList setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DeleteLiveSnapshotFilesResponseBodyDeleteFileResultList setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

    }

}
