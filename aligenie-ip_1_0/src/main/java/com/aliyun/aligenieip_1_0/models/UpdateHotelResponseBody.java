// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class UpdateHotelResponseBody extends TeaModel {
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

    public static UpdateHotelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateHotelResponseBody self = new UpdateHotelResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateHotelResponseBody setExtentions(java.util.Map<String, ?> extentions) {
        this.extentions = extentions;
        return this;
    }
    public java.util.Map<String, ?> getExtentions() {
        return this.extentions;
    }

    public UpdateHotelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateHotelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateHotelResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public UpdateHotelResponseBody setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

}
