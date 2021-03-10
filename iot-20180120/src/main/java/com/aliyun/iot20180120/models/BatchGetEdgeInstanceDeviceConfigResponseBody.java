// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGetEdgeInstanceDeviceConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("DeviceConfigList")
    public java.util.List<BatchGetEdgeInstanceDeviceConfigResponseBodyDeviceConfigList> deviceConfigList;

    public static BatchGetEdgeInstanceDeviceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchGetEdgeInstanceDeviceConfigResponseBody self = new BatchGetEdgeInstanceDeviceConfigResponseBody();
        return TeaModel.build(map, self);
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

    public BatchGetEdgeInstanceDeviceConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchGetEdgeInstanceDeviceConfigResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchGetEdgeInstanceDeviceConfigResponseBody setDeviceConfigList(java.util.List<BatchGetEdgeInstanceDeviceConfigResponseBodyDeviceConfigList> deviceConfigList) {
        this.deviceConfigList = deviceConfigList;
        return this;
    }
    public java.util.List<BatchGetEdgeInstanceDeviceConfigResponseBodyDeviceConfigList> getDeviceConfigList() {
        return this.deviceConfigList;
    }

    public static class BatchGetEdgeInstanceDeviceConfigResponseBodyDeviceConfigListConfig extends TeaModel {
        @NameInMap("Format")
        public String format;

        @NameInMap("Content")
        public String content;

        public static BatchGetEdgeInstanceDeviceConfigResponseBodyDeviceConfigListConfig build(java.util.Map<String, ?> map) throws Exception {
            BatchGetEdgeInstanceDeviceConfigResponseBodyDeviceConfigListConfig self = new BatchGetEdgeInstanceDeviceConfigResponseBodyDeviceConfigListConfig();
            return TeaModel.build(map, self);
        }

        public BatchGetEdgeInstanceDeviceConfigResponseBodyDeviceConfigListConfig setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public BatchGetEdgeInstanceDeviceConfigResponseBodyDeviceConfigListConfig setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class BatchGetEdgeInstanceDeviceConfigResponseBodyDeviceConfigList extends TeaModel {
        @NameInMap("IotId")
        public String iotId;

        @NameInMap("Config")
        public BatchGetEdgeInstanceDeviceConfigResponseBodyDeviceConfigListConfig config;

        public static BatchGetEdgeInstanceDeviceConfigResponseBodyDeviceConfigList build(java.util.Map<String, ?> map) throws Exception {
            BatchGetEdgeInstanceDeviceConfigResponseBodyDeviceConfigList self = new BatchGetEdgeInstanceDeviceConfigResponseBodyDeviceConfigList();
            return TeaModel.build(map, self);
        }

        public BatchGetEdgeInstanceDeviceConfigResponseBodyDeviceConfigList setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public BatchGetEdgeInstanceDeviceConfigResponseBodyDeviceConfigList setConfig(BatchGetEdgeInstanceDeviceConfigResponseBodyDeviceConfigListConfig config) {
            this.config = config;
            return this;
        }
        public BatchGetEdgeInstanceDeviceConfigResponseBodyDeviceConfigListConfig getConfig() {
            return this.config;
        }

    }

}
