// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeDdosEventListResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the details of a DDoS attack event.</p>
     */
    @NameInMap("DdosEventList")
    public DescribeDdosEventListResponseBodyDdosEventList ddosEventList;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of DDoS attack events.</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static DescribeDdosEventListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosEventListResponseBody self = new DescribeDdosEventListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDdosEventListResponseBody setDdosEventList(DescribeDdosEventListResponseBodyDdosEventList ddosEventList) {
        this.ddosEventList = ddosEventList;
        return this;
    }
    public DescribeDdosEventListResponseBodyDdosEventList getDdosEventList() {
        return this.ddosEventList;
    }

    public DescribeDdosEventListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDdosEventListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeDdosEventListResponseBodyDdosEventListDdosEvent extends TeaModel {
        /**
         * <p>The status of the DDoS attack event. Valid values:</p>
         * <br>
         * <p>*   **mitigating**: indicates that traffic scrubbing is in progress.</p>
         * <p>*   **blackholed**: indicates that blackhole filtering is triggered for the asset.</p>
         * <p>*   **normal**: indicates that the DDoS attack event ends.</p>
         */
        @NameInMap("DdosStatus")
        public String ddosStatus;

        /**
         * <p>The type of the DDoS attack event. Valid values:</p>
         * <br>
         * <p>*   **defense**: an attack event that triggers traffic scrubbing</p>
         * <p>*   **blackhole**: an attack event that triggers blackhole filtering</p>
         */
        @NameInMap("DdosType")
        public String ddosType;

        /**
         * <p>The time of the last attack. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * <br>
         * <p>> This parameter is returned only when the asset is attacked multiple times within a DDoS attack event.</p>
         */
        @NameInMap("DelayTime")
        public Long delayTime;

        /**
         * <p>The end time of the DDoS attack event. The value is a UNIX timestamp. Unit: milliseconds.</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The start time of the DDoS attack event. The value is a UNIX timestamp. Unit: milliseconds.</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The time when blackhole filtering is deactivated. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * <br>
         * <p>> This parameter is returned only when the value of the **DdosType** parameter is **blackhole**.</p>
         */
        @NameInMap("UnBlackholeTime")
        public Long unBlackholeTime;

        public static DescribeDdosEventListResponseBodyDdosEventListDdosEvent build(java.util.Map<String, ?> map) throws Exception {
            DescribeDdosEventListResponseBodyDdosEventListDdosEvent self = new DescribeDdosEventListResponseBodyDdosEventListDdosEvent();
            return TeaModel.build(map, self);
        }

        public DescribeDdosEventListResponseBodyDdosEventListDdosEvent setDdosStatus(String ddosStatus) {
            this.ddosStatus = ddosStatus;
            return this;
        }
        public String getDdosStatus() {
            return this.ddosStatus;
        }

        public DescribeDdosEventListResponseBodyDdosEventListDdosEvent setDdosType(String ddosType) {
            this.ddosType = ddosType;
            return this;
        }
        public String getDdosType() {
            return this.ddosType;
        }

        public DescribeDdosEventListResponseBodyDdosEventListDdosEvent setDelayTime(Long delayTime) {
            this.delayTime = delayTime;
            return this;
        }
        public Long getDelayTime() {
            return this.delayTime;
        }

        public DescribeDdosEventListResponseBodyDdosEventListDdosEvent setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeDdosEventListResponseBodyDdosEventListDdosEvent setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeDdosEventListResponseBodyDdosEventListDdosEvent setUnBlackholeTime(Long unBlackholeTime) {
            this.unBlackholeTime = unBlackholeTime;
            return this;
        }
        public Long getUnBlackholeTime() {
            return this.unBlackholeTime;
        }

    }

    public static class DescribeDdosEventListResponseBodyDdosEventList extends TeaModel {
        @NameInMap("DdosEvent")
        public java.util.List<DescribeDdosEventListResponseBodyDdosEventListDdosEvent> ddosEvent;

        public static DescribeDdosEventListResponseBodyDdosEventList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDdosEventListResponseBodyDdosEventList self = new DescribeDdosEventListResponseBodyDdosEventList();
            return TeaModel.build(map, self);
        }

        public DescribeDdosEventListResponseBodyDdosEventList setDdosEvent(java.util.List<DescribeDdosEventListResponseBodyDdosEventListDdosEvent> ddosEvent) {
            this.ddosEvent = ddosEvent;
            return this;
        }
        public java.util.List<DescribeDdosEventListResponseBodyDdosEventListDdosEvent> getDdosEvent() {
            return this.ddosEvent;
        }

    }

}
