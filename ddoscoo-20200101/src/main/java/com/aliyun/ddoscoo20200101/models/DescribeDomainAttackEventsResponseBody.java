// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainAttackEventsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("DomainAttackEvents")
    public java.util.List<DescribeDomainAttackEventsResponseBodyDomainAttackEvents> domainAttackEvents;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDomainAttackEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainAttackEventsResponseBody self = new DescribeDomainAttackEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainAttackEventsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
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

    public static class DescribeDomainAttackEventsResponseBodyDomainAttackEvents extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("MaxQps")
        public Long maxQps;

        public static DescribeDomainAttackEventsResponseBodyDomainAttackEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainAttackEventsResponseBodyDomainAttackEvents self = new DescribeDomainAttackEventsResponseBodyDomainAttackEvents();
            return TeaModel.build(map, self);
        }

        public DescribeDomainAttackEventsResponseBodyDomainAttackEvents setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeDomainAttackEventsResponseBodyDomainAttackEvents setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeDomainAttackEventsResponseBodyDomainAttackEvents setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDomainAttackEventsResponseBodyDomainAttackEvents setMaxQps(Long maxQps) {
            this.maxQps = maxQps;
            return this;
        }
        public Long getMaxQps() {
            return this.maxQps;
        }

    }

}
