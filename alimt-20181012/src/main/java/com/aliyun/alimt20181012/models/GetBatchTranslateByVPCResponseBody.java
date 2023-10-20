// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetBatchTranslateByVPCResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TranslatedList")
    public java.util.List<java.util.Map<String, ?>> translatedList;

    public static GetBatchTranslateByVPCResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBatchTranslateByVPCResponseBody self = new GetBatchTranslateByVPCResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBatchTranslateByVPCResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetBatchTranslateByVPCResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetBatchTranslateByVPCResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBatchTranslateByVPCResponseBody setTranslatedList(java.util.List<java.util.Map<String, ?>> translatedList) {
        this.translatedList = translatedList;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getTranslatedList() {
        return this.translatedList;
    }

}
