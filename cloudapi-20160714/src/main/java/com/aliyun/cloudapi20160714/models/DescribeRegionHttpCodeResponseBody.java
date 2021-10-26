// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeRegionHttpCodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpCodePacket")
    public DescribeRegionHttpCodeResponseBodyHttpCodePacket httpCodePacket;

    public static DescribeRegionHttpCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionHttpCodeResponseBody self = new DescribeRegionHttpCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionHttpCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRegionHttpCodeResponseBody setHttpCodePacket(DescribeRegionHttpCodeResponseBodyHttpCodePacket httpCodePacket) {
        this.httpCodePacket = httpCodePacket;
        return this;
    }
    public DescribeRegionHttpCodeResponseBodyHttpCodePacket getHttpCodePacket() {
        return this.httpCodePacket;
    }

    public static class DescribeRegionHttpCodeResponseBodyHttpCodePacketMonitorItem extends TeaModel {
        @NameInMap("ItemValue")
        public String itemValue;

        @NameInMap("ItemTime")
        public String itemTime;

        public static DescribeRegionHttpCodeResponseBodyHttpCodePacketMonitorItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionHttpCodeResponseBodyHttpCodePacketMonitorItem self = new DescribeRegionHttpCodeResponseBodyHttpCodePacketMonitorItem();
            return TeaModel.build(map, self);
        }

        public DescribeRegionHttpCodeResponseBodyHttpCodePacketMonitorItem setItemValue(String itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public String getItemValue() {
            return this.itemValue;
        }

        public DescribeRegionHttpCodeResponseBodyHttpCodePacketMonitorItem setItemTime(String itemTime) {
            this.itemTime = itemTime;
            return this;
        }
        public String getItemTime() {
            return this.itemTime;
        }

    }

    public static class DescribeRegionHttpCodeResponseBodyHttpCodePacket extends TeaModel {
        @NameInMap("MonitorItem")
        public java.util.List<DescribeRegionHttpCodeResponseBodyHttpCodePacketMonitorItem> monitorItem;

        public static DescribeRegionHttpCodeResponseBodyHttpCodePacket build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionHttpCodeResponseBodyHttpCodePacket self = new DescribeRegionHttpCodeResponseBodyHttpCodePacket();
            return TeaModel.build(map, self);
        }

        public DescribeRegionHttpCodeResponseBodyHttpCodePacket setMonitorItem(java.util.List<DescribeRegionHttpCodeResponseBodyHttpCodePacketMonitorItem> monitorItem) {
            this.monitorItem = monitorItem;
            return this;
        }
        public java.util.List<DescribeRegionHttpCodeResponseBodyHttpCodePacketMonitorItem> getMonitorItem() {
            return this.monitorItem;
        }

    }

}
