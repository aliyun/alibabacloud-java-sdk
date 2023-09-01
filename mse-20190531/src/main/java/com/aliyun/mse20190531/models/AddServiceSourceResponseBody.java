// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddServiceSourceResponseBody extends TeaModel {
    /**
     * <p>duplicatedClusterAliasName</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>mse-100-007</p>
     */
    @NameInMap("Data")
    public Long data;

    /**
     * <p>code</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>mse-200-105</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>duplicated cluster alias name</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AddServiceSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddServiceSourceResponseBody self = new AddServiceSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public AddServiceSourceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AddServiceSourceResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public AddServiceSourceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AddServiceSourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddServiceSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddServiceSourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
