// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteEnvCustomJobResponseBody extends TeaModel {
    /**
     * <p>The status code. The status code 200 indicates that the request was successful.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteEnvCustomJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnvCustomJobResponseBody self = new DeleteEnvCustomJobResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEnvCustomJobResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteEnvCustomJobResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DeleteEnvCustomJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteEnvCustomJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
