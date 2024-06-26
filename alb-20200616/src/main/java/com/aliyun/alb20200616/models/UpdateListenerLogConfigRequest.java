// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateListenerLogConfigRequest extends TeaModel {
    /**
     * <p>Specifies whether to record custom headers in the access log. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong> (default)</li>
     * </ul>
     * <blockquote>
     * <p>You can set this parameter to <strong>true</strong> only if the access log feature is enabled by specifying <strong>AccessLogEnabled</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AccessLogRecordCustomizedHeadersEnabled")
    public Boolean accessLogRecordCustomizedHeadersEnabled;

    /**
     * <p>The configuration information about the Xtrace feature.</p>
     */
    @NameInMap("AccessLogTracingConfig")
    public UpdateListenerLogConfigRequestAccessLogTracingConfig accessLogTracingConfig;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong>: (default): performs a dry run and performs the actual request. If the request passes the dry run, a <strong>2xx HTTP</strong> status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the Application Load Balancer (ALB) listener.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lsr-bp1bpn0kn908w4nbw****</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    public static UpdateListenerLogConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateListenerLogConfigRequest self = new UpdateListenerLogConfigRequest();
        return TeaModel.build(map, self);
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

    public UpdateListenerLogConfigRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public static class UpdateListenerLogConfigRequestAccessLogTracingConfig extends TeaModel {
        /**
         * <p>Specifies whether to enable the Xtrace feature. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * <blockquote>
         * <p>You can set this parameter to <strong>true</strong> only if the access log feature is enabled by specifying <strong>AccessLogEnabled</strong>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("TracingEnabled")
        public Boolean tracingEnabled;

        /**
         * <p>The sampling rate of the Xtrace feature.</p>
         * <p>Valid values: <strong>1 to 10000</strong>.</p>
         * <blockquote>
         * <p>This parameter takes effect only if you set <strong>TracingEnabled</strong> to <strong>true</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TracingSample")
        public Integer tracingSample;

        /**
         * <p>The type of Xtrace. Set the value to <strong>Zipkin</strong>.</p>
         * <blockquote>
         * <p>This parameter takes effect only if you set <strong>TracingEnabled</strong> to <strong>true</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Zipkin</p>
         */
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
