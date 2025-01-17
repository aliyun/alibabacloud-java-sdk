// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetBatchTranslateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>86D18195-D89C-4C8C-9DC4-5FCE789CE6D5</p>
     */
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
