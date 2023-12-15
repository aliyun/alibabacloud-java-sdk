// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeGroupQpsResponseBody extends TeaModel {
    /**
     * <p>The number of requests directed to the API group.</p>
     */
    @NameInMap("GroupQps")
    public DescribeGroupQpsResponseBodyGroupQps groupQps;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeGroupQpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupQpsResponseBody self = new DescribeGroupQpsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGroupQpsResponseBody setGroupQps(DescribeGroupQpsResponseBodyGroupQps groupQps) {
        this.groupQps = groupQps;
        return this;
    }
    public DescribeGroupQpsResponseBodyGroupQps getGroupQps() {
        return this.groupQps;
    }

    public DescribeGroupQpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeGroupQpsResponseBodyGroupQpsMonitorItem extends TeaModel {
        /**
         * <p>The point in time.</p>
         */
        @NameInMap("ItemTime")
        public String itemTime;

        /**
         * <p>The number of requests at the specified point in time.</p>
         */
        @NameInMap("ItemValue")
        public String itemValue;

        public static DescribeGroupQpsResponseBodyGroupQpsMonitorItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupQpsResponseBodyGroupQpsMonitorItem self = new DescribeGroupQpsResponseBodyGroupQpsMonitorItem();
            return TeaModel.build(map, self);
        }

        public DescribeGroupQpsResponseBodyGroupQpsMonitorItem setItemTime(String itemTime) {
            this.itemTime = itemTime;
            return this;
        }
        public String getItemTime() {
            return this.itemTime;
        }

        public DescribeGroupQpsResponseBodyGroupQpsMonitorItem setItemValue(String itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public String getItemValue() {
            return this.itemValue;
        }

    }

    public static class DescribeGroupQpsResponseBodyGroupQps extends TeaModel {
        @NameInMap("MonitorItem")
        public java.util.List<DescribeGroupQpsResponseBodyGroupQpsMonitorItem> monitorItem;

        public static DescribeGroupQpsResponseBodyGroupQps build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupQpsResponseBodyGroupQps self = new DescribeGroupQpsResponseBodyGroupQps();
            return TeaModel.build(map, self);
        }

        public DescribeGroupQpsResponseBodyGroupQps setMonitorItem(java.util.List<DescribeGroupQpsResponseBodyGroupQpsMonitorItem> monitorItem) {
            this.monitorItem = monitorItem;
            return this;
        }
        public java.util.List<DescribeGroupQpsResponseBodyGroupQpsMonitorItem> getMonitorItem() {
            return this.monitorItem;
        }

    }

}
