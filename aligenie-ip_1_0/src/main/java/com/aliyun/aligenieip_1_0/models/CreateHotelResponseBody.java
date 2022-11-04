// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class CreateHotelResponseBody extends TeaModel {
    @NameInMap("Extentions")
    public java.util.Map<String, ?> extentions;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    @NameInMap("StatusCode")
    public Integer statusCode;

    public static CreateHotelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHotelResponseBody self = new CreateHotelResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHotelResponseBody setExtentions(java.util.Map<String, ?> extentions) {
        this.extentions = extentions;
        return this;
    }
    public java.util.Map<String, ?> getExtentions() {
        return this.extentions;
    }

    public CreateHotelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateHotelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateHotelResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public CreateHotelResponseBody setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

}
