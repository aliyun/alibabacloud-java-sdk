// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainAttackEventsResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the details of the DDoS attack event.</p>
     */
    @NameInMap("DomainAttackEvents")
    public java.util.List<DescribeDomainAttackEventsResponseBodyDomainAttackEvents> domainAttackEvents;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C33EB3D5-AF96-43CA-9C7E-37A81BC06A1E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned DDoS attack events.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeDomainAttackEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainAttackEventsResponseBody self = new DescribeDomainAttackEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainAttackEventsResponseBody setDomainAttackEvents(java.util.List<DescribeDomainAttackEventsResponseBodyDomainAttackEvents> domainAttackEvents) {
        this.domainAttackEvents = domainAttackEvents;
        return this;
    }
    public java.util.List<DescribeDomainAttackEventsResponseBodyDomainAttackEvents> getDomainAttackEvents() {
        return this.domainAttackEvents;
    }

    public DescribeDomainAttackEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainAttackEventsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDomainAttackEventsResponseBodyDomainAttackEvents extends TeaModel {
        /**
         * <p>The attacked domain name.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The time when the DDoS attack stopped. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1560320160</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The peak attack QPS.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MaxQps")
        public Long maxQps;

        /**
         * <p>The time when the DDoS attack started. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1560312900</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static DescribeDomainAttackEventsResponseBodyDomainAttackEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainAttackEventsResponseBodyDomainAttackEvents self = new DescribeDomainAttackEventsResponseBodyDomainAttackEvents();
            return TeaModel.build(map, self);
        }

        public DescribeDomainAttackEventsResponseBodyDomainAttackEvents setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDomainAttackEventsResponseBodyDomainAttackEvents setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeDomainAttackEventsResponseBodyDomainAttackEvents setMaxQps(Long maxQps) {
            this.maxQps = maxQps;
            return this;
        }
        public Long getMaxQps() {
            return this.maxQps;
        }

        public DescribeDomainAttackEventsResponseBodyDomainAttackEvents setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
