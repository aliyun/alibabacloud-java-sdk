// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateListenerLogConfigRequest extends TeaModel {
    /**
     * <p>Specifies whether to record custom headers in the access log. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false** (default)</p>
     * <br>
     * <p>> You can set this parameter to **true** only if the access log feature is enabled by specifying **AccessLogEnabled**.</p>
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
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>> If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <br>
     * <p>*   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false**: (default): performs a dry run and performs the actual request. If the request passes the dry run, a **2xx HTTP** status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the Application Load Balancer (ALB) listener.</p>
     * <br>
     * <p>This parameter is required.</p>
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
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false** (default)</p>
         * <br>
         * <p>> You can set this parameter to **true** only if the access log feature is enabled by specifying **AccessLogEnabled**.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("TracingEnabled")
        public Boolean tracingEnabled;

        /**
         * <p>The sampling rate of the Xtrace feature.</p>
         * <br>
         * <p>Valid values: **1 to 10000**.</p>
         * <br>
         * <p>> This parameter takes effect only if you set **TracingEnabled** to **true**.</p>
         */
        @NameInMap("TracingSample")
        public Integer tracingSample;

        /**
         * <p>The type of Xtrace. Set the value to **Zipkin**.</p>
         * <br>
         * <p>> This parameter takes effect only if you set **TracingEnabled** to **true**.</p>
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
