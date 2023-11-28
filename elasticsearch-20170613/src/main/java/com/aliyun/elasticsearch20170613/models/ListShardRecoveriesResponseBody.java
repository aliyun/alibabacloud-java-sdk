// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListShardRecoveriesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Result")
    public java.util.List<ListShardRecoveriesResponseBodyResult> result;

    public static ListShardRecoveriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListShardRecoveriesResponseBody self = new ListShardRecoveriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListShardRecoveriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListShardRecoveriesResponseBody setResult(java.util.List<ListShardRecoveriesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListShardRecoveriesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListShardRecoveriesResponseBodyResult extends TeaModel {
        /**
         * <p>The data restoration progress.</p>
         */
        @NameInMap("bytesPercent")
        public String bytesPercent;

        /**
         * <p>The total amount of data that is restored.</p>
         */
        @NameInMap("bytesTotal")
        public Long bytesTotal;

        /**
         * <p>The file execution progress.</p>
         */
        @NameInMap("filesPercent")
        public String filesPercent;

        /**
         * <p>The total number of files.</p>
         */
        @NameInMap("filesTotal")
        public Long filesTotal;

        /**
         * <p>The name of the index.</p>
         */
        @NameInMap("index")
        public String index;

        /**
         * <p>The IP address of the source node.</p>
         */
        @NameInMap("sourceHost")
        public String sourceHost;

        /**
         * <p>The name of the source node.</p>
         */
        @NameInMap("sourceNode")
        public String sourceNode;

        /**
         * <p>The data restoration status. Valid values:</p>
         * <br>
         * <p>*   done: Data restoration is complete.</p>
         * <p>*   finalize: Data is being cleared.</p>
         * <p>*   index: Index metadata is being read, and bytes are being copied from source to destination.</p>
         * <p>*   init: Data restoration is not started.</p>
         * <p>*   start: Data restoration is started.</p>
         * <p>*   translog: Translogs are being redone.</p>
         */
        @NameInMap("stage")
        public String stage;

        /**
         * <p>The IP address of the destination node.</p>
         */
        @NameInMap("targetHost")
        public String targetHost;

        /**
         * <p>The name of the destination node.</p>
         */
        @NameInMap("targetNode")
        public String targetNode;

        /**
         * <p>The number of translog operations to be restored.</p>
         */
        @NameInMap("translogOps")
        public Long translogOps;

        /**
         * <p>The restoration progress of translog operations.</p>
         */
        @NameInMap("translogOpsPercent")
        public String translogOpsPercent;

        public static ListShardRecoveriesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListShardRecoveriesResponseBodyResult self = new ListShardRecoveriesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListShardRecoveriesResponseBodyResult setBytesPercent(String bytesPercent) {
            this.bytesPercent = bytesPercent;
            return this;
        }
        public String getBytesPercent() {
            return this.bytesPercent;
        }

        public ListShardRecoveriesResponseBodyResult setBytesTotal(Long bytesTotal) {
            this.bytesTotal = bytesTotal;
            return this;
        }
        public Long getBytesTotal() {
            return this.bytesTotal;
        }

        public ListShardRecoveriesResponseBodyResult setFilesPercent(String filesPercent) {
            this.filesPercent = filesPercent;
            return this;
        }
        public String getFilesPercent() {
            return this.filesPercent;
        }

        public ListShardRecoveriesResponseBodyResult setFilesTotal(Long filesTotal) {
            this.filesTotal = filesTotal;
            return this;
        }
        public Long getFilesTotal() {
            return this.filesTotal;
        }

        public ListShardRecoveriesResponseBodyResult setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public ListShardRecoveriesResponseBodyResult setSourceHost(String sourceHost) {
            this.sourceHost = sourceHost;
            return this;
        }
        public String getSourceHost() {
            return this.sourceHost;
        }

        public ListShardRecoveriesResponseBodyResult setSourceNode(String sourceNode) {
            this.sourceNode = sourceNode;
            return this;
        }
        public String getSourceNode() {
            return this.sourceNode;
        }

        public ListShardRecoveriesResponseBodyResult setStage(String stage) {
            this.stage = stage;
            return this;
        }
        public String getStage() {
            return this.stage;
        }

        public ListShardRecoveriesResponseBodyResult setTargetHost(String targetHost) {
            this.targetHost = targetHost;
            return this;
        }
        public String getTargetHost() {
            return this.targetHost;
        }

        public ListShardRecoveriesResponseBodyResult setTargetNode(String targetNode) {
            this.targetNode = targetNode;
            return this;
        }
        public String getTargetNode() {
            return this.targetNode;
        }

        public ListShardRecoveriesResponseBodyResult setTranslogOps(Long translogOps) {
            this.translogOps = translogOps;
            return this;
        }
        public Long getTranslogOps() {
            return this.translogOps;
        }

        public ListShardRecoveriesResponseBodyResult setTranslogOpsPercent(String translogOpsPercent) {
            this.translogOpsPercent = translogOpsPercent;
            return this;
        }
        public String getTranslogOpsPercent() {
            return this.translogOpsPercent;
        }

    }

}
