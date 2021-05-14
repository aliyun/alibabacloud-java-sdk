// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeShardTaskInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public DescribeShardTaskInfoResponseData data;

    public static DescribeShardTaskInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeShardTaskInfoResponse self = new DescribeShardTaskInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeShardTaskInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeShardTaskInfoResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeShardTaskInfoResponse setData(DescribeShardTaskInfoResponseData data) {
        this.data = data;
        return this;
    }
    public DescribeShardTaskInfoResponseData getData() {
        return this.data;
    }

    public static class DescribeShardTaskInfoResponseDataFull extends TeaModel {
        @NameInMap("Expired")
        @Validation(required = true)
        public Integer expired;

        @NameInMap("Progress")
        @Validation(required = true)
        public Integer progress;

        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("Tps")
        @Validation(required = true)
        public Integer tps;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        public static DescribeShardTaskInfoResponseDataFull build(java.util.Map<String, ?> map) throws Exception {
            DescribeShardTaskInfoResponseDataFull self = new DescribeShardTaskInfoResponseDataFull();
            return TeaModel.build(map, self);
        }

        public DescribeShardTaskInfoResponseDataFull setExpired(Integer expired) {
            this.expired = expired;
            return this;
        }
        public Integer getExpired() {
            return this.expired;
        }

        public DescribeShardTaskInfoResponseDataFull setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeShardTaskInfoResponseDataFull setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public DescribeShardTaskInfoResponseDataFull setTps(Integer tps) {
            this.tps = tps;
            return this;
        }
        public Integer getTps() {
            return this.tps;
        }

        public DescribeShardTaskInfoResponseDataFull setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class DescribeShardTaskInfoResponseDataFullCheck extends TeaModel {
        @NameInMap("Expired")
        @Validation(required = true)
        public Integer expired;

        @NameInMap("Progress")
        @Validation(required = true)
        public Integer progress;

        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("Tps")
        @Validation(required = true)
        public Integer tps;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        public static DescribeShardTaskInfoResponseDataFullCheck build(java.util.Map<String, ?> map) throws Exception {
            DescribeShardTaskInfoResponseDataFullCheck self = new DescribeShardTaskInfoResponseDataFullCheck();
            return TeaModel.build(map, self);
        }

        public DescribeShardTaskInfoResponseDataFullCheck setExpired(Integer expired) {
            this.expired = expired;
            return this;
        }
        public Integer getExpired() {
            return this.expired;
        }

        public DescribeShardTaskInfoResponseDataFullCheck setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeShardTaskInfoResponseDataFullCheck setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public DescribeShardTaskInfoResponseDataFullCheck setTps(Integer tps) {
            this.tps = tps;
            return this;
        }
        public Integer getTps() {
            return this.tps;
        }

        public DescribeShardTaskInfoResponseDataFullCheck setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class DescribeShardTaskInfoResponseDataFullRevise extends TeaModel {
        @NameInMap("Expired")
        @Validation(required = true)
        public Integer expired;

        @NameInMap("Progress")
        @Validation(required = true)
        public Integer progress;

        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("Tps")
        @Validation(required = true)
        public Integer tps;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        public static DescribeShardTaskInfoResponseDataFullRevise build(java.util.Map<String, ?> map) throws Exception {
            DescribeShardTaskInfoResponseDataFullRevise self = new DescribeShardTaskInfoResponseDataFullRevise();
            return TeaModel.build(map, self);
        }

        public DescribeShardTaskInfoResponseDataFullRevise setExpired(Integer expired) {
            this.expired = expired;
            return this;
        }
        public Integer getExpired() {
            return this.expired;
        }

        public DescribeShardTaskInfoResponseDataFullRevise setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeShardTaskInfoResponseDataFullRevise setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public DescribeShardTaskInfoResponseDataFullRevise setTps(Integer tps) {
            this.tps = tps;
            return this;
        }
        public Integer getTps() {
            return this.tps;
        }

        public DescribeShardTaskInfoResponseDataFullRevise setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class DescribeShardTaskInfoResponseDataReview extends TeaModel {
        @NameInMap("Expired")
        @Validation(required = true)
        public Integer expired;

        @NameInMap("Progress")
        @Validation(required = true)
        public Integer progress;

        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("Tps")
        @Validation(required = true)
        public Integer tps;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        public static DescribeShardTaskInfoResponseDataReview build(java.util.Map<String, ?> map) throws Exception {
            DescribeShardTaskInfoResponseDataReview self = new DescribeShardTaskInfoResponseDataReview();
            return TeaModel.build(map, self);
        }

        public DescribeShardTaskInfoResponseDataReview setExpired(Integer expired) {
            this.expired = expired;
            return this;
        }
        public Integer getExpired() {
            return this.expired;
        }

        public DescribeShardTaskInfoResponseDataReview setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeShardTaskInfoResponseDataReview setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public DescribeShardTaskInfoResponseDataReview setTps(Integer tps) {
            this.tps = tps;
            return this;
        }
        public Integer getTps() {
            return this.tps;
        }

        public DescribeShardTaskInfoResponseDataReview setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class DescribeShardTaskInfoResponseDataIncrement extends TeaModel {
        @NameInMap("Delay")
        @Validation(required = true)
        public Integer delay;

        @NameInMap("Tps")
        @Validation(required = true)
        public Integer tps;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        public static DescribeShardTaskInfoResponseDataIncrement build(java.util.Map<String, ?> map) throws Exception {
            DescribeShardTaskInfoResponseDataIncrement self = new DescribeShardTaskInfoResponseDataIncrement();
            return TeaModel.build(map, self);
        }

        public DescribeShardTaskInfoResponseDataIncrement setDelay(Integer delay) {
            this.delay = delay;
            return this;
        }
        public Integer getDelay() {
            return this.delay;
        }

        public DescribeShardTaskInfoResponseDataIncrement setTps(Integer tps) {
            this.tps = tps;
            return this;
        }
        public Integer getTps() {
            return this.tps;
        }

        public DescribeShardTaskInfoResponseDataIncrement setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class DescribeShardTaskInfoResponseData extends TeaModel {
        @NameInMap("SourceTableName")
        @Validation(required = true)
        public String sourceTableName;

        @NameInMap("TargetTableName")
        @Validation(required = true)
        public String targetTableName;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Stage")
        @Validation(required = true)
        public String stage;

        @NameInMap("Progress")
        @Validation(required = true)
        public String progress;

        @NameInMap("Expired")
        @Validation(required = true)
        public String expired;

        @NameInMap("Full")
        @Validation(required = true)
        public DescribeShardTaskInfoResponseDataFull full;

        @NameInMap("FullCheck")
        @Validation(required = true)
        public DescribeShardTaskInfoResponseDataFullCheck fullCheck;

        @NameInMap("FullRevise")
        @Validation(required = true)
        public DescribeShardTaskInfoResponseDataFullRevise fullRevise;

        @NameInMap("Review")
        @Validation(required = true)
        public DescribeShardTaskInfoResponseDataReview review;

        @NameInMap("Increment")
        @Validation(required = true)
        public DescribeShardTaskInfoResponseDataIncrement increment;

        public static DescribeShardTaskInfoResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeShardTaskInfoResponseData self = new DescribeShardTaskInfoResponseData();
            return TeaModel.build(map, self);
        }

        public DescribeShardTaskInfoResponseData setSourceTableName(String sourceTableName) {
            this.sourceTableName = sourceTableName;
            return this;
        }
        public String getSourceTableName() {
            return this.sourceTableName;
        }

        public DescribeShardTaskInfoResponseData setTargetTableName(String targetTableName) {
            this.targetTableName = targetTableName;
            return this;
        }
        public String getTargetTableName() {
            return this.targetTableName;
        }

        public DescribeShardTaskInfoResponseData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeShardTaskInfoResponseData setStage(String stage) {
            this.stage = stage;
            return this;
        }
        public String getStage() {
            return this.stage;
        }

        public DescribeShardTaskInfoResponseData setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeShardTaskInfoResponseData setExpired(String expired) {
            this.expired = expired;
            return this;
        }
        public String getExpired() {
            return this.expired;
        }

        public DescribeShardTaskInfoResponseData setFull(DescribeShardTaskInfoResponseDataFull full) {
            this.full = full;
            return this;
        }
        public DescribeShardTaskInfoResponseDataFull getFull() {
            return this.full;
        }

        public DescribeShardTaskInfoResponseData setFullCheck(DescribeShardTaskInfoResponseDataFullCheck fullCheck) {
            this.fullCheck = fullCheck;
            return this;
        }
        public DescribeShardTaskInfoResponseDataFullCheck getFullCheck() {
            return this.fullCheck;
        }

        public DescribeShardTaskInfoResponseData setFullRevise(DescribeShardTaskInfoResponseDataFullRevise fullRevise) {
            this.fullRevise = fullRevise;
            return this;
        }
        public DescribeShardTaskInfoResponseDataFullRevise getFullRevise() {
            return this.fullRevise;
        }

        public DescribeShardTaskInfoResponseData setReview(DescribeShardTaskInfoResponseDataReview review) {
            this.review = review;
            return this;
        }
        public DescribeShardTaskInfoResponseDataReview getReview() {
            return this.review;
        }

        public DescribeShardTaskInfoResponseData setIncrement(DescribeShardTaskInfoResponseDataIncrement increment) {
            this.increment = increment;
            return this;
        }
        public DescribeShardTaskInfoResponseDataIncrement getIncrement() {
            return this.increment;
        }

    }

}
