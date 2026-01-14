// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class AgentImportNumberResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Access Denied</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public AgentImportNumberResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>93</p>
     */
    @NameInMap("Timestamp")
    public Long timestamp;

    public static AgentImportNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AgentImportNumberResponseBody self = new AgentImportNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public AgentImportNumberResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public AgentImportNumberResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AgentImportNumberResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AgentImportNumberResponseBody setModel(AgentImportNumberResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public AgentImportNumberResponseBodyModel getModel() {
        return this.model;
    }

    public AgentImportNumberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AgentImportNumberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AgentImportNumberResponseBody setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static class AgentImportNumberResponseBodyModel extends TeaModel {
        /**
         * <p>批次ID</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("BatchId")
        public String batchId;

        /**
         * <p>外呼编号ID</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Id")
        public Long id;

        public static AgentImportNumberResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            AgentImportNumberResponseBodyModel self = new AgentImportNumberResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public AgentImportNumberResponseBodyModel setBatchId(String batchId) {
            this.batchId = batchId;
            return this;
        }
        public String getBatchId() {
            return this.batchId;
        }

        public AgentImportNumberResponseBodyModel setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
