// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GatewayOption extends TeaModel {
    // 日志配置详情
    @NameInMap("LogConfigDetails")
    public GatewayOptionLogConfigDetails logConfigDetails;

    // xtrace config option
    @NameInMap("TraceDetails")
    public GatewayOptionTraceDetails traceDetails;

    public static GatewayOption build(java.util.Map<String, ?> map) throws Exception {
        GatewayOption self = new GatewayOption();
        return TeaModel.build(map, self);
    }

    public GatewayOption setLogConfigDetails(GatewayOptionLogConfigDetails logConfigDetails) {
        this.logConfigDetails = logConfigDetails;
        return this;
    }
    public GatewayOptionLogConfigDetails getLogConfigDetails() {
        return this.logConfigDetails;
    }

    public GatewayOption setTraceDetails(GatewayOptionTraceDetails traceDetails) {
        this.traceDetails = traceDetails;
        return this;
    }
    public GatewayOptionTraceDetails getTraceDetails() {
        return this.traceDetails;
    }

    public static class GatewayOptionLogConfigDetails extends TeaModel {
        // 是否开启日志投递
        @NameInMap("LogEnabled")
        public Boolean logEnabled;

        // 投递的目标logstore
        @NameInMap("LogStoreName")
        public String logStoreName;

        // 投递的目标project
        @NameInMap("ProjectName")
        public String projectName;

        public static GatewayOptionLogConfigDetails build(java.util.Map<String, ?> map) throws Exception {
            GatewayOptionLogConfigDetails self = new GatewayOptionLogConfigDetails();
            return TeaModel.build(map, self);
        }

        public GatewayOptionLogConfigDetails setLogEnabled(Boolean logEnabled) {
            this.logEnabled = logEnabled;
            return this;
        }
        public Boolean getLogEnabled() {
            return this.logEnabled;
        }

        public GatewayOptionLogConfigDetails setLogStoreName(String logStoreName) {
            this.logStoreName = logStoreName;
            return this;
        }
        public String getLogStoreName() {
            return this.logStoreName;
        }

        public GatewayOptionLogConfigDetails setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

    }

    public static class GatewayOptionTraceDetails extends TeaModel {
        // trace 采样率
        @NameInMap("Sample")
        public Long sample;

        // trace是否开启
        @NameInMap("TraceEnabled")
        public Boolean traceEnabled;

        public static GatewayOptionTraceDetails build(java.util.Map<String, ?> map) throws Exception {
            GatewayOptionTraceDetails self = new GatewayOptionTraceDetails();
            return TeaModel.build(map, self);
        }

        public GatewayOptionTraceDetails setSample(Long sample) {
            this.sample = sample;
            return this;
        }
        public Long getSample() {
            return this.sample;
        }

        public GatewayOptionTraceDetails setTraceEnabled(Boolean traceEnabled) {
            this.traceEnabled = traceEnabled;
            return this;
        }
        public Boolean getTraceEnabled() {
            return this.traceEnabled;
        }

    }

}
