// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeGroupQpsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("GroupQps")
    public DescribeGroupQpsResponseBodyGroupQps groupQps;

    public static DescribeGroupQpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupQpsResponseBody self = new DescribeGroupQpsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGroupQpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGroupQpsResponseBody setGroupQps(DescribeGroupQpsResponseBodyGroupQps groupQps) {
        this.groupQps = groupQps;
        return this;
    }
    public DescribeGroupQpsResponseBodyGroupQps getGroupQps() {
        return this.groupQps;
    }

    public static class DescribeGroupQpsResponseBodyGroupQpsMonitorItem extends TeaModel {
        @NameInMap("ItemValue")
        public String itemValue;

        @NameInMap("ItemTime")
        public String itemTime;

        public static DescribeGroupQpsResponseBodyGroupQpsMonitorItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupQpsResponseBodyGroupQpsMonitorItem self = new DescribeGroupQpsResponseBodyGroupQpsMonitorItem();
            return TeaModel.build(map, self);
        }

        public DescribeGroupQpsResponseBodyGroupQpsMonitorItem setItemValue(String itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public String getItemValue() {
            return this.itemValue;
        }

        public DescribeGroupQpsResponseBodyGroupQpsMonitorItem setItemTime(String itemTime) {
            this.itemTime = itemTime;
            return this;
        }
        public String getItemTime() {
            return this.itemTime;
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
