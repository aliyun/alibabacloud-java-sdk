// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstanceNewConnectionsResponseBody extends TeaModel {
    /**
     * <p>The list of new connections in the instance.</p>
     */
    @NameInMap("InstanceNewConnections")
    public DescribeInstanceNewConnectionsResponseBodyInstanceNewConnections instanceNewConnections;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceNewConnectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceNewConnectionsResponseBody self = new DescribeInstanceNewConnectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceNewConnectionsResponseBody setInstanceNewConnections(DescribeInstanceNewConnectionsResponseBodyInstanceNewConnections instanceNewConnections) {
        this.instanceNewConnections = instanceNewConnections;
        return this;
    }
    public DescribeInstanceNewConnectionsResponseBodyInstanceNewConnections getInstanceNewConnections() {
        return this.instanceNewConnections;
    }

    public DescribeInstanceNewConnectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceNewConnectionsResponseBodyInstanceNewConnectionsMonitorItem extends TeaModel {
        /**
         * <p>The monitoring time. The time follows the ISO 8601 standard and UTC time is used. Format: YYYY-MM-DDThh:mm:ssZ</p>
         */
        @NameInMap("ItemTime")
        public String itemTime;

        /**
         * <p>The number of new connections in the instance.</p>
         */
        @NameInMap("ItemValue")
        public String itemValue;

        public static DescribeInstanceNewConnectionsResponseBodyInstanceNewConnectionsMonitorItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceNewConnectionsResponseBodyInstanceNewConnectionsMonitorItem self = new DescribeInstanceNewConnectionsResponseBodyInstanceNewConnectionsMonitorItem();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceNewConnectionsResponseBodyInstanceNewConnectionsMonitorItem setItemTime(String itemTime) {
            this.itemTime = itemTime;
            return this;
        }
        public String getItemTime() {
            return this.itemTime;
        }

        public DescribeInstanceNewConnectionsResponseBodyInstanceNewConnectionsMonitorItem setItemValue(String itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public String getItemValue() {
            return this.itemValue;
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
