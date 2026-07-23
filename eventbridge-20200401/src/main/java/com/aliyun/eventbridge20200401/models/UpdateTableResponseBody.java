// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class UpdateTableResponseBody extends TeaModel {
    /**
     * <p>Return code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Returned data</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;TableARN&quot;:&quot;acs:eventbridge:cn-hangzhou:123456789:catalog/my_catalog/namespace/my_namespace/table/my_table&quot;}</p>
     */
    @NameInMap("Data")
    public UpdateTableResponseBodyData data;

    /**
     * <p>API return message</p>
     * 
     * <strong>example:</strong>
     * <p>Operation success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>34AD682D-5B91-5773-8132-AA38C130****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTableResponseBody self = new UpdateTableResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTableResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateTableResponseBody setData(UpdateTableResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateTableResponseBodyData getData() {
        return this.data;
    }

    public UpdateTableResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateTableResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateTableResponseBodyData extends TeaModel {
        /**
         * <p>Table ARN</p>
         * 
         * <strong>example:</strong>
         * <p>acs:eventbridge:cn-hangzhou:123456789:catalog/my_catalog/namespace/my_namespace/table/my_table</p>
         */
        @NameInMap("TableARN")
        public String tableARN;

        public static UpdateTableResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateTableResponseBodyData self = new UpdateTableResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateTableResponseBodyData setTableARN(String tableARN) {
            this.tableARN = tableARN;
            return this;
        }
        public String getTableARN() {
            return this.tableARN;
        }

    }

}
