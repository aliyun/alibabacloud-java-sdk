// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstanceLatencyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceLatency")
    public DescribeInstanceLatencyResponseBodyInstanceLatency instanceLatency;

    public static DescribeInstanceLatencyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceLatencyResponseBody self = new DescribeInstanceLatencyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceLatencyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceLatencyResponseBody setInstanceLatency(DescribeInstanceLatencyResponseBodyInstanceLatency instanceLatency) {
        this.instanceLatency = instanceLatency;
        return this;
    }
    public DescribeInstanceLatencyResponseBodyInstanceLatency getInstanceLatency() {
        return this.instanceLatency;
    }

    public static class DescribeInstanceLatencyResponseBodyInstanceLatencyMonitorItem extends TeaModel {
        @NameInMap("ItemValue")
        public String itemValue;

        @NameInMap("ItemTime")
        public String itemTime;

        @NameInMap("Item")
        public String item;

        public static DescribeInstanceLatencyResponseBodyInstanceLatencyMonitorItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceLatencyResponseBodyInstanceLatencyMonitorItem self = new DescribeInstanceLatencyResponseBodyInstanceLatencyMonitorItem();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceLatencyResponseBodyInstanceLatencyMonitorItem setItemValue(String itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public String getItemValue() {
            return this.itemValue;
        }

        public DescribeInstanceLatencyResponseBodyInstanceLatencyMonitorItem setItemTime(String itemTime) {
            this.itemTime = itemTime;
            return this;
        }
        public String getItemTime() {
            return this.itemTime;
        }

        public DescribeInstanceLatencyResponseBodyInstanceLatencyMonitorItem setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
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
