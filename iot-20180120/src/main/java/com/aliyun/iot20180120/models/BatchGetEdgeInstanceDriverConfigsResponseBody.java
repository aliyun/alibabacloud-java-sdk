// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGetEdgeInstanceDriverConfigsResponseBody extends TeaModel {
    /**
     * <p>The return code of the operation. A value of Success indicates that the call was successful. Other values indicate that specific errors occurred. For more information, see [Error codes](~~135200~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data that is returned if the call was successful.</p>
     */
    @NameInMap("DriverConfigList")
    public java.util.List<BatchGetEdgeInstanceDriverConfigsResponseBodyDriverConfigList> driverConfigList;

    /**
     * <p>The error message that is returned if the call failed.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. A value of true indicates that the call was successful. A value of false indicates that the call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static BatchGetEdgeInstanceDriverConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchGetEdgeInstanceDriverConfigsResponseBody self = new BatchGetEdgeInstanceDriverConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchGetEdgeInstanceDriverConfigsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchGetEdgeInstanceDriverConfigsResponseBody setDriverConfigList(java.util.List<BatchGetEdgeInstanceDriverConfigsResponseBodyDriverConfigList> driverConfigList) {
        this.driverConfigList = driverConfigList;
        return this;
    }
    public java.util.List<BatchGetEdgeInstanceDriverConfigsResponseBodyDriverConfigList> getDriverConfigList() {
        return this.driverConfigList;
    }

    public BatchGetEdgeInstanceDriverConfigsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchGetEdgeInstanceDriverConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchGetEdgeInstanceDriverConfigsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchGetEdgeInstanceDriverConfigsResponseBodyDriverConfigListConfigList extends TeaModel {
        /**
         * <p>The ID of the configuration.</p>
         */
        @NameInMap("ConfigId")
        public String configId;

        /**
         * <p>The configuration content or the Object Storage Service (OSS) path of the configuration file.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The format of the configuration. Valid values: KV (key-value pair), JSON (JSON string), and FILE (configuration file).</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The key of the configuration. If multiple configurations are available, keywords can be used to identify the configurations.</p>
         */
        @NameInMap("Key")
        public String key;

        public static BatchGetEdgeInstanceDriverConfigsResponseBodyDriverConfigListConfigList build(java.util.Map<String, ?> map) throws Exception {
            BatchGetEdgeInstanceDriverConfigsResponseBodyDriverConfigListConfigList self = new BatchGetEdgeInstanceDriverConfigsResponseBodyDriverConfigListConfigList();
            return TeaModel.build(map, self);
        }

        public BatchGetEdgeInstanceDriverConfigsResponseBodyDriverConfigListConfigList setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public BatchGetEdgeInstanceDriverConfigsResponseBodyDriverConfigListConfigList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public BatchGetEdgeInstanceDriverConfigsResponseBodyDriverConfigListConfigList setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public BatchGetEdgeInstanceDriverConfigsResponseBodyDriverConfigListConfigList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class BatchGetEdgeInstanceDriverConfigsResponseBodyDriverConfigList extends TeaModel {
        /**
         * <p>The configuration information of the driver.</p>
         */
        @NameInMap("ConfigList")
        public java.util.List<BatchGetEdgeInstanceDriverConfigsResponseBodyDriverConfigListConfigList> configList;

        /**
         * <p>The ID of the driver.</p>
         */
        @NameInMap("DriverId")
        public String driverId;

        public static BatchGetEdgeInstanceDriverConfigsResponseBodyDriverConfigList build(java.util.Map<String, ?> map) throws Exception {
            BatchGetEdgeInstanceDriverConfigsResponseBodyDriverConfigList self = new BatchGetEdgeInstanceDriverConfigsResponseBodyDriverConfigList();
            return TeaModel.build(map, self);
        }

        public BatchGetEdgeInstanceDriverConfigsResponseBodyDriverConfigList setConfigList(java.util.List<BatchGetEdgeInstanceDriverConfigsResponseBodyDriverConfigListConfigList> configList) {
            this.configList = configList;
            return this;
        }
        public java.util.List<BatchGetEdgeInstanceDriverConfigsResponseBodyDriverConfigListConfigList> getConfigList() {
            return this.configList;
        }

        public BatchGetEdgeInstanceDriverConfigsResponseBodyDriverConfigList setDriverId(String driverId) {
            this.driverId = driverId;
            return this;
        }
        public String getDriverId() {
            return this.driverId;
        }

    }

}
