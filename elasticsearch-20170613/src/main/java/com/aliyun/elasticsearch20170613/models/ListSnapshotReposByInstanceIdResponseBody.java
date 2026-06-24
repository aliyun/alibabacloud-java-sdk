// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListSnapshotReposByInstanceIdResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned results.</p>
     */
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
        /**
         * <p>The referenced instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-6ja1ro4jt000c****</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The repository address.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-6ja1ro4jt000c****</p>
         */
        @NameInMap("repoPath")
        public String repoPath;

        /**
         * <p>The name of the referenced repository.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_snapshot_from_es-cn-6ja1ro4jt000c****</p>
         */
        @NameInMap("snapWarehouse")
        public String snapWarehouse;

        /**
         * <p>The status of the referenced repository. Valid values:</p>
         * <ul>
         * <li>available: The repository is active.</li>
         * <li>unavailable: The repository is inactive.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>available</p>
         */
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
