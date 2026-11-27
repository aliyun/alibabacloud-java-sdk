// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateListenerLogConfigRequest extends TeaModel {
    /**
     * <p>Specifies whether to record custom header fields in access logs. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes.</li>
     * <li><strong>false</strong> (default): no.</li>
     * </ul>
     * <blockquote>
     * <p>You can set this parameter to <strong>true</strong> only when the <strong>AccessLogEnabled</strong> switch for the instance is turned on.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AccessLogRecordCustomizedHeadersEnabled")
    public Boolean accessLogRecordCustomizedHeadersEnabled;

    /**
     * <p>The Xtrace configuration.</p>
     */
    @NameInMap("AccessLogTracingConfig")
    public UpdateListenerLogConfigRequestAccessLogTracingConfig accessLogTracingConfig;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate the value from your client and make sure that the value is unique across different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is unique.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs a dry run and does not update the log configuration of the listener. The system checks whether required parameters are specified, the request format is valid, and the service limits are met. If the request fails the dry run, an error is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): performs a dry run and sends the request. If the request passes the dry run, an <strong>HTTP_2xx</strong> status code is returned and the operation is performed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the listener for the application load balancing instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lsn-o4u54y73wq7b******</p>
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
         * <li><strong>true</strong>: yes.</li>
         * <li><strong>false</strong> (default): no.</li>
         * </ul>
         * <blockquote>
         * <p>You can set this parameter to <strong>true</strong> only when the <strong>AccessLogEnabled</strong> switch for the instance is turned on.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("TracingEnabled")
        public Boolean tracingEnabled;

        /**
         * <p>The Xtrace sampling rate.</p>
         * <p>Valid values: <strong>1</strong> to <strong>10000</strong>.</p>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>TracingEnabled</strong> is set to <strong>true</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TracingSample")
        public Integer tracingSample;

        /**
         * <p>The Xtrace type. Valid values: <strong>Zipkin</strong> and <strong>OpenTelemetry</strong>.</p>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>TracingEnabled</strong> is set to <strong>true</strong>.</p>
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
