// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGetEdgeInstanceDeviceConfigResponseBody extends TeaModel {
    /**
     * <p>The return code of the operation. A value of Success indicates that the call was successful. Other values indicate that specific errors occurred. For more information, see [Error codes](~~135200~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The device configuration information that is returned if the call was successful.</p>
     */
    @NameInMap("DeviceConfigList")
    public java.util.List<BatchGetEdgeInstanceDeviceConfigResponseBodyDeviceConfigList> deviceConfigList;

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

    public static BatchGetEdgeInstanceDeviceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchGetEdgeInstanceDeviceConfigResponseBody self = new BatchGetEdgeInstanceDeviceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchGetEdgeInstanceDeviceConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchGetEdgeInstanceDeviceConfigResponseBody setDeviceConfigList(java.util.List<BatchGetEdgeInstanceDeviceConfigResponseBodyDeviceConfigList> deviceConfigList) {
        this.deviceConfigList = deviceConfigList;
        return this;
    }
    public java.util.List<BatchGetEdgeInstanceDeviceConfigResponseBodyDeviceConfigList> getDeviceConfigList() {
        return this.deviceConfigList;
    }

    public BatchGetEdgeInstanceDeviceConfigResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchGetEdgeInstanceDeviceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchGetEdgeInstanceDeviceConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchGetEdgeInstanceDeviceConfigResponseBodyDeviceConfigListConfig extends TeaModel {
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

        public static BatchGetEdgeInstanceDeviceConfigResponseBodyDeviceConfigListConfig build(java.util.Map<String, ?> map) throws Exception {
            BatchGetEdgeInstanceDeviceConfigResponseBodyDeviceConfigListConfig self = new BatchGetEdgeInstanceDeviceConfigResponseBodyDeviceConfigListConfig();
            return TeaModel.build(map, self);
        }

        public BatchGetEdgeInstanceDeviceConfigResponseBodyDeviceConfigListConfig setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public BatchGetEdgeInstanceDeviceConfigResponseBodyDeviceConfigListConfig setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

    public static class BatchGetEdgeInstanceDeviceConfigResponseBodyDeviceConfigList extends TeaModel {
        /**
         * <p>The configuration information of the device.</p>
         */
        @NameInMap("Config")
        public BatchGetEdgeInstanceDeviceConfigResponseBodyDeviceConfigListConfig config;

        /**
         * <p>The ID of the device.</p>
         */
        @NameInMap("IotId")
        public String iotId;

        public static BatchGetEdgeInstanceDeviceConfigResponseBodyDeviceConfigList build(java.util.Map<String, ?> map) throws Exception {
            BatchGetEdgeInstanceDeviceConfigResponseBodyDeviceConfigList self = new BatchGetEdgeInstanceDeviceConfigResponseBodyDeviceConfigList();
            return TeaModel.build(map, self);
        }

        public BatchGetEdgeInstanceDeviceConfigResponseBodyDeviceConfigList setConfig(BatchGetEdgeInstanceDeviceConfigResponseBodyDeviceConfigListConfig config) {
            this.config = config;
            return this;
        }
        public BatchGetEdgeInstanceDeviceConfigResponseBodyDeviceConfigListConfig getConfig() {
            return this.config;
        }

        public BatchGetEdgeInstanceDeviceConfigResponseBodyDeviceConfigList setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

    }

}
