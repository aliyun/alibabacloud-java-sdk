// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateTableResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>{&quot;TableARN&quot;:&quot;acs:eventbridge:cn-hangzhou:123456789:catalog/my_catalog/namespace/my_namespace/table/my_table&quot;}</p>
     */
    @NameInMap("Data")
    public CreateTableResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Operation success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>34AD682D-5B91-5773-8132-AA38C130****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTableResponseBody self = new CreateTableResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTableResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateTableResponseBody setData(CreateTableResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateTableResponseBodyData getData() {
        return this.data;
    }

    public CreateTableResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTableResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateTableResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>acs:eventbridge:cn-hangzhou:123456789:catalog/my_catalog/namespace/my_namespace/table/my_table</p>
         */
        @NameInMap("TableARN")
        public String tableARN;

        public static CreateTableResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateTableResponseBodyData self = new CreateTableResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateTableResponseBodyData setTableARN(String tableARN) {
            this.tableARN = tableARN;
            return this;
        }
        public String getTableARN() {
            return this.tableARN;
        }

    }

}
