// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeShardTaskInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DescribeShardTaskInfoResponseBodyData data;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeShardTaskInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeShardTaskInfoResponseBody self = new DescribeShardTaskInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeShardTaskInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeShardTaskInfoResponseBody setData(DescribeShardTaskInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeShardTaskInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeShardTaskInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeShardTaskInfoResponseBodyDataFull extends TeaModel {
        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("Tps")
        public Integer tps;

        @NameInMap("Expired")
        public Integer expired;

        @NameInMap("Total")
        public Integer total;

        public static DescribeShardTaskInfoResponseBodyDataFull build(java.util.Map<String, ?> map) throws Exception {
            DescribeShardTaskInfoResponseBodyDataFull self = new DescribeShardTaskInfoResponseBodyDataFull();
            return TeaModel.build(map, self);
        }

        public DescribeShardTaskInfoResponseBodyDataFull setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeShardTaskInfoResponseBodyDataFull setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeShardTaskInfoResponseBodyDataFull setTps(Integer tps) {
            this.tps = tps;
            return this;
        }
        public Integer getTps() {
            return this.tps;
        }

        public DescribeShardTaskInfoResponseBodyDataFull setExpired(Integer expired) {
            this.expired = expired;
            return this;
        }
        public Integer getExpired() {
            return this.expired;
        }

        public DescribeShardTaskInfoResponseBodyDataFull setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class DescribeShardTaskInfoResponseBodyDataReview extends TeaModel {
        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("Tps")
        public Integer tps;

        @NameInMap("Expired")
        public Integer expired;

        @NameInMap("Total")
        public Integer total;

        public static DescribeShardTaskInfoResponseBodyDataReview build(java.util.Map<String, ?> map) throws Exception {
            DescribeShardTaskInfoResponseBodyDataReview self = new DescribeShardTaskInfoResponseBodyDataReview();
            return TeaModel.build(map, self);
        }

        public DescribeShardTaskInfoResponseBodyDataReview setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeShardTaskInfoResponseBodyDataReview setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeShardTaskInfoResponseBodyDataReview setTps(Integer tps) {
            this.tps = tps;
            return this;
        }
        public Integer getTps() {
            return this.tps;
        }

        public DescribeShardTaskInfoResponseBodyDataReview setExpired(Integer expired) {
            this.expired = expired;
            return this;
        }
        public Integer getExpired() {
            return this.expired;
        }

        public DescribeShardTaskInfoResponseBodyDataReview setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class DescribeShardTaskInfoResponseBodyDataFullRevise extends TeaModel {
        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("Tps")
        public Integer tps;

        @NameInMap("Expired")
        public Integer expired;

        @NameInMap("Total")
        public Integer total;

        public static DescribeShardTaskInfoResponseBodyDataFullRevise build(java.util.Map<String, ?> map) throws Exception {
            DescribeShardTaskInfoResponseBodyDataFullRevise self = new DescribeShardTaskInfoResponseBodyDataFullRevise();
            return TeaModel.build(map, self);
        }

        public DescribeShardTaskInfoResponseBodyDataFullRevise setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeShardTaskInfoResponseBodyDataFullRevise setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeShardTaskInfoResponseBodyDataFullRevise setTps(Integer tps) {
            this.tps = tps;
            return this;
        }
        public Integer getTps() {
            return this.tps;
        }

        public DescribeShardTaskInfoResponseBodyDataFullRevise setExpired(Integer expired) {
            this.expired = expired;
            return this;
        }
        public Integer getExpired() {
            return this.expired;
        }

        public DescribeShardTaskInfoResponseBodyDataFullRevise setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class DescribeShardTaskInfoResponseBodyDataFullCheck extends TeaModel {
        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("Tps")
        public Integer tps;

        @NameInMap("Expired")
        public Integer expired;

        @NameInMap("Total")
        public Integer total;

        public static DescribeShardTaskInfoResponseBodyDataFullCheck build(java.util.Map<String, ?> map) throws Exception {
            DescribeShardTaskInfoResponseBodyDataFullCheck self = new DescribeShardTaskInfoResponseBodyDataFullCheck();
            return TeaModel.build(map, self);
        }

        public DescribeShardTaskInfoResponseBodyDataFullCheck setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeShardTaskInfoResponseBodyDataFullCheck setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeShardTaskInfoResponseBodyDataFullCheck setTps(Integer tps) {
            this.tps = tps;
            return this;
        }
        public Integer getTps() {
            return this.tps;
        }

        public DescribeShardTaskInfoResponseBodyDataFullCheck setExpired(Integer expired) {
            this.expired = expired;
            return this;
        }
        public Integer getExpired() {
            return this.expired;
        }

        public DescribeShardTaskInfoResponseBodyDataFullCheck setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
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

    public static class DescribeShardTaskInfoResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Full")
        public DescribeShardTaskInfoResponseBodyDataFull full;

        @NameInMap("Stage")
        public String stage;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("Review")
        public DescribeShardTaskInfoResponseBodyDataReview review;

        @NameInMap("Expired")
        public String expired;

        @NameInMap("TargetTableName")
        public String targetTableName;

        @NameInMap("FullRevise")
        public DescribeShardTaskInfoResponseBodyDataFullRevise fullRevise;

        @NameInMap("SourceTableName")
        public String sourceTableName;

        @NameInMap("FullCheck")
        public DescribeShardTaskInfoResponseBodyDataFullCheck fullCheck;

        @NameInMap("Increment")
        public DescribeShardTaskInfoResponseBodyDataIncrement increment;

        public static DescribeShardTaskInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeShardTaskInfoResponseBodyData self = new DescribeShardTaskInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeShardTaskInfoResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeShardTaskInfoResponseBodyData setFull(DescribeShardTaskInfoResponseBodyDataFull full) {
            this.full = full;
            return this;
        }
        public DescribeShardTaskInfoResponseBodyDataFull getFull() {
            return this.full;
        }

        public DescribeShardTaskInfoResponseBodyData setStage(String stage) {
            this.stage = stage;
            return this;
        }
        public String getStage() {
            return this.stage;
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

        public DescribeShardTaskInfoResponseBodyData setExpired(String expired) {
            this.expired = expired;
            return this;
        }
        public String getExpired() {
            return this.expired;
        }

        public DescribeShardTaskInfoResponseBodyData setTargetTableName(String targetTableName) {
            this.targetTableName = targetTableName;
            return this;
        }
        public String getTargetTableName() {
            return this.targetTableName;
        }

        public DescribeShardTaskInfoResponseBodyData setFullRevise(DescribeShardTaskInfoResponseBodyDataFullRevise fullRevise) {
            this.fullRevise = fullRevise;
            return this;
        }
        public DescribeShardTaskInfoResponseBodyDataFullRevise getFullRevise() {
            return this.fullRevise;
        }

        public DescribeShardTaskInfoResponseBodyData setSourceTableName(String sourceTableName) {
            this.sourceTableName = sourceTableName;
            return this;
        }
        public String getSourceTableName() {
            return this.sourceTableName;
        }

        public DescribeShardTaskInfoResponseBodyData setFullCheck(DescribeShardTaskInfoResponseBodyDataFullCheck fullCheck) {
            this.fullCheck = fullCheck;
            return this;
        }
        public DescribeShardTaskInfoResponseBodyDataFullCheck getFullCheck() {
            return this.fullCheck;
        }

        public DescribeShardTaskInfoResponseBodyData setIncrement(DescribeShardTaskInfoResponseBodyDataIncrement increment) {
            this.increment = increment;
            return this;
        }
        public DescribeShardTaskInfoResponseBodyDataIncrement getIncrement() {
            return this.increment;
        }

    }

}
