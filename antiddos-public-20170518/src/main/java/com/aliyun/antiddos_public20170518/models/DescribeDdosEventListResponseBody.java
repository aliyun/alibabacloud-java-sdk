// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeDdosEventListResponseBody extends TeaModel {
    @NameInMap("DdosEventList")
    public java.util.List<DescribeDdosEventListResponseBodyDdosEventList> ddosEventList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    public static DescribeDdosEventListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosEventListResponseBody self = new DescribeDdosEventListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDdosEventListResponseBody setDdosEventList(java.util.List<DescribeDdosEventListResponseBodyDdosEventList> ddosEventList) {
        this.ddosEventList = ddosEventList;
        return this;
    }
    public java.util.List<DescribeDdosEventListResponseBodyDdosEventList> getDdosEventList() {
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

    public static class DescribeDdosEventListResponseBodyDdosEventList extends TeaModel {
        @NameInMap("DdosType")
        public String ddosType;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("DelayTime")
        public Long delayTime;

        @NameInMap("DdosStatus")
        public String ddosStatus;

        @NameInMap("UnBlackholeTime")
        public Long unBlackholeTime;

        public static DescribeDdosEventListResponseBodyDdosEventList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDdosEventListResponseBodyDdosEventList self = new DescribeDdosEventListResponseBodyDdosEventList();
            return TeaModel.build(map, self);
        }

        public DescribeDdosEventListResponseBodyDdosEventList setDdosType(String ddosType) {
            this.ddosType = ddosType;
            return this;
        }
        public String getDdosType() {
            return this.ddosType;
        }

        public DescribeDdosEventListResponseBodyDdosEventList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeDdosEventListResponseBodyDdosEventList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeDdosEventListResponseBodyDdosEventList setDelayTime(Long delayTime) {
            this.delayTime = delayTime;
            return this;
        }
        public Long getDelayTime() {
            return this.delayTime;
        }

        public DescribeDdosEventListResponseBodyDdosEventList setDdosStatus(String ddosStatus) {
            this.ddosStatus = ddosStatus;
            return this;
        }
        public String getDdosStatus() {
            return this.ddosStatus;
        }

        public DescribeDdosEventListResponseBodyDdosEventList setUnBlackholeTime(Long unBlackholeTime) {
            this.unBlackholeTime = unBlackholeTime;
            return this;
        }
        public Long getUnBlackholeTime() {
            return this.unBlackholeTime;
        }

    }

}
