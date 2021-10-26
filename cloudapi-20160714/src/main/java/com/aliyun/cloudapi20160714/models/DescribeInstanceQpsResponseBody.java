// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstanceQpsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceQps")
    public DescribeInstanceQpsResponseBodyInstanceQps instanceQps;

    public static DescribeInstanceQpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceQpsResponseBody self = new DescribeInstanceQpsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceQpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceQpsResponseBody setInstanceQps(DescribeInstanceQpsResponseBodyInstanceQps instanceQps) {
        this.instanceQps = instanceQps;
        return this;
    }
    public DescribeInstanceQpsResponseBodyInstanceQps getInstanceQps() {
        return this.instanceQps;
    }

    public static class DescribeInstanceQpsResponseBodyInstanceQpsMonitorItem extends TeaModel {
        @NameInMap("ItemValue")
        public String itemValue;

        @NameInMap("ItemTime")
        public String itemTime;

        public static DescribeInstanceQpsResponseBodyInstanceQpsMonitorItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceQpsResponseBodyInstanceQpsMonitorItem self = new DescribeInstanceQpsResponseBodyInstanceQpsMonitorItem();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceQpsResponseBodyInstanceQpsMonitorItem setItemValue(String itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public String getItemValue() {
            return this.itemValue;
        }

        public DescribeInstanceQpsResponseBodyInstanceQpsMonitorItem setItemTime(String itemTime) {
            this.itemTime = itemTime;
            return this;
        }
        public String getItemTime() {
            return this.itemTime;
        }

    }

    public static class DescribeInstanceQpsResponseBodyInstanceQps extends TeaModel {
        @NameInMap("MonitorItem")
        public java.util.List<DescribeInstanceQpsResponseBodyInstanceQpsMonitorItem> monitorItem;

        public static DescribeInstanceQpsResponseBodyInstanceQps build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceQpsResponseBodyInstanceQps self = new DescribeInstanceQpsResponseBodyInstanceQps();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceQpsResponseBodyInstanceQps setMonitorItem(java.util.List<DescribeInstanceQpsResponseBodyInstanceQpsMonitorItem> monitorItem) {
            this.monitorItem = monitorItem;
            return this;
        }
        public java.util.List<DescribeInstanceQpsResponseBodyInstanceQpsMonitorItem> getMonitorItem() {
            return this.monitorItem;
        }

    }

}
