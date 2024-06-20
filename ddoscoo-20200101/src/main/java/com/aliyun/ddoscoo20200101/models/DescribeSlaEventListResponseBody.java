// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeSlaEventListResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CF33B4C3-196E-4015-AADD-5CAD00057B80</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The destination rate limit events.</p>
     */
    @NameInMap("SlaEvent")
    public java.util.List<DescribeSlaEventListResponseBodySlaEvent> slaEvent;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Total")
    public Long total;

    public static DescribeSlaEventListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlaEventListResponseBody self = new DescribeSlaEventListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlaEventListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSlaEventListResponseBody setSlaEvent(java.util.List<DescribeSlaEventListResponseBodySlaEvent> slaEvent) {
        this.slaEvent = slaEvent;
        return this;
    }
    public java.util.List<DescribeSlaEventListResponseBodySlaEvent> getSlaEvent() {
        return this.slaEvent;
    }

    public DescribeSlaEventListResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class DescribeSlaEventListResponseBodySlaEvent extends TeaModel {
        /**
         * <p>The end of the time range. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1671886740</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The IP address of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>203.107.XX.XX</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The region to which the destination IP address belongs. Valid values:</p>
         * <ul>
         * <li><strong>cn</strong>: a region in the Chinese mainland</li>
         * <li><strong>cn-hongkong</strong>: China (Hong Kong)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The beginning of the time range. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1678080840</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static DescribeSlaEventListResponseBodySlaEvent build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlaEventListResponseBodySlaEvent self = new DescribeSlaEventListResponseBodySlaEvent();
            return TeaModel.build(map, self);
        }

        public DescribeSlaEventListResponseBodySlaEvent setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeSlaEventListResponseBodySlaEvent setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeSlaEventListResponseBodySlaEvent setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeSlaEventListResponseBodySlaEvent setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
