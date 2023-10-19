// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiLatencyDataResponseBody extends TeaModel {
    /**
     * <p>The returned information about API call latency. It is an array consisting of MonitorItem data.</p>
     */
    @NameInMap("CallLatencys")
    public DescribeApiLatencyDataResponseBodyCallLatencys callLatencys;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeApiLatencyDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiLatencyDataResponseBody self = new DescribeApiLatencyDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApiLatencyDataResponseBody setCallLatencys(DescribeApiLatencyDataResponseBodyCallLatencys callLatencys) {
        this.callLatencys = callLatencys;
        return this;
    }
    public DescribeApiLatencyDataResponseBodyCallLatencys getCallLatencys() {
        return this.callLatencys;
    }

    public DescribeApiLatencyDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeApiLatencyDataResponseBodyCallLatencysMonitorItem extends TeaModel {
        /**
         * <p>The time of the monitoring metric. The time format follows the ISO 8601 standard and UTC time is used. Format: YYYY-MM-DDThh:mm:ssZ</p>
         */
        @NameInMap("ItemTime")
        public String itemTime;

        /**
         * <p>The value corresponding to the monitoring metric.</p>
         */
        @NameInMap("ItemValue")
        public String itemValue;

        public static DescribeApiLatencyDataResponseBodyCallLatencysMonitorItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiLatencyDataResponseBodyCallLatencysMonitorItem self = new DescribeApiLatencyDataResponseBodyCallLatencysMonitorItem();
            return TeaModel.build(map, self);
        }

        public DescribeApiLatencyDataResponseBodyCallLatencysMonitorItem setItemTime(String itemTime) {
            this.itemTime = itemTime;
            return this;
        }
        public String getItemTime() {
            return this.itemTime;
        }

        public DescribeApiLatencyDataResponseBodyCallLatencysMonitorItem setItemValue(String itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public String getItemValue() {
            return this.itemValue;
        }

    }

    public static class DescribeApiLatencyDataResponseBodyCallLatencys extends TeaModel {
        @NameInMap("MonitorItem")
        public java.util.List<DescribeApiLatencyDataResponseBodyCallLatencysMonitorItem> monitorItem;

        public static DescribeApiLatencyDataResponseBodyCallLatencys build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiLatencyDataResponseBodyCallLatencys self = new DescribeApiLatencyDataResponseBodyCallLatencys();
            return TeaModel.build(map, self);
        }

        public DescribeApiLatencyDataResponseBodyCallLatencys setMonitorItem(java.util.List<DescribeApiLatencyDataResponseBodyCallLatencysMonitorItem> monitorItem) {
            this.monitorItem = monitorItem;
            return this;
        }
        public java.util.List<DescribeApiLatencyDataResponseBodyCallLatencysMonitorItem> getMonitorItem() {
            return this.monitorItem;
        }

    }

}
