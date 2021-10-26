// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeRegionTrafficResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TrafficPerSecond")
    public DescribeRegionTrafficResponseBodyTrafficPerSecond trafficPerSecond;

    public static DescribeRegionTrafficResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionTrafficResponseBody self = new DescribeRegionTrafficResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionTrafficResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRegionTrafficResponseBody setTrafficPerSecond(DescribeRegionTrafficResponseBodyTrafficPerSecond trafficPerSecond) {
        this.trafficPerSecond = trafficPerSecond;
        return this;
    }
    public DescribeRegionTrafficResponseBodyTrafficPerSecond getTrafficPerSecond() {
        return this.trafficPerSecond;
    }

    public static class DescribeRegionTrafficResponseBodyTrafficPerSecondMonitorItem extends TeaModel {
        @NameInMap("ItemValue")
        public String itemValue;

        @NameInMap("ItemTime")
        public String itemTime;

        @NameInMap("Item")
        public String item;

        public static DescribeRegionTrafficResponseBodyTrafficPerSecondMonitorItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionTrafficResponseBodyTrafficPerSecondMonitorItem self = new DescribeRegionTrafficResponseBodyTrafficPerSecondMonitorItem();
            return TeaModel.build(map, self);
        }

        public DescribeRegionTrafficResponseBodyTrafficPerSecondMonitorItem setItemValue(String itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public String getItemValue() {
            return this.itemValue;
        }

        public DescribeRegionTrafficResponseBodyTrafficPerSecondMonitorItem setItemTime(String itemTime) {
            this.itemTime = itemTime;
            return this;
        }
        public String getItemTime() {
            return this.itemTime;
        }

        public DescribeRegionTrafficResponseBodyTrafficPerSecondMonitorItem setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

    }

    public static class DescribeRegionTrafficResponseBodyTrafficPerSecond extends TeaModel {
        @NameInMap("MonitorItem")
        public java.util.List<DescribeRegionTrafficResponseBodyTrafficPerSecondMonitorItem> monitorItem;

        public static DescribeRegionTrafficResponseBodyTrafficPerSecond build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionTrafficResponseBodyTrafficPerSecond self = new DescribeRegionTrafficResponseBodyTrafficPerSecond();
            return TeaModel.build(map, self);
        }

        public DescribeRegionTrafficResponseBodyTrafficPerSecond setMonitorItem(java.util.List<DescribeRegionTrafficResponseBodyTrafficPerSecondMonitorItem> monitorItem) {
            this.monitorItem = monitorItem;
            return this;
        }
        public java.util.List<DescribeRegionTrafficResponseBodyTrafficPerSecondMonitorItem> getMonitorItem() {
            return this.monitorItem;
        }

    }

}
