// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class DeleteDetectProcessResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    @NameInMap("Code")
    public String code;

    public static DeleteDetectProcessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDetectProcessResponseBody self = new DeleteDetectProcessResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDetectProcessResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteDetectProcessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteDetectProcessResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public DeleteDetectProcessResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
