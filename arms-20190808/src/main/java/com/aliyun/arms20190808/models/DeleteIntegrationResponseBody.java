// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteIntegrationResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Indicates whether the call was successful.</p>
     */
    @NameInMap("Data")
    public String data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteIntegrationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIntegrationResponseBody self = new DeleteIntegrationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIntegrationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteIntegrationResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DeleteIntegrationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteIntegrationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
