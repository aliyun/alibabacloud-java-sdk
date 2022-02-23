// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class GenerateAliyunBidCertWaysUrlResponseBody extends TeaModel {
    // code
    @NameInMap("Code")
    public String code;

    // data
    @NameInMap("Data")
    public String data;

    // httpCode
    @NameInMap("HttpCode")
    public String httpCode;

    // message
    @NameInMap("Message")
    public String message;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // success
    @NameInMap("Success")
    public Boolean success;

    public static GenerateAliyunBidCertWaysUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateAliyunBidCertWaysUrlResponseBody self = new GenerateAliyunBidCertWaysUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateAliyunBidCertWaysUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GenerateAliyunBidCertWaysUrlResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GenerateAliyunBidCertWaysUrlResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public GenerateAliyunBidCertWaysUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GenerateAliyunBidCertWaysUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateAliyunBidCertWaysUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
