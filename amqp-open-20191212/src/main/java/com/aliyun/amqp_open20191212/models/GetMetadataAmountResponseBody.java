// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class GetMetadataAmountResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetMetadataAmountResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetMetadataAmountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetadataAmountResponseBody self = new GetMetadataAmountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetadataAmountResponseBody setData(GetMetadataAmountResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMetadataAmountResponseBodyData getData() {
        return this.data;
    }

    public GetMetadataAmountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMetadataAmountResponseBodyData extends TeaModel {
        @NameInMap("CurrentExchanges")
        public Integer currentExchanges;

        @NameInMap("CurrentQueues")
        public Integer currentQueues;

        @NameInMap("CurrentVirtualHosts")
        public Integer currentVirtualHosts;

        @NameInMap("MaxExchanges")
        public Integer maxExchanges;

        @NameInMap("MaxQueues")
        public Integer maxQueues;

        @NameInMap("MaxVirtualHosts")
        public Integer maxVirtualHosts;

        public static GetMetadataAmountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMetadataAmountResponseBodyData self = new GetMetadataAmountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMetadataAmountResponseBodyData setCurrentExchanges(Integer currentExchanges) {
            this.currentExchanges = currentExchanges;
            return this;
        }
        public Integer getCurrentExchanges() {
            return this.currentExchanges;
        }

        public GetMetadataAmountResponseBodyData setCurrentQueues(Integer currentQueues) {
            this.currentQueues = currentQueues;
            return this;
        }
        public Integer getCurrentQueues() {
            return this.currentQueues;
        }

        public GetMetadataAmountResponseBodyData setCurrentVirtualHosts(Integer currentVirtualHosts) {
            this.currentVirtualHosts = currentVirtualHosts;
            return this;
        }
        public Integer getCurrentVirtualHosts() {
            return this.currentVirtualHosts;
        }

        public GetMetadataAmountResponseBodyData setMaxExchanges(Integer maxExchanges) {
            this.maxExchanges = maxExchanges;
            return this;
        }
        public Integer getMaxExchanges() {
            return this.maxExchanges;
        }

        public GetMetadataAmountResponseBodyData setMaxQueues(Integer maxQueues) {
            this.maxQueues = maxQueues;
            return this;
        }
        public Integer getMaxQueues() {
            return this.maxQueues;
        }

        public GetMetadataAmountResponseBodyData setMaxVirtualHosts(Integer maxVirtualHosts) {
            this.maxVirtualHosts = maxVirtualHosts;
            return this;
        }
        public Integer getMaxVirtualHosts() {
            return this.maxVirtualHosts;
        }

    }

}
