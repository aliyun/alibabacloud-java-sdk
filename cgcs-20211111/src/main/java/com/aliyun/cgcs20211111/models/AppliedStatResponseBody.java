// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AppliedStatResponseBody extends TeaModel {
    // 业务处理结果Code
    @NameInMap("Code")
    public String code;

    // 业务对象
    @NameInMap("Data")
    public AppliedStatResponseBodyData data;

    // 业务处理消息摘要
    @NameInMap("Message")
    public String message;

    // 操作请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 业务处理是否成功
    @NameInMap("Success")
    public Boolean success;

    public static AppliedStatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AppliedStatResponseBody self = new AppliedStatResponseBody();
        return TeaModel.build(map, self);
    }

    public AppliedStatResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AppliedStatResponseBody setData(AppliedStatResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AppliedStatResponseBodyData getData() {
        return this.data;
    }

    public AppliedStatResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AppliedStatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AppliedStatResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AppliedStatResponseBodyData extends TeaModel {
        // 活跃应用个数
        @NameInMap("ActiveApplications")
        public Long activeApplications;

        // 日均应用运行时长
        @NameInMap("AverageDailyRuntime")
        public Long averageDailyRuntime;

        // 应用并发数量峰值
        @NameInMap("PeakConcurrency")
        public Long peakConcurrency;

        // 次均应用时长
        @NameInMap("SecondaryAverageTime")
        public Long secondaryAverageTime;

        public static AppliedStatResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AppliedStatResponseBodyData self = new AppliedStatResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AppliedStatResponseBodyData setActiveApplications(Long activeApplications) {
            this.activeApplications = activeApplications;
            return this;
        }
        public Long getActiveApplications() {
            return this.activeApplications;
        }

        public AppliedStatResponseBodyData setAverageDailyRuntime(Long averageDailyRuntime) {
            this.averageDailyRuntime = averageDailyRuntime;
            return this;
        }
        public Long getAverageDailyRuntime() {
            return this.averageDailyRuntime;
        }

        public AppliedStatResponseBodyData setPeakConcurrency(Long peakConcurrency) {
            this.peakConcurrency = peakConcurrency;
            return this;
        }
        public Long getPeakConcurrency() {
            return this.peakConcurrency;
        }

        public AppliedStatResponseBodyData setSecondaryAverageTime(Long secondaryAverageTime) {
            this.secondaryAverageTime = secondaryAverageTime;
            return this;
        }
        public Long getSecondaryAverageTime() {
            return this.secondaryAverageTime;
        }

    }

}
