// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeNgSourceDiagnosisLogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Statistic")
    public java.util.List<DescribeNgSourceDiagnosisLogResponseBodyStatistic> statistic;

    @NameInMap("Total")
    public Long total;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DescribeNgSourceDiagnosisLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNgSourceDiagnosisLogResponseBody self = new DescribeNgSourceDiagnosisLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNgSourceDiagnosisLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNgSourceDiagnosisLogResponseBody setStatistic(java.util.List<DescribeNgSourceDiagnosisLogResponseBodyStatistic> statistic) {
        this.statistic = statistic;
        return this;
    }
    public java.util.List<DescribeNgSourceDiagnosisLogResponseBodyStatistic> getStatistic() {
        return this.statistic;
    }

    public DescribeNgSourceDiagnosisLogResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeNgSourceDiagnosisLogResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class DescribeNgSourceDiagnosisLogResponseBodyStatistic extends TeaModel {
        @NameInMap("Time")
        public String time;

        @NameInMap("SourceIp")
        public String sourceIp;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("SourcePort")
        public String sourcePort;

        @NameInMap("DetectPort")
        public String detectPort;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("DetectIp")
        public String detectIp;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("BizName")
        public String bizName;

        @NameInMap("BizId")
        public String bizId;

        @NameInMap("SourceIpLocation")
        public String sourceIpLocation;

        public static DescribeNgSourceDiagnosisLogResponseBodyStatistic build(java.util.Map<String, ?> map) throws Exception {
            DescribeNgSourceDiagnosisLogResponseBodyStatistic self = new DescribeNgSourceDiagnosisLogResponseBodyStatistic();
            return TeaModel.build(map, self);
        }

        public DescribeNgSourceDiagnosisLogResponseBodyStatistic setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeNgSourceDiagnosisLogResponseBodyStatistic setSourceIp(String sourceIp) {
            this.sourceIp = sourceIp;
            return this;
        }
        public String getSourceIp() {
            return this.sourceIp;
        }

        public DescribeNgSourceDiagnosisLogResponseBodyStatistic setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeNgSourceDiagnosisLogResponseBodyStatistic setSourcePort(String sourcePort) {
            this.sourcePort = sourcePort;
            return this;
        }
        public String getSourcePort() {
            return this.sourcePort;
        }

        public DescribeNgSourceDiagnosisLogResponseBodyStatistic setDetectPort(String detectPort) {
            this.detectPort = detectPort;
            return this;
        }
        public String getDetectPort() {
            return this.detectPort;
        }

        public DescribeNgSourceDiagnosisLogResponseBodyStatistic setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeNgSourceDiagnosisLogResponseBodyStatistic setDetectIp(String detectIp) {
            this.detectIp = detectIp;
            return this;
        }
        public String getDetectIp() {
            return this.detectIp;
        }

        public DescribeNgSourceDiagnosisLogResponseBodyStatistic setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeNgSourceDiagnosisLogResponseBodyStatistic setBizName(String bizName) {
            this.bizName = bizName;
            return this;
        }
        public String getBizName() {
            return this.bizName;
        }

        public DescribeNgSourceDiagnosisLogResponseBodyStatistic setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public DescribeNgSourceDiagnosisLogResponseBodyStatistic setSourceIpLocation(String sourceIpLocation) {
            this.sourceIpLocation = sourceIpLocation;
            return this;
        }
        public String getSourceIpLocation() {
            return this.sourceIpLocation;
        }

    }

}
