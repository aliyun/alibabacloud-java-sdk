// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstanceDropConnectionsResponseBody extends TeaModel {
    @NameInMap("InstanceDropConnections")
    public DescribeInstanceDropConnectionsResponseBodyInstanceDropConnections instanceDropConnections;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceDropConnectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceDropConnectionsResponseBody self = new DescribeInstanceDropConnectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceDropConnectionsResponseBody setInstanceDropConnections(DescribeInstanceDropConnectionsResponseBodyInstanceDropConnections instanceDropConnections) {
        this.instanceDropConnections = instanceDropConnections;
        return this;
    }
    public DescribeInstanceDropConnectionsResponseBodyInstanceDropConnections getInstanceDropConnections() {
        return this.instanceDropConnections;
    }

    public DescribeInstanceDropConnectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceDropConnectionsResponseBodyInstanceDropConnectionsMonitorItem extends TeaModel {
        @NameInMap("ItemTime")
        public String itemTime;

        @NameInMap("ItemValue")
        public String itemValue;

        public static DescribeInstanceDropConnectionsResponseBodyInstanceDropConnectionsMonitorItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceDropConnectionsResponseBodyInstanceDropConnectionsMonitorItem self = new DescribeInstanceDropConnectionsResponseBodyInstanceDropConnectionsMonitorItem();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceDropConnectionsResponseBodyInstanceDropConnectionsMonitorItem setItemTime(String itemTime) {
            this.itemTime = itemTime;
            return this;
        }
        public String getItemTime() {
            return this.itemTime;
        }

        public DescribeInstanceDropConnectionsResponseBodyInstanceDropConnectionsMonitorItem setItemValue(String itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public String getItemValue() {
            return this.itemValue;
        }

    }

    public static class DescribeInstanceDropConnectionsResponseBodyInstanceDropConnections extends TeaModel {
        @NameInMap("MonitorItem")
        public java.util.List<DescribeInstanceDropConnectionsResponseBodyInstanceDropConnectionsMonitorItem> monitorItem;

        public static DescribeInstanceDropConnectionsResponseBodyInstanceDropConnections build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceDropConnectionsResponseBodyInstanceDropConnections self = new DescribeInstanceDropConnectionsResponseBodyInstanceDropConnections();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceDropConnectionsResponseBodyInstanceDropConnections setMonitorItem(java.util.List<DescribeInstanceDropConnectionsResponseBodyInstanceDropConnectionsMonitorItem> monitorItem) {
            this.monitorItem = monitorItem;
            return this;
        }
        public java.util.List<DescribeInstanceDropConnectionsResponseBodyInstanceDropConnectionsMonitorItem> getMonitorItem() {
            return this.monitorItem;
        }

    }

}
