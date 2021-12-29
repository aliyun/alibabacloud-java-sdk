// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DcdnHttpRequestTestToolResponseBody extends TeaModel {
    @NameInMap("Body")
    public String body;

    @NameInMap("Header")
    public String header;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StatusCode")
    public Integer statusCode;

    public static DcdnHttpRequestTestToolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DcdnHttpRequestTestToolResponseBody self = new DcdnHttpRequestTestToolResponseBody();
        return TeaModel.build(map, self);
    }

    public DcdnHttpRequestTestToolResponseBody setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public DcdnHttpRequestTestToolResponseBody setHeader(String header) {
        this.header = header;
        return this;
    }
    public String getHeader() {
        return this.header;
    }

    public DcdnHttpRequestTestToolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DcdnHttpRequestTestToolResponseBody setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

}
