// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListSnapshotReposByInstanceIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListSnapshotReposByInstanceIdResponseBodyResult> result;

    public static ListSnapshotReposByInstanceIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSnapshotReposByInstanceIdResponseBody self = new ListSnapshotReposByInstanceIdResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSnapshotReposByInstanceIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSnapshotReposByInstanceIdResponseBody setResult(java.util.List<ListSnapshotReposByInstanceIdResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListSnapshotReposByInstanceIdResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListSnapshotReposByInstanceIdResponseBodyResult extends TeaModel {
        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("repoPath")
        public String repoPath;

        @NameInMap("snapWarehouse")
        public String snapWarehouse;

        @NameInMap("status")
        public String status;

        public static ListSnapshotReposByInstanceIdResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListSnapshotReposByInstanceIdResponseBodyResult self = new ListSnapshotReposByInstanceIdResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListSnapshotReposByInstanceIdResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListSnapshotReposByInstanceIdResponseBodyResult setRepoPath(String repoPath) {
            this.repoPath = repoPath;
            return this;
        }
        public String getRepoPath() {
            return this.repoPath;
        }

        public ListSnapshotReposByInstanceIdResponseBodyResult setSnapWarehouse(String snapWarehouse) {
            this.snapWarehouse = snapWarehouse;
            return this;
        }
        public String getSnapWarehouse() {
            return this.snapWarehouse;
        }

        public ListSnapshotReposByInstanceIdResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
