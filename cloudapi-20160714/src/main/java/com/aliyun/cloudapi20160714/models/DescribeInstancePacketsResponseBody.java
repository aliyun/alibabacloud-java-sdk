// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstancePacketsResponseBody extends TeaModel {
    @NameInMap("InstancePackets")
    public DescribeInstancePacketsResponseBodyInstancePackets instancePackets;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstancePacketsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancePacketsResponseBody self = new DescribeInstancePacketsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstancePacketsResponseBody setInstancePackets(DescribeInstancePacketsResponseBodyInstancePackets instancePackets) {
        this.instancePackets = instancePackets;
        return this;
    }
    public DescribeInstancePacketsResponseBodyInstancePackets getInstancePackets() {
        return this.instancePackets;
    }

    public DescribeInstancePacketsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstancePacketsResponseBodyInstancePacketsMonitorItem extends TeaModel {
        @NameInMap("Item")
        public String item;

        @NameInMap("ItemTime")
        public String itemTime;

        @NameInMap("ItemValue")
        public String itemValue;

        public static DescribeInstancePacketsResponseBodyInstancePacketsMonitorItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancePacketsResponseBodyInstancePacketsMonitorItem self = new DescribeInstancePacketsResponseBodyInstancePacketsMonitorItem();
            return TeaModel.build(map, self);
        }

        public DescribeInstancePacketsResponseBodyInstancePacketsMonitorItem setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public DescribeInstancePacketsResponseBodyInstancePacketsMonitorItem setItemTime(String itemTime) {
            this.itemTime = itemTime;
            return this;
        }
        public String getItemTime() {
            return this.itemTime;
        }

        public DescribeInstancePacketsResponseBodyInstancePacketsMonitorItem setItemValue(String itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public String getItemValue() {
            return this.itemValue;
        }

    }

    public static class DescribeInstancePacketsResponseBodyInstancePackets extends TeaModel {
        @NameInMap("MonitorItem")
        public java.util.List<DescribeInstancePacketsResponseBodyInstancePacketsMonitorItem> monitorItem;

        public static DescribeInstancePacketsResponseBodyInstancePackets build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancePacketsResponseBodyInstancePackets self = new DescribeInstancePacketsResponseBodyInstancePackets();
            return TeaModel.build(map, self);
        }

        public DescribeInstancePacketsResponseBodyInstancePackets setMonitorItem(java.util.List<DescribeInstancePacketsResponseBodyInstancePacketsMonitorItem> monitorItem) {
            this.monitorItem = monitorItem;
            return this;
        }
        public java.util.List<DescribeInstancePacketsResponseBodyInstancePacketsMonitorItem> getMonitorItem() {
            return this.monitorItem;
        }

    }

}
