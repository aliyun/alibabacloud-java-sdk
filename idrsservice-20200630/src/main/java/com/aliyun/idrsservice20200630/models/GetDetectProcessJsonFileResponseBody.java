// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetDetectProcessJsonFileResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public String data;

    @NameInMap("Code")
    public String code;

    public static GetDetectProcessJsonFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDetectProcessJsonFileResponseBody self = new GetDetectProcessJsonFileResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDetectProcessJsonFileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDetectProcessJsonFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDetectProcessJsonFileResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetDetectProcessJsonFileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
