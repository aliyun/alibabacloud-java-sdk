// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class AddTableResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Index.Forbidden</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AddTableResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Required parameter(%s) missing or invalid, please check the request parameters.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>778C0B3B-03C1-5FC1-A947-36EDD13606AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AddTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddTableResponseBody self = new AddTableResponseBody();
        return TeaModel.build(map, self);
    }

    public AddTableResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddTableResponseBody setData(AddTableResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddTableResponseBodyData getData() {
        return this.data;
    }

    public AddTableResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddTableResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AddTableResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddTableResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>table_b6ddc67e7df14db38b74ef5e2e0fe24e_12792097</p>
         */
        @NameInMap("TableId")
        public String tableId;

        public static AddTableResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddTableResponseBodyData self = new AddTableResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddTableResponseBodyData setTableId(String tableId) {
            this.tableId = tableId;
            return this;
        }
        public String getTableId() {
            return this.tableId;
        }

    }

}
