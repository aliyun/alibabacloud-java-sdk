// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class GetQueueInputStatisticInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("QueueInputList")
    public GetQueueInputStatisticInfoResponseBodyQueueInputList queueInputList;

    public static GetQueueInputStatisticInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQueueInputStatisticInfoResponseBody self = new GetQueueInputStatisticInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQueueInputStatisticInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQueueInputStatisticInfoResponseBody setQueueInputList(GetQueueInputStatisticInfoResponseBodyQueueInputList queueInputList) {
        this.queueInputList = queueInputList;
        return this;
    }
    public GetQueueInputStatisticInfoResponseBodyQueueInputList getQueueInputList() {
        return this.queueInputList;
    }

    public static class GetQueueInputStatisticInfoResponseBodyQueueInputListClusterStatQueueInput extends TeaModel {
        @NameInMap("BytesInput")
        public Long bytesInput;

        @NameInMap("Queue")
        public String queue;

        public static GetQueueInputStatisticInfoResponseBodyQueueInputListClusterStatQueueInput build(java.util.Map<String, ?> map) throws Exception {
            GetQueueInputStatisticInfoResponseBodyQueueInputListClusterStatQueueInput self = new GetQueueInputStatisticInfoResponseBodyQueueInputListClusterStatQueueInput();
            return TeaModel.build(map, self);
        }

        public GetQueueInputStatisticInfoResponseBodyQueueInputListClusterStatQueueInput setBytesInput(Long bytesInput) {
            this.bytesInput = bytesInput;
            return this;
        }
        public Long getBytesInput() {
            return this.bytesInput;
        }

        public GetQueueInputStatisticInfoResponseBodyQueueInputListClusterStatQueueInput setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

    }

    public static class GetQueueInputStatisticInfoResponseBodyQueueInputList extends TeaModel {
        @NameInMap("ClusterStatQueueInput")
        public java.util.List<GetQueueInputStatisticInfoResponseBodyQueueInputListClusterStatQueueInput> clusterStatQueueInput;

        public static GetQueueInputStatisticInfoResponseBodyQueueInputList build(java.util.Map<String, ?> map) throws Exception {
            GetQueueInputStatisticInfoResponseBodyQueueInputList self = new GetQueueInputStatisticInfoResponseBodyQueueInputList();
            return TeaModel.build(map, self);
        }

        public GetQueueInputStatisticInfoResponseBodyQueueInputList setClusterStatQueueInput(java.util.List<GetQueueInputStatisticInfoResponseBodyQueueInputListClusterStatQueueInput> clusterStatQueueInput) {
            this.clusterStatQueueInput = clusterStatQueueInput;
            return this;
        }
        public java.util.List<GetQueueInputStatisticInfoResponseBodyQueueInputListClusterStatQueueInput> getClusterStatQueueInput() {
            return this.clusterStatQueueInput;
        }

    }

}
