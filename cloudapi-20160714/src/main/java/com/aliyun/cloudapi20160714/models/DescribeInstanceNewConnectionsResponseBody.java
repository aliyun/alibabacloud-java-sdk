// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstanceNewConnectionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceNewConnections")
    public DescribeInstanceNewConnectionsResponseBodyInstanceNewConnections instanceNewConnections;

    public static DescribeInstanceNewConnectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceNewConnectionsResponseBody self = new DescribeInstanceNewConnectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceNewConnectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceNewConnectionsResponseBody setInstanceNewConnections(DescribeInstanceNewConnectionsResponseBodyInstanceNewConnections instanceNewConnections) {
        this.instanceNewConnections = instanceNewConnections;
        return this;
    }
    public DescribeInstanceNewConnectionsResponseBodyInstanceNewConnections getInstanceNewConnections() {
        return this.instanceNewConnections;
    }

    public static class DescribeInstanceNewConnectionsResponseBodyInstanceNewConnectionsMonitorItem extends TeaModel {
        @NameInMap("ItemValue")
        public String itemValue;

        @NameInMap("ItemTime")
        public String itemTime;

        public static DescribeInstanceNewConnectionsResponseBodyInstanceNewConnectionsMonitorItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceNewConnectionsResponseBodyInstanceNewConnectionsMonitorItem self = new DescribeInstanceNewConnectionsResponseBodyInstanceNewConnectionsMonitorItem();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceNewConnectionsResponseBodyInstanceNewConnectionsMonitorItem setItemValue(String itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public String getItemValue() {
            return this.itemValue;
        }

        public DescribeInstanceNewConnectionsResponseBodyInstanceNewConnectionsMonitorItem setItemTime(String itemTime) {
            this.itemTime = itemTime;
            return this;
        }
        public String getItemTime() {
            return this.itemTime;
        }

    }

    public static class DescribeInstanceNewConnectionsResponseBodyInstanceNewConnections extends TeaModel {
        @NameInMap("MonitorItem")
        public java.util.List<DescribeInstanceNewConnectionsResponseBodyInstanceNewConnectionsMonitorItem> monitorItem;

        public static DescribeInstanceNewConnectionsResponseBodyInstanceNewConnections build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceNewConnectionsResponseBodyInstanceNewConnections self = new DescribeInstanceNewConnectionsResponseBodyInstanceNewConnections();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceNewConnectionsResponseBodyInstanceNewConnections setMonitorItem(java.util.List<DescribeInstanceNewConnectionsResponseBodyInstanceNewConnectionsMonitorItem> monitorItem) {
            this.monitorItem = monitorItem;
            return this;
        }
        public java.util.List<DescribeInstanceNewConnectionsResponseBodyInstanceNewConnectionsMonitorItem> getMonitorItem() {
            return this.monitorItem;
        }

    }

}
