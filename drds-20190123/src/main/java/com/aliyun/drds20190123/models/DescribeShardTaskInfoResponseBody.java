// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeShardTaskInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeShardTaskInfoResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeShardTaskInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeShardTaskInfoResponseBody self = new DescribeShardTaskInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeShardTaskInfoResponseBody setData(DescribeShardTaskInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeShardTaskInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeShardTaskInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeShardTaskInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeShardTaskInfoResponseBodyDataFull extends TeaModel {
        @NameInMap("Expired")
        public Integer expired;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("Tps")
        public Integer tps;

        public static DescribeShardTaskInfoResponseBodyDataFull build(java.util.Map<String, ?> map) throws Exception {
            DescribeShardTaskInfoResponseBodyDataFull self = new DescribeShardTaskInfoResponseBodyDataFull();
            return TeaModel.build(map, self);
        }

        public DescribeShardTaskInfoResponseBodyDataFull setExpired(Integer expired) {
            this.expired = expired;
            return this;
        }
        public Integer getExpired() {
            return this.expired;
        }

        public DescribeShardTaskInfoResponseBodyDataFull setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeShardTaskInfoResponseBodyDataFull setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeShardTaskInfoResponseBodyDataFull setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public DescribeShardTaskInfoResponseBodyDataFull setTps(Integer tps) {
            this.tps = tps;
            return this;
        }
        public Integer getTps() {
            return this.tps;
        }

    }

    public static class DescribeShardTaskInfoResponseBodyDataFullCheck extends TeaModel {
        @NameInMap("Expired")
        public Integer expired;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("Tps")
        public Integer tps;

        public static DescribeShardTaskInfoResponseBodyDataFullCheck build(java.util.Map<String, ?> map) throws Exception {
            DescribeShardTaskInfoResponseBodyDataFullCheck self = new DescribeShardTaskInfoResponseBodyDataFullCheck();
            return TeaModel.build(map, self);
        }

        public DescribeShardTaskInfoResponseBodyDataFullCheck setExpired(Integer expired) {
            this.expired = expired;
            return this;
        }
        public Integer getExpired() {
            return this.expired;
        }

        public DescribeShardTaskInfoResponseBodyDataFullCheck setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeShardTaskInfoResponseBodyDataFullCheck setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeShardTaskInfoResponseBodyDataFullCheck setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public DescribeShardTaskInfoResponseBodyDataFullCheck setTps(Integer tps) {
            this.tps = tps;
            return this;
        }
        public Integer getTps() {
            return this.tps;
        }

    }

    public static class DescribeShardTaskInfoResponseBodyDataFullRevise extends TeaModel {
        @NameInMap("Expired")
        public Integer expired;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("Tps")
        public Integer tps;

        public static DescribeShardTaskInfoResponseBodyDataFullRevise build(java.util.Map<String, ?> map) throws Exception {
            DescribeShardTaskInfoResponseBodyDataFullRevise self = new DescribeShardTaskInfoResponseBodyDataFullRevise();
            return TeaModel.build(map, self);
        }

        public DescribeShardTaskInfoResponseBodyDataFullRevise setExpired(Integer expired) {
            this.expired = expired;
            return this;
        }
        public Integer getExpired() {
            return this.expired;
        }

        public DescribeShardTaskInfoResponseBodyDataFullRevise setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeShardTaskInfoResponseBodyDataFullRevise setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeShardTaskInfoResponseBodyDataFullRevise setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public DescribeShardTaskInfoResponseBodyDataFullRevise setTps(Integer tps) {
            this.tps = tps;
            return this;
        }
        public Integer getTps() {
            return this.tps;
        }

    }

    public static class DescribeShardTaskInfoResponseBodyDataIncrement extends TeaModel {
        @NameInMap("Delay")
        public Integer delay;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Tps")
        public Integer tps;

        public static DescribeShardTaskInfoResponseBodyDataIncrement build(java.util.Map<String, ?> map) throws Exception {
            DescribeShardTaskInfoResponseBodyDataIncrement self = new DescribeShardTaskInfoResponseBodyDataIncrement();
            return TeaModel.build(map, self);
        }

        public DescribeShardTaskInfoResponseBodyDataIncrement setDelay(Integer delay) {
            this.delay = delay;
            return this;
        }
        public Integer getDelay() {
            return this.delay;
        }

        public DescribeShardTaskInfoResponseBodyDataIncrement setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeShardTaskInfoResponseBodyDataIncrement setTps(Integer tps) {
            this.tps = tps;
            return this;
        }
        public Integer getTps() {
            return this.tps;
        }

    }

    public static class DescribeShardTaskInfoResponseBodyDataReview extends TeaModel {
        @NameInMap("Expired")
        public Integer expired;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("Tps")
        public Integer tps;

        public static DescribeShardTaskInfoResponseBodyDataReview build(java.util.Map<String, ?> map) throws Exception {
            DescribeShardTaskInfoResponseBodyDataReview self = new DescribeShardTaskInfoResponseBodyDataReview();
            return TeaModel.build(map, self);
        }

        public DescribeShardTaskInfoResponseBodyDataReview setExpired(Integer expired) {
            this.expired = expired;
            return this;
        }
        public Integer getExpired() {
            return this.expired;
        }

        public DescribeShardTaskInfoResponseBodyDataReview setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeShardTaskInfoResponseBodyDataReview setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeShardTaskInfoResponseBodyDataReview setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public DescribeShardTaskInfoResponseBodyDataReview setTps(Integer tps) {
            this.tps = tps;
            return this;
        }
        public Integer getTps() {
            return this.tps;
        }

    }

    public static class DescribeShardTaskInfoResponseBodyData extends TeaModel {
        @NameInMap("Expired")
        public String expired;

        @NameInMap("Full")
        public DescribeShardTaskInfoResponseBodyDataFull full;

        @NameInMap("FullCheck")
        public DescribeShardTaskInfoResponseBodyDataFullCheck fullCheck;

        @NameInMap("FullRevise")
        public DescribeShardTaskInfoResponseBodyDataFullRevise fullRevise;

        @NameInMap("Increment")
        public DescribeShardTaskInfoResponseBodyDataIncrement increment;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("Review")
        public DescribeShardTaskInfoResponseBodyDataReview review;

        @NameInMap("SourceTableName")
        public String sourceTableName;

        @NameInMap("Stage")
        public String stage;

        @NameInMap("Status")
        public String status;

        @NameInMap("TargetTableName")
        public String targetTableName;

        public static DescribeShardTaskInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeShardTaskInfoResponseBodyData self = new DescribeShardTaskInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeShardTaskInfoResponseBodyData setExpired(String expired) {
            this.expired = expired;
            return this;
        }
        public String getExpired() {
            return this.expired;
        }

        public DescribeShardTaskInfoResponseBodyData setFull(DescribeShardTaskInfoResponseBodyDataFull full) {
            this.full = full;
            return this;
        }
        public DescribeShardTaskInfoResponseBodyDataFull getFull() {
            return this.full;
        }

        public DescribeShardTaskInfoResponseBodyData setFullCheck(DescribeShardTaskInfoResponseBodyDataFullCheck fullCheck) {
            this.fullCheck = fullCheck;
            return this;
        }
        public DescribeShardTaskInfoResponseBodyDataFullCheck getFullCheck() {
            return this.fullCheck;
        }

        public DescribeShardTaskInfoResponseBodyData setFullRevise(DescribeShardTaskInfoResponseBodyDataFullRevise fullRevise) {
            this.fullRevise = fullRevise;
            return this;
        }
        public DescribeShardTaskInfoResponseBodyDataFullRevise getFullRevise() {
            return this.fullRevise;
        }

        public DescribeShardTaskInfoResponseBodyData setIncrement(DescribeShardTaskInfoResponseBodyDataIncrement increment) {
            this.increment = increment;
            return this;
        }
        public DescribeShardTaskInfoResponseBodyDataIncrement getIncrement() {
            return this.increment;
        }

        public DescribeShardTaskInfoResponseBodyData setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeShardTaskInfoResponseBodyData setReview(DescribeShardTaskInfoResponseBodyDataReview review) {
            this.review = review;
            return this;
        }
        public DescribeShardTaskInfoResponseBodyDataReview getReview() {
            return this.review;
        }

        public DescribeShardTaskInfoResponseBodyData setSourceTableName(String sourceTableName) {
            this.sourceTableName = sourceTableName;
            return this;
        }
        public String getSourceTableName() {
            return this.sourceTableName;
        }

        public DescribeShardTaskInfoResponseBodyData setStage(String stage) {
            this.stage = stage;
            return this;
        }
        public String getStage() {
            return this.stage;
        }

        public DescribeShardTaskInfoResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeShardTaskInfoResponseBodyData setTargetTableName(String targetTableName) {
            this.targetTableName = targetTableName;
            return this;
        }
        public String getTargetTableName() {
            return this.targetTableName;
        }

    }

}
