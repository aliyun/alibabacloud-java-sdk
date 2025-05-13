// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class ImportNumberV2ResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public ImportNumberV2ResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>8EFC6D10-307B-1ECA-A8C6-7CBDF776AAD2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <strong>example:</strong>
     * <p>98</p>
     */
    @NameInMap("Timestamp")
    public Long timestamp;

    public static ImportNumberV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportNumberV2ResponseBody self = new ImportNumberV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportNumberV2ResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ImportNumberV2ResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ImportNumberV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImportNumberV2ResponseBody setModel(ImportNumberV2ResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public ImportNumberV2ResponseBodyModel getModel() {
        return this.model;
    }

    public ImportNumberV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportNumberV2ResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public ImportNumberV2ResponseBody setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static class ImportNumberV2ResponseBodyModel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>74</p>
         */
        @NameInMap("BatchId")
        public Long batchId;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public Long code;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Data")
        public String data;

        /**
         * <strong>example:</strong>
         * <p>58</p>
         */
        @NameInMap("ImportNum")
        public Long importNum;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Message")
        public String message;

        public static ImportNumberV2ResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            ImportNumberV2ResponseBodyModel self = new ImportNumberV2ResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public ImportNumberV2ResponseBodyModel setBatchId(Long batchId) {
            this.batchId = batchId;
            return this;
        }
        public Long getBatchId() {
            return this.batchId;
        }

        public ImportNumberV2ResponseBodyModel setCode(Long code) {
            this.code = code;
            return this;
        }
        public Long getCode() {
            return this.code;
        }

        public ImportNumberV2ResponseBodyModel setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public ImportNumberV2ResponseBodyModel setImportNum(Long importNum) {
            this.importNum = importNum;
            return this;
        }
        public Long getImportNum() {
            return this.importNum;
        }

        public ImportNumberV2ResponseBodyModel setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
