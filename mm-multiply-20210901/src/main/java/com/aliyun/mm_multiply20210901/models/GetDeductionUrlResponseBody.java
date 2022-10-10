// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetDeductionUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public Boolean status;

    @NameInMap("URL")
    public String URL;

    public static GetDeductionUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeductionUrlResponseBody self = new GetDeductionUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeductionUrlResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetDeductionUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDeductionUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeductionUrlResponseBody setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public GetDeductionUrlResponseBody setURL(String URL) {
        this.URL = URL;
        return this;
    }
    public String getURL() {
        return this.URL;
    }

}
