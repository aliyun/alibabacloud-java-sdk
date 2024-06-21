// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddServiceSourceResponseBody extends TeaModel {
    /**
     * <p>duplicatedClusterAliasName</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>mse-100-007</p>
     * 
     * <strong>example:</strong>
     * <p>63</p>
     */
    @NameInMap("Data")
    public Long data;

    /**
     * <p>code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>mse-200-105</p>
     * 
     * <strong>example:</strong>
     * <p>You are not authorized to perform this operation. Action: mse:AddServiceSource, Resource: acs:mse:cn-hangzhou:1105471854403716:instance/gw-082c943a8c304e48a37a7a29a5ddeda7</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The response data.</p>
     * 
     * <strong>example:</strong>
     * <p>D0DB055C-51F2-5BB2-82A6-CD8A3C6EE6BA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>duplicated cluster alias name</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
