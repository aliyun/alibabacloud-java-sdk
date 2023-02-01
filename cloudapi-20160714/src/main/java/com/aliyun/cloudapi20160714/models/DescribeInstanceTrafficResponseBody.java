// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstanceTrafficResponseBody extends TeaModel {
    @NameInMap("InstanceTraffic")
    public DescribeInstanceTrafficResponseBodyInstanceTraffic instanceTraffic;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceTrafficResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTrafficResponseBody self = new DescribeInstanceTrafficResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceTrafficResponseBody setInstanceTraffic(DescribeInstanceTrafficResponseBodyInstanceTraffic instanceTraffic) {
        this.instanceTraffic = instanceTraffic;
        return this;
    }
    public DescribeInstanceTrafficResponseBodyInstanceTraffic getInstanceTraffic() {
        return this.instanceTraffic;
    }

    public DescribeInstanceTrafficResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceTrafficResponseBodyInstanceTrafficMonitorItem extends TeaModel {
        @NameInMap("Item")
        public String item;

        @NameInMap("ItemTime")
        public String itemTime;

        @NameInMap("ItemValue")
        public String itemValue;

        public static DescribeInstanceTrafficResponseBodyInstanceTrafficMonitorItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTrafficResponseBodyInstanceTrafficMonitorItem self = new DescribeInstanceTrafficResponseBodyInstanceTrafficMonitorItem();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTrafficResponseBodyInstanceTrafficMonitorItem setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public DescribeInstanceTrafficResponseBodyInstanceTrafficMonitorItem setItemTime(String itemTime) {
            this.itemTime = itemTime;
            return this;
        }
        public String getItemTime() {
            return this.itemTime;
        }

        public DescribeInstanceTrafficResponseBodyInstanceTrafficMonitorItem setItemValue(String itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public String getItemValue() {
            return this.itemValue;
        }

    }

    public static class DescribeInstanceTrafficResponseBodyInstanceTraffic extends TeaModel {
        @NameInMap("MonitorItem")
        public java.util.List<DescribeInstanceTrafficResponseBodyInstanceTrafficMonitorItem> monitorItem;

        public static DescribeInstanceTrafficResponseBodyInstanceTraffic build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTrafficResponseBodyInstanceTraffic self = new DescribeInstanceTrafficResponseBodyInstanceTraffic();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTrafficResponseBodyInstanceTraffic setMonitorItem(java.util.List<DescribeInstanceTrafficResponseBodyInstanceTrafficMonitorItem> monitorItem) {
            this.monitorItem = monitorItem;
            return this;
        }
        public java.util.List<DescribeInstanceTrafficResponseBodyInstanceTrafficMonitorItem> getMonitorItem() {
            return this.monitorItem;
        }

    }

}
