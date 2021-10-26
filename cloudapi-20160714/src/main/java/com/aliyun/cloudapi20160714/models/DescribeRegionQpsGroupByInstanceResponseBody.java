// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeRegionQpsGroupByInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceQps")
    public DescribeRegionQpsGroupByInstanceResponseBodyInstanceQps instanceQps;

    public static DescribeRegionQpsGroupByInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionQpsGroupByInstanceResponseBody self = new DescribeRegionQpsGroupByInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionQpsGroupByInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRegionQpsGroupByInstanceResponseBody setInstanceQps(DescribeRegionQpsGroupByInstanceResponseBodyInstanceQps instanceQps) {
        this.instanceQps = instanceQps;
        return this;
    }
    public DescribeRegionQpsGroupByInstanceResponseBodyInstanceQps getInstanceQps() {
        return this.instanceQps;
    }

    public static class DescribeRegionQpsGroupByInstanceResponseBodyInstanceQpsMonitorItem extends TeaModel {
        @NameInMap("ItemValue")
        public String itemValue;

        @NameInMap("ItemTime")
        public String itemTime;

        @NameInMap("Item")
        public String item;

        public static DescribeRegionQpsGroupByInstanceResponseBodyInstanceQpsMonitorItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionQpsGroupByInstanceResponseBodyInstanceQpsMonitorItem self = new DescribeRegionQpsGroupByInstanceResponseBodyInstanceQpsMonitorItem();
            return TeaModel.build(map, self);
        }

        public DescribeRegionQpsGroupByInstanceResponseBodyInstanceQpsMonitorItem setItemValue(String itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public String getItemValue() {
            return this.itemValue;
        }

        public DescribeRegionQpsGroupByInstanceResponseBodyInstanceQpsMonitorItem setItemTime(String itemTime) {
            this.itemTime = itemTime;
            return this;
        }
        public String getItemTime() {
            return this.itemTime;
        }

        public DescribeRegionQpsGroupByInstanceResponseBodyInstanceQpsMonitorItem setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

    }

    public static class DescribeRegionQpsGroupByInstanceResponseBodyInstanceQps extends TeaModel {
        @NameInMap("MonitorItem")
        public java.util.List<DescribeRegionQpsGroupByInstanceResponseBodyInstanceQpsMonitorItem> monitorItem;

        public static DescribeRegionQpsGroupByInstanceResponseBodyInstanceQps build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionQpsGroupByInstanceResponseBodyInstanceQps self = new DescribeRegionQpsGroupByInstanceResponseBodyInstanceQps();
            return TeaModel.build(map, self);
        }

        public DescribeRegionQpsGroupByInstanceResponseBodyInstanceQps setMonitorItem(java.util.List<DescribeRegionQpsGroupByInstanceResponseBodyInstanceQpsMonitorItem> monitorItem) {
            this.monitorItem = monitorItem;
            return this;
        }
        public java.util.List<DescribeRegionQpsGroupByInstanceResponseBodyInstanceQpsMonitorItem> getMonitorItem() {
            return this.monitorItem;
        }

    }

}
