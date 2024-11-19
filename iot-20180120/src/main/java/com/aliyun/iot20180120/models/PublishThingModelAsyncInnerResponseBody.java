// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class PublishThingModelAsyncInnerResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("LocalizedMsg")
    public String localizedMsg;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static PublishThingModelAsyncInnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishThingModelAsyncInnerResponseBody self = new PublishThingModelAsyncInnerResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishThingModelAsyncInnerResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public PublishThingModelAsyncInnerResponseBody setLocalizedMsg(String localizedMsg) {
        this.localizedMsg = localizedMsg;
        return this;
    }
    public String getLocalizedMsg() {
        return this.localizedMsg;
    }

    public PublishThingModelAsyncInnerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PublishThingModelAsyncInnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
