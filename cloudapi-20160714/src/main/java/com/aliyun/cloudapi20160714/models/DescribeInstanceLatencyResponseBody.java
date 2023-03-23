// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstanceLatencyResponseBody extends TeaModel {
    /**
     * <p>The list of average latencies in the instance.</p>
     */
    @NameInMap("InstanceLatency")
    public DescribeInstanceLatencyResponseBodyInstanceLatency instanceLatency;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceLatencyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceLatencyResponseBody self = new DescribeInstanceLatencyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceLatencyResponseBody setInstanceLatency(DescribeInstanceLatencyResponseBodyInstanceLatency instanceLatency) {
        this.instanceLatency = instanceLatency;
        return this;
    }
    public DescribeInstanceLatencyResponseBodyInstanceLatency getInstanceLatency() {
        return this.instanceLatency;
    }

    public DescribeInstanceLatencyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceLatencyResponseBodyInstanceLatencyMonitorItem extends TeaModel {
        /**
         * <p>The metric. Valid values:</p>
         * <br>
         * <p>*   gatewayLatency API: the processing latency of API Gateway</p>
         * <p>*   latency: the processing latency of the backend service.</p>
         */
        @NameInMap("Item")
        public String item;

        /**
         * <p>The monitoring time. The time follows the ISO 8601 standard and UTC time is used. Format: YYYY-MM-DDThh:mm:ssZ</p>
         */
        @NameInMap("ItemTime")
        public String itemTime;

        /**
         * <p>The value of the average latency.</p>
         */
        @NameInMap("ItemValue")
        public String itemValue;

        public static DescribeInstanceLatencyResponseBodyInstanceLatencyMonitorItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceLatencyResponseBodyInstanceLatencyMonitorItem self = new DescribeInstanceLatencyResponseBodyInstanceLatencyMonitorItem();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceLatencyResponseBodyInstanceLatencyMonitorItem setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public DescribeInstanceLatencyResponseBodyInstanceLatencyMonitorItem setItemTime(String itemTime) {
            this.itemTime = itemTime;
            return this;
        }
        public String getItemTime() {
            return this.itemTime;
        }

        public DescribeInstanceLatencyResponseBodyInstanceLatencyMonitorItem setItemValue(String itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public String getItemValue() {
            return this.itemValue;
        }

    }

    public static class DescribeInstanceLatencyResponseBodyInstanceLatency extends TeaModel {
        @NameInMap("MonitorItem")
        public java.util.List<DescribeInstanceLatencyResponseBodyInstanceLatencyMonitorItem> monitorItem;

        public static DescribeInstanceLatencyResponseBodyInstanceLatency build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceLatencyResponseBodyInstanceLatency self = new DescribeInstanceLatencyResponseBodyInstanceLatency();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceLatencyResponseBodyInstanceLatency setMonitorItem(java.util.List<DescribeInstanceLatencyResponseBodyInstanceLatencyMonitorItem> monitorItem) {
            this.monitorItem = monitorItem;
            return this;
        }
        public java.util.List<DescribeInstanceLatencyResponseBodyInstanceLatencyMonitorItem> getMonitorItem() {
            return this.monitorItem;
        }

    }

}
