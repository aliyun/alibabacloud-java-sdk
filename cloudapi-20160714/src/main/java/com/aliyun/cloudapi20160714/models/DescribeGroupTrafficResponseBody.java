// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeGroupTrafficResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TrafficPerSecond")
    public DescribeGroupTrafficResponseBodyTrafficPerSecond trafficPerSecond;

    public static DescribeGroupTrafficResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupTrafficResponseBody self = new DescribeGroupTrafficResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGroupTrafficResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGroupTrafficResponseBody setTrafficPerSecond(DescribeGroupTrafficResponseBodyTrafficPerSecond trafficPerSecond) {
        this.trafficPerSecond = trafficPerSecond;
        return this;
    }
    public DescribeGroupTrafficResponseBodyTrafficPerSecond getTrafficPerSecond() {
        return this.trafficPerSecond;
    }

    public static class DescribeGroupTrafficResponseBodyTrafficPerSecondMonitorItem extends TeaModel {
        @NameInMap("Item")
        public String item;

        @NameInMap("ItemTime")
        public String itemTime;

        @NameInMap("ItemValue")
        public String itemValue;

        public static DescribeGroupTrafficResponseBodyTrafficPerSecondMonitorItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupTrafficResponseBodyTrafficPerSecondMonitorItem self = new DescribeGroupTrafficResponseBodyTrafficPerSecondMonitorItem();
            return TeaModel.build(map, self);
        }

        public DescribeGroupTrafficResponseBodyTrafficPerSecondMonitorItem setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public DescribeGroupTrafficResponseBodyTrafficPerSecondMonitorItem setItemTime(String itemTime) {
            this.itemTime = itemTime;
            return this;
        }
        public String getItemTime() {
            return this.itemTime;
        }

        public DescribeGroupTrafficResponseBodyTrafficPerSecondMonitorItem setItemValue(String itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public String getItemValue() {
            return this.itemValue;
        }

    }

    public static class DescribeGroupTrafficResponseBodyTrafficPerSecond extends TeaModel {
        @NameInMap("MonitorItem")
        public java.util.List<DescribeGroupTrafficResponseBodyTrafficPerSecondMonitorItem> monitorItem;

        public static DescribeGroupTrafficResponseBodyTrafficPerSecond build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupTrafficResponseBodyTrafficPerSecond self = new DescribeGroupTrafficResponseBodyTrafficPerSecond();
            return TeaModel.build(map, self);
        }

        public DescribeGroupTrafficResponseBodyTrafficPerSecond setMonitorItem(java.util.List<DescribeGroupTrafficResponseBodyTrafficPerSecondMonitorItem> monitorItem) {
            this.monitorItem = monitorItem;
            return this;
        }
        public java.util.List<DescribeGroupTrafficResponseBodyTrafficPerSecondMonitorItem> getMonitorItem() {
            return this.monitorItem;
        }

    }

}
