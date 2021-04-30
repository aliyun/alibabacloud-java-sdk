// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateListenerLogConfigRequest extends TeaModel {
    // 监听标识
    @NameInMap("ListenerId")
    public String listenerId;

    // 幂等标识
    @NameInMap("ClientToken")
    public String clientToken;

    //  是否只预检此次请求
    @NameInMap("DryRun")
    public Boolean dryRun;

    // 是否开启携带自定义Header
    @NameInMap("AccessLogRecordCustomizedHeadersEnabled")
    public Boolean accessLogRecordCustomizedHeadersEnabled;

    // 访问日志xtrace字段相关的配置
    @NameInMap("AccessLogTracingConfig")
    public UpdateListenerLogConfigRequestAccessLogTracingConfig accessLogTracingConfig;

    public static UpdateListenerLogConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateListenerLogConfigRequest self = new UpdateListenerLogConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateListenerLogConfigRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public UpdateListenerLogConfigRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateListenerLogConfigRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateListenerLogConfigRequest setAccessLogRecordCustomizedHeadersEnabled(Boolean accessLogRecordCustomizedHeadersEnabled) {
        this.accessLogRecordCustomizedHeadersEnabled = accessLogRecordCustomizedHeadersEnabled;
        return this;
    }
    public Boolean getAccessLogRecordCustomizedHeadersEnabled() {
        return this.accessLogRecordCustomizedHeadersEnabled;
    }

    public UpdateListenerLogConfigRequest setAccessLogTracingConfig(UpdateListenerLogConfigRequestAccessLogTracingConfig accessLogTracingConfig) {
        this.accessLogTracingConfig = accessLogTracingConfig;
        return this;
    }
    public UpdateListenerLogConfigRequestAccessLogTracingConfig getAccessLogTracingConfig() {
        return this.accessLogTracingConfig;
    }

    public static class UpdateListenerLogConfigRequestAccessLogTracingConfig extends TeaModel {
        // Xtrace功能状态
        @NameInMap("TracingEnabled")
        public Boolean tracingEnabled;

        // xtrace的采样率
        @NameInMap("TracingSample")
        public Integer tracingSample;

        // xtrace的类型
        @NameInMap("TracingType")
        public String tracingType;

        public static UpdateListenerLogConfigRequestAccessLogTracingConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateListenerLogConfigRequestAccessLogTracingConfig self = new UpdateListenerLogConfigRequestAccessLogTracingConfig();
            return TeaModel.build(map, self);
        }

        public UpdateListenerLogConfigRequestAccessLogTracingConfig setTracingEnabled(Boolean tracingEnabled) {
            this.tracingEnabled = tracingEnabled;
            return this;
        }
        public Boolean getTracingEnabled() {
            return this.tracingEnabled;
        }

        public UpdateListenerLogConfigRequestAccessLogTracingConfig setTracingSample(Integer tracingSample) {
            this.tracingSample = tracingSample;
            return this;
        }
        public Integer getTracingSample() {
            return this.tracingSample;
        }

        public UpdateListenerLogConfigRequestAccessLogTracingConfig setTracingType(String tracingType) {
            this.tracingType = tracingType;
            return this;
        }
        public String getTracingType() {
            return this.tracingType;
        }

    }

}
