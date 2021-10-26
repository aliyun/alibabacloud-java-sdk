// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeRegionQpsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RegionQps")
    public DescribeRegionQpsResponseBodyRegionQps regionQps;

    public static DescribeRegionQpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionQpsResponseBody self = new DescribeRegionQpsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionQpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRegionQpsResponseBody setRegionQps(DescribeRegionQpsResponseBodyRegionQps regionQps) {
        this.regionQps = regionQps;
        return this;
    }
    public DescribeRegionQpsResponseBodyRegionQps getRegionQps() {
        return this.regionQps;
    }

    public static class DescribeRegionQpsResponseBodyRegionQpsMonitorItem extends TeaModel {
        @NameInMap("ItemValue")
        public String itemValue;

        @NameInMap("ItemTime")
        public String itemTime;

        public static DescribeRegionQpsResponseBodyRegionQpsMonitorItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionQpsResponseBodyRegionQpsMonitorItem self = new DescribeRegionQpsResponseBodyRegionQpsMonitorItem();
            return TeaModel.build(map, self);
        }

        public DescribeRegionQpsResponseBodyRegionQpsMonitorItem setItemValue(String itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public String getItemValue() {
            return this.itemValue;
        }

        public DescribeRegionQpsResponseBodyRegionQpsMonitorItem setItemTime(String itemTime) {
            this.itemTime = itemTime;
            return this;
        }
        public String getItemTime() {
            return this.itemTime;
        }

    }

    public static class DescribeRegionQpsResponseBodyRegionQps extends TeaModel {
        @NameInMap("MonitorItem")
        public java.util.List<DescribeRegionQpsResponseBodyRegionQpsMonitorItem> monitorItem;

        public static DescribeRegionQpsResponseBodyRegionQps build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionQpsResponseBodyRegionQps self = new DescribeRegionQpsResponseBodyRegionQps();
            return TeaModel.build(map, self);
        }

        public DescribeRegionQpsResponseBodyRegionQps setMonitorItem(java.util.List<DescribeRegionQpsResponseBodyRegionQpsMonitorItem> monitorItem) {
            this.monitorItem = monitorItem;
            return this;
        }
        public java.util.List<DescribeRegionQpsResponseBodyRegionQpsMonitorItem> getMonitorItem() {
            return this.monitorItem;
        }

    }

}
