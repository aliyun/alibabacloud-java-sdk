// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListAlternativeSnapshotReposResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1D***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The return results.</p>
     */
    @NameInMap("Result")
    public java.util.List<ListAlternativeSnapshotReposResponseBodyResult> result;

    public static ListAlternativeSnapshotReposResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlternativeSnapshotReposResponseBody self = new ListAlternativeSnapshotReposResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlternativeSnapshotReposResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlternativeSnapshotReposResponseBody setResult(java.util.List<ListAlternativeSnapshotReposResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListAlternativeSnapshotReposResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListAlternativeSnapshotReposResponseBodyResult extends TeaModel {
        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-6ja1ro4jt000c****</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The address of the repository.</p>
         * 
         * <strong>example:</strong>
         * <p>RepoPath</p>
         */
        @NameInMap("repoPath")
        public String repoPath;

        public static ListAlternativeSnapshotReposResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListAlternativeSnapshotReposResponseBodyResult self = new ListAlternativeSnapshotReposResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListAlternativeSnapshotReposResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListAlternativeSnapshotReposResponseBodyResult setRepoPath(String repoPath) {
            this.repoPath = repoPath;
            return this;
        }
        public String getRepoPath() {
            return this.repoPath;
        }

    }

}
