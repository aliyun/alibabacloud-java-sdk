// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class GetMetadataAmountResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetMetadataAmountResponseBodyData data;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The number of created exchanges on the ApsaraMQ for RabbitMQ instance.</p>
         */
        @NameInMap("CurrentExchanges")
        public Integer currentExchanges;

        /**
         * <p>The number of created queues on the ApsaraMQ for RabbitMQ instance.</p>
         */
        @NameInMap("CurrentQueues")
        public Integer currentQueues;

        /**
         * <p>The number of created vhosts on the ApsaraMQ for RabbitMQ instance.</p>
         */
        @NameInMap("CurrentVirtualHosts")
        public Integer currentVirtualHosts;

        /**
         * <p>The maximum number of exchanges that can be created on the ApsaraMQ for RabbitMQ instance.</p>
         */
        @NameInMap("MaxExchanges")
        public Integer maxExchanges;

        /**
         * <p>The maximum number of queues that can be created on the ApsaraMQ for RabbitMQ instance.</p>
         */
        @NameInMap("MaxQueues")
        public Integer maxQueues;

        /**
         * <p>The maximum number of vhosts that can be created on the ApsaraMQ for RabbitMQ instance.</p>
         */
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
