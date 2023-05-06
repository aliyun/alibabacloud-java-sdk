// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class CountAppVersionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public Long data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CountAppVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CountAppVersionResponseBody self = new CountAppVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public CountAppVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CountAppVersionResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public CountAppVersionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CountAppVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
