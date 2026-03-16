// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GatewayOption extends TeaModel {
    /**
     * <p>Specifies whether to disable the HTTP/2 protocol.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DisableHttp2Alpn")
    public Boolean disableHttp2Alpn;

    /**
     * <p>Specifies whether to enable hardware acceleration.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableHardwareAcceleration")
    public Boolean enableHardwareAcceleration;

    /**
     * <p>Specifies whether to enable Web Application Firewall (WAF).</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableWaf")
    public Boolean enableWaf;

    /**
     * <p>The description of Simple Log Service.</p>
     */
    @NameInMap("LogConfigDetails")
    public GatewayOptionLogConfigDetails logConfigDetails;

    /**
     * <p>The data structure.</p>
     */
    @NameInMap("TraceDetails")
    public GatewayOptionTraceDetails traceDetails;

    public static GatewayOption build(java.util.Map<String, ?> map) throws Exception {
        GatewayOption self = new GatewayOption();
        return TeaModel.build(map, self);
    }

    public GatewayOption setDisableHttp2Alpn(Boolean disableHttp2Alpn) {
        this.disableHttp2Alpn = disableHttp2Alpn;
        return this;
    }
    public Boolean getDisableHttp2Alpn() {
        return this.disableHttp2Alpn;
    }

    public GatewayOption setEnableHardwareAcceleration(Boolean enableHardwareAcceleration) {
        this.enableHardwareAcceleration = enableHardwareAcceleration;
        return this;
    }
    public Boolean getEnableHardwareAcceleration() {
        return this.enableHardwareAcceleration;
    }

    public GatewayOption setEnableWaf(Boolean enableWaf) {
        this.enableWaf = enableWaf;
        return this;
    }
    public Boolean getEnableWaf() {
        return this.enableWaf;
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
        /**
         * <p>Specifies whether to activate Simple Log Service.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li><p>true</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>false</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("LogEnabled")
        public Boolean logEnabled;

        /**
         * <p>The name of the Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("LogStoreName")
        public String logStoreName;

        /**
         * <p>The name of the destination Simple Log Service project.</p>
         * 
         * <strong>example:</strong>
         * <p>project</p>
         */
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
        /**
         * <p>The sampling rate of Tracing Analysis.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Sample")
        public Long sample;

        /**
         * <p>The ID of the SkyWalking service. This parameter is required if TraceType is set to SKYWALKING.</p>
         * 
         * <strong>example:</strong>
         * <p>10458</p>
         */
        @NameInMap("ServiceId")
        public Long serviceId;

        /**
         * <p>The port of the SkyWalking service. This parameter is required if TraceType is set to SKYWALKING.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("ServicePort")
        public String servicePort;

        /**
         * <p>Specifies whether to activate Tracing Analysis.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li><p>false</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>true</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("TraceEnabled")
        public Boolean traceEnabled;

        /**
         * <p>The type of Tracing Analysis. Valid values: XTRACE and SKYWALKING.</p>
         * 
         * <strong>example:</strong>
         * <p>XTRACE</p>
         */
        @NameInMap("TraceType")
        public String traceType;

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

        public GatewayOptionTraceDetails setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

        public GatewayOptionTraceDetails setServicePort(String servicePort) {
            this.servicePort = servicePort;
            return this;
        }
        public String getServicePort() {
            return this.servicePort;
        }

        public GatewayOptionTraceDetails setTraceEnabled(Boolean traceEnabled) {
            this.traceEnabled = traceEnabled;
            return this;
        }
        public Boolean getTraceEnabled() {
            return this.traceEnabled;
        }

        public GatewayOptionTraceDetails setTraceType(String traceType) {
            this.traceType = traceType;
            return this;
        }
        public String getTraceType() {
            return this.traceType;
        }

    }

}
