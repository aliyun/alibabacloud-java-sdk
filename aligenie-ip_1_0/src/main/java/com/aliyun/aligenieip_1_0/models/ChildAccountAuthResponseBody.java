// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ChildAccountAuthResponseBody extends TeaModel {
    @NameInMap("Extentions")
    public java.util.Map<String, ?> extentions;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    @NameInMap("StatusCode")
    public Integer statusCode;

    public static ChildAccountAuthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChildAccountAuthResponseBody self = new ChildAccountAuthResponseBody();
        return TeaModel.build(map, self);
    }

    public ChildAccountAuthResponseBody setExtentions(java.util.Map<String, ?> extentions) {
        this.extentions = extentions;
        return this;
    }
    public java.util.Map<String, ?> getExtentions() {
        return this.extentions;
    }

    public ChildAccountAuthResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ChildAccountAuthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChildAccountAuthResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public ChildAccountAuthResponseBody setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

}
