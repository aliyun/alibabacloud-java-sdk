// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class GetQueueOutputStatisticInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("QueueOutputList")
    public GetQueueOutputStatisticInfoResponseBodyQueueOutputList queueOutputList;

    public static GetQueueOutputStatisticInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQueueOutputStatisticInfoResponseBody self = new GetQueueOutputStatisticInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQueueOutputStatisticInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQueueOutputStatisticInfoResponseBody setQueueOutputList(GetQueueOutputStatisticInfoResponseBodyQueueOutputList queueOutputList) {
        this.queueOutputList = queueOutputList;
        return this;
    }
    public GetQueueOutputStatisticInfoResponseBodyQueueOutputList getQueueOutputList() {
        return this.queueOutputList;
    }

    public static class GetQueueOutputStatisticInfoResponseBodyQueueOutputListClusterStatQueueOutput extends TeaModel {
        @NameInMap("Queue")
        public String queue;

        @NameInMap("BytesOutput")
        public Long bytesOutput;

        public static GetQueueOutputStatisticInfoResponseBodyQueueOutputListClusterStatQueueOutput build(java.util.Map<String, ?> map) throws Exception {
            GetQueueOutputStatisticInfoResponseBodyQueueOutputListClusterStatQueueOutput self = new GetQueueOutputStatisticInfoResponseBodyQueueOutputListClusterStatQueueOutput();
            return TeaModel.build(map, self);
        }

        public GetQueueOutputStatisticInfoResponseBodyQueueOutputListClusterStatQueueOutput setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

        public GetQueueOutputStatisticInfoResponseBodyQueueOutputListClusterStatQueueOutput setBytesOutput(Long bytesOutput) {
            this.bytesOutput = bytesOutput;
            return this;
        }
        public Long getBytesOutput() {
            return this.bytesOutput;
        }

    }

    public static class GetQueueOutputStatisticInfoResponseBodyQueueOutputList extends TeaModel {
        @NameInMap("ClusterStatQueueOutput")
        public java.util.List<GetQueueOutputStatisticInfoResponseBodyQueueOutputListClusterStatQueueOutput> clusterStatQueueOutput;

        public static GetQueueOutputStatisticInfoResponseBodyQueueOutputList build(java.util.Map<String, ?> map) throws Exception {
            GetQueueOutputStatisticInfoResponseBodyQueueOutputList self = new GetQueueOutputStatisticInfoResponseBodyQueueOutputList();
            return TeaModel.build(map, self);
        }

        public GetQueueOutputStatisticInfoResponseBodyQueueOutputList setClusterStatQueueOutput(java.util.List<GetQueueOutputStatisticInfoResponseBodyQueueOutputListClusterStatQueueOutput> clusterStatQueueOutput) {
            this.clusterStatQueueOutput = clusterStatQueueOutput;
            return this;
        }
        public java.util.List<GetQueueOutputStatisticInfoResponseBodyQueueOutputListClusterStatQueueOutput> getClusterStatQueueOutput() {
            return this.clusterStatQueueOutput;
        }

    }

}
