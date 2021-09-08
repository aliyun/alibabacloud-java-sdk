// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGetEdgeInstanceDeviceConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("DeviceConfigList")
    @Validation(required = true)
    public java.util.List<BatchGetEdgeInstanceDeviceConfigResponseDeviceConfigList> deviceConfigList;

    public static BatchGetEdgeInstanceDeviceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetEdgeInstanceDeviceConfigResponse self = new BatchGetEdgeInstanceDeviceConfigResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetEdgeInstanceDeviceConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchGetEdgeInstanceDeviceConfigResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BatchGetEdgeInstanceDeviceConfigResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchGetEdgeInstanceDeviceConfigResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchGetEdgeInstanceDeviceConfigResponse setDeviceConfigList(java.util.List<BatchGetEdgeInstanceDeviceConfigResponseDeviceConfigList> deviceConfigList) {
        this.deviceConfigList = deviceConfigList;
        return this;
    }
    public java.util.List<BatchGetEdgeInstanceDeviceConfigResponseDeviceConfigList> getDeviceConfigList() {
        return this.deviceConfigList;
    }

    public static class BatchGetEdgeInstanceDeviceConfigResponseDeviceConfigListConfig extends TeaModel {
        @NameInMap("Format")
        @Validation(required = true)
        public String format;

        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        public static BatchGetEdgeInstanceDeviceConfigResponseDeviceConfigListConfig build(java.util.Map<String, ?> map) throws Exception {
            BatchGetEdgeInstanceDeviceConfigResponseDeviceConfigListConfig self = new BatchGetEdgeInstanceDeviceConfigResponseDeviceConfigListConfig();
            return TeaModel.build(map, self);
        }

        public BatchGetEdgeInstanceDeviceConfigResponseDeviceConfigListConfig setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public BatchGetEdgeInstanceDeviceConfigResponseDeviceConfigListConfig setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class BatchGetEdgeInstanceDeviceConfigResponseDeviceConfigList extends TeaModel {
        @NameInMap("IotId")
        @Validation(required = true)
        public String iotId;

        @NameInMap("Config")
        @Validation(required = true)
        public BatchGetEdgeInstanceDeviceConfigResponseDeviceConfigListConfig config;

        public static BatchGetEdgeInstanceDeviceConfigResponseDeviceConfigList build(java.util.Map<String, ?> map) throws Exception {
            BatchGetEdgeInstanceDeviceConfigResponseDeviceConfigList self = new BatchGetEdgeInstanceDeviceConfigResponseDeviceConfigList();
            return TeaModel.build(map, self);
        }

        public BatchGetEdgeInstanceDeviceConfigResponseDeviceConfigList setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public BatchGetEdgeInstanceDeviceConfigResponseDeviceConfigList setConfig(BatchGetEdgeInstanceDeviceConfigResponseDeviceConfigListConfig config) {
            this.config = config;
            return this;
        }
        public BatchGetEdgeInstanceDeviceConfigResponseDeviceConfigListConfig getConfig() {
            return this.config;
        }

    }

}
