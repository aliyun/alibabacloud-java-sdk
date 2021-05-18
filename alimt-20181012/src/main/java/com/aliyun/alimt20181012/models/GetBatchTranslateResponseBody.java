// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetBatchTranslateResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TranslatedList")
    public java.util.List<java.util.Map<String, ?>> translatedList;

    public static GetBatchTranslateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBatchTranslateResponseBody self = new GetBatchTranslateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBatchTranslateResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetBatchTranslateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetBatchTranslateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBatchTranslateResponseBody setTranslatedList(java.util.List<java.util.Map<String, ?>> translatedList) {
        this.translatedList = translatedList;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getTranslatedList() {
        return this.translatedList;
    }

}
