// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafUsageDataResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("WafUsageData")
    public DescribeDcdnWafUsageDataResponseBodyWafUsageData wafUsageData;

    public static DescribeDcdnWafUsageDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafUsageDataResponseBody self = new DescribeDcdnWafUsageDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafUsageDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnWafUsageDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnWafUsageDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDcdnWafUsageDataResponseBody setWafUsageData(DescribeDcdnWafUsageDataResponseBodyWafUsageData wafUsageData) {
        this.wafUsageData = wafUsageData;
        return this;
    }
    public DescribeDcdnWafUsageDataResponseBodyWafUsageData getWafUsageData() {
        return this.wafUsageData;
    }

    public static class DescribeDcdnWafUsageDataResponseBodyWafUsageDataWafUsageDataItem extends TeaModel {
        @NameInMap("AccessCnt")
        public Long accessCnt;

        @NameInMap("BlockCnt")
        public Long blockCnt;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("ObserveCnt")
        public Long observeCnt;

        @NameInMap("SecCu")
        public Long secCu;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeDcdnWafUsageDataResponseBodyWafUsageDataWafUsageDataItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnWafUsageDataResponseBodyWafUsageDataWafUsageDataItem self = new DescribeDcdnWafUsageDataResponseBodyWafUsageDataWafUsageDataItem();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnWafUsageDataResponseBodyWafUsageDataWafUsageDataItem setAccessCnt(Long accessCnt) {
            this.accessCnt = accessCnt;
            return this;
        }
        public Long getAccessCnt() {
            return this.accessCnt;
        }

        public DescribeDcdnWafUsageDataResponseBodyWafUsageDataWafUsageDataItem setBlockCnt(Long blockCnt) {
            this.blockCnt = blockCnt;
            return this;
        }
        public Long getBlockCnt() {
            return this.blockCnt;
        }

        public DescribeDcdnWafUsageDataResponseBodyWafUsageDataWafUsageDataItem setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDcdnWafUsageDataResponseBodyWafUsageDataWafUsageDataItem setObserveCnt(Long observeCnt) {
            this.observeCnt = observeCnt;
            return this;
        }
        public Long getObserveCnt() {
            return this.observeCnt;
        }

        public DescribeDcdnWafUsageDataResponseBodyWafUsageDataWafUsageDataItem setSecCu(Long secCu) {
            this.secCu = secCu;
            return this;
        }
        public Long getSecCu() {
            return this.secCu;
        }

        public DescribeDcdnWafUsageDataResponseBodyWafUsageDataWafUsageDataItem setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeDcdnWafUsageDataResponseBodyWafUsageData extends TeaModel {
        @NameInMap("WafUsageDataItem")
        public java.util.List<DescribeDcdnWafUsageDataResponseBodyWafUsageDataWafUsageDataItem> wafUsageDataItem;

        public static DescribeDcdnWafUsageDataResponseBodyWafUsageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnWafUsageDataResponseBodyWafUsageData self = new DescribeDcdnWafUsageDataResponseBodyWafUsageData();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnWafUsageDataResponseBodyWafUsageData setWafUsageDataItem(java.util.List<DescribeDcdnWafUsageDataResponseBodyWafUsageDataWafUsageDataItem> wafUsageDataItem) {
            this.wafUsageDataItem = wafUsageDataItem;
            return this;
        }
        public java.util.List<DescribeDcdnWafUsageDataResponseBodyWafUsageDataWafUsageDataItem> getWafUsageDataItem() {
            return this.wafUsageDataItem;
        }

    }

}
