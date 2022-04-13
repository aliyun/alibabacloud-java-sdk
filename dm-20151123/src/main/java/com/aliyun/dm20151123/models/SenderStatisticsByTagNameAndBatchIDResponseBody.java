// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class SenderStatisticsByTagNameAndBatchIDResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("data")
    public SenderStatisticsByTagNameAndBatchIDResponseBodyData data;

    public static SenderStatisticsByTagNameAndBatchIDResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SenderStatisticsByTagNameAndBatchIDResponseBody self = new SenderStatisticsByTagNameAndBatchIDResponseBody();
        return TeaModel.build(map, self);
    }

    public SenderStatisticsByTagNameAndBatchIDResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SenderStatisticsByTagNameAndBatchIDResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public SenderStatisticsByTagNameAndBatchIDResponseBody setData(SenderStatisticsByTagNameAndBatchIDResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SenderStatisticsByTagNameAndBatchIDResponseBodyData getData() {
        return this.data;
    }

    public static class SenderStatisticsByTagNameAndBatchIDResponseBodyDataStat extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("faildCount")
        public String faildCount;

        @NameInMap("requestCount")
        public String requestCount;

        @NameInMap("succeededPercent")
        public String succeededPercent;

        @NameInMap("successCount")
        public String successCount;

        @NameInMap("unavailableCount")
        public String unavailableCount;

        @NameInMap("unavailablePercent")
        public String unavailablePercent;

        public static SenderStatisticsByTagNameAndBatchIDResponseBodyDataStat build(java.util.Map<String, ?> map) throws Exception {
            SenderStatisticsByTagNameAndBatchIDResponseBodyDataStat self = new SenderStatisticsByTagNameAndBatchIDResponseBodyDataStat();
            return TeaModel.build(map, self);
        }

        public SenderStatisticsByTagNameAndBatchIDResponseBodyDataStat setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SenderStatisticsByTagNameAndBatchIDResponseBodyDataStat setFaildCount(String faildCount) {
            this.faildCount = faildCount;
            return this;
        }
        public String getFaildCount() {
            return this.faildCount;
        }

        public SenderStatisticsByTagNameAndBatchIDResponseBodyDataStat setRequestCount(String requestCount) {
            this.requestCount = requestCount;
            return this;
        }
        public String getRequestCount() {
            return this.requestCount;
        }

        public SenderStatisticsByTagNameAndBatchIDResponseBodyDataStat setSucceededPercent(String succeededPercent) {
            this.succeededPercent = succeededPercent;
            return this;
        }
        public String getSucceededPercent() {
            return this.succeededPercent;
        }

        public SenderStatisticsByTagNameAndBatchIDResponseBodyDataStat setSuccessCount(String successCount) {
            this.successCount = successCount;
            return this;
        }
        public String getSuccessCount() {
            return this.successCount;
        }

        public SenderStatisticsByTagNameAndBatchIDResponseBodyDataStat setUnavailableCount(String unavailableCount) {
            this.unavailableCount = unavailableCount;
            return this;
        }
        public String getUnavailableCount() {
            return this.unavailableCount;
        }

        public SenderStatisticsByTagNameAndBatchIDResponseBodyDataStat setUnavailablePercent(String unavailablePercent) {
            this.unavailablePercent = unavailablePercent;
            return this;
        }
        public String getUnavailablePercent() {
            return this.unavailablePercent;
        }

    }

    public static class SenderStatisticsByTagNameAndBatchIDResponseBodyData extends TeaModel {
        @NameInMap("stat")
        public java.util.List<SenderStatisticsByTagNameAndBatchIDResponseBodyDataStat> stat;

        public static SenderStatisticsByTagNameAndBatchIDResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SenderStatisticsByTagNameAndBatchIDResponseBodyData self = new SenderStatisticsByTagNameAndBatchIDResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SenderStatisticsByTagNameAndBatchIDResponseBodyData setStat(java.util.List<SenderStatisticsByTagNameAndBatchIDResponseBodyDataStat> stat) {
            this.stat = stat;
            return this;
        }
        public java.util.List<SenderStatisticsByTagNameAndBatchIDResponseBodyDataStat> getStat() {
            return this.stat;
        }

    }

}
