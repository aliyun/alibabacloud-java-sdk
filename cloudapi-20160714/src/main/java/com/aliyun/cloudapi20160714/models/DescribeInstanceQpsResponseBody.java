// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstanceQpsResponseBody extends TeaModel {
    /**
     * <p>The list of requests sent to the APIs in the instance.</p>
     */
    @NameInMap("InstanceQps")
    public DescribeInstanceQpsResponseBodyInstanceQps instanceQps;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceQpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceQpsResponseBody self = new DescribeInstanceQpsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceQpsResponseBody setInstanceQps(DescribeInstanceQpsResponseBodyInstanceQps instanceQps) {
        this.instanceQps = instanceQps;
        return this;
    }
    public DescribeInstanceQpsResponseBodyInstanceQps getInstanceQps() {
        return this.instanceQps;
    }

    public DescribeInstanceQpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceQpsResponseBodyInstanceQpsMonitorItem extends TeaModel {
        /**
         * <p>The monitoring time. The time follows the ISO 8601 standard. Format: YYYY-MM-DDThh:mm:ssZ</p>
         */
        @NameInMap("ItemTime")
        public String itemTime;

        /**
         * <p>The number of requests sent to the APIs in the instance.</p>
         */
        @NameInMap("ItemValue")
        public String itemValue;

        public static DescribeInstanceQpsResponseBodyInstanceQpsMonitorItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceQpsResponseBodyInstanceQpsMonitorItem self = new DescribeInstanceQpsResponseBodyInstanceQpsMonitorItem();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceQpsResponseBodyInstanceQpsMonitorItem setItemTime(String itemTime) {
            this.itemTime = itemTime;
            return this;
        }
        public String getItemTime() {
            return this.itemTime;
        }

        public DescribeInstanceQpsResponseBodyInstanceQpsMonitorItem setItemValue(String itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public String getItemValue() {
            return this.itemValue;
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
