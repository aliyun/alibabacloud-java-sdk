// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListShardRecoveriesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F99407AB-2FA9-489E-A259-40CF6DCC47D9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned results.</p>
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
         * <p>The data recovery progress.</p>
         * 
         * <strong>example:</strong>
         * <p>80%</p>
         */
        @NameInMap("bytesPercent")
        public String bytesPercent;

        /**
         * <p>The total amount of data to be recovered.</p>
         * 
         * <strong>example:</strong>
         * <p>12086</p>
         */
        @NameInMap("bytesTotal")
        public Long bytesTotal;

        /**
         * <p>The file recovery progress.</p>
         * 
         * <strong>example:</strong>
         * <p>80.0%</p>
         */
        @NameInMap("filesPercent")
        public String filesPercent;

        /**
         * <p>The total number of files.</p>
         * 
         * <strong>example:</strong>
         * <p>79</p>
         */
        @NameInMap("filesTotal")
        public Long filesTotal;

        /**
         * <p>The index name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-index-000001</p>
         */
        @NameInMap("index")
        public String index;

        /**
         * <p>The IP address of the source node.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("sourceHost")
        public String sourceHost;

        /**
         * <p>The source node.</p>
         * 
         * <strong>example:</strong>
         * <p>2Kni3dJ</p>
         */
        @NameInMap("sourceNode")
        public String sourceNode;

        /**
         * <p>The stage of the data recovery process. Valid values:</p>
         * <ul>
         * <li><p>done: Recovery is complete.</p>
         * </li>
         * <li><p>finalize: Cleanup operations are in progress.</p>
         * </li>
         * <li><p>index: Reading index metadata and copying bytes from the source to the target.</p>
         * </li>
         * <li><p>init: Recovery has not started.</p>
         * </li>
         * <li><p>start: Recovery is starting.</p>
         * </li>
         * <li><p>translog: Replaying the transaction log.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>done</p>
         */
        @NameInMap("stage")
        public String stage;

        /**
         * <p>The IP address of the target node.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("targetHost")
        public String targetHost;

        /**
         * <p>The target node.</p>
         * 
         * <strong>example:</strong>
         * <p>YVVKLmW</p>
         */
        @NameInMap("targetNode")
        public String targetNode;

        /**
         * <p>The number of translog operations to be recovered.</p>
         * 
         * <strong>example:</strong>
         * <p>12086</p>
         */
        @NameInMap("translogOps")
        public Long translogOps;

        /**
         * <p>The progress of translog operation recovery.</p>
         * 
         * <strong>example:</strong>
         * <p>80%</p>
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
