// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstanceSlbConnectResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceSlbConnect")
    public DescribeInstanceSlbConnectResponseBodyInstanceSlbConnect instanceSlbConnect;

    public static DescribeInstanceSlbConnectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSlbConnectResponseBody self = new DescribeInstanceSlbConnectResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSlbConnectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceSlbConnectResponseBody setInstanceSlbConnect(DescribeInstanceSlbConnectResponseBodyInstanceSlbConnect instanceSlbConnect) {
        this.instanceSlbConnect = instanceSlbConnect;
        return this;
    }
    public DescribeInstanceSlbConnectResponseBodyInstanceSlbConnect getInstanceSlbConnect() {
        return this.instanceSlbConnect;
    }

    public static class DescribeInstanceSlbConnectResponseBodyInstanceSlbConnectMonitorItem extends TeaModel {
        @NameInMap("ItemValue")
        public String itemValue;

        @NameInMap("ItemTime")
        public String itemTime;

        @NameInMap("Item")
        public String item;

        public static DescribeInstanceSlbConnectResponseBodyInstanceSlbConnectMonitorItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSlbConnectResponseBodyInstanceSlbConnectMonitorItem self = new DescribeInstanceSlbConnectResponseBodyInstanceSlbConnectMonitorItem();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceSlbConnectResponseBodyInstanceSlbConnectMonitorItem setItemValue(String itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public String getItemValue() {
            return this.itemValue;
        }

        public DescribeInstanceSlbConnectResponseBodyInstanceSlbConnectMonitorItem setItemTime(String itemTime) {
            this.itemTime = itemTime;
            return this;
        }
        public String getItemTime() {
            return this.itemTime;
        }

        public DescribeInstanceSlbConnectResponseBodyInstanceSlbConnectMonitorItem setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

    }

    public static class DescribeInstanceSlbConnectResponseBodyInstanceSlbConnect extends TeaModel {
        @NameInMap("MonitorItem")
        public java.util.List<DescribeInstanceSlbConnectResponseBodyInstanceSlbConnectMonitorItem> monitorItem;

        public static DescribeInstanceSlbConnectResponseBodyInstanceSlbConnect build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSlbConnectResponseBodyInstanceSlbConnect self = new DescribeInstanceSlbConnectResponseBodyInstanceSlbConnect();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceSlbConnectResponseBodyInstanceSlbConnect setMonitorItem(java.util.List<DescribeInstanceSlbConnectResponseBodyInstanceSlbConnectMonitorItem> monitorItem) {
            this.monitorItem = monitorItem;
            return this;
        }
        public java.util.List<DescribeInstanceSlbConnectResponseBodyInstanceSlbConnectMonitorItem> getMonitorItem() {
            return this.monitorItem;
        }

    }

}
