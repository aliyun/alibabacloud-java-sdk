// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGetEdgeInstanceDriverConfigsResponse extends TeaModel {
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

    @NameInMap("DriverConfigList")
    @Validation(required = true)
    public java.util.List<BatchGetEdgeInstanceDriverConfigsResponseDriverConfigList> driverConfigList;

    public static BatchGetEdgeInstanceDriverConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetEdgeInstanceDriverConfigsResponse self = new BatchGetEdgeInstanceDriverConfigsResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetEdgeInstanceDriverConfigsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchGetEdgeInstanceDriverConfigsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BatchGetEdgeInstanceDriverConfigsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchGetEdgeInstanceDriverConfigsResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchGetEdgeInstanceDriverConfigsResponse setDriverConfigList(java.util.List<BatchGetEdgeInstanceDriverConfigsResponseDriverConfigList> driverConfigList) {
        this.driverConfigList = driverConfigList;
        return this;
    }
    public java.util.List<BatchGetEdgeInstanceDriverConfigsResponseDriverConfigList> getDriverConfigList() {
        return this.driverConfigList;
    }

    public static class BatchGetEdgeInstanceDriverConfigsResponseDriverConfigListConfigList extends TeaModel {
        @NameInMap("ConfigId")
        @Validation(required = true)
        public String configId;

        @NameInMap("Format")
        @Validation(required = true)
        public String format;

        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        public static BatchGetEdgeInstanceDriverConfigsResponseDriverConfigListConfigList build(java.util.Map<String, ?> map) throws Exception {
            BatchGetEdgeInstanceDriverConfigsResponseDriverConfigListConfigList self = new BatchGetEdgeInstanceDriverConfigsResponseDriverConfigListConfigList();
            return TeaModel.build(map, self);
        }

        public BatchGetEdgeInstanceDriverConfigsResponseDriverConfigListConfigList setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public BatchGetEdgeInstanceDriverConfigsResponseDriverConfigListConfigList setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public BatchGetEdgeInstanceDriverConfigsResponseDriverConfigListConfigList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public BatchGetEdgeInstanceDriverConfigsResponseDriverConfigListConfigList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class BatchGetEdgeInstanceDriverConfigsResponseDriverConfigList extends TeaModel {
        @NameInMap("DriverId")
        @Validation(required = true)
        public String driverId;

        @NameInMap("ConfigList")
        @Validation(required = true)
        public java.util.List<BatchGetEdgeInstanceDriverConfigsResponseDriverConfigListConfigList> configList;

        public static BatchGetEdgeInstanceDriverConfigsResponseDriverConfigList build(java.util.Map<String, ?> map) throws Exception {
            BatchGetEdgeInstanceDriverConfigsResponseDriverConfigList self = new BatchGetEdgeInstanceDriverConfigsResponseDriverConfigList();
            return TeaModel.build(map, self);
        }

        public BatchGetEdgeInstanceDriverConfigsResponseDriverConfigList setDriverId(String driverId) {
            this.driverId = driverId;
            return this;
        }
        public String getDriverId() {
            return this.driverId;
        }

        public BatchGetEdgeInstanceDriverConfigsResponseDriverConfigList setConfigList(java.util.List<BatchGetEdgeInstanceDriverConfigsResponseDriverConfigListConfigList> configList) {
            this.configList = configList;
            return this;
        }
        public java.util.List<BatchGetEdgeInstanceDriverConfigsResponseDriverConfigListConfigList> getConfigList() {
            return this.configList;
        }

    }

}
