// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class ImportNumberResponseBody extends TeaModel {
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
    public ImportNumberResponseBodyModel model;

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
     * <p>1683440860035</p>
     */
    @NameInMap("Timestamp")
    public Long timestamp;

    public static ImportNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportNumberResponseBody self = new ImportNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportNumberResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ImportNumberResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImportNumberResponseBody setModel(ImportNumberResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public ImportNumberResponseBodyModel getModel() {
        return this.model;
    }

    public ImportNumberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportNumberResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public ImportNumberResponseBody setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static class ImportNumberResponseBodyModel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>54</p>
         */
        @NameInMap("BatchId")
        public Long batchId;

        /**
         * <strong>example:</strong>
         * <p>94</p>
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
         * <p>26</p>
         */
        @NameInMap("ImportNum")
        public Long importNum;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("Message")
        public String message;

        public static ImportNumberResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            ImportNumberResponseBodyModel self = new ImportNumberResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public ImportNumberResponseBodyModel setBatchId(Long batchId) {
            this.batchId = batchId;
            return this;
        }
        public Long getBatchId() {
            return this.batchId;
        }

        public ImportNumberResponseBodyModel setCode(Long code) {
            this.code = code;
            return this;
        }
        public Long getCode() {
            return this.code;
        }

        public ImportNumberResponseBodyModel setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public ImportNumberResponseBodyModel setImportNum(Long importNum) {
            this.importNum = importNum;
            return this;
        }
        public Long getImportNum() {
            return this.importNum;
        }

        public ImportNumberResponseBodyModel setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
