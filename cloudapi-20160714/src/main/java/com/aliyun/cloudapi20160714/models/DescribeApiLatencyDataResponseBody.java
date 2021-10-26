// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiLatencyDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CallLatencys")
    public DescribeApiLatencyDataResponseBodyCallLatencys callLatencys;

    public static DescribeApiLatencyDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiLatencyDataResponseBody self = new DescribeApiLatencyDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApiLatencyDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApiLatencyDataResponseBody setCallLatencys(DescribeApiLatencyDataResponseBodyCallLatencys callLatencys) {
        this.callLatencys = callLatencys;
        return this;
    }
    public DescribeApiLatencyDataResponseBodyCallLatencys getCallLatencys() {
        return this.callLatencys;
    }

    public static class DescribeApiLatencyDataResponseBodyCallLatencysMonitorItem extends TeaModel {
        @NameInMap("ItemValue")
        public String itemValue;

        @NameInMap("ItemTime")
        public String itemTime;

        public static DescribeApiLatencyDataResponseBodyCallLatencysMonitorItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiLatencyDataResponseBodyCallLatencysMonitorItem self = new DescribeApiLatencyDataResponseBodyCallLatencysMonitorItem();
            return TeaModel.build(map, self);
        }

        public DescribeApiLatencyDataResponseBodyCallLatencysMonitorItem setItemValue(String itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public String getItemValue() {
            return this.itemValue;
        }

        public DescribeApiLatencyDataResponseBodyCallLatencysMonitorItem setItemTime(String itemTime) {
            this.itemTime = itemTime;
            return this;
        }
        public String getItemTime() {
            return this.itemTime;
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
