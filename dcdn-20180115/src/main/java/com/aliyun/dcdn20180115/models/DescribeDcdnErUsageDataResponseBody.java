// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnErUsageDataResponseBody extends TeaModel {
    /**
     * <p>The end of the time range during which data was queried.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The list of the data returned.</p>
     */
    @NameInMap("ErAccData")
    public DescribeDcdnErUsageDataResponseBodyErAccData erAccData;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start of the time range during which data was queried.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDcdnErUsageDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnErUsageDataResponseBody self = new DescribeDcdnErUsageDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnErUsageDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnErUsageDataResponseBody setErAccData(DescribeDcdnErUsageDataResponseBodyErAccData erAccData) {
        this.erAccData = erAccData;
        return this;
    }
    public DescribeDcdnErUsageDataResponseBodyErAccData getErAccData() {
        return this.erAccData;
    }

    public DescribeDcdnErUsageDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnErUsageDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDcdnErUsageDataResponseBodyErAccDataErAccItem extends TeaModel {
        /**
         * <p>The number of requests.</p>
         */
        @NameInMap("ErAcc")
        public Long erAcc;

        /**
         * <p>The ID of the routine. This parameter is returned only when SplitBy is set to routine.</p>
         */
        @NameInMap("Routine")
        public String routine;

        /**
         * <p>The specification of the routine. This parameter is returned only when SplitBy is set to spec.</p>
         */
        @NameInMap("Spec")
        public String spec;

        /**
         * <p>The timestamp of the returned data.</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeDcdnErUsageDataResponseBodyErAccDataErAccItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnErUsageDataResponseBodyErAccDataErAccItem self = new DescribeDcdnErUsageDataResponseBodyErAccDataErAccItem();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnErUsageDataResponseBodyErAccDataErAccItem setErAcc(Long erAcc) {
            this.erAcc = erAcc;
            return this;
        }
        public Long getErAcc() {
            return this.erAcc;
        }

        public DescribeDcdnErUsageDataResponseBodyErAccDataErAccItem setRoutine(String routine) {
            this.routine = routine;
            return this;
        }
        public String getRoutine() {
            return this.routine;
        }

        public DescribeDcdnErUsageDataResponseBodyErAccDataErAccItem setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public DescribeDcdnErUsageDataResponseBodyErAccDataErAccItem setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeDcdnErUsageDataResponseBodyErAccData extends TeaModel {
        @NameInMap("ErAccItem")
        public java.util.List<DescribeDcdnErUsageDataResponseBodyErAccDataErAccItem> erAccItem;

        public static DescribeDcdnErUsageDataResponseBodyErAccData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnErUsageDataResponseBodyErAccData self = new DescribeDcdnErUsageDataResponseBodyErAccData();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnErUsageDataResponseBodyErAccData setErAccItem(java.util.List<DescribeDcdnErUsageDataResponseBodyErAccDataErAccItem> erAccItem) {
            this.erAccItem = erAccItem;
            return this;
        }
        public java.util.List<DescribeDcdnErUsageDataResponseBodyErAccDataErAccItem> getErAccItem() {
            return this.erAccItem;
        }

    }

}
