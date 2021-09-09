// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListShardRecoveriesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("index")
        public String index;

        @NameInMap("sourceHost")
        public String sourceHost;

        @NameInMap("sourceNode")
        public String sourceNode;

        @NameInMap("filesTotal")
        public Long filesTotal;

        @NameInMap("bytesPercent")
        public String bytesPercent;

        @NameInMap("translogOps")
        public Long translogOps;

        @NameInMap("translogOpsPercent")
        public String translogOpsPercent;

        @NameInMap("bytesTotal")
        public Long bytesTotal;

        @NameInMap("targetHost")
        public String targetHost;

        @NameInMap("targetNode")
        public String targetNode;

        @NameInMap("filesPercent")
        public String filesPercent;

        @NameInMap("stage")
        public String stage;

        public static ListShardRecoveriesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListShardRecoveriesResponseBodyResult self = new ListShardRecoveriesResponseBodyResult();
            return TeaModel.build(map, self);
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

        public ListShardRecoveriesResponseBodyResult setFilesTotal(Long filesTotal) {
            this.filesTotal = filesTotal;
            return this;
        }
        public Long getFilesTotal() {
            return this.filesTotal;
        }

        public ListShardRecoveriesResponseBodyResult setBytesPercent(String bytesPercent) {
            this.bytesPercent = bytesPercent;
            return this;
        }
        public String getBytesPercent() {
            return this.bytesPercent;
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

        public ListShardRecoveriesResponseBodyResult setBytesTotal(Long bytesTotal) {
            this.bytesTotal = bytesTotal;
            return this;
        }
        public Long getBytesTotal() {
            return this.bytesTotal;
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

        public ListShardRecoveriesResponseBodyResult setFilesPercent(String filesPercent) {
            this.filesPercent = filesPercent;
            return this;
        }
        public String getFilesPercent() {
            return this.filesPercent;
        }

        public ListShardRecoveriesResponseBodyResult setStage(String stage) {
            this.stage = stage;
            return this;
        }
        public String getStage() {
            return this.stage;
        }

    }

}
