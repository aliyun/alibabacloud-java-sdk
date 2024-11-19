// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetEdgeDriverVersionResponseBody extends TeaModel {
    /**
     * <p>The return code of the operation. A value of Success indicates that the call was successful. Other values indicate that specific errors occurred. For more information, see <a href="https://help.aliyun.com/document_detail/135200.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data that is returned if the call was successful.</p>
     */
    @NameInMap("Data")
    public GetEdgeDriverVersionResponseBodyData data;

    /**
     * <p>The error message that is returned if the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>request parameter error</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6ECE664B-E670-47BA-A6AD-62B9F35E3A7B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. A value of true indicates that the call was successful. A value of false indicates that the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetEdgeDriverVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeDriverVersionResponseBody self = new GetEdgeDriverVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEdgeDriverVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEdgeDriverVersionResponseBody setData(GetEdgeDriverVersionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEdgeDriverVersionResponseBodyData getData() {
        return this.data;
    }

    public GetEdgeDriverVersionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetEdgeDriverVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEdgeDriverVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetEdgeDriverVersionResponseBodyData extends TeaModel {
        /**
         * <p>The Java Virtual Machine (JVM) startup parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>-XX:+PrintGCDetails</p>
         */
        @NameInMap("Argument")
        public String argument;

        /**
         * <p>The rule for verifying configurations. The value is a JSON string in the following format:</p>
         * <p><code>{&quot;deviceConfig&quot;:{&quot;required&quot;:false},&quot;driverConfig&quot;:{&quot;required&quot;:false}</code></p>
         * <p>The JSON string contains the following parameters:</p>
         * <ul>
         * <li>driverConfig: the rule for verifying the configuration of the driver when the driver is to be deployed in an edge instance.</li>
         * <li>deviceConfig: the rule for verifying the configurations of devices that use the driver when the driver is to be deployed in an edge instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;deviceConfig\&quot;:{\&quot;required\&quot;:false},\&quot;driverConfig\&quot;:{\&quot;required\&quot;:false}}</p>
         */
        @NameInMap("ConfigCheckRule")
        public String configCheckRule;

        /**
         * <p>The configuration of the container where the driver runs. The value is a JSON string. For more information about parameters in the JSON string, see the following parameter description of ContainerConfig.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;devMappings\&quot;:[],\&quot;hostNetworkMode\&quot;:0,\&quot;portMappings\&quot;:[],\&quot;privileged\&quot;:1,\&quot;volumeMappings\&quot;:[]}</p>
         */
        @NameInMap("ContainerConfig")
        public String containerConfig;

        /**
         * <p>The description of the driver.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The configuration of the driver. The value is a JSON string in the following format:</p>
         * <p><code>{&quot;format&quot;:&quot;JSON&quot;,&quot;content&quot;:&quot;{}&quot;}</code></p>
         * <p>The JSON string contains the following parameters:</p>
         * <ul>
         * <li>format: the format of the driver configuration. Valid values: KV (key-value pair), JSON (JSON string), and FILE (configuration file).</li>
         * <li>content: the content of the driver configuration. If the format parameter is set to KV or JSON, the value of this parameter is the configuration content. If the format parameter is set to FILE, the value of this parameter is the URL of the configuration file stored in Object Storage Service (OSS).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;content\&quot;:\&quot;{\\\&quot;defaultConfig\\\&quot;:\\\&quot;this is default driver config demo\\\&quot;}\&quot;,\&quot;format\&quot;:\&quot;JSON\&quot;}]</p>
         */
        @NameInMap("DriverConfig")
        public String driverConfig;

        /**
         * <p>The ID of the driver.</p>
         * 
         * <strong>example:</strong>
         * <p>fec565038d7544978d9aed5c1a******</p>
         */
        @NameInMap("DriverId")
        public String driverId;

        /**
         * <p>The version number of the driver.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.0</p>
         */
        @NameInMap("DriverVersion")
        public String driverVersion;

        /**
         * <p>The earliest version of Link IoT Edge that is supported by the driver.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0.0</p>
         */
        @NameInMap("EdgeVersion")
        public String edgeVersion;

        /**
         * <p>The UNIX timestamp when the driver was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1581912859713</p>
         */
        @NameInMap("GmtCreateTimestamp")
        public Long gmtCreateTimestamp;

        /**
         * <p>The last UNIX timestamp when the driver was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1581912859713</p>
         */
        @NameInMap("GmtModifiedTimestamp")
        public Long gmtModifiedTimestamp;

        @NameInMap("SourceConfig")
        public String sourceConfig;

        /**
         * <p>The status of the driver version. Valid values:</p>
         * <ul>
         * <li>0: The driver version was not published.</li>
         * <li>1: The driver version was published.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("VersionState")
        public String versionState;

        public static GetEdgeDriverVersionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEdgeDriverVersionResponseBodyData self = new GetEdgeDriverVersionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEdgeDriverVersionResponseBodyData setArgument(String argument) {
            this.argument = argument;
            return this;
        }
        public String getArgument() {
            return this.argument;
        }

        public GetEdgeDriverVersionResponseBodyData setConfigCheckRule(String configCheckRule) {
            this.configCheckRule = configCheckRule;
            return this;
        }
        public String getConfigCheckRule() {
            return this.configCheckRule;
        }

        public GetEdgeDriverVersionResponseBodyData setContainerConfig(String containerConfig) {
            this.containerConfig = containerConfig;
            return this;
        }
        public String getContainerConfig() {
            return this.containerConfig;
        }

        public GetEdgeDriverVersionResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetEdgeDriverVersionResponseBodyData setDriverConfig(String driverConfig) {
            this.driverConfig = driverConfig;
            return this;
        }
        public String getDriverConfig() {
            return this.driverConfig;
        }

        public GetEdgeDriverVersionResponseBodyData setDriverId(String driverId) {
            this.driverId = driverId;
            return this;
        }
        public String getDriverId() {
            return this.driverId;
        }

        public GetEdgeDriverVersionResponseBodyData setDriverVersion(String driverVersion) {
            this.driverVersion = driverVersion;
            return this;
        }
        public String getDriverVersion() {
            return this.driverVersion;
        }

        public GetEdgeDriverVersionResponseBodyData setEdgeVersion(String edgeVersion) {
            this.edgeVersion = edgeVersion;
            return this;
        }
        public String getEdgeVersion() {
            return this.edgeVersion;
        }

        public GetEdgeDriverVersionResponseBodyData setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        public GetEdgeDriverVersionResponseBodyData setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
            this.gmtModifiedTimestamp = gmtModifiedTimestamp;
            return this;
        }
        public Long getGmtModifiedTimestamp() {
            return this.gmtModifiedTimestamp;
        }

        public GetEdgeDriverVersionResponseBodyData setSourceConfig(String sourceConfig) {
            this.sourceConfig = sourceConfig;
            return this;
        }
        public String getSourceConfig() {
            return this.sourceConfig;
        }

        public GetEdgeDriverVersionResponseBodyData setVersionState(String versionState) {
            this.versionState = versionState;
            return this;
        }
        public String getVersionState() {
            return this.versionState;
        }

    }

}
