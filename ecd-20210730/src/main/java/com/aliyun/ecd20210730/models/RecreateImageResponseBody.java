// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class RecreateImageResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public Boolean data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static RecreateImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecreateImageResponseBody self = new RecreateImageResponseBody();
        return TeaModel.build(map, self);
    }

    public RecreateImageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RecreateImageResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public RecreateImageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RecreateImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
