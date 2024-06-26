// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteLiveSnapshotFilesResponseBody extends TeaModel {
    @NameInMap("DeleteFileResultList")
    public java.util.List<DeleteLiveSnapshotFilesResponseBodyDeleteFileResultList> deleteFileResultList;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>2876-6263-4B75-8F2C-CD0F7FCF</strong></strong></p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>1660638613798</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <strong>example:</strong>
         * <p>OK</p>
         */
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
