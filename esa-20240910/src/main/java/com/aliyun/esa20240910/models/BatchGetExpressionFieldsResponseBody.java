// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class BatchGetExpressionFieldsResponseBody extends TeaModel {
    /**
     * <p>List of match fields.</p>
     */
    @NameInMap("Fields")
    public java.util.List<BatchGetExpressionFieldsResponseBodyFields> fields;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchGetExpressionFieldsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchGetExpressionFieldsResponseBody self = new BatchGetExpressionFieldsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchGetExpressionFieldsResponseBody setFields(java.util.List<BatchGetExpressionFieldsResponseBodyFields> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<BatchGetExpressionFieldsResponseBodyFields> getFields() {
        return this.fields;
    }

    public BatchGetExpressionFieldsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BatchGetExpressionFieldsResponseBodyFields extends TeaModel {
        /**
         * <p>List of match fields for a single expression.</p>
         */
        @NameInMap("Fields")
        public java.util.List<String> fields;

        /**
         * <p>ID of the expression, corresponding to the ID in the input parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public String id;

        public static BatchGetExpressionFieldsResponseBodyFields build(java.util.Map<String, ?> map) throws Exception {
            BatchGetExpressionFieldsResponseBodyFields self = new BatchGetExpressionFieldsResponseBodyFields();
            return TeaModel.build(map, self);
        }

        public BatchGetExpressionFieldsResponseBodyFields setFields(java.util.List<String> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<String> getFields() {
            return this.fields;
        }

        public BatchGetExpressionFieldsResponseBodyFields setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
