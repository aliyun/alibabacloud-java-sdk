// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeGroupHttpCodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpCodePacket")
    public DescribeGroupHttpCodeResponseBodyHttpCodePacket httpCodePacket;

    public static DescribeGroupHttpCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupHttpCodeResponseBody self = new DescribeGroupHttpCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGroupHttpCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGroupHttpCodeResponseBody setHttpCodePacket(DescribeGroupHttpCodeResponseBodyHttpCodePacket httpCodePacket) {
        this.httpCodePacket = httpCodePacket;
        return this;
    }
    public DescribeGroupHttpCodeResponseBodyHttpCodePacket getHttpCodePacket() {
        return this.httpCodePacket;
    }

    public static class DescribeGroupHttpCodeResponseBodyHttpCodePacketMonitorItem extends TeaModel {
        @NameInMap("ItemValue")
        public String itemValue;

        @NameInMap("ItemTime")
        public String itemTime;

        public static DescribeGroupHttpCodeResponseBodyHttpCodePacketMonitorItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupHttpCodeResponseBodyHttpCodePacketMonitorItem self = new DescribeGroupHttpCodeResponseBodyHttpCodePacketMonitorItem();
            return TeaModel.build(map, self);
        }

        public DescribeGroupHttpCodeResponseBodyHttpCodePacketMonitorItem setItemValue(String itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public String getItemValue() {
            return this.itemValue;
        }

        public DescribeGroupHttpCodeResponseBodyHttpCodePacketMonitorItem setItemTime(String itemTime) {
            this.itemTime = itemTime;
            return this;
        }
        public String getItemTime() {
            return this.itemTime;
        }

    }

    public static class DescribeGroupHttpCodeResponseBodyHttpCodePacket extends TeaModel {
        @NameInMap("MonitorItem")
        public java.util.List<DescribeGroupHttpCodeResponseBodyHttpCodePacketMonitorItem> monitorItem;

        public static DescribeGroupHttpCodeResponseBodyHttpCodePacket build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupHttpCodeResponseBodyHttpCodePacket self = new DescribeGroupHttpCodeResponseBodyHttpCodePacket();
            return TeaModel.build(map, self);
        }

        public DescribeGroupHttpCodeResponseBodyHttpCodePacket setMonitorItem(java.util.List<DescribeGroupHttpCodeResponseBodyHttpCodePacketMonitorItem> monitorItem) {
            this.monitorItem = monitorItem;
            return this;
        }
        public java.util.List<DescribeGroupHttpCodeResponseBodyHttpCodePacketMonitorItem> getMonitorItem() {
            return this.monitorItem;
        }

    }

}
