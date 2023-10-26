// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateEnvCustomJobResponseBody extends TeaModel {
    /**
     * <p>The status code. The status code 200 indicates that the request was successful.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The struct returned.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateEnvCustomJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEnvCustomJobResponseBody self = new CreateEnvCustomJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEnvCustomJobResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateEnvCustomJobResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateEnvCustomJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateEnvCustomJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
