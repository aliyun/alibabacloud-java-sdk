// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class ProcessNewsAlgorithmResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public String data;

    @NameInMap("Code")
    public Integer code;

    public static ProcessNewsAlgorithmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ProcessNewsAlgorithmResponseBody self = new ProcessNewsAlgorithmResponseBody();
        return TeaModel.build(map, self);
    }

    public ProcessNewsAlgorithmResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ProcessNewsAlgorithmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ProcessNewsAlgorithmResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ProcessNewsAlgorithmResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

}
