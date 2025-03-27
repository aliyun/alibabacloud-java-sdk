// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeDdosEventListResponseBody extends TeaModel {
    /**
     * <p>The details of the DDoS attack events.</p>
     */
    @NameInMap("DdosEventList")
    public DescribeDdosEventListResponseBodyDdosEventList ddosEventList;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>BC0907F8-A9F3-5E11-977B-D59CD98C64ED</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of DDoS attack events.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * <ul>
         * <li><strong>mitigating</strong>: indicates that traffic scrubbing is in progress.</li>
         * <li><strong>blackholed</strong>: indicates that blackhole filtering is triggered for the asset.</li>
         * <li><strong>normal</strong>: indicates that the DDoS attack event ends.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("DdosStatus")
        public String ddosStatus;

        /**
         * <p>The type of the DDoS attack event. Valid values:</p>
         * <ul>
         * <li><strong>defense</strong>: an attack event that triggers traffic scrubbing</li>
         * <li><strong>blackhole</strong>: an attack event that triggers blackhole filtering</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>blackhole</p>
         */
        @NameInMap("DdosType")
        public String ddosType;

        /**
         * <p>The time of the last attack. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * <blockquote>
         * <p>This parameter is returned only when the asset is attacked multiple times within a DDoS attack event.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1637817679000</p>
         */
        @NameInMap("DelayTime")
        public Long delayTime;

        /**
         * <p>The end time of the DDoS attack event. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1637817679000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The start time of the DDoS attack event. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1637812279000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The time when blackhole filtering is deactivated. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * <blockquote>
         * <p>This parameter is returned only when the value of the <strong>DdosType</strong> parameter is <strong>blackhole</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1637814079000</p>
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
