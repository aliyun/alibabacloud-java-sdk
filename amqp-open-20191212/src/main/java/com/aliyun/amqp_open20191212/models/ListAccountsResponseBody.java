// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListAccountsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The status code 200 indicates that the call is successful.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.Map<String, java.util.List<DataValue>> data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAccountsResponseBody self = new ListAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAccountsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListAccountsResponseBody setData(java.util.Map<String, java.util.List<DataValue>> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, java.util.List<DataValue>> getData() {
        return this.data;
    }

    public ListAccountsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAccountsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
