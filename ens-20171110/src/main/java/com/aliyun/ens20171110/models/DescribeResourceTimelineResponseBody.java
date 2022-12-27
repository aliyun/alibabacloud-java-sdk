// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeResourceTimelineResponseBody extends TeaModel {
    @NameInMap("AvailableEvents")
    public java.util.List<DescribeResourceTimelineResponseBodyAvailableEvents> availableEvents;

    @NameInMap("BizEvents")
    public java.util.List<DescribeResourceTimelineResponseBodyBizEvents> bizEvents;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("InventoryEvents")
    public java.util.List<DescribeResourceTimelineResponseBodyInventoryEvents> inventoryEvents;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ReserveEvents")
    public java.util.List<DescribeResourceTimelineResponseBodyReserveEvents> reserveEvents;

    public static DescribeResourceTimelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceTimelineResponseBody self = new DescribeResourceTimelineResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceTimelineResponseBody setAvailableEvents(java.util.List<DescribeResourceTimelineResponseBodyAvailableEvents> availableEvents) {
        this.availableEvents = availableEvents;
        return this;
    }
    public java.util.List<DescribeResourceTimelineResponseBodyAvailableEvents> getAvailableEvents() {
        return this.availableEvents;
    }

    public DescribeResourceTimelineResponseBody setBizEvents(java.util.List<DescribeResourceTimelineResponseBodyBizEvents> bizEvents) {
        this.bizEvents = bizEvents;
        return this;
    }
    public java.util.List<DescribeResourceTimelineResponseBodyBizEvents> getBizEvents() {
        return this.bizEvents;
    }

    public DescribeResourceTimelineResponseBody setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public DescribeResourceTimelineResponseBody setInventoryEvents(java.util.List<DescribeResourceTimelineResponseBodyInventoryEvents> inventoryEvents) {
        this.inventoryEvents = inventoryEvents;
        return this;
    }
    public java.util.List<DescribeResourceTimelineResponseBodyInventoryEvents> getInventoryEvents() {
        return this.inventoryEvents;
    }

    public DescribeResourceTimelineResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public DescribeResourceTimelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourceTimelineResponseBody setReserveEvents(java.util.List<DescribeResourceTimelineResponseBodyReserveEvents> reserveEvents) {
        this.reserveEvents = reserveEvents;
        return this;
    }
    public java.util.List<DescribeResourceTimelineResponseBodyReserveEvents> getReserveEvents() {
        return this.reserveEvents;
    }

    public static class DescribeResourceTimelineResponseBodyAvailableEvents extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("OccurrenceTime")
        public String occurrenceTime;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("Type")
        public String type;

        public static DescribeResourceTimelineResponseBodyAvailableEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceTimelineResponseBodyAvailableEvents self = new DescribeResourceTimelineResponseBodyAvailableEvents();
            return TeaModel.build(map, self);
        }

        public DescribeResourceTimelineResponseBodyAvailableEvents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeResourceTimelineResponseBodyAvailableEvents setOccurrenceTime(String occurrenceTime) {
            this.occurrenceTime = occurrenceTime;
            return this;
        }
        public String getOccurrenceTime() {
            return this.occurrenceTime;
        }

        public DescribeResourceTimelineResponseBodyAvailableEvents setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeResourceTimelineResponseBodyAvailableEvents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeResourceTimelineResponseBodyBizEvents extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("OccurrenceTime")
        public String occurrenceTime;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("Type")
        public String type;

        public static DescribeResourceTimelineResponseBodyBizEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceTimelineResponseBodyBizEvents self = new DescribeResourceTimelineResponseBodyBizEvents();
            return TeaModel.build(map, self);
        }

        public DescribeResourceTimelineResponseBodyBizEvents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeResourceTimelineResponseBodyBizEvents setOccurrenceTime(String occurrenceTime) {
            this.occurrenceTime = occurrenceTime;
            return this;
        }
        public String getOccurrenceTime() {
            return this.occurrenceTime;
        }

        public DescribeResourceTimelineResponseBodyBizEvents setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeResourceTimelineResponseBodyBizEvents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeResourceTimelineResponseBodyInventoryEvents extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("OccurrenceTime")
        public String occurrenceTime;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("Type")
        public String type;

        public static DescribeResourceTimelineResponseBodyInventoryEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceTimelineResponseBodyInventoryEvents self = new DescribeResourceTimelineResponseBodyInventoryEvents();
            return TeaModel.build(map, self);
        }

        public DescribeResourceTimelineResponseBodyInventoryEvents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeResourceTimelineResponseBodyInventoryEvents setOccurrenceTime(String occurrenceTime) {
            this.occurrenceTime = occurrenceTime;
            return this;
        }
        public String getOccurrenceTime() {
            return this.occurrenceTime;
        }

        public DescribeResourceTimelineResponseBodyInventoryEvents setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeResourceTimelineResponseBodyInventoryEvents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeResourceTimelineResponseBodyReserveEvents extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("OccurrenceTime")
        public String occurrenceTime;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("Type")
        public String type;

        public static DescribeResourceTimelineResponseBodyReserveEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceTimelineResponseBodyReserveEvents self = new DescribeResourceTimelineResponseBodyReserveEvents();
            return TeaModel.build(map, self);
        }

        public DescribeResourceTimelineResponseBodyReserveEvents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeResourceTimelineResponseBodyReserveEvents setOccurrenceTime(String occurrenceTime) {
            this.occurrenceTime = occurrenceTime;
            return this;
        }
        public String getOccurrenceTime() {
            return this.occurrenceTime;
        }

        public DescribeResourceTimelineResponseBodyReserveEvents setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeResourceTimelineResponseBodyReserveEvents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
