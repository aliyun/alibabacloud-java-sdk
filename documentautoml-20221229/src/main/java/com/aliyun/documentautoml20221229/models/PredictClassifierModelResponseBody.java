// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.documentautoml20221229.models;

import com.aliyun.tea.*;

public class PredictClassifierModelResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public String data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PredictClassifierModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PredictClassifierModelResponseBody self = new PredictClassifierModelResponseBody();
        return TeaModel.build(map, self);
    }

    public PredictClassifierModelResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public PredictClassifierModelResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public PredictClassifierModelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PredictClassifierModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
